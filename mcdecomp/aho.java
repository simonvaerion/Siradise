/*
 * Decompiled with CFR 0.152.
 */
public class aho
implements Comparable<aho> {
    private final int a;
    private final gu b;
    private int c;
    private int d;

    public aho(int $$0, gu $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public int a() {
        return this.a;
    }

    public gu b() {
        return this.b;
    }

    public void a(int $$0) {
        if ($$0 > 10) {
            $$0 = 10;
        }
        this.c = $$0;
    }

    public int c() {
        return this.c;
    }

    public void b(int $$0) {
        this.d = $$0;
    }

    public int d() {
        return this.d;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        aho $$1 = (aho)$$0;
        return this.a == $$1.a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public int a(aho $$0) {
        if (this.c != $$0.c) {
            return Integer.compare(this.c, $$0.c);
        }
        return Integer.compare(this.a, $$0.a);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((aho)object);
    }
}

