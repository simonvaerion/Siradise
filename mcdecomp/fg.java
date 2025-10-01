/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.datafixers.util.Either
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fg {
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("argument.block.tag.disallowed"));
    public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("argument.block.id.invalid", $$0));
    public static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("argument.block.property.unknown", $$0, $$1));
    public static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("argument.block.property.duplicate", $$1, $$0));
    public static final Dynamic3CommandExceptionType e = new Dynamic3CommandExceptionType(($$0, $$1, $$2) -> sw.a("argument.block.property.invalid", $$0, $$2, $$1));
    public static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("argument.block.property.novalue", $$0, $$1));
    public static final SimpleCommandExceptionType g = new SimpleCommandExceptionType((Message)sw.c("argument.block.property.unclosed"));
    public static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> sw.a("arguments.block.tag.unknown", $$0));
    private static final char i = '[';
    private static final char j = '{';
    private static final char k = ']';
    private static final char l = '=';
    private static final char m = ',';
    private static final char n = '#';
    private static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> o = SuggestionsBuilder::buildFuture;
    private final hg<cpn> p;
    private final StringReader q;
    private final boolean r;
    private final boolean s;
    private final Map<dde<?>, Comparable<?>> t = Maps.newHashMap();
    private final Map<String, String> u = Maps.newHashMap();
    private acq v = new acq("");
    @Nullable
    private dcc<cpn, dcb> w;
    @Nullable
    private dcb x;
    @Nullable
    private qr y;
    @Nullable
    private hi<cpn> z;
    private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> A = o;

    private fg(hg<cpn> $$0, StringReader $$1, boolean $$2, boolean $$3) {
        this.p = $$0;
        this.q = $$1;
        this.r = $$2;
        this.s = $$3;
    }

    public static a a(hg<cpn> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
        return fg.a($$0, new StringReader($$1), $$2);
    }

    public static a a(hg<cpn> $$0, StringReader $$1, boolean $$2) throws CommandSyntaxException {
        int $$3 = $$1.getCursor();
        try {
            fg $$4 = new fg($$0, $$1, false, $$2);
            $$4.a();
            return new a($$4.x, $$4.t, $$4.y);
        }
        catch (CommandSyntaxException $$5) {
            $$1.setCursor($$3);
            throw $$5;
        }
    }

    public static Either<a, b> b(hg<cpn> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
        return fg.b($$0, new StringReader($$1), $$2);
    }

    public static Either<a, b> b(hg<cpn> $$0, StringReader $$1, boolean $$2) throws CommandSyntaxException {
        int $$3 = $$1.getCursor();
        try {
            fg $$4 = new fg($$0, $$1, true, $$2);
            $$4.a();
            if ($$4.z != null) {
                return Either.right((Object)new b($$4.z, $$4.u, $$4.y));
            }
            return Either.left((Object)new a($$4.x, $$4.t, $$4.y));
        }
        catch (CommandSyntaxException $$5) {
            $$1.setCursor($$3);
            throw $$5;
        }
    }

    public static CompletableFuture<Suggestions> a(hg<cpn> $$0, SuggestionsBuilder $$1, boolean $$2, boolean $$3) {
        StringReader $$4 = new StringReader($$1.getInput());
        $$4.setCursor($$1.getStart());
        fg $$5 = new fg($$0, $$4, $$2, $$3);
        try {
            $$5.a();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return $$5.A.apply($$1.createOffset($$4.getCursor()));
    }

    private void a() throws CommandSyntaxException {
        this.A = this.r ? this::l : this::k;
        if (this.q.canRead() && this.q.peek() == '#') {
            this.d();
            this.A = this::h;
            if (this.q.canRead() && this.q.peek() == '[') {
                this.f();
                this.A = this::e;
            }
        } else {
            this.c();
            this.A = this::i;
            if (this.q.canRead() && this.q.peek() == '[') {
                this.e();
                this.A = this::e;
            }
        }
        if (this.s && this.q.canRead() && this.q.peek() == '{') {
            this.A = o;
            this.g();
        }
    }

    private CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
        if ($$0.getRemaining().isEmpty()) {
            $$0.suggest(String.valueOf(']'));
        }
        return this.c($$0);
    }

    private CompletableFuture<Suggestions> b(SuggestionsBuilder $$0) {
        if ($$0.getRemaining().isEmpty()) {
            $$0.suggest(String.valueOf(']'));
        }
        return this.d($$0);
    }

    private CompletableFuture<Suggestions> c(SuggestionsBuilder $$0) {
        String $$1 = $$0.getRemaining().toLowerCase(Locale.ROOT);
        for (dde<?> $$2 : this.x.B()) {
            if (this.t.containsKey($$2) || !$$2.f().startsWith($$1)) continue;
            $$0.suggest($$2.f() + "=");
        }
        return $$0.buildFuture();
    }

    private CompletableFuture<Suggestions> d(SuggestionsBuilder $$0) {
        String $$1 = $$0.getRemaining().toLowerCase(Locale.ROOT);
        if (this.z != null) {
            for (he he2 : this.z) {
                for (dde<?> $$3 : ((cpn)he2.a()).l().d()) {
                    if (this.u.containsKey($$3.f()) || !$$3.f().startsWith($$1)) continue;
                    $$0.suggest($$3.f() + "=");
                }
            }
        }
        return $$0.buildFuture();
    }

    private CompletableFuture<Suggestions> e(SuggestionsBuilder $$0) {
        if ($$0.getRemaining().isEmpty() && this.b()) {
            $$0.suggest(String.valueOf('{'));
        }
        return $$0.buildFuture();
    }

    private boolean b() {
        if (this.x != null) {
            return this.x.t();
        }
        if (this.z != null) {
            for (he he2 : this.z) {
                if (!((cpn)he2.a()).n().t()) continue;
                return true;
            }
        }
        return false;
    }

    private CompletableFuture<Suggestions> f(SuggestionsBuilder $$0) {
        if ($$0.getRemaining().isEmpty()) {
            $$0.suggest(String.valueOf('='));
        }
        return $$0.buildFuture();
    }

    private CompletableFuture<Suggestions> g(SuggestionsBuilder $$0) {
        if ($$0.getRemaining().isEmpty()) {
            $$0.suggest(String.valueOf(']'));
        }
        if ($$0.getRemaining().isEmpty() && this.t.size() < this.x.B().size()) {
            $$0.suggest(String.valueOf(','));
        }
        return $$0.buildFuture();
    }

    private static <T extends Comparable<T>> SuggestionsBuilder a(SuggestionsBuilder $$0, dde<T> $$1) {
        for (Comparable $$2 : $$1.a()) {
            if ($$2 instanceof Integer) {
                Integer $$3 = (Integer)$$2;
                $$0.suggest($$3.intValue());
                continue;
            }
            $$0.suggest($$1.a($$2));
        }
        return $$0;
    }

    private CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, String $$1) {
        boolean $$2 = false;
        if (this.z != null) {
            block0: for (he he2 : this.z) {
                cpn $$4 = (cpn)he2.a();
                dde<?> $$5 = $$4.l().a($$1);
                if ($$5 != null) {
                    fg.a($$0, $$5);
                }
                if ($$2) continue;
                for (dde<?> $$6 : $$4.l().d()) {
                    if (this.u.containsKey($$6.f())) continue;
                    $$2 = true;
                    continue block0;
                }
            }
        }
        if ($$2) {
            $$0.suggest(String.valueOf(','));
        }
        $$0.suggest(String.valueOf(']'));
        return $$0.buildFuture();
    }

    private CompletableFuture<Suggestions> h(SuggestionsBuilder $$0) {
        if ($$0.getRemaining().isEmpty() && this.z != null) {
            he $$3;
            cpn $$4;
            boolean $$1 = false;
            boolean $$2 = false;
            Iterator iterator = this.z.iterator();
            while (!(!iterator.hasNext() || ($$1 |= !($$4 = (cpn)($$3 = (he)iterator.next()).a()).l().d().isEmpty()) && ($$2 |= $$4.n().t()))) {
            }
            if ($$1) {
                $$0.suggest(String.valueOf('['));
            }
            if ($$2) {
                $$0.suggest(String.valueOf('{'));
            }
        }
        return $$0.buildFuture();
    }

    private CompletableFuture<Suggestions> i(SuggestionsBuilder $$0) {
        if ($$0.getRemaining().isEmpty()) {
            if (!this.w.d().isEmpty()) {
                $$0.suggest(String.valueOf('['));
            }
            if (this.x.t()) {
                $$0.suggest(String.valueOf('{'));
            }
        }
        return $$0.buildFuture();
    }

    private CompletableFuture<Suggestions> j(SuggestionsBuilder $$0) {
        return du.a(this.p.e().map(anl::b), $$0, String.valueOf('#'));
    }

    private CompletableFuture<Suggestions> k(SuggestionsBuilder $$0) {
        return du.a(this.p.c().map(acp::a), $$0);
    }

    private CompletableFuture<Suggestions> l(SuggestionsBuilder $$0) {
        this.j($$0);
        this.k($$0);
        return $$0.buildFuture();
    }

    private void c() throws CommandSyntaxException {
        int $$0 = this.q.getCursor();
        this.v = acq.a(this.q);
        cpn $$1 = this.p.a(acp.a(jc.e, this.v)).orElseThrow(() -> {
            this.q.setCursor($$0);
            return b.createWithContext((ImmutableStringReader)this.q, (Object)this.v.toString());
        }).a();
        this.w = $$1.l();
        this.x = $$1.n();
    }

    private void d() throws CommandSyntaxException {
        if (!this.r) {
            throw a.createWithContext((ImmutableStringReader)this.q);
        }
        int $$0 = this.q.getCursor();
        this.q.expect('#');
        this.A = this::j;
        acq $$1 = acq.a(this.q);
        this.z = this.p.a(anl.a(jc.e, $$1)).orElseThrow(() -> {
            this.q.setCursor($$0);
            return h.createWithContext((ImmutableStringReader)this.q, (Object)$$1.toString());
        });
    }

    private void e() throws CommandSyntaxException {
        this.q.skip();
        this.A = this::a;
        this.q.skipWhitespace();
        while (this.q.canRead() && this.q.peek() != ']') {
            this.q.skipWhitespace();
            int $$0 = this.q.getCursor();
            String $$12 = this.q.readString();
            dde<?> $$2 = this.w.a($$12);
            if ($$2 == null) {
                this.q.setCursor($$0);
                throw c.createWithContext((ImmutableStringReader)this.q, (Object)this.v.toString(), (Object)$$12);
            }
            if (this.t.containsKey($$2)) {
                this.q.setCursor($$0);
                throw d.createWithContext((ImmutableStringReader)this.q, (Object)this.v.toString(), (Object)$$12);
            }
            this.q.skipWhitespace();
            this.A = this::f;
            if (!this.q.canRead() || this.q.peek() != '=') {
                throw f.createWithContext((ImmutableStringReader)this.q, (Object)this.v.toString(), (Object)$$12);
            }
            this.q.skip();
            this.q.skipWhitespace();
            this.A = $$1 -> fg.a($$1, $$2).buildFuture();
            int $$3 = this.q.getCursor();
            this.a($$2, this.q.readString(), $$3);
            this.A = this::g;
            this.q.skipWhitespace();
            if (!this.q.canRead()) continue;
            if (this.q.peek() == ',') {
                this.q.skip();
                this.A = this::c;
                continue;
            }
            if (this.q.peek() == ']') break;
            throw g.createWithContext((ImmutableStringReader)this.q);
        }
        if (!this.q.canRead()) {
            throw g.createWithContext((ImmutableStringReader)this.q);
        }
        this.q.skip();
    }

    private void f() throws CommandSyntaxException {
        this.q.skip();
        this.A = this::b;
        int $$0 = -1;
        this.q.skipWhitespace();
        while (this.q.canRead() && this.q.peek() != ']') {
            this.q.skipWhitespace();
            int $$12 = this.q.getCursor();
            String $$2 = this.q.readString();
            if (this.u.containsKey($$2)) {
                this.q.setCursor($$12);
                throw d.createWithContext((ImmutableStringReader)this.q, (Object)this.v.toString(), (Object)$$2);
            }
            this.q.skipWhitespace();
            if (!this.q.canRead() || this.q.peek() != '=') {
                this.q.setCursor($$12);
                throw f.createWithContext((ImmutableStringReader)this.q, (Object)this.v.toString(), (Object)$$2);
            }
            this.q.skip();
            this.q.skipWhitespace();
            this.A = $$1 -> this.a((SuggestionsBuilder)$$1, $$2);
            $$0 = this.q.getCursor();
            String $$3 = this.q.readString();
            this.u.put($$2, $$3);
            this.q.skipWhitespace();
            if (!this.q.canRead()) continue;
            $$0 = -1;
            if (this.q.peek() == ',') {
                this.q.skip();
                this.A = this::d;
                continue;
            }
            if (this.q.peek() == ']') break;
            throw g.createWithContext((ImmutableStringReader)this.q);
        }
        if (!this.q.canRead()) {
            if ($$0 >= 0) {
                this.q.setCursor($$0);
            }
            throw g.createWithContext((ImmutableStringReader)this.q);
        }
        this.q.skip();
    }

    private void g() throws CommandSyntaxException {
        this.y = new rl(this.q).f();
    }

    private <T extends Comparable<T>> void a(dde<T> $$0, String $$1, int $$2) throws CommandSyntaxException {
        Optional<T> $$3 = $$0.b($$1);
        if (!$$3.isPresent()) {
            this.q.setCursor($$2);
            throw e.createWithContext((ImmutableStringReader)this.q, (Object)this.v.toString(), (Object)$$0.f(), (Object)$$1);
        }
        this.x = (dcb)this.x.a($$0, (Comparable)$$3.get());
        this.t.put($$0, (Comparable)$$3.get());
    }

    public static String a(dcb $$02) {
        StringBuilder $$1 = new StringBuilder($$02.c().e().map($$0 -> $$0.a().toString()).orElse("air"));
        if (!$$02.B().isEmpty()) {
            $$1.append('[');
            boolean $$2 = false;
            for (Map.Entry $$3 : $$02.C().entrySet()) {
                if ($$2) {
                    $$1.append(',');
                }
                fg.a($$1, (dde)$$3.getKey(), (Comparable)$$3.getValue());
                $$2 = true;
            }
            $$1.append(']');
        }
        return $$1.toString();
    }

    private static <T extends Comparable<T>> void a(StringBuilder $$0, dde<T> $$1, Comparable<?> $$2) {
        $$0.append($$1.f());
        $$0.append('=');
        $$0.append($$1.a($$2));
    }

    public record a(dcb a, Map<dde<?>, Comparable<?>> b, @Nullable qr c) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "blockState;properties;nbt", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "blockState;properties;nbt", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "blockState;properties;nbt", "a", "b", "c"}, this, $$0);
        }
    }

    public record b(hi<cpn> a, Map<String, String> b, @Nullable qr c) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "tag;vagueProperties;nbt", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "tag;vagueProperties;nbt", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "tag;vagueProperties;nbt", "a", "b", "c"}, this, $$0);
        }
    }
}

