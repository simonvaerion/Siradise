/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class czk
extends czn {
    public static final String a = "FlowerPos";
    public static final String b = "MinOccupationTicks";
    public static final String c = "EntityData";
    public static final String d = "TicksInHive";
    public static final String e = "HasNectar";
    public static final String f = "Bees";
    private static final List<String> i = Arrays.asList("Air", "ArmorDropChances", "ArmorItems", "Brain", "CanPickUpLoot", "DeathTime", "FallDistance", "FallFlying", "Fire", "HandDropChances", "HandItems", "HurtByTimestamp", "HurtTime", "LeftHanded", "Motion", "NoGravity", "OnGround", "PortalCooldown", "Pos", "Rotation", "CannotEnterHiveTicks", "TicksSincePollination", "CropsGrownSincePollination", "HivePos", "Passengers", "Leash", "UUID");
    public static final int g = 3;
    private static final int j = 400;
    private static final int k = 2400;
    public static final int h = 600;
    private final List<a> l = Lists.newArrayList();
    @Nullable
    private gu m;

    public czk(gu $$0, dcb $$1) {
        super(czp.H, $$0, $$1);
    }

    @Override
    public void e() {
        if (this.c()) {
            this.a(null, this.o.a_(this.p()), czk$b.c);
        }
        super.e();
    }

    public boolean c() {
        if (this.o == null) {
            return false;
        }
        for (gu $$0 : gu.a(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (!(this.o.a_($$0).b() instanceof csj)) continue;
            return true;
        }
        return false;
    }

    public boolean d() {
        return this.l.isEmpty();
    }

    public boolean f() {
        return this.l.size() == 3;
    }

    public void a(@Nullable byo $$0, dcb $$1, b $$2) {
        List<bfj> $$3 = this.a($$1, $$2);
        if ($$0 != null) {
            for (bfj $$4 : $$3) {
                if (!($$4 instanceof brm)) continue;
                brm $$5 = (brm)$$4;
                if (!($$0.dg().g($$4.dg()) <= 16.0)) continue;
                if (!this.i()) {
                    $$5.h($$0);
                    continue;
                }
                $$5.t(400);
            }
        }
    }

    private List<bfj> a(dcb $$0, b $$1) {
        ArrayList $$2 = Lists.newArrayList();
        this.l.removeIf($$3 -> czk.a(this.o, this.p, $$0, $$3, $$2, $$1, this.m));
        if (!$$2.isEmpty()) {
            super.e();
        }
        return $$2;
    }

    public void a(bfj $$0, boolean $$1) {
        this.a($$0, $$1, 0);
    }

    @aqa
    public int g() {
        return this.l.size();
    }

    public static int a(dcb $$0) {
        return $$0.c(cph.b);
    }

    @aqa
    public boolean i() {
        return cqa.a(this.o, this.p());
    }

    public void a(bfj $$0, boolean $$1, int $$2) {
        if (this.l.size() >= 3) {
            return;
        }
        $$0.Y();
        $$0.bz();
        qr $$3 = new qr();
        $$0.e($$3);
        this.a($$3, $$2, $$1);
        if (this.o != null) {
            brm $$4;
            if ($$0 instanceof brm && ($$4 = (brm)$$0).r() && (!this.v() || this.o.z.h())) {
                this.m = $$4.q();
            }
            gu $$5 = this.p();
            this.o.a(null, (double)$$5.u(), (double)$$5.v(), (double)$$5.w(), amh.bG, ami.e, 1.0f, 1.0f);
            this.o.a(dgl.c, $$5, dgl.a.a($$0, this.q()));
        }
        $$0.ai();
        super.e();
    }

    public void a(qr $$0, int $$1, boolean $$2) {
        this.l.add(new a($$0, $$1, $$2 ? 2400 : 600));
    }

    private static boolean a(cmm $$02, gu $$1, dcb $$2, a $$3, @Nullable List<bfj> $$4, b $$5, @Nullable gu $$6) {
        boolean $$10;
        if (($$02.O() || $$02.Z()) && $$5 != czk$b.c) {
            return false;
        }
        qr $$7 = $$3.a.h();
        czk.d($$7);
        $$7.a("HivePos", rd.a($$1));
        $$7.a("NoGravity", true);
        ha $$8 = $$2.c(cph.a);
        gu $$9 = $$1.a($$8);
        boolean bl2 = $$10 = !$$02.a_($$9).k($$02, $$9).b();
        if ($$10 && $$5 != czk$b.c) {
            return false;
        }
        bfj $$11 = bfn.a($$7, $$02, (bfj $$0) -> $$0);
        if ($$11 != null) {
            if (!$$11.ae().a(amz.c)) {
                return false;
            }
            if ($$11 instanceof brm) {
                brm $$12 = (brm)$$11;
                if ($$6 != null && !$$12.r() && $$02.z.i() < 0.9f) {
                    $$12.i($$6);
                }
                if ($$5 == czk$b.a) {
                    int $$13;
                    $$12.gm();
                    if ($$2.a(amw.aE, (dca.a $$0) -> $$0.b(cph.b)) && ($$13 = czk.a($$2)) < 5) {
                        int $$14;
                        int n2 = $$14 = $$02.z.a(100) == 0 ? 2 : 1;
                        if ($$13 + $$14 > 5) {
                            --$$14;
                        }
                        $$02.b($$1, (dcb)$$2.a(cph.b, $$13 + $$14));
                    }
                }
                czk.a($$3.b, $$12);
                if ($$4 != null) {
                    $$4.add($$12);
                }
                float $$15 = $$11.dd();
                double $$16 = $$10 ? 0.0 : 0.55 + (double)($$15 / 2.0f);
                double $$17 = (double)$$1.u() + 0.5 + $$16 * (double)$$8.j();
                double $$18 = (double)$$1.v() + 0.5 - (double)($$11.de() / 2.0f);
                double $$19 = (double)$$1.w() + 0.5 + $$16 * (double)$$8.l();
                $$11.b($$17, $$18, $$19, $$11.dy(), $$11.dA());
            }
            $$02.a(null, $$1, amh.bH, ami.e, 1.0f, 1.0f);
            $$02.a(dgl.c, $$1, dgl.a.a($$11, $$02.a_($$1)));
            return $$02.b($$11);
        }
        return false;
    }

    static void d(qr $$0) {
        for (String $$1 : i) {
            $$0.r($$1);
        }
    }

    private static void a(int $$0, brm $$1) {
        int $$2 = $$1.h();
        if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
        } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
        }
        $$1.s(Math.max(0, $$1.ga() - $$0));
    }

    private boolean v() {
        return this.m != null;
    }

    private static void a(cmm $$0, gu $$1, dcb $$2, List<a> $$3, @Nullable gu $$4) {
        boolean $$5 = false;
        Iterator<a> $$6 = $$3.iterator();
        while ($$6.hasNext()) {
            a $$7 = $$6.next();
            if ($$7.b > $$7.c) {
                b $$8;
                b b2 = $$8 = $$7.a.q(e) ? czk$b.a : czk$b.b;
                if (czk.a($$0, $$1, $$2, $$7, null, $$8, $$4)) {
                    $$5 = true;
                    $$6.remove();
                }
            }
            ++$$7.b;
        }
        if ($$5) {
            czk.a($$0, $$1, $$2);
        }
    }

    public static void a(cmm $$0, gu $$1, dcb $$2, czk $$3) {
        czk.a($$0, $$1, $$2, $$3.l, $$3.m);
        if (!$$3.l.isEmpty() && $$0.y_().j() < 0.005) {
            double $$4 = (double)$$1.u() + 0.5;
            double $$5 = $$1.v();
            double $$6 = (double)$$1.w() + 0.5;
            $$0.a(null, $$4, $$5, $$6, amh.bJ, ami.e, 1.0f, 1.0f);
        }
        za.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.l.clear();
        qx $$1 = $$0.c(f, 10);
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            qr $$3 = $$1.a($$2);
            a $$4 = new a($$3.p(c), $$3.h(d), $$3.h(b));
            this.l.add($$4);
        }
        this.m = null;
        if ($$0.e(a)) {
            this.m = rd.b($$0.p(a));
        }
    }

    @Override
    protected void b(qr $$0) {
        super.b($$0);
        $$0.a(f, this.j());
        if (this.v()) {
            $$0.a(a, rd.a(this.m));
        }
    }

    public qx j() {
        qx $$0 = new qx();
        for (a $$1 : this.l) {
            qr $$2 = $$1.a.h();
            $$2.r("UUID");
            qr $$3 = new qr();
            $$3.a(c, $$2);
            $$3.a(d, $$1.b);
            $$3.a(b, $$1.c);
            $$0.add($$3);
        }
        return $$0;
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = czk$b.a();
        }
    }

    static class a {
        final qr a;
        int b;
        final int c;

        a(qr $$0, int $$1, int $$2) {
            czk.d($$0);
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }
    }
}

