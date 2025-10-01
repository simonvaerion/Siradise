/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 */
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import org.joml.Quaternionf;

public final class fws
extends Enum<fws>
implements fwz {
    public static final /* enum */ fws a = new fws(0, 0);
    public static final /* enum */ fws b = new fws(0, 90);
    public static final /* enum */ fws c = new fws(0, 180);
    public static final /* enum */ fws d = new fws(0, 270);
    public static final /* enum */ fws e = new fws(90, 0);
    public static final /* enum */ fws f = new fws(90, 90);
    public static final /* enum */ fws g = new fws(90, 180);
    public static final /* enum */ fws h = new fws(90, 270);
    public static final /* enum */ fws i = new fws(180, 0);
    public static final /* enum */ fws j = new fws(180, 90);
    public static final /* enum */ fws k = new fws(180, 180);
    public static final /* enum */ fws l = new fws(180, 270);
    public static final /* enum */ fws m = new fws(270, 0);
    public static final /* enum */ fws n = new fws(270, 90);
    public static final /* enum */ fws o = new fws(270, 180);
    public static final /* enum */ fws p = new fws(270, 270);
    private static final int q = 360;
    private static final Map<Integer, fws> r;
    private final j s;
    private final h t;
    private final int u;
    private static final /* synthetic */ fws[] v;

    public static fws[] values() {
        return (fws[])v.clone();
    }

    public static fws valueOf(String $$0) {
        return Enum.valueOf(fws.class, $$0);
    }

    private static int b(int $$0, int $$1) {
        return $$0 * 360 + $$1;
    }

    private fws(int $$0, int $$1) {
        this.u = fws.b($$0, $$1);
        Quaternionf $$2 = new Quaternionf().rotateYXZ((float)(-$$1) * ((float)Math.PI / 180), (float)(-$$0) * ((float)Math.PI / 180), 0.0f);
        h $$3 = h.a;
        for (int $$4 = 0; $$4 < $$1; $$4 += 90) {
            $$3 = $$3.a(h.u);
        }
        for (int $$5 = 0; $$5 < $$0; $$5 += 90) {
            $$3 = $$3.a(h.s);
        }
        this.s = new j(null, $$2, null, null);
        this.t = $$3;
    }

    @Override
    public j b() {
        return this.s;
    }

    public static fws a(int $$0, int $$1) {
        return r.get(fws.b(apa.b($$0, 360), apa.b($$1, 360)));
    }

    public h a() {
        return this.t;
    }

    private static /* synthetic */ fws[] d() {
        return new fws[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
    }

    static {
        v = fws.d();
        r = Arrays.stream(fws.values()).collect(Collectors.toMap($$0 -> $$0.u, $$0 -> $$0));
    }
}

