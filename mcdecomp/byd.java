/*
 * Decompiled with CFR 0.152.
 */
public interface byd
extends bgy<byg> {
    public byc gj();

    @Override
    public void a(byc var1);

    default public byg a() {
        return this.gj().a();
    }

    @Override
    default public void a(byg $$0) {
        this.a(this.gj().a($$0));
    }

    @Override
    default public /* synthetic */ Object c() {
        return this.a();
    }
}

