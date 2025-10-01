/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class zl
extends Record
implements uo<zb> {
    private final String b;
    private final int c;
    private final bym d;
    private final boolean e;
    private final int f;
    private final bft g;
    private final boolean h;
    private final boolean i;
    public static final int a = 16;

    public zl(sf $$0) {
        this($$0.e(16), $$0.readByte(), $$0.b(bym.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bft.class), $$0.readBoolean(), $$0.readBoolean());
    }

    public zl(String $$0, int $$1, bym $$2, boolean $$3, int $$4, bft $$5, boolean $$6, boolean $$7) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.b);
        $$0.writeByte(this.c);
        $$0.a(this.d);
        $$0.writeBoolean(this.e);
        $$0.writeByte(this.f);
        $$0.a(this.g);
        $$0.writeBoolean(this.h);
        $$0.writeBoolean(this.i);
    }

    @Override
    public void a(zb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{zl.class, "language;viewDistance;chatVisibility;chatColors;modelCustomisation;mainHand;textFilteringEnabled;allowsListing", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zl.class, "language;viewDistance;chatVisibility;chatColors;modelCustomisation;mainHand;textFilteringEnabled;allowsListing", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zl.class, "language;viewDistance;chatVisibility;chatColors;modelCustomisation;mainHand;textFilteringEnabled;allowsListing", "b", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
    }

    public String a() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public bym d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public bft g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public boolean i() {
        return this.i;
    }
}

