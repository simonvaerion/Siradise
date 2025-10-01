/*
 * Decompiled with CFR 0.152.
 */
public class aby<T> {
    private final int a;
    private final abz<T> b;

    public aby(int $$0, abz<T> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public int a() {
        return this.a;
    }

    public abz<T> b() {
        return this.b;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        aby $$1 = (aby)$$0;
        return this.a == $$1.a;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return "<entity data: " + this.a + ">";
    }
}

