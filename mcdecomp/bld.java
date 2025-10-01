/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.kinds.Applicative$Mu
 *  com.mojang.datafixers.kinds.Const$Mu
 *  com.mojang.datafixers.kinds.IdF
 *  com.mojang.datafixers.kinds.IdF$Mu
 *  com.mojang.datafixers.kinds.K1
 *  com.mojang.datafixers.kinds.OptionalBox
 *  com.mojang.datafixers.kinds.OptionalBox$Mu
 *  com.mojang.datafixers.util.Function3
 *  com.mojang.datafixers.util.Function4
 *  com.mojang.datafixers.util.Unit
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bld<E extends bfz, M>
implements App<c<E>, M> {
    private final e<E, M> a;

    public static <E extends bfz, M> bld<E, M> a(App<c<E>, M> $$0) {
        return (bld)$$0;
    }

    public static <E extends bfz> b<E> a() {
        return new b();
    }

    public static <E extends bfz> bjb<E> a(Function<b<E>, ? extends App<c<E>, blg<E>>> $$0) {
        final e<E, blg<E>> $$1 = bld.b($$0.apply(bld.a()));
        return new bjb<E>(){

            @Override
            public boolean trigger(aif $$0, E $$12, long $$2) {
                blg $$3 = (blg)$$1.a($$0, $$12, $$2);
                if ($$3 == null) {
                    return false;
                }
                return $$3.trigger($$0, $$12, $$2);
            }

            @Override
            public String b() {
                return "OneShot[" + $$1.a() + "]";
            }

            public String toString() {
                return this.b();
            }
        };
    }

    public static <E extends bfz> bjb<E> a(blg<? super E> $$0, blg<? super E> $$1) {
        return bld.a((b<E> $$2) -> $$2.group($$2.a($$0)).apply((Applicative)$$2, $$1 -> $$1::trigger));
    }

    public static <E extends bfz> bjb<E> a(Predicate<E> $$0, bjb<? super E> $$1) {
        return bld.a(bld.a($$0), $$1);
    }

    public static <E extends bfz> bjb<E> a(Predicate<E> $$0) {
        return bld.a((b<E> $$12) -> $$12.a(($$1, $$2, $$3) -> $$0.test($$2)));
    }

    public static <E extends bfz> bjb<E> a(BiPredicate<aif, E> $$0) {
        return bld.a((b<E> $$12) -> $$12.a(($$1, $$2, $$3) -> $$0.test($$1, $$2)));
    }

    static <E extends bfz, M> e<E, M> b(App<c<E>, M> $$0) {
        return bld.a($$0).a;
    }

    bld(e<E, M> $$0) {
        this.a = $$0;
    }

    static <E extends bfz, M> bld<E, M> a(e<E, M> $$0) {
        return new bld<E, M>($$0);
    }

    public static final class b<E extends bfz>
    implements Applicative<c<E>, a<E>> {
        public <Value> Optional<Value> a(ble<OptionalBox.Mu, Value> $$0) {
            return OptionalBox.unbox($$0.a());
        }

        public <Value> Value b(ble<IdF.Mu, Value> $$0) {
            return (Value)IdF.get($$0.a());
        }

        public <Value> bld<E, ble<OptionalBox.Mu, Value>> a(bpb<Value> $$0) {
            return new d(new blf.c<Value>($$0));
        }

        public <Value> bld<E, ble<IdF.Mu, Value>> b(bpb<Value> $$0) {
            return new d(new blf.b<Value>($$0));
        }

        public <Value> bld<E, ble<Const.Mu<Unit>, Value>> c(bpb<Value> $$0) {
            return new d(new blf.a<Value>($$0));
        }

        public bld<E, Unit> a(blg<? super E> $$0) {
            return new f<E>($$0);
        }

        public <A> bld<E, A> a(A $$0) {
            return new bld$a($$0);
        }

        public <A> bld<E, A> a(Supplier<String> $$0, A $$1) {
            return new bld$a($$1, $$0);
        }

        public <A, R> Function<App<c<E>, A>, App<c<E>, R>> lift1(App<c<E>, Function<A, R>> $$0) {
            return $$1 -> {
                final e $$2 = bld.b($$1);
                final e $$3 = bld.b($$0);
                return bld.a(new e<E, R>(){

                    @Override
                    public R a(aif $$0, E $$1, long $$22) {
                        Object $$32 = $$2.a($$0, $$1, $$22);
                        if ($$32 == null) {
                            return null;
                        }
                        Function $$4 = (Function)$$3.a($$0, $$1, $$22);
                        if ($$4 == null) {
                            return null;
                        }
                        return $$4.apply($$32);
                    }

                    @Override
                    public String a() {
                        return $$3.a() + " * " + $$2.a();
                    }

                    public String toString() {
                        return this.a();
                    }
                });
            };
        }

        public <T, R> bld<E, R> a(final Function<? super T, ? extends R> $$0, App<c<E>, T> $$1) {
            final e<E, T> $$2 = bld.b($$1);
            return bld.a(new e<E, R>(){

                @Override
                public R a(aif $$02, E $$1, long $$22) {
                    Object $$3 = $$2.a($$02, $$1, $$22);
                    if ($$3 == null) {
                        return null;
                    }
                    return $$0.apply($$3);
                }

                @Override
                public String a() {
                    return $$2.a() + ".map[" + $$0 + "]";
                }

                public String toString() {
                    return this.a();
                }
            });
        }

        public <A, B, R> bld<E, R> a(App<c<E>, BiFunction<A, B, R>> $$0, App<c<E>, A> $$1, App<c<E>, B> $$2) {
            final e<E, A> $$3 = bld.b($$1);
            final e<E, B> $$4 = bld.b($$2);
            final e<E, BiFunction<A, B, R>> $$5 = bld.b($$0);
            return bld.a(new e<E, R>(){

                @Override
                public R a(aif $$0, E $$1, long $$2) {
                    Object $$32 = $$3.a($$0, $$1, $$2);
                    if ($$32 == null) {
                        return null;
                    }
                    Object $$42 = $$4.a($$0, $$1, $$2);
                    if ($$42 == null) {
                        return null;
                    }
                    BiFunction $$52 = (BiFunction)$$5.a($$0, $$1, $$2);
                    if ($$52 == null) {
                        return null;
                    }
                    return $$52.apply($$32, $$42);
                }

                @Override
                public String a() {
                    return $$5.a() + " * " + $$3.a() + " * " + $$4.a();
                }

                public String toString() {
                    return this.a();
                }
            });
        }

        public <T1, T2, T3, R> bld<E, R> a(App<c<E>, Function3<T1, T2, T3, R>> $$0, App<c<E>, T1> $$1, App<c<E>, T2> $$2, App<c<E>, T3> $$3) {
            final e<E, T1> $$4 = bld.b($$1);
            final e<E, T2> $$5 = bld.b($$2);
            final e<E, T3> $$6 = bld.b($$3);
            final e<E, Function3<T1, T2, T3, R>> $$7 = bld.b($$0);
            return bld.a(new e<E, R>(){

                @Override
                public R a(aif $$0, E $$1, long $$2) {
                    Object $$3 = $$4.a($$0, $$1, $$2);
                    if ($$3 == null) {
                        return null;
                    }
                    Object $$42 = $$5.a($$0, $$1, $$2);
                    if ($$42 == null) {
                        return null;
                    }
                    Object $$52 = $$6.a($$0, $$1, $$2);
                    if ($$52 == null) {
                        return null;
                    }
                    Function3 $$62 = (Function3)$$7.a($$0, $$1, $$2);
                    if ($$62 == null) {
                        return null;
                    }
                    return $$62.apply($$3, $$42, $$52);
                }

                @Override
                public String a() {
                    return $$7.a() + " * " + $$4.a() + " * " + $$5.a() + " * " + $$6.a();
                }

                public String toString() {
                    return this.a();
                }
            });
        }

        public <T1, T2, T3, T4, R> bld<E, R> a(App<c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<c<E>, T1> $$1, App<c<E>, T2> $$2, App<c<E>, T3> $$3, App<c<E>, T4> $$4) {
            final e<E, T1> $$5 = bld.b($$1);
            final e<E, T2> $$6 = bld.b($$2);
            final e<E, T3> $$7 = bld.b($$3);
            final e<E, T4> $$8 = bld.b($$4);
            final e<E, Function4<T1, T2, T3, T4, R>> $$9 = bld.b($$0);
            return bld.a(new e<E, R>(){

                @Override
                public R a(aif $$0, E $$1, long $$2) {
                    Object $$3 = $$5.a($$0, $$1, $$2);
                    if ($$3 == null) {
                        return null;
                    }
                    Object $$4 = $$6.a($$0, $$1, $$2);
                    if ($$4 == null) {
                        return null;
                    }
                    Object $$52 = $$7.a($$0, $$1, $$2);
                    if ($$52 == null) {
                        return null;
                    }
                    Object $$62 = $$8.a($$0, $$1, $$2);
                    if ($$62 == null) {
                        return null;
                    }
                    Function4 $$72 = (Function4)$$9.a($$0, $$1, $$2);
                    if ($$72 == null) {
                        return null;
                    }
                    return $$72.apply($$3, $$4, $$52, $$62);
                }

                @Override
                public String a() {
                    return $$9.a() + " * " + $$5.a() + " * " + $$6.a() + " * " + $$7.a() + " * " + $$8.a();
                }

                public String toString() {
                    return this.a();
                }
            });
        }

        public /* synthetic */ App ap4(App app2, App app3, App app4, App app5, App app6) {
            return this.a(app2, app3, app4, app5, app6);
        }

        public /* synthetic */ App ap3(App app2, App app3, App app4, App app5) {
            return this.a(app2, app3, app4, app5);
        }

        public /* synthetic */ App ap2(App app2, App app3, App app4) {
            return this.a(app2, app3, app4);
        }

        public /* synthetic */ App point(Object object) {
            return this.a(object);
        }

        public /* synthetic */ App map(Function function, App app2) {
            return this.a(function, app2);
        }

        static final class a<E extends bfz>
        implements Applicative.Mu {
            private a() {
            }
        }
    }

    static interface e<E extends bfz, R> {
        @Nullable
        public R a(aif var1, E var2, long var3);

        public String a();
    }

    static final class f<E extends bfz>
    extends bld<E, Unit> {
        f(final blg<? super E> $$0) {
            super(new e<E, Unit>(){

                @Nullable
                public Unit b(aif $$02, E $$1, long $$2) {
                    return $$0.trigger($$02, $$1, $$2) ? Unit.INSTANCE : null;
                }

                @Override
                public String a() {
                    return "T[" + $$0 + "]";
                }

                @Override
                @Nullable
                public /* synthetic */ Object a(aif aif2, bfz bfz2, long l2) {
                    return this.b(aif2, bfz2, l2);
                }
            });
        }
    }

    static final class a<E extends bfz, A>
    extends bld<E, A> {
        a(A $$0) {
            this($$0, () -> "C[" + $$0 + "]");
        }

        a(final A $$0, final Supplier<String> $$1) {
            super(new e<E, A>(){

                @Override
                public A a(aif $$02, E $$12, long $$2) {
                    return $$0;
                }

                @Override
                public String a() {
                    return (String)$$1.get();
                }

                public String toString() {
                    return this.a();
                }
            });
        }
    }

    static final class d<E extends bfz, F extends K1, Value>
    extends bld<E, ble<F, Value>> {
        d(final blf<F, Value> $$0) {
            super(new e<E, ble<F, Value>>(){

                public ble<F, Value> b(aif $$02, E $$1, long $$2) {
                    bha<?> $$3 = ((bfz)$$1).dK();
                    Optional $$4 = $$3.d($$0.a());
                    if ($$4 == null) {
                        return null;
                    }
                    return $$0.a($$3, $$4);
                }

                @Override
                public String a() {
                    return "M[" + $$0 + "]";
                }

                public String toString() {
                    return this.a();
                }

                @Override
                public /* synthetic */ Object a(aif aif2, bfz bfz2, long l2) {
                    return this.b(aif2, bfz2, l2);
                }
            });
        }
    }

    public static final class c<E extends bfz>
    implements K1 {
    }
}

