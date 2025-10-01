/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class bis
extends bhr<bgb> {
    public static final int c = 100;
    private final bdi d;
    private final amg e;

    public bis(bdi $$0, amg $$1) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.n, (Object)((Object)bpc.c), bpb.S, (Object)((Object)bpc.a)), 100);
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    protected boolean a(aif $$0, bgb $$1, long $$2) {
        return !$$1.ay();
    }

    @Override
    protected void b(aif $$0, bgb $$1, long $$2) {
        $$1.p(true);
        $$1.b(bgl.g);
    }

    @Override
    protected void c(aif $$0, bgb $$1, long $$2) {
        if ($$1.ay()) {
            $$1.f($$1.dl().d(0.1f, 1.0, 0.1f));
            $$0.a(null, $$1, this.e, ami.g, 2.0f, 1.0f);
        }
        $$1.p(false);
        $$1.b(bgl.a);
        $$1.dK().b(bpb.S);
        $$1.dK().a(bpb.R, Integer.valueOf(this.d.a($$0.z)));
    }

    @Override
    protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
        this.c(aif2, (bgb)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.b(aif2, (bgb)bfz2, l2);
    }
}

