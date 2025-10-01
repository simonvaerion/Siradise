/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.jetbrains.annotations.Nullable;

public class crj
extends cpa
implements cwo {
    public static final acq a = new acq("sherds");
    private static final efb b = cpn.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
    private static final dcv c = dcr.R;
    private static final dcs d = dcr.bw;
    private static final dcs e = dcr.C;

    protected crj(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)this.C.b()).a(c, ha.c)).a(e, false)).a(d, false));
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(e).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public dcb a(cih $$0) {
        dxe $$1 = $$0.q().b_($$0.a());
        return (dcb)((dcb)((dcb)this.n().a(c, $$0.g())).a(e, $$1.a() == dxf.c)).a(d, false);
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return false;
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return b;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(c, e, d);
    }

    @Override
    @Nullable
    public czn a(gu $$0, dcb $$1) {
        return new dac($$0, $$1);
    }

    @Override
    public List<cfz> a(dcb $$0, dzq.a $$12) {
        czn $$2 = $$12.b(ebw.h);
        if ($$2 instanceof dac) {
            dac $$3 = (dac)$$2;
            $$12.a(a, (Consumer<cfz> $$1) -> $$3.f().a().map(cfu::ae_).forEach($$1));
        }
        return super.a($$0, $$12);
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, byo $$3) {
        cfz $$4 = $$3.eO();
        dcb $$5 = $$2;
        if ($$4.a(ane.aT) && !cki.f($$4)) {
            $$5 = (dcb)$$2.a(d, true);
            $$0.a($$1, $$5, 4);
        }
        super.a($$0, $$1, $$5, $$3);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(e).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    public cxa m(dcb $$0) {
        if ($$0.c(d).booleanValue()) {
            return cxa.aY;
        }
        return cxa.aX;
    }

    @Override
    public void a(cfz $$0, @Nullable cls $$12, List<sw> $$2, chq $$3) {
        super.a($$0, $$12, $$2, $$3);
        dac.a $$4 = dac.a.b(cds.a($$0));
        if ($$4.equals(dac.a.a)) {
            return;
        }
        $$2.add(sv.a);
        Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1 -> $$2.add(new cfz((cml)$$1, 1).y().d().a(n.h)));
    }
}

