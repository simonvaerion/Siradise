/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType$StringType
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;

public class gp
implements gg<StringArgumentType, a> {
    @Override
    public void a(a $$0, sf $$1) {
        $$1.a((Enum<?>)$$0.b);
    }

    @Override
    public a a(sf $$0) {
        StringArgumentType.StringType $$1 = $$0.b(StringArgumentType.StringType.class);
        return new a($$1);
    }

    @Override
    public void a(a $$0, JsonObject $$1) {
        $$1.addProperty("type", switch ($$0.b) {
            default -> throw new IncompatibleClassChangeError();
            case StringArgumentType.StringType.SINGLE_WORD -> "word";
            case StringArgumentType.StringType.QUOTABLE_PHRASE -> "phrase";
            case StringArgumentType.StringType.GREEDY_PHRASE -> "greedy";
        });
    }

    @Override
    public a a(StringArgumentType $$0) {
        return new a($$0.getType());
    }

    @Override
    public /* synthetic */ gg.a b(sf sf2) {
        return this.a(sf2);
    }

    public final class a
    implements gg.a<StringArgumentType> {
        final StringArgumentType.StringType b;

        public a(StringArgumentType.StringType $$1) {
            this.b = $$1;
        }

        public StringArgumentType a(dm $$0) {
            return switch (this.b) {
                default -> throw new IncompatibleClassChangeError();
                case StringArgumentType.StringType.SINGLE_WORD -> StringArgumentType.word();
                case StringArgumentType.StringType.QUOTABLE_PHRASE -> StringArgumentType.string();
                case StringArgumentType.StringType.GREEDY_PHRASE -> StringArgumentType.greedyString();
            };
        }

        @Override
        public gg<StringArgumentType, ?> a() {
            return gp.this;
        }

        @Override
        public /* synthetic */ ArgumentType b(dm dm2) {
            return this.a(dm2);
        }
    }
}

