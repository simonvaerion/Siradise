/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dhk {
    private static final Logger a = LogUtils.getLogger();
    static final Predicate<dcb> b = $$0 -> !$$0.i();
    static final Predicate<dcb> c = dca.a::d;
    private final ans d;
    private final Predicate<dcb> e;
    private final ddx f;

    public dhk(ddx $$0, a $$1) {
        this.e = $$1.e();
        this.f = $$0;
        int $$2 = apa.e($$0.D_() + 1);
        this.d = new apl($$2, 256);
    }

    public static void a(ddx $$0, Set<a> $$1) {
        int $$2 = $$1.size();
        ObjectArrayList $$3 = new ObjectArrayList($$2);
        ObjectListIterator $$4 = $$3.iterator();
        int $$5 = $$0.b() + 16;
        gu.a $$6 = new gu.a();
        for (int $$7 = 0; $$7 < 16; ++$$7) {
            block1: for (int $$8 = 0; $$8 < 16; ++$$8) {
                for (a $$9 : $$1) {
                    $$3.add((Object)$$0.a($$9));
                }
                for (int $$10 = $$5 - 1; $$10 >= $$0.C_(); --$$10) {
                    $$6.d($$7, $$10, $$8);
                    dcb $$11 = $$0.a_($$6);
                    if ($$11.a(cpo.a)) continue;
                    while ($$4.hasNext()) {
                        dhk $$12 = (dhk)$$4.next();
                        if (!$$12.e.test($$11)) continue;
                        $$12.a($$7, $$8, $$10 + 1);
                        $$4.remove();
                    }
                    if ($$3.isEmpty()) continue block1;
                    $$4.back($$2);
                }
            }
        }
    }

    public boolean a(int $$0, int $$1, int $$2, dcb $$3) {
        int $$4 = this.a($$0, $$2);
        if ($$1 <= $$4 - 2) {
            return false;
        }
        if (this.e.test($$3)) {
            if ($$1 >= $$4) {
                this.a($$0, $$2, $$1 + 1);
                return true;
            }
        } else if ($$4 - 1 == $$1) {
            gu.a $$5 = new gu.a();
            for (int $$6 = $$1 - 1; $$6 >= this.f.C_(); --$$6) {
                $$5.d($$0, $$6, $$2);
                if (!this.e.test(this.f.a_($$5))) continue;
                this.a($$0, $$2, $$6 + 1);
                return true;
            }
            this.a($$0, $$2, this.f.C_());
            return true;
        }
        return false;
    }

    public int a(int $$0, int $$1) {
        return this.a(dhk.c($$0, $$1));
    }

    public int b(int $$0, int $$1) {
        return this.a(dhk.c($$0, $$1)) - 1;
    }

    private int a(int $$0) {
        return this.d.a($$0) + this.f.C_();
    }

    private void a(int $$0, int $$1, int $$2) {
        this.d.b(dhk.c($$0, $$1), $$2 - this.f.C_());
    }

    public void a(ddx $$0, a $$1, long[] $$2) {
        long[] $$3 = this.d.a();
        if ($$3.length == $$2.length) {
            System.arraycopy($$2, 0, $$3, 0, $$2.length);
            return;
        }
        a.warn("Ignoring heightmap data for chunk " + $$0.f() + ", size does not match; expected: " + $$3.length + ", got: " + $$2.length);
        dhk.a($$0, EnumSet.of($$1));
    }

    public long[] a() {
        return this.d.a();
    }

    private static int c(int $$0, int $$1) {
        return $$0 + $$1 * 16;
    }

    public static final class a
    extends Enum<a>
    implements apr {
        public static final /* enum */ a a = new a("WORLD_SURFACE_WG", dhk$b.a, b);
        public static final /* enum */ a b = new a("WORLD_SURFACE", dhk$b.c, b);
        public static final /* enum */ a c = new a("OCEAN_FLOOR_WG", dhk$b.a, c);
        public static final /* enum */ a d = new a("OCEAN_FLOOR", dhk$b.b, c);
        public static final /* enum */ a e = new a("MOTION_BLOCKING", dhk$b.c, $$0 -> $$0.d() || !$$0.u().c());
        public static final /* enum */ a f = new a("MOTION_BLOCKING_NO_LEAVES", dhk$b.b, $$0 -> ($$0.d() || !$$0.u().c()) && !($$0.b() instanceof ctu));
        public static final Codec<a> g;
        private final String h;
        private final b i;
        private final Predicate<dcb> j;
        private static final /* synthetic */ a[] k;

        public static a[] values() {
            return (a[])k.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, b $$1, Predicate<dcb> $$2) {
            this.h = $$0;
            this.i = $$1;
            this.j = $$2;
        }

        public String a() {
            return this.h;
        }

        public boolean b() {
            return this.i == dhk$b.c;
        }

        public boolean d() {
            return this.i != dhk$b.a;
        }

        public Predicate<dcb> e() {
            return this.j;
        }

        @Override
        public String c() {
            return this.h;
        }

        private static /* synthetic */ a[] f() {
            return new a[]{a, b, c, d, e, f};
        }

        static {
            k = dhk$a.f();
            g = apr.a(a::values);
        }
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
            d = dhk$b.a();
        }
    }
}

