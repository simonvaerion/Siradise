/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cpz
extends cwg {
    public static final dcv a = dcr.R;

    public cpz(dca.d $$0) {
        super($$0);
        this.k((dcb)this.n().a(a, ha.c));
    }

    @Override
    @Nullable
    public czn a(gu $$0, dcb $$1) {
        return new czs($$0, $$1);
    }

    @Override
    @Nullable
    public <T extends czn> czo<T> a(cmm $$02, dcb $$12, czp<T> $$22) {
        if (!$$02.B) {
            return cpz.a($$22, czp.J, (cmm $$0, gu $$1, dcb $$2, ? super E $$3) -> dgu.c.a($$0, $$3.gb(), $$3.gc()));
        }
        return null;
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        return (dcb)super.a($$0).a(a, $$0.g());
    }

    @Override
    public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
        if ($$3 != $$0.c(a)) {
            return super.a($$0, $$1, $$2, $$3);
        }
        return 0;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        super.a($$0);
        $$0.a(new dde[]{a});
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        return (dcb)$$0.a(a, $$1.a($$0.c(a)));
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        return $$0.a($$1.a($$0.c(a)));
    }

    @Override
    public int b() {
        return 10;
    }
}

