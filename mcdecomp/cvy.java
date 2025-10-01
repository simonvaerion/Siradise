/*
 * Decompiled with CFR 0.152.
 */
public class cvy
extends cpn {
    public static final dcz<ha.a> g = dcr.I;

    public cvy(dca.d $$0) {
        super($$0);
        this.k((dcb)this.n().a(g, ha.a.b));
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        return cvy.b($$0, $$1);
    }

    public static dcb b(dcb $$0, cvz $$1) {
        switch ($$1) {
            case d: 
            case b: {
                switch ($$0.c(g)) {
                    case a: {
                        return (dcb)$$0.a(g, ha.a.c);
                    }
                    case c: {
                        return (dcb)$$0.a(g, ha.a.a);
                    }
                }
                return $$0;
            }
        }
        return $$0;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{g});
    }

    @Override
    public dcb a(cih $$0) {
        return (dcb)this.n().a(g, $$0.k().o());
    }
}

