/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class dwn
extends dws<a> {
    protected dwn(del $$0) {
        super(cmv.b, $$0, new a((Long2ObjectOpenHashMap<ded>)new Long2ObjectOpenHashMap()));
    }

    @Override
    protected int a(long $$0) {
        long $$1 = hx.e($$0);
        ded $$2 = this.a($$1, false);
        if ($$2 == null) {
            return 0;
        }
        return $$2.a(hx.b(gu.a($$0)), hx.b(gu.b($$0)), hx.b(gu.c($$0)));
    }

    protected static final class a
    extends dwp<a> {
        public a(Long2ObjectOpenHashMap<ded> $$0) {
            super($$0);
        }

        public a a() {
            return new a((Long2ObjectOpenHashMap<ded>)this.a.clone());
        }

        @Override
        public /* synthetic */ dwp b() {
            return this.a();
        }
    }
}

