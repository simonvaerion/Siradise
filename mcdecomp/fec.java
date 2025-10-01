/*
 * Decompiled with CFR 0.152.
 */
public final class fec {
    private final acq a;
    private final String b;

    public fec(acq $$0, String $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public acq a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof fec) {
            fec $$1 = (fec)$$0;
            return this.a.equals($$1.a) && this.b.equals($$1.b);
        }
        return false;
    }

    public int hashCode() {
        int $$0 = this.a.hashCode();
        $$0 = 31 * $$0 + this.b.hashCode();
        return $$0;
    }

    public String toString() {
        return this.a + "#" + this.b;
    }
}

