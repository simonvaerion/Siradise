/*
 * Decompiled with CFR 0.152.
 */
public interface dak
extends bdq {
    public static final efb c = cpn.a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
    public static final efb x_ = cpn.a(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
    public static final efb y_ = eey.a(c, x_);

    default public efb aq_() {
        return y_;
    }

    public double G();

    public double I();

    public double J();
}

