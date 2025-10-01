/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.CommandContextBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.RootCommandNode
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dt {
    private static final Logger f = LogUtils.getLogger();
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    private final CommandDispatcher<ds> g = new CommandDispatcher();

    public dt(a $$02, dm $$12) {
        adt.a(this.g);
        adu.a(this.g, $$12);
        aen.a(this.g, $$12);
        ady.a(this.g);
        aea.a(this.g, $$12);
        aeb.a(this.g, $$12);
        aec.a(this.g, $$12);
        agy.a(this.g);
        aed.a(this.g);
        aef.a(this.g);
        aei.a(this.g);
        aej.a(this.g);
        aek.a(this.g, $$12);
        ael.a(this.g);
        aem.a(this.g, $$12);
        aeo.a(this.g);
        aeq.a(this.g, $$12);
        aep.a(this.g, $$12);
        aer.a(this.g);
        aes.a(this.g);
        aet.a(this.g);
        aeu.a(this.g);
        aev.a(this.g, $$12);
        aew.a(this.g);
        aex.a(this.g, $$12);
        aez.a(this.g);
        afa.a(this.g);
        afb.a(this.g);
        afc.a(this.g, $$12);
        afd.a(this.g, $$12);
        afe.a(this.g);
        afi.a(this.g, $$12);
        afk.a(this.g);
        afl.a(this.g);
        afp.a(this.g);
        afo.a(this.g);
        afr.a(this.g);
        afs.a(this.g);
        afw.a(this.g);
        afx.a(this.g);
        afy.a(this.g);
        afz.a(this.g, $$02 != dt$a.c);
        aga.a(this.g, $$12);
        agc.a(this.g);
        agd.a(this.g);
        agf.a(this.g);
        agg.a(this.g);
        agi.a(this.g);
        agj.a(this.g, $$12);
        agk.a(this.g);
        agl.a(this.g);
        agm.a(this.g);
        agn.a(this.g);
        ago.a(this.g);
        agp.a(this.g);
        agq.a(this.g);
        agr.a(this.g);
        agt.a(this.g);
        agv.a(this.g);
        if (bat.e.d()) {
            aey.a(this.g);
        }
        if (aa.aS) {
            qh.a(this.g);
            age.a(this.g);
        }
        if ($$02.e) {
            adv.a(this.g);
            adw.a(this.g);
            adx.a(this.g);
            aee.a(this.g);
            aff.a(this.g);
            afg.a(this.g);
            afh.a(this.g);
            afj.a(this.g);
            aft.a(this.g);
            afu.a(this.g);
            afv.a(this.g);
            agb.a(this.g);
            agh.a(this.g);
            agu.a(this.g);
        }
        if ($$02.d) {
            afm.a(this.g);
        }
        this.g.setConsumer(($$0, $$1, $$2) -> ((ds)$$0.getSource()).a((CommandContext<ds>)$$0, $$1, $$2));
    }

    public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
        CommandContextBuilder $$2 = $$0.getContext();
        CommandContextBuilder $$3 = $$2.withSource($$1.apply($$2.getSource()));
        return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
    }

    public int a(ds $$0, String $$1) {
        $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
        return this.a((ParseResults<ds>)this.g.parse($$1, (Object)$$0), $$1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int a(ParseResults<ds> $$0, String $$12) {
        ds $$2 = (ds)$$0.getContext().getSource();
        $$2.l().aN().a(() -> "/" + $$12);
        try {
            int n2 = this.g.execute($$0);
            return n2;
        }
        catch (dp $$3) {
            $$2.b($$3.a());
            int n3 = 0;
            return n3;
        }
        catch (CommandSyntaxException $$4) {
            int $$5;
            $$2.b(sy.a($$4.getRawMessage()));
            if ($$4.getInput() != null && $$4.getCursor() >= 0) {
                $$5 = Math.min($$4.getInput().length(), $$4.getCursor());
                tj $$6 = sw.h().a(n.h).a($$1 -> $$1.a(new su(su.a.d, "/" + $$12)));
                if ($$5 > 10) {
                    $$6.b(sv.s);
                }
                $$6.f($$4.getInput().substring(Math.max(0, $$5 - 10), $$5));
                if ($$5 < $$4.getInput().length()) {
                    tj $$7 = sw.b($$4.getInput().substring($$5)).a(n.m, n.t);
                    $$6.b($$7);
                }
                $$6.b(sw.c("command.context.here").a(n.m, n.u));
                $$2.b($$6);
            }
            $$5 = 0;
            return $$5;
        }
        catch (Exception $$8) {
            tj $$9 = sw.b($$8.getMessage() == null ? $$8.getClass().getName() : $$8.getMessage());
            if (f.isDebugEnabled()) {
                f.error("Command exception: /{}", (Object)$$12, (Object)$$8);
                StackTraceElement[] $$10 = $$8.getStackTrace();
                for (int $$11 = 0; $$11 < Math.min($$10.length, 3); ++$$11) {
                    $$9.f("\n\n").f($$10[$$11].getMethodName()).f("\n ").f($$10[$$11].getFileName()).f(":").f(String.valueOf($$10[$$11].getLineNumber()));
                }
            }
            $$2.b(sw.c("command.failed").a($$1 -> $$1.a(new tb(tb.a.a, $$9))));
            if (aa.aS) {
                $$2.b(sw.b(ac.c($$8)));
                f.error("'/{}' threw an exception", (Object)$$12, (Object)$$8);
            }
            int n4 = 0;
            return n4;
        }
        finally {
            $$2.l().aN().c();
        }
    }

    public void a(aig $$0) {
        HashMap $$1 = Maps.newHashMap();
        RootCommandNode $$2 = new RootCommandNode();
        $$1.put(this.g.getRoot(), $$2);
        this.a((CommandNode<ds>)this.g.getRoot(), (CommandNode<du>)$$2, $$0.da(), $$1);
        $$0.c.a(new vi((RootCommandNode<du>)$$2));
    }

    private void a(CommandNode<ds> $$02, CommandNode<du> $$1, ds $$2, Map<CommandNode<ds>, CommandNode<du>> $$3) {
        for (CommandNode $$4 : $$02.getChildren()) {
            RequiredArgumentBuilder $$6;
            if (!$$4.canUse((Object)$$2)) continue;
            ArgumentBuilder $$5 = $$4.createBuilder();
            $$5.requires($$0 -> true);
            if ($$5.getCommand() != null) {
                $$5.executes($$0 -> 0);
            }
            if ($$5 instanceof RequiredArgumentBuilder && ($$6 = (RequiredArgumentBuilder)$$5).getSuggestionsProvider() != null) {
                $$6.suggests(gk.b((SuggestionProvider<du>)$$6.getSuggestionsProvider()));
            }
            if ($$5.getRedirect() != null) {
                $$5.redirect($$3.get($$5.getRedirect()));
            }
            CommandNode $$7 = $$5.build();
            $$3.put((CommandNode<ds>)$$4, (CommandNode<du>)$$7);
            $$1.addChild($$7);
            if ($$4.getChildren().isEmpty()) continue;
            this.a((CommandNode<ds>)$$4, (CommandNode<du>)$$7, $$2, $$3);
        }
    }

    public static LiteralArgumentBuilder<ds> a(String $$0) {
        return LiteralArgumentBuilder.literal((String)$$0);
    }

    public static <T> RequiredArgumentBuilder<ds, T> a(String $$0, ArgumentType<T> $$1) {
        return RequiredArgumentBuilder.argument((String)$$0, $$1);
    }

    public static Predicate<String> a(b $$0) {
        return $$1 -> {
            try {
                $$0.parse(new StringReader($$1));
                return true;
            }
            catch (CommandSyntaxException $$2) {
                return false;
            }
        };
    }

    public CommandDispatcher<ds> a() {
        return this.g;
    }

    @Nullable
    public static <S> CommandSyntaxException a(ParseResults<S> $$0) {
        if (!$$0.getReader().canRead()) {
            return null;
        }
        if ($$0.getExceptions().size() == 1) {
            return (CommandSyntaxException)((Object)$$0.getExceptions().values().iterator().next());
        }
        if ($$0.getContext().getRange().isEmpty()) {
            return CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader());
        }
        return CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext($$0.getReader());
    }

    public static dm a(final hg.b $$0) {
        return new dm(){

            @Override
            public <T> hg<T> a(acp<? extends hr<T>> $$02) {
                final hg.c $$1 = $$0.b($$02);
                return new hg.a<T>($$1){

                    @Override
                    public Optional<hi.c<T>> a(anl<T> $$0) {
                        return Optional.of(this.b($$0));
                    }

                    @Override
                    public hi.c<T> b(anl<T> $$0) {
                        Optional<hi.c<hi.c>> $$12 = $$1.a($$0);
                        return $$12.orElseGet(() -> hi.a($$1, $$0));
                    }
                };
            }
        };
    }

    public static void b() {
        dm $$02 = dt.a(me.a());
        CommandDispatcher<ds> $$12 = new dt(dt$a.a, $$02).a();
        RootCommandNode $$22 = $$12.getRoot();
        $$12.findAmbiguities(($$1, $$2, $$3, $$4) -> f.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$12.getPath($$2), $$12.getPath($$3), $$4}));
        Set<ArgumentType<?>> $$32 = gi.a($$22);
        Set $$42 = $$32.stream().filter($$0 -> !gh.a($$0.getClass())).collect(Collectors.toSet());
        if (!$$42.isEmpty()) {
            f.warn("Missing type registration for following arguments:\n {}", (Object)$$42.stream().map($$0 -> "\t" + $$0).collect(Collectors.joining(",\n")));
            throw new IllegalStateException("Unregistered argument types");
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(true, true);
        public static final /* enum */ a b = new a(false, true);
        public static final /* enum */ a c = new a(true, false);
        final boolean d;
        final boolean e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(boolean $$0, boolean $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            f = dt$a.a();
        }
    }

    @FunctionalInterface
    public static interface b {
        public void parse(StringReader var1) throws CommandSyntaxException;
    }
}

