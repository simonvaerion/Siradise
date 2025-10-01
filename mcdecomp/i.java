/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3f
 */
import java.util.Arrays;
import org.joml.Matrix3f;

public final class i
extends Enum<i> {
    public static final /* enum */ i a = new i(0, 1, 2);
    public static final /* enum */ i b = new i(1, 0, 2);
    public static final /* enum */ i c = new i(0, 2, 1);
    public static final /* enum */ i d = new i(1, 2, 0);
    public static final /* enum */ i e = new i(2, 0, 1);
    public static final /* enum */ i f = new i(2, 1, 0);
    private final int[] g;
    private final Matrix3f h;
    private static final int i = 3;
    private static final i[][] j;
    private static final /* synthetic */ i[] k;

    public static i[] values() {
        return (i[])k.clone();
    }

    public static i valueOf(String $$0) {
        return Enum.valueOf(i.class, $$0);
    }

    private i(int $$0, int $$1, int $$2) {
        this.g = new int[]{$$0, $$1, $$2};
        this.h = new Matrix3f();
        this.h.set(this.a(0), 0, 1.0f);
        this.h.set(this.a(1), 1, 1.0f);
        this.h.set(this.a(2), 2, 1.0f);
    }

    public i a(i $$0) {
        return j[this.ordinal()][$$0.ordinal()];
    }

    public int a(int $$0) {
        return this.g[$$0];
    }

    public Matrix3f a() {
        return this.h;
    }

    private static /* synthetic */ i[] b() {
        return new i[]{a, b, c, d, e, f};
    }

    static {
        k = i.b();
        j = ac.a(new i[i.values().length][i.values().length], (T $$0) -> {
            for (i $$12 : i.values()) {
                for (i $$2 : i.values()) {
                    i $$5;
                    int[] $$3 = new int[3];
                    for (int $$4 = 0; $$4 < 3; ++$$4) {
                        $$3[$$4] = $$12.g[$$2.g[$$4]];
                    }
                    $$0[$$12.ordinal()][$$2.ordinal()] = $$5 = Arrays.stream(i.values()).filter($$1 -> Arrays.equals($$1.g, $$3)).findFirst().get();
                }
            }
        });
    }
}

