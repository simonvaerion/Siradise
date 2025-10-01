/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.Float2FloatFunction
 */
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.function.Function;

public interface apx<C> {
    public static final apx<Float> a = apx.a($$0 -> $$0);

    public float a(C var1);

    public float b();

    public float c();

    public static apx<Float> a(final Float2FloatFunction $$0) {
        return new apx<Float>(){

            @Override
            public float a(Float $$02) {
                return ((Float)$$0.apply((Object)$$02)).floatValue();
            }

            @Override
            public float b() {
                return Float.NEGATIVE_INFINITY;
            }

            @Override
            public float c() {
                return Float.POSITIVE_INFINITY;
            }
        };
    }

    default public <C2> apx<C2> a(final Function<C2, C> $$0) {
        final apx $$1 = this;
        return new apx<C2>(){

            @Override
            public float a(C2 $$02) {
                return $$1.a($$0.apply($$02));
            }

            @Override
            public float b() {
                return $$1.b();
            }

            @Override
            public float c() {
                return $$1.c();
            }
        };
    }
}

