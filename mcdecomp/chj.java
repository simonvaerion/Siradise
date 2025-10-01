/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class chj
extends cfu {
    public static final String a = "Effects";
    public static final String b = "EffectId";
    public static final String c = "EffectDuration";
    public static final int d = 160;

    public chj(cfu.a $$0) {
        super($$0);
    }

    public static void a(cfz $$0, bey $$1, int $$2) {
        qr $$3 = $$0.w();
        qx $$4 = $$3.c(a, 9);
        qr $$5 = new qr();
        $$5.a(b, bey.a($$1));
        $$5.a(c, $$2);
        $$4.add($$5);
        $$3.a(a, $$4);
    }

    private static void a(cfz $$0, Consumer<bfa> $$1) {
        qr $$2 = $$0.v();
        if ($$2 != null && $$2.b(a, 9)) {
            qx $$3 = $$2.c(a, 10);
            for (int $$4 = 0; $$4 < $$3.size(); ++$$4) {
                int $$7;
                qr $$5 = $$3.a($$4);
                if ($$5.b(c, 99)) {
                    int $$6 = $$5.h(c);
                } else {
                    $$7 = 160;
                }
                bey $$8 = bey.a($$5.h(b));
                if ($$8 == null) continue;
                $$1.accept(new bfa($$8, $$7));
            }
        }
    }

    @Override
    public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
        super.a($$0, $$1, $$2, $$3);
        if ($$3.b()) {
            ArrayList<bfa> $$4 = new ArrayList<bfa>();
            chj.a($$0, $$4::add);
            chy.a($$4, $$2, 1.0f);
        }
    }

    @Override
    public cfz a(cfz $$0, cmm $$1, bfz $$2) {
        cfz $$3 = super.a($$0, $$1, $$2);
        chj.a($$3, $$2::b);
        if ($$2 instanceof byo && ((byo)$$2).fO().d) {
            return $$3;
        }
        return new cfz(cgc.oC);
    }
}

