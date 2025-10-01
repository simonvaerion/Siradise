/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;
import java.util.function.Supplier;

public final class cdl
extends Enum<cdl>
implements apr,
cdk {
    public static final /* enum */ cdl a = new cdl("leather", 5, ac.a(new EnumMap(cdj.a.class), (T $$0) -> {
        $$0.put(cdj.a.d, 1);
        $$0.put(cdj.a.c, 2);
        $$0.put(cdj.a.b, 3);
        $$0.put(cdj.a.a, 1);
    }), 15, amh.ai, 0.0f, 0.0f, () -> ciz.a(cgc.pP));
    public static final /* enum */ cdl b = new cdl("chainmail", 15, ac.a(new EnumMap(cdj.a.class), (T $$0) -> {
        $$0.put(cdj.a.d, 1);
        $$0.put(cdj.a.c, 4);
        $$0.put(cdj.a.b, 5);
        $$0.put(cdj.a.a, 2);
    }), 12, amh.ac, 0.0f, 0.0f, () -> ciz.a(cgc.nQ));
    public static final /* enum */ cdl c = new cdl("iron", 15, ac.a(new EnumMap(cdj.a.class), (T $$0) -> {
        $$0.put(cdj.a.d, 2);
        $$0.put(cdj.a.c, 5);
        $$0.put(cdj.a.b, 6);
        $$0.put(cdj.a.a, 2);
    }), 9, amh.ah, 0.0f, 0.0f, () -> ciz.a(cgc.nQ));
    public static final /* enum */ cdl d = new cdl("gold", 7, ac.a(new EnumMap(cdj.a.class), (T $$0) -> {
        $$0.put(cdj.a.d, 1);
        $$0.put(cdj.a.c, 3);
        $$0.put(cdj.a.b, 5);
        $$0.put(cdj.a.a, 2);
    }), 25, amh.ag, 0.0f, 0.0f, () -> ciz.a(cgc.nU));
    public static final /* enum */ cdl e = new cdl("diamond", 33, ac.a(new EnumMap(cdj.a.class), (T $$0) -> {
        $$0.put(cdj.a.d, 3);
        $$0.put(cdj.a.c, 6);
        $$0.put(cdj.a.b, 8);
        $$0.put(cdj.a.a, 3);
    }), 10, amh.ad, 2.0f, 0.0f, () -> ciz.a(cgc.nK));
    public static final /* enum */ cdl f = new cdl("turtle", 25, ac.a(new EnumMap(cdj.a.class), (T $$0) -> {
        $$0.put(cdj.a.d, 2);
        $$0.put(cdj.a.c, 5);
        $$0.put(cdj.a.b, 6);
        $$0.put(cdj.a.a, 2);
    }), 9, amh.ak, 0.0f, 0.0f, () -> ciz.a(cgc.nD));
    public static final /* enum */ cdl g = new cdl("netherite", 37, ac.a(new EnumMap(cdj.a.class), (T $$0) -> {
        $$0.put(cdj.a.d, 3);
        $$0.put(cdj.a.c, 6);
        $$0.put(cdj.a.b, 8);
        $$0.put(cdj.a.a, 3);
    }), 15, amh.aj, 3.0f, 0.1f, () -> ciz.a(cgc.nV));
    public static final apr.a<cdl> h;
    private static final EnumMap<cdj.a, Integer> i;
    private final String j;
    private final int k;
    private final EnumMap<cdj.a, Integer> l;
    private final int m;
    private final amg n;
    private final float o;
    private final float p;
    private final aov<ciz> q;
    private static final /* synthetic */ cdl[] r;

    public static cdl[] values() {
        return (cdl[])r.clone();
    }

    public static cdl valueOf(String $$0) {
        return Enum.valueOf(cdl.class, $$0);
    }

    private cdl(String $$0, int $$1, EnumMap<cdj.a, Integer> $$2, int $$3, amg $$4, float $$5, float $$6, Supplier<ciz> $$7) {
        this.j = $$0;
        this.k = $$1;
        this.l = $$2;
        this.m = $$3;
        this.n = $$4;
        this.o = $$5;
        this.p = $$6;
        this.q = new aov<ciz>($$7);
    }

    @Override
    public int a(cdj.a $$0) {
        return i.get((Object)$$0) * this.k;
    }

    @Override
    public int b(cdj.a $$0) {
        return this.l.get((Object)$$0);
    }

    @Override
    public int a() {
        return this.m;
    }

    @Override
    public amg b() {
        return this.n;
    }

    @Override
    public ciz d() {
        return this.q.a();
    }

    @Override
    public String e() {
        return this.j;
    }

    @Override
    public float f() {
        return this.o;
    }

    @Override
    public float g() {
        return this.p;
    }

    @Override
    public String c() {
        return this.j;
    }

    private static /* synthetic */ cdl[] o() {
        return new cdl[]{a, b, c, d, e, f, g};
    }

    static {
        r = cdl.o();
        h = apr.a(cdl::values);
        i = ac.a(new EnumMap(cdj.a.class), (T $$0) -> {
            $$0.put(cdj.a.d, 13);
            $$0.put(cdj.a.c, 15);
            $$0.put(cdj.a.b, 16);
            $$0.put(cdj.a.a, 11);
        });
    }
}

