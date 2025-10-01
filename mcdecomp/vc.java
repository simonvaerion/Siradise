/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;
import java.util.function.Function;

public class vc
implements uo<ur> {
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 4;
    private final UUID d;
    private final c e;
    static final c f = new c(){

        @Override
        public d a() {
            return vc$d.b;
        }

        @Override
        public void a(UUID $$0, b $$1) {
            $$1.a($$0);
        }

        @Override
        public void a(sf $$0) {
        }
    };

    private vc(UUID $$0, c $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public vc(sf $$0) {
        this.d = $$0.o();
        d $$1 = $$0.b(d.class);
        this.e = $$1.g.apply($$0);
    }

    public static vc a(bdn $$0) {
        return new vc($$0.i(), new a($$0));
    }

    public static vc a(UUID $$0) {
        return new vc($$0, f);
    }

    public static vc b(bdn $$0) {
        return new vc($$0.i(), new f($$0.k()));
    }

    public static vc c(bdn $$0) {
        return new vc($$0.i(), new e($$0.j()));
    }

    public static vc d(bdn $$0) {
        return new vc($$0.i(), new h($$0.l(), $$0.m()));
    }

    public static vc e(bdn $$0) {
        return new vc($$0.i(), new g($$0.n(), $$0.o(), $$0.p()));
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.d);
        $$0.a(this.e.a());
        this.e.a($$0);
    }

    static int a(boolean $$0, boolean $$1, boolean $$2) {
        int $$3 = 0;
        if ($$0) {
            $$3 |= 1;
        }
        if ($$1) {
            $$3 |= 2;
        }
        if ($$2) {
            $$3 |= 4;
        }
        return $$3;
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    @Override
    public void a(b $$0) {
        this.e.a(this.d, $$0);
    }

    static interface c {
        public d a();

        public void a(UUID var1, b var2);

        public void a(sf var1);
    }

    static final class d
    extends Enum<d> {
        public static final /* enum */ d a = new d(a::new);
        public static final /* enum */ d b = new d($$0 -> f);
        public static final /* enum */ d c = new d(f::new);
        public static final /* enum */ d d = new d(e::new);
        public static final /* enum */ d e = new d(h::new);
        public static final /* enum */ d f = new d(g::new);
        final Function<sf, c> g;
        private static final /* synthetic */ d[] h;

        public static d[] values() {
            return (d[])h.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private d(Function<sf, c> $$0) {
            this.g = $$0;
        }

        private static /* synthetic */ d[] a() {
            return new d[]{a, b, c, d, e, f};
        }

        static {
            h = vc$d.a();
        }
    }

    static class a
    implements c {
        private final sw a;
        private final float b;
        private final bdn.a c;
        private final bdn.b d;
        private final boolean e;
        private final boolean f;
        private final boolean g;

        a(bdn $$0) {
            this.a = $$0.j();
            this.b = $$0.k();
            this.c = $$0.l();
            this.d = $$0.m();
            this.e = $$0.n();
            this.f = $$0.o();
            this.g = $$0.p();
        }

        private a(sf $$0) {
            this.a = $$0.l();
            this.b = $$0.readFloat();
            this.c = $$0.b(bdn.a.class);
            this.d = $$0.b(bdn.b.class);
            short $$1 = $$0.readUnsignedByte();
            this.e = ($$1 & 1) > 0;
            this.f = ($$1 & 2) > 0;
            this.g = ($$1 & 4) > 0;
        }

        @Override
        public d a() {
            return vc$d.a;
        }

        @Override
        public void a(UUID $$0, b $$1) {
            $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }

        @Override
        public void a(sf $$0) {
            $$0.a(this.a);
            $$0.writeFloat(this.b);
            $$0.a(this.c);
            $$0.a(this.d);
            $$0.writeByte(vc.a(this.e, this.f, this.g));
        }
    }

    static class f
    implements c {
        private final float a;

        f(float $$0) {
            this.a = $$0;
        }

        private f(sf $$0) {
            this.a = $$0.readFloat();
        }

        @Override
        public d a() {
            return vc$d.c;
        }

        @Override
        public void a(UUID $$0, b $$1) {
            $$1.a($$0, this.a);
        }

        @Override
        public void a(sf $$0) {
            $$0.writeFloat(this.a);
        }
    }

    static class e
    implements c {
        private final sw a;

        e(sw $$0) {
            this.a = $$0;
        }

        private e(sf $$0) {
            this.a = $$0.l();
        }

        @Override
        public d a() {
            return vc$d.d;
        }

        @Override
        public void a(UUID $$0, b $$1) {
            $$1.a($$0, this.a);
        }

        @Override
        public void a(sf $$0) {
            $$0.a(this.a);
        }
    }

    static class h
    implements c {
        private final bdn.a a;
        private final bdn.b b;

        h(bdn.a $$0, bdn.b $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        private h(sf $$0) {
            this.a = $$0.b(bdn.a.class);
            this.b = $$0.b(bdn.b.class);
        }

        @Override
        public d a() {
            return vc$d.e;
        }

        @Override
        public void a(UUID $$0, b $$1) {
            $$1.a($$0, this.a, this.b);
        }

        @Override
        public void a(sf $$0) {
            $$0.a(this.a);
            $$0.a(this.b);
        }
    }

    static class g
    implements c {
        private final boolean a;
        private final boolean b;
        private final boolean c;

        g(boolean $$0, boolean $$1, boolean $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        private g(sf $$0) {
            short $$1 = $$0.readUnsignedByte();
            this.a = ($$1 & 1) > 0;
            this.b = ($$1 & 2) > 0;
            this.c = ($$1 & 4) > 0;
        }

        @Override
        public d a() {
            return vc$d.f;
        }

        @Override
        public void a(UUID $$0, b $$1) {
            $$1.a($$0, this.a, this.b, this.c);
        }

        @Override
        public void a(sf $$0) {
            $$0.writeByte(vc.a(this.a, this.b, this.c));
        }
    }

    public static interface b {
        default public void a(UUID $$0, sw $$1, float $$2, bdn.a $$3, bdn.b $$4, boolean $$5, boolean $$6, boolean $$7) {
        }

        default public void a(UUID $$0) {
        }

        default public void a(UUID $$0, float $$1) {
        }

        default public void a(UUID $$0, sw $$1) {
        }

        default public void a(UUID $$0, bdn.a $$1, bdn.b $$2) {
        }

        default public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
        }
    }
}

