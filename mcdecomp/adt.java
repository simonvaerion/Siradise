/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class adt {
    private static final SuggestionProvider<ds> a = ($$0, $$1) -> {
        Collection<ae> $$2 = ((ds)$$0.getSource()).l().az().a();
        return du.a($$2.stream().map(ae::j), $$1);
    };

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("advancement").requires($$0 -> $$0.c(2))).then(dt.a("grant").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("targets", ec.d()).then(dt.a("only").then(((RequiredArgumentBuilder)dt.a("advancement", eq.a()).suggests(a).executes($$0 -> adt.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), adt$a.a, adt.a(eq.a((CommandContext<ds>)$$0, "advancement"), b.a)))).then(dt.a("criterion", StringArgumentType.greedyString()).suggests(($$0, $$1) -> du.b(eq.a((CommandContext<ds>)$$0, "advancement").h().keySet(), $$1)).executes($$0 -> adt.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), adt$a.a, eq.a((CommandContext<ds>)$$0, "advancement"), StringArgumentType.getString((CommandContext)$$0, (String)"criterion"))))))).then(dt.a("from").then(dt.a("advancement", eq.a()).suggests(a).executes($$0 -> adt.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), adt$a.a, adt.a(eq.a((CommandContext<ds>)$$0, "advancement"), b.c)))))).then(dt.a("until").then(dt.a("advancement", eq.a()).suggests(a).executes($$0 -> adt.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), adt$a.a, adt.a(eq.a((CommandContext<ds>)$$0, "advancement"), b.d)))))).then(dt.a("through").then(dt.a("advancement", eq.a()).suggests(a).executes($$0 -> adt.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), adt$a.a, adt.a(eq.a((CommandContext<ds>)$$0, "advancement"), b.b)))))).then(dt.a("everything").executes($$0 -> adt.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), adt$a.a, ((ds)$$0.getSource()).l().az().a())))))).then(dt.a("revoke").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("targets", ec.d()).then(dt.a("only").then(((RequiredArgumentBuilder)dt.a("advancement", eq.a()).suggests(a).executes($$0 -> adt.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), adt$a.b, adt.a(eq.a((CommandContext<ds>)$$0, "advancement"), b.a)))).then(dt.a("criterion", StringArgumentType.greedyString()).suggests(($$0, $$1) -> du.b(eq.a((CommandContext<ds>)$$0, "advancement").h().keySet(), $$1)).executes($$0 -> adt.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), adt$a.b, eq.a((CommandContext<ds>)$$0, "advancement"), StringArgumentType.getString((CommandContext)$$0, (String)"criterion"))))))).then(dt.a("from").then(dt.a("advancement", eq.a()).suggests(a).executes($$0 -> adt.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), adt$a.b, adt.a(eq.a((CommandContext<ds>)$$0, "advancement"), b.c)))))).then(dt.a("until").then(dt.a("advancement", eq.a()).suggests(a).executes($$0 -> adt.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), adt$a.b, adt.a(eq.a((CommandContext<ds>)$$0, "advancement"), b.d)))))).then(dt.a("through").then(dt.a("advancement", eq.a()).suggests(a).executes($$0 -> adt.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), adt$a.b, adt.a(eq.a((CommandContext<ds>)$$0, "advancement"), b.b)))))).then(dt.a("everything").executes($$0 -> adt.a((ds)$$0.getSource(), ec.f((CommandContext<ds>)$$0, "targets"), adt$a.b, ((ds)$$0.getSource()).l().az().a()))))));
    }

    private static int a(ds $$0, Collection<aig> $$1, a $$2, Collection<ae> $$3) {
        int $$4 = 0;
        for (aig $$5 : $$1) {
            $$4 += $$2.a($$5, $$3);
        }
        if ($$4 == 0) {
            if ($$3.size() == 1) {
                if ($$1.size() == 1) {
                    throw new dp(sw.a($$2.a() + ".one.to.one.failure", $$3.iterator().next().l(), $$1.iterator().next().H_()));
                }
                throw new dp(sw.a($$2.a() + ".one.to.many.failure", $$3.iterator().next().l(), $$1.size()));
            }
            if ($$1.size() == 1) {
                throw new dp(sw.a($$2.a() + ".many.to.one.failure", $$3.size(), $$1.iterator().next().H_()));
            }
            throw new dp(sw.a($$2.a() + ".many.to.many.failure", $$3.size(), $$1.size()));
        }
        if ($$3.size() == 1) {
            if ($$1.size() == 1) {
                $$0.a(() -> sw.a($$2.a() + ".one.to.one.success", ((ae)$$3.iterator().next()).l(), ((aig)$$1.iterator().next()).H_()), true);
            } else {
                $$0.a(() -> sw.a($$2.a() + ".one.to.many.success", ((ae)$$3.iterator().next()).l(), $$1.size()), true);
            }
        } else if ($$1.size() == 1) {
            $$0.a(() -> sw.a($$2.a() + ".many.to.one.success", $$3.size(), ((aig)$$1.iterator().next()).H_()), true);
        } else {
            $$0.a(() -> sw.a($$2.a() + ".many.to.many.success", $$3.size(), $$1.size()), true);
        }
        return $$4;
    }

    private static int a(ds $$0, Collection<aig> $$1, a $$2, ae $$3, String $$4) {
        int $$5 = 0;
        if (!$$3.h().containsKey($$4)) {
            throw new dp(sw.a("commands.advancement.criterionNotFound", $$3.l(), $$4));
        }
        for (aig $$6 : $$1) {
            if (!$$2.a($$6, $$3, $$4)) continue;
            ++$$5;
        }
        if ($$5 == 0) {
            if ($$1.size() == 1) {
                throw new dp(sw.a($$2.a() + ".criterion.to.one.failure", new Object[]{$$4, $$3.l(), $$1.iterator().next().H_()}));
            }
            throw new dp(sw.a($$2.a() + ".criterion.to.many.failure", new Object[]{$$4, $$3.l(), $$1.size()}));
        }
        if ($$1.size() == 1) {
            $$0.a(() -> sw.a($$2.a() + ".criterion.to.one.success", new Object[]{$$4, $$3.l(), ((aig)$$1.iterator().next()).H_()}), true);
        } else {
            $$0.a(() -> sw.a($$2.a() + ".criterion.to.many.success", new Object[]{$$4, $$3.l(), $$1.size()}), true);
        }
        return $$5;
    }

    private static List<ae> a(ae $$0, b $$1) {
        ArrayList $$2 = Lists.newArrayList();
        if ($$1.f) {
            for (ae $$3 = $$0.b(); $$3 != null; $$3 = $$3.b()) {
                $$2.add($$3);
            }
        }
        $$2.add($$0);
        if ($$1.g) {
            adt.a($$0, $$2);
        }
        return $$2;
    }

    private static void a(ae $$0, List<ae> $$1) {
        for (ae $$2 : $$0.g()) {
            $$1.add($$2);
            adt.a($$2, $$1);
        }
    }

    /*
     * Uses 'sealed' constructs - enablewith --sealed true
     */
    static abstract class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("grant"){

            @Override
            protected boolean a(aig $$0, ae $$1) {
                ag $$2 = $$0.M().b($$1);
                if ($$2.a()) {
                    return false;
                }
                for (String $$3 : $$2.e()) {
                    $$0.M().a($$1, $$3);
                }
                return true;
            }

            @Override
            protected boolean a(aig $$0, ae $$1, String $$2) {
                return $$0.M().a($$1, $$2);
            }
        };
        public static final /* enum */ a b = new a("revoke"){

            @Override
            protected boolean a(aig $$0, ae $$1) {
                ag $$2 = $$0.M().b($$1);
                if (!$$2.b()) {
                    return false;
                }
                for (String $$3 : $$2.f()) {
                    $$0.M().b($$1, $$3);
                }
                return true;
            }

            @Override
            protected boolean a(aig $$0, ae $$1, String $$2) {
                return $$0.M().b($$1, $$2);
            }
        };
        private final String c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        a(String $$0) {
            this.c = "commands.advancement." + $$0;
        }

        public int a(aig $$0, Iterable<ae> $$1) {
            int $$2 = 0;
            for (ae $$3 : $$1) {
                if (!this.a($$0, $$3)) continue;
                ++$$2;
            }
            return $$2;
        }

        protected abstract boolean a(aig var1, ae var2);

        protected abstract boolean a(aig var1, ae var2, String var3);

        protected String a() {
            return this.c;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            d = adt$a.b();
        }
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(false, false);
        public static final /* enum */ b b = new b(true, true);
        public static final /* enum */ b c = new b(false, true);
        public static final /* enum */ b d = new b(true, false);
        public static final /* enum */ b e = new b(true, true);
        final boolean f;
        final boolean g;
        private static final /* synthetic */ b[] h;

        public static b[] values() {
            return (b[])h.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(boolean $$0, boolean $$1) {
            this.f = $$0;
            this.g = $$1;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d, e};
        }

        static {
            h = adt$b.a();
        }
    }
}

