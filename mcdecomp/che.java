/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class che
extends cfu {
    private static final Map<bfn<? extends bgb>, che> a = Maps.newIdentityHashMap();
    private final int b;
    private final int c;
    private final bfn<?> d;

    public che(bfn<? extends bgb> $$0, int $$1, int $$2, cfu.a $$3) {
        super($$3);
        this.d = $$0;
        this.b = $$1;
        this.c = $$2;
        a.put($$0, this);
    }

    @Override
    public bdx a(cij $$0) {
        gu $$10;
        czn $$6;
        cmm $$1 = $$0.q();
        if (!($$1 instanceof aif)) {
            return bdx.a;
        }
        cfz $$2 = $$0.n();
        gu $$3 = $$0.a();
        ha $$4 = $$0.k();
        dcb $$5 = $$1.a_($$3);
        if ($$5.a(cpo.ct) && ($$6 = $$1.c_($$3)) instanceof daz) {
            daz $$7 = (daz)$$6;
            bfn<?> $$8 = this.a($$2.v());
            $$7.a($$8, $$1.y_());
            $$6.e();
            $$1.a($$3, $$5, $$5, 3);
            $$1.a((bfj)$$0.o(), dgl.c, $$3);
            $$2.h(1);
            return bdx.b;
        }
        if ($$5.k($$1, $$3).b()) {
            gu $$9 = $$3;
        } else {
            $$10 = $$3.a($$4);
        }
        bfn<?> $$11 = this.a($$2.v());
        if ($$11.a((aif)$$1, $$2, $$0.o(), $$10, bgd.m, true, !Objects.equals($$3, $$10) && $$4 == ha.b) != null) {
            $$2.h(1);
            $$1.a((bfj)$$0.o(), dgl.t, $$3);
        }
        return bdx.b;
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
        cfz $$3 = $$1.b($$2);
        eee $$4 = che.a($$0, $$1, clv.b.b);
        if ($$4.c() != eeg.a.b) {
            return bdy.c($$3);
        }
        if (!($$0 instanceof aif)) {
            return bdy.a($$3);
        }
        eee $$5 = $$4;
        gu $$6 = $$5.a();
        if (!($$0.a_($$6).b() instanceof cua)) {
            return bdy.c($$3);
        }
        if (!$$0.a($$1, $$6) || !$$1.a($$6, $$5.b(), $$3)) {
            return bdy.d($$3);
        }
        bfn<?> $$7 = this.a($$3.v());
        Object $$8 = $$7.a((aif)$$0, $$3, $$1, $$6, bgd.m, false, false);
        if ($$8 == null) {
            return bdy.c($$3);
        }
        if (!$$1.fO().d) {
            $$3.h(1);
        }
        $$1.b(amr.c.b(this));
        $$0.a((bfj)$$1, dgl.t, ((bfj)$$8).dg());
        return bdy.b($$3);
    }

    public boolean a(@Nullable qr $$0, bfn<?> $$1) {
        return Objects.equals(this.a($$0), $$1);
    }

    public int a(int $$0) {
        return $$0 == 0 ? this.b : this.c;
    }

    @Nullable
    public static che a(@Nullable bfn<?> $$0) {
        return a.get($$0);
    }

    public static Iterable<che> h() {
        return Iterables.unmodifiableIterable(a.values());
    }

    public bfn<?> a(@Nullable qr $$0) {
        qr $$1;
        if ($$0 != null && $$0.b("EntityTag", 10) && ($$1 = $$0.p("EntityTag")).b("id", 8)) {
            return bfn.a($$1.l("id")).orElse(this.d);
        }
        return this.d;
    }

    @Override
    public caw m() {
        return this.d.m();
    }

    public Optional<bgb> a(byo $$0, bgb $$1, bfn<? extends bgb> $$2, aif $$3, eei $$4, cfz $$5) {
        bgb $$7;
        if (!this.a($$5.v(), $$2)) {
            return Optional.empty();
        }
        if ($$1 instanceof bfe) {
            bfe $$6 = ((bfe)$$1).a($$3, (bfe)$$1);
        } else {
            $$7 = $$2.a($$3);
        }
        if ($$7 == null) {
            return Optional.empty();
        }
        $$7.a(true);
        if (!$$7.h_()) {
            return Optional.empty();
        }
        $$7.b($$4.a(), $$4.b(), $$4.c(), 0.0f, 0.0f);
        $$3.a_($$7);
        if ($$5.A()) {
            $$7.b($$5.y());
        }
        if (!$$0.fO().d) {
            $$5.h(1);
        }
        return Optional.of($$7);
    }
}

