/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bhx
extends bhr<bfz> {
    private final bpb<Integer> c;

    public bhx(bpb<Integer> $$0) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of($$0, (Object)((Object)bpc.a)));
        this.c = $$0;
    }

    private Optional<Integer> b(bfz $$0) {
        return $$0.dK().c(this.c);
    }

    @Override
    protected boolean a(long $$0) {
        return false;
    }

    @Override
    protected boolean a(aif $$0, bfz $$1, long $$2) {
        Optional<Integer> $$3 = this.b($$1);
        return $$3.isPresent() && $$3.get() > 0;
    }

    @Override
    protected void c(aif $$0, bfz $$1, long $$2) {
        Optional<Integer> $$3 = this.b($$1);
        $$1.dK().a(this.c, Integer.valueOf($$3.get() - 1));
    }

    @Override
    protected void b(aif $$0, bfz $$1, long $$2) {
        $$1.dK().b(this.c);
    }
}

