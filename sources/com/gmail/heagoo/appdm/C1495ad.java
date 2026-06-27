package com.gmail.heagoo.appdm;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.appdm.util.C1523e;
import com.gmail.heagoo.common.ccc;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.ad */
/* JADX INFO: loaded from: classes.dex */
public final class C1495ad extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    private WeakReference f4493a;

    /* JADX INFO: renamed from: b */
    private String f4494b;

    /* JADX INFO: renamed from: c */
    private String f4495c;

    /* JADX INFO: renamed from: d */
    private boolean f4496d;

    /* JADX INFO: renamed from: e */
    private boolean f4497e;

    /* JADX INFO: renamed from: f */
    private List f4498f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private String f4499g;

    public C1495ad(PrefOverallActivity prefOverallActivity, String str, boolean z, boolean z2) {
        this.f4493a = new WeakReference(prefOverallActivity);
        this.f4494b = str;
        this.f4496d = z;
        this.f4497e = z2;
        this.f4495c = str;
        this.f4499g = prefOverallActivity.getString(R.string.appdm_file_size) + " ";
        new C1498ag(this, this.f4495c).start();
    }

    /* JADX INFO: renamed from: a */
    protected static C1523e m3700a() {
        C1523e c1523e = new C1523e();
        c1523e.f4582a = "..";
        c1523e.f4584c = true;
        return c1523e;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List m3704b(String str) throws Throwable {
        BufferedReader bufferedReader;
        C1523e c1523e;
        ArrayList arrayList = new ArrayList();
        try {
            bufferedReader = new BufferedReader(new StringReader(str));
            try {
                try {
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        String[] strArrSplit = line.split("\\s+");
                        if (strArrSplit.length >= 5) {
                            char cCharAt = strArrSplit[0].charAt(0);
                            if (cCharAt == '-') {
                                c1523e = new C1523e();
                                c1523e.f4584c = false;
                                try {
                                    c1523e.f4583b = Integer.valueOf(strArrSplit[3]).intValue();
                                } catch (Throwable th) {
                                }
                            } else if (cCharAt == 'd') {
                                c1523e = new C1523e();
                                c1523e.f4584c = true;
                                c1523e.f4583b = 0;
                            } else {
                                c1523e = null;
                            }
                            if (c1523e != null) {
                                c1523e.f4582a = strArrSplit[strArrSplit.length - 1];
                                arrayList.add(c1523e);
                            }
                        }
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                    }
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            if (bufferedReader != null) {
            }
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final String m3707a(List list) {
        String str;
        synchronized (this.f4498f) {
            list.addAll(this.f4498f);
            str = this.f4495c;
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    protected final List m3708a(String str) {
        return m3709a(str, false);
    }

    /* JADX INFO: renamed from: a */
    protected final List m3709a(String str, boolean z) {
        String strMo3755a;
        if (this.f4496d) {
            ccc cccVarM3691g = ((PrefOverallActivity) this.f4493a.get()).m3691g();
            if (cccVarM3691g.mo3760a(String.format("ls -l %s", str), null, 5000, z) && (strMo3755a = cccVarM3691g.mo3755a()) != null) {
                return m3704b(strMo3755a);
            }
            ((PrefOverallActivity) this.f4493a.get()).runOnUiThread(new RunnableC1496ae(this, "Read error, please try again."));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles == null) {
            return arrayList;
        }
        for (File file : fileArrListFiles) {
            C1523e c1523e = new C1523e();
            c1523e.f4582a = file.getName();
            c1523e.f4584c = file.isDirectory();
            c1523e.f4583b = (int) file.length();
            arrayList.add(c1523e);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m3710a(String str, List list) {
        Activity activity = (Activity) this.f4493a.get();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new RunnableC1497af(this, str, list));
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f4498f.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f4498f.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1499ah c1499ah;
        C1523e c1523e = (C1523e) getItem(i);
        if (c1523e == null) {
            return null;
        }
        if (view == null) {
            view = LayoutInflater.from((Context) this.f4493a.get()).inflate(R.layout.appdm_item_file, (ViewGroup) null);
            C1499ah c1499ah2 = new C1499ah();
            c1499ah2.f4507a = (ImageView) view.findViewById(R.id.file_icon);
            c1499ah2.f4508b = (TextView) view.findViewById(R.id.filename);
            c1499ah2.f4509c = (TextView) view.findViewById(R.id.detail1);
            view.setTag(c1499ah2);
            c1499ah = c1499ah2;
        } else {
            c1499ah = (C1499ah) view.getTag();
        }
        if (c1523e.f4584c) {
            c1499ah.f4507a.setImageResource(R.drawable.ic_file_folder);
            c1499ah.f4509c.setVisibility(8);
        } else {
            c1499ah.f4507a.setImageResource(R.drawable.ic_file_unknown);
            c1499ah.f4509c.setText(this.f4499g + c1523e.f4583b);
            c1499ah.f4509c.setVisibility(0);
        }
        c1499ah.f4508b.setText(c1523e.f4582a);
        return view;
    }
}
