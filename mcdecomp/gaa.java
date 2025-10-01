/*
 * Decompiled with CFR 0.152.
 */
public class gaa
implements gag {
    private static final int a = 1200;
    private static final sw b = sw.c("tutorial.craft_planks.title");
    private static final sw c = sw.c("tutorial.craft_planks.description");
    private final gaf d;
    private eri e;
    private int f;

    public gaa(gaf $$0) {
        this.d = $$0;
    }

    @Override
    public void a() {
        fiy $$0;
        ++this.f;
        if (!this.d.f()) {
            this.d.a(gah.f);
            return;
        }
        if (this.f == 1 && ($$0 = this.d.e().t) != null) {
            if ($$0.fN().a(ane.b)) {
                this.d.a(gah.f);
                return;
            }
            if (gaa.a($$0, ane.b)) {
                this.d.a(gah.f);
                return;
            }
        }
        if (this.f >= 1200 && this.e == null) {
            this.e = new eri(eri.a.e, b, c, false);
            this.d.e().az().a(this.e);
        }
    }

    @Override
    public void b() {
        if (this.e != null) {
            this.e.c();
            this.e = null;
        }
    }

    @Override
    public void a(cfz $$0) {
        if ($$0.a(ane.b)) {
            this.d.a(gah.f);
        }
    }

    public static boolean a(fiy $$0, anl<cfu> $$1) {
        for (he<cfu> $$2 : jb.i.c($$1)) {
            if ($$0.v().a(amr.b.b($$2.a())) <= 0) continue;
            return true;
        }
        return false;
    }
}

