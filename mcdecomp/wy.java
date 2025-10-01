/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Multimap
 *  com.mojang.authlib.GameProfile
 *  javax.annotation.Nullable
 */
import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class wy
implements uo<ur> {
    private final EnumSet<a> a;
    private final List<b> b;

    public wy(EnumSet<a> $$0, Collection<aig> $$1) {
        this.a = $$0;
        this.b = $$1.stream().map(b::new).toList();
    }

    public wy(a $$0, aig $$1) {
        this.a = EnumSet.of($$0);
        this.b = List.of(new b($$1));
    }

    public static wy a(Collection<aig> $$0) {
        EnumSet<a[]> $$1 = EnumSet.of(wy$a.a, new a[]{wy$a.b, wy$a.c, wy$a.d, wy$a.e, wy$a.f});
        return new wy($$1, $$0);
    }

    public wy(sf $$02) {
        this.a = $$02.a(a.class);
        this.b = $$02.a($$0 -> {
            c $$1 = new c($$0.o());
            for (a $$2 : this.a) {
                $$2.g.read($$1, (sf)((Object)$$0));
            }
            return $$1.a();
        });
    }

    @Override
    public void a(sf $$02) {
        $$02.a(this.a, a.class);
        $$02.a(this.b, ($$0, $$1) -> {
            $$0.a($$1.a());
            for (a $$2 : this.a) {
                $$2.h.write((sf)((Object)$$0), (b)$$1);
            }
        });
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    public EnumSet<a> a() {
        return this.a;
    }

    public List<b> c() {
        return this.b;
    }

    public List<b> d() {
        return this.a.contains((Object)wy$a.a) ? this.b : List.of();
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("actions", this.a).add("entries", this.b).toString();
    }

    public static final class b
    extends Record {
        private final UUID a;
        private final GameProfile b;
        private final boolean c;
        private final int d;
        private final cmj e;
        @Nullable
        private final sw f;
        @Nullable
        final tm.a g;

        b(aig $$0) {
            this($$0.ct(), $$0.fM(), true, $$0.f, $$0.e.b(), $$0.J(), x.a($$0.X(), tm::b));
        }

        public b(UUID $$0, GameProfile $$1, boolean $$2, int $$3, cmj $$4, @Nullable sw $$5, @Nullable tm.a $$6) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "profileId;profile;listed;latency;gameMode;displayName;chatSession", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "profileId;profile;listed;latency;gameMode;displayName;chatSession", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "profileId;profile;listed;latency;gameMode;displayName;chatSession", "a", "b", "c", "d", "e", "f", "g"}, this, $$0);
        }

        public UUID a() {
            return this.a;
        }

        public GameProfile b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }

        public cmj e() {
            return this.e;
        }

        @Nullable
        public sw f() {
            return this.f;
        }

        @Nullable
        public tm.a g() {
            return this.g;
        }
    }

    public static final class wy$a
    extends Enum<wy$a> {
        public static final /* enum */ wy$a a = new wy$a(($$0, $$1) -> {
            GameProfile $$2 = new GameProfile($$0.a, $$1.e(16));
            $$2.getProperties().putAll((Multimap)$$1.A());
            $$0.b = $$2;
        }, ($$0, $$1) -> {
            $$0.a($$1.b().getName(), 16);
            $$0.a($$1.b().getProperties());
        });
        public static final /* enum */ wy$a b = new wy$a(($$0, $$1) -> {
            $$0.g = (tm.a)$$1.c(tm.a::a);
        }, ($$0, $$1) -> $$0.a($$1.g, tm.a::a));
        public static final /* enum */ wy$a c = new wy$a(($$0, $$1) -> {
            $$0.e = cmj.a($$1.m());
        }, ($$0, $$1) -> $$0.d($$1.e().a()));
        public static final /* enum */ wy$a d = new wy$a(($$0, $$1) -> {
            $$0.c = $$1.readBoolean();
        }, ($$0, $$1) -> $$0.writeBoolean($$1.c()));
        public static final /* enum */ wy$a e = new wy$a(($$0, $$1) -> {
            $$0.d = $$1.m();
        }, ($$0, $$1) -> $$0.d($$1.d()));
        public static final /* enum */ wy$a f = new wy$a(($$0, $$1) -> {
            $$0.f = (sw)$$1.c(sf::l);
        }, ($$0, $$1) -> $$0.a($$1.f(), sf::a));
        final a g;
        final b h;
        private static final /* synthetic */ wy$a[] i;

        public static wy$a[] values() {
            return (wy$a[])i.clone();
        }

        public static wy$a valueOf(String $$0) {
            return Enum.valueOf(wy$a.class, $$0);
        }

        private wy$a(a $$0, b $$1) {
            this.g = $$0;
            this.h = $$1;
        }

        private static /* synthetic */ wy$a[] a() {
            return new wy$a[]{a, b, c, d, e, f};
        }

        static {
            i = wy$a.a();
        }

        public static interface a {
            public void read(c var1, sf var2);
        }

        public static interface b {
            public void write(sf var1, wy$b var2);
        }
    }

    static class c {
        final UUID a;
        GameProfile b;
        boolean c;
        int d;
        cmj e = cmj.e;
        @Nullable
        sw f;
        @Nullable
        tm.a g;

        c(UUID $$0) {
            this.a = $$0;
            this.b = new GameProfile($$0, null);
        }

        b a() {
            return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }
}

