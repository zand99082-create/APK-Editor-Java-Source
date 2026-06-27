package com.masrull.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class ChatListView extends ListView {
    private final JazzyHelper mHelper;

    public ChatListView(Context context) {
        super(context);
        this.mHelper = init(context, (AttributeSet) null);
        init();
    }

    public ChatListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHelper = init(context, attributeSet);
        init();
    }

    public ChatListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHelper = init(context, attributeSet);
        init();
    }

    public static int chatsListAnimation() {
        return Integer.parseInt(Prefs.getString("key_chat_animation", "0"));
    }

    private JazzyHelper init(Context context, AttributeSet attributeSet) {
        JazzyHelper jazzyHelper = new JazzyHelper(context, attributeSet);
        super.setOnScrollListener(jazzyHelper);
        return jazzyHelper;
    }

    void init() {
        try {
            if (chatsListAnimation() != 0) {
                setTransitionEffect(chatsListAnimation());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setMaxAnimationVelocity(int i) {
        this.mHelper.setMaxAnimationVelocity(i);
    }

    @Override // android.widget.AbsListView
    public final void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.mHelper.setOnScrollListener(onScrollListener);
    }

    public void setShouldOnlyAnimateFling(boolean z) {
        this.mHelper.setShouldOnlyAnimateFling(z);
    }

    public void setShouldOnlyAnimateNewItems(boolean z) {
        this.mHelper.setShouldOnlyAnimateNewItems(z);
    }

    public void setSimulateGridWithList(boolean z) {
        this.mHelper.setSimulateGridWithList(z);
        setClipChildren(!z);
    }

    public void setTransitionEffect(int i) {
        this.mHelper.setTransitionEffect(i);
    }

    public void setTransitionEffect(JazzyEffect jazzyEffect) {
        this.mHelper.setTransitionEffect(jazzyEffect);
    }
}
