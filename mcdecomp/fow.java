/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  javax.annotation.Nullable
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fow
implements aky {
    private static final fkf e = fkf.m(new acq("textures/misc/shadow.png"));
    private static final float f = 32.0f;
    private static final float g = 0.5f;
    private Map<bfn<?>, fox<?>> h = ImmutableMap.of();
    private Map<String, fox<? extends byo>> i = ImmutableMap.of();
    public final fuw a;
    private cmm j;
    public emz b;
    private Quaternionf k;
    public bfj c;
    private final fpw l;
    private final fko m;
    private final fjt n;
    private final eov o;
    public final enr d;
    private final fea p;
    private boolean q = true;
    private boolean r;

    public <E extends bfj> int a(E $$0, float $$1) {
        return this.a($$0).b($$0, $$1);
    }

    public fow(enn $$0, fuw $$1, fpw $$2, fko $$3, eov $$4, enr $$5, fea $$6) {
        this.a = $$1;
        this.l = $$2;
        this.n = new fjt($$0, this, $$2);
        this.m = $$3;
        this.o = $$4;
        this.d = $$5;
        this.p = $$6;
    }

    public <T extends bfj> fox<? super T> a(T $$0) {
        if ($$0 instanceof fiv) {
            String $$1 = ((fiv)$$0).j();
            fox<? extends byo> $$2 = this.i.get($$1);
            if ($$2 != null) {
                return $$2;
            }
            return this.i.get("default");
        }
        return this.h.get($$0.ae());
    }

    public void a(cmm $$0, emz $$1, bfj $$2) {
        this.j = $$0;
        this.b = $$1;
        this.k = $$1.f();
        this.c = $$2;
    }

    public void a(Quaternionf $$0) {
        this.k = $$0;
    }

    public void a(boolean $$0) {
        this.q = $$0;
    }

    public void b(boolean $$0) {
        this.r = $$0;
    }

    public boolean a() {
        return this.r;
    }

    public <E extends bfj> boolean a(E $$0, fmw $$1, double $$2, double $$3, double $$4) {
        fox<E> $$5 = this.a($$0);
        return $$5.a($$0, $$1, $$2, $$3, $$4);
    }

    public <E extends bfj> void a(E $$0, double $$1, double $$2, double $$3, float $$4, float $$5, eij $$6, fjx $$7, int $$8) {
        fox<E> $$9 = this.a($$0);
        try {
            double $$14;
            float $$15;
            eei $$10 = $$9.a($$0, $$5);
            double $$11 = $$1 + $$10.a();
            double $$12 = $$2 + $$10.b();
            double $$13 = $$3 + $$10.c();
            $$6.a();
            $$6.a($$11, $$12, $$13);
            $$9.a($$0, $$4, $$5, $$6, $$7, $$8);
            if ($$0.cs()) {
                this.a($$6, $$7, $$0);
            }
            $$6.a(-$$10.a(), -$$10.b(), -$$10.c());
            if (this.d.K().c().booleanValue() && this.q && $$9.d > 0.0f && !$$0.cb() && ($$15 = (float)((1.0 - ($$14 = this.a($$0.dn(), $$0.dp(), $$0.dt())) / 256.0) * (double)$$9.e)) > 0.0f) {
                fow.a($$6, $$7, $$0, $$15, $$5, this.j, Math.min($$9.d, 32.0f));
            }
            if (this.r && !$$0.cb() && !enn.N().ay()) {
                fow.a($$6, $$7.getBuffer(fkf.x()), $$0, $$5);
            }
            $$6.b();
        }
        catch (Throwable $$16) {
            o $$17 = o.a($$16, "Rendering entity in world");
            p $$18 = $$17.a("Entity being rendered");
            $$0.a($$18);
            p $$19 = $$17.a("Renderer details");
            $$19.a("Assigned renderer", $$9);
            $$19.a("Location", p.a((cmo)this.j, $$1, $$2, $$3));
            $$19.a("Rotation", Float.valueOf($$4));
            $$19.a("Delta", Float.valueOf($$5));
            throw new y($$17);
        }
    }

    private static void a(eij $$0, ein $$1, bfj $$2, float $$3) {
        eed $$4 = $$2.cE().d(-$$2.dn(), -$$2.dp(), -$$2.dt());
        fjv.a($$0, $$1, $$4, 1.0f, 1.0f, 1.0f, 1.0f);
        if ($$2 instanceof bub) {
            double $$5 = -apa.d((double)$$3, $$2.ab, $$2.dn());
            double $$6 = -apa.d((double)$$3, $$2.ac, $$2.dp());
            double $$7 = -apa.d((double)$$3, $$2.ad, $$2.dt());
            for (btz $$8 : ((bub)$$2).fV()) {
                $$0.a();
                double $$9 = $$5 + apa.d((double)$$3, $$8.ab, $$8.dn());
                double $$10 = $$6 + apa.d((double)$$3, $$8.ac, $$8.dp());
                double $$11 = $$7 + apa.d((double)$$3, $$8.ad, $$8.dt());
                $$0.a($$9, $$10, $$11);
                fjv.a($$0, $$1, $$8.cE().d(-$$8.dn(), -$$8.dp(), -$$8.dt()), 0.25f, 1.0f, 0.0f, 1.0f);
                $$0.b();
            }
        }
        if ($$2 instanceof bfz) {
            float $$12 = 0.01f;
            fjv.a($$0, $$1, $$4.a, (double)($$2.cF() - 0.01f), $$4.c, $$4.d, (double)($$2.cF() + 0.01f), $$4.f, 1.0f, 0.0f, 0.0f, 1.0f);
        }
        eei $$13 = $$2.f($$3);
        Matrix4f $$14 = $$0.c().a();
        Matrix3f $$15 = $$0.c().b();
        $$1.a($$14, 0.0f, $$2.cF(), 0.0f).a(0, 0, 255, 255).a($$15, (float)$$13.c, (float)$$13.d, (float)$$13.e).e();
        $$1.a($$14, (float)($$13.c * 2.0), (float)((double)$$2.cF() + $$13.d * 2.0), (float)($$13.e * 2.0)).a(0, 0, 255, 255).a($$15, (float)$$13.c, (float)$$13.d, (float)$$13.e).e();
    }

    private void a(eij $$0, fjx $$1, bfj $$2) {
        fuv $$3 = fww.a.c();
        fuv $$4 = fww.b.c();
        $$0.a();
        float $$5 = $$2.dd() * 1.4f;
        $$0.b($$5, $$5, $$5);
        float $$6 = 0.5f;
        float $$7 = 0.0f;
        float $$8 = $$2.de() / $$5;
        float $$9 = 0.0f;
        $$0.a(a.d.rotationDegrees(-this.b.e()));
        $$0.a(0.0f, 0.0f, -0.3f + (float)((int)$$8) * 0.02f);
        float $$10 = 0.0f;
        int $$11 = 0;
        ein $$12 = $$1.getBuffer(fkj.j());
        eij.a $$13 = $$0.c();
        while ($$8 > 0.0f) {
            fuv $$14 = $$11 % 2 == 0 ? $$3 : $$4;
            float $$15 = $$14.c();
            float $$16 = $$14.g();
            float $$17 = $$14.d();
            float $$18 = $$14.h();
            if ($$11 / 2 % 2 == 0) {
                float $$19 = $$17;
                $$17 = $$15;
                $$15 = $$19;
            }
            fow.a($$13, $$12, $$6 - 0.0f, 0.0f - $$9, $$10, $$17, $$18);
            fow.a($$13, $$12, -$$6 - 0.0f, 0.0f - $$9, $$10, $$15, $$18);
            fow.a($$13, $$12, -$$6 - 0.0f, 1.4f - $$9, $$10, $$15, $$16);
            fow.a($$13, $$12, $$6 - 0.0f, 1.4f - $$9, $$10, $$17, $$16);
            $$8 -= 0.45f;
            $$9 -= 0.45f;
            $$6 *= 0.9f;
            $$10 += 0.03f;
            ++$$11;
        }
        $$0.b();
    }

    private static void a(eij.a $$0, ein $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
        $$1.a($$0.a(), $$2, $$3, $$4).a(255, 255, 255, 255).a($$5, $$6).a(0, 10).b(240).a($$0.b(), 0.0f, 1.0f, 0.0f).e();
    }

    private static void a(eij $$0, fjx $$1, bfj $$2, float $$3, float $$4, cmp $$5, float $$6) {
        bgb $$8;
        float $$7 = $$6;
        if ($$2 instanceof bgb && ($$8 = (bgb)$$2).h_()) {
            $$7 *= 0.5f;
        }
        double $$9 = apa.d((double)$$4, $$2.ab, $$2.dn());
        double $$10 = apa.d((double)$$4, $$2.ac, $$2.dp());
        double $$11 = apa.d((double)$$4, $$2.ad, $$2.dt());
        float $$12 = Math.min($$3 / 0.5f, $$7);
        int $$13 = apa.a($$9 - (double)$$7);
        int $$14 = apa.a($$9 + (double)$$7);
        int $$15 = apa.a($$10 - (double)$$12);
        int $$16 = apa.a($$10);
        int $$17 = apa.a($$11 - (double)$$7);
        int $$18 = apa.a($$11 + (double)$$7);
        eij.a $$19 = $$0.c();
        ein $$20 = $$1.getBuffer(e);
        gu.a $$21 = new gu.a();
        for (int $$22 = $$17; $$22 <= $$18; ++$$22) {
            for (int $$23 = $$13; $$23 <= $$14; ++$$23) {
                $$21.d($$23, 0, $$22);
                ddx $$24 = $$5.x($$21);
                for (int $$25 = $$15; $$25 <= $$16; ++$$25) {
                    $$21.q($$25);
                    float $$26 = $$3 - (float)($$10 - (double)$$21.v()) * 0.5f;
                    fow.a($$19, $$20, $$24, $$5, $$21, $$9, $$10, $$11, $$7, $$26);
                }
            }
        }
    }

    private static void a(eij.a $$0, ein $$1, ddx $$2, cmp $$3, gu $$4, double $$5, double $$6, double $$7, float $$8, float $$9) {
        gu $$10 = $$4.d();
        dcb $$11 = $$2.a_($$10);
        if ($$11.l() == cvs.a || $$3.z($$4) <= 3) {
            return;
        }
        if (!$$11.r($$2, $$10)) {
            return;
        }
        efb $$12 = $$11.j($$2, $$10);
        if ($$12.b()) {
            return;
        }
        float $$13 = fjw.a($$3.x_(), $$3.z($$4));
        float $$14 = $$9 * 0.5f * $$13;
        if ($$14 >= 0.0f) {
            if ($$14 > 1.0f) {
                $$14 = 1.0f;
            }
            eed $$15 = $$12.a();
            double $$16 = (double)$$4.u() + $$15.a;
            double $$17 = (double)$$4.u() + $$15.d;
            double $$18 = (double)$$4.v() + $$15.b;
            double $$19 = (double)$$4.w() + $$15.c;
            double $$20 = (double)$$4.w() + $$15.f;
            float $$21 = (float)($$16 - $$5);
            float $$22 = (float)($$17 - $$5);
            float $$23 = (float)($$18 - $$6);
            float $$24 = (float)($$19 - $$7);
            float $$25 = (float)($$20 - $$7);
            float $$26 = -$$21 / 2.0f / $$8 + 0.5f;
            float $$27 = -$$22 / 2.0f / $$8 + 0.5f;
            float $$28 = -$$24 / 2.0f / $$8 + 0.5f;
            float $$29 = -$$25 / 2.0f / $$8 + 0.5f;
            fow.a($$0, $$1, $$14, $$21, $$23, $$24, $$26, $$28);
            fow.a($$0, $$1, $$14, $$21, $$23, $$25, $$26, $$29);
            fow.a($$0, $$1, $$14, $$22, $$23, $$25, $$27, $$29);
            fow.a($$0, $$1, $$14, $$22, $$23, $$24, $$27, $$28);
        }
    }

    private static void a(eij.a $$0, ein $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
        Vector3f $$8 = $$0.a().transformPosition($$3, $$4, $$5, new Vector3f());
        $$1.a($$8.x(), $$8.y(), $$8.z(), 1.0f, 1.0f, 1.0f, $$2, $$6, $$7, fum.d, 0xF000F0, 0.0f, 1.0f, 0.0f);
    }

    public void a(@Nullable cmm $$0) {
        this.j = $$0;
        if ($$0 == null) {
            this.b = null;
        }
    }

    public double b(bfj $$0) {
        return this.b.b().g($$0.dg());
    }

    public double a(double $$0, double $$1, double $$2) {
        return this.b.b().c($$0, $$1, $$2);
    }

    public Quaternionf b() {
        return this.k;
    }

    public fjt d() {
        return this.n;
    }

    @Override
    public void a(akx $$0) {
        foy.a $$1 = new foy.a(this, this.l, this.m, this.n, $$0, this.p, this.o);
        this.h = foz.a($$1);
        this.i = foz.b($$1);
    }
}

