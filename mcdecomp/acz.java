/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class acz
extends Enum<acz> {
    public static final /* enum */ acz a = new acz();
    public static final /* enum */ acz b = new acz();
    public static final /* enum */ acz c = new acz();
    public static final /* enum */ acz d = new acz();
    private static final List<acz> e;
    private static final hs.b f;
    private static final /* synthetic */ acz[] g;

    public static acz[] values() {
        return (acz[])g.clone();
    }

    public static acz valueOf(String $$0) {
        return Enum.valueOf(acz.class, $$0);
    }

    public static hl<acz> a() {
        return new hl<acz>(e).a(a, f);
    }

    private static /* synthetic */ acz[] b() {
        return new acz[]{a, b, c, d};
    }

    static {
        g = acz.b();
        e = List.of(acz.values());
        f = hs.a(jb.ap);
    }
}

