/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.StringUtils
 */
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class dyz
implements Comparable<dyz> {
    private final cmq a;
    private final dza b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final Path g;
    @Nullable
    private sw h;

    public dyz(cmq $$0, dza $$1, String $$2, boolean $$3, boolean $$4, boolean $$5, Path $$6) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.e = $$4;
        this.f = $$5;
        this.g = $$6;
        this.d = $$3;
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return StringUtils.isEmpty((CharSequence)this.a.a()) ? this.c : this.a.a();
    }

    public Path c() {
        return this.g;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.f;
    }

    public long f() {
        return this.b.b();
    }

    public int a(dyz $$0) {
        if (this.f() < $$0.f()) {
            return 1;
        }
        if (this.f() > $$0.f()) {
            return -1;
        }
        return this.c.compareTo($$0.c);
    }

    public cmq g() {
        return this.a;
    }

    public cmj h() {
        return this.a.b();
    }

    public boolean i() {
        return this.a.c();
    }

    public boolean j() {
        return this.a.e();
    }

    public tj k() {
        if (aps.b(this.b.c())) {
            return sw.c("selectWorld.versionUnknown");
        }
        return sw.b(this.b.c());
    }

    public dza l() {
        return this.b;
    }

    public boolean m() {
        return this.n() || !aa.b().g() && !this.b.e() || this.o().a();
    }

    public boolean n() {
        return this.b.d().c() > aa.b().d().c();
    }

    public a o() {
        ad $$0 = aa.b();
        int $$1 = $$0.d().c();
        int $$2 = this.b.d().c();
        if (!$$0.g() && $$2 < $$1) {
            return dyz$a.c;
        }
        if ($$2 > $$1) {
            return dyz$a.b;
        }
        return dyz$a.a;
    }

    public boolean p() {
        return this.e;
    }

    public boolean q() {
        if (this.p() || this.d()) {
            return true;
        }
        return !this.r();
    }

    public boolean r() {
        return aa.b().d().a(this.b.d());
    }

    public sw s() {
        if (this.h == null) {
            this.h = this.t();
        }
        return this.h;
    }

    private sw t() {
        tj $$02;
        if (this.p()) {
            return sw.c("selectWorld.locked").a(n.m);
        }
        if (this.d()) {
            return sw.c("selectWorld.conversion").a(n.m);
        }
        if (!this.r()) {
            return sw.c("selectWorld.incompatible_series").a(n.m);
        }
        tj tj2 = $$02 = this.i() ? sw.h().b(sw.c("gameMode.hardcore").a($$0 -> $$0.a(-65536))) : sw.c("gameMode." + this.h().b());
        if (this.j()) {
            $$02.f(", ").b(sw.c("selectWorld.cheats"));
        }
        if (this.e()) {
            $$02.f(", ").b(sw.c("selectWorld.experimental").a(n.o));
        }
        tj $$1 = this.k();
        tj $$2 = sw.b(", ").b(sw.c("selectWorld.version")).b(sv.t);
        if (this.m()) {
            $$2.b($$1.a(this.n() ? n.m : n.u));
        } else {
            $$2.b($$1);
        }
        $$02.b($$2);
        return $$02;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((dyz)object);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(false, false, "");
        public static final /* enum */ a b = new a(true, true, "downgrade");
        public static final /* enum */ a c = new a(true, false, "snapshot");
        private final boolean d;
        private final boolean e;
        private final String f;
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(boolean $$0, boolean $$1, String $$2) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
        }

        public boolean a() {
            return this.d;
        }

        public boolean b() {
            return this.e;
        }

        public String c() {
            return this.f;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{a, b, c};
        }

        static {
            g = dyz$a.d();
        }
    }

    public static class b
    extends dyz {
        public b(String $$0, Path $$1) {
            super(null, null, $$0, false, false, false, $$1);
        }

        @Override
        public String b() {
            return this.a();
        }

        @Override
        public sw s() {
            return sw.c("symlink_warning.title").a($$0 -> $$0.a(-65536));
        }

        @Override
        public long f() {
            return -1L;
        }

        @Override
        public boolean q() {
            return false;
        }

        @Override
        public /* synthetic */ int compareTo(Object object) {
            return super.a((dyz)object);
        }
    }
}

