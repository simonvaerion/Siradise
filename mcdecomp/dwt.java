/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class dwt
implements dww {
    public static final int b = 1;
    protected final cmo c;
    @Nullable
    private final dwv<?, ?> a;
    @Nullable
    private final dwv<?, ?> d;

    public dwt(del $$0, boolean $$1, boolean $$2) {
        this.c = $$0.q();
        this.a = $$1 ? new dwm($$0) : null;
        this.d = $$2 ? new dwx($$0) : null;
    }

    @Override
    public void a(gu $$0) {
        if (this.a != null) {
            this.a.a($$0);
        }
        if (this.d != null) {
            this.d.a($$0);
        }
    }

    @Override
    public boolean E_() {
        if (this.d != null && this.d.E_()) {
            return true;
        }
        return this.a != null && this.a.E_();
    }

    @Override
    public int a() {
        int $$0 = 0;
        if (this.a != null) {
            $$0 += this.a.a();
        }
        if (this.d != null) {
            $$0 += this.d.a();
        }
        return $$0;
    }

    @Override
    public void a(hx $$0, boolean $$1) {
        if (this.a != null) {
            this.a.a($$0, $$1);
        }
        if (this.d != null) {
            this.d.a($$0, $$1);
        }
    }

    @Override
    public void a(clt $$0, boolean $$1) {
        if (this.a != null) {
            this.a.a($$0, $$1);
        }
        if (this.d != null) {
            this.d.a($$0, $$1);
        }
    }

    @Override
    public void b(clt $$0) {
        if (this.a != null) {
            this.a.b($$0);
        }
        if (this.d != null) {
            this.d.b($$0);
        }
    }

    public dwr a(cmv $$0) {
        if ($$0 == cmv.b) {
            if (this.a == null) {
                return dwr.a.a;
            }
            return this.a;
        }
        if (this.d == null) {
            return dwr.a.a;
        }
        return this.d;
    }

    public String a(cmv $$0, hx $$1) {
        if ($$0 == cmv.b) {
            if (this.a != null) {
                return this.a.b($$1.s());
            }
        } else if (this.d != null) {
            return this.d.b($$1.s());
        }
        return "n/a";
    }

    public dws.b b(cmv $$0, hx $$1) {
        if ($$0 == cmv.b) {
            if (this.a != null) {
                return this.a.c($$1.s());
            }
        } else if (this.d != null) {
            return this.d.c($$1.s());
        }
        return dws.b.a;
    }

    public void a(cmv $$0, hx $$1, @Nullable ded $$2) {
        if ($$0 == cmv.b) {
            if (this.a != null) {
                this.a.a($$1.s(), $$2);
            }
        } else if (this.d != null) {
            this.d.a($$1.s(), $$2);
        }
    }

    public void b(clt $$0, boolean $$1) {
        if (this.a != null) {
            this.a.b($$0, $$1);
        }
        if (this.d != null) {
            this.d.b($$0, $$1);
        }
    }

    public int a(gu $$0, int $$1) {
        int $$2 = this.d == null ? 0 : this.d.b($$0) - $$1;
        int $$3 = this.a == null ? 0 : this.a.b($$0);
        return Math.max($$3, $$2);
    }

    public boolean a(hx $$0) {
        long $$1 = $$0.s();
        return this.a == null || ((dws)this.a.f).j($$1) && (this.d == null || ((dws)this.d.f).j($$1));
    }

    public int c() {
        return this.c.ak() + 2;
    }

    public int d() {
        return this.c.al() - 1;
    }

    public int e() {
        return this.d() + this.c();
    }
}

