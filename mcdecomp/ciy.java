/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Map;

public class ciy
extends ciu {
    private static final ciz a = ciz.a(cgc.tf, cgc.oF, cgc.rt, cgc.tr, cgc.ts, cgc.tv, cgc.tt, cgc.tw, cgc.tu, cgc.tx);
    private static final ciz b = ciz.a(cgc.nK);
    private static final ciz c = ciz.a(cgc.qk);
    private static final Map<cfu, cfd.a> d = ac.a(Maps.newHashMap(), $$0 -> {
        $$0.put(cgc.tf, cfd.a.b);
        $$0.put(cgc.oF, cfd.a.e);
        $$0.put(cgc.rt, cfd.a.c);
        $$0.put(cgc.tr, cfd.a.d);
        $$0.put(cgc.ts, cfd.a.d);
        $$0.put(cgc.tv, cfd.a.d);
        $$0.put(cgc.tt, cfd.a.d);
        $$0.put(cgc.tw, cfd.a.d);
        $$0.put(cgc.tu, cfd.a.d);
        $$0.put(cgc.tx, cfd.a.d);
    });
    private static final ciz e = ciz.a(cgc.oG);

    public ciy(acq $$0, cis $$1) {
        super($$0, $$1);
    }

    @Override
    public boolean a(cbt $$0, cmm $$1) {
        boolean $$2 = false;
        boolean $$3 = false;
        boolean $$4 = false;
        boolean $$5 = false;
        boolean $$6 = false;
        for (int $$7 = 0; $$7 < $$0.b(); ++$$7) {
            cfz $$8 = $$0.a($$7);
            if ($$8.b()) continue;
            if (a.a($$8)) {
                if ($$4) {
                    return false;
                }
                $$4 = true;
                continue;
            }
            if (c.a($$8)) {
                if ($$6) {
                    return false;
                }
                $$6 = true;
                continue;
            }
            if (b.a($$8)) {
                if ($$5) {
                    return false;
                }
                $$5 = true;
                continue;
            }
            if (e.a($$8)) {
                if ($$2) {
                    return false;
                }
                $$2 = true;
                continue;
            }
            if ($$8.d() instanceof ceo) {
                $$3 = true;
                continue;
            }
            return false;
        }
        return $$2 && $$3;
    }

    @Override
    public cfz a(cbt $$0, hs $$1) {
        cfz $$2 = new cfz(cgc.tB);
        qr $$3 = $$2.a("Explosion");
        cfd.a $$4 = cfd.a.a;
        ArrayList $$5 = Lists.newArrayList();
        for (int $$6 = 0; $$6 < $$0.b(); ++$$6) {
            cfz $$7 = $$0.a($$6);
            if ($$7.b()) continue;
            if (a.a($$7)) {
                $$4 = d.get($$7.d());
                continue;
            }
            if (c.a($$7)) {
                $$3.a("Flicker", true);
                continue;
            }
            if (b.a($$7)) {
                $$3.a("Trail", true);
                continue;
            }
            if (!($$7.d() instanceof ceo)) continue;
            $$5.add(((ceo)$$7.d()).d().f());
        }
        $$3.b("Colors", $$5);
        $$3.a("Type", (byte)$$4.a());
        return $$2;
    }

    @Override
    public boolean a(int $$0, int $$1) {
        return $$0 * $$1 >= 2;
    }

    @Override
    public cfz a(hs $$0) {
        return new cfz(cgc.tB);
    }

    @Override
    public cje<?> aj_() {
        return cje.h;
    }
}

