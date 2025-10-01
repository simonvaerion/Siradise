/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Optional;

public class dam
extends czn {
    public static final String a = "target";
    public static final String b = "pool";
    public static final String c = "joint";
    public static final String d = "name";
    public static final String e = "final_state";
    private acq f = new acq("empty");
    private acq g = new acq("empty");
    private acp<dtj> h = acp.a(jc.aC, new acq("empty"));
    private a i = dam$a.a;
    private String j = "minecraft:air";

    public dam(gu $$0, dcb $$1) {
        super(czp.F, $$0, $$1);
    }

    public acq c() {
        return this.f;
    }

    public acq d() {
        return this.g;
    }

    public acp<dtj> f() {
        return this.h;
    }

    public String g() {
        return this.j;
    }

    public a i() {
        return this.i;
    }

    public void a(acq $$0) {
        this.f = $$0;
    }

    public void b(acq $$0) {
        this.g = $$0;
    }

    public void a(acp<dtj> $$0) {
        this.h = $$0;
    }

    public void a(String $$0) {
        this.j = $$0;
    }

    public void a(a $$0) {
        this.i = $$0;
    }

    @Override
    protected void b(qr $$0) {
        super.b($$0);
        $$0.a(d, this.f.toString());
        $$0.a(a, this.g.toString());
        $$0.a(b, this.h.a().toString());
        $$0.a(e, this.j);
        $$0.a(c, this.i.c());
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.f = new acq($$0.l(d));
        this.g = new acq($$0.l(a));
        this.h = acp.a(jc.aC, new acq($$0.l(b)));
        this.j = $$0.l(e);
        this.i = dam$a.a($$0.l(c)).orElseGet(() -> ctm.h(this.q()).o().d() ? dam$a.b : dam$a.a);
    }

    public uz j() {
        return uz.a(this);
    }

    @Override
    public qr ao_() {
        return this.o();
    }

    public void a(aif $$0, int $$1, boolean $$2) {
        gu $$3 = this.p().a(this.q().c(ctm.a).a());
        hr<dtj> $$4 = $$0.B_().d(jc.aC);
        he.c<dtj> $$5 = $$4.f(this.h);
        dtd.a($$0, $$5, this.g, $$1, $$3, $$2);
    }

    public /* synthetic */ uo h() {
        return this.j();
    }

    public static final class a
    extends Enum<a>
    implements apr {
        public static final /* enum */ a a = new a("rollable");
        public static final /* enum */ a b = new a("aligned");
        private final String c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.c = $$0;
        }

        @Override
        public String c() {
            return this.c;
        }

        public static Optional<a> a(String $$0) {
            return Arrays.stream(dam$a.values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
        }

        public sw a() {
            return sw.c("jigsaw_block.joint." + this.c);
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            d = dam$a.b();
        }
    }
}

