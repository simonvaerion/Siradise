/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.ResultConsumer
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ds
implements du {
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("permissions.requires.player"));
    public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("permissions.requires.entity"));
    private final dr c;
    private final eei d;
    private final aif e;
    private final int f;
    private final String g;
    private final sw h;
    private final MinecraftServer i;
    private final boolean j;
    @Nullable
    private final bfj k;
    @Nullable
    private final ResultConsumer<ds> l;
    private final eb.a m;
    private final eeh n;
    private final dq o;
    private final apt p;
    private final IntConsumer q;

    public ds(dr $$02, eei $$12, eeh $$22, aif $$3, int $$4, String $$5, sw $$6, MinecraftServer $$7, @Nullable bfj $$8) {
        this($$02, $$12, $$22, $$3, $$4, $$5, $$6, $$7, $$8, false, (ResultConsumer<ds>)((ResultConsumer)($$0, $$1, $$2) -> {}), eb.a.a, dq.a, apt.immediate($$7), $$0 -> {});
    }

    protected ds(dr $$0, eei $$1, eeh $$2, aif $$3, int $$4, String $$5, sw $$6, MinecraftServer $$7, @Nullable bfj $$8, boolean $$9, @Nullable ResultConsumer<ds> $$10, eb.a $$11, dq $$12, apt $$13, IntConsumer $$14) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$3;
        this.j = $$9;
        this.k = $$8;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
        this.l = $$10;
        this.m = $$11;
        this.n = $$2;
        this.o = $$12;
        this.p = $$13;
        this.q = $$14;
    }

    public ds a(dr $$0) {
        if (this.c == $$0) {
            return this;
        }
        return new ds($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
    }

    public ds a(bfj $$0) {
        if (this.k == $$0) {
            return this;
        }
        return new ds(this.c, this.d, this.n, this.e, this.f, $$0.Z().getString(), $$0.H_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p, this.q);
    }

    public ds a(eei $$0) {
        if (this.d.equals($$0)) {
            return this;
        }
        return new ds(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
    }

    public ds a(eeh $$0) {
        if (this.n.c($$0)) {
            return this;
        }
        return new ds(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
    }

    public ds a(ResultConsumer<ds> $$0) {
        if (Objects.equals(this.l, $$0)) {
            return this;
        }
        return new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p, this.q);
    }

    public ds a(ResultConsumer<ds> $$0, BinaryOperator<ResultConsumer<ds>> $$1) {
        ResultConsumer $$2 = (ResultConsumer)$$1.apply(this.l, $$0);
        return this.a((ResultConsumer<ds>)$$2);
    }

    public ds a() {
        if (this.j || this.c.f_()) {
            return this;
        }
        return new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p, this.q);
    }

    public ds a(int $$0) {
        if ($$0 == this.f) {
            return this;
        }
        return new ds(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
    }

    public ds b(int $$0) {
        if ($$0 <= this.f) {
            return this;
        }
        return new ds(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
    }

    public ds a(eb.a $$0) {
        if ($$0 == this.m) {
            return this;
        }
        return new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p, this.q);
    }

    public ds a(aif $$0) {
        if ($$0 == this.e) {
            return this;
        }
        double $$1 = dfk.a(this.e.x_(), $$0.x_());
        eei $$2 = new eei(this.d.c * $$1, this.d.d, this.d.e * $$1);
        return new ds(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
    }

    public ds a(bfj $$0, eb.a $$1) {
        return this.b($$1.a($$0));
    }

    public ds b(eei $$0) {
        eei $$1 = this.m.a(this);
        double $$2 = $$0.c - $$1.c;
        double $$3 = $$0.d - $$1.d;
        double $$4 = $$0.e - $$1.e;
        double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
        float $$6 = apa.g((float)(-(apa.d($$3, $$5) * 57.2957763671875)));
        float $$7 = apa.g((float)(apa.d($$4, $$2) * 57.2957763671875) - 90.0f);
        return this.a(new eeh($$6, $$7));
    }

    public ds a(dq $$0) {
        if ($$0 == this.o) {
            return this;
        }
        return new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, this.p, this.q);
    }

    public ds a(apt $$0) {
        if ($$0 == this.p) {
            return this;
        }
        return new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, $$0, this.q);
    }

    public ds a(IntConsumer $$0) {
        if ($$0 == this.q) {
            return this;
        }
        return new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, $$0);
    }

    public sw b() {
        return this.h;
    }

    public String c() {
        return this.g;
    }

    @Override
    public boolean c(int $$0) {
        return this.f >= $$0;
    }

    public eei d() {
        return this.d;
    }

    public aif e() {
        return this.e;
    }

    @Nullable
    public bfj f() {
        return this.k;
    }

    public bfj g() throws CommandSyntaxException {
        if (this.k == null) {
            throw b.create();
        }
        return this.k;
    }

    public aig h() throws CommandSyntaxException {
        bfj bfj2 = this.k;
        if (bfj2 instanceof aig) {
            aig $$0 = (aig)bfj2;
            return $$0;
        }
        throw a.create();
    }

    @Nullable
    public aig i() {
        aig $$0;
        bfj bfj2 = this.k;
        return bfj2 instanceof aig ? ($$0 = (aig)bfj2) : null;
    }

    public boolean j() {
        return this.k instanceof aig;
    }

    public eeh k() {
        return this.n;
    }

    public MinecraftServer l() {
        return this.i;
    }

    public eb.a m() {
        return this.m;
    }

    public dq n() {
        return this.o;
    }

    public apt o() {
        return this.p;
    }

    public IntConsumer p() {
        return this.q;
    }

    public boolean a(aig $$0) {
        aig $$1 = this.i();
        if ($$0 == $$1) {
            return false;
        }
        return $$1 != null && $$1.U() || $$0.U();
    }

    public void a(tk $$0, boolean $$1, ss.a $$2) {
        if (this.j) {
            return;
        }
        aig $$3 = this.i();
        if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
        } else {
            this.c.a($$2.a($$0.a()));
        }
    }

    public void a(sw $$0) {
        if (this.j) {
            return;
        }
        aig $$1 = this.i();
        if ($$1 != null) {
            $$1.a($$0);
        } else {
            this.c.a($$0);
        }
    }

    public void a(Supplier<sw> $$0, boolean $$1) {
        boolean $$3;
        boolean $$2 = this.c.e_() && !this.j;
        boolean bl2 = $$3 = $$1 && this.c.N_() && !this.j;
        if (!$$2 && !$$3) {
            return;
        }
        sw $$4 = $$0.get();
        if ($$2) {
            this.c.a($$4);
        }
        if ($$3) {
            this.c($$4);
        }
    }

    private void c(sw $$0) {
        tj $$1 = sw.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
        if (this.i.aI().b(cmi.o)) {
            for (aig $$2 : this.i.ac().t()) {
                if ($$2 == this.c || !this.i.ac().f($$2.fM())) continue;
                $$2.a($$1);
            }
        }
        if (this.c != this.i && this.i.aI().b(cmi.l)) {
            this.i.a($$1);
        }
    }

    public void b(sw $$0) {
        if (this.c.q_() && !this.j) {
            this.c.a(sw.h().b($$0).a(n.m));
        }
    }

    public void a(CommandContext<ds> $$0, boolean $$1, int $$2) {
        if (this.l != null) {
            this.l.onCommandComplete($$0, $$1, $$2);
        }
    }

    @Override
    public Collection<String> q() {
        return Lists.newArrayList((Object[])this.i.J());
    }

    @Override
    public Collection<String> r() {
        return this.i.aF().f();
    }

    @Override
    public Stream<acq> s() {
        return jb.c.s().map(amg::a);
    }

    @Override
    public Stream<acq> t() {
        return this.i.aE().d();
    }

    @Override
    public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
        return Suggestions.empty();
    }

    @Override
    public CompletableFuture<Suggestions> a(acp<? extends hr<?>> $$0, du.a $$1, SuggestionsBuilder $$22, CommandContext<?> $$3) {
        return this.v().c($$0).map($$2 -> {
            this.a((hr<?>)$$2, $$1, $$22);
            return $$22.buildFuture();
        }).orElseGet(Suggestions::empty);
    }

    @Override
    public Set<acp<cmm>> u() {
        return this.i.E();
    }

    @Override
    public hs v() {
        return this.i.aV();
    }

    @Override
    public caw w() {
        return this.e.G();
    }
}

