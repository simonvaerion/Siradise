/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public abstract class czh
extends czn
implements bdq,
bea,
beb {
    private bdz c = bdz.a;
    @Nullable
    private sw d;

    protected czh(czp<?> $$0, gu $$1, dcb $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.c = bdz.b($$0);
        if ($$0.b("CustomName", 8)) {
            this.d = sw.a.a($$0.l("CustomName"));
        }
    }

    @Override
    protected void b(qr $$0) {
        super.b($$0);
        this.c.a($$0);
        if (this.d != null) {
            $$0.a("CustomName", sw.a.a(this.d));
        }
    }

    public void a(sw $$0) {
        this.d = $$0;
    }

    @Override
    public sw Z() {
        if (this.d != null) {
            return this.d;
        }
        return this.g();
    }

    @Override
    public sw H_() {
        return this.Z();
    }

    @Override
    @Nullable
    public sw ab() {
        return this.d;
    }

    protected abstract sw g();

    public boolean d(byo $$0) {
        return czh.a($$0, this.c, this.H_());
    }

    public static boolean a(byo $$0, bdz $$1, sw $$2) {
        if ($$0.G_() || $$1.a($$0.eO())) {
            return true;
        }
        $$0.a(sw.a("container.isLocked", $$2), true);
        $$0.a(amh.ei, ami.e, 1.0f, 1.0f);
        return false;
    }

    @Override
    @Nullable
    public cbf createMenu(int $$0, byn $$1, byo $$2) {
        if (this.d($$2)) {
            return this.a($$0, $$1);
        }
        return null;
    }

    protected abstract cbf a(int var1, byn var2);
}

