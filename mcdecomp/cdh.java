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
import java.util.Objects;
import javax.annotation.Nullable;

public class cdh {
    private final String a;
    @Nullable
    private dcf b;
    private boolean c;
    private boolean d;

    public cdh(String $$0) {
        this.a = $$0;
    }

    private static boolean a(dcf $$0, @Nullable dcf $$1, boolean $$2) {
        if ($$1 == null || $$0.a() != $$1.a()) {
            return false;
        }
        if (!$$2) {
            return true;
        }
        if ($$0.b() == null && $$1.b() == null) {
            return true;
        }
        if ($$0.b() == null || $$1.b() == null) {
            return false;
        }
        return Objects.equals($$0.b().n(), $$1.b().n());
    }

    public boolean a(cfz $$0, hr<cpn> $$1, dcf $$2) {
        if (cdh.a($$2, this.b, this.d)) {
            return this.c;
        }
        this.b = $$2;
        this.d = false;
        qr $$3 = $$0.v();
        if ($$3 != null && $$3.b(this.a, 9)) {
            qx $$4 = $$3.c(this.a, 8);
            for (int $$5 = 0; $$5 < $$4.size(); ++$$5) {
                String $$6 = $$4.j($$5);
                try {
                    fe.b $$7 = fe.a($$1.p(), new StringReader($$6));
                    this.d |= $$7.a();
                    if ($$7.test($$2)) {
                        this.c = true;
                        return true;
                    }
                    continue;
                }
                catch (CommandSyntaxException commandSyntaxException) {
                    // empty catch block
                }
            }
        }
        this.c = false;
        return false;
    }
}

