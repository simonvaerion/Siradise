/*
 * Decompiled with CFR 0.152.
 */
public class eqi {
    public static final eqi a = new eqi("Merry X-mas!");
    public static final eqi b = new eqi("Happy new year!");
    public static final eqi c = new eqi("OOoooOOOoooo! Spooky!");
    private static final int d = 123;
    private static final int e = 69;
    private final String f;

    public eqi(String $$0) {
        this.f = $$0;
    }

    public void a(eox $$0, int $$1, eov $$2, int $$3) {
        $$0.c().a();
        $$0.c().a((float)$$1 / 2.0f + 123.0f, 69.0f, 0.0f);
        $$0.c().a(a.f.rotationDegrees(-20.0f));
        float $$4 = 1.8f - apa.e(apa.a((float)(ac.b() % 1000L) / 1000.0f * ((float)Math.PI * 2)) * 0.1f);
        $$4 = $$4 * 100.0f / (float)($$2.b(this.f) + 32);
        $$0.c().b($$4, $$4, $$4);
        $$0.a($$2, this.f, 0, -8, 0xFFFF00 | $$3);
        $$0.c().b();
    }
}

