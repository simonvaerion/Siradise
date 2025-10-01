/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.function.Predicate;

public class crk
extends cpd {
    public static final dcz<ddf> d = dcr.ah;
    public static final dcs e = dcr.w;
    private static final int f = 20;

    public crk(dca.d $$0) {
        super(true, $$0);
        this.k((dcb)((dcb)((dcb)((dcb)this.C.b()).a(e, false)).a(d, ddf.a)).a(c, false));
    }

    @Override
    public boolean f_(dcb $$0) {
        return true;
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
        if ($$1.B) {
            return;
        }
        if ($$0.c(e).booleanValue()) {
            return;
        }
        this.a($$1, $$2, $$0);
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if (!$$0.c(e).booleanValue()) {
            return;
        }
        this.a((cmm)$$1, $$2, $$0);
    }

    @Override
    public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
        return $$0.c(e) != false ? 15 : 0;
    }

    @Override
    public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
        if (!$$0.c(e).booleanValue()) {
            return 0;
        }
        return $$3 == ha.b ? 15 : 0;
    }

    private void a(cmm $$02, gu $$1, dcb $$2) {
        if (!this.a($$2, (cmp)$$02, $$1)) {
            return;
        }
        boolean $$3 = $$2.c(e);
        boolean $$4 = false;
        List<caf> $$5 = this.a($$02, $$1, caf.class, (bfj $$0) -> true);
        if (!$$5.isEmpty()) {
            $$4 = true;
        }
        if ($$4 && !$$3) {
            dcb $$6 = (dcb)$$2.a(e, true);
            $$02.a($$1, $$6, 3);
            this.b($$02, $$1, $$6, true);
            $$02.a($$1, this);
            $$02.a($$1.d(), this);
            $$02.b($$1, $$2, $$6);
        }
        if (!$$4 && $$3) {
            dcb $$7 = (dcb)$$2.a(e, false);
            $$02.a($$1, $$7, 3);
            this.b($$02, $$1, $$7, false);
            $$02.a($$1, this);
            $$02.a($$1.d(), this);
            $$02.b($$1, $$2, $$7);
        }
        if ($$4) {
            $$02.a($$1, (cpn)this, 20);
        }
        $$02.c($$1, this);
    }

    protected void b(cmm $$0, gu $$1, dcb $$2, boolean $$3) {
        cvm $$4 = new cvm($$0, $$1, $$2);
        List<gu> $$5 = $$4.a();
        for (gu $$6 : $$5) {
            dcb $$7 = $$0.a_($$6);
            $$0.a($$7, $$6, $$7.b(), $$1, false);
        }
    }

    @Override
    public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$3.a($$0.b())) {
            return;
        }
        dcb $$5 = this.a($$0, $$1, $$2, $$4);
        this.a($$1, $$2, $$5);
    }

    @Override
    public dde<ddf> b() {
        return d;
    }

    @Override
    public boolean d_(dcb $$0) {
        return true;
    }

    @Override
    public int a(dcb $$02, cmm $$1, gu $$2) {
        if ($$02.c(e).booleanValue()) {
            List<can> $$3 = this.a($$1, $$2, can.class, (bfj $$0) -> true);
            if (!$$3.isEmpty()) {
                return $$3.get(0).A().k();
            }
            List<caf> $$4 = this.a($$1, $$2, caf.class, bfm.d);
            if (!$$4.isEmpty()) {
                return cbf.b((bdq)((Object)$$4.get(0)));
            }
        }
        return 0;
    }

    private <T extends caf> List<T> a(cmm $$0, gu $$1, Class<T> $$2, Predicate<bfj> $$3) {
        return $$0.a($$2, this.a($$1), $$3);
    }

    private eed a(gu $$0) {
        double $$1 = 0.2;
        return new eed((double)$$0.u() + 0.2, $$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2);
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        switch ($$1) {
            case c: {
                switch ($$0.c(d)) {
                    case c: {
                        return (dcb)$$0.a(d, ddf.d);
                    }
                    case d: {
                        return (dcb)$$0.a(d, ddf.c);
                    }
                    case e: {
                        return (dcb)$$0.a(d, ddf.f);
                    }
                    case f: {
                        return (dcb)$$0.a(d, ddf.e);
                    }
                    case g: {
                        return (dcb)$$0.a(d, ddf.i);
                    }
                    case h: {
                        return (dcb)$$0.a(d, ddf.j);
                    }
                    case i: {
                        return (dcb)$$0.a(d, ddf.g);
                    }
                    case j: {
                        return (dcb)$$0.a(d, ddf.h);
                    }
                }
            }
            case d: {
                switch ($$0.c(d)) {
                    case a: {
                        return (dcb)$$0.a(d, ddf.b);
                    }
                    case b: {
                        return (dcb)$$0.a(d, ddf.a);
                    }
                    case c: {
                        return (dcb)$$0.a(d, ddf.e);
                    }
                    case d: {
                        return (dcb)$$0.a(d, ddf.f);
                    }
                    case e: {
                        return (dcb)$$0.a(d, ddf.d);
                    }
                    case f: {
                        return (dcb)$$0.a(d, ddf.c);
                    }
                    case g: {
                        return (dcb)$$0.a(d, ddf.j);
                    }
                    case h: {
                        return (dcb)$$0.a(d, ddf.g);
                    }
                    case i: {
                        return (dcb)$$0.a(d, ddf.h);
                    }
                    case j: {
                        return (dcb)$$0.a(d, ddf.i);
                    }
                }
            }
            case b: {
                switch ($$0.c(d)) {
                    case a: {
                        return (dcb)$$0.a(d, ddf.b);
                    }
                    case b: {
                        return (dcb)$$0.a(d, ddf.a);
                    }
                    case c: {
                        return (dcb)$$0.a(d, ddf.f);
                    }
                    case d: {
                        return (dcb)$$0.a(d, ddf.e);
                    }
                    case e: {
                        return (dcb)$$0.a(d, ddf.c);
                    }
                    case f: {
                        return (dcb)$$0.a(d, ddf.d);
                    }
                    case g: {
                        return (dcb)$$0.a(d, ddf.h);
                    }
                    case h: {
                        return (dcb)$$0.a(d, ddf.i);
                    }
                    case i: {
                        return (dcb)$$0.a(d, ddf.j);
                    }
                    case j: {
                        return (dcb)$$0.a(d, ddf.g);
                    }
                }
            }
        }
        return $$0;
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        ddf $$2 = $$0.c(d);
        switch ($$1) {
            case b: {
                switch ($$2) {
                    case e: {
                        return (dcb)$$0.a(d, ddf.f);
                    }
                    case f: {
                        return (dcb)$$0.a(d, ddf.e);
                    }
                    case g: {
                        return (dcb)$$0.a(d, ddf.j);
                    }
                    case h: {
                        return (dcb)$$0.a(d, ddf.i);
                    }
                    case i: {
                        return (dcb)$$0.a(d, ddf.h);
                    }
                    case j: {
                        return (dcb)$$0.a(d, ddf.g);
                    }
                }
                break;
            }
            case c: {
                switch ($$2) {
                    case c: {
                        return (dcb)$$0.a(d, ddf.d);
                    }
                    case d: {
                        return (dcb)$$0.a(d, ddf.c);
                    }
                    case g: {
                        return (dcb)$$0.a(d, ddf.h);
                    }
                    case h: {
                        return (dcb)$$0.a(d, ddf.g);
                    }
                    case i: {
                        return (dcb)$$0.a(d, ddf.j);
                    }
                    case j: {
                        return (dcb)$$0.a(d, ddf.i);
                    }
                }
                break;
            }
        }
        return super.a($$0, $$1);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(d, e, c);
    }
}

