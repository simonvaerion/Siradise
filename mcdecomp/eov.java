/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.ibm.icu.text.ArabicShaping
 *  com.ibm.icu.text.ArabicShapingException
 *  com.ibm.icu.text.Bidi
 *  javax.annotation.Nullable
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import com.google.common.collect.Lists;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class eov {
    private static final float d = 0.01f;
    private static final Vector3f e = new Vector3f(0.0f, 0.0f, 0.03f);
    public static final int a = 8;
    public final int b = 9;
    public final apf c = apf.a();
    private final Function<acq, ern> f;
    final boolean g;
    private final enz h;

    public eov(Function<acq, ern> $$02, boolean $$12) {
        this.f = $$02;
        this.g = $$12;
        this.h = new enz(($$0, $$1) -> this.a($$1.k()).a($$0, this.g).a($$1.b()));
    }

    ern a(acq $$0) {
        return this.f.apply($$0);
    }

    public String a(String $$0) {
        try {
            Bidi $$1 = new Bidi(new ArabicShaping(8).shape($$0), 127);
            $$1.setReorderingMode(0);
            return $$1.writeReordered(2);
        }
        catch (ArabicShapingException arabicShapingException) {
            return $$0;
        }
    }

    public int a(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fjx $$6, a $$7, int $$8, int $$9) {
        return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, this.a());
    }

    public int a(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fjx $$6, a $$7, int $$8, int $$9, boolean $$10) {
        return this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
    }

    public int a(sw $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fjx $$6, a $$7, int $$8, int $$9) {
        return this.a($$0.f(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
    }

    public int a(aom $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fjx $$6, a $$7, int $$8, int $$9) {
        return this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
    }

    public void a(aom $$0, float $$1, float $$2, int $$3, int $$4, Matrix4f $$5, fjx $$62, int $$72) {
        int $$82 = eov.a($$4);
        b $$9 = new b($$62, 0.0f, 0.0f, $$82, false, $$5, eov$a.a, $$72);
        for (int $$10 = -1; $$10 <= 1; ++$$10) {
            for (int $$11 = -1; $$11 <= 1; ++$$11) {
                if ($$10 == 0 && $$11 == 0) continue;
                float[] $$12 = new float[]{$$1};
                int $$13 = $$10;
                int $$14 = $$11;
                $$0.accept(($$6, $$7, $$8) -> {
                    boolean $$9 = $$7.b();
                    ern $$10 = this.a($$7.k());
                    egl $$11 = $$10.a($$8, this.g);
                    $$0.l = $$12[0] + (float)$$13 * $$11.b();
                    $$0.m = $$2 + (float)$$14 * $$11.b();
                    $$1[0] = $$12[0] + $$11.a($$9);
                    return $$9.accept($$6, $$7.a($$82), $$8);
                });
            }
        }
        b $$15 = new b($$62, $$1, $$2, eov.a($$3), false, $$5, eov$a.c, $$72);
        $$0.accept($$15);
        $$15.a(0, $$1);
    }

    private static int a(int $$0) {
        if (($$0 & 0xFC000000) == 0) {
            return $$0 | 0xFF000000;
        }
        return $$0;
    }

    private int b(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fjx $$6, a $$7, int $$8, int $$9, boolean $$10) {
        if ($$10) {
            $$0 = this.a($$0);
        }
        $$3 = eov.a($$3);
        Matrix4f $$11 = new Matrix4f((Matrix4fc)$$5);
        if ($$4) {
            this.b($$0, $$1, $$2, $$3, true, $$5, $$6, $$7, $$8, $$9);
            $$11.translate((Vector3fc)e);
        }
        $$1 = this.b($$0, $$1, $$2, $$3, false, $$11, $$6, $$7, $$8, $$9);
        return (int)$$1 + ($$4 ? 1 : 0);
    }

    private int b(aom $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fjx $$6, a $$7, int $$8, int $$9) {
        $$3 = eov.a($$3);
        Matrix4f $$10 = new Matrix4f((Matrix4fc)$$5);
        if ($$4) {
            this.c($$0, $$1, $$2, $$3, true, $$5, $$6, $$7, $$8, $$9);
            $$10.translate((Vector3fc)e);
        }
        $$1 = this.c($$0, $$1, $$2, $$3, false, $$10, $$6, $$7, $$8, $$9);
        return (int)$$1 + ($$4 ? 1 : 0);
    }

    private float b(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fjx $$6, a $$7, int $$8, int $$9) {
        b $$10 = new b($$6, $$1, $$2, $$3, $$4, $$5, $$7, $$9);
        apq.c($$0, ts.a, $$10);
        return $$10.a($$8, $$1);
    }

    private float c(aom $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fjx $$6, a $$7, int $$8, int $$9) {
        b $$10 = new b($$6, $$1, $$2, $$3, $$4, $$5, $$7, $$9);
        $$0.accept($$10);
        return $$10.a($$8, $$1);
    }

    void a(err $$0, boolean $$1, boolean $$2, float $$3, float $$4, float $$5, Matrix4f $$6, ein $$7, float $$8, float $$9, float $$10, float $$11, int $$12) {
        $$0.a($$2, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12);
        if ($$1) {
            $$0.a($$2, $$4 + $$3, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12);
        }
    }

    public int b(String $$0) {
        return apa.f(this.h.a($$0));
    }

    public int a(ta $$0) {
        return apa.f(this.h.a($$0));
    }

    public int a(aom $$0) {
        return apa.f(this.h.a($$0));
    }

    public String a(String $$0, int $$1, boolean $$2) {
        return $$2 ? this.h.c($$0, $$1, ts.a) : this.h.b($$0, $$1, ts.a);
    }

    public String a(String $$0, int $$1) {
        return this.h.b($$0, $$1, ts.a);
    }

    public ta a(ta $$0, int $$1) {
        return this.h.a($$0, $$1, ts.a);
    }

    public int b(String $$0, int $$1) {
        return 9 * this.h.g($$0, $$1, ts.a).size();
    }

    public int b(ta $$0, int $$1) {
        return 9 * this.h.b($$0, $$1, ts.a).size();
    }

    public List<aom> c(ta $$0, int $$1) {
        return qm.a().a(this.h.b($$0, $$1, ts.a));
    }

    public boolean a() {
        return qm.a().b();
    }

    public enz b() {
        return this.h;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = eov$a.a();
        }
    }

    class b
    implements aon {
        final fjx a;
        private final boolean c;
        private final float d;
        private final float e;
        private final float f;
        private final float g;
        private final float h;
        private final Matrix4f i;
        private final a j;
        private final int k;
        float l;
        float m;
        @Nullable
        private List<err.a> n;

        private void a(err.a $$0) {
            if (this.n == null) {
                this.n = Lists.newArrayList();
            }
            this.n.add($$0);
        }

        public b(fjx $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, a $$6, int $$7) {
            this.a = $$0;
            this.l = $$1;
            this.m = $$2;
            this.c = $$4;
            this.d = $$4 ? 0.25f : 1.0f;
            this.e = (float)($$3 >> 16 & 0xFF) / 255.0f * this.d;
            this.f = (float)($$3 >> 8 & 0xFF) / 255.0f * this.d;
            this.g = (float)($$3 & 0xFF) / 255.0f * this.d;
            this.h = (float)($$3 >> 24 & 0xFF) / 255.0f;
            this.i = $$5;
            this.j = $$6;
            this.k = $$7;
        }

        @Override
        public boolean accept(int $$0, ts $$1, int $$2) {
            float $$20;
            float $$15;
            float $$14;
            float $$13;
            ern $$3 = eov.this.a($$1.k());
            egl $$4 = $$3.a($$2, eov.this.g);
            err $$5 = $$1.f() && $$2 != 32 ? $$3.a($$4) : $$3.a($$2);
            boolean $$6 = $$1.b();
            float $$7 = this.h;
            tu $$8 = $$1.a();
            if ($$8 != null) {
                int $$9 = $$8.a();
                float $$10 = (float)($$9 >> 16 & 0xFF) / 255.0f * this.d;
                float $$11 = (float)($$9 >> 8 & 0xFF) / 255.0f * this.d;
                float $$12 = (float)($$9 & 0xFF) / 255.0f * this.d;
            } else {
                $$13 = this.e;
                $$14 = this.f;
                $$15 = this.g;
            }
            if (!($$5 instanceof ers)) {
                float $$16 = $$6 ? $$4.a() : 0.0f;
                float $$17 = this.c ? $$4.b() : 0.0f;
                ein $$18 = this.a.getBuffer($$5.a(this.j));
                eov.this.a($$5, $$6, $$1.c(), $$16, this.l + $$17, this.m + $$17, this.i, $$18, $$13, $$14, $$15, $$7, this.k);
            }
            float $$19 = $$4.a($$6);
            float f2 = $$20 = this.c ? 1.0f : 0.0f;
            if ($$1.d()) {
                this.a(new err.a(this.l + $$20 - 1.0f, this.m + $$20 + 4.5f, this.l + $$20 + $$19, this.m + $$20 + 4.5f - 1.0f, 0.01f, $$13, $$14, $$15, $$7));
            }
            if ($$1.e()) {
                this.a(new err.a(this.l + $$20 - 1.0f, this.m + $$20 + 9.0f, this.l + $$20 + $$19, this.m + $$20 + 9.0f - 1.0f, 0.01f, $$13, $$14, $$15, $$7));
            }
            this.l += $$19;
            return true;
        }

        public float a(int $$0, float $$1) {
            if ($$0 != 0) {
                float $$2 = (float)($$0 >> 24 & 0xFF) / 255.0f;
                float $$3 = (float)($$0 >> 16 & 0xFF) / 255.0f;
                float $$4 = (float)($$0 >> 8 & 0xFF) / 255.0f;
                float $$5 = (float)($$0 & 0xFF) / 255.0f;
                this.a(new err.a($$1 - 1.0f, this.m + 9.0f, this.l + 1.0f, this.m - 1.0f, 0.01f, $$3, $$4, $$5, $$2));
            }
            if (this.n != null) {
                err $$6 = eov.this.a(ts.c).a();
                ein $$7 = this.a.getBuffer($$6.a(this.j));
                for (err.a $$8 : this.n) {
                    $$6.a($$8, this.i, $$7, this.k);
                }
            }
            return this.l;
        }
    }
}

