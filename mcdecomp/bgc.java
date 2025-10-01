/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class bgc
extends Enum<bgc>
implements apr {
    public static final /* enum */ bgc a = new bgc("monster", 70, false, false, 128);
    public static final /* enum */ bgc b = new bgc("creature", 10, true, true, 128);
    public static final /* enum */ bgc c = new bgc("ambient", 15, true, false, 128);
    public static final /* enum */ bgc d = new bgc("axolotls", 5, true, false, 128);
    public static final /* enum */ bgc e = new bgc("underground_water_creature", 5, true, false, 128);
    public static final /* enum */ bgc f = new bgc("water_creature", 5, true, false, 128);
    public static final /* enum */ bgc g = new bgc("water_ambient", 20, true, false, 64);
    public static final /* enum */ bgc h = new bgc("misc", -1, true, true, 128);
    public static final Codec<bgc> i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private final String m;
    private final int n = 32;
    private final int o;
    private static final /* synthetic */ bgc[] p;

    public static bgc[] values() {
        return (bgc[])p.clone();
    }

    public static bgc valueOf(String $$0) {
        return Enum.valueOf(bgc.class, $$0);
    }

    private bgc(String $$0, int $$1, boolean $$2, boolean $$3, int $$4) {
        this.m = $$0;
        this.j = $$1;
        this.k = $$2;
        this.l = $$3;
        this.o = $$4;
    }

    public String a() {
        return this.m;
    }

    @Override
    public String c() {
        return this.m;
    }

    public int b() {
        return this.j;
    }

    public boolean d() {
        return this.k;
    }

    public boolean e() {
        return this.l;
    }

    public int f() {
        return this.o;
    }

    public int g() {
        return 32;
    }

    private static /* synthetic */ bgc[] h() {
        return new bgc[]{a, b, c, d, e, f, g, h};
    }

    static {
        p = bgc.h();
        i = apr.a(bgc::values);
    }
}

