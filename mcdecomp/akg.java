/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class akg {
    private static final Logger a = LogUtils.getLogger();
    private final String b;
    private final c c;
    private final sw d;
    private final sw e;
    private final akh f;
    private final caw g;
    private final b h;
    private final boolean i;
    private final boolean j;
    private final akj k;

    @Nullable
    public static akg a(String $$0, sw $$1, boolean $$2, c $$3, ajm $$4, b $$5, akj $$6) {
        a $$7 = akg.a($$0, $$3);
        return $$7 != null ? akg.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false, $$6) : null;
    }

    public static akg a(String $$0, sw $$1, boolean $$2, c $$3, a $$4, ajm $$5, b $$6, boolean $$7, akj $$8) {
        return new akg($$0, $$2, $$3, $$1, $$4, $$4.a($$5), $$6, $$7, $$8);
    }

    private akg(String $$0, boolean $$1, c $$2, sw $$3, a $$4, akh $$5, b $$6, boolean $$7, akj $$8) {
        this.b = $$0;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4.a();
        this.f = $$5;
        this.g = $$4.c();
        this.i = $$1;
        this.h = $$6;
        this.j = $$7;
        this.k = $$8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public static a a(String $$0, c $$1) {
        try (ajl $$2 = $$1.open($$0);){
            ajz $$3 = $$2.a(ajz.a);
            if ($$3 == null) {
                a.warn("Missing metadata in pack {}", (Object)$$0);
                a a2 = null;
                return a2;
            }
            ajj $$4 = $$2.a(ajj.a);
            caw $$5 = $$4 != null ? $$4.a() : caw.a();
            a a3 = new a($$3.a(), $$3.b(), $$5);
            return a3;
        }
        catch (Exception $$6) {
            a.warn("Failed to read pack metadata", (Throwable)$$6);
            return null;
        }
    }

    public sw a() {
        return this.d;
    }

    public sw b() {
        return this.e;
    }

    public sw a(boolean $$0) {
        return sy.a(this.k.a(sw.b(this.b))).a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired((String)this.b)).a(new tb(tb.a.a, sw.h().b(this.d).f("\n").b(this.e))));
    }

    public akh c() {
        return this.f;
    }

    public caw d() {
        return this.g;
    }

    public ajl e() {
        return this.c.open(this.b);
    }

    public String f() {
        return this.b;
    }

    public boolean g() {
        return this.i;
    }

    public boolean h() {
        return this.j;
    }

    public b i() {
        return this.h;
    }

    public akj j() {
        return this.k;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof akg)) {
            return false;
        }
        akg $$1 = (akg)$$0;
        return this.b.equals($$1.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @FunctionalInterface
    public static interface c {
        public ajl open(String var1);
    }

    public record a(sw a, int b, caw c) {
        public akh a(ajm $$0) {
            return akh.a(this.b, $$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "description;format;requestedFeatures", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "description;format;requestedFeatures", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "description;format;requestedFeatures", "a", "b", "c"}, this, $$0);
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        private static final /* synthetic */ b[] c;

        public static b[] values() {
            return (b[])c.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        public <T> int a(List<T> $$0, T $$1, Function<T, akg> $$2, boolean $$3) {
            akg $$8;
            int $$7;
            b $$4;
            b b2 = $$4 = $$3 ? this.a() : this;
            if ($$4 == b) {
                akg $$6;
                int $$5;
                for ($$5 = 0; $$5 < $$0.size() && ($$6 = $$2.apply($$0.get($$5))).h() && $$6.i() == this; ++$$5) {
                }
                $$0.add($$5, $$1);
                return $$5;
            }
            for ($$7 = $$0.size() - 1; $$7 >= 0 && ($$8 = $$2.apply($$0.get($$7))).h() && $$8.i() == this; --$$7) {
            }
            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
        }

        public b a() {
            return this == a ? b : a;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b};
        }

        static {
            c = akg$b.b();
        }
    }
}

