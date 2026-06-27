package orehito.view.page;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.gmail.heagoo.apkeditor.gzd;

/* JADX INFO: loaded from: classes.dex */
public class orehitopage extends ViewPager {

    public class PagerAdapter extends android.support.v4.view.PagerAdapter {
        private final orehitopage this$0;

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            return 3;
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            int resource = 0;
            switch (i) {
                case 0:
                    resource = this.this$0.setResource("page1", gzd.COLUMN_ID);
                    break;
                case 1:
                    resource = this.this$0.setResource("page2", gzd.COLUMN_ID);
                    break;
                case 2:
                    resource = this.this$0.setResource("page3", gzd.COLUMN_ID);
                    break;
            }
            return this.this$0.findViewById(resource);
        }

        @Override // android.support.v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // android.support.v4.view.PagerAdapter
        public Parcelable saveState() {
            return (Parcelable) null;
        }

        public PagerAdapter(orehitopage orehitopageVar) {
            this.this$0 = orehitopageVar;
        }
    }

    public orehitopage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewPager viewPager = (ViewPager) findViewById(setResource("orehito_vp", gzd.COLUMN_ID));
        viewPager.setAdapter(new PagerAdapter(this));
        viewPager.setPageTransformer(true, new TossTransformation());
        viewPager.setOffscreenPageLimit(4);
    }

    public int setResource(String str, String str2) {
        return getContext().getResources().getIdentifier(str, str2, getContext().getPackageName());
    }

    /* JADX INFO: renamed from: orehito.view.page.orehitopage$100000000, reason: invalid class name */
    class AnonymousClass100000000 implements Runnable {
        private final orehitopage this$0;

        AnonymousClass100000000(orehitopage orehitopageVar) {
            this.this$0 = orehitopageVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.this$0.getContext());
            this.this$0.start = defaultSharedPreferences.getBoolean("ruls", true);
            if (this.this$0.start) {
                this.this$0.setShowViewPager(true);
            }
        }
    }
}
