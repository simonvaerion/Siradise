/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.context.CommandContextBuilder
 *  com.mojang.brigadier.context.ParsedArgument
 *  com.mojang.brigadier.context.SuggestionContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestion
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  javax.annotation.Nullable
 */
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.brigadier.context.SuggestionContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class epl {
    private static final Pattern a = Pattern.compile("(\\s+)");
    private static final ts b = ts.a.a(n.m);
    private static final ts c = ts.a.a(n.h);
    private static final List<ts> d = (List)Stream.of(n.l, n.o, n.k, n.n, n.g).map(ts.a::a).collect(ImmutableList.toImmutableList());
    final enn e;
    private final euq f;
    final epr g;
    final eov h;
    private final boolean i;
    private final boolean j;
    final int k;
    final int l;
    final boolean m;
    final int n;
    private final List<aom> o = Lists.newArrayList();
    private int p;
    private int q;
    @Nullable
    private ParseResults<du> r;
    @Nullable
    private CompletableFuture<Suggestions> s;
    @Nullable
    private a t;
    private boolean u;
    boolean v;

    public epl(enn $$0, euq $$1, epr $$2, eov $$3, boolean $$4, boolean $$5, int $$6, int $$7, boolean $$8, int $$9) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = $$4;
        this.j = $$5;
        this.k = $$6;
        this.l = $$7;
        this.m = $$8;
        this.n = $$9;
        $$2.a(this::a);
    }

    public void a(boolean $$0) {
        this.u = $$0;
        if (!$$0) {
            this.t = null;
        }
    }

    public boolean a(int $$0, int $$1, int $$2) {
        if (this.t != null && this.t.b($$0, $$1, $$2)) {
            return true;
        }
        if (this.f.t() == this.g && $$0 == 258) {
            this.b(true);
            return true;
        }
        return false;
    }

    public boolean a(double $$0) {
        return this.t != null && this.t.a(apa.a($$0, -1.0, 1.0));
    }

    public boolean a(double $$0, double $$1, int $$2) {
        return this.t != null && this.t.a((int)$$0, (int)$$1, $$2);
    }

    public void b(boolean $$0) {
        Suggestions $$1;
        if (this.s != null && this.s.isDone() && !($$1 = this.s.join()).isEmpty()) {
            int $$2 = 0;
            for (Suggestion $$3 : $$1.getList()) {
                $$2 = Math.max($$2, this.h.b($$3.getText()));
            }
            int $$4 = apa.a(this.g.q($$1.getRange().getStart()), 0, this.g.q(0) + this.g.w() - $$2);
            int $$5 = this.m ? this.f.h - 12 : 72;
            this.t = new a($$4, $$5, $$2, this.a($$1), $$0);
        }
    }

    public void a() {
        this.t = null;
    }

    private List<Suggestion> a(Suggestions $$0) {
        String $$1 = this.g.b().substring(0, this.g.v());
        int $$2 = epl.a($$1);
        String $$3 = $$1.substring($$2).toLowerCase(Locale.ROOT);
        ArrayList $$4 = Lists.newArrayList();
        ArrayList $$5 = Lists.newArrayList();
        for (Suggestion $$6 : $$0.getList()) {
            if ($$6.getText().startsWith($$3) || $$6.getText().startsWith("minecraft:" + $$3)) {
                $$4.add($$6);
                continue;
            }
            $$5.add($$6);
        }
        $$4.addAll($$5);
        return $$4;
    }

    public void b() {
        boolean $$2;
        String $$0 = this.g.b();
        if (this.r != null && !this.r.getReader().getString().equals($$0)) {
            this.r = null;
        }
        if (!this.v) {
            this.g.c((String)null);
            this.t = null;
        }
        this.o.clear();
        StringReader $$1 = new StringReader($$0);
        boolean bl2 = $$2 = $$1.canRead() && $$1.peek() == '/';
        if ($$2) {
            $$1.skip();
        }
        boolean $$3 = this.i || $$2;
        int $$4 = this.g.v();
        if ($$3) {
            int $$6;
            CommandDispatcher<du> $$5 = this.e.t.cl.m();
            if (this.r == null) {
                this.r = $$5.parse($$1, (Object)this.e.t.cl.d());
            }
            int n2 = $$6 = this.j ? $$1.getCursor() : 1;
            if (!($$4 < $$6 || this.t != null && this.v)) {
                this.s = $$5.getCompletionSuggestions(this.r, $$4);
                this.s.thenRun(() -> {
                    if (!this.s.isDone()) {
                        return;
                    }
                    this.d();
                });
            }
        } else {
            String $$7 = $$0.substring(0, $$4);
            int $$8 = epl.a($$7);
            Collection<String> $$9 = this.e.t.cl.d().x();
            this.s = du.b($$9, new SuggestionsBuilder($$7, $$8));
        }
    }

    private static int a(String $$0) {
        if (Strings.isNullOrEmpty((String)$$0)) {
            return 0;
        }
        int $$1 = 0;
        Matcher $$2 = a.matcher($$0);
        while ($$2.find()) {
            $$1 = $$2.end();
        }
        return $$1;
    }

    private static aom a(CommandSyntaxException $$0) {
        sw $$1 = sy.a($$0.getRawMessage());
        String $$2 = $$0.getContext();
        if ($$2 == null) {
            return $$1.f();
        }
        return sw.a("command.context.parse_error", $$1, $$0.getCursor(), $$2).f();
    }

    private void d() {
        boolean $$0 = false;
        if (this.g.v() == this.g.b().length()) {
            if (this.s.join().isEmpty() && !this.r.getExceptions().isEmpty()) {
                int $$1 = 0;
                for (Map.Entry $$2 : this.r.getExceptions().entrySet()) {
                    CommandSyntaxException $$3 = (CommandSyntaxException)$$2.getValue();
                    if ($$3.getType() == CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect()) {
                        ++$$1;
                        continue;
                    }
                    this.o.add(epl.a($$3));
                }
                if ($$1 > 0) {
                    this.o.add(epl.a(CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().create()));
                }
            } else if (this.r.getReader().canRead()) {
                $$0 = true;
            }
        }
        this.p = 0;
        this.q = this.f.g;
        if (this.o.isEmpty() && !this.a(n.h) && $$0) {
            this.o.add(epl.a(dt.a(this.r)));
        }
        this.t = null;
        if (this.u && this.e.m.F().c().booleanValue()) {
            this.b(false);
        }
    }

    private boolean a(n $$0) {
        CommandContextBuilder $$1 = this.r.getContext();
        SuggestionContext $$2 = $$1.findSuggestionContext(this.g.v());
        Map $$3 = this.e.t.cl.m().getSmartUsage($$2.parent, (Object)this.e.t.cl.d());
        ArrayList $$4 = Lists.newArrayList();
        int $$5 = 0;
        ts $$6 = ts.a.a($$0);
        for (Map.Entry $$7 : $$3.entrySet()) {
            if ($$7.getKey() instanceof LiteralCommandNode) continue;
            $$4.add(aom.forward((String)$$7.getValue(), $$6));
            $$5 = Math.max($$5, this.h.b((String)$$7.getValue()));
        }
        if (!$$4.isEmpty()) {
            this.o.addAll($$4);
            this.p = apa.a(this.g.q($$2.startPos), 0, this.g.q(0) + this.g.w() - $$5);
            this.q = $$5;
            return true;
        }
        return false;
    }

    private aom a(String $$0, int $$1) {
        if (this.r != null) {
            return epl.a(this.r, $$0, $$1);
        }
        return aom.forward($$0, ts.a);
    }

    @Nullable
    static String a(String $$0, String $$1) {
        if ($$1.startsWith($$0)) {
            return $$1.substring($$0.length());
        }
        return null;
    }

    private static aom a(ParseResults<du> $$0, String $$1, int $$2) {
        int $$10;
        ArrayList $$3 = Lists.newArrayList();
        int $$4 = 0;
        int $$5 = -1;
        CommandContextBuilder $$6 = $$0.getContext().getLastChild();
        for (ParsedArgument $$7 : $$6.getArguments().values()) {
            int $$8;
            if (++$$5 >= d.size()) {
                $$5 = 0;
            }
            if (($$8 = Math.max($$7.getRange().getStart() - $$2, 0)) >= $$1.length()) break;
            int $$9 = Math.min($$7.getRange().getEnd() - $$2, $$1.length());
            if ($$9 <= 0) continue;
            $$3.add(aom.forward($$1.substring($$4, $$8), c));
            $$3.add(aom.forward($$1.substring($$8, $$9), d.get($$5)));
            $$4 = $$9;
        }
        if ($$0.getReader().canRead() && ($$10 = Math.max($$0.getReader().getCursor() - $$2, 0)) < $$1.length()) {
            int $$11 = Math.min($$10 + $$0.getReader().getRemainingLength(), $$1.length());
            $$3.add(aom.forward($$1.substring($$4, $$10), c));
            $$3.add(aom.forward($$1.substring($$10, $$11), b));
            $$4 = $$11;
        }
        $$3.add(aom.forward($$1.substring($$4), c));
        return aom.composite($$3);
    }

    public void a(eox $$0, int $$1, int $$2) {
        if (!this.b($$0, $$1, $$2)) {
            this.a($$0);
        }
    }

    public boolean b(eox $$0, int $$1, int $$2) {
        if (this.t != null) {
            this.t.a($$0, $$1, $$2);
            return true;
        }
        return false;
    }

    public void a(eox $$0) {
        int $$1 = 0;
        for (aom $$2 : this.o) {
            int $$3 = this.m ? this.f.h - 14 - 13 - 12 * $$1 : 72 + 12 * $$1;
            $$0.a(this.p - 1, $$3, this.p + this.q + 1, $$3 + 12, this.n);
            $$0.b(this.h, $$2, this.p, $$3 + 2, -1);
            ++$$1;
        }
    }

    public sw c() {
        if (this.t != null) {
            return sv.q.e().b(this.t.b());
        }
        return sv.a;
    }

    public class a {
        private final fkc b;
        private final String c;
        private final List<Suggestion> d;
        private int e;
        private int f;
        private eeh g = eeh.a;
        private boolean h;
        private int i;

        a(int $$1, int $$2, int $$3, List<Suggestion> $$4, boolean $$5) {
            int $$6 = $$1 - 1;
            int $$7 = epl.this.m ? $$2 - 3 - Math.min($$4.size(), epl.this.l) * 12 : $$2;
            this.b = new fkc($$6, $$7, $$3 + 1, Math.min($$4.size(), epl.this.l) * 12);
            this.c = epl.this.g.b();
            this.i = $$5 ? -1 : 0;
            this.d = $$4;
            this.b(0);
        }

        public void a(eox $$0, int $$1, int $$2) {
            Message $$14;
            boolean $$8;
            int $$3 = Math.min(this.d.size(), epl.this.l);
            int $$4 = -5592406;
            boolean $$5 = this.e > 0;
            boolean $$6 = this.d.size() > this.e + $$3;
            boolean $$7 = $$5 || $$6;
            boolean bl2 = $$8 = this.g.i != (float)$$1 || this.g.j != (float)$$2;
            if ($$8) {
                this.g = new eeh($$1, $$2);
            }
            if ($$7) {
                $$0.a(this.b.a(), this.b.b() - 1, this.b.a() + this.b.c(), this.b.b(), epl.this.n);
                $$0.a(this.b.a(), this.b.b() + this.b.d(), this.b.a() + this.b.c(), this.b.b() + this.b.d() + 1, epl.this.n);
                if ($$5) {
                    for (int $$9 = 0; $$9 < this.b.c(); ++$$9) {
                        if ($$9 % 2 != 0) continue;
                        $$0.a(this.b.a() + $$9, this.b.b() - 1, this.b.a() + $$9 + 1, this.b.b(), -1);
                    }
                }
                if ($$6) {
                    for (int $$10 = 0; $$10 < this.b.c(); ++$$10) {
                        if ($$10 % 2 != 0) continue;
                        $$0.a(this.b.a() + $$10, this.b.b() + this.b.d(), this.b.a() + $$10 + 1, this.b.b() + this.b.d() + 1, -1);
                    }
                }
            }
            boolean $$11 = false;
            for (int $$12 = 0; $$12 < $$3; ++$$12) {
                Suggestion $$13 = this.d.get($$12 + this.e);
                $$0.a(this.b.a(), this.b.b() + 12 * $$12, this.b.a() + this.b.c(), this.b.b() + 12 * $$12 + 12, epl.this.n);
                if ($$1 > this.b.a() && $$1 < this.b.a() + this.b.c() && $$2 > this.b.b() + 12 * $$12 && $$2 < this.b.b() + 12 * $$12 + 12) {
                    if ($$8) {
                        this.b($$12 + this.e);
                    }
                    $$11 = true;
                }
                $$0.b(epl.this.h, $$13.getText(), this.b.a() + 1, this.b.b() + 2 + 12 * $$12, $$12 + this.e == this.f ? -256 : -5592406);
            }
            if ($$11 && ($$14 = this.d.get(this.f).getTooltip()) != null) {
                $$0.a(epl.this.h, sy.a($$14), $$1, $$2);
            }
        }

        public boolean a(int $$0, int $$1, int $$2) {
            if (!this.b.b($$0, $$1)) {
                return false;
            }
            int $$3 = ($$1 - this.b.b()) / 12 + this.e;
            if ($$3 >= 0 && $$3 < this.d.size()) {
                this.b($$3);
                this.a();
            }
            return true;
        }

        public boolean a(double $$0) {
            int $$2;
            int $$1 = (int)(epl.this.e.n.e() * (double)epl.this.e.aM().o() / (double)epl.this.e.aM().m());
            if (this.b.b($$1, $$2 = (int)(epl.this.e.n.f() * (double)epl.this.e.aM().p() / (double)epl.this.e.aM().n()))) {
                this.e = apa.a((int)((double)this.e - $$0), 0, Math.max(this.d.size() - epl.this.l, 0));
                return true;
            }
            return false;
        }

        public boolean b(int $$0, int $$1, int $$2) {
            if ($$0 == 265) {
                this.a(-1);
                this.h = false;
                return true;
            }
            if ($$0 == 264) {
                this.a(1);
                this.h = false;
                return true;
            }
            if ($$0 == 258) {
                if (this.h) {
                    this.a(euq.q() ? -1 : 1);
                }
                this.a();
                return true;
            }
            if ($$0 == 256) {
                epl.this.a();
                return true;
            }
            return false;
        }

        public void a(int $$0) {
            this.b(this.f + $$0);
            int $$1 = this.e;
            int $$2 = this.e + epl.this.l - 1;
            if (this.f < $$1) {
                this.e = apa.a(this.f, 0, Math.max(this.d.size() - epl.this.l, 0));
            } else if (this.f > $$2) {
                this.e = apa.a(this.f + epl.this.k - epl.this.l, 0, Math.max(this.d.size() - epl.this.l, 0));
            }
        }

        public void b(int $$0) {
            this.f = $$0;
            if (this.f < 0) {
                this.f += this.d.size();
            }
            if (this.f >= this.d.size()) {
                this.f -= this.d.size();
            }
            Suggestion $$1 = this.d.get(this.f);
            epl.this.g.c(epl.a(epl.this.g.b(), $$1.apply(this.c)));
            if (this.i != this.f) {
                epl.this.e.aU().c(this.b());
            }
        }

        public void a() {
            Suggestion $$0 = this.d.get(this.f);
            epl.this.v = true;
            epl.this.g.a($$0.apply(this.c));
            int $$1 = $$0.getRange().getStart() + $$0.getText().length();
            epl.this.g.l($$1);
            epl.this.g.p($$1);
            this.b(this.f);
            epl.this.v = false;
            this.h = true;
        }

        sw b() {
            this.i = this.f;
            Suggestion $$0 = this.d.get(this.f);
            Message $$1 = $$0.getTooltip();
            if ($$1 != null) {
                return sw.a("narration.suggestion.tooltip", this.f + 1, this.d.size(), $$0.getText(), $$1);
            }
            return sw.a("narration.suggestion", this.f + 1, this.d.size(), $$0.getText());
        }
    }
}

