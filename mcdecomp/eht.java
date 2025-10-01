/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Locale;
import javax.annotation.Nullable;

public class eht {
    @Nullable
    private static eht a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private final boolean h;

    private eht(boolean $$0, boolean $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
        this.g = $$0;
        this.b = $$2;
        this.d = $$3;
        this.c = $$4;
        this.e = $$5;
        this.h = $$1;
        this.f = $$6;
    }

    public eht() {
        this(false, true, 1, 0, 1, 0, 32774);
    }

    public eht(int $$0, int $$1, int $$2) {
        this(false, false, $$0, $$1, $$0, $$1, $$2);
    }

    public eht(int $$0, int $$1, int $$2, int $$3, int $$4) {
        this(true, false, $$0, $$1, $$2, $$3, $$4);
    }

    public void a() {
        if (this.equals(a)) {
            return;
        }
        if (a == null || this.h != a.b()) {
            a = this;
            if (this.h) {
                RenderSystem.disableBlend();
                return;
            }
            RenderSystem.enableBlend();
        }
        RenderSystem.blendEquation(this.f);
        if (this.g) {
            RenderSystem.blendFuncSeparate(this.b, this.d, this.c, this.e);
        } else {
            RenderSystem.blendFunc(this.b, this.d);
        }
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof eht)) {
            return false;
        }
        eht $$1 = (eht)$$0;
        if (this.f != $$1.f) {
            return false;
        }
        if (this.e != $$1.e) {
            return false;
        }
        if (this.d != $$1.d) {
            return false;
        }
        if (this.h != $$1.h) {
            return false;
        }
        if (this.g != $$1.g) {
            return false;
        }
        if (this.c != $$1.c) {
            return false;
        }
        return this.b == $$1.b;
    }

    public int hashCode() {
        int $$0 = this.b;
        $$0 = 31 * $$0 + this.c;
        $$0 = 31 * $$0 + this.d;
        $$0 = 31 * $$0 + this.e;
        $$0 = 31 * $$0 + this.f;
        $$0 = 31 * $$0 + (this.g ? 1 : 0);
        $$0 = 31 * $$0 + (this.h ? 1 : 0);
        return $$0;
    }

    public boolean b() {
        return this.h;
    }

    public static int a(String $$0) {
        String $$1 = $$0.trim().toLowerCase(Locale.ROOT);
        if ("add".equals($$1)) {
            return 32774;
        }
        if ("subtract".equals($$1)) {
            return 32778;
        }
        if ("reversesubtract".equals($$1)) {
            return 32779;
        }
        if ("reverse_subtract".equals($$1)) {
            return 32779;
        }
        if ("min".equals($$1)) {
            return 32775;
        }
        if ("max".equals($$1)) {
            return 32776;
        }
        return 32774;
    }

    public static int b(String $$0) {
        String $$1 = $$0.trim().toLowerCase(Locale.ROOT);
        $$1 = $$1.replaceAll("_", "");
        $$1 = $$1.replaceAll("one", "1");
        $$1 = $$1.replaceAll("zero", "0");
        if ("0".equals($$1 = $$1.replaceAll("minus", "-"))) {
            return 0;
        }
        if ("1".equals($$1)) {
            return 1;
        }
        if ("srccolor".equals($$1)) {
            return 768;
        }
        if ("1-srccolor".equals($$1)) {
            return 769;
        }
        if ("dstcolor".equals($$1)) {
            return 774;
        }
        if ("1-dstcolor".equals($$1)) {
            return 775;
        }
        if ("srcalpha".equals($$1)) {
            return 770;
        }
        if ("1-srcalpha".equals($$1)) {
            return 771;
        }
        if ("dstalpha".equals($$1)) {
            return 772;
        }
        if ("1-dstalpha".equals($$1)) {
            return 773;
        }
        return -1;
    }
}

