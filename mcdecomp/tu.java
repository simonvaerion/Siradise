/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class tu {
    private static final String b = "#";
    public static final Codec<tu> a = Codec.STRING.comapFlatMap($$0 -> {
        tu $$1 = tu.a($$0);
        return $$1 != null ? DataResult.success((Object)$$1) : DataResult.error(() -> "String is not a valid color name or hex color code");
    }, tu::b);
    private static final Map<n, tu> c = (Map)Stream.of(n.values()).filter(n::e).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0 -> new tu($$0.f(), $$0.g())));
    private static final Map<String, tu> d = (Map)c.values().stream().collect(ImmutableMap.toImmutableMap($$0 -> $$0.f, Function.identity()));
    private final int e;
    @Nullable
    private final String f;

    private tu(int $$0, String $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    private tu(int $$0) {
        this.e = $$0;
        this.f = null;
    }

    public int a() {
        return this.e;
    }

    public String b() {
        if (this.f != null) {
            return this.f;
        }
        return this.c();
    }

    private String c() {
        return String.format(Locale.ROOT, "#%06X", this.e);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        tu $$1 = (tu)$$0;
        return this.e == $$1.e;
    }

    public int hashCode() {
        return Objects.hash(this.e, this.f);
    }

    public String toString() {
        return this.f != null ? this.f : this.c();
    }

    @Nullable
    public static tu a(n $$0) {
        return c.get($$0);
    }

    public static tu a(int $$0) {
        return new tu($$0);
    }

    @Nullable
    public static tu a(String $$0) {
        if ($$0.startsWith(b)) {
            try {
                int $$1 = Integer.parseInt($$0.substring(1), 16);
                return tu.a($$1);
            }
            catch (NumberFormatException $$2) {
                return null;
            }
        }
        return d.get($$0);
    }
}

