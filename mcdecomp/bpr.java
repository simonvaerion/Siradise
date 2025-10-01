/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class bpr
extends bpz {
    public static final float a = 10.0f;

    @Override
    protected boolean a(bfz $$0, bfz $$1) {
        if (!$$0.dK().a(bpb.T) && bqf.c($$0, $$1) && bta.l($$1) && !this.e($$0, $$1)) {
            return $$1.a((bfj)$$0, 10.0);
        }
        return false;
    }

    private boolean e(bfz $$0, bfz $$1) {
        List $$2 = $$0.dK().c(bpb.Z).orElseGet(ArrayList::new);
        return $$2.contains($$1.ct());
    }

    @Override
    protected bpb<bfz> b() {
        return bpb.B;
    }
}

