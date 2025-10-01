/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

class fmq {
    private final Map<gu, czn> a;
    @Nullable
    private final List<deq<dcb>> b;
    private final boolean c;
    private final dei d;

    fmq(dei $$0) {
        this.d = $$0;
        this.c = $$0.F().af();
        this.a = ImmutableMap.copyOf($$0.G());
        if ($$0 instanceof dee) {
            this.b = null;
        } else {
            dej[] $$1 = $$0.d();
            this.b = new ArrayList<deq<dcb>>($$1.length);
            for (dej $$2 : $$1) {
                this.b.add($$2.c() ? null : $$2.h().d());
            }
        }
    }

    @Nullable
    public czn a(gu $$0) {
        return this.a.get($$0);
    }

    public dcb b(gu $$0) {
        int $$1 = $$0.u();
        int $$2 = $$0.v();
        int $$3 = $$0.w();
        if (this.c) {
            dcb $$4 = null;
            if ($$2 == 60) {
                $$4 = cpo.hW.n();
            }
            if ($$2 == 70) {
                $$4 = dhb.a($$1, $$3);
            }
            return $$4 == null ? cpo.a.n() : $$4;
        }
        if (this.b == null) {
            return cpo.a.n();
        }
        try {
            deq<dcb> $$6;
            int $$5 = this.d.e($$2);
            if ($$5 >= 0 && $$5 < this.b.size() && ($$6 = this.b.get($$5)) != null) {
                return $$6.a($$1 & 0xF, $$2 & 0xF, $$3 & 0xF);
            }
            return cpo.a.n();
        }
        catch (Throwable $$7) {
            o $$8 = o.a($$7, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a((cmo)this.d, $$1, $$2, $$3));
            throw new y($$8);
        }
    }
}

