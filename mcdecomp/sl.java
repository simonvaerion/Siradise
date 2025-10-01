/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface sl {
    public static sl a(final Runnable $$0) {
        return new sl(){

            @Override
            public void a() {
                $$0.run();
            }

            @Override
            @Nullable
            public uo<?> b() {
                $$0.run();
                return null;
            }
        };
    }

    public static sl a(final Supplier<uo<?>> $$0) {
        return new sl(){

            @Override
            @Nullable
            public uo<?> b() {
                return (uo)$$0.get();
            }
        };
    }

    default public void a() {
    }

    @Nullable
    default public uo<?> b() {
        return null;
    }
}

