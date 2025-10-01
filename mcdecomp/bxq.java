/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class bxq
extends Enum<bxq> {
    public static final /* enum */ bxq a = new bxq(0, amh.zq, amh.zy);
    public static final /* enum */ bxq b = new bxq(40, amh.zp, amh.zz);
    public static final /* enum */ bxq c = new bxq(80, amh.zr, amh.zz);
    private static final bxq[] d;
    private final int e;
    private final amg f;
    private final amg g;
    private static final /* synthetic */ bxq[] h;

    public static bxq[] values() {
        return (bxq[])h.clone();
    }

    public static bxq valueOf(String $$0) {
        return Enum.valueOf(bxq.class, $$0);
    }

    private bxq(int $$0, amg $$1, amg $$2) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    public int a() {
        return this.e;
    }

    public amg b() {
        return this.f;
    }

    public amg c() {
        return this.g;
    }

    public static bxq a(int $$0) {
        for (bxq $$1 : d) {
            if ($$0 < $$1.e) continue;
            return $$1;
        }
        return a;
    }

    public boolean d() {
        return this == c;
    }

    private static /* synthetic */ bxq[] e() {
        return new bxq[]{a, b, c};
    }

    static {
        h = bxq.e();
        d = ac.a(bxq.values(), (T $$02) -> Arrays.sort($$02, ($$0, $$1) -> Integer.compare($$1.e, $$0.e)));
    }
}

