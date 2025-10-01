/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class ky {
    private static final ky a = new ky((List<dde.a<?>>)ImmutableList.of());
    private static final Comparator<dde.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
    private final List<dde.a<?>> c;

    public ky a(dde.a<?> $$0) {
        return new ky((List<dde.a<?>>)ImmutableList.builder().addAll(this.c).add($$0).build());
    }

    public ky a(ky $$0) {
        return new ky((List<dde.a<?>>)ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
    }

    private ky(List<dde.a<?>> $$0) {
        this.c = $$0;
    }

    public static ky a() {
        return a;
    }

    public static ky a(dde.a<?> ... $$0) {
        return new ky((List<dde.a<?>>)ImmutableList.copyOf((Object[])$$0));
    }

    public boolean equals(Object $$0) {
        return this == $$0 || $$0 instanceof ky && this.c.equals(((ky)$$0).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String b() {
        return this.c.stream().sorted(b).map(dde.a::toString).collect(Collectors.joining(","));
    }

    public String toString() {
        return this.b();
    }
}

