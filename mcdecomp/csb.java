/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public interface csb {
    @Nullable
    public czn a(gu var1, dcb var2);

    @Nullable
    default public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
        return null;
    }

    @Nullable
    default public <T extends czn> dgn a(aif $$0, T $$1) {
        if ($$1 instanceof dgn.b) {
            dgn.b $$2 = (dgn.b)((Object)$$1);
            return $$2.d();
        }
        return null;
    }
}

