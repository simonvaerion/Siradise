/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.joml.Quaternionf
 */
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;

public class ewz
extends ewp<ccy> {
    private static final acq D = new acq("textures/gui/container/smithing.png");
    private static final acq E = new acq("item/empty_slot_smithing_template_armor_trim");
    private static final acq F = new acq("item/empty_slot_smithing_template_netherite_upgrade");
    private static final sw G = sw.c("container.upgrade.missing_template_tooltip");
    private static final sw H = sw.c("container.upgrade.error_tooltip");
    private static final List<acq> I = List.of(E, F);
    private static final int J = 44;
    private static final int K = 15;
    private static final int L = 28;
    private static final int M = 21;
    private static final int N = 65;
    private static final int O = 46;
    private static final int P = 115;
    public static final int w = 210;
    public static final int x = 25;
    public static final Quaternionf y = new Quaternionf().rotationXYZ(0.43633232f, 0.0f, (float)Math.PI);
    public static final int z = 25;
    public static final int A = 75;
    public static final int C = 141;
    private final ewe Q = new ewe(0);
    private final ewe R = new ewe(1);
    private final ewe S = new ewe(2);
    @Nullable
    private bux T;

    public ewz(ccy $$0, byn $$1, sw $$2) {
        super($$0, $$1, $$2, D);
        this.l = 44;
        this.m = 15;
    }

    @Override
    protected void D() {
        this.T = new bux(this.f.s, 0.0, 0.0, 0.0);
        this.T.s(true);
        this.T.a(true);
        this.T.aV = 210.0f;
        this.T.b_(25.0f);
        this.T.aX = this.T.dy();
        this.T.aY = this.T.dy();
        this.b(((ccy)this.p).b(3).e());
    }

    @Override
    public void B() {
        super.B();
        Optional<chb> $$0 = this.E();
        this.Q.a(I);
        this.R.a($$0.map(chb::y).orElse(List.of()));
        this.S.a($$0.map(chb::z).orElse(List.of()));
    }

    private Optional<chb> E() {
        cfu cfu2;
        cfz $$0 = ((ccy)this.p).b(0).e();
        if (!$$0.b() && (cfu2 = $$0.d()) instanceof chb) {
            chb $$1 = (chb)cfu2;
            return Optional.of($$1);
        }
        return Optional.empty();
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.d($$0, $$1, $$2);
    }

    @Override
    protected void a(eox $$0, float $$1, int $$2, int $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.Q.a(this.p, $$0, $$1, this.s, this.t);
        this.R.a(this.p, $$0, $$1, this.s, this.t);
        this.S.a(this.p, $$0, $$1, this.s, this.t);
        ewo.a($$0, this.s + 141, this.t + 75, 25, y, null, (bfz)this.T);
    }

    @Override
    public void a(cbf $$0, int $$1, cfz $$2) {
        if ($$1 == 3) {
            this.b($$2);
        }
    }

    private void b(cfz $$0) {
        if (this.T == null) {
            return;
        }
        for (bfo $$1 : bfo.values()) {
            this.T.a($$1, cfz.b);
        }
        if (!$$0.b()) {
            cfz $$2 = $$0.p();
            cfu cfu2 = $$0.d();
            if (cfu2 instanceof cdj) {
                cdj $$3 = (cdj)cfu2;
                this.T.a($$3.g(), $$2);
            } else {
                this.T.a(bfo.b, $$2);
            }
        }
    }

    @Override
    protected void c(eox $$0, int $$1, int $$2) {
        if (this.F()) {
            $$0.a(D, $$1 + 65, $$2 + 46, this.c, 0, 28, 21);
        }
    }

    private void d(eox $$0, int $$1, int $$2) {
        Optional<sw> $$32 = Optional.empty();
        if (this.F() && this.a(65, 46, 28, 21, $$1, $$2)) {
            $$32 = Optional.of(H);
        }
        if (this.r != null) {
            cfz $$4 = ((ccy)this.p).b(0).e();
            cfz $$5 = this.r.e();
            if ($$4.b()) {
                if (this.r.e == 0) {
                    $$32 = Optional.of(G);
                }
            } else {
                cfu cfu2 = $$4.d();
                if (cfu2 instanceof chb) {
                    chb $$6 = (chb)cfu2;
                    if ($$5.b()) {
                        if (this.r.e == 1) {
                            $$32 = Optional.of($$6.i());
                        } else if (this.r.e == 2) {
                            $$32 = Optional.of($$6.x());
                        }
                    }
                }
            }
        }
        $$32.ifPresent($$3 -> $$0.b(this.i, this.i.c((ta)$$3, 115), $$1, $$2));
    }

    private boolean F() {
        return ((ccy)this.p).b(0).f() && ((ccy)this.p).b(1).f() && ((ccy)this.p).b(2).f() && !((ccy)this.p).b(((ccy)this.p).o()).f();
    }
}

