/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public interface cmu {
    public boolean a(gu var1, dcb var2, int var3, int var4);

    default public boolean a(gu $$0, dcb $$1, int $$2) {
        return this.a($$0, $$1, $$2, 512);
    }

    public boolean a(gu var1, boolean var2);

    default public boolean b(gu $$0, boolean $$1) {
        return this.a($$0, $$1, null);
    }

    default public boolean a(gu $$0, boolean $$1, @Nullable bfj $$2) {
        return this.a($$0, $$1, $$2, 512);
    }

    public boolean a(gu var1, boolean var2, @Nullable bfj var3, int var4);

    default public boolean b(bfj $$0) {
        return false;
    }
}

