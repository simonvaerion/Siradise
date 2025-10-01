/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class bin {
    public static bhs<bgi> a(float $$0) {
        return bld.a($$12 -> $$12.group($$12.c(bpb.m)).apply((Applicative)$$12, $$1 -> ($$22, $$3, $$4) -> {
            if ($$22.g($$3.di())) {
                return false;
            }
            gu $$5 = $$3.di();
            List $$6 = gu.b($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(gu::i).collect(Collectors.toList());
            Collections.shuffle($$6);
            $$6.stream().filter($$1 -> !$$22.g((gu)$$1)).filter($$2 -> $$22.a((gu)$$2, (bfj)$$3)).filter($$2 -> $$22.g($$3)).findFirst().ifPresent($$2 -> $$1.a(new bpe((gu)$$2, $$0, 0)));
            return true;
        }));
    }
}

