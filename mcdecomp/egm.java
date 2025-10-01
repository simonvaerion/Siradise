/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface egm
extends AutoCloseable {
    @Override
    default public void close() {
    }

    @Nullable
    default public egl a(int $$0) {
        return null;
    }

    public IntSet a();
}

