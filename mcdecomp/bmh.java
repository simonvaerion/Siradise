/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bmh
extends bmv {
    private static final bqm d = bqm.b().a(8.0).d();
    protected final brl a;
    private final Class<? extends brl> e;
    protected final cmm b;
    @Nullable
    protected brl c;
    private int f;
    private final double g;

    public bmh(brl $$0, double $$1) {
        this($$0, $$1, $$0.getClass());
    }

    public bmh(brl $$0, double $$1, Class<? extends brl> $$2) {
        this.a = $$0;
        this.b = $$0.dI();
        this.e = $$2;
        this.g = $$1;
        this.a(EnumSet.of(bmv.a.a, bmv.a.b));
    }

    @Override
    public boolean a() {
        if (!this.a.gc()) {
            return false;
        }
        this.c = this.h();
        return this.c != null;
    }

    @Override
    public boolean b() {
        return this.c.bs() && this.c.gc() && this.f < 60;
    }

    @Override
    public void d() {
        this.c = null;
        this.f = 0;
    }

    @Override
    public void e() {
        this.a.E().a(this.c, 10.0f, (float)this.a.X());
        this.a.J().a((bfj)this.c, this.g);
        ++this.f;
        if (this.f >= this.a(60) && this.a.f((bfj)this.c) < 9.0) {
            this.g();
        }
    }

    @Nullable
    private brl h() {
        List<? extends brl> $$0 = this.b.a(this.e, d, this.a, this.a.cE().g(8.0));
        double $$1 = Double.MAX_VALUE;
        brl $$2 = null;
        for (brl brl2 : $$0) {
            if (!this.a.a(brl2) || !(this.a.f((bfj)brl2) < $$1)) continue;
            $$2 = brl2;
            $$1 = this.a.f((bfj)brl2);
        }
        return $$2;
    }

    protected void g() {
        this.a.a((aif)this.b, this.c);
    }
}

