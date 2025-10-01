/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Floats
 *  it.unimi.dsi.fastutil.ints.IntArrays
 *  org.joml.Vector3f
 */
import com.google.common.primitives.Floats;
import it.unimi.dsi.fastutil.ints.IntArrays;
import org.joml.Vector3f;

public interface eir {
    public static final eir a = eir.a(0.0f, 0.0f, 0.0f);
    public static final eir b = eir.a((Vector3f $$0) -> -$$0.z());

    public static eir a(float $$0, float $$1, float $$2) {
        return eir.a(new Vector3f($$0, $$1, $$2));
    }

    public static eir a(Vector3f $$0) {
        return eir.a(arg_0 -> ((Vector3f)$$0).distanceSquared(arg_0));
    }

    public static eir a(a $$0) {
        return $$12 -> {
            float[] $$22 = new float[$$12.length];
            int[] $$3 = new int[$$12.length];
            for (int $$4 = 0; $$4 < $$12.length; ++$$4) {
                $$22[$$4] = $$0.apply($$12[$$4]);
                $$3[$$4] = $$4;
            }
            IntArrays.mergeSort((int[])$$3, ($$1, $$2) -> Floats.compare((float)$$22[$$2], (float)$$22[$$1]));
            return $$3;
        };
    }

    public int[] sort(Vector3f[] var1);

    public static interface a {
        public float apply(Vector3f var1);
    }
}

