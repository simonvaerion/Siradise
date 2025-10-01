/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class fms {
    private final Long2ObjectMap<a> a = new Long2ObjectOpenHashMap();

    @Nullable
    public fmr a(cmm $$0, gu $$12, gu $$2, int $$3) {
        int $$4 = hx.a($$12.u() - $$3);
        int $$5 = hx.a($$12.w() - $$3);
        int $$6 = hx.a($$2.u() + $$3);
        int $$7 = hx.a($$2.w() + $$3);
        a[][] $$8 = new a[$$6 - $$4 + 1][$$7 - $$5 + 1];
        for (int $$9 = $$4; $$9 <= $$6; ++$$9) {
            for (int $$10 = $$5; $$10 <= $$7; ++$$10) {
                $$8[$$9 - $$4][$$10 - $$5] = (a)this.a.computeIfAbsent(clt.c($$9, $$10), $$1 -> new a($$0.d(clt.a($$1), clt.b($$1))));
            }
        }
        if (fms.a($$12, $$2, $$4, $$5, $$8)) {
            return null;
        }
        fmq[][] $$11 = new fmq[$$6 - $$4 + 1][$$7 - $$5 + 1];
        for (int $$122 = $$4; $$122 <= $$6; ++$$122) {
            for (int $$13 = $$5; $$13 <= $$7; ++$$13) {
                $$11[$$122 - $$4][$$13 - $$5] = $$8[$$122 - $$4][$$13 - $$5].b();
            }
        }
        return new fmr($$0, $$4, $$5, $$11);
    }

    private static boolean a(gu $$0, gu $$1, int $$2, int $$3, a[][] $$4) {
        int $$5 = hx.a($$0.u());
        int $$6 = hx.a($$0.w());
        int $$7 = hx.a($$1.u());
        int $$8 = hx.a($$1.w());
        for (int $$9 = $$5; $$9 <= $$7; ++$$9) {
            for (int $$10 = $$6; $$10 <= $$8; ++$$10) {
                dei $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
                if ($$11.a($$0.v(), $$1.v())) continue;
                return false;
            }
        }
        return true;
    }

    static final class a {
        private final dei a;
        @Nullable
        private fmq b;

        a(dei $$0) {
            this.a = $$0;
        }

        public dei a() {
            return this.a;
        }

        public fmq b() {
            if (this.b == null) {
                this.b = new fmq(this.a);
            }
            return this.b;
        }
    }
}

