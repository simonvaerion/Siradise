/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public class fvo
extends alc<int[]> {
    private static final acq a = new acq("textures/colormap/foliage.png");

    protected int[] a(akx $$0, ban $$1) {
        try {
            return fvr.a($$0, a);
        }
        catch (IOException $$2) {
            throw new IllegalStateException("Failed to load foliage color texture", $$2);
        }
    }

    @Override
    protected void a(int[] $$0, akx $$1, ban $$2) {
        cmg.a($$0);
    }

    @Override
    protected /* synthetic */ Object b(akx akx2, ban ban2) {
        return this.a(akx2, ban2);
    }
}

