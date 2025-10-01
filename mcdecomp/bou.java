/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class bou<T extends bgb>
extends bmv {
    private static final int a = 10;
    private final T b;
    private final boolean c;
    private int d;

    public bou(T $$0, boolean $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public boolean a() {
        return ((bfj)this.b).dI().X().b(cmi.K) && this.h();
    }

    private boolean h() {
        return ((bfz)this.b).ed() != null && ((bfz)this.b).ed().ae() == bfn.bt && ((bfz)this.b).ee() > this.d;
    }

    @Override
    public void c() {
        this.d = ((bfz)this.b).ee();
        ((bgg)this.b).T_();
        if (this.c) {
            this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bgg)((Object)$$0)).forEach(bgg::T_);
        }
        super.c();
    }

    private List<? extends bgb> i() {
        double $$0 = ((bfz)this.b).b(bhg.b);
        eed $$1 = eed.a(((bfj)this.b).dg()).c($$0, 10.0, $$0);
        return ((bfj)this.b).dI().a(this.b.getClass(), $$1, bfm.f);
    }
}

