/*
 * Decompiled with CFR 0.152.
 */
public final class ddc
extends Enum<ddc>
implements apr {
    public static final /* enum */ ddc a = new ddc("harp", amh.qp, ddc$a.a);
    public static final /* enum */ ddc b = new ddc("basedrum", amh.qj, ddc$a.a);
    public static final /* enum */ ddc c = new ddc("snare", amh.qs, ddc$a.a);
    public static final /* enum */ ddc d = new ddc("hat", amh.qq, ddc$a.a);
    public static final /* enum */ ddc e = new ddc("bass", amh.qk, ddc$a.a);
    public static final /* enum */ ddc f = new ddc("flute", amh.qn, ddc$a.a);
    public static final /* enum */ ddc g = new ddc("bell", amh.ql, ddc$a.a);
    public static final /* enum */ ddc h = new ddc("guitar", amh.qo, ddc$a.a);
    public static final /* enum */ ddc i = new ddc("chime", amh.qm, ddc$a.a);
    public static final /* enum */ ddc j = new ddc("xylophone", amh.qt, ddc$a.a);
    public static final /* enum */ ddc k = new ddc("iron_xylophone", amh.qu, ddc$a.a);
    public static final /* enum */ ddc l = new ddc("cow_bell", amh.qv, ddc$a.a);
    public static final /* enum */ ddc m = new ddc("didgeridoo", amh.qw, ddc$a.a);
    public static final /* enum */ ddc n = new ddc("bit", amh.qx, ddc$a.a);
    public static final /* enum */ ddc o = new ddc("banjo", amh.qy, ddc$a.a);
    public static final /* enum */ ddc p = new ddc("pling", amh.qr, ddc$a.a);
    public static final /* enum */ ddc q = new ddc("zombie", amh.qz, ddc$a.b);
    public static final /* enum */ ddc r = new ddc("skeleton", amh.qA, ddc$a.b);
    public static final /* enum */ ddc s = new ddc("creeper", amh.qB, ddc$a.b);
    public static final /* enum */ ddc t = new ddc("dragon", amh.qC, ddc$a.b);
    public static final /* enum */ ddc u = new ddc("wither_skeleton", amh.qD, ddc$a.b);
    public static final /* enum */ ddc v = new ddc("piglin", amh.qE, ddc$a.b);
    public static final /* enum */ ddc w = new ddc("custom_head", amh.yo, ddc$a.c);
    private final String x;
    private final he<amg> y;
    private final a z;
    private static final /* synthetic */ ddc[] A;

    public static ddc[] values() {
        return (ddc[])A.clone();
    }

    public static ddc valueOf(String $$0) {
        return Enum.valueOf(ddc.class, $$0);
    }

    private ddc(String $$0, he<amg> $$1, a $$2) {
        this.x = $$0;
        this.y = $$1;
        this.z = $$2;
    }

    @Override
    public String c() {
        return this.x;
    }

    public he<amg> a() {
        return this.y;
    }

    public boolean b() {
        return this.z == ddc$a.a;
    }

    public boolean d() {
        return this.z == ddc$a.c;
    }

    public boolean e() {
        return this.z != ddc$a.a;
    }

    private static /* synthetic */ ddc[] f() {
        return new ddc[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w};
    }

    static {
        A = ddc.f();
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = ddc$a.a();
        }
    }
}

