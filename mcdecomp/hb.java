/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public final class hb
extends Enum<hb> {
    public static final /* enum */ hb a = new hb(ha.c);
    public static final /* enum */ hb b = new hb(ha.c, ha.f);
    public static final /* enum */ hb c = new hb(ha.f);
    public static final /* enum */ hb d = new hb(ha.d, ha.f);
    public static final /* enum */ hb e = new hb(ha.d);
    public static final /* enum */ hb f = new hb(ha.d, ha.e);
    public static final /* enum */ hb g = new hb(ha.e);
    public static final /* enum */ hb h = new hb(ha.c, ha.e);
    private final Set<ha> i;
    private final hz j;
    private static final /* synthetic */ hb[] k;

    public static hb[] values() {
        return (hb[])k.clone();
    }

    public static hb valueOf(String $$0) {
        return Enum.valueOf(hb.class, $$0);
    }

    private hb(ha ... $$0) {
        this.i = Sets.immutableEnumSet(Arrays.asList($$0));
        this.j = new hz(0, 0, 0);
        for (ha $$1 : $$0) {
            this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
        }
    }

    public Set<ha> a() {
        return this.i;
    }

    public int b() {
        return this.j.u();
    }

    public int c() {
        return this.j.w();
    }

    private static /* synthetic */ hb[] d() {
        return new hb[]{a, b, c, d, e, f, g, h};
    }

    static {
        k = hb.d();
    }
}

