/*
 * Decompiled with CFR 0.152.
 */
public class gae
implements gag {
    private static final int a = 600;
    private static final sw b = sw.c("tutorial.punch_tree.title");
    private static final sw c = sw.a("tutorial.punch_tree.description", gaf.a("attack"));
    private final gaf d;
    private eri e;
    private int f;
    private int g;

    public gae(gaf $$0) {
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
            if ($$0.fN().a(ane.r)) {
                this.d.a(gah.e);
                return;
            }
            if (gab.a($$0)) {
                this.d.a(gah.e);
                return;
            }
        }
        if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new eri(eri.a.c, b, c, true);
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
    public void a(few $$0, gu $$1, dcb $$2, float $$3) {
        boolean $$4 = $$2.a(amw.t);
        if ($$4 && $$3 > 0.0f) {
            if (this.e != null) {
                this.e.a($$3);
            }
            if ($$3 >= 1.0f) {
                this.d.a(gah.d);
            }
        } else if (this.e != null) {
            this.e.a(0.0f);
        } else if ($$4) {
            ++this.g;
        }
    }

    @Override
    public void a(cfz $$0) {
        if ($$0.a(ane.r)) {
            this.d.a(gah.e);
            return;
        }
    }
}

