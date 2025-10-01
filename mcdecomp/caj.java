/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface caj
extends bdq,
bea {
    public eei dg();

    @Nullable
    public acq A();

    public void a(@Nullable acq var1);

    public long C();

    public void a(long var1);

    public hn<cfz> D();

    public void E();

    public cmm dI();

    public boolean dD();

    @Override
    default public boolean ab_() {
        return this.g();
    }

    default public void c(qr $$0) {
        if (this.A() != null) {
            $$0.a("LootTable", this.A().toString());
            if (this.C() != 0L) {
                $$0.a("LootTableSeed", this.C());
            }
        } else {
            bdr.a($$0, this.D());
        }
    }

    default public void b_(qr $$0) {
        this.E();
        if ($$0.b("LootTable", 8)) {
            this.a(new acq($$0.l("LootTable")));
            this.a($$0.i("LootTableSeed"));
        } else {
            bdr.b($$0, this.D());
        }
    }

    default public void a(ben $$0, cmm $$1, bfj $$2) {
        bfj $$3;
        if (!$$1.X().b(cmi.h)) {
            return;
        }
        bdt.a($$1, $$2, (bdq)this);
        if (!$$1.B && ($$3 = $$0.c()) != null && $$3.ae() == bfn.bt) {
            bxf.a((byo)$$3, true);
        }
    }

    default public bdx c_(byo $$0) {
        $$0.a(this);
        if (!$$0.dI().B) {
            return bdx.b;
        }
        return bdx.a;
    }

    default public void f(@Nullable byo $$0) {
        MinecraftServer $$1 = this.dI().n();
        if (this.A() != null && $$1 != null) {
            dzs $$2 = $$1.aH().getLootTable(this.A());
            if ($$0 != null) {
                ai.N.a((aig)$$0, this.A());
            }
            this.a((acq)null);
            dzq.a $$3 = new dzq.a((aif)this.dI()).a(ebw.f, this.dg());
            if ($$0 != null) {
                $$3.a($$0.gj()).a(ebw.a, $$0);
            }
            $$2.a(this, $$3.a(ebv.b), this.C());
        }
    }

    default public void f() {
        this.f(null);
        this.D().clear();
    }

    default public boolean g() {
        for (cfz $$0 : this.D()) {
            if ($$0.b()) continue;
            return false;
        }
        return true;
    }

    default public cfz e_(int $$0) {
        this.f(null);
        cfz $$1 = this.D().get($$0);
        if ($$1.b()) {
            return cfz.b;
        }
        this.D().set($$0, cfz.b);
        return $$1;
    }

    default public cfz f_(int $$0) {
        this.f(null);
        return this.D().get($$0);
    }

    default public cfz b(int $$0, int $$1) {
        this.f(null);
        return bdr.a(this.D(), $$0, $$1);
    }

    default public void c(int $$0, cfz $$1) {
        this.f(null);
        this.D().set($$0, $$1);
        if (!$$1.b() && $$1.L() > this.ac_()) {
            $$1.f(this.ac_());
        }
    }

    default public bgs g_(final int $$0) {
        if ($$0 >= 0 && $$0 < this.b()) {
            return new bgs(){

                @Override
                public cfz a() {
                    return caj.this.f_($$0);
                }

                @Override
                public boolean a(cfz $$02) {
                    caj.this.c($$0, $$02);
                    return true;
                }
            };
        }
        return bgs.b;
    }

    default public boolean g(byo $$0) {
        return !this.dD() && this.dg().a((ho)$$0.dg(), 8.0);
    }
}

