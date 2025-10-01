/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class vq
extends Record
implements uo<ur> {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final Optional<eei> e;

    public vq(bfj $$0, ben $$1) {
        this($$0.af(), $$0.dI().B_().d(jc.p).a($$1.j()), $$1.d() != null ? $$1.d().af() : -1, $$1.c() != null ? $$1.c().af() : -1, Optional.ofNullable($$1.i()));
    }

    public vq(sf $$02) {
        this($$02.m(), $$02.m(), vq.b($$02), vq.b($$02), $$02.b($$0 -> new eei($$0.readDouble(), $$0.readDouble(), $$0.readDouble())));
    }

    public vq(int $$0, int $$1, int $$2, int $$3, Optional<eei> $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
    }

    private static void a(sf $$0, int $$1) {
        $$0.d($$1 + 1);
    }

    private static int b(sf $$0) {
        return $$0.m() - 1;
    }

    @Override
    public void a(sf $$02) {
        $$02.d(this.a);
        $$02.d(this.b);
        vq.a($$02, this.c);
        vq.a($$02, this.d);
        $$02.a(this.e, ($$0, $$1) -> {
            $$0.writeDouble($$1.a());
            $$0.writeDouble($$1.b());
            $$0.writeDouble($$1.c());
        });
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    public ben a(cmm $$0) {
        he $$1 = $$0.B_().d(jc.p).c(this.b).get();
        if (this.e.isPresent()) {
            return new ben((he<bep>)$$1, this.e.get());
        }
        bfj $$2 = $$0.a(this.c);
        bfj $$3 = $$0.a(this.d);
        return new ben($$1, $$3, $$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{vq.class, "entityId;sourceTypeId;sourceCauseId;sourceDirectId;sourcePosition", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vq.class, "entityId;sourceTypeId;sourceCauseId;sourceDirectId;sourcePosition", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vq.class, "entityId;sourceTypeId;sourceCauseId;sourceDirectId;sourcePosition", "a", "b", "c", "d", "e"}, this, $$0);
    }

    public int a() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public Optional<eei> f() {
        return this.e;
    }
}

