/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bif<E extends bfz>
implements bhs<E> {
    private final Map<bpb<?>, bpc> a;
    private final Set<bpb<?>> b;
    private final a c;
    private final b d;
    private final bjz<bhs<? super E>> e = new bjz();
    private bhr.a f = bhr.a.a;

    public bif(Map<bpb<?>, bpc> $$02, Set<bpb<?>> $$1, a $$2, b $$3, List<Pair<? extends bhs<? super E>, Integer>> $$4) {
        this.a = $$02;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        $$4.forEach($$0 -> this.e.a((bhs)$$0.getFirst(), (Integer)$$0.getSecond()));
    }

    @Override
    public bhr.a a() {
        return this.f;
    }

    private boolean a(E $$0) {
        for (Map.Entry<bpb<?>, bpc> $$1 : this.a.entrySet()) {
            bpb<?> $$2 = $$1.getKey();
            bpc $$3 = $$1.getValue();
            if (((bfz)$$0).dK().a($$2, $$3)) continue;
            return false;
        }
        return true;
    }

    @Override
    public final boolean e(aif $$0, E $$1, long $$2) {
        if (this.a($$1)) {
            this.f = bhr.a.b;
            this.c.a(this.e);
            this.d.a(this.e.b(), $$0, $$1, $$2);
            return true;
        }
        return false;
    }

    @Override
    public final void f(aif $$02, E $$1, long $$2) {
        this.e.b().filter($$0 -> $$0.a() == bhr.a.b).forEach($$3 -> $$3.f($$02, $$1, $$2));
        if (this.e.b().noneMatch($$0 -> $$0.a() == bhr.a.b)) {
            this.g($$02, $$1, $$2);
        }
    }

    @Override
    public final void g(aif $$02, E $$1, long $$2) {
        this.f = bhr.a.a;
        this.e.b().filter($$0 -> $$0.a() == bhr.a.b).forEach($$3 -> $$3.g($$02, $$1, $$2));
        this.b.forEach(((bfz)$$1).dK()::b);
    }

    @Override
    public String b() {
        return this.getClass().getSimpleName();
    }

    public String toString() {
        Set $$02 = this.e.b().filter($$0 -> $$0.a() == bhr.a.b).collect(Collectors.toSet());
        return "(" + this.getClass().getSimpleName() + "): " + $$02;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a($$0 -> {});
        public static final /* enum */ a b = new a(bjz::a);
        private final Consumer<bjz<?>> c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(Consumer<bjz<?>> $$0) {
            this.c = $$0;
        }

        public void a(bjz<?> $$0) {
            this.c.accept($$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            d = bif$a.a();
        }
    }

    /*
     * Uses 'sealed' constructs - enablewith --sealed true
     */
    public static abstract class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(){

            @Override
            public <E extends bfz> void a(Stream<bhs<? super E>> $$02, aif $$1, E $$2, long $$32) {
                $$02.filter($$0 -> $$0.a() == bhr.a.a).filter($$3 -> $$3.e($$1, $$2, $$32)).findFirst();
            }
        };
        public static final /* enum */ b b = new b(){

            @Override
            public <E extends bfz> void a(Stream<bhs<? super E>> $$02, aif $$1, E $$2, long $$32) {
                $$02.filter($$0 -> $$0.a() == bhr.a.a).forEach($$3 -> $$3.e($$1, $$2, $$32));
            }
        };
        private static final /* synthetic */ b[] c;

        public static b[] values() {
            return (b[])c.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        public abstract <E extends bfz> void a(Stream<bhs<? super E>> var1, aif var2, E var3, long var4);

        private static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        static {
            c = bif$b.a();
        }
    }
}

