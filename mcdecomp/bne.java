/*
 * Decompiled with CFR 0.152.
 */
public class bne
extends bnd {
    private final bxw h;

    public bne(bxw $$0) {
        super($$0, byo.class, 8.0f);
        this.h = $$0;
    }

    @Override
    public boolean a() {
        if (this.h.fZ()) {
            this.c = this.h.fY();
            return true;
        }
        return false;
    }
}

