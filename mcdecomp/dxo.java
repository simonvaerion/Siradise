/*
 * Decompiled with CFR 0.152.
 */
public class dxo {
    private dxr[] a = new dxr[128];
    private int b;

    public dxr a(dxr $$0) {
        if ($$0.d >= 0) {
            throw new IllegalStateException("OW KNOWS!");
        }
        if (this.b == this.a.length) {
            dxr[] $$1 = new dxr[this.b << 1];
            System.arraycopy(this.a, 0, $$1, 0, this.b);
            this.a = $$1;
        }
        this.a[this.b] = $$0;
        $$0.d = this.b;
        this.a(this.b++);
        return $$0;
    }

    public void a() {
        this.b = 0;
    }

    public dxr b() {
        return this.a[0];
    }

    public dxr c() {
        dxr $$0 = this.a[0];
        this.a[0] = this.a[--this.b];
        this.a[this.b] = null;
        if (this.b > 0) {
            this.b(0);
        }
        $$0.d = -1;
        return $$0;
    }

    public void b(dxr $$0) {
        this.a[$$0.d] = this.a[--this.b];
        this.a[this.b] = null;
        if (this.b > $$0.d) {
            if (this.a[$$0.d].g < $$0.g) {
                this.a($$0.d);
            } else {
                this.b($$0.d);
            }
        }
        $$0.d = -1;
    }

    public void a(dxr $$0, float $$1) {
        float $$2 = $$0.g;
        $$0.g = $$1;
        if ($$1 < $$2) {
            this.a($$0.d);
        } else {
            this.b($$0.d);
        }
    }

    public int d() {
        return this.b;
    }

    private void a(int $$0) {
        dxr $$1 = this.a[$$0];
        float $$2 = $$1.g;
        while ($$0 > 0) {
            int $$3 = $$0 - 1 >> 1;
            dxr $$4 = this.a[$$3];
            if (!($$2 < $$4.g)) break;
            this.a[$$0] = $$4;
            $$4.d = $$0;
            $$0 = $$3;
        }
        this.a[$$0] = $$1;
        $$1.d = $$0;
    }

    private void b(int $$0) {
        dxr $$1 = this.a[$$0];
        float $$2 = $$1.g;
        while (true) {
            float $$10;
            dxr $$9;
            int $$3 = 1 + ($$0 << 1);
            int $$4 = $$3 + 1;
            if ($$3 >= this.b) break;
            dxr $$5 = this.a[$$3];
            float $$6 = $$5.g;
            if ($$4 >= this.b) {
                Object $$7 = null;
                float $$8 = Float.POSITIVE_INFINITY;
            } else {
                $$9 = this.a[$$4];
                $$10 = $$9.g;
            }
            if ($$6 < $$10) {
                if (!($$6 < $$2)) break;
                this.a[$$0] = $$5;
                $$5.d = $$0;
                $$0 = $$3;
                continue;
            }
            if (!($$10 < $$2)) break;
            this.a[$$0] = $$9;
            $$9.d = $$0;
            $$0 = $$4;
        }
        this.a[$$0] = $$1;
        $$1.d = $$0;
    }

    public boolean e() {
        return this.b == 0;
    }

    public dxr[] f() {
        dxr[] $$0 = new dxr[this.d()];
        System.arraycopy(this.a, 0, $$0, 0, this.d());
        return $$0;
    }
}

