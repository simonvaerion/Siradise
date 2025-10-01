/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 */
import com.google.common.collect.ImmutableList;

public class fcr
extends fbx<cah> {
    private static final String a = "left_paddle";
    private static final String b = "right_paddle";
    private static final String f = "bottom";
    private final fee g;
    private final fee h;
    private final ImmutableList<fee> i;

    public fcr(fee $$0) {
        this.g = $$0.b(a);
        this.h = $$0.b(b);
        this.i = this.a($$0).build();
    }

    protected ImmutableList.Builder<fee> a(fee $$0) {
        ImmutableList.Builder $$1 = new ImmutableList.Builder();
        $$1.add((Object[])new fee[]{$$0.b(f), this.g, this.h});
        return $$1;
    }

    public static void a(fen $$0) {
        $$0.a(f, fej.c().a(0, 0).a(-14.0f, -11.0f, -4.0f, 28.0f, 20.0f, 4.0f).a(0, 0).a(-14.0f, -9.0f, -8.0f, 28.0f, 16.0f, 4.0f), feg.a(0.0f, -2.0f, 1.0f, 1.5708f, 0.0f, 0.0f));
        int $$1 = 20;
        int $$2 = 7;
        int $$3 = 6;
        float $$4 = -5.0f;
        $$0.a(a, fej.c().a(0, 24).a(-1.0f, 0.0f, -5.0f, 2.0f, 2.0f, 18.0f).a(-1.001f, -3.0f, 8.0f, 1.0f, 6.0f, 7.0f), feg.a(3.0f, -4.0f, 9.0f, 0.0f, 0.0f, 0.19634955f));
        $$0.a(b, fej.c().a(40, 24).a(-1.0f, 0.0f, -5.0f, 2.0f, 2.0f, 18.0f).a(0.001f, -3.0f, 8.0f, 1.0f, 6.0f, 7.0f), feg.a(3.0f, -4.0f, -9.0f, 0.0f, (float)Math.PI, 0.19634955f));
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fcr.a($$1);
        return fek.a($$0, 128, 64);
    }

    @Override
    public void a(cah $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        fcr.a($$0, 0, this.g, $$1);
        fcr.a($$0, 1, this.h, $$1);
    }

    public ImmutableList<fee> c() {
        return this.i;
    }

    private static void a(cah $$0, int $$1, fee $$2, float $$3) {
        float $$4 = $$0.a($$1, $$3);
        $$2.e = apa.b(-1.0471976f, -0.2617994f, (apa.a(-$$4) + 1.0f) / 2.0f);
        $$2.f = apa.b(-0.7853982f, 0.7853982f, (apa.a(-$$4 + 1.0f) + 1.0f) / 2.0f);
        if ($$1 == 1) {
            $$2.f = (float)Math.PI - $$2.f;
        }
    }

    @Override
    public /* synthetic */ Iterable d() {
        return this.c();
    }
}

