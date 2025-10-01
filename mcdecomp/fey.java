/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class fey
extends Enum<fey> {
    public static final /* enum */ fey a = new fey();
    public static final /* enum */ fey b = new fey();
    private static final List<fey> c;
    private static final hs.b d;
    private static final /* synthetic */ fey[] e;

    public static fey[] values() {
        return (fey[])e.clone();
    }

    public static fey valueOf(String $$0) {
        return Enum.valueOf(fey.class, $$0);
    }

    public static hl<fey> a() {
        return new hl<fey>(c).a(a, d);
    }

    private static /* synthetic */ fey[] b() {
        return new fey[]{a, b};
    }

    static {
        e = fey.b();
        c = List.of(fey.values());
        d = hs.a(jb.ap);
    }
}

