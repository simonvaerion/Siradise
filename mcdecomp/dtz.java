/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class dtz
extends dsa {
    public static final bcl<cnw.c> d = bcl.a((bcj[])new cnw.c[]{new cnw.c(bfn.i, 10, 2, 3), new cnw.c(bfn.bs, 5, 4, 4), new cnw.c(bfn.bl, 8, 5, 5), new cnw.c(bfn.aJ, 2, 5, 5), new cnw.c(bfn.al, 3, 4, 4)});
    public static final Codec<dtz> e = dtz.a(dtz::new);

    public dtz(dsa.c $$0) {
        super($$0);
    }

    @Override
    public Optional<dsa.b> a(dsa.a $$0) {
        clt $$12 = $$0.h();
        gu $$2 = new gu($$12.d(), 64, $$12.e());
        return Optional.of(new dsa.b($$2, $$1 -> dtz.a($$1, $$0)));
    }

    private static void a(dss $$0, dsa.a $$1) {
        dty.q $$2 = new dty.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
        $$0.a($$2);
        $$2.a($$2, $$0, $$1.f());
        List<dse> $$3 = $$2.d;
        while (!$$3.isEmpty()) {
            int $$4 = $$1.f().a($$3.size());
            dse $$5 = $$3.remove($$4);
            $$5.a($$2, $$0, $$1.f());
        }
        $$0.a($$1.f(), 48, 70);
    }

    @Override
    public dsj<?> e() {
        return dsj.d;
    }
}

