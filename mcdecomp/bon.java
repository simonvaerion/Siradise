/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bon
extends bov {
    private static final bqm a = bqm.a().d().e();
    private static final int b = 10;
    private boolean c;
    private int d;
    private final Class<?>[] i;
    @Nullable
    private Class<?>[] j;

    public bon(bgi $$0, Class<?> ... $$1) {
        super($$0, true);
        this.i = $$1;
        this.a(EnumSet.of(bmv.a.d));
    }

    @Override
    public boolean a() {
        int $$0 = this.e.ee();
        bfz $$1 = this.e.ed();
        if ($$0 == this.d || $$1 == null) {
            return false;
        }
        if ($$1.ae() == bfn.bt && this.e.dI().X().b(cmi.K)) {
            return false;
        }
        for (Class<?> $$2 : this.i) {
            if (!$$2.isAssignableFrom($$1.getClass())) continue;
            return false;
        }
        return this.a($$1, a);
    }

    public bon a(Class<?> ... $$0) {
        this.c = true;
        this.j = $$0;
        return this;
    }

    @Override
    public void c() {
        this.e.h(this.e.ed());
        this.g = this.e.j();
        this.d = this.e.ee();
        this.h = 300;
        if (this.c) {
            this.h();
        }
        super.c();
    }

    protected void h() {
        double $$0 = this.l();
        eed $$1 = eed.a(this.e.dg()).c($$0, 10.0, $$0);
        List<bfj> $$2 = this.e.dI().a(this.e.getClass(), $$1, bfm.f);
        for (bgb bgb2 : $$2) {
            if (this.e == bgb2 || bgb2.j() != null || this.e instanceof bgv && ((bgv)this.e).I_() != ((bgv)bgb2).I_() || bgb2.p(this.e.ed())) continue;
            if (this.j != null) {
                boolean $$4 = false;
                for (Class<?> $$5 : this.j) {
                    if (bgb2.getClass() != $$5) continue;
                    $$4 = true;
                    break;
                }
                if ($$4) continue;
            }
            this.a(bgb2, this.e.ed());
        }
    }

    protected void a(bgb $$0, bfz $$1) {
        $$0.h($$1);
    }
}

