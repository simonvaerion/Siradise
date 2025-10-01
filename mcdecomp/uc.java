/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class uc
implements sx {
    private static final Logger c = LogUtils.getLogger();
    private final boolean d;
    private final Optional<sw> e;
    private final String f;
    private final tx g;
    @Nullable
    protected final eh.g b;

    public uc(String $$0, boolean $$1, Optional<sw> $$2, tx $$3) {
        this($$0, uc.a($$0), $$1, $$2, $$3);
    }

    private uc(String $$0, @Nullable eh.g $$1, boolean $$2, Optional<sw> $$3, tx $$4) {
        this.f = $$0;
        this.b = $$1;
        this.d = $$2;
        this.e = $$3;
        this.g = $$4;
    }

    @Nullable
    private static eh.g a(String $$0) {
        try {
            return new eh().a(new StringReader($$0));
        }
        catch (CommandSyntaxException $$1) {
            return null;
        }
    }

    public String a() {
        return this.f;
    }

    public boolean b() {
        return this.d;
    }

    public Optional<sw> c() {
        return this.e;
    }

    public tx d() {
        return this.g;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof uc)) return false;
        uc $$1 = (uc)$$0;
        if (!this.g.equals($$1.g)) return false;
        if (!this.e.equals($$1.e)) return false;
        if (this.d != $$1.d) return false;
        if (!this.f.equals($$1.f)) return false;
        return true;
    }

    public int hashCode() {
        int $$0 = this.d ? 1 : 0;
        $$0 = 31 * $$0 + this.e.hashCode();
        $$0 = 31 * $$0 + this.f.hashCode();
        $$0 = 31 * $$0 + this.g.hashCode();
        return $$0;
    }

    public String toString() {
        return "nbt{" + this.g + ", interpreting=" + this.d + ", separator=" + this.e + "}";
    }

    @Override
    public tj a(@Nullable ds $$02, @Nullable bfj $$13, int $$22) throws CommandSyntaxException {
        if ($$02 == null || this.b == null) {
            return sw.h();
        }
        Stream<String> $$32 = this.g.getData($$02).flatMap($$0 -> {
            try {
                return this.b.a((rk)$$0).stream();
            }
            catch (CommandSyntaxException $$1) {
                return Stream.empty();
            }
        }).map(rk::m_);
        if (this.d) {
            sw $$4 = (sw)DataFixUtils.orElse(sy.a($$02, this.e, $$13, $$22), (Object)sy.c);
            return $$32.flatMap($$3 -> {
                try {
                    tj $$4 = sw.a.a($$3);
                    return Stream.of(sy.a($$02, $$4, $$13, $$22));
                }
                catch (Exception $$5) {
                    c.warn("Failed to parse component: {}", $$3, (Object)$$5);
                    return Stream.of(new tj[0]);
                }
            }).reduce(($$1, $$2) -> $$1.b($$4).b((sw)$$2)).orElseGet(sw::h);
        }
        return sy.a($$02, this.e, $$13, $$22).map($$12 -> $$32.map(sw::b).reduce(($$1, $$2) -> $$1.b((sw)$$12).b((sw)$$2)).orElseGet(sw::h)).orElseGet(() -> sw.b($$32.collect(Collectors.joining(", "))));
    }
}

