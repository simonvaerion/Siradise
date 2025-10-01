/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Set;

public final class aqc
extends Enum<aqc> {
    public static final /* enum */ aqc a = new aqc(avw.a);
    public static final /* enum */ aqc b = new aqc(avw.b);
    public static final /* enum */ aqc c = new aqc(avw.c);
    public static final /* enum */ aqc d = new aqc(avw.d);
    public static final /* enum */ aqc e = new aqc(avw.e);
    public static final /* enum */ aqc f = new aqc(avw.f);
    public static final /* enum */ aqc g = new aqc(avw.g);
    public static final /* enum */ aqc h = new aqc(avw.h);
    public static final /* enum */ aqc i = new aqc(avw.i);
    public static final /* enum */ aqc j = new aqc(avw.j);
    public static final /* enum */ aqc k = new aqc(avw.B);
    public static final /* enum */ aqc l = new aqc(avw.k);
    public static final Set<DSL.TypeReference> m;
    private final DSL.TypeReference n;
    private static final /* synthetic */ aqc[] o;

    public static aqc[] values() {
        return (aqc[])o.clone();
    }

    public static aqc valueOf(String $$0) {
        return Enum.valueOf(aqc.class, $$0);
    }

    private aqc(DSL.TypeReference $$0) {
        this.n = $$0;
    }

    private static int a() {
        return aa.b().d().c();
    }

    public <T> Dynamic<T> a(DataFixer $$0, Dynamic<T> $$1, int $$2, int $$3) {
        return $$0.update(this.n, $$1, $$2, $$3);
    }

    public <T> Dynamic<T> a(DataFixer $$0, Dynamic<T> $$1, int $$2) {
        return this.a($$0, $$1, $$2, aqc.a());
    }

    public qr a(DataFixer $$0, qr $$1, int $$2, int $$3) {
        return (qr)this.a($$0, new Dynamic((DynamicOps)rc.a, (Object)$$1), $$2, $$3).getValue();
    }

    public qr a(DataFixer $$0, qr $$1, int $$2) {
        return this.a($$0, $$1, $$2, aqc.a());
    }

    private static /* synthetic */ aqc[] b() {
        return new aqc[]{a, b, c, d, e, f, g, h, i, j, k, l};
    }

    static {
        o = aqc.b();
        m = Set.of(aqc.a.n);
    }
}

