/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class czn {
    private static final Logger c = LogUtils.getLogger();
    private final czp<?> d;
    @Nullable
    protected cmm o;
    protected final gu p;
    protected boolean q;
    private dcb e;

    public czn(czp<?> $$0, gu $$1, dcb $$2) {
        this.d = $$0;
        this.p = $$1.i();
        this.e = $$2;
    }

    public static gu c(qr $$0) {
        return new gu($$0.h("x"), $$0.h("y"), $$0.h("z"));
    }

    @Nullable
    public cmm k() {
        return this.o;
    }

    public void a(cmm $$0) {
        this.o = $$0;
    }

    public boolean l() {
        return this.o != null;
    }

    public void a(qr $$0) {
    }

    protected void b(qr $$0) {
    }

    public final qr m() {
        qr $$0 = this.o();
        this.e($$0);
        return $$0;
    }

    public final qr n() {
        qr $$0 = this.o();
        this.d($$0);
        return $$0;
    }

    public final qr o() {
        qr $$0 = new qr();
        this.b($$0);
        return $$0;
    }

    private void d(qr $$0) {
        acq $$1 = czp.a(this.u());
        if ($$1 == null) {
            throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
        }
        $$0.a("id", $$1.toString());
    }

    public static void a(qr $$0, czp<?> $$1) {
        $$0.a("id", czp.a($$1).toString());
    }

    public void e(cfz $$0) {
        cds.a($$0, this.u(), this.o());
    }

    private void e(qr $$0) {
        this.d($$0);
        $$0.a("x", this.p.u());
        $$0.a("y", this.p.v());
        $$0.a("z", this.p.w());
    }

    @Nullable
    public static czn a(gu $$0, dcb $$1, qr $$22) {
        String $$32 = $$22.l("id");
        acq $$4 = acq.a($$32);
        if ($$4 == null) {
            c.error("Block entity has invalid type: {}", (Object)$$32);
            return null;
        }
        return jb.l.b($$4).map($$3 -> {
            try {
                return $$3.a($$0, $$1);
            }
            catch (Throwable $$4) {
                c.error("Failed to create block entity {}", (Object)$$32, (Object)$$4);
                return null;
            }
        }).map($$2 -> {
            try {
                $$2.a($$22);
                return $$2;
            }
            catch (Throwable $$3) {
                c.error("Failed to load data for block entity {}", (Object)$$32, (Object)$$3);
                return null;
            }
        }).orElseGet(() -> {
            c.warn("Skipping BlockEntity with id {}", (Object)$$32);
            return null;
        });
    }

    public void e() {
        if (this.o != null) {
            czn.a(this.o, this.p, this.e);
        }
    }

    protected static void a(cmm $$0, gu $$1, dcb $$2) {
        $$0.p($$1);
        if (!$$2.i()) {
            $$0.c($$1, $$2.b());
        }
    }

    public gu p() {
        return this.p;
    }

    public dcb q() {
        return this.e;
    }

    @Nullable
    public uo<ur> h() {
        return null;
    }

    public qr ao_() {
        return new qr();
    }

    public boolean r() {
        return this.q;
    }

    public void ap_() {
        this.q = true;
    }

    public void s() {
        this.q = false;
    }

    public boolean a_(int $$0, int $$1) {
        return false;
    }

    public void a(p $$0) {
        $$0.a("Name", () -> jb.l.b(this.u()) + " // " + this.getClass().getCanonicalName());
        if (this.o == null) {
            return;
        }
        p.a($$0, this.o, this.p, this.q());
        p.a($$0, this.o, this.p, this.o.a_(this.p));
    }

    public boolean t() {
        return false;
    }

    public czp<?> u() {
        return this.d;
    }

    @Deprecated
    public void b(dcb $$0) {
        this.e = $$0;
    }
}

