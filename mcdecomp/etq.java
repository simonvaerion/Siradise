/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class etq
extends euq {
    private int a;
    private final sw b;
    private final boolean c;
    private sw k;
    private final List<epi> l = Lists.newArrayList();
    @Nullable
    private epi m;

    public etq(@Nullable sw $$0, boolean $$1) {
        super(sw.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    protected void b() {
        this.a = 0;
        this.l.clear();
        tj $$02 = this.c ? sw.c("deathScreen.spectate") : sw.c("deathScreen.respawn");
        this.l.add(this.d(epi.a($$02, (epi $$0) -> {
            this.f.t.fL();
            $$0.r = false;
        }).a(this.g / 2 - 100, this.h / 4 + 72, 200, 20).a()));
        this.m = this.d(epi.a(sw.c("deathScreen.titleScreen"), (epi $$0) -> this.f.aW().a(this.f, this, this::l, true)).a(this.g / 2 - 100, this.h / 4 + 96, 200, 20).a());
        this.l.add(this.m);
        this.c(false);
        this.k = sw.c("deathScreen.score").f(": ").b(sw.b(Integer.toString(this.f.t.fI())).a(n.o));
    }

    @Override
    public boolean av_() {
        return false;
    }

    private void l() {
        if (this.c) {
            this.B();
            return;
        }
        a $$02 = new a($$0 -> {
            if ($$0) {
                this.B();
            } else {
                this.f.t.fL();
                this.f.a((euq)null);
            }
        }, sw.c("deathScreen.quit.confirm"), sv.a, sw.c("deathScreen.titleScreen"), sw.c("deathScreen.respawn"));
        this.f.a($$02);
        $$02.b(20);
    }

    private void B() {
        if (this.f.s != null) {
            this.f.s.U();
        }
        this.f.b(new etx(sw.c("menu.savingLevel")));
        this.f.a(new euw());
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        $$0.b(0, 0, this.g, this.h, 0x60500000, -1602211792);
        $$0.c().a();
        $$0.c().b(2.0f, 2.0f, 2.0f);
        $$0.a(this.i, this.e, this.g / 2 / 2, 30, 0xFFFFFF);
        $$0.c().b();
        if (this.b != null) {
            $$0.a(this.i, this.b, this.g / 2, 85, 0xFFFFFF);
        }
        $$0.a(this.i, this.k, this.g / 2, 100, 0xFFFFFF);
        if (this.b != null && $$2 > 85 && $$2 < 85 + this.i.b) {
            ts $$4 = this.a($$1);
            $$0.a(this.i, $$4, $$1, $$2);
        }
        super.a($$0, $$1, $$2, $$3);
        if (this.m != null && this.f.aW().c()) {
            $$0.a(epf.m, this.m.p() + this.m.k() - 17, this.m.r() + 3, 182, 24, 15, 15);
        }
    }

    @Nullable
    private ts a(int $$0) {
        if (this.b == null) {
            return null;
        }
        int $$1 = this.f.h.a(this.b);
        int $$2 = this.g / 2 - $$1 / 2;
        int $$3 = this.g / 2 + $$1 / 2;
        if ($$0 < $$2 || $$0 > $$3) {
            return null;
        }
        return this.f.h.b().a(this.b, $$0 - $$2);
    }

    @Override
    public boolean a(double $$0, double $$1, int $$2) {
        ts $$3;
        if (this.b != null && $$1 > 85.0 && $$1 < (double)(85 + this.i.b) && ($$3 = this.a((int)$$0)) != null && $$3.h() != null && $$3.h().a() == su.a.a) {
            this.a($$3);
            return false;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public boolean az_() {
        return false;
    }

    @Override
    public void f() {
        super.f();
        ++this.a;
        if (this.a == 20) {
            this.c(true);
        }
    }

    private void c(boolean $$0) {
        for (epi $$1 : this.l) {
            $$1.r = $$0;
        }
    }

    public static class a
    extends etk {
        public a(BooleanConsumer $$0, sw $$1, sw $$2, sw $$3, sw $$4) {
            super($$0, $$1, $$2, $$3, $$4);
        }
    }
}

