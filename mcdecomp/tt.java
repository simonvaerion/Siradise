/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class tt {
    private final String a;
    private final List<ts> b;
    private final Int2IntFunction c;

    private tt(String $$0, List<ts> $$1, Int2IntFunction $$2) {
        this.a = $$0;
        this.b = ImmutableList.copyOf($$1);
        this.c = $$2;
    }

    public String a() {
        return this.a;
    }

    public List<aom> a(int $$0, int $$1, boolean $$2) {
        if ($$1 == 0) {
            return ImmutableList.of();
        }
        ArrayList $$3 = Lists.newArrayList();
        ts $$4 = this.b.get($$0);
        int $$5 = $$0;
        for (int $$6 = 1; $$6 < $$1; ++$$6) {
            int $$7 = $$0 + $$6;
            ts $$8 = this.b.get($$7);
            if ($$8.equals($$4)) continue;
            String $$9 = this.a.substring($$5, $$7);
            $$3.add($$2 ? aom.backward($$9, $$4, this.c) : aom.forward($$9, $$4));
            $$4 = $$8;
            $$5 = $$7;
        }
        if ($$5 < $$0 + $$1) {
            String $$10 = this.a.substring($$5, $$0 + $$1);
            $$3.add($$2 ? aom.backward($$10, $$4, this.c) : aom.forward($$10, $$4));
        }
        return $$2 ? Lists.reverse((List)$$3) : $$3;
    }

    public static tt a(ta $$02) {
        return tt.a($$02, $$0 -> $$0, $$0 -> $$0);
    }

    public static tt a(ta $$0, Int2IntFunction $$1, UnaryOperator<String> $$2) {
        StringBuilder $$3 = new StringBuilder();
        ArrayList $$4 = Lists.newArrayList();
        $$0.a(($$22, $$32) -> {
            apq.c($$32, $$22, ($$2, $$3, $$4) -> {
                $$3.appendCodePoint($$4);
                int $$5 = Character.charCount($$4);
                for (int $$6 = 0; $$6 < $$5; ++$$6) {
                    $$4.add($$3);
                }
                return true;
            });
            return Optional.empty();
        }, ts.a);
        return new tt((String)$$2.apply($$3.toString()), $$4, $$1);
    }
}

