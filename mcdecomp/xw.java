/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;

public final class xw
extends Record
implements uo<ur> {
    private final int b;
    private final List<acb.b<?>> c;
    public static final int a = 255;

    public xw(sf $$0) {
        this($$0.m(), xw.b($$0));
    }

    public xw(int $$0, List<acb.b<?>> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    private static void a(List<acb.b<?>> $$0, sf $$1) {
        for (acb.b<?> $$2 : $$0) {
            $$2.a($$1);
        }
        $$1.writeByte(255);
    }

    private static List<acb.b<?>> b(sf $$0) {
        short $$2;
        ArrayList $$1 = new ArrayList();
        while (($$2 = $$0.readUnsignedByte()) != 255) {
            $$1.add(acb.b.a($$0, $$2));
        }
        return $$1;
    }

    @Override
    public void a(sf $$0) {
        $$0.d(this.b);
        xw.a(this.c, $$0);
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{xw.class, "id;packedItems", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{xw.class, "id;packedItems", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{xw.class, "id;packedItems", "b", "c"}, this, $$0);
    }

    public int a() {
        return this.b;
    }

    public List<acb.b<?>> c() {
        return this.c;
    }
}

