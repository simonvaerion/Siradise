/*
 * Decompiled with CFR 0.152.
 */
public class bnn
extends bmm {
    private final boolean a;
    private int b;

    public bnn(bgb $$0, boolean $$1) {
        super($$0);
        this.d = $$0;
        this.a = $$1;
    }

    @Override
    public boolean b() {
        return this.a && this.b > 0 && super.b();
    }

    @Override
    public void c() {
        this.b = 20;
        this.a(true);
    }

    @Override
    public void d() {
        this.a(false);
    }

    @Override
    public void e() {
        --this.b;
        super.e();
    }
}

