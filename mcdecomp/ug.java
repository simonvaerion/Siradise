/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class ug
implements sx {
    public static final Object[] b = new Object[0];
    private static final ta c = ta.e("%");
    private static final ta d = ta.e("null");
    private final String e;
    @Nullable
    private final String f;
    private final Object[] g;
    @Nullable
    private qm h;
    private List<ta> i = ImmutableList.of();
    private static final Pattern j = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

    public ug(String $$0, @Nullable String $$1, Object[] $$2) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    private void d() {
        qm $$0 = qm.a();
        if ($$0 == this.h) {
            return;
        }
        this.h = $$0;
        String $$1 = this.f != null ? $$0.a(this.e, this.f) : $$0.a(this.e);
        try {
            ImmutableList.Builder $$2 = ImmutableList.builder();
            this.a($$1, arg_0 -> ((ImmutableList.Builder)$$2).add(arg_0));
            this.i = $$2.build();
        }
        catch (uh $$3) {
            this.i = ImmutableList.of((Object)ta.e($$1));
        }
    }

    private void a(String $$0, Consumer<ta> $$1) {
        Matcher $$2 = j.matcher($$0);
        try {
            int $$3 = 0;
            int $$4 = 0;
            while ($$2.find($$4)) {
                int $$5 = $$2.start();
                int $$6 = $$2.end();
                if ($$5 > $$4) {
                    String $$7 = $$0.substring($$4, $$5);
                    if ($$7.indexOf(37) != -1) {
                        throw new IllegalArgumentException();
                    }
                    $$1.accept(ta.e($$7));
                }
                String $$8 = $$2.group(2);
                String $$9 = $$0.substring($$5, $$6);
                if ("%".equals($$8) && "%%".equals($$9)) {
                    $$1.accept(c);
                } else if ("s".equals($$8)) {
                    String $$10 = $$2.group(1);
                    int $$11 = $$10 != null ? Integer.parseInt($$10) - 1 : $$3++;
                    $$1.accept(this.a($$11));
                } else {
                    throw new uh(this, "Unsupported format: '" + $$9 + "'");
                }
                $$4 = $$6;
            }
            if ($$4 < $$0.length()) {
                String $$12 = $$0.substring($$4);
                if ($$12.indexOf(37) != -1) {
                    throw new IllegalArgumentException();
                }
                $$1.accept(ta.e($$12));
            }
        }
        catch (IllegalArgumentException $$13) {
            throw new uh(this, (Throwable)$$13);
        }
    }

    private ta a(int $$0) {
        if ($$0 < 0 || $$0 >= this.g.length) {
            throw new uh(this, $$0);
        }
        Object $$1 = this.g[$$0];
        if ($$1 instanceof sw) {
            return (sw)$$1;
        }
        return $$1 == null ? d : ta.e($$1.toString());
    }

    @Override
    public <T> Optional<T> a(ta.b<T> $$0, ts $$1) {
        this.d();
        for (ta $$2 : this.i) {
            Optional<T> $$3 = $$2.a($$0, $$1);
            if (!$$3.isPresent()) continue;
            return $$3;
        }
        return Optional.empty();
    }

    @Override
    public <T> Optional<T> a(ta.a<T> $$0) {
        this.d();
        for (ta $$1 : this.i) {
            Optional<T> $$2 = $$1.a($$0);
            if (!$$2.isPresent()) continue;
            return $$2;
        }
        return Optional.empty();
    }

    @Override
    public tj a(@Nullable ds $$0, @Nullable bfj $$1, int $$2) throws CommandSyntaxException {
        Object[] $$3 = new Object[this.g.length];
        for (int $$4 = 0; $$4 < $$3.length; ++$$4) {
            Object $$5 = this.g[$$4];
            $$3[$$4] = $$5 instanceof sw ? sy.a($$0, (sw)$$5, $$1, $$2) : $$5;
        }
        return tj.a(new ug(this.e, this.f, $$3));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof ug)) return false;
        ug $$1 = (ug)$$0;
        if (!Objects.equals(this.e, $$1.e)) return false;
        if (!Objects.equals(this.f, $$1.f)) return false;
        if (!Arrays.equals(this.g, $$1.g)) return false;
        return true;
    }

    public int hashCode() {
        int $$0 = Objects.hashCode(this.e);
        $$0 = 31 * $$0 + Objects.hashCode(this.f);
        $$0 = 31 * $$0 + Arrays.hashCode(this.g);
        return $$0;
    }

    public String toString() {
        return "translation{key='" + this.e + "'" + (String)(this.f != null ? ", fallback='" + this.f + "'" : "") + ", args=" + Arrays.toString(this.g) + "}";
    }

    public String a() {
        return this.e;
    }

    @Nullable
    public String b() {
        return this.f;
    }

    public Object[] c() {
        return this.g;
    }
}

