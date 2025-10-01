/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dxv {
    private static final float a = 1.5f;
    private final dxr[] b = new dxr[32];
    private final int c;
    private final dxs d;
    private static final boolean e = false;
    private final dxo f = new dxo();

    public dxv(dxs $$0, int $$1) {
        this.d = $$0;
        this.c = $$1;
    }

    @Nullable
    public dxt a(cmz $$02, bgb $$1, Set<gu> $$2, float $$3, int $$4, float $$5) {
        this.f.a();
        this.d.a($$02, $$1);
        dxr $$6 = this.d.a();
        if ($$6 == null) {
            return null;
        }
        Map<dxx, gu> $$7 = $$2.stream().collect(Collectors.toMap($$0 -> this.d.a($$0.u(), $$0.v(), $$0.w()), Function.identity()));
        dxt $$8 = this.a($$02.a(), $$6, $$7, $$3, $$4, $$5);
        this.d.b();
        return $$8;
    }

    @Nullable
    private dxt a(ban $$0, dxr $$12, Map<dxx, gu> $$2, float $$3, int $$4, float $$5) {
        $$0.a("find_path");
        $$0.a(bbr.a);
        Set<dxx> $$6 = $$2.keySet();
        $$12.e = 0.0f;
        $$12.g = $$12.f = this.a($$12, $$6);
        this.f.a();
        this.f.a($$12);
        ImmutableSet $$7 = ImmutableSet.of();
        int $$8 = 0;
        HashSet $$9 = Sets.newHashSetWithExpectedSize((int)$$6.size());
        int $$10 = (int)((float)this.c * $$5);
        while (!this.f.e() && ++$$8 < $$10) {
            dxr $$11 = this.f.c();
            $$11.i = true;
            for (dxx $$122 : $$6) {
                if (!($$11.d($$122) <= (float)$$4)) continue;
                $$122.e();
                $$9.add($$122);
            }
            if (!$$9.isEmpty()) break;
            if ($$11.a($$12) >= $$3) continue;
            int $$13 = this.d.a(this.b, $$11);
            for (int $$14 = 0; $$14 < $$13; ++$$14) {
                dxr $$15 = this.b[$$14];
                float $$16 = this.a($$11, $$15);
                $$15.j = $$11.j + $$16;
                float $$17 = $$11.e + $$16 + $$15.k;
                if (!($$15.j < $$3) || $$15.c() && !($$17 < $$15.e)) continue;
                $$15.h = $$11;
                $$15.e = $$17;
                $$15.f = this.a($$15, $$6) * 1.5f;
                if ($$15.c()) {
                    this.f.a($$15, $$15.e + $$15.f);
                    continue;
                }
                $$15.g = $$15.e + $$15.f;
                this.f.a($$15);
            }
        }
        Optional<dxt> $$18 = !$$9.isEmpty() ? $$9.stream().map($$1 -> this.a($$1.d(), (gu)$$2.get($$1), true)).min(Comparator.comparingInt(dxt::e)) : $$6.stream().map($$1 -> this.a($$1.d(), (gu)$$2.get($$1), false)).min(Comparator.comparingDouble(dxt::n).thenComparingInt(dxt::e));
        $$0.c();
        if (!$$18.isPresent()) {
            return null;
        }
        dxt $$19 = $$18.get();
        return $$19;
    }

    protected float a(dxr $$0, dxr $$1) {
        return $$0.a($$1);
    }

    private float a(dxr $$0, Set<dxx> $$1) {
        float $$2 = Float.MAX_VALUE;
        for (dxx $$3 : $$1) {
            float $$4 = $$0.a($$3);
            $$3.a($$4, $$0);
            $$2 = Math.min($$4, $$2);
        }
        return $$2;
    }

    private dxt a(dxr $$0, gu $$1, boolean $$2) {
        ArrayList $$3 = Lists.newArrayList();
        dxr $$4 = $$0;
        $$3.add(0, $$4);
        while ($$4.h != null) {
            $$4 = $$4.h;
            $$3.add(0, $$4);
        }
        return new dxt($$3, $$1, $$2);
    }
}

