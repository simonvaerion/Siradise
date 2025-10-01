/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public final class cho
extends Enum<cho>
implements chm {
    public static final /* enum */ cho a = new cho(0, 59, 2.0f, 0.0f, 15, () -> ciz.a(ane.b));
    public static final /* enum */ cho b = new cho(1, 131, 4.0f, 1.0f, 5, () -> ciz.a(ane.ax));
    public static final /* enum */ cho c = new cho(2, 250, 6.0f, 2.0f, 14, () -> ciz.a(cgc.nQ));
    public static final /* enum */ cho d = new cho(3, 1561, 8.0f, 3.0f, 10, () -> ciz.a(cgc.nK));
    public static final /* enum */ cho e = new cho(0, 32, 12.0f, 0.0f, 22, () -> ciz.a(cgc.nU));
    public static final /* enum */ cho f = new cho(4, 2031, 9.0f, 4.0f, 15, () -> ciz.a(cgc.nV));
    private final int g;
    private final int h;
    private final float i;
    private final float j;
    private final int k;
    private final aov<ciz> l;
    private static final /* synthetic */ cho[] m;

    public static cho[] values() {
        return (cho[])m.clone();
    }

    public static cho valueOf(String $$0) {
        return Enum.valueOf(cho.class, $$0);
    }

    private cho(int $$0, int $$1, float $$2, float $$3, int $$4, Supplier<ciz> $$5) {
        this.g = $$0;
        this.h = $$1;
        this.i = $$2;
        this.j = $$3;
        this.k = $$4;
        this.l = new aov<ciz>($$5);
    }

    @Override
    public int a() {
        return this.h;
    }

    @Override
    public float b() {
        return this.i;
    }

    @Override
    public float c() {
        return this.j;
    }

    @Override
    public int d() {
        return this.g;
    }

    @Override
    public int e() {
        return this.k;
    }

    @Override
    public ciz f() {
        return this.l.a();
    }

    private static /* synthetic */ cho[] m() {
        return new cho[]{a, b, c, d, e, f};
    }

    static {
        m = cho.m();
    }
}

