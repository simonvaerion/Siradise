/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public final class ffn
extends Enum<ffn> {
    public static final /* enum */ ffn a = new ffn("generic_violation");
    public static final /* enum */ ffn b = new ffn("false_reporting");
    public static final /* enum */ ffn c = new ffn("hate_speech");
    public static final /* enum */ ffn d = new ffn("hate_terrorism_notorious_figure");
    public static final /* enum */ ffn e = new ffn("harassment_or_bullying");
    public static final /* enum */ ffn f = new ffn("defamation_impersonation_false_information");
    public static final /* enum */ ffn g = new ffn("drugs");
    public static final /* enum */ ffn h = new ffn("fraud");
    public static final /* enum */ ffn i = new ffn("spam_or_advertising");
    public static final /* enum */ ffn j = new ffn("nudity_or_pornography");
    public static final /* enum */ ffn k = new ffn("sexually_inappropriate");
    public static final /* enum */ ffn l = new ffn("extreme_violence_or_gore");
    public static final /* enum */ ffn m = new ffn("imminent_harm_to_person_or_property");
    private final sw n;
    private static final /* synthetic */ ffn[] o;

    public static ffn[] values() {
        return (ffn[])o.clone();
    }

    public static ffn valueOf(String $$0) {
        return Enum.valueOf(ffn.class, $$0);
    }

    private ffn(String $$0) {
        this.n = sw.c("gui.banned.reason." + $$0);
    }

    public sw a() {
        return this.n;
    }

    @Nullable
    public static ffn a(int $$0) {
        return switch ($$0) {
            case 17, 19, 23, 31 -> a;
            case 2 -> b;
            case 5 -> c;
            case 16, 25 -> d;
            case 21 -> e;
            case 27 -> f;
            case 28 -> g;
            case 29 -> h;
            case 30 -> i;
            case 32 -> j;
            case 33 -> k;
            case 34 -> l;
            case 53 -> m;
            default -> null;
        };
    }

    private static /* synthetic */ ffn[] b() {
        return new ffn[]{a, b, c, d, e, f, g, h, i, j, k, l, m};
    }

    static {
        o = ffn.b();
    }
}

