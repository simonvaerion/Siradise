/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.booleans.BooleanArrayList
 *  it.unimi.dsi.fastutil.booleans.BooleanList
 *  javax.annotation.Nullable
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import it.unimi.dsi.fastutil.booleans.BooleanList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;

public final class h
extends Enum<h>
implements apr {
    public static final /* enum */ h a = new h("identity", i.a, false, false, false);
    public static final /* enum */ h b = new h("rot_180_face_xy", i.a, true, true, false);
    public static final /* enum */ h c = new h("rot_180_face_xz", i.a, true, false, true);
    public static final /* enum */ h d = new h("rot_180_face_yz", i.a, false, true, true);
    public static final /* enum */ h e = new h("rot_120_nnn", i.d, false, false, false);
    public static final /* enum */ h f = new h("rot_120_nnp", i.e, true, false, true);
    public static final /* enum */ h g = new h("rot_120_npn", i.e, false, true, true);
    public static final /* enum */ h h = new h("rot_120_npp", i.d, true, false, true);
    public static final /* enum */ h i = new h("rot_120_pnn", i.e, true, true, false);
    public static final /* enum */ h j = new h("rot_120_pnp", i.d, true, true, false);
    public static final /* enum */ h k = new h("rot_120_ppn", i.d, false, true, true);
    public static final /* enum */ h l = new h("rot_120_ppp", i.e, false, false, false);
    public static final /* enum */ h m = new h("rot_180_edge_xy_neg", i.b, true, true, true);
    public static final /* enum */ h n = new h("rot_180_edge_xy_pos", i.b, false, false, true);
    public static final /* enum */ h o = new h("rot_180_edge_xz_neg", i.f, true, true, true);
    public static final /* enum */ h p = new h("rot_180_edge_xz_pos", i.f, false, true, false);
    public static final /* enum */ h q = new h("rot_180_edge_yz_neg", i.c, true, true, true);
    public static final /* enum */ h r = new h("rot_180_edge_yz_pos", i.c, true, false, false);
    public static final /* enum */ h s = new h("rot_90_x_neg", i.c, false, false, true);
    public static final /* enum */ h t = new h("rot_90_x_pos", i.c, false, true, false);
    public static final /* enum */ h u = new h("rot_90_y_neg", i.f, true, false, false);
    public static final /* enum */ h v = new h("rot_90_y_pos", i.f, false, false, true);
    public static final /* enum */ h w = new h("rot_90_z_neg", i.b, false, true, false);
    public static final /* enum */ h x = new h("rot_90_z_pos", i.b, true, false, false);
    public static final /* enum */ h y = new h("inversion", i.a, true, true, true);
    public static final /* enum */ h z = new h("invert_x", i.a, true, false, false);
    public static final /* enum */ h A = new h("invert_y", i.a, false, true, false);
    public static final /* enum */ h B = new h("invert_z", i.a, false, false, true);
    public static final /* enum */ h C = new h("rot_60_ref_nnn", i.e, true, true, true);
    public static final /* enum */ h D = new h("rot_60_ref_nnp", i.d, true, false, false);
    public static final /* enum */ h E = new h("rot_60_ref_npn", i.d, false, false, true);
    public static final /* enum */ h F = new h("rot_60_ref_npp", i.e, false, false, true);
    public static final /* enum */ h G = new h("rot_60_ref_pnn", i.d, false, true, false);
    public static final /* enum */ h H = new h("rot_60_ref_pnp", i.e, true, false, false);
    public static final /* enum */ h I = new h("rot_60_ref_ppn", i.e, false, true, false);
    public static final /* enum */ h J = new h("rot_60_ref_ppp", i.d, true, true, true);
    public static final /* enum */ h K = new h("swap_xy", i.b, false, false, false);
    public static final /* enum */ h L = new h("swap_yz", i.c, false, false, false);
    public static final /* enum */ h M = new h("swap_xz", i.f, false, false, false);
    public static final /* enum */ h N = new h("swap_neg_xy", i.b, true, true, false);
    public static final /* enum */ h O = new h("swap_neg_yz", i.c, false, true, true);
    public static final /* enum */ h P = new h("swap_neg_xz", i.f, true, false, true);
    public static final /* enum */ h Q = new h("rot_90_ref_x_neg", i.c, true, false, true);
    public static final /* enum */ h R = new h("rot_90_ref_x_pos", i.c, true, true, false);
    public static final /* enum */ h S = new h("rot_90_ref_y_neg", i.f, true, true, false);
    public static final /* enum */ h T = new h("rot_90_ref_y_pos", i.f, false, true, true);
    public static final /* enum */ h U = new h("rot_90_ref_z_neg", i.b, false, true, true);
    public static final /* enum */ h V = new h("rot_90_ref_z_pos", i.b, true, false, true);
    private final Matrix3f X;
    private final String Y;
    @Nullable
    private Map<ha, ha> Z;
    private final boolean aa;
    private final boolean ab;
    private final boolean ac;
    private final i ad;
    private static final h[][] ae;
    private static final h[] af;
    private static final /* synthetic */ h[] ag;

    public static h[] values() {
        return (h[])ag.clone();
    }

    public static h valueOf(String $$0) {
        return Enum.valueOf(h.class, $$0);
    }

    private h(String $$0, i $$1, boolean $$2, boolean $$3, boolean $$4) {
        this.Y = $$0;
        this.aa = $$2;
        this.ab = $$3;
        this.ac = $$4;
        this.ad = $$1;
        this.X = new Matrix3f().scaling($$2 ? -1.0f : 1.0f, $$3 ? -1.0f : 1.0f, $$4 ? -1.0f : 1.0f);
        this.X.mul((Matrix3fc)$$1.a());
    }

    private BooleanList d() {
        return new BooleanArrayList(new boolean[]{this.aa, this.ab, this.ac});
    }

    public h a(h $$0) {
        return ae[this.ordinal()][$$0.ordinal()];
    }

    public h a() {
        return af[this.ordinal()];
    }

    public Matrix3f b() {
        return new Matrix3f((Matrix3fc)this.X);
    }

    public String toString() {
        return this.Y;
    }

    @Override
    public String c() {
        return this.Y;
    }

    public ha a(ha $$0) {
        if (this.Z == null) {
            this.Z = Maps.newEnumMap(ha.class);
            ha.a[] $$1 = ha.a.values();
            for (ha $$2 : ha.values()) {
                ha.a $$3 = $$2.o();
                ha.b $$4 = $$2.f();
                ha.a $$5 = $$1[this.ad.a($$3.ordinal())];
                ha.b $$6 = this.a($$5) ? $$4.c() : $$4;
                ha $$7 = ha.a($$5, $$6);
                this.Z.put($$2, $$7);
            }
        }
        return this.Z.get($$0);
    }

    public boolean a(ha.a $$0) {
        switch ($$0) {
            case a: {
                return this.aa;
            }
            case b: {
                return this.ab;
            }
        }
        return this.ac;
    }

    public hc a(hc $$0) {
        return hc.a(this.a($$0.a()), this.a($$0.b()));
    }

    private static /* synthetic */ h[] e() {
        return new h[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V};
    }

    static {
        ag = h.e();
        ae = ac.a(new h[h.values().length][h.values().length], (T $$02) -> {
            Map<Pair, h> $$1 = Arrays.stream(h.values()).collect(Collectors.toMap($$0 -> Pair.of((Object)((Object)$$0.ad), (Object)$$0.d()), $$0 -> $$0));
            for (h $$2 : h.values()) {
                for (h $$3 : h.values()) {
                    BooleanList $$4 = $$2.d();
                    BooleanList $$5 = $$3.d();
                    i $$6 = $$3.ad.a($$2.ad);
                    BooleanArrayList $$7 = new BooleanArrayList(3);
                    for (int $$8 = 0; $$8 < 3; ++$$8) {
                        $$7.add($$4.getBoolean($$8) ^ $$5.getBoolean($$2.ad.a($$8)));
                    }
                    $$02[$$2.ordinal()][$$3.ordinal()] = $$1.get(Pair.of((Object)((Object)$$6), (Object)$$7));
                }
            }
        });
        af = (h[])Arrays.stream(h.values()).map($$0 -> Arrays.stream(h.values()).filter($$1 -> $$0.a((h)$$1) == a).findAny().get()).toArray(h[]::new);
    }
}

