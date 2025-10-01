/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ebm
extends eay {
    private static final Logger a = LogUtils.getLogger();
    final sw b;
    @Nullable
    final dzk.b c;

    ebm(eck[] $$0, @Nullable sw $$1, @Nullable dzk.b $$2) {
        super($$0);
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    public eba b() {
        return ebb.k;
    }

    @Override
    public Set<ebt<?>> a() {
        return this.c != null ? ImmutableSet.of(this.c.a()) : ImmutableSet.of();
    }

    public static UnaryOperator<sw> a(dzk $$02, @Nullable dzk.b $$1) {
        bfj $$22;
        if ($$1 != null && ($$22 = $$02.c($$1.a())) != null) {
            ds $$3 = $$22.da().a(2);
            return $$2 -> {
                try {
                    return sy.a($$3, $$2, $$22, 0);
                }
                catch (CommandSyntaxException $$3) {
                    a.warn("Failed to resolve text component", (Throwable)$$3);
                    return $$2;
                }
            };
        }
        return $$0 -> $$0;
    }

    @Override
    public cfz a(cfz $$0, dzk $$1) {
        if (this.b != null) {
            $$0.a((sw)ebm.a($$1, this.c).apply(this.b));
        }
        return $$0;
    }

    public static eay.a<?> a(sw $$0) {
        return ebm.a((eck[] $$1) -> new ebm((eck[])$$1, $$0, null));
    }

    public static eay.a<?> a(sw $$0, dzk.b $$1) {
        return ebm.a((eck[] $$2) -> new ebm((eck[])$$2, $$0, $$1));
    }

    public static class a
    extends eay.c<ebm> {
        @Override
        public void a(JsonObject $$0, ebm $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            if ($$1.b != null) {
                $$0.add("name", sw.a.c($$1.b));
            }
            if ($$1.c != null) {
                $$0.add("entity", $$2.serialize((Object)$$1.c));
            }
        }

        public ebm a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            tj $$3 = sw.a.a($$0.get("name"));
            dzk.b $$4 = aor.a($$0, "entity", null, $$1, dzk.b.class);
            return new ebm($$2, $$3, $$4);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

