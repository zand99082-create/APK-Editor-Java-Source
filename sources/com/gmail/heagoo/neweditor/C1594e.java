package com.gmail.heagoo.neweditor;

import android.content.Context;
import android.text.Editable;
import android.text.Spannable;
import android.text.style.CharacterStyle;
import android.widget.EditText;
import com.github.megatronking.stringfog.xor.StringFogImpl;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1594e implements Serializable {

    /* JADX INFO: renamed from: a */
    private static int f4819a = 64;

    /* JADX INFO: renamed from: b */
    private transient ArrayList f4820b;

    /* JADX INFO: renamed from: d */
    private boolean f4822d;

    /* JADX INFO: renamed from: e */
    private int f4823e;

    /* JADX INFO: renamed from: f */
    private int f4824f;

    /* JADX INFO: renamed from: g */
    private File f4825g;

    /* JADX INFO: renamed from: m */
    private transient C1587af f4831m;

    /* JADX INFO: renamed from: n */
    private C1592c f4832n;

    /* JADX INFO: renamed from: c */
    private boolean f4821c = false;

    /* JADX INFO: renamed from: h */
    private Vector f4826h = new Vector();

    /* JADX INFO: renamed from: i */
    private int f4827i = 0;

    /* JADX INFO: renamed from: j */
    private int f4828j = 0;

    /* JADX INFO: renamed from: k */
    private String f4829k = null;

    /* JADX INFO: renamed from: l */
    private Vector f4830l = new Vector();

    public C1594e(Context context, File file, String str) {
        String str2;
        this.f4825g = file;
        this.f4832n = new C1592c(context);
        if (str == null) {
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                String strSubstring = name.substring(iLastIndexOf + 1);
                str2 = (strSubstring.equals("htm") ? "html" : strSubstring) + ".xml";
            } else {
                str2 = "txt.xml";
            }
        } else {
            str2 = str;
        }
        C1589ah c1589ah = new C1589ah();
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            try {
                InputSource inputSource = new InputSource(new BufferedInputStream(context.getAssets().open("syntax/" + str2)));
                xMLReader.setContentHandler(c1589ah);
                xMLReader.setDTDHandler(c1589ah);
                xMLReader.setEntityResolver(c1589ah);
                xMLReader.setErrorHandler(c1589ah);
                xMLReader.parse(inputSource);
                this.f4831m = c1589ah.m3892a();
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
            }
        } catch (ParserConfigurationException e2) {
            e2.printStackTrace();
        } catch (SAXException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private C1588ag m3899a(int i) {
        if (this.f4820b == null) {
            this.f4820b = new ArrayList();
        }
        if (i >= this.f4820b.size()) {
            return null;
        }
        return (C1588ag) this.f4820b.get(i);
    }

    /* JADX INFO: renamed from: a */
    private void m3900a(int i, C1588ag c1588ag) {
        if (i >= 0) {
            if (this.f4820b == null) {
                this.f4820b = new ArrayList();
            }
            while (i >= this.f4820b.size()) {
                this.f4820b.add(null);
            }
            this.f4820b.set(i, c1588ag);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3901a(Spannable spannable, int i, int i2) {
        for (Object obj : spannable.getSpans(i, i2, C1584ac.class)) {
            spannable.removeSpan(obj);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3902a(Spannable spannable, CharacterStyle characterStyle, int i, int i2, int i3) {
        spannable.setSpan(characterStyle, i, i2, 33);
    }

    /* JADX INFO: renamed from: c */
    private String m3903c() {
        return this.f4825g != null ? this.f4825g.getName() : "untitled";
    }

    /* JADX INFO: renamed from: a */
    public final String m3904a() {
        return this.f4829k;
    }

    /* JADX INFO: renamed from: a */
    public final void m3905a(Context context) throws IOException {
        m3910a(this.f4825g.getAbsolutePath());
    }

    /* JADX INFO: renamed from: a */
    public final void m3906a(Context context, String str, int i) throws IOException {
        int i2;
        File file = new File(str);
        FileInputStream fileInputStream = new FileInputStream(file);
        long length = file.length();
        if (length > 4194304) {
            throw new IOException(context.getString(i));
        }
        byte[] bArr = new byte[(int) length];
        int i3 = 0;
        while (i3 < bArr.length && (i2 = fileInputStream.read(bArr, i3, bArr.length - i3)) >= 0) {
            i3 += i2;
        }
        this.f4829k = new String(bArr, StringFogImpl.CHARSET_NAME_UTF_8);
        this.f4821c = false;
        fileInputStream.close();
    }

    /* JADX INFO: renamed from: a */
    public final void m3907a(EditText editText) {
        C1588ag c1588agM3879a;
        C1593d c1593d;
        try {
            if (this.f4831m == null) {
                this.f4822d = false;
                return;
            }
            Editable text = editText.getText();
            String[] strArrSplit = text.toString().split("\\n");
            C1615z c1615z = new C1615z();
            C1588ag c1588ag = null;
            int i = 0;
            int i2 = 0;
            while (i < strArrSplit.length) {
                m3901a(text, i2, strArrSplit[i].length() + i2);
                try {
                    c1593d = new C1593d();
                    c1615z.f4884a = strArrSplit[i].toCharArray();
                    c1615z.f4886c = 0;
                    c1615z.f4885b = strArrSplit[i].length();
                    c1588agM3879a = this.f4831m.m3879a(c1588ag, c1593d, c1615z);
                } catch (Exception e) {
                    e = e;
                    c1588agM3879a = c1588ag;
                }
                try {
                    for (Token tokenM2449a = C1067a.m2449a(c1593d.m3898a()); tokenM2449a != null; tokenM2449a = tokenM2449a.next) {
                        if (tokenM2449a.length > 0 && tokenM2449a.f4747id != 0) {
                            m3902a(text, new C1584ac(this.f4832n.m3895a(tokenM2449a)), tokenM2449a.offset + i2, tokenM2449a.length + tokenM2449a.offset + i2, 33);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                }
                m3900a(i, c1588ag);
                int length = i2 + strArrSplit[i].length() + 1;
                i++;
                i2 = length;
                c1588ag = c1588agM3879a;
            }
        } catch (Error e3) {
            e3.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3908a(EditText editText, int i, int i2, int i3, int i4, boolean z) {
        C1588ag c1588agM3899a;
        C1588ag c1588agM3879a;
        try {
            if (this.f4831m == null) {
                this.f4822d = false;
                return;
            }
            Editable text = editText.getText();
            String[] strArrSplit = text.toString().split("\\n");
            C1615z c1615z = new C1615z();
            C1588ag c1588ag = null;
            int i5 = 0;
            int i6 = 0;
            while (i5 < strArrSplit.length) {
                if (i5 >= this.f4824f && i5 <= this.f4823e && (i5 < i3 || i5 > i4)) {
                    m3901a(editText.getText(), i6, strArrSplit[i5].length() + i6);
                }
                if ((!z || i > strArrSplit[i5].length() + i6 || i2 < i6) && ((z || i5 < i3 || i5 > i4) && (m3899a(i5) == c1588ag || i5 < i3 || i5 > i4))) {
                    c1588agM3899a = m3899a(i5 + 1);
                } else {
                    m3901a(text, i6, strArrSplit[i5].length() + i6);
                    try {
                        C1593d c1593d = new C1593d();
                        c1615z.f4884a = strArrSplit[i5].toCharArray();
                        c1615z.f4886c = 0;
                        c1615z.f4885b = strArrSplit[i5].length();
                        c1588agM3879a = this.f4831m.m3879a(c1588ag, c1593d, c1615z);
                        try {
                            for (Token tokenM2449a = C1067a.m2449a(c1593d.m3898a()); tokenM2449a != null; tokenM2449a = tokenM2449a.next) {
                                if (i5 >= i3 && i5 <= i4 && tokenM2449a.length > 0 && tokenM2449a.f4747id != 0) {
                                    m3902a(text, new C1584ac(this.f4832n.m3895a(tokenM2449a)), tokenM2449a.offset + i6, tokenM2449a.length + tokenM2449a.offset + i6, 33);
                                }
                            }
                            c1588agM3899a = c1588agM3879a;
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            c1588agM3899a = c1588agM3879a;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        c1588agM3879a = c1588ag;
                    }
                    m3900a(i5, c1588ag);
                }
                int length = i6 + strArrSplit[i5].length() + 1;
                i5++;
                i6 = length;
                c1588ag = c1588agM3899a;
            }
            this.f4824f = i3;
            this.f4823e = i4;
        } catch (Error e3) {
            e3.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3909a(CharSequence charSequence, int i, int i2, int i3) {
        try {
            String str = this.f4829k;
            this.f4829k = charSequence.toString();
            C1581a c1581a = new C1581a(i, str.substring(i, i + i2), this.f4829k.substring(i, i + i3));
            if (this.f4830l.size() <= 0 || !((C1581a) this.f4830l.lastElement()).m3867a(c1581a)) {
                this.f4830l.addElement(c1581a);
            } else {
                ((C1581a) this.f4830l.lastElement()).m3868b(c1581a);
            }
            while (f4819a != 0 && this.f4830l.size() > f4819a) {
                this.f4830l.remove(0);
            }
            this.f4826h.clear();
            this.f4821c = true;
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3910a(String str) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StringFogImpl.CHARSET_NAME_UTF_8);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write(this.f4829k);
        bufferedWriter.flush();
        outputStreamWriter.close();
        fileOutputStream.close();
    }

    /* JADX INFO: renamed from: a */
    public final void m3911a(boolean z) {
        this.f4821c = z;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3912b() {
        return this.f4821c;
    }

    public final String toString() {
        return this.f4821c ? m3903c() + " *" : m3903c();
    }
}
