/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dme
extends dko<dmz> {
    public dme(Codec<dmz> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dmz> $$0) {
        cng $$1 = $$0.b();
        gu $$2 = $$0.e();
        $$0.f();
        if (!$$1.t($$2)) {
            return false;
        }
        for (ha $$3 : ha.values()) {
            if ($$3 == ha.a || !cyh.a((cls)$$1, $$2.a($$3), $$3)) continue;
            $$1.a($$2, (dcb)cpo.ff.n().a(cyh.a($$3), true), 2);
            return true;
        }
        return false;
    }
}

