/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class coa {
    private static final float h = 0.05f;
    private static final float i = 0.26666668f;
    public static final float a = 0.4f;
    private static final float j = 0.93333334f;
    private static final float k = 0.1f;
    public static final float b = 0.56666666f;
    private static final float l = 0.7666667f;
    public static final float c = -0.11f;
    public static final float d = 0.03f;
    public static final float e = 0.3f;
    public static final float f = -0.78f;
    public static final float g = -0.375f;
    private static final float m = -0.225f;
    private static final float n = 0.9f;
    private final cnt.b o = cnt.b.a(-1.0f, 1.0f);
    private final cnt.b[] p = new cnt.b[]{cnt.b.a(-1.0f, -0.45f), cnt.b.a(-0.45f, -0.15f), cnt.b.a(-0.15f, 0.2f), cnt.b.a(0.2f, 0.55f), cnt.b.a(0.55f, 1.0f)};
    private final cnt.b[] q = new cnt.b[]{cnt.b.a(-1.0f, -0.35f), cnt.b.a(-0.35f, -0.1f), cnt.b.a(-0.1f, 0.1f), cnt.b.a(0.1f, 0.3f), cnt.b.a(0.3f, 1.0f)};
    private final cnt.b[] r = new cnt.b[]{cnt.b.a(-1.0f, -0.78f), cnt.b.a(-0.78f, -0.375f), cnt.b.a(-0.375f, -0.2225f), cnt.b.a(-0.2225f, 0.05f), cnt.b.a(0.05f, 0.45f), cnt.b.a(0.45f, 0.55f), cnt.b.a(0.55f, 1.0f)};
    private final cnt.b s = this.p[0];
    private final cnt.b t = cnt.b.a(this.p[1], this.p[4]);
    private final cnt.b u = cnt.b.a(-1.2f, -1.05f);
    private final cnt.b v = cnt.b.a(-1.05f, -0.455f);
    private final cnt.b w = cnt.b.a(-0.455f, -0.19f);
    private final cnt.b x = cnt.b.a(-0.19f, -0.11f);
    private final cnt.b y = cnt.b.a(-0.11f, 0.55f);
    private final cnt.b z = cnt.b.a(-0.11f, 0.03f);
    private final cnt.b A = cnt.b.a(0.03f, 0.3f);
    private final cnt.b B = cnt.b.a(0.3f, 1.0f);
    private final acp<cnk>[][] C = new acp[][]{{cnr.X, cnr.V, cnr.T, cnr.R, cnr.P}, {cnr.W, cnr.U, cnr.S, cnr.Q, cnr.P}};
    private final acp<cnk>[][] D = new acp[][]{{cnr.d, cnr.d, cnr.d, cnr.q, cnr.p}, {cnr.b, cnr.b, cnr.i, cnr.p, cnr.o}, {cnr.j, cnr.b, cnr.i, cnr.k, cnr.l}, {cnr.r, cnr.r, cnr.i, cnr.x, cnr.x}, {cnr.f, cnr.f, cnr.f, cnr.f, cnr.f}};
    private final acp<cnk>[][] E = new acp[][]{{cnr.e, null, cnr.q, null, null}, {null, null, null, null, cnr.n}, {cnr.c, null, null, cnr.m, null}, {null, null, cnr.b, cnr.y, cnr.z}, {null, null, null, null, null}};
    private final acp<cnk>[][] F = new acp[][]{{cnr.d, cnr.d, cnr.d, cnr.q, cnr.q}, {cnr.D, cnr.D, cnr.i, cnr.p, cnr.o}, {cnr.D, cnr.D, cnr.D, cnr.D, cnr.l}, {cnr.s, cnr.s, cnr.i, cnr.i, cnr.x}, {cnr.A, cnr.A, cnr.A, cnr.C, cnr.C}};
    private final acp<cnk>[][] G = new acp[][]{{cnr.e, null, null, null, null}, {cnr.E, null, cnr.D, cnr.D, cnr.n}, {cnr.E, cnr.E, cnr.i, cnr.k, null}, {null, null, null, null, null}, {cnr.B, cnr.B, null, null, null}};
    private final acp<cnk>[][] H = new acp[][]{{cnr.u, cnr.u, cnr.t, cnr.v, cnr.v}, {cnr.u, cnr.u, cnr.t, cnr.v, cnr.v}, {cnr.t, cnr.t, cnr.t, cnr.v, cnr.v}, {null, null, null, null, null}, {null, null, null, null, null}};

    public List<cnt.d> a() {
        cnt.b $$0 = cnt.b.a(0.0f);
        float $$1 = 0.16f;
        return List.of(new cnt.d(this.o, this.o, cnt.b.a(this.y, this.o), this.o, $$0, cnt.b.a(-1.0f, -0.16f), 0L), new cnt.d(this.o, this.o, cnt.b.a(this.y, this.o), this.o, $$0, cnt.b.a(0.16f, 1.0f), 0L));
    }

    protected void a(Consumer<Pair<cnt.d, acp<cnk>>> $$0) {
        if (aa.ap) {
            this.b($$0);
            return;
        }
        this.c($$0);
        this.d($$0);
        this.e($$0);
    }

    private void b(Consumer<Pair<cnt.d, acp<cnk>>> $$0) {
        aod $$10;
        hg.b $$1 = me.a();
        hg.c<dhd> $$2 = $$1.b(jc.at);
        dhe.w.a $$3 = new dhe.w.a($$2.b(dhr.d));
        dhe.w.a $$4 = new dhe.w.a($$2.b(dhr.e));
        dhe.w.a $$5 = new dhe.w.a($$2.b(dhr.g));
        $$0.accept((Pair<cnt.d, acp<cnk>>)Pair.of((Object)cnt.a(this.o, this.o, this.o, this.o, cnt.b.a(0.0f), this.o, 0.01f), cnr.b));
        aod $$6 = ob.a($$4, $$5, -0.15f, 0.0f, 0.0f, 0.1f, 0.0f, -0.03f, false, false, apx.a);
        if ($$6 instanceof aod.e) {
            aod.e $$7 = (aod.e)$$6;
            acp<cnk> $$8 = cnr.f;
            for (float $$9 : $$7.e()) {
                $$0.accept((Pair<cnt.d, acp<cnk>>)Pair.of((Object)cnt.a(this.o, this.o, this.o, cnt.b.a($$9), cnt.b.a(0.0f), this.o, 0.0f), $$8));
                $$8 = $$8 == cnr.f ? cnr.A : cnr.f;
            }
        }
        if (($$10 = ob.a($$3, $$4, $$5, false)) instanceof aod.e) {
            aod.e $$11 = (aod.e)$$10;
            for (float $$12 : $$11.e()) {
                $$0.accept((Pair<cnt.d, acp<cnk>>)Pair.of((Object)cnt.a(this.o, this.o, cnt.b.a($$12), this.o, cnt.b.a(0.0f), this.o, 0.0f), cnr.q));
            }
        }
    }

    private void c(Consumer<Pair<cnt.d, acp<cnk>>> $$0) {
        this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0f, cnr.Y);
        for (int $$1 = 0; $$1 < this.p.length; ++$$1) {
            cnt.b $$2 = this.p[$$1];
            this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0f, this.C[0][$$1]);
            this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0f, this.C[1][$$1]);
        }
    }

    private void d(Consumer<Pair<cnt.d, acp<cnk>>> $$0) {
        this.c($$0, cnt.b.a(-1.0f, -0.93333334f));
        this.b($$0, cnt.b.a(-0.93333334f, -0.7666667f));
        this.a($$0, cnt.b.a(-0.7666667f, -0.56666666f));
        this.b($$0, cnt.b.a(-0.56666666f, -0.4f));
        this.c($$0, cnt.b.a(-0.4f, -0.26666668f));
        this.d($$0, cnt.b.a(-0.26666668f, -0.05f));
        this.e($$0, cnt.b.a(-0.05f, 0.05f));
        this.d($$0, cnt.b.a(0.05f, 0.26666668f));
        this.c($$0, cnt.b.a(0.26666668f, 0.4f));
        this.b($$0, cnt.b.a(0.4f, 0.56666666f));
        this.a($$0, cnt.b.a(0.56666666f, 0.7666667f));
        this.b($$0, cnt.b.a(0.7666667f, 0.93333334f));
        this.c($$0, cnt.b.a(0.93333334f, 1.0f));
    }

    private void a(Consumer<Pair<cnt.d, acp<cnk>>> $$0, cnt.b $$1) {
        for (int $$2 = 0; $$2 < this.p.length; ++$$2) {
            cnt.b $$3 = this.p[$$2];
            for (int $$4 = 0; $$4 < this.q.length; ++$$4) {
                cnt.b $$5 = this.q[$$4];
                acp<cnk> $$6 = this.a($$2, $$4, $$1);
                acp<cnk> $$7 = this.b($$2, $$4, $$1);
                acp<cnk> $$8 = this.c($$2, $$4, $$1);
                acp<cnk> $$9 = this.e($$2, $$4, $$1);
                acp<cnk> $$10 = this.h($$2, $$4, $$1);
                acp<cnk> $$11 = this.a($$2, $$4, $$1, $$10);
                acp<cnk> $$12 = this.f($$2, $$4, $$1);
                this.a($$0, $$3, $$5, cnt.b.a(this.x, this.B), this.r[0], $$1, 0.0f, $$12);
                this.a($$0, $$3, $$5, cnt.b.a(this.x, this.z), this.r[1], $$1, 0.0f, $$8);
                this.a($$0, $$3, $$5, cnt.b.a(this.A, this.B), this.r[1], $$1, 0.0f, $$12);
                this.a($$0, $$3, $$5, cnt.b.a(this.x, this.z), cnt.b.a(this.r[2], this.r[3]), $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, cnt.b.a(this.A, this.B), this.r[2], $$1, 0.0f, $$9);
                this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0f, $$7);
                this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0f, $$9);
                this.a($$0, $$3, $$5, cnt.b.a(this.x, this.B), this.r[4], $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, cnt.b.a(this.x, this.z), this.r[5], $$1, 0.0f, $$11);
                this.a($$0, $$3, $$5, cnt.b.a(this.A, this.B), this.r[5], $$1, 0.0f, $$10);
                this.a($$0, $$3, $$5, cnt.b.a(this.x, this.B), this.r[6], $$1, 0.0f, $$6);
            }
        }
    }

    private void b(Consumer<Pair<cnt.d, acp<cnk>>> $$0, cnt.b $$1) {
        for (int $$2 = 0; $$2 < this.p.length; ++$$2) {
            cnt.b $$3 = this.p[$$2];
            for (int $$4 = 0; $$4 < this.q.length; ++$$4) {
                cnt.b $$5 = this.q[$$4];
                acp<cnk> $$6 = this.a($$2, $$4, $$1);
                acp<cnk> $$7 = this.b($$2, $$4, $$1);
                acp<cnk> $$8 = this.c($$2, $$4, $$1);
                acp<cnk> $$9 = this.e($$2, $$4, $$1);
                acp<cnk> $$10 = this.h($$2, $$4, $$1);
                acp<cnk> $$11 = this.a($$2, $$4, $$1, $$6);
                acp<cnk> $$12 = this.g($$2, $$4, $$1);
                acp<cnk> $$13 = this.f($$2, $$4, $$1);
                this.a($$0, $$3, $$5, this.x, cnt.b.a(this.r[0], this.r[1]), $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0f, $$12);
                this.a($$0, $$3, $$5, cnt.b.a(this.A, this.B), this.r[0], $$1, 0.0f, $$13);
                this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0f, $$8);
                this.a($$0, $$3, $$5, cnt.b.a(this.A, this.B), this.r[1], $$1, 0.0f, $$12);
                this.a($$0, $$3, $$5, cnt.b.a(this.x, this.z), cnt.b.a(this.r[2], this.r[3]), $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, cnt.b.a(this.A, this.B), this.r[2], $$1, 0.0f, $$9);
                this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0f, $$7);
                this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0f, $$9);
                this.a($$0, $$3, $$5, cnt.b.a(this.x, this.B), this.r[4], $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, cnt.b.a(this.x, this.z), this.r[5], $$1, 0.0f, $$11);
                this.a($$0, $$3, $$5, cnt.b.a(this.A, this.B), this.r[5], $$1, 0.0f, $$10);
                this.a($$0, $$3, $$5, cnt.b.a(this.x, this.B), this.r[6], $$1, 0.0f, $$6);
            }
        }
    }

    private void c(Consumer<Pair<cnt.d, acp<cnk>>> $$0, cnt.b $$1) {
        this.a($$0, this.o, this.o, this.x, cnt.b.a(this.r[0], this.r[2]), $$1, 0.0f, cnr.O);
        this.a($$0, cnt.b.a(this.p[1], this.p[2]), this.o, cnt.b.a(this.z, this.B), this.r[6], $$1, 0.0f, cnr.g);
        this.a($$0, cnt.b.a(this.p[3], this.p[4]), this.o, cnt.b.a(this.z, this.B), this.r[6], $$1, 0.0f, cnr.h);
        for (int $$2 = 0; $$2 < this.p.length; ++$$2) {
            cnt.b $$3 = this.p[$$2];
            for (int $$4 = 0; $$4 < this.q.length; ++$$4) {
                cnt.b $$5 = this.q[$$4];
                acp<cnk> $$6 = this.a($$2, $$4, $$1);
                acp<cnk> $$7 = this.b($$2, $$4, $$1);
                acp<cnk> $$8 = this.c($$2, $$4, $$1);
                acp<cnk> $$9 = this.h($$2, $$4, $$1);
                acp<cnk> $$10 = this.e($$2, $$4, $$1);
                acp<cnk> $$11 = this.a($$2, $$4);
                acp<cnk> $$12 = this.a($$2, $$4, $$1, $$6);
                acp<cnk> $$13 = this.d($$2, $$4, $$1);
                acp<cnk> $$14 = this.g($$2, $$4, $$1);
                this.a($$0, $$3, $$5, cnt.b.a(this.z, this.B), this.r[0], $$1, 0.0f, $$14);
                this.a($$0, $$3, $$5, cnt.b.a(this.z, this.A), this.r[1], $$1, 0.0f, $$8);
                this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0f, $$2 == 0 ? $$14 : $$10);
                this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0f, $$7);
                this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0f, $$10);
                this.a($$0, $$3, $$5, cnt.b.a(this.x, this.z), this.r[3], $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, cnt.b.a(this.A, this.B), this.r[3], $$1, 0.0f, $$7);
                if ($$1.b() < 0L) {
                    this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0f, $$11);
                    this.a($$0, $$3, $$5, cnt.b.a(this.z, this.B), this.r[4], $$1, 0.0f, $$6);
                } else {
                    this.a($$0, $$3, $$5, cnt.b.a(this.x, this.B), this.r[4], $$1, 0.0f, $$6);
                }
                this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0f, $$13);
                this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0f, $$12);
                this.a($$0, $$3, $$5, cnt.b.a(this.A, this.B), this.r[5], $$1, 0.0f, $$9);
                if ($$1.b() < 0L) {
                    this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0f, $$11);
                } else {
                    this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0f, $$6);
                }
                if ($$2 != 0) continue;
                this.a($$0, $$3, $$5, cnt.b.a(this.z, this.B), this.r[6], $$1, 0.0f, $$6);
            }
        }
    }

    private void d(Consumer<Pair<cnt.d, acp<cnk>>> $$0, cnt.b $$1) {
        this.a($$0, this.o, this.o, this.x, cnt.b.a(this.r[0], this.r[2]), $$1, 0.0f, cnr.O);
        this.a($$0, cnt.b.a(this.p[1], this.p[2]), this.o, cnt.b.a(this.z, this.B), this.r[6], $$1, 0.0f, cnr.g);
        this.a($$0, cnt.b.a(this.p[3], this.p[4]), this.o, cnt.b.a(this.z, this.B), this.r[6], $$1, 0.0f, cnr.h);
        for (int $$2 = 0; $$2 < this.p.length; ++$$2) {
            cnt.b $$3 = this.p[$$2];
            for (int $$4 = 0; $$4 < this.q.length; ++$$4) {
                cnt.b $$5 = this.q[$$4];
                acp<cnk> $$6 = this.a($$2, $$4, $$1);
                acp<cnk> $$7 = this.b($$2, $$4, $$1);
                acp<cnk> $$8 = this.c($$2, $$4, $$1);
                acp<cnk> $$9 = this.a($$2, $$4);
                acp<cnk> $$10 = this.a($$2, $$4, $$1, $$6);
                acp<cnk> $$11 = this.d($$2, $$4, $$1);
                this.a($$0, $$3, $$5, this.z, cnt.b.a(this.r[0], this.r[1]), $$1, 0.0f, $$7);
                this.a($$0, $$3, $$5, cnt.b.a(this.A, this.B), cnt.b.a(this.r[0], this.r[1]), $$1, 0.0f, $$8);
                this.a($$0, $$3, $$5, this.z, cnt.b.a(this.r[2], this.r[3]), $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, cnt.b.a(this.A, this.B), cnt.b.a(this.r[2], this.r[3]), $$1, 0.0f, $$7);
                this.a($$0, $$3, $$5, this.x, cnt.b.a(this.r[3], this.r[4]), $$1, 0.0f, $$9);
                this.a($$0, $$3, $$5, cnt.b.a(this.z, this.B), this.r[4], $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0f, $$11);
                this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0f, $$10);
                this.a($$0, $$3, $$5, cnt.b.a(this.A, this.B), this.r[5], $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0f, $$9);
                if ($$2 != 0) continue;
                this.a($$0, $$3, $$5, cnt.b.a(this.z, this.B), this.r[6], $$1, 0.0f, $$6);
            }
        }
    }

    private void e(Consumer<Pair<cnt.d, acp<cnk>>> $$0, cnt.b $$1) {
        this.a($$0, this.s, this.o, this.x, cnt.b.a(this.r[0], this.r[1]), $$1, 0.0f, $$1.b() < 0L ? cnr.O : cnr.L);
        this.a($$0, this.t, this.o, this.x, cnt.b.a(this.r[0], this.r[1]), $$1, 0.0f, $$1.b() < 0L ? cnr.O : cnr.K);
        this.a($$0, this.s, this.o, this.z, cnt.b.a(this.r[0], this.r[1]), $$1, 0.0f, cnr.L);
        this.a($$0, this.t, this.o, this.z, cnt.b.a(this.r[0], this.r[1]), $$1, 0.0f, cnr.K);
        this.a($$0, this.s, this.o, cnt.b.a(this.x, this.B), cnt.b.a(this.r[2], this.r[5]), $$1, 0.0f, cnr.L);
        this.a($$0, this.t, this.o, cnt.b.a(this.x, this.B), cnt.b.a(this.r[2], this.r[5]), $$1, 0.0f, cnr.K);
        this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0f, cnr.L);
        this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0f, cnr.K);
        this.a($$0, cnt.b.a(this.p[1], this.p[2]), this.o, cnt.b.a(this.y, this.B), this.r[6], $$1, 0.0f, cnr.g);
        this.a($$0, cnt.b.a(this.p[3], this.p[4]), this.o, cnt.b.a(this.y, this.B), this.r[6], $$1, 0.0f, cnr.h);
        this.a($$0, this.s, this.o, cnt.b.a(this.y, this.B), this.r[6], $$1, 0.0f, cnr.L);
        for (int $$2 = 0; $$2 < this.p.length; ++$$2) {
            cnt.b $$3 = this.p[$$2];
            for (int $$4 = 0; $$4 < this.q.length; ++$$4) {
                cnt.b $$5 = this.q[$$4];
                acp<cnk> $$6 = this.b($$2, $$4, $$1);
                this.a($$0, $$3, $$5, cnt.b.a(this.A, this.B), cnt.b.a(this.r[0], this.r[1]), $$1, 0.0f, $$6);
            }
        }
    }

    private void e(Consumer<Pair<cnt.d, acp<cnk>>> $$0) {
        this.b($$0, this.o, this.o, cnt.b.a(0.8f, 1.0f), this.o, this.o, 0.0f, cnr.Z);
        this.b($$0, this.o, cnt.b.a(0.7f, 1.0f), this.o, this.o, this.o, 0.0f, cnr.aa);
        this.c($$0, this.o, this.o, this.o, cnt.b.a(this.r[0], this.r[1]), this.o, 0.0f, cnr.ab);
    }

    private acp<cnk> a(int $$0, int $$1, cnt.b $$2) {
        if ($$2.b() < 0L) {
            return this.D[$$0][$$1];
        }
        acp<cnk> $$3 = this.E[$$0][$$1];
        return $$3 == null ? this.D[$$0][$$1] : $$3;
    }

    private acp<cnk> b(int $$0, int $$1, cnt.b $$2) {
        return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
    }

    private acp<cnk> c(int $$0, int $$1, cnt.b $$2) {
        return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
    }

    private acp<cnk> a(int $$0, int $$1, cnt.b $$2, acp<cnk> $$3) {
        if ($$0 > 1 && $$1 < 4 && $$2.b() >= 0L) {
            return cnr.w;
        }
        return $$3;
    }

    private acp<cnk> d(int $$0, int $$1, cnt.b $$2) {
        acp<cnk> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
        return this.a($$0, $$1, $$2, $$3);
    }

    private acp<cnk> a(int $$0, int $$1) {
        if ($$0 == 0) {
            return cnr.N;
        }
        if ($$0 == 4) {
            return cnr.f;
        }
        return cnr.M;
    }

    private acp<cnk> a(int $$0, cnt.b $$1) {
        if ($$0 < 2) {
            return $$1.b() < 0L ? cnr.A : cnr.B;
        }
        if ($$0 < 3) {
            return cnr.A;
        }
        return cnr.C;
    }

    private acp<cnk> e(int $$0, int $$1, cnt.b $$2) {
        acp<cnk> $$3;
        if ($$2.b() >= 0L && ($$3 = this.G[$$0][$$1]) != null) {
            return $$3;
        }
        return this.F[$$0][$$1];
    }

    private acp<cnk> f(int $$0, int $$1, cnt.b $$2) {
        if ($$0 <= 2) {
            return $$2.b() < 0L ? cnr.I : cnr.H;
        }
        if ($$0 == 3) {
            return cnr.J;
        }
        return this.a($$1, $$2);
    }

    private acp<cnk> g(int $$0, int $$1, cnt.b $$2) {
        if ($$0 >= 3) {
            return this.e($$0, $$1, $$2);
        }
        if ($$1 <= 1) {
            return cnr.G;
        }
        return cnr.F;
    }

    private acp<cnk> h(int $$0, int $$1, cnt.b $$2) {
        acp<cnk> $$3 = this.H[$$0][$$1];
        return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
    }

    private void a(Consumer<Pair<cnt.d, acp<cnk>>> $$0, cnt.b $$1, cnt.b $$2, cnt.b $$3, cnt.b $$4, cnt.b $$5, float $$6, acp<cnk> $$7) {
        $$0.accept((Pair<cnt.d, acp<cnk>>)Pair.of((Object)cnt.a($$1, $$2, $$3, $$4, cnt.b.a(0.0f), $$5, $$6), $$7));
        $$0.accept((Pair<cnt.d, acp<cnk>>)Pair.of((Object)cnt.a($$1, $$2, $$3, $$4, cnt.b.a(1.0f), $$5, $$6), $$7));
    }

    private void b(Consumer<Pair<cnt.d, acp<cnk>>> $$0, cnt.b $$1, cnt.b $$2, cnt.b $$3, cnt.b $$4, cnt.b $$5, float $$6, acp<cnk> $$7) {
        $$0.accept((Pair<cnt.d, acp<cnk>>)Pair.of((Object)cnt.a($$1, $$2, $$3, $$4, cnt.b.a(0.2f, 0.9f), $$5, $$6), $$7));
    }

    private void c(Consumer<Pair<cnt.d, acp<cnk>>> $$0, cnt.b $$1, cnt.b $$2, cnt.b $$3, cnt.b $$4, cnt.b $$5, float $$6, acp<cnk> $$7) {
        $$0.accept((Pair<cnt.d, acp<cnk>>)Pair.of((Object)cnt.a($$1, $$2, $$3, $$4, cnt.b.a(1.1f), $$5, $$6), $$7));
    }

    public static boolean a(dhd $$0, dhd $$1, dhd.b $$2) {
        return $$0.a($$2) < (double)-0.225f && $$1.a($$2) > (double)0.9f;
    }

    public static String a(double $$0) {
        if ($$0 < (double)dhr.a(0.05f)) {
            return "Valley";
        }
        if ($$0 < (double)dhr.a(0.26666668f)) {
            return "Low";
        }
        if ($$0 < (double)dhr.a(0.4f)) {
            return "Mid";
        }
        if ($$0 < (double)dhr.a(0.56666666f)) {
            return "High";
        }
        return "Peak";
    }

    public String b(double $$0) {
        double $$1 = cnt.a((float)$$0);
        if ($$1 < (double)this.u.b()) {
            return "Mushroom fields";
        }
        if ($$1 < (double)this.v.b()) {
            return "Deep ocean";
        }
        if ($$1 < (double)this.w.b()) {
            return "Ocean";
        }
        if ($$1 < (double)this.x.b()) {
            return "Coast";
        }
        if ($$1 < (double)this.z.b()) {
            return "Near inland";
        }
        if ($$1 < (double)this.A.b()) {
            return "Mid inland";
        }
        return "Far inland";
    }

    public String c(double $$0) {
        return coa.a($$0, this.r);
    }

    public String d(double $$0) {
        return coa.a($$0, this.p);
    }

    public String e(double $$0) {
        return coa.a($$0, this.q);
    }

    private static String a(double $$0, cnt.b[] $$1) {
        double $$2 = cnt.a((float)$$0);
        for (int $$3 = 0; $$3 < $$1.length; ++$$3) {
            if (!($$2 < (double)$$1[$$3].b())) continue;
            return "" + $$3;
        }
        return "?";
    }

    @aqa
    public cnt.b[] b() {
        return this.p;
    }

    @aqa
    public cnt.b[] c() {
        return this.q;
    }

    @aqa
    public cnt.b[] d() {
        return this.r;
    }

    @aqa
    public cnt.b[] e() {
        return new cnt.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
    }

    @aqa
    public cnt.b[] f() {
        return new cnt.b[]{cnt.b.a(-2.0f, dhr.a(0.05f)), cnt.b.a(dhr.a(0.05f), dhr.a(0.26666668f)), cnt.b.a(dhr.a(0.26666668f), dhr.a(0.4f)), cnt.b.a(dhr.a(0.4f), dhr.a(0.56666666f)), cnt.b.a(dhr.a(0.56666666f), 2.0f)};
    }

    @aqa
    public cnt.b[] g() {
        return new cnt.b[]{cnt.b.a(-2.0f, 0.0f), cnt.b.a(0.0f, 2.0f)};
    }
}

