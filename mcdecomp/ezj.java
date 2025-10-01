/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ezj {
    private static final sw a = sw.c("selectWorld.newWorld");
    private final List<Consumer<ezj>> b = new ArrayList<Consumer<ezj>>();
    private String c = a.getString();
    private a d = ezj$a.a;
    private bdu e = bdu.c;
    @Nullable
    private Boolean f;
    private String g;
    private boolean h;
    private boolean i;
    private final Path j;
    private String k;
    private ezi l;
    private b m;
    private final List<b> n = new ArrayList<b>();
    private final List<b> o = new ArrayList<b>();
    private cmi p = new cmi();

    public ezj(Path $$0, ezi $$1, Optional<acp<drp>> $$2, OptionalLong $$3) {
        this.j = $$0;
        this.l = $$1;
        this.m = new b(ezj.a($$1, $$2).orElse(null));
        this.r();
        this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
        this.h = $$1.b().c();
        this.i = $$1.b().d();
        this.k = this.c(this.c);
    }

    public void a(Consumer<ezj> $$0) {
        this.b.add($$0);
    }

    public void a() {
        boolean $$12;
        boolean $$0 = this.j();
        if ($$0 != this.l.b().d()) {
            this.l = this.l.a($$1 -> $$1.a($$0));
        }
        if (($$12 = this.i()) != this.l.b().c()) {
            this.l = this.l.a($$1 -> $$1.b($$12));
        }
        for (Consumer<ezj> $$2 : this.b) {
            $$2.accept(this);
        }
    }

    public void a(String $$0) {
        this.c = $$0;
        this.k = this.c($$0);
        this.a();
    }

    private String c(String $$0) {
        String $$1 = $$0.trim();
        try {
            return v.a(this.j, !$$1.isEmpty() ? $$1 : a.getString(), "");
        }
        catch (Exception exception) {
            try {
                return v.a(this.j, "World", "");
            }
            catch (IOException $$2) {
                throw new RuntimeException("Could not create save folder", $$2);
            }
        }
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.k;
    }

    public void a(a $$0) {
        this.d = $$0;
        this.a();
    }

    public a d() {
        if (this.l()) {
            return ezj$a.d;
        }
        return this.d;
    }

    public void a(bdu $$0) {
        this.e = $$0;
        this.a();
    }

    public bdu e() {
        if (this.f()) {
            return bdu.d;
        }
        return this.e;
    }

    public boolean f() {
        return this.d() == ezj$a.b;
    }

    public void a(boolean $$0) {
        this.f = $$0;
        this.a();
    }

    public boolean g() {
        if (this.l()) {
            return true;
        }
        if (this.f()) {
            return false;
        }
        if (this.f == null) {
            return this.d() == ezj$a.c;
        }
        return this.f;
    }

    public void b(String $$02) {
        this.g = $$02;
        this.l = this.l.a($$0 -> $$0.a(dii.a(this.h())));
        this.a();
    }

    public String h() {
        return this.g;
    }

    public void b(boolean $$0) {
        this.h = $$0;
        this.a();
    }

    public boolean i() {
        if (this.l()) {
            return false;
        }
        return this.h;
    }

    public void c(boolean $$0) {
        this.i = $$0;
        this.a();
    }

    public boolean j() {
        if (this.l() || this.f()) {
            return false;
        }
        return this.i;
    }

    public void a(ezi $$0) {
        this.l = $$0;
        this.r();
        this.a();
    }

    public ezi k() {
        return this.l;
    }

    public void a(ezi.a $$0) {
        this.l = this.l.a($$0);
        this.a();
    }

    protected boolean a(cnf $$0) {
        cnf $$1 = this.l.g();
        if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
            this.l = new ezi(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
            return true;
        }
        return false;
    }

    public boolean l() {
        return this.l.d().c();
    }

    public void a(b $$0) {
        this.m = $$0;
        he<drp> $$12 = $$0.c();
        if ($$12 != null) {
            this.a(($$1, $$2) -> ((drp)$$12.a()).a());
        }
    }

    public b m() {
        return this.m;
    }

    @Nullable
    public ezf n() {
        he<drp> $$0 = this.m().c();
        return $$0 != null ? ezf.a.get($$0.e()) : null;
    }

    public List<b> o() {
        return this.n;
    }

    public List<b> p() {
        return this.o;
    }

    private void r() {
        hr<drp> $$0 = this.k().a().d(jc.aF);
        this.n.clear();
        this.n.addAll(ezj.a($$0, anp.a).orElseGet(() -> $$0.h().map(b::new).toList()));
        this.o.clear();
        this.o.addAll((Collection<b>)ezj.a($$0, anp.b).orElse(this.n));
        he<drp> $$1 = this.m.c();
        if ($$1 != null) {
            this.m = ezj.a(this.k(), $$1.e()).map(b::new).orElse(this.n.get(0));
        }
    }

    private static Optional<he<drp>> a(ezi $$0, Optional<acp<drp>> $$12) {
        return $$12.flatMap($$1 -> $$0.a().d(jc.aF).b((acp<drp>)$$1));
    }

    private static Optional<List<b>> a(hr<drp> $$02, anl<drp> $$1) {
        return $$02.b($$1).map($$0 -> $$0.a().map(b::new).toList()).filter($$0 -> !$$0.isEmpty());
    }

    public void a(cmi $$0) {
        this.p = $$0;
        this.a();
    }

    public cmi q() {
        return this.p;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("survival", cmj.a);
        public static final /* enum */ a b = new a("hardcore", cmj.a);
        public static final /* enum */ a c = new a("creative", cmj.b);
        public static final /* enum */ a d = new a("spectator", cmj.d);
        public final cmj e;
        public final sw f;
        private final sw g;
        private static final /* synthetic */ a[] h;

        public static a[] values() {
            return (a[])h.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, cmj $$1) {
            this.e = $$1;
            this.f = sw.c("selectWorld.gameMode." + $$0);
            this.g = sw.c("selectWorld.gameMode." + $$0 + ".info");
        }

        public sw a() {
            return this.g;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d};
        }

        static {
            h = ezj$a.b();
        }
    }

    public record b(@Nullable he<drp> a) {
        @Nullable
        private final he<drp> a;
        private static final sw b = sw.c("generator.custom");

        public sw a() {
            return Optional.ofNullable(this.a).flatMap(he::e).map($$0 -> sw.c($$0.a().f("generator"))).orElse(b);
        }

        public boolean b() {
            return Optional.ofNullable(this.a).flatMap(he::e).filter($$0 -> $$0.equals(drq.d)).isPresent();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "preset", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "preset", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "preset", "a"}, this, $$0);
        }

        @Nullable
        public he<drp> c() {
            return this.a;
        }
    }
}

