/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cwn
extends cpa
implements cwo {
    public static final dcs e = dcr.C;
    protected static final float f = 4.0f;
    protected static final efb g = cpn.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
    private final ddo a;

    protected cwn(dca.d $$0, ddo $$1) {
        super($$0);
        this.a = $$1;
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(e).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return g;
    }

    @Override
    public boolean a(dcb $$0) {
        return true;
    }

    @Override
    public czn a(gu $$0, dcb $$1) {
        return new dav($$0, $$1);
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        cgy $$8;
        cfz $$6 = $$3.b($$4);
        cfu $$7 = $$6.d();
        cfu cfu2 = $$6.d();
        cgy $$9 = cfu2 instanceof cgy ? ($$8 = (cgy)((Object)cfu2)) : null;
        boolean $$10 = $$9 != null && $$3.fZ();
        czn czn2 = $$1.c_($$2);
        if (czn2 instanceof dav) {
            dav $$11 = (dav)czn2;
            if ($$1.B) {
                return $$10 || $$11.w() ? bdx.a : bdx.b;
            }
            boolean $$12 = $$11.a($$3);
            daw $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.w()) {
                $$1.a(null, $$11.p(), amh.zJ, ami.e);
                return bdx.d;
            }
            if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
                if (!$$3.f()) {
                    $$6.h(1);
                }
                $$1.a(dgl.c, $$11.p(), dgl.a.a($$3, $$11.q()));
                $$3.b(amr.c.b($$7));
                return bdx.a;
            }
            if ($$14) {
                return bdx.a;
            }
            if (!this.a($$3, $$11) && $$3.fZ() && this.b($$3, $$11, $$12)) {
                this.a($$3, $$11, $$12);
                return bdx.a;
            }
            return bdx.d;
        }
        return bdx.d;
    }

    private boolean b(byo $$02, dav $$1, boolean $$2) {
        daw $$3 = $$1.a($$2);
        return Arrays.stream($$3.b($$02.U())).allMatch($$0 -> $$0.equals(sv.a) || $$0.b() instanceof ub);
    }

    public abstract float g(dcb var1);

    public eei h(dcb $$0) {
        return new eei(0.5, 0.5, 0.5);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(e).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    public ddo c() {
        return this.a;
    }

    public static ddo a(cpn $$0) {
        ddo $$2;
        if ($$0 instanceof cwn) {
            ddo $$1 = ((cwn)$$0).c();
        } else {
            $$2 = ddo.a;
        }
        return $$2;
    }

    public void a(byo $$0, dav $$1, boolean $$2) {
        $$1.a($$0.ct());
        $$0.a($$1, $$2);
    }

    private boolean a(byo $$0, dav $$1) {
        UUID $$2 = $$1.v();
        return $$2 != null && !$$2.equals($$0.ct());
    }

    @Override
    @Nullable
    public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
        return cwn.a($$2, czp.h, dav::a);
    }
}

