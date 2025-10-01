/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.Function;
import javax.annotation.Nullable;

public class zt
implements uo<zb> {
    private final int a;
    private final a b;
    private final boolean c;
    static final a d = new a(){

        @Override
        public b a() {
            return zt$b.b;
        }

        @Override
        public void a(c $$0) {
            $$0.a();
        }

        @Override
        public void a(sf $$0) {
        }
    };

    private zt(int $$0, boolean $$1, a $$2) {
        this.a = $$0;
        this.b = $$2;
        this.c = $$1;
    }

    public static zt a(bfj $$0, boolean $$1) {
        return new zt($$0.af(), $$1, d);
    }

    public static zt a(bfj $$0, boolean $$1, bdw $$2) {
        return new zt($$0.af(), $$1, new d($$2));
    }

    public static zt a(bfj $$0, boolean $$1, bdw $$2, eei $$3) {
        return new zt($$0.af(), $$1, new e($$2, $$3));
    }

    public zt(sf $$0) {
        this.a = $$0.m();
        b $$1 = $$0.b(b.class);
        this.b = $$1.d.apply($$0);
        this.c = $$0.readBoolean();
    }

    @Override
    public void a(sf $$0) {
        $$0.d(this.a);
        $$0.a(this.b.a());
        this.b.a($$0);
        $$0.writeBoolean(this.c);
    }

    @Override
    public void a(zb $$0) {
        $$0.a(this);
    }

    @Nullable
    public bfj a(aif $$0) {
        return $$0.b(this.a);
    }

    public boolean a() {
        return this.c;
    }

    @Override
    public void a(c $$0) {
        this.b.a($$0);
    }

    static interface a {
        public b a();

        public void a(c var1);

        public void a(sf var1);
    }

    static class d
    implements a {
        private final bdw a;

        d(bdw $$0) {
            this.a = $$0;
        }

        private d(sf $$0) {
            this.a = $$0.b(bdw.class);
        }

        @Override
        public b a() {
            return zt$b.a;
        }

        @Override
        public void a(c $$0) {
            $$0.a(this.a);
        }

        @Override
        public void a(sf $$0) {
            $$0.a(this.a);
        }
    }

    static class e
    implements a {
        private final bdw a;
        private final eei b;

        e(bdw $$0, eei $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        private e(sf $$0) {
            this.b = new eei($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
            this.a = $$0.b(bdw.class);
        }

        @Override
        public b a() {
            return zt$b.c;
        }

        @Override
        public void a(c $$0) {
            $$0.a(this.a, this.b);
        }

        @Override
        public void a(sf $$0) {
            $$0.writeFloat((float)this.b.c);
            $$0.writeFloat((float)this.b.d);
            $$0.writeFloat((float)this.b.e);
            $$0.a(this.a);
        }
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(d::new);
        public static final /* enum */ b b = new b($$0 -> d);
        public static final /* enum */ b c = new b(e::new);
        final Function<sf, a> d;
        private static final /* synthetic */ b[] e;

        public static b[] values() {
            return (b[])e.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(Function<sf, a> $$0) {
            this.d = $$0;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            e = zt$b.a();
        }
    }

    public static interface c {
        public void a(bdw var1);

        public void a(bdw var1, eei var2);

        public void a();
    }
}

