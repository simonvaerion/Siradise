/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bwu
extends bwc
implements bvu,
bxa {
    private static final aby<Boolean> d = acb.a(bwu.class, aca.k);
    private static final int e = 40;
    private static final int bT = 1;
    private static final float bU = 0.6f;
    private static final int bV = 6;
    private static final float bW = 0.5f;
    private static final int bX = 40;
    private static final int bY = 15;
    private static final int bZ = 200;
    private static final float ca = 0.3f;
    private static final float cb = 0.4f;
    private int cc;
    protected static final ImmutableList<? extends bqg<? extends bqf<? super bwu>>> b = ImmutableList.of(bqg.c, bqg.d);
    protected static final ImmutableList<? extends bpb<?>> c = ImmutableList.of(bpb.g, bpb.h, bpb.k, bpb.l, bpb.n, bpb.m, bpb.E, bpb.t, bpb.o, bpb.p);

    public bwu(bfn<? extends bwu> $$0, cmm $$1) {
        super((bfn<? extends bwc>)$$0, $$1);
        this.bJ = 5;
    }

    protected bha.b<bwu> dL() {
        return bha.a(c, b);
    }

    @Override
    protected bha<?> a(Dynamic<?> $$0) {
        bha<bwu> $$1 = this.dL().a($$0);
        bwu.a($$1);
        bwu.b($$1);
        bwu.c($$1);
        $$1.a((Set<bzz>)ImmutableSet.of((Object)bzz.a));
        $$1.b(bzz.b);
        $$1.f();
        return $$1;
    }

    private static void a(bha<bwu> $$0) {
        $$0.a(bzz.a, 0, (ImmutableList<bhs<bwu>>)ImmutableList.of((Object)new biw(45, 90), (Object)new bja()));
    }

    private static void b(bha<bwu> $$0) {
        $$0.a(bzz.b, 10, (ImmutableList<bhs<bwu>>)ImmutableList.of(bkc.a(bwu::ga), bjq.a(8.0f, bdi.a(30, 60)), new bjn(ImmutableList.of((Object)Pair.of(bji.a(0.4f), (Object)2), (Object)Pair.of(bjx.a(0.4f, 3), (Object)2), (Object)Pair.of((Object)new bib(30, 60), (Object)1)))));
    }

    private static void c(bha<bwu> $$0) {
        $$0.a(bzz.k, 10, (ImmutableList<bhs<bwu>>)ImmutableList.of(bjv.a(1.0f), bld.a(bwu::r, bix.a(40)), bld.a(bwu::h_, bix.a(15)), bkf.a()), bpb.o);
    }

    private Optional<? extends bfz> ga() {
        return this.dK().c(bpb.h).orElse(bpd.a()).a(this::l);
    }

    private boolean l(bfz $$0) {
        bfn<?> $$1 = $$0.ae();
        return $$1 != bfn.bo && $$1 != bfn.u && bqf.c(this, $$0);
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(d, false);
    }

    @Override
    public void a(aby<?> $$0) {
        super.a($$0);
        if (d.equals($$0)) {
            this.d_();
        }
    }

    public static bhf.a q() {
        return bwc.ge().a(bhg.a, 40.0).a(bhg.d, 0.3f).a(bhg.c, 0.6f).a(bhg.g, 1.0).a(bhg.f, 6.0);
    }

    public boolean r() {
        return !this.h_();
    }

    @Override
    public boolean z(bfj $$0) {
        if (!($$0 instanceof bfz)) {
            return false;
        }
        this.cc = 10;
        this.dI().a((bfj)this, (byte)4);
        this.a(amh.AL, 1.0f, this.eS());
        return bxa.a(this, (bfz)$$0);
    }

    @Override
    public boolean a(byo $$0) {
        return !this.fO();
    }

    @Override
    protected void e(bfz $$0) {
        if (!this.h_()) {
            bxa.b(this, $$0);
        }
    }

    @Override
    public double bx() {
        return (double)this.de() - (this.h_() ? 0.2 : 0.15);
    }

    @Override
    public boolean a(ben $$0, float $$1) {
        boolean $$2 = super.a($$0, $$1);
        if (this.dI().B) {
            return false;
        }
        if (!$$2 || !($$0.d() instanceof bfz)) {
            return $$2;
        }
        bfz $$3 = (bfz)$$0.d();
        if (this.c($$3) && !bht.a((bfz)this, $$3, 4.0)) {
            this.m($$3);
        }
        return $$2;
    }

    private void m(bfz $$0) {
        this.bA.b(bpb.E);
        this.bA.a(bpb.o, $$0, 200L);
    }

    public bha<bwu> dK() {
        return super.dK();
    }

    protected void w() {
        bzz $$0 = this.bA.g().orElse(null);
        this.bA.a((List<bzz>)ImmutableList.of((Object)bzz.k, (Object)bzz.b));
        bzz $$1 = this.bA.g().orElse(null);
        if ($$1 == bzz.k && $$0 != bzz.k) {
            this.fZ();
        }
        this.v(this.bA.a(bpb.o));
    }

    @Override
    protected void W() {
        this.dI().ad().a("zoglinBrain");
        this.dK().a((aif)this.dI(), this);
        this.dI().ad().c();
        this.w();
    }

    @Override
    public void a(boolean $$0) {
        this.aj().b(d, $$0);
        if (!this.dI().B && $$0) {
            this.a(bhg.f).a(0.5);
        }
    }

    @Override
    public boolean h_() {
        return this.aj().b(d);
    }

    @Override
    public void b_() {
        if (this.cc > 0) {
            --this.cc;
        }
        super.b_();
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 4) {
            this.cc = 10;
            this.a(amh.AL, 1.0f, this.eS());
        } else {
            super.b($$0);
        }
    }

    @Override
    public int fY() {
        return this.cc;
    }

    @Override
    protected amg s() {
        if (this.dI().B) {
            return null;
        }
        if (this.bA.a(bpb.o)) {
            return amh.AK;
        }
        return amh.AJ;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.AN;
    }

    @Override
    protected amg g_() {
        return amh.AM;
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        this.a(amh.AO, 0.15f, 1.0f);
    }

    protected void fZ() {
        this.a(amh.AK, 1.0f, this.eS());
    }

    @Override
    protected void V() {
        super.V();
        za.a(this);
    }

    @Override
    public bge eN() {
        return bge.b;
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        if (this.h_()) {
            $$0.a("IsBaby", true);
        }
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        if ($$0.q("IsBaby")) {
            this.a(true);
        }
    }
}

