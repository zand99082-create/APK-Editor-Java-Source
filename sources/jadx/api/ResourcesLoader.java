package jadx.api;

import com.github.megatronking.stringfog.xor.StringFogImpl;
import jadx.api.ResourceFile;
import jadx.core.codegen.CodeWriter;
import jadx.core.utils.Utils;
import jadx.core.utils.exceptions.JadxException;
import jadx.core.utils.files.InputFile;
import jadx.core.xmlgen.ResContainer;
import jadx.core.xmlgen.ResTableParser;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public final class ResourcesLoader {
    private static final int LOAD_SIZE_LIMIT = 10485760;
    private static final int READ_BUFFER_SIZE = 8192;
    private final JadxDecompiler jadxRef;

    public interface ResourceDecoder {
        ResContainer decode(long j, InputStream inputStream);
    }

    ResourcesLoader(JadxDecompiler jadxDecompiler) {
        this.jadxRef = jadxDecompiler;
    }

    private void addEntry(List list, File file, ZipEntry zipEntry) {
        if (zipEntry.isDirectory()) {
            return;
        }
        String name = zipEntry.getName();
        ResourceFile resourceFile = new ResourceFile(this.jadxRef, name, ResourceType.getFileType(name));
        resourceFile.setZipRef(new ResourceFile.ZipRef(file, name));
        list.add(resourceFile);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[Catch: Exception -> 0x0073, TRY_LEAVE, TryCatch #5 {Exception -> 0x0073, blocks: (B:16:0x0050, B:18:0x0055), top: B:38:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ResContainer decodeStream(ResourceFile resourceFile, ResourceDecoder resourceDecoder) throws Throwable {
        ZipFile zipFile;
        Throwable th;
        BufferedInputStream bufferedInputStream;
        Exception e;
        ResContainer resContainerDecode = null;
        ResourceFile.ZipRef zipRef = resourceFile.getZipRef();
        if (zipRef != null) {
            try {
                zipFile = new ZipFile(zipRef.getZipFile());
                try {
                    ZipEntry entry = zipFile.getEntry(zipRef.getEntryName());
                    if (entry == null) {
                        throw new IOException("Zip entry not found: " + zipRef);
                    }
                    bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(entry));
                    try {
                        try {
                            resContainerDecode = resourceDecoder.decode(entry.getSize(), bufferedInputStream);
                            try {
                                zipFile.close();
                                bufferedInputStream.close();
                            } catch (Exception e2) {
                            }
                        } catch (Exception e3) {
                            e = e3;
                            throw new JadxException("Error decode: " + zipRef.getEntryName(), e);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (Exception e4) {
                                throw th;
                            }
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    bufferedInputStream = null;
                    e = e5;
                } catch (Throwable th3) {
                    bufferedInputStream = null;
                    th = th3;
                    if (zipFile != null) {
                    }
                    if (bufferedInputStream != null) {
                    }
                    throw th;
                }
            } catch (Exception e6) {
                zipFile = null;
                e = e6;
                bufferedInputStream = null;
            } catch (Throwable th4) {
                zipFile = null;
                th = th4;
                bufferedInputStream = null;
            }
        }
        return resContainerDecode;
    }

    static ResContainer loadContent(final JadxDecompiler jadxDecompiler, final ResourceFile resourceFile) {
        try {
            return decodeStream(resourceFile, new ResourceDecoder() { // from class: jadx.api.ResourcesLoader.1
                @Override // jadx.api.ResourcesLoader.ResourceDecoder
                public final ResContainer decode(long j, InputStream inputStream) {
                    return j > 10485760 ? ResContainer.singleFile(resourceFile.getName(), new CodeWriter().add("File too big, size: " + String.format("%.2f KB", Double.valueOf(j / 1024.0d)))) : ResourcesLoader.loadContent(jadxDecompiler, resourceFile, inputStream);
                }
            });
        } catch (JadxException e) {
            CodeWriter codeWriter = new CodeWriter();
            codeWriter.add("Error decode ").add(resourceFile.getType().toString().toLowerCase());
            codeWriter.startLine(Utils.getStackTrace(e.getCause()));
            return ResContainer.singleFile(resourceFile.getName(), codeWriter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ResContainer loadContent(JadxDecompiler jadxDecompiler, ResourceFile resourceFile, InputStream inputStream) {
        switch (resourceFile.getType()) {
            case MANIFEST:
            case XML:
                return ResContainer.singleFile(resourceFile.getName(), jadxDecompiler.getXmlParser().parse(inputStream));
            case ARSC:
                return new ResTableParser().decodeFiles(inputStream);
            default:
                return ResContainer.singleFile(resourceFile.getName(), loadToCodeWriter(inputStream));
        }
    }

    private void loadFile(List list, File file) throws Throwable {
        ZipFile zipFile;
        Throwable th;
        if (file == null) {
            return;
        }
        ZipFile zipFile2 = null;
        try {
            zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    addEntry(list, file, enumerationEntries.nextElement());
                }
                try {
                    zipFile.close();
                } catch (Exception e) {
                }
            } catch (IOException e2) {
                zipFile2 = zipFile;
                if (zipFile2 != null) {
                    try {
                        zipFile2.close();
                    } catch (Exception e3) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (Exception e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
        } catch (Throwable th3) {
            zipFile = null;
            th = th3;
        }
    }

    public static CodeWriter loadToCodeWriter(InputStream inputStream) {
        CodeWriter codeWriter = new CodeWriter();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    try {
                        break;
                    } catch (Exception e) {
                    }
                }
            } finally {
                try {
                    inputStream.close();
                } catch (Exception e2) {
                }
            }
        }
        codeWriter.add(byteArrayOutputStream.toString(StringFogImpl.CHARSET_NAME_UTF_8));
        return codeWriter;
    }

    final List load(List list) throws Throwable {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            loadFile(arrayList, ((InputFile) it.next()).getFile());
        }
        return arrayList;
    }
}
