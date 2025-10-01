/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 */
import com.google.common.collect.ImmutableList;

public class fan
extends fbx<cah>
implements fds {
    private static final String a = "left_paddle";
    private static final String b = "right_paddle";
    private static final String f = "water_patch";
    private static final String g = "bottom";
    private static final String h = "back";
    private static final String i = "front";
    private static final String j = "right";
    private static final String k = "left";
    private final fee l;
    private final fee m;
    private final fee n;
    private final ImmutableList<fee> o;

    public fan(fee $$0) {
        this.l = $$0.b(a);
        this.m = $$0.b(b);
        this.n = $$0.b(f);
        this.o = this.a($$0).build();
    }

    protected ImmutableList.Builder<fee> a(fee $$0) {
        ImmutableList.Builder $$1 = new ImmutableList.Builder();
        $$1.add((Object[])new fee[]{$$0.b(g), $$0.b(h), $$0.b(i), $$0.b(j), $$0.b(k), this.l, this.m});
        return $$1;
    }

    public static void a(fen $$0) {
        int $$1 = 32;
        int $$2 = 6;
        int $$3 = 20;
        int $$4 = 4;
        int $$5 = 28;
        $$0.a(g, fej.c().a(0, 0).a(-14.0f, -9.0f, -3.0f, 28.0f, 16.0f, 3.0f), feg.a(0.0f, 3.0f, 1.0f, 1.5707964f, 0.0f, 0.0f));
        $$0.a(h, fej.c().a(0, 19).a(-13.0f, -7.0f, -1.0f, 18.0f, 6.0f, 2.0f), feg.a(-15.0f, 4.0f, 4.0f, 0.0f, 4.712389f, 0.0f));
        $$0.a(i, fej.c().a(0, 27).a(-8.0f, -7.0f, -1.0f, 16.0f, 6.0f, 2.0f), feg.a(15.0f, 4.0f, 0.0f, 0.0f, 1.5707964f, 0.0f));
        $$0.a(j, fej.c().a(0, 35).a(-14.0f, -7.0f, -1.0f, 28.0f, 6.0f, 2.0f), feg.a(0.0f, 4.0f, -9.0f, 0.0f, (float)Math.PI, 0.0f));
        $$0.a(k, fej.c().a(0, 43).a(-14.0f, -7.0f, -1.0f, 28.0f, 6.0f, 2.0f), feg.a(0.0f, 4.0f, 9.0f));
        int $$6 = 20;
        int $$7 = 7;
        int $$8 = 6;
        float $$9 = -5.0f;
        $$0.a(a, fej.c().a(62, 0).a(-1.0f, 0.0f, -5.0f, 2.0f, 2.0f, 18.0f).a(-1.001f, -3.0f, 8.0f, 1.0f, 6.0f, 7.0f), feg.a(3.0f, -5.0f, 9.0f, 0.0f, 0.0f, 0.19634955f));
        $$0.a(b, fej.c().a(62, 20).a(-1.0f, 0.0f, -5.0f, 2.0f, 2.0f, 18.0f).a(0.001f, -3.0f, 8.0f, 1.0f, 6.0f, 7.0f), feg.a(3.0f, -5.0f, -9.0f, 0.0f, (float)Math.PI, 0.19634955f));
        $$0.a(f, fej.c().a(0, 0).a(-14.0f, -9.0f, -3.0f, 28.0f, 16.0f, 3.0f), feg.a(0.0f, -3.0f, 1.0f, 1.5707964f, 0.0f, 0.0f));
    }

    public static fek a() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fan.a($$1);
        return fek.a($$0, 128, 64);
    }

    @Override
    public void a(cah $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        fan.a($$0, 0, this.l, $$1);
        fan.a($$0, 1, this.m, $$1);
    }

    public ImmutableList<fee> b() {
        return this.o;
    }

    @Override
    public fee c() {
        return this.n;
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
        return this.b();
    }
}

