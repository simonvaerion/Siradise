/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public interface egl {
    public float getAdvance();

    default public float a(boolean $$0) {
        return this.getAdvance() + ($$0 ? this.a() : 0.0f);
    }

    default public float a() {
        return 1.0f;
    }

    default public float b() {
        return 1.0f;
    }

    public err bake(Function<egn, err> var1);

    public static interface a
    extends egl {
        @Override
        default public err bake(Function<egn, err> $$0) {
            return ers.a;
        }
    }
}

