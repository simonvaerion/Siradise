/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class epn {
    private static final aom a = aom.codepoint(32, ts.a);

    private static String a(String $$0) {
        return enn.N().m.G().c() != false ? $$0 : n.a($$0);
    }

    public static List<aom> a(ta $$0, int $$12, eov $$22) {
        end $$3 = new end();
        $$0.a(($$1, $$2) -> {
            $$3.a(ta.a(epn.a($$2), $$1));
            return Optional.empty();
        }, ts.a);
        ArrayList $$4 = Lists.newArrayList();
        $$22.b().a($$3.b(), $$12, ts.a, ($$1, $$2) -> {
            aom $$3 = qm.a().a((ta)$$1);
            $$4.add($$2 != false ? aom.composite(a, $$3) : $$3);
        });
        if ($$4.isEmpty()) {
            return Lists.newArrayList((Object[])new aom[]{aom.a});
        }
        return $$4;
    }
}

