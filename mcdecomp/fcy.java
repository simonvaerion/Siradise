/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;

public class fcy<T extends bwi>
extends fbx<T> {
    private static final String a = "lid";
    private static final String b = "base";
    private final fee f;
    private final fee g;
    private final fee h;

    public fcy(fee $$0) {
        super(fkf::e);
        this.g = $$0.b(a);
        this.f = $$0.b(b);
        this.h = $$0.b("head");
    }

    public static fek a() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a(a, fej.c().a(0, 0).a(-8.0f, -16.0f, -8.0f, 16.0f, 12.0f, 16.0f), feg.a(0.0f, 24.0f, 0.0f));
        $$1.a(b, fej.c().a(0, 28).a(-8.0f, -8.0f, -8.0f, 16.0f, 8.0f, 16.0f), feg.a(0.0f, 24.0f, 0.0f));
        $$1.a("head", fej.c().a(0, 52).a(-3.0f, 0.0f, -3.0f, 6.0f, 6.0f, 6.0f), feg.a(0.0f, 12.0f, 0.0f));
        return fek.a($$0, 64, 64);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        float $$6 = $$3 - (float)((bwi)$$0).ag;
        float $$7 = (0.5f + ((bwi)$$0).D($$6)) * (float)Math.PI;
        float $$8 = -1.0f + apa.a($$7);
        float $$9 = 0.0f;
        if ($$7 > (float)Math.PI) {
            $$9 = apa.a($$3 * 0.1f) * 0.7f;
        }
        this.g.a(0.0f, 16.0f + apa.a($$7) * 8.0f + $$9, 0.0f);
        this.g.f = ((bwi)$$0).D($$6) > 0.3f ? $$8 * $$8 * $$8 * $$8 * (float)Math.PI * 0.125f : 0.0f;
        this.h.e = $$5 * ((float)Math.PI / 180);
        this.h.f = (((bwi)$$0).aX - 180.0f - ((bwi)$$0).aV) * ((float)Math.PI / 180);
    }

    @Override
    public Iterable<fee> d() {
        return ImmutableList.of((Object)this.f, (Object)this.g);
    }

    public fee b() {
        return this.g;
    }

    public fee c() {
        return this.h;
    }
}

