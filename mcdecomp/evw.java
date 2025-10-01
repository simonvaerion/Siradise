/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class evw
extends euq {
    public static final int a = 16;
    public static final int b = 36;
    public static final int c = 30;
    public static final a k = new a(){

        @Override
        public int a() {
            return 0;
        }

        @Override
        public ta a(int $$0) {
            return ta.b;
        }
    };
    public static final acq l = new acq("textures/gui/book.png");
    protected static final int m = 114;
    protected static final int n = 128;
    protected static final int o = 192;
    protected static final int p = 192;
    private a q;
    private int r;
    private List<aom> s = Collections.emptyList();
    private int t = -1;
    private sw u = sv.a;
    private eww v;
    private eww w;
    private final boolean x;

    public evw(a $$0) {
        this($$0, true);
    }

    public evw() {
        this(k, false);
    }

    private evw(a $$0, boolean $$1) {
        super(enf.a);
        this.q = $$0;
        this.x = $$1;
    }

    public void a(a $$0) {
        this.q = $$0;
        this.r = apa.a(this.r, 0, $$0.a());
        this.G();
        this.t = -1;
    }

    public boolean a(int $$0) {
        int $$1 = apa.a($$0, 0, this.q.a() - 1);
        if ($$1 != this.r) {
            this.r = $$1;
            this.G();
            this.t = -1;
            return true;
        }
        return false;
    }

    protected boolean b(int $$0) {
        return this.a($$0);
    }

    @Override
    protected void b() {
        this.l();
        this.B();
    }

    protected void l() {
        this.d(epi.a(sv.d, (epi $$0) -> this.aw_()).a(this.g / 2 - 100, 196, 200, 20).a());
    }

    protected void B() {
        int $$02 = (this.g - 192) / 2;
        int $$1 = 2;
        this.v = this.d(new eww($$02 + 116, 159, true, $$0 -> this.E(), this.x));
        this.w = this.d(new eww($$02 + 43, 159, false, $$0 -> this.D(), this.x));
        this.G();
    }

    private int C() {
        return this.q.a();
    }

    protected void D() {
        if (this.r > 0) {
            --this.r;
        }
        this.G();
    }

    protected void E() {
        if (this.r < this.C() - 1) {
            ++this.r;
        }
        this.G();
    }

    private void G() {
        this.v.s = this.r < this.C() - 1;
        this.w.s = this.r > 0;
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if (super.a($$0, $$1, $$2)) {
            return true;
        }
        switch ($$0) {
            case 266: {
                this.w.c();
                return true;
            }
            case 267: {
                this.v.c();
                return true;
            }
        }
        return false;
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        int $$4 = (this.g - 192) / 2;
        int $$5 = 2;
        $$0.a(l, $$4, 2, 0, 0, 192, 192);
        if (this.t != this.r) {
            ta $$6 = this.q.b(this.r);
            this.s = this.i.c($$6, 114);
            this.u = sw.a("book.pageIndicator", this.r + 1, Math.max(this.C(), 1));
        }
        this.t = this.r;
        int $$7 = this.i.a(this.u);
        $$0.a(this.i, this.u, $$4 - $$7 + 192 - 44, 18, 0, false);
        int $$8 = Math.min(128 / this.i.b, this.s.size());
        for (int $$9 = 0; $$9 < $$8; ++$$9) {
            aom $$10 = this.s.get($$9);
            $$0.a(this.i, $$10, $$4 + 36, 32 + $$9 * this.i.b, 0, false);
        }
        ts $$11 = this.a($$1, (double)$$2);
        if ($$11 != null) {
            $$0.a(this.i, $$11, $$1, $$2);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public boolean a(double $$0, double $$1, int $$2) {
        ts $$3;
        if ($$2 == 0 && ($$3 = this.a($$0, $$1)) != null && this.a($$3)) {
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public boolean a(ts $$0) {
        su $$1 = $$0.h();
        if ($$1 == null) {
            return false;
        }
        if ($$1.a() == su.a.e) {
            String $$2 = $$1.b();
            try {
                int $$3 = Integer.parseInt($$2) - 1;
                return this.b($$3);
            }
            catch (Exception exception) {
                return false;
            }
        }
        boolean $$4 = super.a($$0);
        if ($$4 && $$1.a() == su.a.c) {
            this.F();
        }
        return $$4;
    }

    protected void F() {
        this.f.a((euq)null);
    }

    @Nullable
    public ts a(double $$0, double $$1) {
        if (this.s.isEmpty()) {
            return null;
        }
        int $$2 = apa.a($$0 - (double)((this.g - 192) / 2) - 36.0);
        int $$3 = apa.a($$1 - 2.0 - 30.0);
        if ($$2 < 0 || $$3 < 0) {
            return null;
        }
        int $$4 = Math.min(128 / this.i.b, this.s.size());
        if ($$2 <= 114 && $$3 < this.f.h.b * $$4 + $$4) {
            int $$5 = $$3 / this.f.h.b;
            if ($$5 >= 0 && $$5 < this.s.size()) {
                aom $$6 = this.s.get($$5);
                return this.f.h.b().a($$6, $$2);
            }
            return null;
        }
        return null;
    }

    static List<String> a(qr $$0) {
        ImmutableList.Builder $$1 = ImmutableList.builder();
        evw.a($$0, arg_0 -> ((ImmutableList.Builder)$$1).add(arg_0));
        return $$1.build();
    }

    public static void a(qr $$0, Consumer<String> $$1) {
        IntFunction<String> $$5;
        qx $$22 = $$0.c("pages", 8).e();
        if (enn.N().aP() && $$0.b("filtered_pages", 10)) {
            qr $$3 = $$0.p("filtered_pages");
            IntFunction<String> $$4 = $$2 -> {
                String $$3 = String.valueOf($$2);
                return $$3.e($$3) ? $$3.l($$3) : $$22.j($$2);
            };
        } else {
            $$5 = $$22::j;
        }
        for (int $$6 = 0; $$6 < $$22.size(); ++$$6) {
            $$1.accept($$5.apply($$6));
        }
    }

    public static interface a {
        public int a();

        public ta a(int var1);

        default public ta b(int $$0) {
            if ($$0 >= 0 && $$0 < this.a()) {
                return this.a($$0);
            }
            return ta.b;
        }

        public static a a(cfz $$0) {
            if ($$0.a(cgc.th)) {
                return new c($$0);
            }
            if ($$0.a(cgc.tg)) {
                return new b($$0);
            }
            return k;
        }
    }

    public static class b
    implements a {
        private final List<String> a;

        public b(cfz $$0) {
            this.a = evw$b.b($$0);
        }

        private static List<String> b(cfz $$0) {
            qr $$1 = $$0.v();
            return $$1 != null ? evw.a($$1) : ImmutableList.of();
        }

        @Override
        public int a() {
            return this.a.size();
        }

        @Override
        public ta a(int $$0) {
            return ta.e(this.a.get($$0));
        }
    }

    public static class c
    implements a {
        private final List<String> a;

        public c(cfz $$0) {
            this.a = evw$c.b($$0);
        }

        private static List<String> b(cfz $$0) {
            qr $$1 = $$0.v();
            if ($$1 != null && chv.a($$1)) {
                return evw.a($$1);
            }
            return ImmutableList.of((Object)sw.a.a(sw.c("book.invalid.tag").a(n.e)));
        }

        @Override
        public int a() {
            return this.a.size();
        }

        @Override
        public ta a(int $$0) {
            String $$1 = this.a.get($$0);
            try {
                tj $$2 = sw.a.a($$1);
                if ($$2 != null) {
                    return $$2;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            return ta.e($$1);
        }
    }
}

