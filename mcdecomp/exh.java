/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
import org.joml.Matrix4f;

public interface exh {
    public static exh a(aom $$0) {
        return new exg($$0);
    }

    public static exh a(cdf $$0) {
        if ($$0 instanceof cde) {
            return new exf((cde)$$0);
        }
        throw new IllegalArgumentException("Unknown TooltipComponent");
    }

    public int a();

    public int a(eov var1);

    default public void a(eov $$0, int $$1, int $$2, Matrix4f $$3, fjx.a $$4) {
    }

    default public void a(eov $$0, int $$1, int $$2, eox $$3) {
    }
}

