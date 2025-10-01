/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class btx
extends brl {
    private static final int bZ = 1700;
    private static final int ca = 6000;
    private static final int cb = 30;
    private static final int cc = 120;
    private static final int cd = 48000;
    private static final float ce = 0.4f;
    private static final bfk cf = bfk.b(bfn.aN.k(), bfn.aN.l() - 0.4f);
    private static final aby<a> cg = acb.a(btx.class, aca.z);
    private static final aby<Integer> ch = acb.a(btx.class, aca.b);
    public final bff bT = new bff();
    public final bff bU = new bff();
    public final bff bW = new bff();
    public final bff bX = new bff();
    public final bff bY = new bff();

    public static bhf.a q() {
        return bgb.y().a(bhg.d, 0.1f).a(bhg.a, 14.0);
    }

    public btx(bfn<? extends brl> $$0, cmm $$1) {
        super($$0, $$1);
        this.am.a(cg, a.a);
        this.am.a(ch, 0);
        this.J().a(true);
        this.a(dxp.j, -1.0f);
        this.a(dxp.g, -1.0f);
        this.a(dxp.y, -1.0f);
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        return this.a((bgl)$$0).b * 0.6f;
    }

    @Override
    public void A() {
        super.A();
        if (this.bL() || this.aV()) {
            this.a(dxp.j, 0.0f);
        }
    }

    @Override
    public void C() {
        this.a(dxp.j, -1.0f);
    }

    @Override
    public bfk a(bgl $$0) {
        if (this.am.a(cg) && this.gk() == a.f) {
            return cf.a(this.dV());
        }
        return super.a($$0);
    }

    public boolean r() {
        return this.bA.c(bpb.Y).isPresent();
    }

    public boolean w() {
        return this.gk() == a.e;
    }

    public boolean fY() {
        return this.bA.c(bpb.Q).orElse(false);
    }

    public boolean ge() {
        return !this.fY() && !this.r() && !this.aV() && !this.gc() && this.ay() && !this.bM();
    }

    public boolean gf() {
        return this.gk() == a.f || this.gk() == a.e;
    }

    private gu gi() {
        eei $$0 = this.gj();
        return gu.a($$0.a(), this.dp() + (double)0.2f, $$0.c());
    }

    private eei gj() {
        return this.dg().e(this.bF().a(2.25));
    }

    private a gk() {
        return this.am.b(cg);
    }

    private btx b(a $$0) {
        this.am.b(cg, $$0);
        return this;
    }

    @Override
    public void a(aby<?> $$0) {
        if (cg.equals($$0)) {
            a $$1 = this.gk();
            this.gl();
            switch ($$1) {
                case c: {
                    this.bU.b(this.ag);
                    break;
                }
                case d: {
                    this.bW.b(this.ag);
                    break;
                }
                case f: {
                    this.bX.b(this.ag);
                    break;
                }
                case g: {
                    this.bY.b(this.ag);
                    break;
                }
                case b: {
                    this.bT.b(this.ag);
                }
            }
            this.d_();
        }
        super.a($$0);
    }

    private void gl() {
        this.bX.a();
        this.bW.a();
        this.bY.a();
        this.bT.a();
        this.bU.a();
    }

    public btx a(a $$0) {
        switch ($$0) {
            case a: {
                this.b(a.a);
                break;
            }
            case c: {
                this.b(a.c).gm();
                break;
            }
            case d: {
                this.a(amh.wF, 1.0f, 1.0f);
                this.b(a.d);
                break;
            }
            case e: {
                this.b(a.e);
                break;
            }
            case f: {
                this.b(a.f).gn();
                break;
            }
            case g: {
                this.a(amh.wI, 1.0f, 1.0f);
                this.b(a.g);
                break;
            }
            case b: {
                this.a(amh.wJ, 1.0f, 1.0f);
                this.b(a.b);
            }
        }
        return this;
    }

    private btx gm() {
        this.a(amh.wE, 1.0f, this.h_() ? 1.3f : 1.0f);
        return this;
    }

    private btx gn() {
        this.am.b(ch, this.ag + 120);
        this.dI().a((bfj)this, (byte)63);
        return this;
    }

    public btx w(boolean $$0) {
        if ($$0) {
            this.j(this.aF());
        }
        return this;
    }

    Optional<gu> gg() {
        return IntStream.range(0, 5).mapToObj($$0 -> bqt.a(this, 10 + 2 * $$0, 3)).filter(Objects::nonNull).map(gu::a).filter($$0 -> this.dI().w_().a((gu)$$0)).map(gu::d).filter(this::i).findFirst();
    }

    boolean gh() {
        return !this.r() && !this.fY() && !this.h_() && !this.aV() && this.ay() && !this.bM() && this.i(this.gi().d());
    }

    private boolean i(gu $$0) {
        return this.dI().a_($$0).a(amw.ch) && this.gp().noneMatch($$1 -> hd.a(this.dI().ac(), $$0).equals($$1)) && Optional.ofNullable(this.J().a($$0, 1)).map(dxt::j).orElse(false) != false;
    }

    private void go() {
        if (this.dI().r_() || this.am.b(ch) != this.ag) {
            return;
        }
        aif $$0 = (aif)this.dI();
        dzs $$1 = $$0.n().aH().getLootTable(dzg.aA);
        dzq $$2 = new dzq.a($$0).a(ebw.f, this.gj()).a(ebw.a, this).a(ebv.h);
        ObjectArrayList<cfz> $$3 = $$1.a($$2);
        gu $$4 = this.gi();
        for (cfz $$5 : $$3) {
            bvh $$6 = new bvh($$0, $$4.u(), $$4.v(), $$4.w(), $$5);
            $$6.o();
            $$0.b($$6);
        }
        this.a(amh.wD, 1.0f, 1.0f);
    }

    private btx a(bff $$0) {
        boolean $$1;
        boolean bl2 = $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
        if ($$1) {
            gu $$2 = this.gi();
            dcb $$3 = this.dI().a_($$2.d());
            if ($$3.l() != cvs.a) {
                for (int $$4 = 0; $$4 < 30; ++$$4) {
                    eei $$5 = eei.b($$2).b(0.0, -0.65f, 0.0);
                    this.dI().a(new in(iv.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
                }
                if (this.ag % 10 == 0) {
                    this.dI().a(this.dn(), this.dp(), this.dt(), $$3.w().f(), this.cY(), 0.5f, 0.5f, false);
                }
            }
        }
        if (this.ag % 10 == 0) {
            this.dI().a(dgl.v, this.gi(), dgl.a.a(this));
        }
        return this;
    }

    private btx j(gu $$0) {
        List $$1 = this.gp().limit(20L).collect(Collectors.toList());
        $$1.add(0, hd.a(this.dI().ac(), $$0));
        this.dK().a(bpb.aP, $$1);
        return this;
    }

    private Stream<hd> gp() {
        return this.dK().c(bpb.aP).stream().flatMap(Collection::stream);
    }

    @Override
    protected void eW() {
        double $$1;
        super.eW();
        double $$0 = this.bL.c();
        if ($$0 > 0.0 && ($$1 = this.dl().i()) < 0.01) {
            this.a(0.1f, new eei(0.0, 0.0, 1.0));
        }
    }

    @Override
    public void a(aif $$0, brl $$1) {
        cfz $$2 = new cfz(cgc.jU);
        bvh $$3 = new bvh($$0, this.dg().a(), this.dg().b(), this.dg().c(), $$2);
        $$3.o();
        this.a($$0, $$1, null);
        this.a(amh.wK, 1.0f, (this.af.i() - this.af.i()) * 0.2f + 0.5f);
        $$0.b($$3);
    }

    @Override
    public void a(ben $$0) {
        this.a(a.a);
        super.a($$0);
    }

    @Override
    public void l() {
        switch (this.gk()) {
            case f: {
                this.a(this.bX).go();
                break;
            }
            case e: {
                this.gq();
            }
        }
        super.l();
    }

    @Override
    public bdx b(byo $$0, bdw $$1) {
        cfz $$2 = $$0.b($$1);
        boolean $$3 = this.m($$2);
        bdx $$4 = super.b($$0, $$1);
        if ($$4.a() && $$3) {
            this.dI().a(null, this, this.d($$2), ami.g, 1.0f, apa.b(this.dI().z, 0.8f, 1.2f));
        }
        return $$4;
    }

    @Override
    public double bx() {
        return 1.8;
    }

    @Override
    public float df() {
        return super.df() + 0.3f;
    }

    private void gq() {
        if (this.dI().r_() && this.ag % 20 == 0) {
            this.dI().a(this.dn(), this.dp(), this.dt(), amh.wG, this.cY(), 1.0f, 1.0f, false);
        }
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        this.a(amh.wy, 0.15f, 1.0f);
    }

    @Override
    public amg d(cfz $$0) {
        return amh.wz;
    }

    @Override
    protected amg s() {
        return Set.of(a.f, a.e).contains((Object)this.gk()) ? null : amh.wA;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.wB;
    }

    @Override
    protected amg g_() {
        return amh.wC;
    }

    @Override
    public int fC() {
        return 50;
    }

    @Override
    public void a(boolean $$0) {
        this.c_($$0 ? -48000 : 0);
    }

    @Override
    public bfe a(aif $$0, bfe $$1) {
        return bfn.aN.a($$0);
    }

    @Override
    public boolean a(brl $$0) {
        if ($$0 instanceof btx) {
            btx $$1 = (btx)$$0;
            Set<a> $$2 = Set.of(a.a, a.c, a.b);
            return $$2.contains((Object)this.gk()) && $$2.contains((Object)$$1.gk()) && super.a($$0);
        }
        return false;
    }

    @Override
    public eed j_() {
        return super.j_().g(0.6f);
    }

    @Override
    public boolean m(cfz $$0) {
        return $$0.a(ane.aK);
    }

    @Override
    protected bha<?> a(Dynamic<?> $$0) {
        return bty.a(this.dL().a($$0));
    }

    public bha<btx> dK() {
        return super.dK();
    }

    protected bha.b<btx> dL() {
        return bha.a(bty.b, bty.a);
    }

    @Override
    protected void W() {
        this.dI().ad().a("snifferBrain");
        this.dK().a((aif)this.dI(), this);
        this.dI().ad().b("snifferActivityUpdate");
        bty.a(this);
        this.dI().ad().c();
        super.W();
    }

    @Override
    protected void V() {
        super.V();
        za.a(this);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        public static final /* enum */ a f = new a();
        public static final /* enum */ a g = new a();
        private static final /* synthetic */ a[] h;

        public static a[] values() {
            return (a[])h.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g};
        }

        static {
            h = btx$a.a();
        }
    }
}

