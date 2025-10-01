/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bim
extends bhr<byb> {
    private static final int d = 200;
    public static final float c = 0.5f;
    @Nullable
    private gu e;
    private long f;
    private int g;
    private final List<gu> h = Lists.newArrayList();

    public bim() {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.n, (Object)((Object)bpc.b), bpb.m, (Object)((Object)bpc.b), bpb.f, (Object)((Object)bpc.a)));
    }

    @Override
    protected boolean a(aif $$0, byb $$1) {
        if (!$$0.X().b(cmi.c)) {
            return false;
        }
        if ($$1.gj().b() != bye.g) {
            return false;
        }
        gu.a $$2 = $$1.di().j();
        this.h.clear();
        for (int $$3 = -1; $$3 <= 1; ++$$3) {
            for (int $$4 = -1; $$4 <= 1; ++$$4) {
                for (int $$5 = -1; $$5 <= 1; ++$$5) {
                    $$2.b($$1.dn() + (double)$$3, $$1.dp() + (double)$$4, $$1.dt() + (double)$$5);
                    if (!this.a($$2, $$0)) continue;
                    this.h.add(new gu($$2));
                }
            }
        }
        this.e = this.a($$0);
        return this.e != null;
    }

    @Nullable
    private gu a(aif $$0) {
        return this.h.isEmpty() ? null : this.h.get($$0.y_().a(this.h.size()));
    }

    private boolean a(gu $$0, aif $$1) {
        dcb $$2 = $$1.a_($$0);
        cpn $$3 = $$2.b();
        cpn $$4 = $$1.a_($$0.d()).b();
        return $$3 instanceof cre && ((cre)$$3).h($$2) || $$2.i() && $$4 instanceof csg;
    }

    protected void a(aif $$0, byb $$1, long $$2) {
        if ($$2 > this.f && this.e != null) {
            $$1.dK().a(bpb.n, new bhu(this.e));
            $$1.dK().a(bpb.m, new bpe(new bhu(this.e), 0.5f, 1));
        }
    }

    @Override
    protected void b(aif $$0, byb $$1, long $$2) {
        $$1.dK().b(bpb.n);
        $$1.dK().b(bpb.m);
        this.g = 0;
        this.f = $$2 + 40L;
    }

    @Override
    protected void c(aif $$0, byb $$1, long $$2) {
        if (this.e != null && !this.e.a($$1.dg(), 1.0)) {
            return;
        }
        if (this.e != null && $$2 > this.f) {
            dcb $$3 = $$0.a_(this.e);
            cpn $$4 = $$3.b();
            cpn $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof cre && ((cre)$$4).h($$3)) {
                $$0.a(this.e, true, $$1);
            }
            if ($$3.i() && $$5 instanceof csg && $$1.gs()) {
                bee $$6 = $$1.w();
                for (int $$7 = 0; $$7 < $$6.b(); ++$$7) {
                    cfu cfu2;
                    cfz $$8 = $$6.a($$7);
                    boolean $$9 = false;
                    if (!$$8.b() && $$8.a(ane.aU) && (cfu2 = $$8.d()) instanceof cds) {
                        cds $$10 = (cds)cfu2;
                        dcb $$11 = $$10.e().n();
                        $$0.b(this.e, $$11);
                        $$0.a(dgl.i, this.e, dgl.a.a($$1, $$11));
                        $$9 = true;
                    }
                    if (!$$9) continue;
                    $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), amh.fi, ami.e, 1.0f, 1.0f);
                    $$8.h(1);
                    if (!$$8.b()) break;
                    $$6.a($$7, cfz.b);
                    break;
                }
            }
            if ($$4 instanceof cre && !((cre)$$4).h($$3)) {
                this.h.remove(this.e);
                this.e = this.a($$0);
                if (this.e != null) {
                    this.f = $$2 + 20L;
                    $$1.dK().a(bpb.m, new bpe(new bhu(this.e), 0.5f, 1));
                    $$1.dK().a(bpb.n, new bhu(this.e));
                }
            }
        }
        ++this.g;
    }

    protected boolean d(aif $$0, byb $$1, long $$2) {
        return this.g < 200;
    }

    @Override
    protected /* synthetic */ boolean a(aif aif2, bfz bfz2, long l2) {
        return this.d(aif2, (byb)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.a(aif2, (byb)bfz2, l2);
    }
}

