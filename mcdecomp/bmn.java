/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;
import java.util.function.Predicate;

public class bmn
extends bmv {
    private static final int a = 40;
    private static final Predicate<dcb> b = dck.a(cpo.bt);
    private final bgb c;
    private final cmm d;
    private int e;

    public bmn(bgb $$0) {
        this.c = $$0;
        this.d = $$0.dI();
        this.a(EnumSet.of(bmv.a.a, bmv.a.b, bmv.a.c));
    }

    @Override
    public boolean a() {
        if (this.c.ec().a(this.c.h_() ? 50 : 1000) != 0) {
            return false;
        }
        gu $$0 = this.c.di();
        if (b.test(this.d.a_($$0))) {
            return true;
        }
        return this.d.a_($$0.d()).a(cpo.i);
    }

    @Override
    public void c() {
        this.e = this.a(40);
        this.d.a((bfj)this.c, (byte)10);
        this.c.J().n();
    }

    @Override
    public void d() {
        this.e = 0;
    }

    @Override
    public boolean b() {
        return this.e > 0;
    }

    public int h() {
        return this.e;
    }

    @Override
    public void e() {
        this.e = Math.max(0, this.e - 1);
        if (this.e != this.a(4)) {
            return;
        }
        gu $$0 = this.c.di();
        if (b.test(this.d.a_($$0))) {
            if (this.d.X().b(cmi.c)) {
                this.d.b($$0, false);
            }
            this.c.L();
        } else {
            gu $$1 = $$0.d();
            if (this.d.a_($$1).a(cpo.i)) {
                if (this.d.X().b(cmi.c)) {
                    this.d.c(2001, $$1, cpn.i(cpo.i.n()));
                    this.d.a($$1, cpo.j.n(), 2);
                }
                this.c.L();
            }
        }
    }
}

