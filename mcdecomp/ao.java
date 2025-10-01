/*
 * Decompiled with CFR 0.152.
 */
public final class ao
extends Enum<ao> {
    public static final /* enum */ ao a = new ao("task", 0, n.k);
    public static final /* enum */ ao b = new ao("challenge", 26, n.f);
    public static final /* enum */ ao c = new ao("goal", 52, n.k);
    private final String d;
    private final int e;
    private final n f;
    private final sw g;
    private static final /* synthetic */ ao[] h;

    public static ao[] values() {
        return (ao[])h.clone();
    }

    public static ao valueOf(String $$0) {
        return Enum.valueOf(ao.class, $$0);
    }

    private ao(String $$0, int $$1, n $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = sw.c("advancements.toast." + $$0);
    }

    public String a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public static ao a(String $$0) {
        for (ao $$1 : ao.values()) {
            if (!$$1.d.equals($$0)) continue;
            return $$1;
        }
        throw new IllegalArgumentException("Unknown frame type '" + $$0 + "'");
    }

    public n c() {
        return this.f;
    }

    public sw d() {
        return this.g;
    }

    private static /* synthetic */ ao[] e() {
        return new ao[]{a, b, c};
    }

    static {
        h = ao.e();
    }
}

