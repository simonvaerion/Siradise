/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class ckg {
    private final bfo[] a;
    private final a b;
    public final ckh e;
    @Nullable
    protected String f;

    @Nullable
    public static ckg c(int $$0) {
        return (ckg)jb.g.a($$0);
    }

    protected ckg(a $$0, ckh $$1, bfo[] $$2) {
        this.b = $$0;
        this.e = $$1;
        this.a = $$2;
    }

    public Map<bfo, cfz> a(bfz $$0) {
        EnumMap $$1 = Maps.newEnumMap(bfo.class);
        for (bfo $$2 : this.a) {
            cfz $$3 = $$0.c($$2);
            if ($$3.b()) continue;
            $$1.put($$2, $$3);
        }
        return $$1;
    }

    public a d() {
        return this.b;
    }

    public int e() {
        return 1;
    }

    public int a() {
        return 1;
    }

    public int a(int $$0) {
        return 1 + $$0 * 10;
    }

    public int b(int $$0) {
        return this.a($$0) + 5;
    }

    public int a(int $$0, ben $$1) {
        return 0;
    }

    public float a(int $$0, bge $$1) {
        return 0.0f;
    }

    public final boolean b(ckg $$0) {
        return this.a($$0) && $$0.a(this);
    }

    protected boolean a(ckg $$0) {
        return this != $$0;
    }

    protected String f() {
        if (this.f == null) {
            this.f = ac.a("enchantment", jb.g.b(this));
        }
        return this.f;
    }

    public String g() {
        return this.f();
    }

    public sw d(int $$0) {
        tj $$1 = sw.c(this.g());
        if (this.c()) {
            $$1.a(n.m);
        } else {
            $$1.a(n.h);
        }
        if ($$0 != 1 || this.a() != 1) {
            $$1.b(sv.t).b(sw.c("enchantment.level." + $$0));
        }
        return $$1;
    }

    public boolean a(cfz $$0) {
        return this.e.a($$0.d());
    }

    public void a(bfz $$0, bfj $$1, int $$2) {
    }

    public void b(bfz $$0, bfj $$1, int $$2) {
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean h() {
        return true;
    }

    public boolean i() {
        return true;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(10);
        public static final /* enum */ a b = new a(5);
        public static final /* enum */ a c = new a(2);
        public static final /* enum */ a d = new a(1);
        private final int e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0) {
            this.e = $$0;
        }

        public int a() {
            return this.e;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d};
        }

        static {
            f = ckg$a.b();
        }
    }
}

