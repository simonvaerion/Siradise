/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class fxv
implements fze<fxv> {
    public static final acj a = new acj("sounds", ".ogg");
    private final acq b;
    private final bdf c;
    private final bdf d;
    private final int e;
    private final a f;
    private final boolean g;
    private final boolean h;
    private final int i;

    public fxv(String $$0, bdf $$1, bdf $$2, int $$3, a $$4, boolean $$5, boolean $$6, int $$7) {
        this.b = new acq($$0);
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
    }

    public acq a() {
        return this.b;
    }

    public acq b() {
        return a.a(this.b);
    }

    public bdf c() {
        return this.c;
    }

    public bdf d() {
        return this.d;
    }

    @Override
    public int e() {
        return this.e;
    }

    public fxv a(apf $$0) {
        return this;
    }

    @Override
    public void a(fyz $$0) {
        if (this.h) {
            $$0.a(this);
        }
    }

    public a f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public int i() {
        return this.i;
    }

    public String toString() {
        return "Sound[" + this.b + "]";
    }

    @Override
    public /* synthetic */ Object b(apf apf2) {
        return this.a(apf2);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("file");
        public static final /* enum */ a b = new a("event");
        private final String c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.c = $$0;
        }

        @Nullable
        public static a a(String $$0) {
            for (a $$1 : fxv$a.values()) {
                if (!$$1.c.equals($$0)) continue;
                return $$1;
            }
            return null;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            d = fxv$a.a();
        }
    }
}

