package com.masrull.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ListViewAdapter extends BaseAdapter {
    private List<AnimalNames> animalNamesList;
    private ArrayList<AnimalNames> arraylist = new ArrayList<>();
    LayoutInflater inflater;
    Context mContext;

    @Override // android.widget.Adapter
    public /* bridge */ Object getItem(int i) {
        return getItem(i);
    }

    public ListViewAdapter(Context context, List<AnimalNames> list) {
        this.animalNamesList = (List) null;
        this.mContext = context;
        this.animalNamesList = list;
        this.inflater = LayoutInflater.from(this.mContext);
        this.arraylist.addAll(list);
    }

    public class ViewHolder {
        TextView name;
        private final ListViewAdapter this$0;

        public ViewHolder(ListViewAdapter listViewAdapter) {
            this.this$0 = listViewAdapter;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.animalNamesList.size();
    }

    @Override // android.widget.Adapter
    public AnimalNames getItem(int i) {
        return this.animalNamesList.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            ViewHolder viewHolder = new ViewHolder(this);
            View viewInflate = this.inflater.inflate(R.layout.abc_action_bar_title_item, (ViewGroup) null);
            viewHolder.name = (TextView) viewInflate.findViewById(android.R.id.title);
            viewInflate.setTag(viewHolder);
            return viewInflate;
        }
        return view;
    }

    public void filter(String str) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        this.animalNamesList.clear();
        if (lowerCase.length() == 0) {
            this.animalNamesList.addAll(this.arraylist);
        } else {
            for (AnimalNames animalNames : this.arraylist) {
                if (animalNames.getAnimalName().toLowerCase(Locale.getDefault()).contains(lowerCase)) {
                    this.animalNamesList.add(animalNames);
                }
            }
        }
        notifyDataSetChanged();
    }
}
