/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bpu
extends bqf<bfz> {
    @Override
    public Set<bpb<?>> a() {
        return ImmutableSet.of(bpb.x, bpb.y);
    }

    @Override
    protected void a(aif $$0, bfz $$1) {
        bha<?> $$22 = $$1.dK();
        ben $$3 = $$1.et();
        if ($$3 != null) {
            $$22.a(bpb.x, $$1.et());
            bfj $$4 = $$3.d();
            if ($$4 instanceof bfz) {
                $$22.a(bpb.y, (bfz)$$4);
            }
        } else {
            $$22.b(bpb.x);
        }
        $$22.c(bpb.y).ifPresent($$2 -> {
            if (!$$2.bs() || $$2.dI() != $$0) {
                $$22.b(bpb.y);
            }
        });
    }
}

