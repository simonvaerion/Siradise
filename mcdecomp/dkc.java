/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Stream;

public class dkc
extends dkd {
    public dkc(Codec<dmz> $$0) {
        super($$0);
    }

    @Override
    protected boolean a(cmn $$0, apf $$1, gu $$2, dcb $$3) {
        if (!this.b($$0, $$1, $$2, $$3)) {
            return false;
        }
        ha $$4 = ha.c.a.a($$1);
        int $$5 = $$1.a(2) + 2;
        List<ha> $$6 = ac.a(Stream.of($$4, $$4.h(), $$4.i()), $$1);
        List<ha> $$7 = $$6.subList(0, $$5);
        block0: for (ha $$8 : $$7) {
            int $$15;
            ha $$14;
            gu.a $$9 = $$2.j();
            int $$10 = $$1.a(2) + 1;
            $$9.c($$8);
            if ($$8 == $$4) {
                ha $$11 = $$4;
                int $$12 = $$1.a(3) + 2;
            } else {
                $$9.c(ha.b);
                ha[] $$13 = new ha[]{$$8, ha.b};
                $$14 = ac.a($$13, $$1);
                $$15 = $$1.a(3) + 3;
            }
            for (int $$16 = 0; $$16 < $$10 && this.b($$0, $$1, $$9, $$3); ++$$16) {
                $$9.c($$14);
            }
            $$9.c($$14.g());
            $$9.c(ha.b);
            for (int $$17 = 0; $$17 < $$15; ++$$17) {
                $$9.c($$4);
                if (!this.b($$0, $$1, $$9, $$3)) continue block0;
                if (!($$1.i() < 0.25f)) continue;
                $$9.c(ha.b);
            }
        }
        return true;
    }
}

