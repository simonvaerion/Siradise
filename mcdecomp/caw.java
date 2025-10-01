/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.HashCommon
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.HashCommon;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

public final class caw {
    private static final caw b = new caw(null, 0L);
    public static final int a = 64;
    @Nullable
    private final cax c;
    private final long d;

    private caw(@Nullable cax $$0, long $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    static caw a(cax $$0, Collection<cau> $$1) {
        if ($$1.isEmpty()) {
            return b;
        }
        long $$2 = caw.a($$0, 0L, $$1);
        return new caw($$0, $$2);
    }

    public static caw a() {
        return b;
    }

    public static caw a(cau $$0) {
        return new caw($$0.a, $$0.b);
    }

    public static caw a(cau $$0, cau ... $$1) {
        long $$2 = $$1.length == 0 ? $$0.b : caw.a($$0.a, $$0.b, Arrays.asList($$1));
        return new caw($$0.a, $$2);
    }

    private static long a(cax $$0, long $$1, Iterable<cau> $$2) {
        for (cau $$3 : $$2) {
            if ($$0 != $$3.a) {
                throw new IllegalStateException("Mismatched feature universe, expected '" + $$0 + "', but got '" + $$3.a + "'");
            }
            $$1 |= $$3.b;
        }
        return $$1;
    }

    public boolean b(cau $$0) {
        if (this.c != $$0.a) {
            return false;
        }
        return (this.d & $$0.b) != 0L;
    }

    public boolean a(caw $$0) {
        if (this.c == null) {
            return true;
        }
        if (this.c != $$0.c) {
            return false;
        }
        return (this.d & ($$0.d ^ 0xFFFFFFFFFFFFFFFFL)) == 0L;
    }

    public caw b(caw $$0) {
        if (this.c == null) {
            return $$0;
        }
        if ($$0.c == null) {
            return this;
        }
        if (this.c != $$0.c) {
            throw new IllegalArgumentException("Mismatched set elements: '" + this.c + "' != '" + $$0.c + "'");
        }
        return new caw(this.c, this.d | $$0.d);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof caw)) return false;
        caw $$1 = (caw)$$0;
        if (this.c != $$1.c) return false;
        if (this.d != $$1.d) return false;
        return true;
    }

    public int hashCode() {
        return (int)HashCommon.mix((long)this.d);
    }
}

