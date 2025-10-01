/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  javax.annotation.Nullable
 *  org.jetbrains.annotations.Contract
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public final class cen
extends Enum<cen>
implements apr {
    public static final /* enum */ cen a = new cen(0, "white", 0xF9FFFE, dxi.i, 0xF0F0F0, 0xFFFFFF);
    public static final /* enum */ cen b = new cen(1, "orange", 16351261, dxi.p, 15435844, 16738335);
    public static final /* enum */ cen c = new cen(2, "magenta", 13061821, dxi.q, 12801229, 0xFF00FF);
    public static final /* enum */ cen d = new cen(3, "light_blue", 3847130, dxi.r, 6719955, 10141901);
    public static final /* enum */ cen e = new cen(4, "yellow", 16701501, dxi.s, 14602026, 0xFFFF00);
    public static final /* enum */ cen f = new cen(5, "lime", 8439583, dxi.t, 4312372, 0xBFFF00);
    public static final /* enum */ cen g = new cen(6, "pink", 15961002, dxi.u, 14188952, 16738740);
    public static final /* enum */ cen h = new cen(7, "gray", 4673362, dxi.v, 0x434343, 0x808080);
    public static final /* enum */ cen i = new cen(8, "light_gray", 0x9D9D97, dxi.w, 0xABABAB, 0xD3D3D3);
    public static final /* enum */ cen j = new cen(9, "cyan", 1481884, dxi.x, 2651799, 65535);
    public static final /* enum */ cen k = new cen(10, "purple", 8991416, dxi.y, 8073150, 10494192);
    public static final /* enum */ cen l = new cen(11, "blue", 3949738, dxi.z, 2437522, 255);
    public static final /* enum */ cen m = new cen(12, "brown", 8606770, dxi.A, 5320730, 9127187);
    public static final /* enum */ cen n = new cen(13, "green", 6192150, dxi.B, 3887386, 65280);
    public static final /* enum */ cen o = new cen(14, "red", 11546150, dxi.C, 11743532, 0xFF0000);
    public static final /* enum */ cen p = new cen(15, "black", 0x1D1D21, dxi.D, 0x1E1B1B, 0);
    private static final IntFunction<cen> r;
    private static final Int2ObjectOpenHashMap<cen> s;
    public static final apr.a<cen> q;
    private final int t;
    private final String u;
    private final dxi v;
    private final float[] w;
    private final int x;
    private final int y;
    private static final /* synthetic */ cen[] z;

    public static cen[] values() {
        return (cen[])z.clone();
    }

    public static cen valueOf(String $$0) {
        return Enum.valueOf(cen.class, $$0);
    }

    private cen(int $$0, String $$1, int $$2, dxi $$3, int $$4, int $$5) {
        this.t = $$0;
        this.u = $$1;
        this.v = $$3;
        this.y = $$5;
        int $$6 = ($$2 & 0xFF0000) >> 16;
        int $$7 = ($$2 & 0xFF00) >> 8;
        int $$8 = ($$2 & 0xFF) >> 0;
        this.w = new float[]{(float)$$6 / 255.0f, (float)$$7 / 255.0f, (float)$$8 / 255.0f};
        this.x = $$4;
    }

    public int a() {
        return this.t;
    }

    public String b() {
        return this.u;
    }

    public float[] d() {
        return this.w;
    }

    public dxi e() {
        return this.v;
    }

    public int f() {
        return this.x;
    }

    public int g() {
        return this.y;
    }

    public static cen a(int $$0) {
        return r.apply($$0);
    }

    @Nullable
    @Contract(value="_,!null->!null;_,null->_")
    public static cen a(String $$0, @Nullable cen $$1) {
        cen $$2 = q.a($$0);
        return $$2 != null ? $$2 : $$1;
    }

    @Nullable
    public static cen b(int $$0) {
        return (cen)s.get($$0);
    }

    public String toString() {
        return this.u;
    }

    @Override
    public String c() {
        return this.u;
    }

    private static /* synthetic */ cen[] h() {
        return new cen[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
    }

    static {
        z = cen.h();
        r = anu.a(cen::a, cen.values(), anu.a.a);
        s = new Int2ObjectOpenHashMap(Arrays.stream(cen.values()).collect(Collectors.toMap($$0 -> $$0.x, $$0 -> $$0)));
        q = apr.a(cen::values);
    }
}

