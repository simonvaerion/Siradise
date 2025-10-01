/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Locale;
import javax.annotation.Nullable;

public interface dyg {
    public static final ha[] a = new ha[]{ha.e, ha.f, ha.a, ha.b, ha.c, ha.d};

    public void a(ha var1, dcb var2, gu var3, gu var4, int var5, int var6);

    public void a(gu var1, cpn var2, gu var3);

    public void a(dcb var1, gu var2, cpn var3, gu var4, boolean var5);

    default public void a(gu $$0, cpn $$1, @Nullable ha $$2) {
        for (ha $$3 : a) {
            if ($$3 == $$2) continue;
            this.a($$0.a($$3), $$1, $$0);
        }
    }

    public static void a(cmn $$0, ha $$1, dcb $$2, gu $$3, gu $$4, int $$5, int $$6) {
        dcb $$7 = $$0.a_($$3);
        dcb $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
        cpn.a($$7, $$8, $$0, $$3, $$5, $$6);
    }

    public static void a(cmm $$0, dcb $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
        try {
            $$1.a($$0, $$2, $$3, $$4, $$5);
        }
        catch (Throwable $$6) {
            o $$7 = o.a($$6, "Exception while updating neighbours");
            p $$8 = $$7.a("Block being updated");
            $$8.a("Source block type", () -> {
                try {
                    return String.format(Locale.ROOT, "ID #%s (%s // %s)", jb.f.b($$3), $$3.f(), $$3.getClass().getCanonicalName());
                }
                catch (Throwable $$1) {
                    return "ID #" + jb.f.b($$3);
                }
            });
            p.a($$8, $$0, $$2, $$1);
            throw new y($$7);
        }
    }
}

