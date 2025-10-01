/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class gn
implements gg<IntegerArgumentType, a> {
    @Override
    public void a(a $$0, sf $$1) {
        boolean $$2 = $$0.b != Integer.MIN_VALUE;
        boolean $$3 = $$0.c != Integer.MAX_VALUE;
        $$1.writeByte(gi.a($$2, $$3));
        if ($$2) {
            $$1.writeInt($$0.b);
        }
        if ($$3) {
            $$1.writeInt($$0.c);
        }
    }

    @Override
    public a a(sf $$0) {
        byte $$1 = $$0.readByte();
        int $$2 = gi.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
        int $$3 = gi.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
        return new a($$2, $$3);
    }

    @Override
    public void a(a $$0, JsonObject $$1) {
        if ($$0.b != Integer.MIN_VALUE) {
            $$1.addProperty("min", (Number)$$0.b);
        }
        if ($$0.c != Integer.MAX_VALUE) {
            $$1.addProperty("max", (Number)$$0.c);
        }
    }

    @Override
    public a a(IntegerArgumentType $$0) {
        return new a($$0.getMinimum(), $$0.getMaximum());
    }

    @Override
    public /* synthetic */ gg.a b(sf sf2) {
        return this.a(sf2);
    }

    public final class a
    implements gg.a<IntegerArgumentType> {
        final int b;
        final int c;

        a(int $$1, int $$2) {
            this.b = $$1;
            this.c = $$2;
        }

        public IntegerArgumentType a(dm $$0) {
            return IntegerArgumentType.integer((int)this.b, (int)this.c);
        }

        @Override
        public gg<IntegerArgumentType, ?> a() {
            return gn.this;
        }

        @Override
        public /* synthetic */ ArgumentType b(dm dm2) {
            return this.a(dm2);
        }
    }
}

