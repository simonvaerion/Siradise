/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ga {
    public static final int a = Integer.MAX_VALUE;
    public static final BiConsumer<eei, List<? extends bfj>> b = ($$0, $$1) -> {};
    private static final dfz<bfj, ?> c = new dfz<bfj, bfj>(){

        @Override
        public bfj a(bfj $$0) {
            return $$0;
        }

        @Override
        public Class<? extends bfj> a() {
            return bfj.class;
        }
    };
    private final int d;
    private final boolean e;
    private final boolean f;
    private final Predicate<bfj> g;
    private final cj.c h;
    private final Function<eei, eei> i;
    @Nullable
    private final eed j;
    private final BiConsumer<eei, List<? extends bfj>> k;
    private final boolean l;
    @Nullable
    private final String m;
    @Nullable
    private final UUID n;
    private final dfz<bfj, ?> o;
    private final boolean p;

    public ga(int $$0, boolean $$1, boolean $$2, Predicate<bfj> $$3, cj.c $$4, Function<eei, eei> $$5, @Nullable eed $$6, BiConsumer<eei, List<? extends bfj>> $$7, boolean $$8, @Nullable String $$9, @Nullable UUID $$10, @Nullable bfn<?> $$11, boolean $$12) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
        this.j = $$6;
        this.k = $$7;
        this.l = $$8;
        this.m = $$9;
        this.n = $$10;
        this.o = $$11 == null ? c : $$11;
        this.p = $$12;
    }

    public int a() {
        return this.d;
    }

    public boolean b() {
        return this.e;
    }

    public boolean c() {
        return this.l;
    }

    public boolean d() {
        return this.f;
    }

    public boolean e() {
        return this.p;
    }

    private void e(ds $$0) throws CommandSyntaxException {
        if (this.p && !$$0.c(2)) {
            throw ec.f.create();
        }
    }

    public bfj a(ds $$0) throws CommandSyntaxException {
        this.e($$0);
        List<? extends bfj> $$1 = this.b($$0);
        if ($$1.isEmpty()) {
            throw ec.d.create();
        }
        if ($$1.size() > 1) {
            throw ec.a.create();
        }
        return $$1.get(0);
    }

    public List<? extends bfj> b(ds $$0) throws CommandSyntaxException {
        return this.f($$0).stream().filter($$1 -> $$1.ae().a($$0.w())).toList();
    }

    private List<? extends bfj> f(ds $$0) throws CommandSyntaxException {
        this.e($$0);
        if (!this.e) {
            return this.d($$0);
        }
        if (this.m != null) {
            aig $$1 = $$0.l().ac().a(this.m);
            if ($$1 == null) {
                return Collections.emptyList();
            }
            return Lists.newArrayList((Object[])new aig[]{$$1});
        }
        if (this.n != null) {
            for (aif $$2 : $$0.l().F()) {
                bfj $$3 = $$2.a(this.n);
                if ($$3 == null) continue;
                return Lists.newArrayList((Object[])new bfj[]{$$3});
            }
            return Collections.emptyList();
        }
        eei $$4 = this.i.apply($$0.d());
        Predicate<bfj> $$5 = this.a($$4);
        if (this.l) {
            if ($$0.f() != null && $$5.test($$0.f())) {
                return Lists.newArrayList((Object[])new bfj[]{$$0.f()});
            }
            return Collections.emptyList();
        }
        ArrayList $$6 = Lists.newArrayList();
        if (this.d()) {
            this.a($$6, $$0.e(), $$4, $$5);
        } else {
            for (aif $$7 : $$0.l().F()) {
                this.a($$6, $$7, $$4, $$5);
            }
        }
        return this.a($$4, $$6);
    }

    private void a(List<bfj> $$0, aif $$1, eei $$2, Predicate<bfj> $$3) {
        int $$4 = this.f();
        if ($$0.size() >= $$4) {
            return;
        }
        if (this.j != null) {
            $$1.a(this.o, this.j.c($$2), $$3, $$0, $$4);
        } else {
            $$1.a(this.o, $$3, $$0, $$4);
        }
    }

    private int f() {
        return this.k == b ? this.d : Integer.MAX_VALUE;
    }

    public aig c(ds $$0) throws CommandSyntaxException {
        this.e($$0);
        List<aig> $$1 = this.d($$0);
        if ($$1.size() != 1) {
            throw ec.e.create();
        }
        return $$1.get(0);
    }

    public List<aig> d(ds $$0) throws CommandSyntaxException {
        ArrayList $$8;
        this.e($$0);
        if (this.m != null) {
            aig $$1 = $$0.l().ac().a(this.m);
            if ($$1 == null) {
                return Collections.emptyList();
            }
            return Lists.newArrayList((Object[])new aig[]{$$1});
        }
        if (this.n != null) {
            aig $$2 = $$0.l().ac().a(this.n);
            if ($$2 == null) {
                return Collections.emptyList();
            }
            return Lists.newArrayList((Object[])new aig[]{$$2});
        }
        eei $$3 = this.i.apply($$0.d());
        Predicate<bfj> $$4 = this.a($$3);
        if (this.l) {
            aig $$5;
            if ($$0.f() instanceof aig && $$4.test($$5 = (aig)$$0.f())) {
                return Lists.newArrayList((Object[])new aig[]{$$5});
            }
            return Collections.emptyList();
        }
        int $$6 = this.f();
        if (this.d()) {
            List<aig> $$7 = $$0.e().a($$4, $$6);
        } else {
            $$8 = Lists.newArrayList();
            for (aig $$9 : $$0.l().ac().t()) {
                if (!$$4.test($$9)) continue;
                $$8.add($$9);
                if ($$8.size() < $$6) continue;
                return $$8;
            }
        }
        return this.a($$3, $$8);
    }

    private Predicate<bfj> a(eei $$0) {
        Predicate<bfj> $$12 = this.g;
        if (this.j != null) {
            eed $$2 = this.j.c($$0);
            $$12 = $$12.and($$1 -> $$2.c($$1.cE()));
        }
        if (!this.h.c()) {
            $$12 = $$12.and($$1 -> this.h.e($$1.e($$0)));
        }
        return $$12;
    }

    private <T extends bfj> List<T> a(eei $$0, List<T> $$1) {
        if ($$1.size() > 1) {
            this.k.accept($$0, $$1);
        }
        return $$1.subList(0, Math.min(this.d, $$1.size()));
    }

    public static sw a(List<? extends bfj> $$0) {
        return sy.b($$0, bfj::H_);
    }
}

