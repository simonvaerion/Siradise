/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.google.common.collect.Maps;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

public class gc {
    private static final Map<String, b> i = Maps.newHashMap();
    public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> sw.a("argument.entity.options.unknown", $$0));
    public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("argument.entity.options.inapplicable", $$0));
    public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)sw.c("argument.entity.options.distance.negative"));
    public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)sw.c("argument.entity.options.level.negative"));
    public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)sw.c("argument.entity.options.limit.toosmall"));
    public static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> sw.a("argument.entity.options.sort.irreversible", $$0));
    public static final DynamicCommandExceptionType g = new DynamicCommandExceptionType($$0 -> sw.a("argument.entity.options.mode.invalid", $$0));
    public static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> sw.a("argument.entity.options.type.invalid", $$0));

    private static void a(String $$0, a $$1, Predicate<gb> $$2, sw $$3) {
        i.put($$0, new b($$1, $$2, $$3));
    }

    public static void a() {
        if (!i.isEmpty()) {
            return;
        }
        gc.a("name", $$0 -> {
            int $$1 = $$0.g().getCursor();
            boolean $$22 = $$0.e();
            String $$3 = $$0.g().readString();
            if ($$0.w() && !$$22) {
                $$0.g().setCursor($$1);
                throw b.createWithContext((ImmutableStringReader)$$0.g(), (Object)"name");
            }
            if ($$22) {
                $$0.c(true);
            } else {
                $$0.b(true);
            }
            $$0.a($$2 -> $$2.Z().getString().equals($$3) != $$22);
        }, $$0 -> !$$0.v(), sw.c("argument.entity.options.name.description"));
        gc.a("distance", $$0 -> {
            int $$1 = $$0.g().getCursor();
            cj.c $$2 = cj.c.a($$0.g());
            if ($$2.a() != null && (Double)$$2.a() < 0.0 || $$2.b() != null && (Double)$$2.b() < 0.0) {
                $$0.g().setCursor($$1);
                throw c.createWithContext((ImmutableStringReader)$$0.g());
            }
            $$0.a($$2);
            $$0.h();
        }, $$0 -> $$0.i().c(), sw.c("argument.entity.options.distance.description"));
        gc.a("level", $$0 -> {
            int $$1 = $$0.g().getCursor();
            cj.d $$2 = cj.d.a($$0.g());
            if ($$2.a() != null && (Integer)$$2.a() < 0 || $$2.b() != null && (Integer)$$2.b() < 0) {
                $$0.g().setCursor($$1);
                throw d.createWithContext((ImmutableStringReader)$$0.g());
            }
            $$0.a($$2);
            $$0.a(false);
        }, $$0 -> $$0.j().c(), sw.c("argument.entity.options.level.description"));
        gc.a("x", $$0 -> {
            $$0.h();
            $$0.a($$0.g().readDouble());
        }, $$0 -> $$0.m() == null, sw.c("argument.entity.options.x.description"));
        gc.a("y", $$0 -> {
            $$0.h();
            $$0.b($$0.g().readDouble());
        }, $$0 -> $$0.n() == null, sw.c("argument.entity.options.y.description"));
        gc.a("z", $$0 -> {
            $$0.h();
            $$0.c($$0.g().readDouble());
        }, $$0 -> $$0.o() == null, sw.c("argument.entity.options.z.description"));
        gc.a("dx", $$0 -> {
            $$0.h();
            $$0.d($$0.g().readDouble());
        }, $$0 -> $$0.p() == null, sw.c("argument.entity.options.dx.description"));
        gc.a("dy", $$0 -> {
            $$0.h();
            $$0.e($$0.g().readDouble());
        }, $$0 -> $$0.q() == null, sw.c("argument.entity.options.dy.description"));
        gc.a("dz", $$0 -> {
            $$0.h();
            $$0.f($$0.g().readDouble());
        }, $$0 -> $$0.r() == null, sw.c("argument.entity.options.dz.description"));
        gc.a("x_rotation", $$0 -> $$0.a(di.a($$0.g(), true, apa::g)), $$0 -> $$0.k() == di.a, sw.c("argument.entity.options.x_rotation.description"));
        gc.a("y_rotation", $$0 -> $$0.b(di.a($$0.g(), true, apa::g)), $$0 -> $$0.l() == di.a, sw.c("argument.entity.options.y_rotation.description"));
        gc.a("limit", $$0 -> {
            int $$1 = $$0.g().getCursor();
            int $$2 = $$0.g().readInt();
            if ($$2 < 1) {
                $$0.g().setCursor($$1);
                throw e.createWithContext((ImmutableStringReader)$$0.g());
            }
            $$0.a($$2);
            $$0.d(true);
        }, $$0 -> !$$0.u() && !$$0.x(), sw.c("argument.entity.options.limit.description"));
        gc.a("sort", $$02 -> {
            int $$12 = $$02.g().getCursor();
            String $$2 = $$02.g().readUnquotedString();
            $$02.a(($$0, $$1) -> du.b(Arrays.asList("nearest", "furthest", "random", "arbitrary"), $$0));
            $$02.a(switch ($$2) {
                case "nearest" -> gb.k;
                case "furthest" -> gb.l;
                case "random" -> gb.m;
                case "arbitrary" -> ga.b;
                default -> {
                    $$02.g().setCursor($$12);
                    throw f.createWithContext((ImmutableStringReader)$$02.g(), (Object)$$2);
                }
            });
            $$02.e(true);
        }, $$0 -> !$$0.u() && !$$0.y(), sw.c("argument.entity.options.sort.description"));
        gc.a("gamemode", $$0 -> {
            $$0.a(($$1, $$2) -> {
                String $$3 = $$1.getRemaining().toLowerCase(Locale.ROOT);
                boolean $$4 = !$$0.A();
                boolean $$5 = true;
                if (!$$3.isEmpty()) {
                    if ($$3.charAt(0) == '!') {
                        $$4 = false;
                        $$3 = $$3.substring(1);
                    } else {
                        $$5 = false;
                    }
                }
                for (cmj $$6 : cmj.values()) {
                    if (!$$6.b().toLowerCase(Locale.ROOT).startsWith($$3)) continue;
                    if ($$5) {
                        $$1.suggest("!" + $$6.b());
                    }
                    if (!$$4) continue;
                    $$1.suggest($$6.b());
                }
                return $$1.buildFuture();
            });
            int $$12 = $$0.g().getCursor();
            boolean $$22 = $$0.e();
            if ($$0.A() && !$$22) {
                $$0.g().setCursor($$12);
                throw b.createWithContext((ImmutableStringReader)$$0.g(), (Object)"gamemode");
            }
            String $$3 = $$0.g().readUnquotedString();
            cmj $$4 = cmj.a($$3, null);
            if ($$4 == null) {
                $$0.g().setCursor($$12);
                throw g.createWithContext((ImmutableStringReader)$$0.g(), (Object)$$3);
            }
            $$0.a(false);
            $$0.a($$2 -> {
                if (!($$2 instanceof aig)) {
                    return false;
                }
                cmj $$3 = ((aig)$$2).e.b();
                return $$22 ? $$3 != $$4 : $$3 == $$4;
            });
            if ($$22) {
                $$0.g(true);
            } else {
                $$0.f(true);
            }
        }, $$0 -> !$$0.z(), sw.c("argument.entity.options.gamemode.description"));
        gc.a("team", $$0 -> {
            boolean $$1 = $$0.e();
            String $$22 = $$0.g().readUnquotedString();
            $$0.a($$2 -> {
                if (!($$2 instanceof bfz)) {
                    return false;
                }
                efi $$3 = $$2.cd();
                String $$4 = $$3 == null ? "" : $$3.b();
                return $$4.equals($$22) != $$1;
            });
            if ($$1) {
                $$0.i(true);
            } else {
                $$0.h(true);
            }
        }, $$0 -> !$$0.B(), sw.c("argument.entity.options.team.description"));
        gc.a("type", $$0 -> {
            $$0.a(($$1, $$2) -> {
                du.a(jb.h.e(), $$1, String.valueOf('!'));
                du.a(jb.h.j().map(anl::b), $$1, "!#");
                if (!$$0.F()) {
                    du.a(jb.h.e(), $$1);
                    du.a(jb.h.j().map(anl::b), $$1, String.valueOf('#'));
                }
                return $$1.buildFuture();
            });
            int $$12 = $$0.g().getCursor();
            boolean $$22 = $$0.e();
            if ($$0.F() && !$$22) {
                $$0.g().setCursor($$12);
                throw b.createWithContext((ImmutableStringReader)$$0.g(), (Object)"type");
            }
            if ($$22) {
                $$0.D();
            }
            if ($$0.f()) {
                anl<bfn<?>> $$3 = anl.a(jc.s, acq.a($$0.g()));
                $$0.a($$2 -> $$2.ae().a($$3) != $$22);
            } else {
                acq $$4 = acq.a($$0.g());
                bfn $$5 = (bfn)jb.h.b($$4).orElseThrow(() -> {
                    $$0.g().setCursor($$12);
                    return h.createWithContext((ImmutableStringReader)$$0.g(), (Object)$$4.toString());
                });
                if (Objects.equals(bfn.bt, $$5) && !$$22) {
                    $$0.a(false);
                }
                $$0.a($$2 -> Objects.equals($$5, $$2.ae()) != $$22);
                if (!$$22) {
                    $$0.a($$5);
                }
            }
        }, $$0 -> !$$0.E(), sw.c("argument.entity.options.type.description"));
        gc.a("tag", $$0 -> {
            boolean $$1 = $$0.e();
            String $$22 = $$0.g().readUnquotedString();
            $$0.a($$2 -> {
                if ("".equals($$22)) {
                    return $$2.ag().isEmpty() != $$1;
                }
                return $$2.ag().contains($$22) != $$1;
            });
        }, $$0 -> true, sw.c("argument.entity.options.tag.description"));
        gc.a("nbt", $$0 -> {
            boolean $$1 = $$0.e();
            qr $$22 = new rl($$0.g()).f();
            $$0.a($$2 -> {
                cfz $$4;
                qr $$3 = $$2.f(new qr());
                if ($$2 instanceof aig && !($$4 = ((aig)$$2).fN().f()).b()) {
                    $$3.a("SelectedItem", $$4.b(new qr()));
                }
                return rd.a((rk)$$22, $$3, true) != $$1;
            });
        }, $$0 -> true, sw.c("argument.entity.options.nbt.description"));
        gc.a("scores", $$0 -> {
            StringReader $$12 = $$0.g();
            HashMap $$2 = Maps.newHashMap();
            $$12.expect('{');
            $$12.skipWhitespace();
            while ($$12.canRead() && $$12.peek() != '}') {
                $$12.skipWhitespace();
                String $$3 = $$12.readUnquotedString();
                $$12.skipWhitespace();
                $$12.expect('=');
                $$12.skipWhitespace();
                cj.d $$4 = cj.d.a($$12);
                $$2.put($$3, $$4);
                $$12.skipWhitespace();
                if (!$$12.canRead() || $$12.peek() != ',') continue;
                $$12.skip();
            }
            $$12.expect('}');
            if (!$$2.isEmpty()) {
                $$0.a($$1 -> {
                    adg $$2 = $$1.cI().aF();
                    String $$3 = $$1.cv();
                    for (Map.Entry $$4 : $$2.entrySet()) {
                        efd $$5 = $$2.d((String)$$4.getKey());
                        if ($$5 == null) {
                            return false;
                        }
                        if (!$$2.b($$3, $$5)) {
                            return false;
                        }
                        eff $$6 = $$2.c($$3, $$5);
                        int $$7 = $$6.b();
                        if (((cj.d)$$4.getValue()).d($$7)) continue;
                        return false;
                    }
                    return true;
                });
            }
            $$0.j(true);
        }, $$0 -> !$$0.G(), sw.c("argument.entity.options.scores.description"));
        gc.a("advancements", $$0 -> {
            StringReader $$12 = $$0.g();
            HashMap $$2 = Maps.newHashMap();
            $$12.expect('{');
            $$12.skipWhitespace();
            while ($$12.canRead() && $$12.peek() != '}') {
                $$12.skipWhitespace();
                acq $$3 = acq.a($$12);
                $$12.skipWhitespace();
                $$12.expect('=');
                $$12.skipWhitespace();
                if ($$12.canRead() && $$12.peek() == '{') {
                    HashMap $$4 = Maps.newHashMap();
                    $$12.skipWhitespace();
                    $$12.expect('{');
                    $$12.skipWhitespace();
                    while ($$12.canRead() && $$12.peek() != '}') {
                        $$12.skipWhitespace();
                        String $$5 = $$12.readUnquotedString();
                        $$12.skipWhitespace();
                        $$12.expect('=');
                        $$12.skipWhitespace();
                        boolean $$6 = $$12.readBoolean();
                        $$4.put($$5, $$1 -> $$1.a() == $$6);
                        $$12.skipWhitespace();
                        if (!$$12.canRead() || $$12.peek() != ',') continue;
                        $$12.skip();
                    }
                    $$12.skipWhitespace();
                    $$12.expect('}');
                    $$12.skipWhitespace();
                    $$2.put($$3, $$1 -> {
                        for (Map.Entry $$2 : $$4.entrySet()) {
                            ak $$3 = $$1.c((String)$$2.getKey());
                            if ($$3 != null && ((Predicate)$$2.getValue()).test($$3)) continue;
                            return false;
                        }
                        return true;
                    });
                } else {
                    boolean $$7 = $$12.readBoolean();
                    $$2.put($$3, $$1 -> $$1.a() == $$7);
                }
                $$12.skipWhitespace();
                if (!$$12.canRead() || $$12.peek() != ',') continue;
                $$12.skip();
            }
            $$12.expect('}');
            if (!$$2.isEmpty()) {
                $$0.a($$1 -> {
                    if (!($$1 instanceof aig)) {
                        return false;
                    }
                    aig $$2 = (aig)$$1;
                    acy $$3 = $$2.M();
                    adc $$4 = $$2.cI().az();
                    for (Map.Entry $$5 : $$2.entrySet()) {
                        ae $$6 = $$4.a((acq)$$5.getKey());
                        if ($$6 != null && ((Predicate)$$5.getValue()).test($$3.b($$6))) continue;
                        return false;
                    }
                    return true;
                });
                $$0.a(false);
            }
            $$0.k(true);
        }, $$0 -> !$$0.H(), sw.c("argument.entity.options.advancements.description"));
        gc.a("predicate", $$0 -> {
            boolean $$1 = $$0.e();
            acq $$22 = acq.a($$0.g());
            $$0.a($$2 -> {
                if (!($$2.dI() instanceof aif)) {
                    return false;
                }
                aif $$3 = (aif)$$2.dI();
                eck $$4 = $$3.n().aH().getElement(dzp.a, $$22);
                if ($$4 == null) {
                    return false;
                }
                dzq $$5 = new dzq.a($$3).a(ebw.a, $$2).a(ebw.f, $$2.dg()).a(ebv.d);
                dzk $$6 = new dzk.a($$5).a(null);
                $$6.b(dzk.a($$4));
                return $$1 ^ $$4.test($$6);
            });
        }, $$0 -> true, sw.c("argument.entity.options.predicate.description"));
    }

    public static a a(gb $$0, String $$1, int $$2) throws CommandSyntaxException {
        b $$3 = i.get($$1);
        if ($$3 != null) {
            if ($$3.b.test($$0)) {
                return $$3.a;
            }
            throw b.createWithContext((ImmutableStringReader)$$0.g(), (Object)$$1);
        }
        $$0.g().setCursor($$2);
        throw a.createWithContext((ImmutableStringReader)$$0.g(), (Object)$$1);
    }

    public static void a(gb $$0, SuggestionsBuilder $$1) {
        String $$2 = $$1.getRemaining().toLowerCase(Locale.ROOT);
        for (Map.Entry<String, b> $$3 : i.entrySet()) {
            if (!$$3.getValue().b.test($$0) || !$$3.getKey().toLowerCase(Locale.ROOT).startsWith($$2)) continue;
            $$1.suggest($$3.getKey() + "=", (Message)$$3.getValue().c);
        }
    }

    static final class b
    extends Record {
        final a a;
        final Predicate<gb> b;
        final sw c;

        b(a $$0, Predicate<gb> $$1, sw $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "modifier;canUse;description", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "modifier;canUse;description", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "modifier;canUse;description", "a", "b", "c"}, this, $$0);
        }

        public a a() {
            return this.a;
        }

        public Predicate<gb> b() {
            return this.b;
        }

        public sw c() {
            return this.c;
        }
    }

    public static interface a {
        public void handle(gb var1) throws CommandSyntaxException;
    }
}

