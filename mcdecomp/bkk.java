/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class bkk
extends bhr<bgb> {
    private final float c;

    public bkk(float $$0) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of());
        this.c = $$0;
    }

    @Override
    protected boolean a(aif $$0, bgb $$1) {
        return $$1.aV() && $$1.b(anb.a) > $$1.dc() || $$1.bi();
    }

    @Override
    protected boolean a(aif $$0, bgb $$1, long $$2) {
        return this.a($$0, $$1);
    }

    @Override
    protected void b(aif $$0, bgb $$1, long $$2) {
        if ($$1.ec().i() < this.c) {
            $$1.I().a();
        }
    }

    @Override
    protected /* synthetic */ void c(aif aif2, bfz bfz2, long l2) {
        this.b(aif2, (bgb)bfz2, l2);
    }
}

