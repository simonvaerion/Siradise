/*
 * Decompiled with CFR 0.152.
 */
public class dhm {
    public final apf a;
    private double b;
    private boolean c;

    public dhm(apf $$0) {
        this.a = $$0;
    }

    public void a() {
        this.c = false;
    }

    public double b() {
        double $$1;
        double $$0;
        double $$2;
        if (this.c) {
            this.c = false;
            return this.b;
        }
        do {
            $$0 = 2.0 * this.a.j() - 1.0;
            $$1 = 2.0 * this.a.j() - 1.0;
        } while (($$2 = apa.k($$0) + apa.k($$1)) >= 1.0 || $$2 == 0.0);
        double $$3 = Math.sqrt(-2.0 * Math.log($$2) / $$2);
        this.b = $$1 * $$3;
        this.c = true;
        return $$0 * $$3;
    }
}

