/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public final class li {
    public static final li a = li.a("all");
    public static final li b = li.a("texture", a);
    public static final li c = li.a("particle", b);
    public static final li d = li.a("end", a);
    public static final li e = li.a("bottom", d);
    public static final li f = li.a("top", d);
    public static final li g = li.a("front", a);
    public static final li h = li.a("back", a);
    public static final li i = li.a("side", a);
    public static final li j = li.a("north", i);
    public static final li k = li.a("south", i);
    public static final li l = li.a("east", i);
    public static final li m = li.a("west", i);
    public static final li n = li.a("up");
    public static final li o = li.a("down");
    public static final li p = li.a("cross");
    public static final li q = li.a("plant");
    public static final li r = li.a("wall", a);
    public static final li s = li.a("rail");
    public static final li t = li.a("wool");
    public static final li u = li.a("pattern");
    public static final li v = li.a("pane");
    public static final li w = li.a("edge");
    public static final li x = li.a("fan");
    public static final li y = li.a("stem");
    public static final li z = li.a("upperstem");
    public static final li A = li.a("crop");
    public static final li B = li.a("dirt");
    public static final li C = li.a("fire");
    public static final li D = li.a("lantern");
    public static final li E = li.a("platform");
    public static final li F = li.a("unsticky");
    public static final li G = li.a("torch");
    public static final li H = li.a("layer0");
    public static final li I = li.a("layer1");
    public static final li J = li.a("layer2");
    public static final li K = li.a("lit_log");
    public static final li L = li.a("candle");
    public static final li M = li.a("inside");
    public static final li N = li.a("content");
    public static final li O = li.a("inner_top");
    public static final li P = li.a("flowerbed");
    private final String Q;
    @Nullable
    private final li R;

    private static li a(String $$0) {
        return new li($$0, null);
    }

    private static li a(String $$0, li $$1) {
        return new li($$0, $$1);
    }

    private li(String $$0, @Nullable li $$1) {
        this.Q = $$0;
        this.R = $$1;
    }

    public String a() {
        return this.Q;
    }

    @Nullable
    public li b() {
        return this.R;
    }

    public String toString() {
        return "#" + this.Q;
    }
}

