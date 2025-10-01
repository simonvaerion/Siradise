/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class gj<A extends ArgumentType<?>>
implements gg<A, a> {
    private final a a;

    private gj(Function<dm, A> $$0) {
        this.a = new a($$0);
    }

    public static <T extends ArgumentType<?>> gj<T> a(Supplier<T> $$0) {
        return new gj<ArgumentType>($$1 -> (ArgumentType)$$0.get());
    }

    public static <T extends ArgumentType<?>> gj<T> a(Function<dm, T> $$0) {
        return new gj<T>($$0);
    }

    @Override
    public void a(a $$0, sf $$1) {
    }

    @Override
    public void a(a $$0, JsonObject $$1) {
    }

    @Override
    public a a(sf $$0) {
        return this.a;
    }

    public a b(A $$0) {
        return this.a;
    }

    @Override
    public /* synthetic */ gg.a a(ArgumentType argumentType) {
        return this.b(argumentType);
    }

    @Override
    public /* synthetic */ gg.a b(sf sf2) {
        return this.a(sf2);
    }

    public final class a
    implements gg.a<A> {
        private final Function<dm, A> b;

        public a(Function<dm, A> $$1) {
            this.b = $$1;
        }

        @Override
        public A b(dm $$0) {
            return (ArgumentType)this.b.apply($$0);
        }

        @Override
        public gg<A, ?> a() {
            return gj.this;
        }
    }
}

