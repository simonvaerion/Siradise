/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class bpy<T extends bfz>
extends bqf<T> {
    @Override
    protected void a(aif $$0, T $$12) {
        eed $$2 = ((bfj)$$12).cE().c(this.b(), this.c(), this.b());
        List<bfz> $$3 = $$0.a(bfz.class, $$2, $$1 -> $$1 != $$12 && $$1.bs());
        $$3.sort(Comparator.comparingDouble(arg_0 -> $$12.f(arg_0)));
        bha<?> $$4 = ((bfz)$$12).dK();
        $$4.a(bpb.g, $$3);
        $$4.a(bpb.h, new bpd((bfz)$$12, $$3));
    }

    protected int b() {
        return 16;
    }

    protected int c() {
        return 16;
    }

    @Override
    public Set<bpb<?>> a() {
        return ImmutableSet.of(bpb.g, bpb.h);
    }
}

