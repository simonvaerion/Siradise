/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.joml.Vector3f
 */
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class evr
extends euq {
    private final dav b;
    private daw c;
    private final String[] k;
    private final boolean l;
    protected final ddo a;
    private int m;
    private int n;
    @Nullable
    private erq o;

    public evr(dav $$0, boolean $$1, boolean $$2) {
        this($$0, $$1, $$2, sw.c("sign.edit"));
    }

    public evr(dav $$0, boolean $$12, boolean $$2, sw $$3) {
        super($$3);
        this.b = $$0;
        this.c = $$0.a($$12);
        this.l = $$12;
        this.a = cwn.a($$0.q().b());
        this.k = (String[])IntStream.range(0, 4).mapToObj($$1 -> this.c.a($$1, $$2)).map(sw::getString).toArray(String[]::new);
    }

    @Override
    protected void b() {
        this.d(epi.a(sv.d, (epi $$0) -> this.C()).a(this.g / 2 - 100, this.h / 4 + 144, 200, 20).a());
        this.o = new erq(() -> this.k[this.n], this::a, erq.a(this.f), erq.c(this.f), $$0 -> this.f.h.b((String)$$0) <= this.b.d());
    }

    @Override
    public void f() {
        ++this.m;
        if (!this.B()) {
            this.C();
        }
    }

    private boolean B() {
        return this.f != null && this.f.t != null && !this.b.r() && !this.b.b(this.f.t.ct());
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 265) {
            this.n = this.n - 1 & 3;
            this.o.f();
            return true;
        }
        if ($$0 == 264 || $$0 == 257 || $$0 == 335) {
            this.n = this.n + 1 & 3;
            this.o.f();
            return true;
        }
        if (this.o.a($$0)) {
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public boolean a(char $$0, int $$1) {
        this.o.a($$0);
        return true;
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        ehf.a();
        this.a($$0);
        $$0.a(this.i, this.e, this.g / 2, 40, 0xFFFFFF);
        this.c($$0);
        ehf.b();
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void aw_() {
        this.C();
    }

    @Override
    public void ax_() {
        fex $$0 = this.f.I();
        if ($$0 != null) {
            $$0.a(new aau(this.b.p(), this.l, this.k[0], this.k[1], this.k[2], this.k[3]));
        }
    }

    @Override
    public boolean az_() {
        return false;
    }

    protected abstract void a(eox var1, dcb var2);

    protected abstract Vector3f l();

    protected void b(eox $$0, dcb $$1) {
        $$0.c().a((float)this.g / 2.0f, 90.0f, 50.0f);
    }

    private void c(eox $$0) {
        dcb $$1 = this.b.q();
        $$0.c().a();
        this.b($$0, $$1);
        $$0.c().a();
        this.a($$0, $$1);
        $$0.c().b();
        this.d($$0);
        $$0.c().b();
    }

    private void d(eox $$0) {
        $$0.c().a(0.0f, 0.0f, 4.0f);
        Vector3f $$1 = this.l();
        $$0.c().b($$1.x(), $$1.y(), $$1.z());
        int $$2 = this.c.b().g();
        boolean $$3 = this.m / 6 % 2 == 0;
        int $$4 = this.o.g();
        int $$5 = this.o.h();
        int $$6 = 4 * this.b.c() / 2;
        int $$7 = this.n * this.b.c() - $$6;
        for (int $$8 = 0; $$8 < this.k.length; ++$$8) {
            String $$9 = this.k[$$8];
            if ($$9 == null) continue;
            if (this.i.a()) {
                $$9 = this.i.a($$9);
            }
            int $$10 = -this.i.b($$9) / 2;
            $$0.a(this.i, $$9, $$10, $$8 * this.b.c() - $$6, $$2, false);
            if ($$8 != this.n || $$4 < 0 || !$$3) continue;
            int $$11 = this.i.b($$9.substring(0, Math.max(Math.min($$4, $$9.length()), 0)));
            int $$12 = $$11 - this.i.b($$9) / 2;
            if ($$4 < $$9.length()) continue;
            $$0.a(this.i, "_", $$12, $$7, $$2, false);
        }
        for (int $$13 = 0; $$13 < this.k.length; ++$$13) {
            String $$14 = this.k[$$13];
            if ($$14 == null || $$13 != this.n || $$4 < 0) continue;
            int $$15 = this.i.b($$14.substring(0, Math.max(Math.min($$4, $$14.length()), 0)));
            int $$16 = $$15 - this.i.b($$14) / 2;
            if ($$3 && $$4 < $$14.length()) {
                $$0.a($$16, $$7 - 1, $$16 + 1, $$7 + this.b.c(), 0xFF000000 | $$2);
            }
            if ($$5 == $$4) continue;
            int $$17 = Math.min($$4, $$5);
            int $$18 = Math.max($$4, $$5);
            int $$19 = this.i.b($$14.substring(0, $$17)) - this.i.b($$14) / 2;
            int $$20 = this.i.b($$14.substring(0, $$18)) - this.i.b($$14) / 2;
            int $$21 = Math.min($$19, $$20);
            int $$22 = Math.max($$19, $$20);
            $$0.a(fkf.E(), $$21, $$7, $$22, $$7 + this.b.c(), -16776961);
        }
    }

    private void a(String $$0) {
        this.k[this.n] = $$0;
        this.c = this.c.a(this.n, sw.b($$0));
        this.b.a(this.c, this.l);
    }

    private void C() {
        this.f.a((euq)null);
    }
}

