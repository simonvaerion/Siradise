/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bqx
implements clz {
    private static final Logger a = LogUtils.getLogger();
    private boolean b;
    private a c = bqx$a.c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    @Override
    public int a(aif $$0, boolean $$1, boolean $$2) {
        if ($$0.N() || !$$1) {
            this.c = bqx$a.c;
            this.b = false;
            return 0;
        }
        float $$3 = $$0.f(0.0f);
        if ((double)$$3 == 0.5) {
            a a2 = this.c = $$0.z.a(10) == 0 ? bqx$a.b : bqx$a.c;
        }
        if (this.c == bqx$a.c) {
            return 0;
        }
        if (!this.b) {
            if (this.a($$0)) {
                this.b = true;
            } else {
                return 0;
            }
        }
        if (this.e > 0) {
            --this.e;
            return 0;
        }
        this.e = 2;
        if (this.d > 0) {
            this.b($$0);
            --this.d;
        } else {
            this.c = bqx$a.c;
        }
        return 1;
    }

    private boolean a(aif $$0) {
        for (byo byo2 : $$0.v()) {
            gu $$2;
            if (byo2.G_() || !$$0.b($$2 = byo2.di()) || $$0.s($$2).a(amv.ae)) continue;
            for (int $$3 = 0; $$3 < 10; ++$$3) {
                float $$4 = $$0.z.i() * ((float)Math.PI * 2);
                this.f = $$2.u() + apa.d(apa.b($$4) * 32.0f);
                this.g = $$2.v();
                this.h = $$2.w() + apa.d(apa.a($$4) * 32.0f);
                if (this.a($$0, new gu(this.f, this.g, this.h)) == null) continue;
                this.e = 0;
                this.d = 20;
                break;
            }
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private void b(aif $$0) {
        void $$4;
        eei $$1 = this.a($$0, new gu(this.f, this.g, this.h));
        if ($$1 == null) {
            return;
        }
        try {
            bwv $$2 = new bwv($$0);
            $$2.a($$0, $$0.d_($$2.di()), bgd.h, null, null);
        }
        catch (Exception $$3) {
            a.warn("Failed to create zombie for village siege at {}", (Object)$$1, (Object)$$3);
            return;
        }
        $$4.b($$1.c, $$1.d, $$1.e, $$0.z.i() * 360.0f, 0.0f);
        $$0.a_((bfj)$$4);
    }

    @Nullable
    private eei a(aif $$0, gu $$1) {
        for (int $$2 = 0; $$2 < 10; ++$$2) {
            int $$4;
            int $$5;
            int $$3 = $$1.u() + $$0.z.a(16) - 8;
            gu $$6 = new gu($$3, $$5 = $$0.a(dhk.a.b, $$3, $$4 = $$1.w() + $$0.z.a(16) - 8), $$4);
            if (!$$0.b($$6) || !bwc.b(bfn.bp, $$0, bgd.h, $$6, $$0.z)) continue;
            return eei.c($$6);
        }
        return null;
    }

    static final class a
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
            d = bqx$a.a();
        }
    }
}

