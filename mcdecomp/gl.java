/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class gl
implements gg<DoubleArgumentType, a> {
    @Override
    public void a(a $$0, sf $$1) {
        boolean $$2 = $$0.b != -1.7976931348623157E308;
        boolean $$3 = $$0.c != Double.MAX_VALUE;
        $$1.writeByte(gi.a($$2, $$3));
        if ($$2) {
            $$1.writeDouble($$0.b);
        }
        if ($$3) {
            $$1.writeDouble($$0.c);
        }
    }

    @Override
    public a a(sf $$0) {
        byte $$1 = $$0.readByte();
        double $$2 = gi.a($$1) ? $$0.readDouble() : -1.7976931348623157E308;
        double $$3 = gi.b($$1) ? $$0.readDouble() : Double.MAX_VALUE;
        return new a($$2, $$3);
    }

    @Override
    public void a(a $$0, JsonObject $$1) {
        if ($$0.b != -1.7976931348623157E308) {
            $$1.addProperty("min", (Number)$$0.b);
        }
        if ($$0.c != Double.MAX_VALUE) {
            $$1.addProperty("max", (Number)$$0.c);
        }
    }

    @Override
    public a a(DoubleArgumentType $$0) {
        return new a($$0.getMinimum(), $$0.getMaximum());
    }

    @Override
    public /* synthetic */ gg.a b(sf sf2) {
        return this.a(sf2);
    }

    public final class a
    implements gg.a<DoubleArgumentType> {
        final double b;
        final double c;

        a(double $$1, double $$2) {
            this.b = $$1;
            this.c = $$2;
        }

        public DoubleArgumentType a(dm $$0) {
            return DoubleArgumentType.doubleArg((double)this.b, (double)this.c);
        }

        @Override
        public gg<DoubleArgumentType, ?> a() {
            return gl.this;
        }

        @Override
        public /* synthetic */ ArgumentType b(dm dm2) {
            return this.a(dm2);
        }
    }
}

