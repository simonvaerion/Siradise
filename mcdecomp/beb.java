/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public interface beb {
    public sw Z();

    default public boolean aa() {
        return this.ab() != null;
    }

    default public sw H_() {
        return this.Z();
    }

    @Nullable
    default public sw ab() {
        return null;
    }
}

