/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.LongArgumentType
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.LongArgumentType;

public class go
implements gg<LongArgumentType, a> {
    @Override
    public void a(a $$0, sf $$1) {
        boolean $$2 = $$0.b != Long.MIN_VALUE;
        boolean $$3 = $$0.c != Long.MAX_VALUE;
        $$1.writeByte(gi.a($$2, $$3));
        if ($$2) {
            $$1.writeLong($$0.b);
        }
        if ($$3) {
            $$1.writeLong($$0.c);
        }
    }

    @Override
    public a a(sf $$0) {
        byte $$1 = $$0.readByte();
        long $$2 = gi.a($$1) ? $$0.readLong() : Long.MIN_VALUE;
        long $$3 = gi.b($$1) ? $$0.readLong() : Long.MAX_VALUE;
        return new a($$2, $$3);
    }

    @Override
    public void a(a $$0, JsonObject $$1) {
        if ($$0.b != Long.MIN_VALUE) {
            $$1.addProperty("min", (Number)$$0.b);
        }
        if ($$0.c != Long.MAX_VALUE) {
            $$1.addProperty("max", (Number)$$0.c);
        }
    }

    @Override
    public a a(LongArgumentType $$0) {
        return new a($$0.getMinimum(), $$0.getMaximum());
    }

    @Override
    public /* synthetic */ gg.a b(sf sf2) {
        return this.a(sf2);
    }

    public final class a
    implements gg.a<LongArgumentType> {
        final long b;
        final long c;

        a(long $$1, long $$2) {
            this.b = $$1;
            this.c = $$2;
        }

        public LongArgumentType a(dm $$0) {
            return LongArgumentType.longArg((long)this.b, (long)this.c);
        }

        @Override
        public gg<LongArgumentType, ?> a() {
            return go.this;
        }

        @Override
        public /* synthetic */ ArgumentType b(dm dm2) {
            return this.a(dm2);
        }
    }
}

