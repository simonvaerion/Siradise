/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.Optional;

public class dtm
extends dsa {
    public static final Codec<dtm> d = dtm.a(dtm::new);

    public dtm(dsa.c $$0) {
        super($$0);
    }

    @Override
    public Optional<dsa.b> a(dsa.a $$0) {
        return dtm.a($$0, dhk.a.c, $$1 -> dtm.a($$1, $$0));
    }

    private static void a(dss $$0, dsa.a $$1) {
        gu $$2 = new gu($$1.h().a(9), 90, $$1.h().b(9));
        $$0.a(new dtl.a($$2));
    }

    @Override
    public dsj<?> e() {
        return dsj.a;
    }
}

