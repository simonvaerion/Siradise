/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;

public class fdj<T extends btd>
extends fad<T> {
    private final fee a;
    private final fee b;

    public fdj(fee $$0) {
        super(true, 8.0f, 3.35f);
        this.a = $$0;
        this.b = $$0.b("tail");
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        float $$2 = 0.0f;
        float $$3 = 22.0f;
        float $$4 = -3.0f;
        $$1.a("body", fej.c().a(0, 0).a(-1.5f, -1.0f, 0.0f, 3.0f, 2.0f, 3.0f), feg.a(0.0f, 22.0f, -3.0f));
        $$1.a("tail", fej.c().a(0, 0).a(0.0f, -1.0f, 0.0f, 0.0f, 2.0f, 7.0f), feg.a(0.0f, 22.0f, 0.0f));
        return fek.a($$0, 16, 16);
    }

    @Override
    protected Iterable<fee> a() {
        return ImmutableList.of((Object)this.a);
    }

    @Override
    protected Iterable<fee> b() {
        return ImmutableList.of((Object)this.b);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        float $$6 = ((bfj)$$0).aV() ? 1.0f : 1.5f;
        this.b.f = -$$6 * 0.25f * apa.a(0.3f * $$3);
    }
}

