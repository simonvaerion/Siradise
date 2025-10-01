/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class ye
implements uo<ur> {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 40;
    private static final int g = 40;
    private final int h;
    private final String i;
    private final Collection<String> j;
    private final Optional<b> k;

    private ye(String $$0, int $$1, Optional<b> $$2, Collection<String> $$3) {
        this.i = $$0;
        this.h = $$1;
        this.k = $$2;
        this.j = ImmutableList.copyOf($$3);
    }

    public static ye a(efe $$0, boolean $$1) {
        return new ye($$0.b(), $$1 ? 0 : 2, Optional.of(new b($$0)), $$1 ? $$0.g() : ImmutableList.of());
    }

    public static ye a(efe $$0) {
        return new ye($$0.b(), 1, Optional.empty(), (Collection<String>)ImmutableList.of());
    }

    public static ye a(efe $$0, String $$1, a $$2) {
        return new ye($$0.b(), $$2 == ye$a.a ? 3 : 4, Optional.empty(), (Collection<String>)ImmutableList.of((Object)$$1));
    }

    public ye(sf $$0) {
        this.i = $$0.s();
        this.h = $$0.readByte();
        this.k = ye.b(this.h) ? Optional.of(new b($$0)) : Optional.empty();
        this.j = ye.a(this.h) ? $$0.a(sf::s) : ImmutableList.of();
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.i);
        $$0.writeByte(this.h);
        if (ye.b(this.h)) {
            this.k.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.h)).a($$0);
        }
        if (ye.a(this.h)) {
            $$0.a(this.j, sf::a);
        }
    }

    private static boolean a(int $$0) {
        return $$0 == 0 || $$0 == 3 || $$0 == 4;
    }

    private static boolean b(int $$0) {
        return $$0 == 0 || $$0 == 2;
    }

    @Nullable
    public a a() {
        switch (this.h) {
            case 0: 
            case 3: {
                return ye$a.a;
            }
            case 4: {
                return ye$a.b;
            }
        }
        return null;
    }

    @Nullable
    public a c() {
        switch (this.h) {
            case 0: {
                return ye$a.a;
            }
            case 1: {
                return ye$a.b;
            }
        }
        return null;
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    public String d() {
        return this.i;
    }

    public Collection<String> e() {
        return this.j;
    }

    public Optional<b> f() {
        return this.k;
    }

    public static class b {
        private final sw a;
        private final sw b;
        private final sw c;
        private final String d;
        private final String e;
        private final n f;
        private final int g;

        public b(efe $$0) {
            this.a = $$0.c();
            this.g = $$0.m();
            this.d = $$0.j().e;
            this.e = $$0.l().e;
            this.f = $$0.n();
            this.b = $$0.e();
            this.c = $$0.f();
        }

        public b(sf $$0) {
            this.a = $$0.l();
            this.g = $$0.readByte();
            this.d = $$0.e(40);
            this.e = $$0.e(40);
            this.f = $$0.b(n.class);
            this.b = $$0.l();
            this.c = $$0.l();
        }

        public sw a() {
            return this.a;
        }

        public int b() {
            return this.g;
        }

        public n c() {
            return this.f;
        }

        public String d() {
            return this.d;
        }

        public String e() {
            return this.e;
        }

        public sw f() {
            return this.b;
        }

        public sw g() {
            return this.c;
        }

        public void a(sf $$0) {
            $$0.a(this.a);
            $$0.writeByte(this.g);
            $$0.a(this.d);
            $$0.a(this.e);
            $$0.a(this.f);
            $$0.a(this.b);
            $$0.a(this.c);
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = ye$a.a();
        }
    }
}

