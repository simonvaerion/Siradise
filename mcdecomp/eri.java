/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eri
implements erg {
    public static final int a = 154;
    public static final int e = 1;
    public static final int f = 3;
    public static final int g = 28;
    private final a h;
    private final sw i;
    @Nullable
    private final sw j;
    private erg.a k = erg.a.a;
    private long l;
    private float m;
    private float n;
    private final boolean o;

    public eri(a $$0, sw $$1, @Nullable sw $$2, boolean $$3) {
        this.h = $$0;
        this.i = $$1;
        this.j = $$2;
        this.o = $$3;
    }

    @Override
    public erg.a a(eox $$0, erh $$1, long $$2) {
        $$0.a(b, 0, 0, 0, 96, this.a(), this.b());
        this.h.a($$0, 6, 6);
        if (this.j == null) {
            $$0.a($$1.b().h, this.i, 30, 12, -11534256, false);
        } else {
            $$0.a($$1.b().h, this.i, 30, 7, -11534256, false);
            $$0.a($$1.b().h, this.j, 30, 18, -16777216, false);
        }
        if (this.o) {
            int $$5;
            $$0.a(3, 28, 157, 29, -1);
            float $$3 = apa.b(this.m, this.n, (float)($$2 - this.l) / 100.0f);
            if (this.n >= this.m) {
                int $$4 = -16755456;
            } else {
                $$5 = -11206656;
            }
            $$0.a(3, 28, (int)(3.0f + 154.0f * $$3), 29, $$5);
            this.m = $$3;
            this.l = $$2;
        }
        return this.k;
    }

    public void c() {
        this.k = erg.a.b;
    }

    public void a(float $$0) {
        this.n = $$0;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(0, 0);
        public static final /* enum */ a b = new a(1, 0);
        public static final /* enum */ a c = new a(2, 0);
        public static final /* enum */ a d = new a(0, 1);
        public static final /* enum */ a e = new a(1, 1);
        public static final /* enum */ a f = new a(2, 1);
        public static final /* enum */ a g = new a(3, 1);
        private final int h;
        private final int i;
        private static final /* synthetic */ a[] j;

        public static a[] values() {
            return (a[])j.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, int $$1) {
            this.h = $$0;
            this.i = $$1;
        }

        public void a(eox $$0, int $$1, int $$2) {
            RenderSystem.enableBlend();
            $$0.a(erg.b, $$1, $$2, 176 + this.h * 20, this.i * 20, 20, 20);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g};
        }

        static {
            j = eri$a.a();
        }
    }
}

