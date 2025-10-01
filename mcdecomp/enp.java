/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.IntFunction;

public final class enp
extends Enum<enp> {
    public static final /* enum */ enp a = new enp(0, "options.narrator.off");
    public static final /* enum */ enp b = new enp(1, "options.narrator.all");
    public static final /* enum */ enp c = new enp(2, "options.narrator.chat");
    public static final /* enum */ enp d = new enp(3, "options.narrator.system");
    private static final IntFunction<enp> e;
    private final int f;
    private final sw g;
    private static final /* synthetic */ enp[] h;

    public static enp[] values() {
        return (enp[])h.clone();
    }

    public static enp valueOf(String $$0) {
        return Enum.valueOf(enp.class, $$0);
    }

    private enp(int $$0, String $$1) {
        this.f = $$0;
        this.g = sw.c($$1);
    }

    public int a() {
        return this.f;
    }

    public sw b() {
        return this.g;
    }

    public static enp a(int $$0) {
        return e.apply($$0);
    }

    public boolean c() {
        return this == b || this == c;
    }

    public boolean d() {
        return this == b || this == d;
    }

    private static /* synthetic */ enp[] e() {
        return new enp[]{a, b, c, d};
    }

    static {
        h = enp.e();
        e = anu.a(enp::a, enp.values(), anu.a.b);
    }
}

