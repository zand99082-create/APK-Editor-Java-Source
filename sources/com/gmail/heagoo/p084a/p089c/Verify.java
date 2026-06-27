package com.gmail.heagoo.p084a.p089c;

import android.support.v7.widget.ActivityChooserView;
import com.android.apksig.ApkVerifier;
import com.android.apksig.apk.MinSdkVersionException;
import jadx.core.deobf.Deobfuscator;
import java.io.File;
import java.io.PrintStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Verify {
    private static MessageDigest sha256 = null;
    private static MessageDigest sha1 = null;
    private static MessageDigest md5 = null;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void printCertificate(X509Certificate x509Certificate, String str, boolean z, StringBuilder sb) throws NoSuchAlgorithmException, CertificateEncodingException {
        byte b2;
        DSAParams params;
        if (x509Certificate == null) {
            throw new NullPointerException("cert == null");
        }
        if (sha256 == null || sha1 == null || md5 == null) {
            sha256 = MessageDigest.getInstance("SHA-256");
            sha1 = MessageDigest.getInstance("SHA-1");
            md5 = MessageDigest.getInstance("MD5");
        }
        byte[] encoded = x509Certificate.getEncoded();
        String strEncode = HexEncoding.encode(sha1.digest(encoded));
        switch (strEncode.hashCode()) {
            case -1905441971:
                b2 = !strEncode.equals("b79df4a82e90b57ea76525ab7037ab238a42f5d3") ? (byte) -1 : (byte) 3;
                break;
            case -1618321323:
                if (strEncode.equals("27196e386b875e76adf700e7ea84e4c6eee33dfa")) {
                    b2 = 2;
                    break;
                }
                break;
            case 639793119:
                if (strEncode.equals("5b368cff2da2686996bc95eac190eaa4f5630fe5")) {
                    b2 = 1;
                    break;
                }
                break;
            case 1818954747:
                if (strEncode.equals("927ca44949d7788aa86f9d7f04d7fdacecd1dfb9")) {
                    b2 = 4;
                    break;
                }
                break;
            case 2046377127:
                if (strEncode.equals("61ed377e85d386a8dfee6b864bd85b0bfaa5af81")) {
                    b2 = 0;
                    break;
                }
                break;
        }
        if (b2 == 0) {
            sb.append("Shared Signature -> testkey");
            sb.append('\n');
            sb.append('\n');
        } else if (b2 == 1) {
            sb.append("Shared Signature -> shared");
            sb.append('\n');
            sb.append('\n');
        } else if (b2 == 2) {
            sb.append("Shared Signature -> platform");
            sb.append('\n');
            sb.append('\n');
        } else if (b2 == 3) {
            sb.append("Shared Signature -> media");
            sb.append('\n');
            sb.append('\n');
        } else if (b2 == 4) {
            sb.append("Shared Signature -> apkeditor");
            sb.append('\n');
            sb.append('\n');
        }
        sb.append(str + " certificate DN: " + x509Certificate.getSubjectDN());
        sb.append('\n');
        sb.append(str + " certificate SHA-256 digest: " + HexEncoding.encode(sha256.digest(encoded)));
        sb.append('\n');
        sb.append(str + " certificate SHA-1 digest: " + HexEncoding.encode(sha1.digest(encoded)));
        sb.append('\n');
        sb.append(str + " certificate MD5 digest: " + HexEncoding.encode(md5.digest(encoded)));
        sb.append('\n');
        if (z) {
            PublicKey publicKey = x509Certificate.getPublicKey();
            sb.append(str + " key algorithm: " + publicKey.getAlgorithm());
            sb.append('\n');
            int iBitLength = -1;
            if (publicKey instanceof RSAKey) {
                iBitLength = ((RSAKey) publicKey).getModulus().bitLength();
            } else if (publicKey instanceof ECKey) {
                iBitLength = ((ECKey) publicKey).getParams().getOrder().bitLength();
            } else if ((publicKey instanceof DSAKey) && (params = ((DSAKey) publicKey).getParams()) != null) {
                iBitLength = params.getP().bitLength();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" key size (bits): ");
            sb2.append(iBitLength != -1 ? String.valueOf(iBitLength) : "n/a");
            sb.append(sb2.toString());
            sb.append('\n');
            byte[] encoded2 = publicKey.getEncoded();
            sb.append(str + " public key SHA-256 digest: " + HexEncoding.encode(sha256.digest(encoded2)));
            sb.append('\n');
            sb.append(str + " public key SHA-1 digest: " + HexEncoding.encode(sha1.digest(encoded2)));
            sb.append('\n');
            sb.append(str + " public key MD5 digest: " + HexEncoding.encode(md5.digest(encoded2)));
            sb.append('\n');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x036b A[EDGE_INSN: B:130:0x036b->B:82:0x036b BREAK  A[LOOP:6: B:71:0x02cc->B:81:0x0367], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bf A[LOOP:1: B:48:0x01b9->B:50:0x01bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f4 A[LOOP:2: B:55:0x01ee->B:57:0x01f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x041e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String verify(String str) throws Exception {
        ApkVerifier.Result resultVerify;
        String message;
        ApkVerifier.Result.SourceStampInfo sourceStampInfo;
        Iterator<ApkVerifier.IssueWithParams> it;
        Iterator<ApkVerifier.IssueWithParams> it2;
        Iterator<ApkVerifier.Result.V1SchemeSignerInfo> it3;
        Iterator<ApkVerifier.Result.V2SchemeSignerInfo> it4;
        String str2;
        Iterator<ApkVerifier.Result.V3SchemeSignerInfo> it5;
        File file = new File(str);
        boolean z = true;
        boolean z2 = false;
        char c = 65535;
        boolean z3 = false;
        File file2 = new File(str + ".idsig");
        File file3 = file2.exists() ? file2 : null;
        StringBuilder sb = new StringBuilder();
        if (0 != 0 && 0 != 0 && 1 > 2147483647) {
            throw new ParameterException("Min API Level (1) > max API Level (" + ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED + ")");
        }
        ApkVerifier.Builder builder = new ApkVerifier.Builder(file);
        if (0 != 0) {
            builder.setMinCheckedPlatformVersion(1);
        }
        if (0 != 0) {
            builder.setMaxCheckedPlatformVersion(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }
        if (file3 != null) {
            if (!file3.exists()) {
                throw new ParameterException("V4 signature file does not exist: " + file3.getCanonicalPath());
            }
            builder.setV4SignatureFile(file3);
        }
        ApkVerifier apkVerifierBuild = builder.build();
        if (0 != 0) {
            try {
                resultVerify = apkVerifierBuild.verifySourceStamp(null);
                boolean zIsVerified = resultVerify.isVerified();
                sourceStampInfo = resultVerify.getSourceStampInfo();
                boolean z4 = false;
                List<X509Certificate> signerCertificates = resultVerify.getSignerCertificates();
                if (1 != 0) {
                    if (zIsVerified) {
                        sb.append("Verifies");
                        sb.append('\n');
                    } else {
                        sb.append("DOES NOT VERIFY");
                        sb.append('\n');
                    }
                    sb.append("v1 scheme (JAR signing): " + resultVerify.isVerifiedUsingV1Scheme());
                    sb.append('\n');
                    sb.append("v2 scheme (APK Signature Scheme v2): " + resultVerify.isVerifiedUsingV2Scheme());
                    sb.append('\n');
                    sb.append("v3 scheme (APK Signature Scheme v3): " + resultVerify.isVerifiedUsingV3Scheme());
                    sb.append('\n');
                    sb.append("v4 scheme (APK Signature Scheme v4): " + resultVerify.isVerifiedUsingV4Scheme());
                    sb.append('\n');
                    sb.append('\n');
                }
                if (1 == 0) {
                    int i = 0;
                    Iterator<X509Certificate> it6 = signerCertificates.iterator();
                    while (it6.hasNext()) {
                        Iterator<X509Certificate> it7 = it6;
                        i++;
                        printCertificate(it6.next(), "Signer #" + i, true, sb);
                        z = z;
                        it6 = it7;
                        z2 = z2;
                    }
                    if (sourceStampInfo != null) {
                        printCertificate(sourceStampInfo.getCertificate(), "Source Stamp Signer", true, sb);
                    }
                }
                it = resultVerify.getErrors().iterator();
                while (it.hasNext()) {
                    sb.append("ERROR: " + it.next());
                    sb.append('\n');
                }
                PrintStream printStream = 0 == 0 ? System.err : System.out;
                it2 = resultVerify.getWarnings().iterator();
                while (it2.hasNext()) {
                    z4 = true;
                    sb.append("WARNING: " + it2.next());
                    sb.append('\n');
                    printStream = printStream;
                }
                it3 = resultVerify.getV1SchemeSigners().iterator();
                while (it3.hasNext()) {
                    ApkVerifier.Result.V1SchemeSignerInfo next = it3.next();
                    String name = next.getName();
                    Iterator<ApkVerifier.IssueWithParams> it8 = next.getErrors().iterator();
                    while (it8.hasNext()) {
                        Iterator<ApkVerifier.Result.V1SchemeSignerInfo> it9 = it3;
                        sb.append("ERROR: JAR signer " + name + ": " + it8.next());
                        sb.append('\n');
                        c = c;
                        it3 = it9;
                        z3 = z3;
                    }
                    Iterator<ApkVerifier.Result.V1SchemeSignerInfo> it10 = it3;
                    char c2 = c;
                    boolean z5 = z3;
                    for (Iterator<ApkVerifier.IssueWithParams> it11 = next.getWarnings().iterator(); it11.hasNext(); it11 = it11) {
                        z4 = true;
                        sb.append("WARNING: JAR signer " + name + ": " + it11.next());
                        sb.append('\n');
                    }
                    c = c2;
                    it3 = it10;
                    z3 = z5;
                }
                it4 = resultVerify.getV2SchemeSigners().iterator();
                while (true) {
                    str2 = "signer #";
                    if (it4.hasNext()) {
                        break;
                    }
                    ApkVerifier.Result.V2SchemeSignerInfo next2 = it4.next();
                    String str3 = "signer #" + (next2.getIndex() + 1);
                    for (Iterator<ApkVerifier.IssueWithParams> it12 = next2.getErrors().iterator(); it12.hasNext(); it12 = it12) {
                        sb.append("ERROR: APK Signature Scheme v2 " + str3 + ": " + it12.next());
                        sb.append('\n');
                        it4 = it4;
                    }
                    Iterator<ApkVerifier.Result.V2SchemeSignerInfo> it13 = it4;
                    for (Iterator<ApkVerifier.IssueWithParams> it14 = next2.getWarnings().iterator(); it14.hasNext(); it14 = it14) {
                        z4 = true;
                        sb.append("WARNING: APK Signature Scheme v2 " + str3 + ": " + it14.next());
                        sb.append('\n');
                    }
                    it4 = it13;
                }
                it5 = resultVerify.getV3SchemeSigners().iterator();
                while (it5.hasNext()) {
                    ApkVerifier.Result.V3SchemeSignerInfo next3 = it5.next();
                    String str4 = str2 + (next3.getIndex() + 1);
                    Iterator<ApkVerifier.IssueWithParams> it15 = next3.getErrors().iterator();
                    while (it15.hasNext()) {
                        ApkVerifier.Result result = resultVerify;
                        sb.append("ERROR: APK Signature Scheme v3 " + str4 + ": " + it15.next());
                        sb.append('\n');
                        it5 = it5;
                        resultVerify = result;
                        str2 = str2;
                    }
                    ApkVerifier.Result result2 = resultVerify;
                    Iterator<ApkVerifier.Result.V3SchemeSignerInfo> it16 = it5;
                    String str5 = str2;
                    Iterator<ApkVerifier.IssueWithParams> it17 = next3.getWarnings().iterator();
                    while (it17.hasNext()) {
                        z4 = true;
                        sb.append("WARNING: APK Signature Scheme v3 " + str4 + ": " + it17.next());
                        sb.append('\n');
                    }
                    it5 = it16;
                    resultVerify = result2;
                    str2 = str5;
                }
                if (sourceStampInfo != null) {
                    Iterator<ApkVerifier.IssueWithParams> it18 = sourceStampInfo.getErrors().iterator();
                    while (it18.hasNext()) {
                        sb.append("ERROR: SourceStamp: " + it18.next());
                        sb.append('\n');
                    }
                    Iterator<ApkVerifier.IssueWithParams> it19 = sourceStampInfo.getWarnings().iterator();
                    while (it19.hasNext()) {
                        sb.append("WARNING: SourceStamp: " + it19.next());
                        sb.append('\n');
                    }
                }
                return zIsVerified ? sb.toString() : (0 == 0 || !z4) ? sb.toString() : sb.toString();
            } catch (MinSdkVersionException e) {
                e = e;
                message = e.getMessage();
                if (!message.endsWith(Deobfuscator.CLASS_NAME_SEPARATOR)) {
                    String str6 = message + '.';
                }
                throw new MinSdkVersionException("Failed to determine APK's minimum supported platform version. Use --min-sdk-version to override", e);
            }
        }
        try {
            resultVerify = apkVerifierBuild.verify();
            boolean zIsVerified2 = resultVerify.isVerified();
            sourceStampInfo = resultVerify.getSourceStampInfo();
            boolean z42 = false;
            List<X509Certificate> signerCertificates2 = resultVerify.getSignerCertificates();
            if (1 != 0) {
            }
            if (1 == 0) {
            }
            it = resultVerify.getErrors().iterator();
            while (it.hasNext()) {
            }
            if (0 == 0) {
            }
            it2 = resultVerify.getWarnings().iterator();
            while (it2.hasNext()) {
            }
            it3 = resultVerify.getV1SchemeSigners().iterator();
            while (it3.hasNext()) {
            }
            it4 = resultVerify.getV2SchemeSigners().iterator();
            while (true) {
                str2 = "signer #";
                if (it4.hasNext()) {
                }
                it4 = it13;
            }
            it5 = resultVerify.getV3SchemeSigners().iterator();
            while (it5.hasNext()) {
            }
            if (sourceStampInfo != null) {
            }
            if (zIsVerified2) {
            }
        } catch (MinSdkVersionException e2) {
            e = e2;
            message = e.getMessage();
            if (!message.endsWith(Deobfuscator.CLASS_NAME_SEPARATOR)) {
            }
            throw new MinSdkVersionException("Failed to determine APK's minimum supported platform version. Use --min-sdk-version to override", e);
        }
    }
}
