/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ezb
extends euq {
    private final Consumer<Optional<cmi>> a;
    private g b;
    private final Set<f> c = Sets.newHashSet();
    private epi k;
    @Nullable
    private List<aom> l;
    private final cmi m;

    public ezb(cmi $$0, Consumer<Optional<cmi>> $$1) {
        super(sw.c("editGamerule.title"));
        this.m = $$0;
        this.a = $$1;
    }

    @Override
    protected void b() {
        this.b = new g(this.m);
        this.e(this.b);
        esf.b $$02 = new esf().a(10).d(2);
        this.k = $$02.a(epi.a(sv.d, (epi $$0) -> this.a.accept(Optional.of(this.m))).a());
        $$02.a(epi.a(sv.e, (epi $$0) -> this.a.accept(Optional.empty())).a());
        $$02.a().a((epf $$1) -> {
            epf cfr_ignored_0 = (epf)this.d($$1);
        });
        $$02.a().b(this.g / 2 - 155, this.h - 28);
        $$02.a().c();
    }

    @Override
    public void aw_() {
        this.a.accept(Optional.empty());
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.l = null;
        this.b.a($$0, $$1, $$2, $$3);
        $$0.a(this.i, this.e, this.g / 2, 20, 0xFFFFFF);
        super.a($$0, $$1, $$2, $$3);
    }

    private void l() {
        this.k.r = this.c.isEmpty();
    }

    void a(f $$0) {
        this.c.add($$0);
        this.l();
    }

    void b(f $$0) {
        this.c.remove($$0);
        this.l();
    }

    public class g
    extends epo<f> {
        public g(final cmi $$1) {
            super(ezb.this.f, ezb.this.g, ezb.this.h, 43, ezb.this.h - 32, 24);
            final HashMap $$2 = Maps.newHashMap();
            cmi.a(new cmi.c(){

                @Override
                public void b(cmi.e<cmi.a> $$02, cmi.f<cmi.a> $$12) {
                    this.a($$02, (sw $$0, List<aom> $$1, String $$2, T $$3) -> new a($$0, $$1, $$2, (cmi.a)$$3));
                }

                @Override
                public void c(cmi.e<cmi.d> $$02, cmi.f<cmi.d> $$12) {
                    this.a($$02, (sw $$0, List<aom> $$1, String $$2, T $$3) -> new e($$0, $$1, $$2, (cmi.d)$$3));
                }

                private <T extends cmi.g<T>> void a(cmi.e<T> $$02, c<T> $$14) {
                    String $$13;
                    ImmutableList $$12;
                    tj $$22 = sw.c($$02.b());
                    tj $$3 = sw.b($$02.a()).a(n.o);
                    T $$4 = $$1.a($$02);
                    String $$5 = ((cmi.g)$$4).b();
                    tj $$6 = sw.a("editGamerule.default", sw.b($$5)).a(n.h);
                    String $$7 = $$02.b() + ".description";
                    if (fvz.a($$7)) {
                        ImmutableList.Builder $$8 = ImmutableList.builder().add((Object)$$3.f());
                        tj $$9 = sw.c($$7);
                        ezb.this.i.c($$9, 150).forEach(arg_0 -> ((ImmutableList.Builder)$$8).add(arg_0));
                        ImmutableList $$10 = $$8.add((Object)$$6.f()).build();
                        String $$11 = $$9.getString() + "\n" + $$6.getString();
                    } else {
                        $$12 = ImmutableList.of((Object)$$3.f(), (Object)$$6.f());
                        $$13 = $$6.getString();
                    }
                    $$2.computeIfAbsent($$02.c(), $$0 -> Maps.newHashMap()).put($$02, $$14.create($$22, (List<aom>)$$12, $$13, $$4));
                }
            });
            $$2.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach($$02 -> {
                this.b(new b(sw.c(((cmi.b)((Object)((Object)$$02.getKey()))).a()).a(n.r, n.o)));
                ((Map)$$02.getValue()).entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(cmi.e::a))).forEach($$0 -> this.b((f)$$0.getValue()));
            });
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, float $$3) {
            super.a($$0, $$1, $$2, $$3);
            f $$4 = (f)this.r();
            if ($$4 != null && $$4.a != null) {
                ezb.this.b($$4.a);
            }
        }
    }

    public class e
    extends d {
        private final epr d;

        public e(sw $$12, List<aom> $$2, String $$3, cmi.d $$4) {
            super($$2, $$12);
            this.d = new epr(((ezb)ezb.this).f.h, 10, 5, 42, 20, $$12.e().f("\n").f($$3).f("\n"));
            this.d.a(Integer.toString($$4.a()));
            this.d.b((String $$1) -> {
                if ($$4.b((String)$$1)) {
                    this.d.n(0xE0E0E0);
                    ezb.this.b(this);
                } else {
                    this.d.n(0xFF0000);
                    ezb.this.a(this);
                }
            });
            this.b.add(this.d);
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$2, $$3);
            this.d.e($$3 + $$4 - 44);
            this.d.f($$2);
            this.d.a($$0, $$6, $$7, $$9);
        }
    }

    public class a
    extends d {
        private final epp<Boolean> d;

        public a(sw $$12, List<aom> $$22, String $$3, cmi.a $$4) {
            super($$22, $$12);
            this.d = epp.b($$4.a()).a().a((epp<T> $$1) -> $$1.b().f("\n").f($$3)).a(10, 5, 44, 20, $$12, ($$1, $$2) -> $$4.a((boolean)$$2, (MinecraftServer)null));
            this.b.add(this.d);
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$2, $$3);
            this.d.e($$3 + $$4 - 45);
            this.d.f($$2);
            this.d.a($$0, $$6, $$7, $$9);
        }
    }

    public abstract class d
    extends f {
        private final List<aom> a;
        protected final List<epf> b;

        public d(List<aom> $$1, sw $$2) {
            super($$1);
            this.b = Lists.newArrayList();
            this.a = ((ezb)ezb.this).f.h.c($$2, 175);
        }

        @Override
        public List<? extends eqt> i() {
            return this.b;
        }

        @Override
        public List<? extends esn> b() {
            return this.b;
        }

        protected void a(eox $$0, int $$1, int $$2) {
            if (this.a.size() == 1) {
                $$0.a(((ezb)ezb.this).f.h, this.a.get(0), $$2, $$1 + 5, 0xFFFFFF, false);
            } else if (this.a.size() >= 2) {
                $$0.a(((ezb)ezb.this).f.h, this.a.get(0), $$2, $$1, 0xFFFFFF, false);
                $$0.a(((ezb)ezb.this).f.h, this.a.get(1), $$2, $$1 + 10, 0xFFFFFF, false);
            }
        }
    }

    @FunctionalInterface
    static interface c<T extends cmi.g<T>> {
        public f create(sw var1, List<aom> var2, String var3, T var4);
    }

    public class b
    extends f {
        final sw b;

        public b(sw $$1) {
            super(null);
            this.b = $$1;
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(((ezb)ezb.this).f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 0xFFFFFF);
        }

        @Override
        public List<? extends eqt> i() {
            return ImmutableList.of();
        }

        @Override
        public List<? extends esn> b() {
            return ImmutableList.of((Object)new esn(){

                @Override
                public esn.a q() {
                    return esn.a.b;
                }

                @Override
                public void b(esp $$0) {
                    $$0.a(eso.a, b.this.b);
                }
            });
        }
    }

    public static abstract class f
    extends epo.a<f> {
        @Nullable
        final List<aom> a;

        public f(@Nullable List<aom> $$0) {
            this.a = $$0;
        }
    }
}

