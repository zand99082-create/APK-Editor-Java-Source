package com.masrull.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: loaded from: classes.dex */
public class CountryAdapter extends BaseAdapter {
    private Context context;

    @Override // android.widget.Adapter
    public int getCount() {
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return (Object) null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(R.layout.abc_action_bar_title_item, viewGroup, false);
        }
        ((TextView) view.findViewById(android.R.id.title)).setText("gyg");
        return view;
    }
}
