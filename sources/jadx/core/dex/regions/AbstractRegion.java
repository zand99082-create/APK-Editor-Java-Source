package jadx.core.dex.regions;

import jadx.core.dex.attributes.AttrNode;
import jadx.core.dex.nodes.IContainer;
import jadx.core.dex.nodes.IRegion;
import org.p117d.C1799c;
import org.p117d.InterfaceC1790b;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRegion extends AttrNode implements IRegion {
    private static final InterfaceC1790b LOG = C1799c.m4223a(AbstractRegion.class);
    private IRegion parent;

    public AbstractRegion(IRegion iRegion) {
        this.parent = iRegion;
    }

    @Override // jadx.core.dex.nodes.IRegion
    public IRegion getParent() {
        return this.parent;
    }

    @Override // jadx.core.dex.nodes.IRegion
    public boolean replaceSubBlock(IContainer iContainer, IContainer iContainer2) {
        LOG.mo4203c("Replace sub block not supported for class \"{}\"", getClass());
        return false;
    }

    public void setParent(IRegion iRegion) {
        this.parent = iRegion;
    }
}
