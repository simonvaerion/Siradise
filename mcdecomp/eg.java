/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eg
implements ev<a> {
    private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");

    public static eg a() {
        return new eg();
    }

    public static sw a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        a $$2 = (a)$$0.getArgument($$1, a.class);
        return $$2.a((ds)$$0.getSource());
    }

    public static void a(CommandContext<ds> $$0, String $$1, Consumer<tl> $$2) throws CommandSyntaxException {
        a $$3 = (a)$$0.getArgument($$1, a.class);
        ds $$4 = (ds)$$0.getSource();
        sw $$5 = $$3.a($$4);
        dq $$6 = $$4.n();
        tl $$7 = $$6.a($$1);
        if ($$7 != null) {
            eg.a($$2, $$4, $$7.a($$5));
        } else {
            eg.b($$2, $$4, tl.a($$3.a).a($$5));
        }
    }

    private static void a(Consumer<tl> $$0, ds $$1, tl $$2) {
        MinecraftServer $$3 = $$1.l();
        CompletableFuture<aiu> $$4 = eg.a($$1, $$2);
        CompletableFuture<sw> $$5 = $$3.be().decorate($$1.i(), $$2.c());
        $$1.o().append($$42 -> CompletableFuture.allOf($$4, $$5).thenAcceptAsync($$4 -> {
            tl $$5 = $$2.a((sw)$$5.join()).a(((aiu)$$4.join()).e());
            $$0.accept($$5);
        }, $$42));
    }

    private static void b(Consumer<tl> $$0, ds $$1, tl $$2) {
        MinecraftServer $$32 = $$1.l();
        CompletableFuture<sw> $$4 = $$32.be().decorate($$1.i(), $$2.c());
        $$1.o().append($$3 -> $$4.thenAcceptAsync($$2 -> $$0.accept($$2.a((sw)$$2)), $$3));
    }

    private static CompletableFuture<aiu> a(ds $$0, tl $$1) {
        aig $$2 = $$0.i();
        if ($$2 != null && $$1.a($$2.ct())) {
            return $$2.T().a($$1.b());
        }
        return CompletableFuture.completedFuture(aiu.a($$1.b()));
    }

    public a a(StringReader $$0) throws CommandSyntaxException {
        return eg$a.a($$0, true);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static class a {
        final String a;
        private final b[] b;

        public a(String $$0, b[] $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public String a() {
            return this.a;
        }

        public b[] b() {
            return this.b;
        }

        sw a(ds $$0) throws CommandSyntaxException {
            return this.a($$0, $$0.c(2));
        }

        public sw a(ds $$0, boolean $$1) throws CommandSyntaxException {
            if (this.b.length == 0 || !$$1) {
                return sw.b(this.a);
            }
            tj $$2 = sw.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();
            for (b $$4 : this.b) {
                sw $$5 = $$4.a($$0);
                if ($$3 < $$4.a()) {
                    $$2.f(this.a.substring($$3, $$4.a()));
                }
                if ($$5 != null) {
                    $$2.b($$5);
                }
                $$3 = $$4.b();
            }
            if ($$3 < this.a.length()) {
                $$2.f(this.a.substring($$3));
            }
            return $$2;
        }

        /*
         * WARNING - void declaration
         */
        public static a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
            String $$2 = $$0.getString().substring($$0.getCursor(), $$0.getTotalLength());
            if (!$$1) {
                $$0.setCursor($$0.getTotalLength());
                return new a($$2, new b[0]);
            }
            ArrayList $$3 = Lists.newArrayList();
            int $$4 = $$0.getCursor();
            while ($$0.canRead()) {
                if ($$0.peek() == '@') {
                    void $$9;
                    int $$5 = $$0.getCursor();
                    try {
                        gb $$6 = new gb($$0);
                        ga $$7 = $$6.t();
                    }
                    catch (CommandSyntaxException $$8) {
                        if ($$8.getType() == gb.h || $$8.getType() == gb.f) {
                            $$0.setCursor($$5 + 1);
                            continue;
                        }
                        throw $$8;
                    }
                    $$3.add(new b($$5 - $$4, $$0.getCursor() - $$4, (ga)$$9));
                    continue;
                }
                $$0.skip();
            }
            return new a($$2, $$3.toArray(new b[0]));
        }
    }

    public static class b {
        private final int a;
        private final int b;
        private final ga c;

        public b(int $$0, int $$1, ga $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public ga c() {
            return this.c;
        }

        @Nullable
        public sw a(ds $$0) throws CommandSyntaxException {
            return ga.a(this.c.b($$0));
        }
    }
}

