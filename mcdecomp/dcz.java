/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dcz<T extends Enum<T>>
extends dde<T> {
    private final ImmutableSet<T> a;
    private final Map<String, T> b = Maps.newHashMap();

    protected dcz(String $$0, Class<T> $$1, Collection<T> $$2) {
        super($$0, $$1);
        this.a = ImmutableSet.copyOf($$2);
        for (Enum $$3 : $$2) {
            String $$4 = ((apr)((Object)$$3)).c();
            if (this.b.containsKey($$4)) {
                throw new IllegalArgumentException("Multiple values have the same name '" + $$4 + "'");
            }
            this.b.put($$4, $$3);
        }
    }

    @Override
    public Collection<T> a() {
        return this.a;
    }

    @Override
    public Optional<T> b(String $$0) {
        return Optional.ofNullable((Enum)this.b.get($$0));
    }

    @Override
    public String a(T $$0) {
        return ((apr)$$0).c();
    }

    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof dcz && super.equals($$0)) {
            dcz $$1 = (dcz)$$0;
            return this.a.equals($$1.a) && this.b.equals($$1.b);
        }
        return false;
    }

    @Override
    public int b() {
        int $$0 = super.b();
        $$0 = 31 * $$0 + this.a.hashCode();
        $$0 = 31 * $$0 + this.b.hashCode();
        return $$0;
    }

    public static <T extends Enum<T>> dcz<T> a(String $$02, Class<T> $$1) {
        return dcz.a($$02, $$1, (T $$0) -> true);
    }

    public static <T extends Enum<T>> dcz<T> a(String $$0, Class<T> $$1, Predicate<T> $$2) {
        return dcz.a($$0, $$1, Arrays.stream((Enum[])$$1.getEnumConstants()).filter($$2).collect(Collectors.toList()));
    }

    public static <T extends Enum<T>> dcz<T> a(String $$0, Class<T> $$1, T ... $$2) {
        return dcz.a($$0, $$1, Lists.newArrayList((Object[])$$2));
    }

    public static <T extends Enum<T>> dcz<T> a(String $$0, Class<T> $$1, Collection<T> $$2) {
        return new dcz<T>($$0, $$1, $$2);
    }
}

