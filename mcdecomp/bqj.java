/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;

public class bqj
extends bpz {
    private static final ImmutableMap<bfn<?>, Float> a = ImmutableMap.builder().put(bfn.y, (Object)Float.valueOf(8.0f)).put(bfn.G, (Object)Float.valueOf(12.0f)).put(bfn.Z, (Object)Float.valueOf(8.0f)).put(bfn.aa, (Object)Float.valueOf(12.0f)).put(bfn.ay, (Object)Float.valueOf(15.0f)).put(bfn.aD, (Object)Float.valueOf(12.0f)).put(bfn.be, (Object)Float.valueOf(8.0f)).put(bfn.bg, (Object)Float.valueOf(10.0f)).put(bfn.bo, (Object)Float.valueOf(10.0f)).put(bfn.bp, (Object)Float.valueOf(8.0f)).put(bfn.br, (Object)Float.valueOf(8.0f)).build();

    @Override
    protected boolean a(bfz $$0, bfz $$1) {
        return this.b($$1) && this.e($$0, $$1);
    }

    private boolean e(bfz $$0, bfz $$1) {
        float $$2 = ((Float)a.get($$1.ae())).floatValue();
        return $$1.f((bfj)$$0) <= (double)($$2 * $$2);
    }

    @Override
    protected bpb<bfz> b() {
        return bpb.A;
    }

    private boolean b(bfz $$0) {
        return a.containsKey($$0.ae());
    }
}

