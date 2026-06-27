package com.gmail.heagoo.apkeditor.p096e;

import android.util.SparseIntArray;
import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1570s;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.s */
/* JADX INFO: loaded from: classes.dex */
final class C1254s extends AbstractC1242g {

    /* JADX INFO: renamed from: b */
    private String f3644b;

    /* JADX INFO: renamed from: c */
    private SparseIntArray f3645c;

    C1254s() {
    }

    /* JADX INFO: renamed from: a */
    private static int m3206a(Map map) {
        int iIntValue = 0;
        Iterator it = map.values().iterator();
        while (true) {
            int i = iIntValue;
            if (!it.hasNext()) {
                return i >> 16;
            }
            iIntValue = ((Integer) it.next()).intValue() & 16711680;
            if (iIntValue <= i) {
                iIntValue = i;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private SparseIntArray m3208a(List list, Map map) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return sparseIntArray;
            }
            C1236ad c1236ad = (C1236ad) list.get(i2);
            Integer num = (Integer) map.get(c1236ad.f3590a);
            if (num != null) {
                int iIntValue = num.intValue() + 1;
                sparseIntArray.put(c1236ad.f3592c, iIntValue);
                c1236ad.f3592c = iIntValue;
                map.put(c1236ad.f3590a, Integer.valueOf(iIntValue));
            } else {
                int iM3206a = ((m3206a(map) + 1) << 16) + 2130706432;
                sparseIntArray.put(c1236ad.f3592c, iM3206a);
                c1236ad.f3592c = iM3206a;
                map.put(c1236ad.f3590a, Integer.valueOf(iM3206a));
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private static List m3209a(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return arrayList;
            }
            C1236ad c1236adM3156a = C1236ad.m3156a(line);
            if (c1236adM3156a != null) {
                arrayList.add(c1236adM3156a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static Map m3210a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C1236ad c1236ad = (C1236ad) it.next();
            if ("drawable".equals(c1236ad.f3590a)) {
                if (c1236ad.f3592c > i3) {
                    i3 = c1236ad.f3592c;
                }
            } else if ("layout".equals(c1236ad.f3590a)) {
                if (c1236ad.f3592c > i2) {
                    i2 = c1236ad.f3592c;
                }
            } else if (!"string".equals(c1236ad.f3590a)) {
                Integer num = (Integer) map.get(c1236ad.f3590a);
                if (num == null || c1236ad.f3592c > num.intValue()) {
                    map.put(c1236ad.f3590a, Integer.valueOf(c1236ad.f3592c));
                }
            } else if (c1236ad.f3592c > i) {
                i = c1236ad.f3592c;
            }
        }
        map.put("drawable", Integer.valueOf(i3));
        map.put("layout", Integer.valueOf(i2));
        map.put("string", Integer.valueOf(i));
        return map;
    }

    /* JADX INFO: renamed from: a */
    private void m3212a(String str, List list) throws Throwable {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                m3213b(str, arrayList);
                return;
            } else {
                arrayList.add(((C1236ad) list.get(i2)).toString());
                i = i2 + 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3213b(String str, List list) throws Throwable {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(str, "rw");
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            long length = randomAccessFile.length();
            if (length < 16) {
                throw new Exception("File is too small!");
            }
            randomAccessFile.seek(length - 16);
            byte[] bArr = new byte[32];
            int i = randomAccessFile.read(bArr);
            int i2 = 0;
            while (i2 < i && (bArr[i2] != 60 || bArr[i2 + 1] != 47)) {
                i2++;
            }
            randomAccessFile.seek(((long) i2) + (length - 16));
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append((String) list.get(i3));
                sb.append("\n");
            }
            sb.append("</resources>");
            randomAccessFile.write(sb.toString().getBytes());
            m3181a(randomAccessFile);
        } catch (Throwable th2) {
            th = th2;
            m3181a(randomAccessFile);
            throw th;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final String mo3186a(ApkInfoActivity apkInfoActivity, ZipFile zipFile, InterfaceC1237b interfaceC1237b) throws Throwable {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        InputStream inputStream2;
        String str;
        FileInputStream fileInputStream;
        InputStream inputStream3;
        ZipFile zipFile2;
        List listM3209a;
        FileOutputStream fileOutputStream2 = null;
        ZipEntry entry = zipFile.getEntry(this.f3644b);
        if (entry == null) {
            interfaceC1237b.mo3162a(R.string.patch_error_no_entry, this.f3644b);
        } else {
            try {
                inputStream = zipFile.getInputStream(entry);
                try {
                    str = C1067a.m2525d(apkInfoActivity, "tmp") + C1570s.m3787a(6);
                    fileOutputStream = new FileOutputStream(str);
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = null;
                    inputStream2 = inputStream;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    C1067a.m2506b(inputStream, fileOutputStream);
                    fileOutputStream.close();
                    String str2 = apkInfoActivity.m2722i() + "/res/values/public.xml";
                    try {
                        zipFile2 = new ZipFile(str);
                        try {
                            ZipEntry entry2 = zipFile2.getEntry("res/values/public.xml");
                            if (entry2 == null) {
                                throw new Exception(interfaceC1237b.mo3158a(R.string.patch_error_publicxml_notfound));
                            }
                            inputStream3 = zipFile2.getInputStream(entry2);
                            try {
                                listM3209a = m3209a(inputStream3);
                                fileInputStream = new FileInputStream(str2);
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream = null;
                            }
                            try {
                                this.f3645c = m3208a(listM3209a, m3210a(m3209a((InputStream) fileInputStream)));
                                m3212a(str2, listM3209a);
                                m3181a((Closeable) fileInputStream);
                                m3181a((Closeable) inputStream3);
                                m3182a(zipFile2);
                                m3188a(apkInfoActivity, str, new C1255t(this, apkInfoActivity.m2722i()), interfaceC1237b);
                                m3181a((Closeable) inputStream);
                                m3181a((Closeable) null);
                            } catch (Throwable th3) {
                                th = th3;
                                m3181a((Closeable) fileInputStream);
                                m3181a((Closeable) inputStream3);
                                m3182a(zipFile2);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileInputStream = null;
                            inputStream3 = null;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        fileInputStream = null;
                        inputStream3 = null;
                        zipFile2 = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    inputStream2 = inputStream;
                    try {
                        interfaceC1237b.mo3162a(R.string.general_error, e.getMessage());
                        m3181a((Closeable) inputStream2);
                        m3181a(fileOutputStream);
                    } catch (Throwable th6) {
                        th = th6;
                        fileOutputStream2 = fileOutputStream;
                        inputStream = inputStream2;
                        m3181a((Closeable) inputStream);
                        m3181a(fileOutputStream2);
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    fileOutputStream2 = fileOutputStream;
                    m3181a((Closeable) inputStream);
                    m3181a(fileOutputStream2);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                fileOutputStream = null;
                inputStream2 = null;
            } catch (Throwable th8) {
                th = th8;
                inputStream = null;
            }
        }
        return null;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final void mo3189a(C1238c c1238c, InterfaceC1237b interfaceC1237b) {
        this.f3603a = c1238c.m3170a();
        String line = c1238c.readLine();
        while (line != null) {
            String strTrim = line.trim();
            if ("[/MERGE]".equals(strTrim)) {
                return;
            }
            if (super.m3192a(strTrim, c1238c)) {
                line = c1238c.readLine();
            } else {
                if ("SOURCE:".equals(strTrim)) {
                    this.f3644b = c1238c.readLine().trim();
                } else {
                    interfaceC1237b.mo3162a(R.string.patch_error_cannot_parse, Integer.valueOf(c1238c.m3170a()), strTrim);
                }
                line = c1238c.readLine();
            }
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final boolean mo3190a() {
        return true;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final boolean mo3191a(InterfaceC1237b interfaceC1237b) {
        if (this.f3644b != null) {
            return true;
        }
        interfaceC1237b.mo3162a(R.string.patch_error_no_source_file, new Object[0]);
        return false;
    }
}
