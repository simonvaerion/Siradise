/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class dch {
    private static final Joiner a = Joiner.on((String)",");
    private final List<String[]> b = Lists.newArrayList();
    private final Map<Character, Predicate<dcf>> c = Maps.newHashMap();
    private int d;
    private int e;

    private dch() {
        this.c.put(Character.valueOf(' '), $$0 -> true);
    }

    public dch a(String ... $$0) {
        if (ArrayUtils.isEmpty((Object[])$$0) || StringUtils.isEmpty((CharSequence)$$0[0])) {
            throw new IllegalArgumentException("Empty pattern for aisle");
        }
        if (this.b.isEmpty()) {
            this.d = $$0.length;
            this.e = $$0[0].length();
        }
        if ($$0.length != this.d) {
            throw new IllegalArgumentException("Expected aisle with height of " + this.d + ", but was given one with a height of " + $$0.length + ")");
        }
        for (String $$1 : $$0) {
            if ($$1.length() != this.e) {
                throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.e + ", found one with " + $$1.length() + ")");
            }
            for (char $$2 : $$1.toCharArray()) {
                if (this.c.containsKey(Character.valueOf($$2))) continue;
                this.c.put(Character.valueOf($$2), null);
            }
        }
        this.b.add($$0);
        return this;
    }

    public static dch a() {
        return new dch();
    }

    public dch a(char $$0, Predicate<dcf> $$1) {
        this.c.put(Character.valueOf($$0), $$1);
        return this;
    }

    public dcg b() {
        return new dcg(this.c());
    }

    private Predicate<dcf>[][][] c() {
        this.d();
        Predicate[][][] $$0 = (Predicate[][][])Array.newInstance(Predicate.class, this.b.size(), this.d, this.e);
        for (int $$1 = 0; $$1 < this.b.size(); ++$$1) {
            for (int $$2 = 0; $$2 < this.d; ++$$2) {
                for (int $$3 = 0; $$3 < this.e; ++$$3) {
                    $$0[$$1][$$2][$$3] = this.c.get(Character.valueOf(this.b.get($$1)[$$2].charAt($$3)));
                }
            }
        }
        return $$0;
    }

    private void d() {
        ArrayList $$0 = Lists.newArrayList();
        for (Map.Entry<Character, Predicate<dcf>> $$1 : this.c.entrySet()) {
            if ($$1.getValue() != null) continue;
            $$0.add($$1.getKey());
        }
        if (!$$0.isEmpty()) {
            throw new IllegalStateException("Predicates for character(s) " + a.join((Iterable)$$0) + " are missing");
        }
    }
}

