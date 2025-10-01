/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bsh
extends brl
implements bgr {
    private static final int bT = 40;
    private static final aby<Byte> bU = acb.a(bsh.class, aca.a);
    private static final Map<cen, cml> bW = ac.a(Maps.newEnumMap(cen.class), (T $$0) -> {
        $$0.put(cen.a, cpo.bA);
        $$0.put(cen.b, cpo.bB);
        $$0.put(cen.c, cpo.bC);
        $$0.put(cen.d, cpo.bD);
        $$0.put(cen.e, cpo.bE);
        $$0.put(cen.f, cpo.bF);
        $$0.put(cen.g, cpo.bG);
        $$0.put(cen.h, cpo.bH);
        $$0.put(cen.i, cpo.bI);
        $$0.put(cen.j, cpo.bJ);
        $$0.put(cen.k, cpo.bK);
        $$0.put(cen.l, cpo.bL);
        $$0.put(cen.m, cpo.bM);
        $$0.put(cen.n, cpo.bN);
        $$0.put(cen.o, cpo.bO);
        $$0.put(cen.p, cpo.bP);
    });
    private static final Map<cen, float[]> bX = Maps.newEnumMap(Arrays.stream(cen.values()).collect(Collectors.toMap($$0 -> $$0, bsh::c)));
    private int bY;
    private bmn bZ;

    private static float[] c(cen $$0) {
        if ($$0 == cen.a) {
            return new float[]{0.9019608f, 0.9019608f, 0.9019608f};
        }
        float[] $$1 = $$0.d();
        float $$2 = 0.75f;
        return new float[]{$$1[0] * 0.75f, $$1[1] * 0.75f, $$1[2] * 0.75f};
    }

    public static float[] a(cen $$0) {
        return bX.get($$0);
    }

    public bsh(bfn<? extends bsh> $$0, cmm $$1) {
        super((bfn<? extends brl>)$$0, $$1);
    }

    @Override
    protected void x() {
        this.bZ = new bmn(this);
        this.bO.a(0, new bmp(this));
        this.bO.a(1, new bno(this, 1.25));
        this.bO.a(2, new bmh(this, 1.0));
        this.bO.a(3, new bod(this, 1.1, ciz.a(cgc.oI), false));
        this.bO.a(4, new bmu(this, 1.1));
        this.bO.a(5, this.bZ);
        this.bO.a(6, new boi(this, 1.0));
        this.bO.a(7, new bnd(this, byo.class, 6.0f));
        this.bO.a(8, new bnq(this));
    }

    @Override
    protected void W() {
        this.bY = this.bZ.h();
        super.W();
    }

    @Override
    public void b_() {
        if (this.dI().B) {
            this.bY = Math.max(0, this.bY - 1);
        }
        super.b_();
    }

    public static bhf.a q() {
        return bgb.y().a(bhg.a, 8.0).a(bhg.d, 0.23f);
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(bU, (byte)0);
    }

    @Override
    public acq Q() {
        if (this.w()) {
            return this.ae().j();
        }
        return switch (this.r()) {
            default -> throw new IncompatibleClassChangeError();
            case cen.a -> dzg.S;
            case cen.b -> dzg.T;
            case cen.c -> dzg.U;
            case cen.d -> dzg.V;
            case cen.e -> dzg.W;
            case cen.f -> dzg.X;
            case cen.g -> dzg.Y;
            case cen.h -> dzg.Z;
            case cen.i -> dzg.aa;
            case cen.j -> dzg.ab;
            case cen.k -> dzg.ac;
            case cen.l -> dzg.ad;
            case cen.m -> dzg.ae;
            case cen.n -> dzg.af;
            case cen.o -> dzg.ag;
            case cen.p -> dzg.ah;
        };
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 10) {
            this.bY = 40;
        } else {
            super.b($$0);
        }
    }

    public float D(float $$0) {
        if (this.bY <= 0) {
            return 0.0f;
        }
        if (this.bY >= 4 && this.bY <= 36) {
            return 1.0f;
        }
        if (this.bY < 4) {
            return ((float)this.bY - $$0) / 4.0f;
        }
        return -((float)(this.bY - 40) - $$0) / 4.0f;
    }

    public float E(float $$0) {
        if (this.bY > 4 && this.bY <= 36) {
            float $$1 = ((float)(this.bY - 4) - $$0) / 32.0f;
            return 0.62831855f + 0.21991149f * apa.a($$1 * 28.7f);
        }
        if (this.bY > 0) {
            return 0.62831855f;
        }
        return this.dA() * ((float)Math.PI / 180);
    }

    @Override
    public bdx b(byo $$0, bdw $$12) {
        cfz $$2 = $$0.b($$12);
        if ($$2.a(cgc.rg)) {
            if (!this.dI().B && this.a()) {
                this.a(ami.h);
                this.a(dgl.N, (bfj)$$0);
                $$2.a(1, $$0, (T $$1) -> $$1.d($$12));
                return bdx.a;
            }
            return bdx.b;
        }
        return super.b($$0, $$12);
    }

    @Override
    public void a(ami $$0) {
        this.dI().a(null, this, amh.uO, $$0, 1.0f, 1.0f);
        this.w(true);
        int $$1 = 1 + this.af.a(3);
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            bvh $$3 = this.a(bW.get(this.r()), 1);
            if ($$3 == null) continue;
            $$3.f($$3.dl().b((this.af.i() - this.af.i()) * 0.1f, this.af.i() * 0.05f, (this.af.i() - this.af.i()) * 0.1f));
        }
    }

    @Override
    public boolean a() {
        return this.bs() && !this.w() && !this.h_();
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("Sheared", this.w());
        $$0.a("Color", (byte)this.r().a());
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.w($$0.q("Sheared"));
        this.b(cen.a($$0.f("Color")));
    }

    @Override
    protected amg s() {
        return amh.uL;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.uN;
    }

    @Override
    protected amg g_() {
        return amh.uM;
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        this.a(amh.uP, 0.15f, 1.0f);
    }

    public cen r() {
        return cen.a(this.am.b(bU) & 0xF);
    }

    public void b(cen $$0) {
        byte $$1 = this.am.b(bU);
        this.am.b(bU, (byte)($$1 & 0xF0 | $$0.a() & 0xF));
    }

    public boolean w() {
        return (this.am.b(bU) & 0x10) != 0;
    }

    public void w(boolean $$0) {
        byte $$1 = this.am.b(bU);
        if ($$0) {
            this.am.b(bU, (byte)($$1 | 0x10));
        } else {
            this.am.b(bU, (byte)($$1 & 0xFFFFFFEF));
        }
    }

    public static cen a(apf $$0) {
        int $$1 = $$0.a(100);
        if ($$1 < 5) {
            return cen.p;
        }
        if ($$1 < 10) {
            return cen.h;
        }
        if ($$1 < 15) {
            return cen.i;
        }
        if ($$1 < 18) {
            return cen.m;
        }
        if ($$0.a(500) == 0) {
            return cen.g;
        }
        return cen.a;
    }

    @Nullable
    public bsh b(aif $$0, bfe $$1) {
        bsh $$2 = bfn.aF.a($$0);
        if ($$2 != null) {
            $$2.b(this.a(this, (brl)((bsh)$$1)));
        }
        return $$2;
    }

    @Override
    public void L() {
        super.L();
        this.w(false);
        if (this.h_()) {
            this.b_(60);
        }
    }

    @Override
    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        this.b(bsh.a($$0.y_()));
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    private cen a(brl $$0, brl $$12) {
        cen $$2 = ((bsh)$$0).r();
        cen $$3 = ((bsh)$$12).r();
        cbt $$4 = bsh.a($$2, $$3);
        return this.dI().q().a(cjf.a, $$4, this.dI()).map($$1 -> $$1.a($$4, this.dI().B_())).map(cfz::d).filter(ceo.class::isInstance).map(ceo.class::cast).map(ceo::d).orElseGet(() -> this.dI().z.h() ? $$2 : $$3);
    }

    private static cbt a(cen $$0, cen $$1) {
        cdc $$2 = new cdc(new cbf(null, -1){

            @Override
            public cfz a(byo $$0, int $$1) {
                return cfz.b;
            }

            @Override
            public boolean a(byo $$0) {
                return false;
            }
        }, 2, 1);
        $$2.a(0, new cfz(ceo.a($$0)));
        $$2.a(1, new cfz(ceo.a($$1)));
        return $$2;
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        return 0.95f * $$1.b;
    }

    @Override
    @Nullable
    public /* synthetic */ bfe a(aif aif2, bfe bfe2) {
        return this.b(aif2, bfe2);
    }
}

