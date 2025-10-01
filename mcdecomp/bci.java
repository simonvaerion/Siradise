/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import org.slf4j.Logger;

public class bci {
    public static final Codec<bci> a = Codec.INT.xmap(bci::a, bci::a);
    private static final bci b = new bci(1);
    private static final Logger c = LogUtils.getLogger();
    private final int d;

    private bci(int $$0) {
        this.d = $$0;
    }

    public static bci a(int $$0) {
        if ($$0 == 1) {
            return b;
        }
        bci.b($$0);
        return new bci($$0);
    }

    public int a() {
        return this.d;
    }

    private static void b(int $$0) {
        if ($$0 < 0) {
            throw ac.b(new IllegalArgumentException("Weight should be >= 0"));
        }
        if ($$0 == 0 && aa.aS) {
            c.warn("Found 0 weight, make sure this is intentional!");
        }
    }

    public String toString() {
        return Integer.toString(this.d);
    }

    public int hashCode() {
        return Integer.hashCode(this.d);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        return $$0 instanceof bci && this.d == ((bci)$$0).d;
    }
}

