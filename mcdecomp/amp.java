/*
 * Decompiled with CFR 0.152.
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public interface amp {
    public static final DecimalFormat a = ac.a(new DecimalFormat("########0.00"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
    public static final amp b = NumberFormat.getIntegerInstance(Locale.US)::format;
    public static final amp c = $$0 -> a.format((double)$$0 * 0.1);
    public static final amp d = $$0 -> {
        double $$1 = (double)$$0 / 100.0;
        double $$2 = $$1 / 1000.0;
        if ($$2 > 0.5) {
            return a.format($$2) + " km";
        }
        if ($$1 > 0.5) {
            return a.format($$1) + " m";
        }
        return $$0 + " cm";
    };
    public static final amp e = $$0 -> {
        double $$1 = (double)$$0 / 20.0;
        double $$2 = $$1 / 60.0;
        double $$3 = $$2 / 60.0;
        double $$4 = $$3 / 24.0;
        double $$5 = $$4 / 365.0;
        if ($$5 > 0.5) {
            return a.format($$5) + " y";
        }
        if ($$4 > 0.5) {
            return a.format($$4) + " d";
        }
        if ($$3 > 0.5) {
            return a.format($$3) + " h";
        }
        if ($$2 > 0.5) {
            return a.format($$2) + " m";
        }
        return $$1 + " s";
    };

    public String format(int var1);
}

