/*
 * Decompiled with CFR 0.152.
 */
public class czy
extends czn {
    private int a;

    public czy(gu $$0, dcb $$1) {
        super(czp.s, $$0, $$1);
    }

    @Override
    protected void b(qr $$0) {
        super.b($$0);
        $$0.a("OutputSignal", this.a);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.a = $$0.h("OutputSignal");
    }

    public int c() {
        return this.a;
    }

    public void a(int $$0) {
        this.a = $$0;
    }
}

