/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public class ceh
extends cgp
implements cht {
    private static final String b = "Charged";
    private static final String e = "ChargedProjectiles";
    private static final int f = 25;
    public static final int a = 8;
    private boolean g = false;
    private boolean h = false;
    private static final float i = 0.2f;
    private static final float j = 0.5f;
    private static final float k = 3.15f;
    private static final float r = 1.6f;

    public ceh(cfu.a $$0) {
        super($$0);
    }

    @Override
    public Predicate<cfz> e() {
        return d;
    }

    @Override
    public Predicate<cfz> b() {
        return c;
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
        cfz $$3 = $$1.b($$2);
        if (ceh.d($$3)) {
            ceh.a($$0, $$1, $$2, $$3, ceh.o($$3), 1.0f);
            ceh.a($$3, false);
            return bdy.b($$3);
        }
        if (!$$1.g($$3).b()) {
            if (!ceh.d($$3)) {
                this.g = false;
                this.h = false;
                $$1.c($$2);
            }
            return bdy.b($$3);
        }
        return bdy.d($$3);
    }

    private static float o(cfz $$0) {
        if (ceh.a($$0, cgc.tA)) {
            return 1.6f;
        }
        return 3.15f;
    }

    @Override
    public void a(cfz $$0, cmm $$1, bfz $$2, int $$3) {
        int $$4 = this.b($$0) - $$3;
        float $$5 = ceh.a($$4, $$0);
        if ($$5 >= 1.0f && !ceh.d($$0) && ceh.a($$2, $$0)) {
            ceh.a($$0, true);
            ami $$6 = $$2 instanceof byo ? ami.h : ami.f;
            $$1.a(null, $$2.dn(), $$2.dp(), $$2.dt(), amh.fk, $$6, 1.0f, 1.0f / ($$1.y_().i() * 0.5f + 1.0f) + 0.2f);
        }
    }

    private static boolean a(bfz $$0, cfz $$1) {
        int $$2 = cki.a(ckk.I, $$1);
        int $$3 = $$2 == 0 ? 1 : 3;
        boolean $$4 = $$0 instanceof byo && ((byo)$$0).fO().d;
        cfz $$5 = $$0.g($$1);
        cfz $$6 = $$5.p();
        for (int $$7 = 0; $$7 < $$3; ++$$7) {
            if ($$7 > 0) {
                $$5 = $$6.p();
            }
            if ($$5.b() && $$4) {
                $$5 = new cfz(cgc.nH);
                $$6 = $$5.p();
            }
            if (ceh.a($$0, $$1, $$5, $$7 > 0, $$4)) continue;
            return false;
        }
        return true;
    }

    private static boolean a(bfz $$0, cfz $$1, cfz $$2, boolean $$3, boolean $$4) {
        cfz $$7;
        boolean $$5;
        if ($$2.b()) {
            return false;
        }
        boolean bl2 = $$5 = $$4 && $$2.d() instanceof cdn;
        if (!($$5 || $$4 || $$3)) {
            cfz $$6 = $$2.a(1);
            if ($$2.b() && $$0 instanceof byo) {
                ((byo)$$0).fN().g($$2);
            }
        } else {
            $$7 = $$2.p();
        }
        ceh.b($$1, $$7);
        return true;
    }

    public static boolean d(cfz $$0) {
        qr $$1 = $$0.v();
        return $$1 != null && $$1.q(b);
    }

    public static void a(cfz $$0, boolean $$1) {
        qr $$2 = $$0.w();
        $$2.a(b, $$1);
    }

    private static void b(cfz $$0, cfz $$1) {
        qx $$4;
        qr $$2 = $$0.w();
        if ($$2.b(e, 9)) {
            qx $$3 = $$2.c(e, 10);
        } else {
            $$4 = new qx();
        }
        qr $$5 = new qr();
        $$1.b($$5);
        $$4.add($$5);
        $$2.a(e, $$4);
    }

    private static List<cfz> p(cfz $$0) {
        qx $$3;
        ArrayList $$1 = Lists.newArrayList();
        qr $$2 = $$0.v();
        if ($$2 != null && $$2.b(e, 9) && ($$3 = $$2.c(e, 10)) != null) {
            for (int $$4 = 0; $$4 < $$3.size(); ++$$4) {
                qr $$5 = $$3.a($$4);
                $$1.add(cfz.a($$5));
            }
        }
        return $$1;
    }

    private static void q(cfz $$0) {
        qr $$1 = $$0.v();
        if ($$1 != null) {
            qx $$2 = $$1.c(e, 9);
            $$2.clear();
            $$1.a(e, $$2);
        }
    }

    public static boolean a(cfz $$0, cfu $$12) {
        return ceh.p($$0).stream().anyMatch($$1 -> $$1.a($$12));
    }

    private static void a(cmm $$0, bfz $$12, bdw $$2, cfz $$3, cfz $$4, float $$5, boolean $$6, float $$7, float $$8, float $$9) {
        byu $$122;
        if ($$0.B) {
            return;
        }
        boolean $$10 = $$4.a(cgc.tA);
        if ($$10) {
            bzb $$11 = new bzb($$0, $$4, $$12, $$12.dn(), $$12.dr() - (double)0.15f, $$12.dt(), true);
        } else {
            $$122 = ceh.a($$0, $$12, $$3, $$4);
            if ($$6 || $$9 != 0.0f) {
                $$122.d = byu.a.c;
            }
        }
        if ($$12 instanceof bvp) {
            bvp $$13 = (bvp)((Object)$$12);
            $$13.a($$13.j(), $$3, $$122, $$9);
        } else {
            eei $$14 = $$12.i(1.0f);
            Quaternionf $$15 = new Quaternionf().setAngleAxis((double)($$9 * ((float)Math.PI / 180)), $$14.c, $$14.d, $$14.e);
            eei $$16 = $$12.f(1.0f);
            Vector3f $$17 = $$16.j().rotate((Quaternionfc)$$15);
            ((bzg)$$122).c($$17.x(), $$17.y(), $$17.z(), $$7, $$8);
        }
        $$3.a($$10 ? 3 : 1, $$12, (T $$1) -> $$1.d($$2));
        $$0.b($$122);
        $$0.a(null, $$12.dn(), $$12.dp(), $$12.dt(), amh.fq, ami.h, 1.0f, $$5);
    }

    private static byu a(cmm $$0, bfz $$1, cfz $$2, cfz $$3) {
        cdn $$4 = (cdn)($$3.d() instanceof cdn ? $$3.d() : cgc.nH);
        byu $$5 = $$4.a($$0, $$3, $$1);
        if ($$1 instanceof byo) {
            $$5.a(true);
        }
        $$5.b(amh.fj);
        $$5.q(true);
        int $$6 = cki.a(ckk.K, $$2);
        if ($$6 > 0) {
            $$5.a((byte)$$6);
        }
        return $$5;
    }

    public static void a(cmm $$0, bfz $$1, bdw $$2, cfz $$3, float $$4, float $$5) {
        List<cfz> $$6 = ceh.p($$3);
        float[] $$7 = ceh.a($$1.ec());
        for (int $$8 = 0; $$8 < $$6.size(); ++$$8) {
            boolean $$10;
            cfz $$9 = $$6.get($$8);
            boolean bl2 = $$10 = $$1 instanceof byo && ((byo)$$1).fO().d;
            if ($$9.b()) continue;
            if ($$8 == 0) {
                ceh.a($$0, $$1, $$2, $$3, $$9, $$7[$$8], $$10, $$4, $$5, 0.0f);
                continue;
            }
            if ($$8 == 1) {
                ceh.a($$0, $$1, $$2, $$3, $$9, $$7[$$8], $$10, $$4, $$5, -10.0f);
                continue;
            }
            if ($$8 != 2) continue;
            ceh.a($$0, $$1, $$2, $$3, $$9, $$7[$$8], $$10, $$4, $$5, 10.0f);
        }
        ceh.a($$0, $$1, $$3);
    }

    private static float[] a(apf $$0) {
        boolean $$1 = $$0.h();
        return new float[]{1.0f, ceh.a($$1, $$0), ceh.a(!$$1, $$0)};
    }

    private static float a(boolean $$0, apf $$1) {
        float $$2 = $$0 ? 0.63f : 0.43f;
        return 1.0f / ($$1.i() * 0.5f + 1.8f) + $$2;
    }

    private static void a(cmm $$0, bfz $$1, cfz $$2) {
        if ($$1 instanceof aig) {
            aig $$3 = (aig)$$1;
            if (!$$0.B) {
                ai.F.a($$3, $$2);
            }
            $$3.b(amr.c.b($$2.d()));
        }
        ceh.q($$2);
    }

    @Override
    public void a(cmm $$0, bfz $$1, cfz $$2, int $$3) {
        if (!$$0.B) {
            int $$4 = cki.a(ckk.J, $$2);
            amg $$5 = this.a($$4);
            amg $$6 = $$4 == 0 ? amh.fl : null;
            float $$7 = (float)($$2.r() - $$3) / (float)ceh.k($$2);
            if ($$7 < 0.2f) {
                this.g = false;
                this.h = false;
            }
            if ($$7 >= 0.2f && !this.g) {
                this.g = true;
                $$0.a(null, $$1.dn(), $$1.dp(), $$1.dt(), $$5, ami.h, 0.5f, 1.0f);
            }
            if ($$7 >= 0.5f && $$6 != null && !this.h) {
                this.h = true;
                $$0.a(null, $$1.dn(), $$1.dp(), $$1.dt(), $$6, ami.h, 0.5f, 1.0f);
            }
        }
    }

    @Override
    public int b(cfz $$0) {
        return ceh.k($$0) + 3;
    }

    public static int k(cfz $$0) {
        int $$1 = cki.a(ckk.J, $$0);
        return $$1 == 0 ? 25 : 25 - 5 * $$1;
    }

    @Override
    public chs c(cfz $$0) {
        return chs.g;
    }

    private amg a(int $$0) {
        switch ($$0) {
            case 1: {
                return amh.fn;
            }
            case 2: {
                return amh.fo;
            }
            case 3: {
                return amh.fp;
            }
        }
        return amh.fm;
    }

    private static float a(int $$0, cfz $$1) {
        float $$2 = (float)$$0 / (float)ceh.k($$1);
        if ($$2 > 1.0f) {
            $$2 = 1.0f;
        }
        return $$2;
    }

    @Override
    public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
        List<cfz> $$4 = ceh.p($$0);
        if (!ceh.d($$0) || $$4.isEmpty()) {
            return;
        }
        cfz $$5 = $$4.get(0);
        $$2.add(sw.c("item.minecraft.crossbow.projectile").b(sv.t).b($$5.J()));
        if ($$3.a() && $$5.a(cgc.tA)) {
            ArrayList $$6 = Lists.newArrayList();
            cgc.tA.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
                for (int $$7 = 0; $$7 < $$6.size(); ++$$7) {
                    $$6.set($$7, sw.b("  ").b((sw)$$6.get($$7)).a(n.h));
                }
                $$2.addAll($$6);
            }
        }
    }

    @Override
    public boolean l(cfz $$0) {
        return $$0.a(this);
    }

    @Override
    public int d() {
        return 8;
    }
}

