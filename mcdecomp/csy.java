/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public abstract class csy
extends cpn {
    protected final ha a;
    protected final boolean b;
    protected final efb c;

    protected csy(dca.d $$0, ha $$1, efb $$2, boolean $$3) {
        super($$0);
        this.a = $$1;
        this.c = $$2;
        this.b = $$3;
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        dcb $$1 = $$0.q().a_($$0.a().a(this.a));
        if ($$1.a(this.b()) || $$1.a(this.a())) {
            return this.a().n();
        }
        return this.a($$0.q());
    }

    public dcb a(cmn $$0) {
        return this.n();
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        gu $$3 = $$2.a(this.a.g());
        dcb $$4 = $$1.a_($$3);
        if (!this.h($$4)) {
            return false;
        }
        return $$4.a(this.b()) || $$4.a(this.a()) || $$4.d($$1, $$3, this.a);
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if (!$$0.a((cmp)$$1, $$2)) {
            $$1.b($$2, true);
        }
    }

    protected boolean h(dcb $$0) {
        return true;
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return this.c;
    }

    protected abstract cta b();

    protected abstract cpn a();
}

