/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class et
implements ArgumentType<b> {
    public static final SuggestionProvider<ds> a = ($$0, $$12) -> {
        StringReader $$2 = new StringReader($$12.getInput());
        $$2.setCursor($$12.getStart());
        gb $$3 = new gb($$2);
        try {
            $$3.t();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return $$3.a($$12, $$1 -> du.b(((ds)$$0.getSource()).q(), $$1));
    };
    private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)sw.c("argument.scoreHolder.empty"));
    final boolean d;

    public et(boolean $$0) {
        this.d = $$0;
    }

    public static String a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        return et.b($$0, $$1).iterator().next();
    }

    public static Collection<String> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        return et.a($$0, $$1, Collections::emptyList);
    }

    public static Collection<String> c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
        return et.a($$0, $$1, ((ds)$$0.getSource()).l().aF()::e);
    }

    public static Collection<String> a(CommandContext<ds> $$0, String $$1, Supplier<Collection<String>> $$2) throws CommandSyntaxException {
        Collection<String> $$3 = ((b)$$0.getArgument($$1, b.class)).getNames((ds)$$0.getSource(), $$2);
        if ($$3.isEmpty()) {
            throw ec.d.create();
        }
        return $$3;
    }

    public static et a() {
        return new et(false);
    }

    public static et b() {
        return new et(true);
    }

    public b a(StringReader $$02) throws CommandSyntaxException {
        if ($$02.canRead() && $$02.peek() == '@') {
            gb $$12 = new gb($$02);
            ga $$22 = $$12.t();
            if (!this.d && $$22.a() > 1) {
                throw ec.a.create();
            }
            return new c($$22);
        }
        int $$3 = $$02.getCursor();
        while ($$02.canRead() && $$02.peek() != ' ') {
            $$02.skip();
        }
        String $$4 = $$02.getString().substring($$3, $$02.getCursor());
        if ($$4.equals("*")) {
            return ($$0, $$1) -> {
                Collection $$2 = (Collection)$$1.get();
                if ($$2.isEmpty()) {
                    throw c.create();
                }
                return $$2;
            };
        }
        Set<String> $$5 = Collections.singleton($$4);
        return ($$1, $$2) -> $$5;
    }

    public Collection<String> getExamples() {
        return b;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    @FunctionalInterface
    public static interface b {
        public Collection<String> getNames(ds var1, Supplier<Collection<String>> var2) throws CommandSyntaxException;
    }

    public static class c
    implements b {
        private final ga a;

        public c(ga $$0) {
            this.a = $$0;
        }

        @Override
        public Collection<String> getNames(ds $$0, Supplier<Collection<String>> $$1) throws CommandSyntaxException {
            List<? extends bfj> $$2 = this.a.b($$0);
            if ($$2.isEmpty()) {
                throw ec.d.create();
            }
            ArrayList $$3 = Lists.newArrayList();
            for (bfj bfj2 : $$2) {
                $$3.add(bfj2.cv());
            }
            return $$3;
        }
    }

    public static class et$a
    implements gg<et, a> {
        private static final byte a = 1;

        @Override
        public void a(a $$0, sf $$1) {
            int $$2 = 0;
            if ($$0.b) {
                $$2 |= 1;
            }
            $$1.writeByte($$2);
        }

        @Override
        public a a(sf $$0) {
            byte $$1 = $$0.readByte();
            boolean $$2 = ($$1 & 1) != 0;
            return new a($$2);
        }

        @Override
        public void a(a $$0, JsonObject $$1) {
            $$1.addProperty("amount", $$0.b ? "multiple" : "single");
        }

        @Override
        public a a(et $$0) {
            return new a($$0.d);
        }

        @Override
        public /* synthetic */ gg.a b(sf sf2) {
            return this.a(sf2);
        }

        public final class a
        implements gg.a<et> {
            final boolean b;

            a(boolean $$1) {
                this.b = $$1;
            }

            public et a(dm $$0) {
                return new et(this.b);
            }

            @Override
            public gg<et, ?> a() {
                return a.this;
            }

            @Override
            public /* synthetic */ ArgumentType b(dm dm2) {
                return this.a(dm2);
            }
        }
    }
}

