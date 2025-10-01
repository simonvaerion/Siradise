/*
 * Decompiled with CFR 0.152.
 */
public final class ajm
extends Enum<ajm> {
    public static final /* enum */ ajm a = new ajm("assets");
    public static final /* enum */ ajm b = new ajm("data");
    private final String c;
    private static final /* synthetic */ ajm[] d;

    public static ajm[] values() {
        return (ajm[])d.clone();
    }

    public static ajm valueOf(String $$0) {
        return Enum.valueOf(ajm.class, $$0);
    }

    private ajm(String $$0) {
        this.c = $$0;
    }

    public String a() {
        return this.c;
    }

    private static /* synthetic */ ajm[] b() {
        return new ajm[]{a, b};
    }

    static {
        d = ajm.b();
    }
}

