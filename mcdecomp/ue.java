/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ue
implements sx {
    private static final Logger c = LogUtils.getLogger();
    private final String d;
    @Nullable
    private final ga e;
    protected final Optional<sw> b;

    public ue(String $$0, Optional<sw> $$1) {
        this.d = $$0;
        this.b = $$1;
        this.e = ue.a($$0);
    }

    @Nullable
    private static ga a(String $$0) {
        ga $$1 = null;
        try {
            gb $$2 = new gb(new StringReader($$0));
            $$1 = $$2.t();
        }
        catch (CommandSyntaxException $$3) {
            c.warn("Invalid selector component: {}: {}", (Object)$$0, (Object)$$3.getMessage());
        }
        return $$1;
    }

    public String a() {
        return this.d;
    }

    @Nullable
    public ga b() {
        return this.e;
    }

    public Optional<sw> c() {
        return this.b;
    }

    @Override
    public tj a(@Nullable ds $$0, @Nullable bfj $$1, int $$2) throws CommandSyntaxException {
        if ($$0 == null || this.e == null) {
            return sw.h();
        }
        Optional<tj> $$3 = sy.a($$0, this.b, $$1, $$2);
        return sy.a(this.e.b($$0), $$3, bfj::H_);
    }

    @Override
    public <T> Optional<T> a(ta.b<T> $$0, ts $$1) {
        return $$0.accept($$1, this.d);
    }

    @Override
    public <T> Optional<T> a(ta.a<T> $$0) {
        return $$0.accept(this.d);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof ue)) return false;
        ue $$1 = (ue)$$0;
        if (!this.d.equals($$1.d)) return false;
        if (!this.b.equals($$1.b)) return false;
        return true;
    }

    public int hashCode() {
        int $$0 = this.d.hashCode();
        $$0 = 31 * $$0 + this.b.hashCode();
        return $$0;
    }

    public String toString() {
        return "pattern{" + this.d + "}";
    }
}

