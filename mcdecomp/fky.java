/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
import javax.annotation.Nullable;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class fky {
    public static final int a = 8;
    private static final float d = 1.0f / (float)Math.cos(0.3926991f) - 1.0f;
    private static final float e = 1.0f / (float)Math.cos(0.7853981852531433) - 1.0f;
    public static final int b = 4;
    private static final int f = 3;
    public static final int c = 4;

    public fkr a(Vector3f $$0, Vector3f $$1, fkt $$2, fuv $$3, ha $$4, fwz $$5, @Nullable fku $$6, boolean $$7, acq $$8) {
        fkv $$9 = $$2.e;
        if ($$5.c()) {
            $$9 = fky.a($$2.e, $$4, $$5.b(), $$8);
        }
        float[] $$10 = new float[$$9.a.length];
        System.arraycopy($$9.a, 0, $$10, 0, $$10.length);
        float $$11 = $$3.k();
        float $$12 = ($$9.a[0] + $$9.a[0] + $$9.a[2] + $$9.a[2]) / 4.0f;
        float $$13 = ($$9.a[1] + $$9.a[1] + $$9.a[3] + $$9.a[3]) / 4.0f;
        $$9.a[0] = apa.i($$11, $$9.a[0], $$12);
        $$9.a[2] = apa.i($$11, $$9.a[2], $$12);
        $$9.a[1] = apa.i($$11, $$9.a[1], $$13);
        $$9.a[3] = apa.i($$11, $$9.a[3], $$13);
        int[] $$14 = this.a($$9, $$3, $$4, this.a($$0, $$1), $$5.b(), $$6, $$7);
        ha $$15 = fky.a($$14);
        System.arraycopy($$10, 0, $$9.a, 0, $$10.length);
        if ($$6 == null) {
            this.a($$14, $$15);
        }
        return new fkr($$14, $$2.c, $$15, $$3, $$7);
    }

    public static fkv a(fkv $$0, ha $$1, j $$2, acq $$3) {
        float $$22;
        float $$21;
        float $$18;
        float $$17;
        Matrix4f $$4 = gt.a($$2, $$1, () -> "Unable to resolve UVLock for model: " + $$3).c();
        float $$5 = $$0.a($$0.c(0));
        float $$6 = $$0.b($$0.c(0));
        Vector4f $$7 = $$4.transform(new Vector4f($$5 / 16.0f, $$6 / 16.0f, 0.0f, 1.0f));
        float $$8 = 16.0f * $$7.x();
        float $$9 = 16.0f * $$7.y();
        float $$10 = $$0.a($$0.c(2));
        float $$11 = $$0.b($$0.c(2));
        Vector4f $$12 = $$4.transform(new Vector4f($$10 / 16.0f, $$11 / 16.0f, 0.0f, 1.0f));
        float $$13 = 16.0f * $$12.x();
        float $$14 = 16.0f * $$12.y();
        if (Math.signum($$10 - $$5) == Math.signum($$13 - $$8)) {
            float $$15 = $$8;
            float $$16 = $$13;
        } else {
            $$17 = $$13;
            $$18 = $$8;
        }
        if (Math.signum($$11 - $$6) == Math.signum($$14 - $$9)) {
            float $$19 = $$9;
            float $$20 = $$14;
        } else {
            $$21 = $$14;
            $$22 = $$9;
        }
        float $$23 = (float)Math.toRadians($$0.b);
        Matrix3f $$24 = new Matrix3f((Matrix4fc)$$4);
        Vector3f $$25 = $$24.transform(new Vector3f(apa.b($$23), apa.a($$23), 0.0f));
        int $$26 = Math.floorMod(-((int)Math.round(Math.toDegrees(Math.atan2($$25.y(), $$25.x())) / 90.0)) * 90, 360);
        return new fkv(new float[]{$$17, $$21, $$18, $$22}, $$26);
    }

    private int[] a(fkv $$0, fuv $$1, ha $$2, float[] $$3, j $$4, @Nullable fku $$5, boolean $$6) {
        int[] $$7 = new int[32];
        for (int $$8 = 0; $$8 < 4; ++$$8) {
            this.a($$7, $$8, $$2, $$0, $$3, $$1, $$4, $$5, $$6);
        }
        return $$7;
    }

    private float[] a(Vector3f $$0, Vector3f $$1) {
        float[] $$2 = new float[ha.values().length];
        $$2[fjo.a.f] = $$0.x() / 16.0f;
        $$2[fjo.a.e] = $$0.y() / 16.0f;
        $$2[fjo.a.d] = $$0.z() / 16.0f;
        $$2[fjo.a.c] = $$1.x() / 16.0f;
        $$2[fjo.a.b] = $$1.y() / 16.0f;
        $$2[fjo.a.a] = $$1.z() / 16.0f;
        return $$2;
    }

    private void a(int[] $$0, int $$1, ha $$2, fkv $$3, float[] $$4, fuv $$5, j $$6, @Nullable fku $$7, boolean $$8) {
        fjo.b $$9 = fjo.a($$2).a($$1);
        Vector3f $$10 = new Vector3f($$4[$$9.a], $$4[$$9.b], $$4[$$9.c]);
        this.a($$10, $$7);
        this.a($$10, $$6);
        this.a($$0, $$1, $$10, $$5, $$3);
    }

    private void a(int[] $$0, int $$1, Vector3f $$2, fuv $$3, fkv $$4) {
        int $$5 = $$1 * 8;
        $$0[$$5] = Float.floatToRawIntBits($$2.x());
        $$0[$$5 + 1] = Float.floatToRawIntBits($$2.y());
        $$0[$$5 + 2] = Float.floatToRawIntBits($$2.z());
        $$0[$$5 + 3] = -1;
        $$0[$$5 + 4] = Float.floatToRawIntBits($$3.a((double)$$4.a($$1)));
        $$0[$$5 + 4 + 1] = Float.floatToRawIntBits($$3.b((double)$$4.b($$1)));
    }

    /*
     * WARNING - void declaration
     */
    private void a(Vector3f $$0, @Nullable fku $$1) {
        void $$9;
        void $$8;
        if ($$1 == null) {
            return;
        }
        switch ($$1.b()) {
            case a: {
                Vector3f $$2 = new Vector3f(1.0f, 0.0f, 0.0f);
                Vector3f $$3 = new Vector3f(0.0f, 1.0f, 1.0f);
                break;
            }
            case b: {
                Vector3f $$4 = new Vector3f(0.0f, 1.0f, 0.0f);
                Vector3f $$5 = new Vector3f(1.0f, 0.0f, 1.0f);
                break;
            }
            case c: {
                Vector3f $$6 = new Vector3f(0.0f, 0.0f, 1.0f);
                Vector3f $$7 = new Vector3f(1.0f, 1.0f, 0.0f);
                break;
            }
            default: {
                throw new IllegalArgumentException("There are only 3 axes");
            }
        }
        Quaternionf $$10 = new Quaternionf().rotationAxis($$1.c() * ((float)Math.PI / 180), (Vector3fc)$$8);
        if ($$1.d()) {
            if (Math.abs($$1.c()) == 22.5f) {
                $$9.mul(d);
            } else {
                $$9.mul(e);
            }
            $$9.add(1.0f, 1.0f, 1.0f);
        } else {
            $$9.set(1.0f, 1.0f, 1.0f);
        }
        this.a($$0, new Vector3f((Vector3fc)$$1.a()), new Matrix4f().rotation((Quaternionfc)$$10), (Vector3f)$$9);
    }

    public void a(Vector3f $$0, j $$1) {
        if ($$1 == j.a()) {
            return;
        }
        this.a($$0, new Vector3f(0.5f, 0.5f, 0.5f), $$1.c(), new Vector3f(1.0f, 1.0f, 1.0f));
    }

    private void a(Vector3f $$0, Vector3f $$1, Matrix4f $$2, Vector3f $$3) {
        Vector4f $$4 = $$2.transform(new Vector4f($$0.x() - $$1.x(), $$0.y() - $$1.y(), $$0.z() - $$1.z(), 1.0f));
        $$4.mul((Vector4fc)new Vector4f((Vector3fc)$$3, 1.0f));
        $$0.set($$4.x() + $$1.x(), $$4.y() + $$1.y(), $$4.z() + $$1.z());
    }

    public static ha a(int[] $$0) {
        Vector3f $$1 = new Vector3f(Float.intBitsToFloat($$0[0]), Float.intBitsToFloat($$0[1]), Float.intBitsToFloat($$0[2]));
        Vector3f $$2 = new Vector3f(Float.intBitsToFloat($$0[8]), Float.intBitsToFloat($$0[9]), Float.intBitsToFloat($$0[10]));
        Vector3f $$3 = new Vector3f(Float.intBitsToFloat($$0[16]), Float.intBitsToFloat($$0[17]), Float.intBitsToFloat($$0[18]));
        Vector3f $$4 = new Vector3f((Vector3fc)$$1).sub((Vector3fc)$$2);
        Vector3f $$5 = new Vector3f((Vector3fc)$$3).sub((Vector3fc)$$2);
        Vector3f $$6 = new Vector3f((Vector3fc)$$5).cross((Vector3fc)$$4).normalize();
        if (!$$6.isFinite()) {
            return ha.b;
        }
        ha $$7 = null;
        float $$8 = 0.0f;
        for (ha $$9 : ha.values()) {
            hz $$10 = $$9.q();
            Vector3f $$11 = new Vector3f((float)$$10.u(), (float)$$10.v(), (float)$$10.w());
            float $$12 = $$6.dot((Vector3fc)$$11);
            if (!($$12 >= 0.0f) || !($$12 > $$8)) continue;
            $$8 = $$12;
            $$7 = $$9;
        }
        if ($$7 == null) {
            return ha.b;
        }
        return $$7;
    }

    private void a(int[] $$0, ha $$1) {
        int[] $$2 = new int[$$0.length];
        System.arraycopy($$0, 0, $$2, 0, $$0.length);
        float[] $$3 = new float[ha.values().length];
        $$3[fjo.a.f] = 999.0f;
        $$3[fjo.a.e] = 999.0f;
        $$3[fjo.a.d] = 999.0f;
        $$3[fjo.a.c] = -999.0f;
        $$3[fjo.a.b] = -999.0f;
        $$3[fjo.a.a] = -999.0f;
        for (int $$4 = 0; $$4 < 4; ++$$4) {
            int $$5 = 8 * $$4;
            float $$6 = Float.intBitsToFloat($$2[$$5]);
            float $$7 = Float.intBitsToFloat($$2[$$5 + 1]);
            float $$8 = Float.intBitsToFloat($$2[$$5 + 2]);
            if ($$6 < $$3[fjo.a.f]) {
                $$3[fjo.a.f] = $$6;
            }
            if ($$7 < $$3[fjo.a.e]) {
                $$3[fjo.a.e] = $$7;
            }
            if ($$8 < $$3[fjo.a.d]) {
                $$3[fjo.a.d] = $$8;
            }
            if ($$6 > $$3[fjo.a.c]) {
                $$3[fjo.a.c] = $$6;
            }
            if ($$7 > $$3[fjo.a.b]) {
                $$3[fjo.a.b] = $$7;
            }
            if (!($$8 > $$3[fjo.a.a])) continue;
            $$3[fjo.a.a] = $$8;
        }
        fjo $$9 = fjo.a($$1);
        for (int $$10 = 0; $$10 < 4; ++$$10) {
            int $$11 = 8 * $$10;
            fjo.b $$12 = $$9.a($$10);
            float $$13 = $$3[$$12.a];
            float $$14 = $$3[$$12.b];
            float $$15 = $$3[$$12.c];
            $$0[$$11] = Float.floatToRawIntBits($$13);
            $$0[$$11 + 1] = Float.floatToRawIntBits($$14);
            $$0[$$11 + 2] = Float.floatToRawIntBits($$15);
            for (int $$16 = 0; $$16 < 4; ++$$16) {
                int $$17 = 8 * $$16;
                float $$18 = Float.intBitsToFloat($$2[$$17]);
                float $$19 = Float.intBitsToFloat($$2[$$17 + 1]);
                float $$20 = Float.intBitsToFloat($$2[$$17 + 2]);
                if (!apa.a($$13, $$18) || !apa.a($$14, $$19) || !apa.a($$15, $$20)) continue;
                $$0[$$11 + 4] = $$2[$$17 + 4];
                $$0[$$11 + 4 + 1] = $$2[$$17 + 4 + 1];
            }
        }
    }
}

