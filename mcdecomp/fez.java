/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class fez
implements du {
    private final fex a;
    private final enn b;
    private int c = -1;
    @Nullable
    private CompletableFuture<Suggestions> d;
    private final Set<String> e = new HashSet<String>();

    public fez(fex $$0, enn $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public Collection<String> q() {
        ArrayList $$0 = Lists.newArrayList();
        for (ffb $$1 : this.a.i()) {
            $$0.add($$1.a().getName());
        }
        return $$0;
    }

    @Override
    public Collection<String> x() {
        if (this.e.isEmpty()) {
            return this.q();
        }
        HashSet<String> $$0 = new HashSet<String>(this.q());
        $$0.addAll(this.e);
        return $$0;
    }

    @Override
    public Collection<String> y() {
        if (this.b.w != null && this.b.w.c() == eeg.a.c) {
            return Collections.singleton(((eef)this.b.w).a().cu());
        }
        return Collections.emptyList();
    }

    @Override
    public Collection<String> r() {
        return this.a.n().I().f();
    }

    @Override
    public Stream<acq> s() {
        return this.b.ah().b().stream();
    }

    @Override
    public Stream<acq> t() {
        return this.a.f().d();
    }

    @Override
    public boolean c(int $$0) {
        fiy $$1 = this.b.t;
        return $$1 != null ? $$1.l($$0) : $$0 == 0;
    }

    @Override
    public CompletableFuture<Suggestions> a(acp<? extends hr<?>> $$0, du.a $$1, SuggestionsBuilder $$22, CommandContext<?> $$3) {
        return this.v().c($$0).map($$2 -> {
            this.a((hr<?>)$$2, $$1, $$22);
            return $$22.buildFuture();
        }).orElseGet(() -> this.a($$3));
    }

    @Override
    public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
        if (this.d != null) {
            this.d.cancel(false);
        }
        this.d = new CompletableFuture();
        int $$1 = ++this.c;
        this.a.a(new zm($$1, $$0.getInput()));
        return this.d;
    }

    private static String a(double $$0) {
        return String.format(Locale.ROOT, "%.2f", $$0);
    }

    private static String a(int $$0) {
        return Integer.toString($$0);
    }

    @Override
    public Collection<du.b> z() {
        eeg $$0 = this.b.w;
        if ($$0 == null || $$0.c() != eeg.a.b) {
            return du.super.z();
        }
        gu $$1 = ((eee)$$0).a();
        return Collections.singleton(new du.b(fez.a($$1.u()), fez.a($$1.v()), fez.a($$1.w())));
    }

    @Override
    public Collection<du.b> A() {
        eeg $$0 = this.b.w;
        if ($$0 == null || $$0.c() != eeg.a.b) {
            return du.super.A();
        }
        eei $$1 = $$0.e();
        return Collections.singleton(new du.b(fez.a($$1.c), fez.a($$1.d), fez.a($$1.e)));
    }

    @Override
    public Set<acp<cmm>> u() {
        return this.a.q();
    }

    @Override
    public hs v() {
        return this.a.r();
    }

    @Override
    public caw w() {
        return this.a.t();
    }

    public void a(int $$0, Suggestions $$1) {
        if ($$0 == this.c) {
            this.d.complete($$1);
            this.d = null;
            this.c = -1;
        }
    }

    public void a(vo.a $$0, List<String> $$1) {
        switch ($$0) {
            case a: {
                this.e.addAll($$1);
                break;
            }
            case b: {
                $$1.forEach(this.e::remove);
                break;
            }
            case c: {
                this.e.clear();
                this.e.addAll($$1);
            }
        }
    }
}

