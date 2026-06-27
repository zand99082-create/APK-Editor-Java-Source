package com.gmail.heagoo.apkeditor.p098se;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.DialogC1197cn;
import com.gmail.heagoo.apkeditor.InterfaceC1204cu;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000a.p001a.p003b.p004a.p005a.C0027x;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.c */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1430c extends BaseAdapter implements MediaPlayer.OnCompletionListener, View.OnClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, InterfaceC1204cu {

    /* JADX INFO: renamed from: a */
    private Activity f4214a;

    /* JADX INFO: renamed from: b */
    private C1453z f4215b;

    /* JADX INFO: renamed from: c */
    private List f4216c;

    /* JADX INFO: renamed from: f */
    private String f4219f;

    /* JADX INFO: renamed from: g */
    private MediaPlayer f4220g;

    /* JADX INFO: renamed from: i */
    private String f4222i;

    /* JADX INFO: renamed from: d */
    private Set f4217d = new HashSet();

    /* JADX INFO: renamed from: e */
    private Map f4218e = new HashMap();

    /* JADX INFO: renamed from: h */
    private int f4221h = -1;

    /* JADX INFO: renamed from: j */
    private int f4223j = R.layout.item_zipfile;

    public ViewOnClickListenerC1430c(Activity activity, C1453z c1453z) {
        this.f4214a = activity;
        this.f4215b = c1453z;
        this.f4216c = c1453z.f4284d;
    }

    /* JADX INFO: renamed from: a */
    private static String m3526a(String str) {
        return str.substring(str.lastIndexOf(47) + 1);
    }

    /* JADX INFO: renamed from: a */
    private void m3527a(int i) throws IOException {
        String str = (String) this.f4216c.get(i);
        if (this.f4220g == null) {
            this.f4219f = C1067a.m2525d(this.f4214a, "tmp");
            this.f4220g = new MediaPlayer();
            this.f4220g.setOnCompletionListener(this);
        } else {
            this.f4220g.reset();
        }
        if (!this.f4217d.contains(str)) {
            C0027x.m34b(this.f4215b.m3556b(), str, this.f4219f + m3526a(str));
            this.f4217d.add(str);
        }
        if (str.equals(this.f4222i)) {
            this.f4220g.stop();
            this.f4222i = null;
            this.f4221h = -1;
            return;
        }
        String str2 = (String) this.f4218e.get(str);
        if (str2 != null) {
            this.f4220g.setDataSource(str2);
        } else {
            this.f4220g.setDataSource(this.f4219f + m3526a(str));
        }
        this.f4220g.prepare();
        this.f4220g.start();
        this.f4222i = str;
        this.f4221h = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3529b(int i) {
        new DialogC1197cn(this.f4214a, this, "", (String) this.f4216c.get(i), this.f4214a.getString(R.string.select_file_replace)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m3531c(int i) {
        String str = (String) this.f4216c.get(i);
        ViewOnClickListenerC1448u.m3544a(this.f4214a, this.f4215b.m3556b(), str);
    }

    /* JADX INFO: renamed from: a */
    public final void m3532a() {
        if (this.f4220g != null) {
            if (this.f4220g.isPlaying()) {
                this.f4220g.stop();
            }
            this.f4220g.release();
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final void mo2764a(String str, String str2, boolean z) {
        this.f4218e.put(str2, str);
        ((SimpleEditActivity) this.f4214a).m3515a();
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: a */
    public final boolean mo2765a(String str, String str2) {
        return C1453z.m3553a(str);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1204cu
    /* JADX INFO: renamed from: b */
    public final String mo2766b(String str, String str2) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Map m3533b() {
        return this.f4218e;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f4216c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f4216c.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"InflateParams"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1447t c1447t;
        String str = (String) this.f4216c.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.f4214a).inflate(this.f4223j, (ViewGroup) null);
            C1447t c1447t2 = new C1447t();
            c1447t2.f4253a = (ImageView) view.findViewById(R.id.file_icon);
            c1447t2.f4254b = (TextView) view.findViewById(R.id.filename);
            c1447t2.f4255c = (TextView) view.findViewById(R.id.detail1);
            c1447t2.f4256d = view.findViewById(R.id.menu_edit);
            c1447t2.f4257e = view.findViewById(R.id.menu_save);
            view.setTag(c1447t2);
            c1447t = c1447t2;
        } else {
            c1447t = (C1447t) view.getTag();
        }
        int iLastIndexOf = str.lastIndexOf(47);
        String strSubstring = str.substring(iLastIndexOf + 1);
        String strSubstring2 = str.substring(0, iLastIndexOf + 1);
        c1447t.f4253a.setId(i);
        c1447t.f4253a.setOnClickListener(this);
        c1447t.f4256d.setId(this.f4216c.size() + i);
        c1447t.f4256d.setOnClickListener(this);
        c1447t.f4257e.setId((this.f4216c.size() * 2) + i);
        c1447t.f4257e.setOnClickListener(this);
        if (i != this.f4221h) {
            c1447t.f4253a.setImageResource(R.drawable.play);
        } else {
            c1447t.f4253a.setImageResource(R.drawable.pause);
        }
        c1447t.f4254b.setText(strSubstring);
        c1447t.f4255c.setText(strSubstring2);
        return view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id < this.f4216c.size()) {
            try {
                m3527a(id);
                notifyDataSetChanged();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (id < this.f4216c.size() * 2) {
            m3529b(id - this.f4216c.size());
        } else if (id < this.f4216c.size() * 3) {
            m3531c(id - (this.f4216c.size() * 2));
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f4222i = null;
        this.f4221h = -1;
        notifyDataSetChanged();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        try {
            m3527a(i);
            notifyDataSetChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        adapterView.setOnCreateContextMenuListener(new ViewOnCreateContextMenuListenerC1431d(this, i));
        return false;
    }
}
