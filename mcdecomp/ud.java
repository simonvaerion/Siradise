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
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ud
implements sx {
    private static final String b = "*";
    private final String c;
    @Nullable
    private final ga d;
    private final String e;

    @Nullable
    private static ga a(String $$0) {
        try {
            return new gb(new StringReader($$0)).t();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            return null;
        }
    }

    public ud(String $$0, String $$1) {
        this.c = $$0;
        this.d = ud.a($$0);
        this.e = $$1;
    }

    public String a() {
        return this.c;
    }

    @Nullable
    public ga b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    private String a(ds $$0) throws CommandSyntaxException {
        List<? extends bfj> $$1;
        if (this.d != null && !($$1 = this.d.b($$0)).isEmpty()) {
            if ($$1.size() != 1) {
                throw ec.a.create();
            }
            return $$1.get(0).cv();
        }
        return this.c;
    }

    private String a(String $$0, ds $$1) {
        efd $$4;
        adg $$3;
        MinecraftServer $$2 = $$1.l();
        if ($$2 != null && ($$3 = $$2.aF()).b($$0, $$4 = $$3.d(this.e))) {
            eff $$5 = $$3.c($$0, $$4);
            return Integer.toString($$5.b());
        }
        return "";
    }

    @Override
    public tj a(@Nullable ds $$0, @Nullable bfj $$1, int $$2) throws CommandSyntaxException {
        if ($$0 == null) {
            return sw.h();
        }
        String $$3 = this.a($$0);
        String $$4 = $$1 != null && $$3.equals(b) ? $$1.cv() : $$3;
        return sw.b(this.a($$4, $$0));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof ud)) return false;
        ud $$1 = (ud)$$0;
        if (!this.c.equals($$1.c)) return false;
        if (!this.e.equals($$1.e)) return false;
        return true;
    }

    public int hashCode() {
        int $$0 = this.c.hashCode();
        $$0 = 31 * $$0 + this.e.hashCode();
        return $$0;
    }

    public String toString() {
        return "score{name='" + this.c + "', objective='" + this.e + "'}";
    }
}

