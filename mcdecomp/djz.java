/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.stream.IntStream;

public class djz
extends dko<dmz> {
    public djz(Codec<dmz> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dmz> $$0) {
        apf $$1 = $$0.d();
        cng $$2 = $$0.b();
        clt $$3 = new clt($$0.e());
        IntArrayList $$4 = ac.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
        IntArrayList $$5 = ac.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
        gu.a $$6 = new gu.a();
        for (Integer $$7 : $$4) {
            for (Integer $$8 : $$5) {
                $$6.d($$7, 0, $$8);
                gu $$9 = $$2.a(dhk.a.f, (gu)$$6);
                if (!$$2.t($$9) && !$$2.a_($$9).k($$2, $$9).b()) continue;
                $$2.a($$9, cpo.cv.n(), 2);
                daq.a($$2, $$1, $$9, dzg.b);
                dcb $$10 = cpo.cp.n();
                for (ha $$11 : ha.c.a) {
                    gu $$12 = $$9.a($$11);
                    if (!$$10.a($$2, $$12)) continue;
                    $$2.a($$12, $$10, 2);
                }
                return true;
            }
        }
        return false;
    }
}

