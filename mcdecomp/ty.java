/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  javax.annotation.Nullable
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record ty(String a, @Nullable ga b) implements tx
{
    public ty(String $$0) {
        this($$0, ty.a($$0));
    }

    @Nullable
    private static ga a(String $$0) {
        try {
            gb $$1 = new gb(new StringReader($$0));
            return $$1.t();
        }
        catch (CommandSyntaxException $$2) {
            return null;
        }
    }

    @Override
    public Stream<qr> getData(ds $$0) throws CommandSyntaxException {
        if (this.b != null) {
            List<? extends bfj> $$1 = this.b.b($$0);
            return $$1.stream().map(cl::b);
        }
        return Stream.empty();
    }

    @Override
    public String toString() {
        return "entity=" + this.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof ty)) return false;
        ty $$1 = (ty)$$0;
        if (!this.a.equals($$1.a)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}

