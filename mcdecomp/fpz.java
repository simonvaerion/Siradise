/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fpz<T extends bfz, M extends fbf<T>>
extends fox<T>
implements fqt<T, M> {
    private static final Logger a = LogUtils.getLogger();
    private static final float h = 0.1f;
    protected M f;
    protected final List<ftg<T, M>> g = Lists.newArrayList();

    public fpz(foy.a $$0, M $$1, float $$2) {
        super($$0);
        this.f = $$1;
        this.d = $$2;
    }

    protected final boolean a(ftg<T, M> $$0) {
        return this.g.add($$0);
    }

    @Override
    public M a() {
        return this.f;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        ha $$12;
        $$3.a();
        ((fbf)this.f).c = this.d($$0, $$2);
        ((fbf)this.f).d = ((bfj)$$0).bM();
        ((fbf)this.f).e = ((bfz)$$0).h_();
        float $$6 = apa.j($$2, ((bfz)$$0).aW, ((bfz)$$0).aV);
        float $$7 = apa.j($$2, ((bfz)$$0).aY, ((bfz)$$0).aX);
        float $$8 = $$7 - $$6;
        if (((bfj)$$0).bM() && ((bfj)$$0).cW() instanceof bfz) {
            bfz $$9 = (bfz)((bfj)$$0).cW();
            $$6 = apa.j($$2, $$9.aW, $$9.aV);
            $$8 = $$7 - $$6;
            float $$10 = apa.g($$8);
            if ($$10 < -85.0f) {
                $$10 = -85.0f;
            }
            if ($$10 >= 85.0f) {
                $$10 = 85.0f;
            }
            $$6 = $$7 - $$10;
            if ($$10 * $$10 > 2500.0f) {
                $$6 += $$10 * 0.2f;
            }
            $$8 = $$7 - $$6;
        }
        float $$11 = apa.i($$2, ((bfz)$$0).N, ((bfj)$$0).dA());
        if (fpz.e($$0)) {
            $$11 *= -1.0f;
            $$8 *= -1.0f;
        }
        if (((bfj)$$0).c(bgl.c) && ($$12 = ((bfz)$$0).fA()) != null) {
            float $$13 = ((bfj)$$0).f(bgl.a) - 0.1f;
            $$3.a((float)(-$$12.j()) * $$13, 0.0f, (float)(-$$12.l()) * $$13);
        }
        float $$14 = this.a($$0, $$2);
        this.a($$0, $$3, $$14, $$6, $$2);
        $$3.b(-1.0f, -1.0f, 1.0f);
        this.a($$0, $$3, $$2);
        $$3.a(0.0f, -1.501f, 0.0f);
        float $$15 = 0.0f;
        float $$16 = 0.0f;
        if (!((bfj)$$0).bM() && ((bfz)$$0).bs()) {
            $$15 = ((bfz)$$0).aR.b($$2);
            $$16 = ((bfz)$$0).aR.c($$2);
            if (((bfz)$$0).h_()) {
                $$16 *= 3.0f;
            }
            if ($$15 > 1.0f) {
                $$15 = 1.0f;
            }
        }
        ((fbf)this.f).a($$0, $$16, $$15, $$2);
        ((fbf)this.f).a($$0, $$16, $$15, $$14, $$8, $$11);
        enn $$17 = enn.N();
        boolean $$18 = this.d($$0);
        boolean $$19 = !$$18 && !((bfj)$$0).d($$17.t);
        boolean $$20 = $$17.b((bfj)$$0);
        fkf $$21 = this.a($$0, $$18, $$19, $$20);
        if ($$21 != null) {
            ein $$22 = $$4.getBuffer($$21);
            int $$23 = fpz.c($$0, this.b($$0, $$2));
            ((fcb)this.f).a($$3, $$22, $$5, $$23, 1.0f, 1.0f, 1.0f, $$19 ? 0.15f : 1.0f);
        }
        if (!((bfj)$$0).G_()) {
            for (ftg<T, M> $$24 : this.g) {
                $$24.a($$3, $$4, $$5, $$0, $$16, $$15, $$2, $$14, $$8, $$11);
            }
        }
        $$3.b();
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Nullable
    protected fkf a(T $$0, boolean $$1, boolean $$2, boolean $$3) {
        acq $$4 = this.a($$0);
        if ($$2) {
            return fkf.f($$4);
        }
        if ($$1) {
            return ((fcb)this.f).a($$4);
        }
        if ($$3) {
            return fkf.p($$4);
        }
        return null;
    }

    public static int c(bfz $$0, float $$1) {
        return fum.a(fum.a($$1), fum.a($$0.aL > 0 || $$0.aN > 0));
    }

    protected boolean d(T $$0) {
        return !((bfj)$$0).cb();
    }

    private static float a(ha $$0) {
        switch ($$0) {
            case d: {
                return 90.0f;
            }
            case e: {
                return 0.0f;
            }
            case c: {
                return 270.0f;
            }
            case f: {
                return 180.0f;
            }
        }
        return 0.0f;
    }

    protected boolean a(T $$0) {
        return ((bfj)$$0).ci();
    }

    protected void a(T $$0, eij $$1, float $$2, float $$3, float $$4) {
        if (this.a($$0)) {
            $$3 += (float)(Math.cos((double)((bfz)$$0).ag * 3.25) * Math.PI * (double)0.4f);
        }
        if (!((bfj)$$0).c(bgl.c)) {
            $$1.a(a.d.rotationDegrees(180.0f - $$3));
        }
        if (((bfz)$$0).aN > 0) {
            float $$5 = ((float)((bfz)$$0).aN + $$4 - 1.0f) / 20.0f * 1.6f;
            if (($$5 = apa.c($$5)) > 1.0f) {
                $$5 = 1.0f;
            }
            $$1.a(a.f.rotationDegrees($$5 * this.c($$0)));
        } else if (((bfz)$$0).fe()) {
            $$1.a(a.b.rotationDegrees(-90.0f - ((bfj)$$0).dA()));
            $$1.a(a.d.rotationDegrees(((float)((bfz)$$0).ag + $$4) * -75.0f));
        } else if (((bfj)$$0).c(bgl.c)) {
            ha $$6 = ((bfz)$$0).fA();
            float $$7 = $$6 != null ? fpz.a($$6) : $$3;
            $$1.a(a.d.rotationDegrees($$7));
            $$1.a(a.f.rotationDegrees(this.c($$0)));
            $$1.a(a.d.rotationDegrees(270.0f));
        } else if (fpz.e($$0)) {
            $$1.a(0.0f, ((bfj)$$0).de() + 0.1f, 0.0f);
            $$1.a(a.f.rotationDegrees(180.0f));
        }
    }

    protected float d(T $$0, float $$1) {
        return ((bfz)$$0).x($$1);
    }

    protected float a(T $$0, float $$1) {
        return (float)((bfz)$$0).ag + $$1;
    }

    protected float c(T $$0) {
        return 90.0f;
    }

    protected float b(T $$0, float $$1) {
        return 0.0f;
    }

    protected void a(T $$0, eij $$1, float $$2) {
    }

    @Override
    protected boolean b(T $$0) {
        boolean $$5;
        float $$2;
        double $$1 = this.c.b((bfj)$$0);
        float f2 = $$2 = ((bfj)$$0).bS() ? 32.0f : 64.0f;
        if ($$1 >= (double)($$2 * $$2)) {
            return false;
        }
        enn $$3 = enn.N();
        fiy $$4 = $$3.t;
        boolean bl2 = $$5 = !((bfj)$$0).d($$4);
        if ($$0 != $$4) {
            efi $$6 = ((bfj)$$0).cd();
            efi $$7 = $$4.cd();
            if ($$6 != null) {
                efi.b $$8 = $$6.j();
                switch ($$8) {
                    case a: {
                        return $$5;
                    }
                    case b: {
                        return false;
                    }
                    case c: {
                        return $$7 == null ? $$5 : $$6.a($$7) && ($$6.i() || $$5);
                    }
                    case d: {
                        return $$7 == null ? $$5 : !$$6.a($$7) && $$5;
                    }
                }
                return true;
            }
        }
        return enn.J() && $$0 != $$3.al() && $$5 && !((bfj)$$0).bN();
    }

    public static boolean e(bfz $$0) {
        String $$1;
        if (($$0 instanceof byo || $$0.aa()) && ("Dinnerbone".equals($$1 = n.a($$0.Z().getString())) || "Grumm".equals($$1))) {
            return !($$0 instanceof byo) || ((byo)$$0).a(byp.a);
        }
        return false;
    }
}

