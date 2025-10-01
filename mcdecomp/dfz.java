/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public interface dfz<B, T extends B> {
    public static <B, T extends B> dfz<B, T> a(final Class<T> $$0) {
        return new dfz<B, T>(){

            @Override
            @Nullable
            public T a(B $$02) {
                return $$0.isInstance($$02) ? $$02 : null;
            }

            @Override
            public Class<? extends B> a() {
                return $$0;
            }
        };
    }

    @Nullable
    public T a(B var1);

    public Class<? extends B> a();
}

