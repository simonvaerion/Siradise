/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dba
extends czn {
    private static final int d = 5;
    public static final int a = 48;
    public static final int b = 48;
    public static final String c = "author";
    private acq e;
    private String f = "";
    private String g = "";
    private gu h = new gu(0, 1, 0);
    private hz i = hz.g;
    private cui j = cui.a;
    private cvz k = cvz.a;
    private ddl l;
    private boolean m = true;
    private boolean n;
    private boolean r;
    private boolean s = true;
    private float t = 1.0f;
    private long u;

    public dba(gu $$0, dcb $$1) {
        super(czp.u, $$0, $$1);
        this.l = $$1.c(cxm.a);
    }

    @Override
    protected void b(qr $$0) {
        super.b($$0);
        $$0.a("name", this.d());
        $$0.a(c, this.f);
        $$0.a("metadata", this.g);
        $$0.a("posX", this.h.u());
        $$0.a("posY", this.h.v());
        $$0.a("posZ", this.h.w());
        $$0.a("sizeX", this.i.u());
        $$0.a("sizeY", this.i.v());
        $$0.a("sizeZ", this.i.w());
        $$0.a("rotation", this.k.toString());
        $$0.a("mirror", this.j.toString());
        $$0.a("mode", this.l.toString());
        $$0.a("ignoreEntities", this.m);
        $$0.a("powered", this.n);
        $$0.a("showair", this.r);
        $$0.a("showboundingbox", this.s);
        $$0.a("integrity", this.t);
        $$0.a("seed", this.u);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.a($$0.l("name"));
        this.f = $$0.l(c);
        this.g = $$0.l("metadata");
        int $$1 = apa.a($$0.h("posX"), -48, 48);
        int $$2 = apa.a($$0.h("posY"), -48, 48);
        int $$3 = apa.a($$0.h("posZ"), -48, 48);
        this.h = new gu($$1, $$2, $$3);
        int $$4 = apa.a($$0.h("sizeX"), 0, 48);
        int $$5 = apa.a($$0.h("sizeY"), 0, 48);
        int $$6 = apa.a($$0.h("sizeZ"), 0, 48);
        this.i = new hz($$4, $$5, $$6);
        try {
            this.k = cvz.valueOf($$0.l("rotation"));
        }
        catch (IllegalArgumentException $$7) {
            this.k = cvz.a;
        }
        try {
            this.j = cui.valueOf($$0.l("mirror"));
        }
        catch (IllegalArgumentException $$8) {
            this.j = cui.a;
        }
        try {
            this.l = ddl.valueOf($$0.l("mode"));
        }
        catch (IllegalArgumentException $$9) {
            this.l = ddl.d;
        }
        this.m = $$0.q("ignoreEntities");
        this.n = $$0.q("powered");
        this.r = $$0.q("showair");
        this.s = $$0.q("showboundingbox");
        this.t = $$0.e("integrity") ? $$0.j("integrity") : 1.0f;
        this.u = $$0.i("seed");
        this.J();
    }

    private void J() {
        if (this.o == null) {
            return;
        }
        gu $$0 = this.p();
        dcb $$1 = this.o.a_($$0);
        if ($$1.a(cpo.pa)) {
            this.o.a($$0, (dcb)$$1.a(cxm.a, this.l), 2);
        }
    }

    public uz c() {
        return uz.a(this);
    }

    @Override
    public qr ao_() {
        return this.o();
    }

    public boolean a(byo $$0) {
        if (!$$0.gk()) {
            return false;
        }
        if ($$0.cH().B) {
            $$0.a(this);
        }
        return true;
    }

    public String d() {
        return this.e == null ? "" : this.e.toString();
    }

    public String f() {
        return this.e == null ? "" : this.e.a();
    }

    public boolean g() {
        return this.e != null;
    }

    public void a(@Nullable String $$0) {
        this.a(aps.b($$0) ? null : acq.a($$0));
    }

    public void a(@Nullable acq $$0) {
        this.e = $$0;
    }

    public void a(bfz $$0) {
        this.f = $$0.Z().getString();
    }

    public gu i() {
        return this.h;
    }

    public void a(gu $$0) {
        this.h = $$0;
    }

    public hz j() {
        return this.i;
    }

    public void a(hz $$0) {
        this.i = $$0;
    }

    public cui v() {
        return this.j;
    }

    public void a(cui $$0) {
        this.j = $$0;
    }

    public cvz w() {
        return this.k;
    }

    public void a(cvz $$0) {
        this.k = $$0;
    }

    public String x() {
        return this.g;
    }

    public void b(String $$0) {
        this.g = $$0;
    }

    public ddl y() {
        return this.l;
    }

    public void a(ddl $$0) {
        this.l = $$0;
        dcb $$1 = this.o.a_(this.p());
        if ($$1.a(cpo.pa)) {
            this.o.a(this.p(), (dcb)$$1.a(cxm.a, $$0), 2);
        }
    }

    public boolean z() {
        return this.m;
    }

    public void a(boolean $$0) {
        this.m = $$0;
    }

    public float A() {
        return this.t;
    }

    public void a(float $$0) {
        this.t = $$0;
    }

    public long B() {
        return this.u;
    }

    public void a(long $$0) {
        this.u = $$0;
    }

    public boolean C() {
        if (this.l != ddl.a) {
            return false;
        }
        gu $$0 = this.p();
        int $$12 = 80;
        gu $$2 = new gu($$0.u() - 80, this.o.C_(), $$0.w() - 80);
        gu $$3 = new gu($$0.u() + 80, this.o.aj() - 1, $$0.w() + 80);
        Stream<gu> $$4 = this.a($$2, $$3);
        return dba.a($$0, $$4).filter($$1 -> {
            int $$2 = $$1.j() - $$1.g();
            int $$3 = $$1.k() - $$1.h();
            int $$4 = $$1.l() - $$1.i();
            if ($$2 > 1 && $$3 > 1 && $$4 > 1) {
                this.h = new gu($$1.g() - $$0.u() + 1, $$1.h() - $$0.v() + 1, $$1.i() - $$0.w() + 1);
                this.i = new hz($$2 - 1, $$3 - 1, $$4 - 1);
                this.e();
                dcb $$5 = this.o.a_($$0);
                this.o.a($$0, $$5, $$5, 3);
                return true;
            }
            return false;
        }).isPresent();
    }

    private Stream<gu> a(gu $$02, gu $$1) {
        return gu.b($$02, $$1).filter($$0 -> this.o.a_((gu)$$0).a(cpo.pa)).map(this.o::c_).filter($$0 -> $$0 instanceof dba).map($$0 -> (dba)$$0).filter($$0 -> $$0.l == ddl.c && Objects.equals(this.e, $$0.e)).map(czn::p);
    }

    private static Optional<drs> a(gu $$0, Stream<gu> $$1) {
        Iterator $$2 = $$1.iterator();
        if (!$$2.hasNext()) {
            return Optional.empty();
        }
        gu $$3 = (gu)$$2.next();
        drs $$4 = new drs($$3);
        if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
        } else {
            $$4.a($$0);
        }
        return Optional.of($$4);
    }

    public boolean D() {
        return this.b(true);
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(boolean $$0) {
        void $$6;
        if (this.l != ddl.a || this.o.B || this.e == null) {
            return false;
        }
        gu $$1 = this.p().a(this.h);
        aif $$2 = (aif)this.o;
        dvu $$3 = $$2.p();
        try {
            dvt $$4 = $$3.a(this.e);
        }
        catch (z $$5) {
            return false;
        }
        $$6.a(this.o, $$1, this.i, !this.m, cpo.kN);
        $$6.a(this.f);
        if ($$0) {
            try {
                return $$3.c(this.e);
            }
            catch (z $$7) {
                return false;
            }
        }
        return true;
    }

    public boolean a(aif $$0) {
        return this.a($$0, true);
    }

    public static apf b(long $$0) {
        if ($$0 == 0L) {
            return apf.a(ac.b());
        }
        return apf.a($$0);
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(aif $$0, boolean $$1) {
        void $$5;
        if (this.l != ddl.b || this.e == null) {
            return false;
        }
        dvu $$2 = $$0.p();
        try {
            Optional<dvt> $$3 = $$2.b(this.e);
        }
        catch (z $$4) {
            return false;
        }
        if (!$$5.isPresent()) {
            return false;
        }
        return this.a($$0, $$1, (dvt)$$5.get());
    }

    public boolean a(aif $$0, boolean $$1, dvt $$2) {
        hz $$4;
        boolean $$5;
        gu $$3 = this.p();
        if (!aps.b($$2.b())) {
            this.f = $$2.b();
        }
        if (!($$5 = this.i.equals($$4 = $$2.a()))) {
            this.i = $$4;
            this.e();
            dcb $$6 = $$0.a_($$3);
            $$0.a($$3, $$6, $$6, 3);
        }
        if (!$$1 || $$5) {
            dvp $$7 = new dvp().a(this.j).a(this.k).a(this.m);
            if (this.t < 1.0f) {
                $$7.b().a(new dux(apa.a(this.t, 0.0f, 1.0f))).a(dba.b(this.u));
            }
            gu $$8 = $$3.a(this.h);
            $$2.a($$0, $$8, $$8, $$7, dba.b(this.u), 2);
            return true;
        }
        return false;
    }

    public void E() {
        if (this.e == null) {
            return;
        }
        aif $$0 = (aif)this.o;
        dvu $$1 = $$0.p();
        $$1.d(this.e);
    }

    public boolean F() {
        if (this.l != ddl.b || this.o.B || this.e == null) {
            return false;
        }
        aif $$0 = (aif)this.o;
        dvu $$1 = $$0.p();
        try {
            return $$1.b(this.e).isPresent();
        }
        catch (z $$2) {
            return false;
        }
    }

    public boolean G() {
        return this.n;
    }

    public void c(boolean $$0) {
        this.n = $$0;
    }

    public boolean H() {
        return this.r;
    }

    public void d(boolean $$0) {
        this.r = $$0;
    }

    public boolean I() {
        return this.s;
    }

    public void e(boolean $$0) {
        this.s = $$0;
    }

    public /* synthetic */ uo h() {
        return this.c();
    }

    private static /* synthetic */ void a(aif $$0, gu $$1) {
        $$0.a($$1, cpo.kN.n(), 2);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = dba$a.a();
        }
    }
}

