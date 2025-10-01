/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class agg {
    private static final int a = 10000;
    private static final Dynamic4CommandExceptionType b = new Dynamic4CommandExceptionType(($$0, $$1, $$2, $$3) -> sw.a("commands.spreadplayers.failed.teams", $$0, $$1, $$2, $$3));
    private static final Dynamic4CommandExceptionType c = new Dynamic4CommandExceptionType(($$0, $$1, $$2, $$3) -> sw.a("commands.spreadplayers.failed.entities", $$0, $$1, $$2, $$3));
    private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.spreadplayers.failed.invalid.height", $$0, $$1));

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("spreadplayers").requires($$0 -> $$0.c(2))).then(dt.a("center", fo.a()).then(dt.a("spreadDistance", FloatArgumentType.floatArg((float)0.0f)).then(((RequiredArgumentBuilder)dt.a("maxRange", FloatArgumentType.floatArg((float)1.0f)).then(dt.a("respectTeams", BoolArgumentType.bool()).then(dt.a("targets", ec.b()).executes($$0 -> agg.a((ds)$$0.getSource(), fo.a((CommandContext<ds>)$$0, "center"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"spreadDistance"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"maxRange"), ((ds)$$0.getSource()).e().aj(), BoolArgumentType.getBool((CommandContext)$$0, (String)"respectTeams"), ec.b((CommandContext<ds>)$$0, "targets")))))).then(dt.a("under").then(dt.a("maxHeight", IntegerArgumentType.integer()).then(dt.a("respectTeams", BoolArgumentType.bool()).then(dt.a("targets", ec.b()).executes($$0 -> agg.a((ds)$$0.getSource(), fo.a((CommandContext<ds>)$$0, "center"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"spreadDistance"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"maxRange"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"maxHeight"), BoolArgumentType.getBool((CommandContext)$$0, (String)"respectTeams"), ec.b((CommandContext<ds>)$$0, "targets")))))))))));
    }

    private static int a(ds $$0, eeh $$1, float $$2, float $$3, int $$4, boolean $$5, Collection<? extends bfj> $$6) throws CommandSyntaxException {
        aif $$7 = $$0.e();
        int $$8 = $$7.C_();
        if ($$4 < $$8) {
            throw d.create((Object)$$4, (Object)$$8);
        }
        apf $$9 = apf.a();
        double $$10 = $$1.i - $$3;
        double $$11 = $$1.j - $$3;
        double $$12 = $$1.i + $$3;
        double $$13 = $$1.j + $$3;
        a[] $$14 = agg.a($$9, $$5 ? agg.a($$6) : $$6.size(), $$10, $$11, $$12, $$13);
        agg.a($$1, $$2, $$7, $$9, $$10, $$11, $$12, $$13, $$4, $$14, $$5);
        double $$15 = agg.a($$6, $$7, $$14, $$4, $$5);
        $$0.a(() -> sw.a("commands.spreadplayers.success." + ($$5 ? "teams" : "entities"), $$14.length, Float.valueOf($$2.i), Float.valueOf($$2.j), String.format(Locale.ROOT, "%.2f", $$15)), true);
        return $$14.length;
    }

    private static int a(Collection<? extends bfj> $$0) {
        HashSet $$1 = Sets.newHashSet();
        for (bfj bfj2 : $$0) {
            if (bfj2 instanceof byo) {
                $$1.add(bfj2.cd());
                continue;
            }
            $$1.add(null);
        }
        return $$1.size();
    }

    private static void a(eeh $$0, double $$1, aif $$2, apf $$3, double $$4, double $$5, double $$6, double $$7, int $$8, a[] $$9, boolean $$10) throws CommandSyntaxException {
        int $$13;
        boolean $$11 = true;
        double $$12 = 3.4028234663852886E38;
        for ($$13 = 0; $$13 < 10000 && $$11; ++$$13) {
            $$11 = false;
            $$12 = 3.4028234663852886E38;
            for (int $$14 = 0; $$14 < $$9.length; ++$$14) {
                a $$15 = $$9[$$14];
                int $$16 = 0;
                a $$17 = new a();
                for (int $$18 = 0; $$18 < $$9.length; ++$$18) {
                    if ($$14 == $$18) continue;
                    a $$19 = $$9[$$18];
                    double $$20 = $$15.a($$19);
                    $$12 = Math.min($$20, $$12);
                    if (!($$20 < $$1)) continue;
                    ++$$16;
                    $$17.a += $$19.a - $$15.a;
                    $$17.b += $$19.b - $$15.b;
                }
                if ($$16 > 0) {
                    $$17.a /= (double)$$16;
                    $$17.b /= (double)$$16;
                    double $$21 = $$17.b();
                    if ($$21 > 0.0) {
                        $$17.a();
                        $$15.b($$17);
                    } else {
                        $$15.a($$3, $$4, $$5, $$6, $$7);
                    }
                    $$11 = true;
                }
                if (!$$15.a($$4, $$5, $$6, $$7)) continue;
                $$11 = true;
            }
            if ($$11) continue;
            for (a $$22 : $$9) {
                if ($$22.b($$2, $$8)) continue;
                $$22.a($$3, $$4, $$5, $$6, $$7);
                $$11 = true;
            }
        }
        if ($$12 == 3.4028234663852886E38) {
            $$12 = 0.0;
        }
        if ($$13 >= 10000) {
            if ($$10) {
                throw b.create((Object)$$9.length, (Object)Float.valueOf($$0.i), (Object)Float.valueOf($$0.j), (Object)String.format(Locale.ROOT, "%.2f", $$12));
            }
            throw c.create((Object)$$9.length, (Object)Float.valueOf($$0.i), (Object)Float.valueOf($$0.j), (Object)String.format(Locale.ROOT, "%.2f", $$12));
        }
    }

    private static double a(Collection<? extends bfj> $$0, aif $$1, a[] $$2, int $$3, boolean $$4) {
        double $$5 = 0.0;
        int $$6 = 0;
        HashMap $$7 = Maps.newHashMap();
        for (bfj bfj2 : $$0) {
            a $$11;
            if ($$4) {
                efi $$9;
                efi efi2 = $$9 = bfj2 instanceof byo ? bfj2.cd() : null;
                if (!$$7.containsKey($$9)) {
                    $$7.put($$9, $$2[$$6++]);
                }
                a $$10 = (a)$$7.get($$9);
            } else {
                $$11 = $$2[$$6++];
            }
            bfj2.a($$1, (double)apa.a($$11.a) + 0.5, (double)$$11.a($$1, $$3), (double)apa.a($$11.b) + 0.5, Set.of(), bfj2.dy(), bfj2.dA());
            double $$12 = Double.MAX_VALUE;
            for (a $$13 : $$2) {
                if ($$11 == $$13) continue;
                double $$14 = $$11.a($$13);
                $$12 = Math.min($$14, $$12);
            }
            $$5 += $$12;
        }
        if ($$0.size() < 2) {
            return 0.0;
        }
        return $$5 /= (double)$$0.size();
    }

    private static a[] a(apf $$0, int $$1, double $$2, double $$3, double $$4, double $$5) {
        a[] $$6 = new a[$$1];
        for (int $$7 = 0; $$7 < $$6.length; ++$$7) {
            a $$8 = new a();
            $$8.a($$0, $$2, $$3, $$4, $$5);
            $$6[$$7] = $$8;
        }
        return $$6;
    }

    static class a {
        double a;
        double b;

        a() {
        }

        double a(a $$0) {
            double $$1 = this.a - $$0.a;
            double $$2 = this.b - $$0.b;
            return Math.sqrt($$1 * $$1 + $$2 * $$2);
        }

        void a() {
            double $$0 = this.b();
            this.a /= $$0;
            this.b /= $$0;
        }

        double b() {
            return Math.sqrt(this.a * this.a + this.b * this.b);
        }

        public void b(a $$0) {
            this.a -= $$0.a;
            this.b -= $$0.b;
        }

        public boolean a(double $$0, double $$1, double $$2, double $$3) {
            boolean $$4 = false;
            if (this.a < $$0) {
                this.a = $$0;
                $$4 = true;
            } else if (this.a > $$2) {
                this.a = $$2;
                $$4 = true;
            }
            if (this.b < $$1) {
                this.b = $$1;
                $$4 = true;
            } else if (this.b > $$3) {
                this.b = $$3;
                $$4 = true;
            }
            return $$4;
        }

        public int a(cls $$0, int $$1) {
            gu.a $$2 = new gu.a(this.a, (double)($$1 + 1), this.b);
            boolean $$3 = $$0.a_($$2).i();
            $$2.c(ha.a);
            boolean $$4 = $$0.a_($$2).i();
            while ($$2.v() > $$0.C_()) {
                $$2.c(ha.a);
                boolean $$5 = $$0.a_($$2).i();
                if (!$$5 && $$4 && $$3) {
                    return $$2.v() + 1;
                }
                $$3 = $$4;
                $$4 = $$5;
            }
            return $$1 + 1;
        }

        public boolean b(cls $$0, int $$1) {
            gu $$2 = gu.a(this.a, (double)(this.a($$0, $$1) - 1), this.b);
            dcb $$3 = $$0.a_($$2);
            return $$2.v() < $$1 && !$$3.k() && !$$3.a(amw.aI);
        }

        public void a(apf $$0, double $$1, double $$2, double $$3, double $$4) {
            this.a = apa.a($$0, $$1, $$3);
            this.b = apa.a($$0, $$2, $$4);
        }
    }
}

