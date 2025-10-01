/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Const
 *  com.mojang.datafixers.kinds.Const$Mu
 *  com.mojang.datafixers.kinds.IdF
 *  com.mojang.datafixers.kinds.IdF$Mu
 *  com.mojang.datafixers.kinds.K1
 *  com.mojang.datafixers.kinds.OptionalBox
 *  com.mojang.datafixers.kinds.OptionalBox$Mu
 *  com.mojang.datafixers.util.Unit
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.util.Unit;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import javax.annotation.Nullable;

public interface blf<F extends K1, Value> {
    public bpb<Value> a();

    public bpc b();

    @Nullable
    public ble<F, Value> a(bha<?> var1, Optional<Value> var2);

    public record a<Value>(bpb<Value> a) implements blf<Const.Mu<Unit>, Value>
    {
        @Override
        public bpc b() {
            return bpc.b;
        }

        @Override
        public ble<Const.Mu<Unit>, Value> a(bha<?> $$0, Optional<Value> $$1) {
            if ($$1.isPresent()) {
                return null;
            }
            return new ble($$0, this.a, Const.create((Object)Unit.INSTANCE));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "memory", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "memory", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "memory", "a"}, this, $$0);
        }
    }

    public record b<Value>(bpb<Value> a) implements blf<IdF.Mu, Value>
    {
        @Override
        public bpc b() {
            return bpc.a;
        }

        @Override
        public ble<IdF.Mu, Value> a(bha<?> $$0, Optional<Value> $$1) {
            if ($$1.isEmpty()) {
                return null;
            }
            return new ble($$0, this.a, IdF.create($$1.get()));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "memory", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "memory", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "memory", "a"}, this, $$0);
        }
    }

    public record c<Value>(bpb<Value> a) implements blf<OptionalBox.Mu, Value>
    {
        @Override
        public bpc b() {
            return bpc.c;
        }

        @Override
        public ble<OptionalBox.Mu, Value> a(bha<?> $$0, Optional<Value> $$1) {
            return new ble($$0, this.a, OptionalBox.create($$1));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "memory", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "memory", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "memory", "a"}, this, $$0);
        }
    }
}

