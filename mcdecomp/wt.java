/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import javax.annotation.Nullable;

public record wt(UUID a, int b, @Nullable th c, to.a d, @Nullable sw e, sz f, ss.b g) implements uo<ur>
{
    private final int b;
    @Nullable
    private final th c;
    private final to.a d;
    @Nullable
    private final sw e;
    private final sz f;
    private final ss.b g;

    public wt(sf $$0) {
        this($$0.o(), $$0.m(), (th)$$0.c(th::a), new to.a($$0), (sw)$$0.c(sf::l), sz.a($$0), new ss.b($$0));
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.a);
        $$0.d(this.b);
        $$0.a(this.c, th::a);
        this.d.a($$0);
        $$0.a(this.e, sf::a);
        sz.a($$0, this.f);
        this.g.a($$0);
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{wt.class, "sender;index;signature;body;unsignedContent;filterMask;chatType", "a", "b", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{wt.class, "sender;index;signature;body;unsignedContent;filterMask;chatType", "a", "b", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{wt.class, "sender;index;signature;body;unsignedContent;filterMask;chatType", "a", "b", "c", "d", "e", "f", "g"}, this, $$0);
    }

    public int c() {
        return this.b;
    }

    @Nullable
    public th d() {
        return this.c;
    }

    public to.a e() {
        return this.d;
    }

    @Nullable
    public sw f() {
        return this.e;
    }

    public sz g() {
        return this.f;
    }

    public ss.b h() {
        return this.g;
    }
}

