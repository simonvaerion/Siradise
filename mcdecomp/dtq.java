/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Optional;

public class dtq
extends dsa {
    public static final Codec<dtq> d = dtq.a(dtq::new);

    public dtq(dsa.c $$0) {
        super($$0);
    }

    @Override
    public Optional<dsa.b> a(dsa.a $$0) {
        cvz $$1 = cvz.a($$0.f());
        gu $$2 = this.a($$0, $$1);
        if ($$2.v() < 60) {
            return Optional.empty();
        }
        return Optional.of(new dsa.b($$2, $$3 -> this.a((dss)$$3, $$2, $$1, $$0)));
    }

    private void a(dss $$0, gu $$1, cvz $$2, dsa.a $$3) {
        ArrayList $$4 = Lists.newArrayList();
        dtp.a($$3.e(), $$1, $$2, $$4, $$3.f());
        $$4.forEach($$0::a);
    }

    @Override
    public dsj<?> e() {
        return dsj.c;
    }
}

