/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import javax.annotation.Nullable;

public abstract class fjm {
    private static final Object2ObjectMap<acq, fjm> a = (Object2ObjectMap)ac.a(new Object2ObjectArrayMap(), $$0 -> {
        c $$1 = new c();
        $$0.defaultReturnValue((Object)$$1);
        $$0.put((Object)dfi.e, (Object)$$1);
        $$0.put((Object)dfi.f, (Object)new b());
        $$0.put((Object)dfi.g, (Object)new a());
    });
    private final float[] b = new float[4];
    private final float c;
    private final boolean d;
    private final d e;
    private final boolean f;
    private final boolean g;

    public fjm(float $$0, boolean $$1, d $$2, boolean $$3, boolean $$4) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
    }

    public static fjm a(dfk $$0) {
        return (fjm)a.get((Object)$$0.r());
    }

    @Nullable
    public float[] a(float $$0, float $$1) {
        float $$2 = 0.4f;
        float $$3 = apa.b($$0 * ((float)Math.PI * 2)) - 0.0f;
        float $$4 = -0.0f;
        if ($$3 >= -0.4f && $$3 <= 0.4f) {
            float $$5 = ($$3 - -0.0f) / 0.4f * 0.5f + 0.5f;
            float $$6 = 1.0f - (1.0f - apa.a($$5 * (float)Math.PI)) * 0.99f;
            $$6 *= $$6;
            this.b[0] = $$5 * 0.3f + 0.7f;
            this.b[1] = $$5 * $$5 * 0.7f + 0.2f;
            this.b[2] = $$5 * $$5 * 0.0f + 0.2f;
            this.b[3] = $$6;
            return this.b;
        }
        return null;
    }

    public float a() {
        return this.c;
    }

    public boolean b() {
        return this.d;
    }

    public abstract eei a(eei var1, float var2);

    public abstract boolean a(int var1, int var2);

    public d c() {
        return this.e;
    }

    public boolean d() {
        return this.f;
    }

    public boolean e() {
        return this.g;
    }

    public static final class d
    extends Enum<d> {
        public static final /* enum */ d a = new d();
        public static final /* enum */ d b = new d();
        public static final /* enum */ d c = new d();
        private static final /* synthetic */ d[] d;

        public static d[] values() {
            return (d[])d.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private static /* synthetic */ d[] a() {
            return new d[]{a, b, c};
        }

        static {
            d = fjm$d.a();
        }
    }

    public static class c
    extends fjm {
        public static final int a = 192;

        public c() {
            super(192.0f, true, fjm$d.b, false, false);
        }

        @Override
        public eei a(eei $$0, float $$1) {
            return $$0.d($$1 * 0.94f + 0.06f, $$1 * 0.94f + 0.06f, $$1 * 0.91f + 0.09f);
        }

        @Override
        public boolean a(int $$0, int $$1) {
            return false;
        }
    }

    public static class b
    extends fjm {
        public b() {
            super(Float.NaN, true, fjm$d.a, false, true);
        }

        @Override
        public eei a(eei $$0, float $$1) {
            return $$0;
        }

        @Override
        public boolean a(int $$0, int $$1) {
            return true;
        }
    }

    public static class a
    extends fjm {
        public a() {
            super(Float.NaN, false, fjm$d.c, true, false);
        }

        @Override
        public eei a(eei $$0, float $$1) {
            return $$0.a((double)0.15f);
        }

        @Override
        public boolean a(int $$0, int $$1) {
            return false;
        }

        @Override
        @Nullable
        public float[] a(float $$0, float $$1) {
            return null;
        }
    }
}

