package com.gmail.heagoo.apkeditor.installer;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.OpenableColumns;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.gmail.heagoo.apkeditor.gzd;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private PathStrategy mStrategy;
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");
    private static HashMap<String, PathStrategy> sCache = new HashMap<>();

    interface PathStrategy {
        File getFileForUri(Uri uri);

        Uri getUriForFile(File file);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (((ComponentInfo) providerInfo).exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        this.mStrategy = getPathStrategy(context, providerInfo.authority);
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        return getPathStrategy(context, str).getUriForFile(file);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String[] strArr3 = strArr;
        File fileForUri = this.mStrategy.getFileForUri(uri);
        if (strArr3 == null) {
            strArr3 = COLUMNS;
        }
        String[] strArr4 = new String[strArr3.length];
        Object[] objArr = new Object[strArr3.length];
        int i = 0;
        for (String str3 : strArr3) {
            if (OpenableColumns.DISPLAY_NAME.equals(str3)) {
                strArr4[i] = "_display_name";
                int i2 = i;
                i++;
                objArr[i2] = fileForUri.getName();
            } else if (OpenableColumns.SIZE.equals(str3)) {
                strArr4[i] = "_size";
                int i3 = i;
                i++;
                objArr[i3] = new Long(fileForUri.length());
            }
        }
        String[] strArrCopyOf = copyOf(strArr4, i);
        Object[] objArrCopyOf = copyOf(objArr, i);
        MatrixCursor matrixCursor = new MatrixCursor(strArrCopyOf, 1);
        matrixCursor.addRow(objArrCopyOf);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File fileForUri = this.mStrategy.getFileForUri(uri);
        int iLastIndexOf = fileForUri.getName().lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileForUri.getName().substring(iLastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.mStrategy.getFileForUri(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.mStrategy.getFileForUri(uri), modeToMode(str));
    }

    private static PathStrategy getPathStrategy(Context context, String str) throws XmlPullParserException, IOException {
        PathStrategy pathStrategy;
        synchronized (sCache) {
            pathStrategy = sCache.get(str);
            if (pathStrategy == null) {
                try {
                    try {
                        pathStrategy = parsePathStrategy(context, str);
                        sCache.put(str, pathStrategy);
                    } catch (IOException e) {
                        throw new IllegalArgumentException(new StringBuffer().append(new StringBuffer().append("Failed to parse ").append(META_DATA_FILE_PROVIDER_PATHS).toString()).append(" meta-data").toString(), e);
                    }
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException(new StringBuffer().append(new StringBuffer().append("Failed to parse ").append(META_DATA_FILE_PROVIDER_PATHS).toString()).append(" meta-data").toString(), e2);
                }
            }
        }
        return pathStrategy;
    }

    private static PathStrategy parsePathStrategy(Context context, String str) throws XmlPullParserException, IOException {
        SimplePathStrategy simplePathStrategy = new SimplePathStrategy(str);
        XmlResourceParser xmlResourceParserLoadXmlMetaData = context.getPackageManager().resolveContentProvider(str, 128).loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException(new StringBuffer().append(new StringBuffer().append("Missing ").append(META_DATA_FILE_PROVIDER_PATHS).toString()).append(" meta-data").toString());
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next != 1) {
                if (next == 2) {
                    String name = xmlResourceParserLoadXmlMetaData.getName();
                    String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue((String) null, ATTR_NAME);
                    String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue((String) null, ATTR_PATH);
                    File fileBuildPath = (File) null;
                    if (TAG_ROOT_PATH.equals(name)) {
                        fileBuildPath = buildPath(DEVICE_ROOT, attributeValue2);
                    } else if (TAG_FILES_PATH.equals(name)) {
                        fileBuildPath = buildPath(context.getFilesDir(), attributeValue2);
                    } else if (TAG_CACHE_PATH.equals(name)) {
                        fileBuildPath = buildPath(context.getCacheDir(), attributeValue2);
                    } else if (TAG_EXTERNAL.equals(name)) {
                        fileBuildPath = buildPath(Environment.getExternalStorageDirectory(), attributeValue2);
                    }
                    if (fileBuildPath != null) {
                        simplePathStrategy.addRoot(attributeValue, fileBuildPath);
                    }
                }
            } else {
                return simplePathStrategy;
            }
        }
    }

    static class SimplePathStrategy implements PathStrategy {
        private final String mAuthority;
        private final HashMap<String, File> mRoots = new HashMap<>();

        public SimplePathStrategy(String str) {
            this.mAuthority = str;
        }

        public void addRoot(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.mRoots.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                throw new IllegalArgumentException(new StringBuffer().append("Failed to resolve canonical path for ").append(file).toString(), e);
            }
        }

        @Override // com.gmail.heagoo.apkeditor.installer.FileProvider.PathStrategy
        public Uri getUriForFile(File file) {
            String strSubstring;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = (Map.Entry) null;
                for (Map.Entry<String, File> entry2 : this.mRoots.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(new StringBuffer().append("Failed to find configured root that contains ").append(canonicalPath).toString());
                }
                String path2 = entry.getValue().getPath();
                if (path2.endsWith("/")) {
                    strSubstring = canonicalPath.substring(path2.length());
                } else {
                    strSubstring = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme(gzd.COLUMN_CONTENT).authority(this.mAuthority).encodedPath(new StringBuffer().append(new StringBuffer().append(Uri.encode(entry.getKey())).append('/').toString()).append(Uri.encode(strSubstring, "/")).toString()).build();
            } catch (IOException e) {
                throw new IllegalArgumentException(new StringBuffer().append("Failed to resolve canonical path for ").append(file).toString());
            }
        }

        @Override // com.gmail.heagoo.apkeditor.installer.FileProvider.PathStrategy
        public File getFileForUri(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.mRoots.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException(new StringBuffer().append("Unable to find configured root for ").append(uri).toString());
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (!canonicalFile.getPath().startsWith(file.getPath())) {
                    throw new SecurityException("Resolved path jumped beyond configured root");
                }
                return canonicalFile;
            } catch (IOException e) {
                throw new IllegalArgumentException(new StringBuffer().append("Failed to resolve canonical path for ").append(file2).toString());
            }
        }
    }

    private static int modeToMode(String str) {
        int i;
        if (!"r".equals(str)) {
            if (!"w".equals(str) && !"wt".equals(str)) {
                if (!"wa".equals(str)) {
                    if (!"rw".equals(str)) {
                        if ("rwt".equals(str)) {
                            i = 1006632960;
                        } else {
                            throw new IllegalArgumentException(new StringBuffer().append("Invalid mode: ").append(str).toString());
                        }
                    } else {
                        i = 939524096;
                    }
                } else {
                    i = 704643072;
                }
            } else {
                i = 738197504;
            }
        } else {
            i = 268435456;
        }
        return i;
    }

    private static File buildPath(File file, String... strArr) {
        File file2 = file;
        for (String str : strArr) {
            if (str != null) {
                file2 = new File(file2, str);
            }
        }
        return file2;
    }

    private static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    private static Object[] copyOf(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }
}
