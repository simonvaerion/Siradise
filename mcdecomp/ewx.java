/*
 * Decompiled with CFR 0.152.
 */
public class ewx
extends evp<ccu> {
    private static final acq w = new acq("textures/gui/container/shulker_box.png");

    public ewx(ccu $$0, byn $$1, sw $$2) {
        super($$0, $$1, $$2);
        ++this.k;
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        super.a($$0, $$1, $$2, $$3);
        this.a($$0, $$1, $$2);
    }

    @Override
    protected void a(eox $$0, float $$1, int $$2, int $$3) {
        int $$4 = (this.g - this.c) / 2;
        int $$5 = (this.h - this.k) / 2;
        $$0.a(w, $$4, $$5, 0, 0, this.c, this.k);
    }
}

