/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class gm
implements gg<FloatArgumentType, a> {
    @Override
    public void a(a $$0, sf $$1) {
        boolean $$2 = $$0.b != -3.4028235E38f;
        boolean $$3 = $$0.c != Float.MAX_VALUE;
        $$1.writeByte(gi.a($$2, $$3));
        if ($$2) {
            $$1.writeFloat($$0.b);
        }
        if ($$3) {
            $$1.writeFloat($$0.c);
        }
    }

    @Override
    public a a(sf $$0) {
        byte $$1 = $$0.readByte();
        float $$2 = gi.a($$1) ? $$0.readFloat() : -3.4028235E38f;
        float $$3 = gi.b($$1) ? $$0.readFloat() : Float.MAX_VALUE;
        return new a($$2, $$3);
    }

    @Override
    public void a(a $$0, JsonObject $$1) {
        if ($$0.b != -3.4028235E38f) {
            $$1.addProperty("min", (Number)Float.valueOf($$0.b));
        }
        if ($$0.c != Float.MAX_VALUE) {
            $$1.addProperty("max", (Number)Float.valueOf($$0.c));
        }
    }

    @Override
    public a a(FloatArgumentType $$0) {
        return new a($$0.getMinimum(), $$0.getMaximum());
    }

    @Override
    public /* synthetic */ gg.a b(sf sf2) {
        return this.a(sf2);
    }

    public final class a
    implements gg.a<FloatArgumentType> {
        final float b;
        final float c;

        a(float $$1, float $$2) {
            this.b = $$1;
            this.c = $$2;
        }

        public FloatArgumentType a(dm $$0) {
            return FloatArgumentType.floatArg((float)this.b, (float)this.c);
        }

        @Override
        public gg<FloatArgumentType, ?> a() {
            return gm.this;
        }

        @Override
        public /* synthetic */ ArgumentType b(dm dm2) {
            return this.a(dm2);
        }
    }
}

