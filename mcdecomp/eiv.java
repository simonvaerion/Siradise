/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public final class eiv
extends Enum<eiv> {
    public static final /* enum */ eiv a = new eiv();
    public static final /* enum */ eiv b = new eiv();
    public static final /* enum */ eiv c = new eiv();
    public static final /* enum */ eiv d = new eiv();
    private static final int e = 1024;
    private static final /* synthetic */ eiv[] f;

    public static eiv[] values() {
        return (eiv[])f.clone();
    }

    public static eiv valueOf(String $$0) {
        return Enum.valueOf(eiv.class, $$0);
    }

    public static eiv a(long $$0) {
        if ($$0 < 1024L) {
            return a;
        }
        try {
            int $$1 = (int)(Math.log($$0) / Math.log(1024.0));
            String $$2 = String.valueOf("KMGTPE".charAt($$1 - 1));
            return eiv.valueOf($$2 + "B");
        }
        catch (Exception $$3) {
            return d;
        }
    }

    public static double a(long $$0, eiv $$1) {
        if ($$1 == a) {
            return $$0;
        }
        return (double)$$0 / Math.pow(1024.0, $$1.ordinal());
    }

    public static String b(long $$0) {
        int $$1 = 1024;
        if ($$0 < 1024L) {
            return $$0 + " B";
        }
        int $$2 = (int)(Math.log($$0) / Math.log(1024.0));
        String $$3 = "" + "KMGTPE".charAt($$2 - 1);
        return String.format(Locale.ROOT, "%.1f %sB", (double)$$0 / Math.pow(1024.0, $$2), $$3);
    }

    public static String b(long $$0, eiv $$1) {
        return String.format(Locale.ROOT, "%." + ($$1 == d ? "1" : "0") + "f %s", eiv.a($$0, $$1), $$1.name());
    }

    private static /* synthetic */ eiv[] a() {
        return new eiv[]{a, b, c, d};
    }

    static {
        f = eiv.a();
    }
}

