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
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record tw(String a, @Nullable fk b) implements tx
{
    public tw(String $$0) {
        this($$0, tw.a($$0));
    }

    @Nullable
    private static fk a(String $$0) {
        try {
            return fi.a().a(new StringReader($$0));
        }
        catch (CommandSyntaxException $$1) {
            return null;
        }
    }

    @Override
    public Stream<qr> getData(ds $$0) {
        czn $$3;
        gu $$2;
        aif $$1;
        if (this.b != null && ($$1 = $$0.e()).o($$2 = this.b.c($$0)) && ($$3 = $$1.c_($$2)) != null) {
            return Stream.of($$3.m());
        }
        return Stream.empty();
    }

    @Override
    public String toString() {
        return "block=" + this.a;
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
        if (!($$0 instanceof tw)) return false;
        tw $$1 = (tw)$$0;
        if (!this.a.equals($$1.a)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}

