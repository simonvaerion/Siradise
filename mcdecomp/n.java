/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public final class n
extends Enum<n>
implements apr {
    public static final /* enum */ n a = new n("BLACK", '0', 0, 0);
    public static final /* enum */ n b = new n("DARK_BLUE", '1', 1, 170);
    public static final /* enum */ n c = new n("DARK_GREEN", '2', 2, 43520);
    public static final /* enum */ n d = new n("DARK_AQUA", '3', 3, 43690);
    public static final /* enum */ n e = new n("DARK_RED", '4', 4, 0xAA0000);
    public static final /* enum */ n f = new n("DARK_PURPLE", '5', 5, 0xAA00AA);
    public static final /* enum */ n g = new n("GOLD", '6', 6, 0xFFAA00);
    public static final /* enum */ n h = new n("GRAY", '7', 7, 0xAAAAAA);
    public static final /* enum */ n i = new n("DARK_GRAY", '8', 8, 0x555555);
    public static final /* enum */ n j = new n("BLUE", '9', 9, 0x5555FF);
    public static final /* enum */ n k = new n("GREEN", 'a', 10, 0x55FF55);
    public static final /* enum */ n l = new n("AQUA", 'b', 11, 0x55FFFF);
    public static final /* enum */ n m = new n("RED", 'c', 12, 0xFF5555);
    public static final /* enum */ n n = new n("LIGHT_PURPLE", 'd', 13, 0xFF55FF);
    public static final /* enum */ n o = new n("YELLOW", 'e', 14, 0xFFFF55);
    public static final /* enum */ n p = new n("WHITE", 'f', 15, 0xFFFFFF);
    public static final /* enum */ n q = new n("OBFUSCATED", 'k', true);
    public static final /* enum */ n r = new n("BOLD", 'l', true);
    public static final /* enum */ n s = new n("STRIKETHROUGH", 'm', true);
    public static final /* enum */ n t = new n("UNDERLINE", 'n', true);
    public static final /* enum */ n u = new n("ITALIC", 'o', true);
    public static final /* enum */ n v = new n("RESET", 'r', -1, null);
    public static final Codec<n> w;
    public static final char x = '\u00a7';
    private static final Map<String, n> y;
    private static final Pattern z;
    private final String A;
    private final char B;
    private final boolean C;
    private final String D;
    private final int E;
    @Nullable
    private final Integer F;
    private static final /* synthetic */ n[] G;

    public static n[] values() {
        return (n[])G.clone();
    }

    public static n valueOf(String $$0) {
        return Enum.valueOf(n.class, $$0);
    }

    private static String c(String $$0) {
        return $$0.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
    }

    private n(String $$0, @Nullable char $$1, int $$2, Integer $$3) {
        this($$0, $$1, false, $$2, $$3);
    }

    private n(String $$0, char $$1, boolean $$2) {
        this($$0, $$1, $$2, -1, null);
    }

    private n(String $$0, char $$1, @Nullable boolean $$2, int $$3, Integer $$4) {
        this.A = $$0;
        this.B = $$1;
        this.C = $$2;
        this.E = $$3;
        this.F = $$4;
        this.D = "\u00a7" + $$1;
    }

    public char a() {
        return this.B;
    }

    public int b() {
        return this.E;
    }

    public boolean d() {
        return this.C;
    }

    public boolean e() {
        return !this.C && this != v;
    }

    @Nullable
    public Integer f() {
        return this.F;
    }

    public String g() {
        return this.name().toLowerCase(Locale.ROOT);
    }

    public String toString() {
        return this.D;
    }

    @Nullable
    public static String a(@Nullable String $$0) {
        return $$0 == null ? null : z.matcher($$0).replaceAll("");
    }

    @Nullable
    public static n b(@Nullable String $$0) {
        if ($$0 == null) {
            return null;
        }
        return y.get(n.c($$0));
    }

    @Nullable
    public static n a(int $$0) {
        if ($$0 < 0) {
            return v;
        }
        for (n $$1 : n.values()) {
            if ($$1.b() != $$0) continue;
            return $$1;
        }
        return null;
    }

    @Nullable
    public static n a(char $$0) {
        char $$1 = Character.toString($$0).toLowerCase(Locale.ROOT).charAt(0);
        for (n $$2 : n.values()) {
            if ($$2.B != $$1) continue;
            return $$2;
        }
        return null;
    }

    public static Collection<String> a(boolean $$0, boolean $$1) {
        ArrayList $$2 = Lists.newArrayList();
        for (n $$3 : n.values()) {
            if ($$3.e() && !$$0 || $$3.d() && !$$1) continue;
            $$2.add($$3.g());
        }
        return $$2;
    }

    @Override
    public String c() {
        return this.g();
    }

    private static /* synthetic */ n[] h() {
        return new n[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v};
    }

    static {
        G = n.h();
        w = apr.a(n::values);
        y = Arrays.stream(n.values()).collect(Collectors.toMap($$0 -> n.c($$0.A), $$0 -> $$0));
        z = Pattern.compile("(?i)\u00a7[0-9A-FK-OR]");
    }
}

