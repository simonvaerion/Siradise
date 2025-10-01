/*
 * Decompiled with CFR 0.152.
 */
public interface efn
extends bdq {
    @Override
    default public int b() {
        return 1;
    }

    @Override
    default public boolean ab_() {
        return this.ar_().b();
    }

    @Override
    default public void a() {
        this.j();
    }

    default public cfz ar_() {
        return this.a(0);
    }

    default public cfz j() {
        return this.b(0);
    }

    default public void b(cfz $$0) {
        this.a(0, $$0);
    }

    @Override
    default public cfz b(int $$0) {
        return this.a($$0, this.ac_());
    }
}

