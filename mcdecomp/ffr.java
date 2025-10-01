/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public final class ffr
extends Enum<ffr> {
    public static final /* enum */ ffr a = new ffr("hate_speech");
    public static final /* enum */ ffr b = new ffr("terrorism_or_violent_extremism");
    public static final /* enum */ ffr c = new ffr("child_sexual_exploitation_or_abuse");
    public static final /* enum */ ffr d = new ffr("imminent_harm");
    public static final /* enum */ ffr e = new ffr("non_consensual_intimate_imagery");
    public static final /* enum */ ffr f = new ffr("harassment_or_bullying");
    public static final /* enum */ ffr g = new ffr("defamation_impersonation_false_information");
    public static final /* enum */ ffr h = new ffr("self_harm_or_suicide");
    public static final /* enum */ ffr i = new ffr("alcohol_tobacco_drugs");
    private final String j;
    private final sw k;
    private final sw l;
    private static final /* synthetic */ ffr[] m;

    public static ffr[] values() {
        return (ffr[])m.clone();
    }

    public static ffr valueOf(String $$0) {
        return Enum.valueOf(ffr.class, $$0);
    }

    private ffr(String $$0) {
        this.j = $$0.toUpperCase(Locale.ROOT);
        String $$1 = "gui.abuseReport.reason." + $$0;
        this.k = sw.c($$1);
        this.l = sw.c($$1 + ".description");
    }

    public String a() {
        return this.j;
    }

    public sw b() {
        return this.k;
    }

    public sw c() {
        return this.l;
    }

    private static /* synthetic */ ffr[] d() {
        return new ffr[]{a, b, c, d, e, f, g, h, i};
    }

    static {
        m = ffr.d();
    }
}

