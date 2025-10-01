/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 */
import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class flx<S extends czn>
implements crq.b<S, Int2IntFunction> {
    @Override
    public Int2IntFunction a(S $$0, S $$1) {
        return $$2 -> {
            int $$3 = fjv.a($$0.k(), $$0.p());
            int $$4 = fjv.a($$1.k(), $$1.p());
            int $$5 = fjw.a($$3);
            int $$6 = fjw.a($$4);
            int $$7 = fjw.b($$3);
            int $$8 = fjw.b($$4);
            return fjw.a(Math.max($$5, $$6), Math.max($$7, $$8));
        };
    }

    @Override
    public Int2IntFunction a(S $$02) {
        return $$0 -> $$0;
    }

    public Int2IntFunction a() {
        return $$0 -> $$0;
    }

    @Override
    public /* synthetic */ Object b() {
        return this.a();
    }
}

