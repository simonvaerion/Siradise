/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public interface fua
extends fud {
    @Override
    @Deprecated
    default public float call(cfz $$0, @Nullable few $$1, @Nullable bfz $$2, int $$3) {
        return apa.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0f, 1.0f);
    }

    public float unclampedCall(cfz var1, @Nullable few var2, @Nullable bfz var3, int var4);
}

