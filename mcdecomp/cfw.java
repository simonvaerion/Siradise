/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public final class cfw
extends Enum<cfw>
implements apr {
    public static final /* enum */ cfw a = new cfw(0, "none");
    public static final /* enum */ cfw b = new cfw(1, "thirdperson_lefthand");
    public static final /* enum */ cfw c = new cfw(2, "thirdperson_righthand");
    public static final /* enum */ cfw d = new cfw(3, "firstperson_lefthand");
    public static final /* enum */ cfw e = new cfw(4, "firstperson_righthand");
    public static final /* enum */ cfw f = new cfw(5, "head");
    public static final /* enum */ cfw g = new cfw(6, "gui");
    public static final /* enum */ cfw h = new cfw(7, "ground");
    public static final /* enum */ cfw i = new cfw(8, "fixed");
    public static final Codec<cfw> j;
    public static final IntFunction<cfw> k;
    private final byte l;
    private final String m;
    private static final /* synthetic */ cfw[] n;

    public static cfw[] values() {
        return (cfw[])n.clone();
    }

    public static cfw valueOf(String $$0) {
        return Enum.valueOf(cfw.class, $$0);
    }

    private cfw(int $$0, String $$1) {
        this.m = $$1;
        this.l = (byte)$$0;
    }

    @Override
    public String c() {
        return this.m;
    }

    public byte a() {
        return this.l;
    }

    public boolean b() {
        return this == d || this == e;
    }

    private static /* synthetic */ cfw[] d() {
        return new cfw[]{a, b, c, d, e, f, g, h, i};
    }

    static {
        n = cfw.d();
        j = apr.a(cfw::values);
        k = anu.a(cfw::a, cfw.values(), anu.a.a);
    }
}

