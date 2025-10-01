/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

public class bnp<T extends bzw>
extends bmv {
    private static final int a = 20;
    private static final float b = 1.0f;
    private final T c;
    private int d;

    public bnp(T $$0) {
        this.c = $$0;
        this.a(EnumSet.of(bmv.a.a));
    }

    @Override
    public boolean a() {
        return ((bgb)this.c).j() == null && !((bfj)this.c).bN() && ((bzw)this.c).gn() && !((bzw)this.c).gm().a() && !((aif)((bfj)this.c).dI()).b(((bfj)this.c).di());
    }

    @Override
    public boolean b() {
        return ((bzw)this.c).gn() && !((bzw)this.c).gm().a() && ((bfj)this.c).dI() instanceof aif && !((aif)((bfj)this.c).dI()).b(((bfj)this.c).di());
    }

    @Override
    public void e() {
        if (((bzw)this.c).gn()) {
            eei $$1;
            bzv $$0 = ((bzw)this.c).gm();
            if (((bzw)this.c).ag > this.d) {
                this.d = ((bzw)this.c).ag + 20;
                this.a($$0);
            }
            if (!((bgi)this.c).fV() && ($$1 = bqq.a(this.c, 15, 4, eei.c($$0.t()), 1.5707963705062866)) != null) {
                ((bgb)this.c).J().a($$1.c, $$1.d, $$1.e, 1.0);
            }
        }
    }

    private void a(bzv $$0) {
        if ($$0.v()) {
            HashSet $$12 = Sets.newHashSet();
            List<bzw> $$2 = ((bfj)this.c).dI().a(bzw.class, ((bfj)this.c).cE().g(16.0), $$1 -> !$$1.gn() && bzx.a($$1, $$0));
            $$12.addAll($$2);
            for (bzw $$3 : $$12) {
                $$0.a($$0.k(), $$3, null, true);
            }
        }
    }
}

