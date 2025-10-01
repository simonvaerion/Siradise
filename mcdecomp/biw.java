/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class biw
extends bhr<bgb> {
    public biw(int $$0, int $$1) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.n, (Object)((Object)bpc.a)), $$0, $$1);
    }

    @Override
    protected boolean a(aif $$0, bgb $$12, long $$2) {
        return $$12.dK().c(bpb.n).filter($$1 -> $$1.a($$12)).isPresent();
    }

    @Override
    protected void b(aif $$0, bgb $$1, long $$2) {
        $$1.dK().b(bpb.n);
    }

    @Override
    protected void c(aif $$0, bgb $$12, long $$2) {
        $$12.dK().c(bpb.n).ifPresent($$1 -> $$12.E().a($$1.a()));
    }
}

