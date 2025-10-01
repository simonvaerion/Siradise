/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfd
extends cfu {
    public static final byte[] a = new byte[]{1, 2, 3};
    public static final String b = "Fireworks";
    public static final String c = "Explosion";
    public static final String d = "Explosions";
    public static final String e = "Flight";
    public static final String f = "Type";
    public static final String g = "Trail";
    public static final String h = "Flicker";
    public static final String i = "Colors";
    public static final String j = "FadeColors";
    public static final double k = 0.15;

    public cfd(cfu.a $$0) {
        super($$0);
    }

    @Override
    public bdx a(cij $$0) {
        cmm $$1 = $$0.q();
        if (!$$1.B) {
            cfz $$2 = $$0.n();
            eei $$3 = $$0.l();
            ha $$4 = $$0.k();
            bzb $$5 = new bzb($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
            $$1.b($$5);
            $$2.h(1);
        }
        return bdx.a($$1.B);
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
        if ($$1.fr()) {
            cfz $$3 = $$1.b($$2);
            if (!$$0.B) {
                bzb $$4 = new bzb($$0, $$3, $$1);
                $$0.b($$4);
                if (!$$1.fO().d) {
                    $$3.h(1);
                }
                $$1.b(amr.c.b(this));
            }
            return bdy.a($$1.b($$2), $$0.r_());
        }
        return bdy.c($$1.b($$2));
    }

    @Override
    public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
        qx $$5;
        qr $$4 = $$0.b(b);
        if ($$4 == null) {
            return;
        }
        if ($$4.b(e, 99)) {
            $$2.add(sw.c("item.minecraft.firework_rocket.flight").b(sv.t).f(String.valueOf($$4.f(e))).a(n.h));
        }
        if (!($$5 = $$4.c(d, 10)).isEmpty()) {
            for (int $$6 = 0; $$6 < $$5.size(); ++$$6) {
                qr $$7 = $$5.a($$6);
                ArrayList $$8 = Lists.newArrayList();
                cfe.a($$7, $$8);
                if ($$8.isEmpty()) continue;
                for (int $$9 = 1; $$9 < $$8.size(); ++$$9) {
                    $$8.set($$9, sw.b("  ").b((sw)$$8.get($$9)).a(n.h));
                }
                $$2.addAll($$8);
            }
        }
    }

    public static void a(cfz $$0, byte $$1) {
        $$0.a(b).a(e, $$1);
    }

    @Override
    public cfz ae_() {
        cfz $$0 = new cfz(this);
        cfd.a($$0, (byte)1);
        return $$0;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(0, "small_ball");
        public static final /* enum */ a b = new a(1, "large_ball");
        public static final /* enum */ a c = new a(2, "star");
        public static final /* enum */ a d = new a(3, "creeper");
        public static final /* enum */ a e = new a(4, "burst");
        private static final IntFunction<a> f;
        private final int g;
        private final String h;
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, String $$1) {
            this.g = $$0;
            this.h = $$1;
        }

        public int a() {
            return this.g;
        }

        public String b() {
            return this.h;
        }

        public static a a(int $$0) {
            return f.apply($$0);
        }

        private static /* synthetic */ a[] c() {
            return new a[]{a, b, c, d, e};
        }

        static {
            i = cfd$a.c();
            f = anu.a(a::a, cfd$a.values(), anu.a.a);
        }
    }
}

