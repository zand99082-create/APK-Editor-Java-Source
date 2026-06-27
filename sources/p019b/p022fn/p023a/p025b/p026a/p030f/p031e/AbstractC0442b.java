package p019b.p022fn.p023a.p025b.p026a.p030f.p031e;

import java.util.Map;
import p019b.p022fn.p023a.p025b.p026a.p030f.AbstractC0439c;

/* JADX INFO: renamed from: b.fn.a.b.a.f.e.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0442b extends AbstractC0439c {

    /* JADX INFO: renamed from: d */
    private String f519d;

    public AbstractC0442b(Map<String, String> map) {
        super(map);
        this.f519d = map.get("configForSplit");
    }

    /* JADX INFO: renamed from: d */
    public boolean m438d() {
        String str = this.f519d;
        return (str == null || str.equals("")) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public String m439e() {
        return this.f519d;
    }
}
