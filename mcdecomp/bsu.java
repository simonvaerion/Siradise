/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class bsu
extends bhr<bss> {
    public bsu() {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.M, (Object)((Object)bpc.a), bpb.y, (Object)((Object)bpc.a)), 200);
    }

    @Override
    protected boolean a(aif $$0, bss $$1) {
        return $$1.aY();
    }

    @Override
    protected boolean a(aif $$0, bss $$1, long $$2) {
        return $$1.aY() && $$1.dK().a(bpb.M);
    }

    @Override
    protected void b(aif $$0, bss $$1, long $$2) {
        bha<bss> $$3 = $$1.dK();
        $$3.b(bpb.m);
        $$3.b(bpb.n);
        $$1.b(new bfa(bfc.j, 200, 0));
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.b(aif2, (bss)bfz2, l2);
    }
}

