/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 */
import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface aom {
    public static final aom a = $$0 -> true;

    public boolean accept(aon var1);

    public static aom codepoint(int $$0, ts $$1) {
        return $$2 -> $$2.accept(0, $$1, $$0);
    }

    public static aom forward(String $$0, ts $$1) {
        if ($$0.isEmpty()) {
            return a;
        }
        return $$2 -> apq.a($$0, $$1, $$2);
    }

    public static aom forward(String $$0, ts $$1, Int2IntFunction $$2) {
        if ($$0.isEmpty()) {
            return a;
        }
        return $$3 -> apq.a($$0, $$1, aom.decorateOutput($$3, $$2));
    }

    public static aom backward(String $$0, ts $$1) {
        if ($$0.isEmpty()) {
            return a;
        }
        return $$2 -> apq.b($$0, $$1, $$2);
    }

    public static aom backward(String $$0, ts $$1, Int2IntFunction $$2) {
        if ($$0.isEmpty()) {
            return a;
        }
        return $$3 -> apq.b($$0, $$1, aom.decorateOutput($$3, $$2));
    }

    public static aon decorateOutput(aon $$0, Int2IntFunction $$1) {
        return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply((Object)$$4));
    }

    public static aom composite() {
        return a;
    }

    public static aom composite(aom $$0) {
        return $$0;
    }

    public static aom composite(aom $$0, aom $$1) {
        return aom.fromPair($$0, $$1);
    }

    public static aom composite(aom ... $$0) {
        return aom.fromList((List<aom>)ImmutableList.copyOf((Object[])$$0));
    }

    public static aom composite(List<aom> $$0) {
        int $$1 = $$0.size();
        switch ($$1) {
            case 0: {
                return a;
            }
            case 1: {
                return $$0.get(0);
            }
            case 2: {
                return aom.fromPair($$0.get(0), $$0.get(1));
            }
        }
        return aom.fromList((List<aom>)ImmutableList.copyOf($$0));
    }

    public static aom fromPair(aom $$0, aom $$1) {
        return $$2 -> $$0.accept($$2) && $$1.accept($$2);
    }

    public static aom fromList(List<aom> $$0) {
        return $$1 -> {
            for (aom $$2 : $$0) {
                if ($$2.accept($$1)) continue;
                return false;
            }
            return true;
        };
    }
}

