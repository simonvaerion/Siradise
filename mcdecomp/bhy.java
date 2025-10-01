/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class bhy
extends bhr<bta> {
    private static final int c = 60;
    private static final int d = 100;
    private int e;

    public bhy() {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.m, (Object)((Object)bpc.b)), 100);
    }

    @Override
    protected boolean a(aif $$0, bta $$1) {
        return $$1.al() == bgl.a;
    }

    @Override
    protected boolean a(aif $$0, bta $$1, long $$2) {
        return this.e < 60;
    }

    @Override
    protected void b(aif $$0, bta $$1, long $$2) {
        if ($$1.aY() || $$1.bi()) {
            return;
        }
        $$1.b(bgl.i);
        this.e = 0;
    }

    @Override
    protected void c(aif $$0, bta $$1, long $$2) {
        $$1.b(bgl.a);
    }

    @Override
    protected void d(aif $$0, bta $$1, long $$2) {
        ++this.e;
    }

    @Override
    protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
        this.c(aif2, (bta)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void c(aif aif2, bfz bfz2, long l2) {
        this.d(aif2, (bta)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.b(aif2, (bta)bfz2, l2);
    }
}

