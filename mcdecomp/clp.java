/*
 * Decompiled with CFR 0.152.
 */
public interface clp
extends cls {
    public float a(ha var1, boolean var2);

    public dwt s_();

    public int a(gu var1, clx var2);

    default public int a(cmv $$0, gu $$1) {
        return this.s_().a($$0).b($$1);
    }

    default public int b(gu $$0, int $$1) {
        return this.s_().a($$0, $$1);
    }

    default public boolean g(gu $$0) {
        return this.a(cmv.a, $$0) >= this.M();
    }
}

