/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;

public class dkf
extends dkd {
    public dkf(Codec<dmz> $$0) {
        super($$0);
    }

    @Override
    protected boolean a(cmn $$0, apf $$1, gu $$2, dcb $$3) {
        gu.a $$4 = $$2.j();
        int $$5 = $$1.a(3) + 1;
        for (int $$6 = 0; $$6 < $$5; ++$$6) {
            if (!this.b($$0, $$1, $$4, $$3)) {
                return true;
            }
            $$4.c(ha.b);
        }
        gu $$7 = $$4.i();
        int $$8 = $$1.a(3) + 2;
        List<ha> $$9 = ha.c.a.c($$1);
        List<ha> $$10 = $$9.subList(0, $$8);
        for (ha $$11 : $$10) {
            $$4.g($$7);
            $$4.c($$11);
            int $$12 = $$1.a(5) + 2;
            int $$13 = 0;
            for (int $$14 = 0; $$14 < $$12 && this.b($$0, $$1, $$4, $$3); ++$$14) {
                $$4.c(ha.b);
                if ($$14 != 0 && (++$$13 < 2 || !($$1.i() < 0.25f))) continue;
                $$4.c($$11);
                $$13 = 0;
            }
        }
        return true;
    }
}

