/*
 * Decompiled with CFR 0.152.
 */
public class fcw
extends fcb {
    private static final String a = "plate";
    private static final String b = "handle";
    private static final int c = 10;
    private static final int d = 20;
    private final fee e;
    private final fee f;
    private final fee g;

    public fcw(fee $$0) {
        super(fkf::b);
        this.e = $$0;
        this.f = $$0.b(a);
        this.g = $$0.b(b);
    }

    public static fek a() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a(a, fej.c().a(0, 0).a(-6.0f, -11.0f, -2.0f, 12.0f, 22.0f, 1.0f), feg.a);
        $$1.a(b, fej.c().a(26, 0).a(-1.0f, -3.0f, -1.0f, 2.0f, 6.0f, 6.0f), feg.a);
        return fek.a($$0, 64, 64);
    }

    public fee b() {
        return this.f;
    }

    public fee c() {
        return this.g;
    }

    @Override
    public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
        this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }
}

