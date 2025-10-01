/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.datafixers.util.Unit
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.datafixers.util.Unit;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import org.slf4j.Logger;

public class afq {
    private static final Logger a = LogUtils.getLogger();

    public static void a(CommandDispatcher<ds> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("resetchunks").requires($$0 -> $$0.c(2))).executes($$0 -> afq.a((ds)$$0.getSource(), 0, true))).then(((RequiredArgumentBuilder)dt.a("range", IntegerArgumentType.integer((int)0, (int)5)).executes($$0 -> afq.a((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"range"), true))).then(dt.a("skipOldChunks", BoolArgumentType.bool()).executes($$0 -> afq.a((ds)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"range"), BoolArgumentType.getBool((CommandContext)$$0, (String)"skipOldChunks"))))));
    }

    private static int a(ds $$0, int $$1, boolean $$2) {
        aif $$3 = $$0.e();
        aid $$4 = $$3.k();
        $$4.a.d();
        eei $$52 = $$0.d();
        clt $$6 = new clt(gu.a($$52));
        int $$7 = $$6.f - $$1;
        int $$8 = $$6.f + $$1;
        int $$9 = $$6.e - $$1;
        int $$10 = $$6.e + $$1;
        for (int $$11 = $$7; $$11 <= $$8; ++$$11) {
            for (int $$12 = $$9; $$12 <= $$10; ++$$12) {
                clt $$13 = new clt($$12, $$11);
                dei $$14 = $$4.a($$12, $$11, false);
                if ($$14 == null || $$2 && $$14.s()) continue;
                for (gu $$15 : gu.b($$13.d(), $$3.C_(), $$13.e(), $$13.f(), $$3.aj() - 1, $$13.g())) {
                    $$3.a($$15, cpo.a.n(), 16);
                }
            }
        }
        bcq<Runnable> $$16 = bcq.a(ac.f(), "worldgen-resetchunks");
        long $$17 = System.currentTimeMillis();
        int $$18 = ($$1 * 2 + 1) * ($$1 * 2 + 1);
        for (dec $$19 : ImmutableList.of((Object)dec.f, (Object)dec.g, (Object)dec.h, (Object)dec.i, (Object)dec.j, (Object)dec.k)) {
            long $$20 = System.currentTimeMillis();
            CompletionStage<Object> $$21 = CompletableFuture.supplyAsync(() -> Unit.INSTANCE, $$16::a);
            for (int $$22 = $$6.f - $$1; $$22 <= $$6.f + $$1; ++$$22) {
                for (int $$23 = $$6.e - $$1; $$23 <= $$6.e + $$1; ++$$23) {
                    clt $$24 = new clt($$23, $$22);
                    dei $$25 = $$4.a($$23, $$22, false);
                    if ($$25 == null || $$2 && $$25.s()) continue;
                    ArrayList $$26 = Lists.newArrayList();
                    int $$27 = Math.max(1, $$19.e());
                    for (int $$28 = $$24.f - $$27; $$28 <= $$24.f + $$27; ++$$28) {
                        for (int $$29 = $$24.e - $$27; $$29 <= $$24.e + $$27; ++$$29) {
                            ddx $$33;
                            ddx $$30 = $$4.a($$29, $$28, $$19.d(), true);
                            if ($$30 instanceof deh) {
                                deh $$31 = new deh(((deh)$$30).C(), true);
                            } else if ($$30 instanceof dei) {
                                deh $$32 = new deh((dei)$$30, true);
                            } else {
                                $$33 = $$30;
                            }
                            $$26.add($$33);
                        }
                    }
                    $$21 = $$21.thenComposeAsync($$5 -> $$19.a($$16::a, $$3, $$4.g(), $$3.p(), $$4.a(), $$0 -> {
                        throw new UnsupportedOperationException("Not creating full chunks here");
                    }, $$26).thenApply($$1 -> {
                        if ($$19 == dec.g) {
                            $$1.left().ifPresent($$0 -> dhk.a($$0, dec.b));
                        }
                        return Unit.INSTANCE;
                    }), $$16::a);
                }
            }
            $$0.l().c(() -> $$21.isDone());
            a.debug($$19 + " took " + (System.currentTimeMillis() - $$20) + " ms");
        }
        long $$34 = System.currentTimeMillis();
        for (int $$35 = $$6.f - $$1; $$35 <= $$6.f + $$1; ++$$35) {
            for (int $$36 = $$6.e - $$1; $$36 <= $$6.e + $$1; ++$$36) {
                clt $$37 = new clt($$36, $$35);
                dei $$38 = $$4.a($$36, $$35, false);
                if ($$38 == null || $$2 && $$38.s()) continue;
                for (gu $$39 : gu.b($$37.d(), $$3.C_(), $$37.e(), $$37.f(), $$3.aj() - 1, $$37.g())) {
                    $$4.a($$39);
                }
            }
        }
        a.debug("blockChanged took " + (System.currentTimeMillis() - $$34) + " ms");
        long $$40 = System.currentTimeMillis() - $$17;
        $$0.a(() -> sw.b(String.format(Locale.ROOT, "%d chunks have been reset. This took %d ms for %d chunks, or %02f ms per chunk", $$18, $$40, $$18, Float.valueOf((float)$$40 / (float)$$18))), true);
        return 1;
    }
}

