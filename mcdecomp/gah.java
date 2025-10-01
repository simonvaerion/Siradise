/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class gah
extends Enum<gah> {
    public static final /* enum */ gah a = new gah("movement", gac::new);
    public static final /* enum */ gah b = new gah("find_tree", gab::new);
    public static final /* enum */ gah c = new gah("punch_tree", gae::new);
    public static final /* enum */ gah d = new gah("open_inventory", gad::new);
    public static final /* enum */ gah e = new gah("craft_planks", gaa::new);
    public static final /* enum */ gah f = new gah("none", fzz::new);
    private final String g;
    private final Function<gaf, ? extends gag> h;
    private static final /* synthetic */ gah[] i;

    public static gah[] values() {
        return (gah[])i.clone();
    }

    public static gah valueOf(String $$0) {
        return Enum.valueOf(gah.class, $$0);
    }

    private <T extends gag> gah(String $$0, Function<gaf, T> $$1) {
        this.g = $$0;
        this.h = $$1;
    }

    public gag a(gaf $$0) {
        return this.h.apply($$0);
    }

    public String a() {
        return this.g;
    }

    public static gah a(String $$0) {
        for (gah $$1 : gah.values()) {
            if (!$$1.g.equals($$0)) continue;
            return $$1;
        }
        return f;
    }

    private static /* synthetic */ gah[] b() {
        return new gah[]{a, b, c, d, e, f};
    }

    static {
        i = gah.b();
    }
}

