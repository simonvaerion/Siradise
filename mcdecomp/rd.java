/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.base.Splitter
 *  com.google.common.base.Strings
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class rd {
    private static final Comparator<qx> b = Comparator.comparingInt($$0 -> $$0.e(1)).thenComparingInt($$0 -> $$0.e(0)).thenComparingInt($$0 -> $$0.e(2));
    private static final Comparator<qx> c = Comparator.comparingDouble($$0 -> $$0.h(1)).thenComparingDouble($$0 -> $$0.h(0)).thenComparingDouble($$0 -> $$0.h(2));
    public static final String a = "data";
    private static final char d = '{';
    private static final char e = '}';
    private static final String f = ",";
    private static final char g = ':';
    private static final Splitter h = Splitter.on((String)",");
    private static final Splitter i = Splitter.on((char)':').limit(2);
    private static final Logger j = LogUtils.getLogger();
    private static final int k = 2;
    private static final int l = -1;

    private rd() {
    }

    @Nullable
    public static GameProfile a(qr $$0) {
        String $$1 = null;
        UUID $$2 = null;
        if ($$0.b("Name", 8)) {
            $$1 = $$0.l("Name");
        }
        if ($$0.b("Id")) {
            $$2 = $$0.a("Id");
        }
        try {
            GameProfile $$3 = new GameProfile($$2, $$1);
            if ($$0.b("Properties", 10)) {
                qr $$4 = $$0.p("Properties");
                for (String $$5 : $$4.e()) {
                    qx $$6 = $$4.c($$5, 10);
                    for (int $$7 = 0; $$7 < $$6.size(); ++$$7) {
                        qr $$8 = $$6.a($$7);
                        String $$9 = $$8.l("Value");
                        if ($$8.b("Signature", 8)) {
                            $$3.getProperties().put((Object)$$5, (Object)new Property($$5, $$9, $$8.l("Signature")));
                            continue;
                        }
                        $$3.getProperties().put((Object)$$5, (Object)new Property($$5, $$9));
                    }
                }
            }
            return $$3;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static qr a(qr $$0, GameProfile $$1) {
        if (!aps.b($$1.getName())) {
            $$0.a("Name", $$1.getName());
        }
        if ($$1.getId() != null) {
            $$0.a("Id", $$1.getId());
        }
        if (!$$1.getProperties().isEmpty()) {
            qr $$2 = new qr();
            for (String $$3 : $$1.getProperties().keySet()) {
                qx $$4 = new qx();
                for (Property $$5 : $$1.getProperties().get((Object)$$3)) {
                    qr $$6 = new qr();
                    $$6.a("Value", $$5.getValue());
                    if ($$5.hasSignature()) {
                        $$6.a("Signature", $$5.getSignature());
                    }
                    $$4.add($$6);
                }
                $$2.a($$3, $$4);
            }
            $$0.a("Properties", $$2);
        }
        return $$0;
    }

    @VisibleForTesting
    public static boolean a(@Nullable rk $$0, @Nullable rk $$1, boolean $$2) {
        if ($$0 == $$1) {
            return true;
        }
        if ($$0 == null) {
            return true;
        }
        if ($$1 == null) {
            return false;
        }
        if (!$$0.getClass().equals($$1.getClass())) {
            return false;
        }
        if ($$0 instanceof qr) {
            qr $$3 = (qr)$$0;
            qr $$4 = (qr)$$1;
            for (String $$5 : $$3.e()) {
                rk $$6 = $$3.c($$5);
                if (rd.a($$6, $$4.c($$5), $$2)) continue;
                return false;
            }
            return true;
        }
        if ($$0 instanceof qx && $$2) {
            qx $$7 = (qx)$$0;
            qx $$8 = (qx)$$1;
            if ($$7.isEmpty()) {
                return $$8.isEmpty();
            }
            for (int $$9 = 0; $$9 < $$7.size(); ++$$9) {
                rk $$10 = $$7.k($$9);
                boolean $$11 = false;
                for (int $$12 = 0; $$12 < $$8.size(); ++$$12) {
                    if (!rd.a($$10, $$8.k($$12), $$2)) continue;
                    $$11 = true;
                    break;
                }
                if ($$11) continue;
                return false;
            }
            return true;
        }
        return $$0.equals($$1);
    }

    public static qv a(UUID $$0) {
        return new qv(hy.a($$0));
    }

    public static UUID a(rk $$0) {
        if ($$0.c() != qv.a) {
            throw new IllegalArgumentException("Expected UUID-Tag to be of type " + qv.a.a() + ", but found " + $$0.c().a() + ".");
        }
        int[] $$1 = ((qv)$$0).g();
        if ($$1.length != 4) {
            throw new IllegalArgumentException("Expected UUID-Array to be of length 4, but found " + $$1.length + ".");
        }
        return hy.a($$1);
    }

    public static gu b(qr $$0) {
        return new gu($$0.h("X"), $$0.h("Y"), $$0.h("Z"));
    }

    public static qr a(gu $$0) {
        qr $$1 = new qr();
        $$1.a("X", $$0.u());
        $$1.a("Y", $$0.v());
        $$1.a("Z", $$0.w());
        return $$1;
    }

    public static dcb a(hf<cpn> $$0, qr $$1) {
        if (!$$1.b("Name", 8)) {
            return cpo.a.n();
        }
        acq $$2 = new acq($$1.l("Name"));
        Optional<he.c<cpn>> $$3 = $$0.a(acp.a(jc.e, $$2));
        if ($$3.isEmpty()) {
            return cpo.a.n();
        }
        cpn $$4 = (cpn)((he)$$3.get()).a();
        dcb $$5 = $$4.n();
        if ($$1.b("Properties", 10)) {
            qr $$6 = $$1.p("Properties");
            dcc<cpn, dcb> $$7 = $$4.l();
            for (String $$8 : $$6.e()) {
                dde<?> $$9 = $$7.a($$8);
                if ($$9 == null) continue;
                $$5 = rd.a($$5, $$9, $$8, $$6, $$1);
            }
        }
        return $$5;
    }

    private static <S extends dcd<?, S>, T extends Comparable<T>> S a(S $$0, dde<T> $$1, String $$2, qr $$3, qr $$4) {
        Optional<T> $$5 = $$1.b($$3.l($$2));
        if ($$5.isPresent()) {
            return (S)((dcd)$$0.a($$1, (Comparable)((Comparable)$$5.get())));
        }
        j.warn("Unable to read property: {} with value: {} for blockstate: {}", new Object[]{$$2, $$3.l($$2), $$4.toString()});
        return $$0;
    }

    public static qr a(dcb $$0) {
        qr $$1 = new qr();
        $$1.a("Name", jb.f.b($$0.b()).toString());
        ImmutableMap<dde<?>, Comparable<?>> $$2 = $$0.C();
        if (!$$2.isEmpty()) {
            qr $$3 = new qr();
            for (Map.Entry $$4 : $$2.entrySet()) {
                dde $$5 = (dde)$$4.getKey();
                $$3.a($$5.f(), rd.a($$5, (Comparable)$$4.getValue()));
            }
            $$1.a("Properties", $$3);
        }
        return $$1;
    }

    public static qr a(dxe $$0) {
        qr $$1 = new qr();
        $$1.a("Name", jb.d.b($$0.a()).toString());
        ImmutableMap<dde<?>, Comparable<?>> $$2 = $$0.C();
        if (!$$2.isEmpty()) {
            qr $$3 = new qr();
            for (Map.Entry $$4 : $$2.entrySet()) {
                dde $$5 = (dde)$$4.getKey();
                $$3.a($$5.f(), rd.a($$5, (Comparable)$$4.getValue()));
            }
            $$1.a("Properties", $$3);
        }
        return $$1;
    }

    private static <T extends Comparable<T>> String a(dde<T> $$0, Comparable<?> $$1) {
        return $$0.a($$1);
    }

    public static String b(rk $$0) {
        return rd.a($$0, false);
    }

    public static String a(rk $$0, boolean $$1) {
        return rd.a(new StringBuilder(), $$0, 0, $$1).toString();
    }

    public static StringBuilder a(StringBuilder $$0, rk $$1, int $$2, boolean $$3) {
        switch ($$1.b()) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 8: {
                $$0.append($$1);
                break;
            }
            case 0: {
                break;
            }
            case 7: {
                qo $$4 = (qo)$$1;
                byte[] $$5 = $$4.e();
                int $$6 = $$5.length;
                rd.a($$2, $$0).append("byte[").append($$6).append("] {\n");
                if ($$3) {
                    rd.a($$2 + 1, $$0);
                    for (int $$7 = 0; $$7 < $$5.length; ++$$7) {
                        if ($$7 != 0) {
                            $$0.append(',');
                        }
                        if ($$7 % 16 == 0 && $$7 / 16 > 0) {
                            $$0.append('\n');
                            if ($$7 < $$5.length) {
                                rd.a($$2 + 1, $$0);
                            }
                        } else if ($$7 != 0) {
                            $$0.append(' ');
                        }
                        $$0.append(String.format(Locale.ROOT, "0x%02X", $$5[$$7] & 0xFF));
                    }
                } else {
                    rd.a($$2 + 1, $$0).append(" // Skipped, supply withBinaryBlobs true");
                }
                $$0.append('\n');
                rd.a($$2, $$0).append('}');
                break;
            }
            case 9: {
                qx $$8 = (qx)$$1;
                int $$9 = $$8.size();
                byte $$10 = $$8.f();
                String $$11 = $$10 == 0 ? "undefined" : rn.a($$10).b();
                rd.a($$2, $$0).append("list<").append($$11).append(">[").append($$9).append("] [");
                if ($$9 != 0) {
                    $$0.append('\n');
                }
                for (int $$12 = 0; $$12 < $$9; ++$$12) {
                    if ($$12 != 0) {
                        $$0.append(",\n");
                    }
                    rd.a($$2 + 1, $$0);
                    rd.a($$0, $$8.k($$12), $$2 + 1, $$3);
                }
                if ($$9 != 0) {
                    $$0.append('\n');
                }
                rd.a($$2, $$0).append(']');
                break;
            }
            case 11: {
                qv $$13 = (qv)$$1;
                int[] $$14 = $$13.g();
                int $$15 = 0;
                for (int $$16 : $$14) {
                    $$15 = Math.max($$15, String.format(Locale.ROOT, "%X", $$16).length());
                }
                int $$17 = $$14.length;
                rd.a($$2, $$0).append("int[").append($$17).append("] {\n");
                if ($$3) {
                    rd.a($$2 + 1, $$0);
                    for (int $$18 = 0; $$18 < $$14.length; ++$$18) {
                        if ($$18 != 0) {
                            $$0.append(',');
                        }
                        if ($$18 % 16 == 0 && $$18 / 16 > 0) {
                            $$0.append('\n');
                            if ($$18 < $$14.length) {
                                rd.a($$2 + 1, $$0);
                            }
                        } else if ($$18 != 0) {
                            $$0.append(' ');
                        }
                        $$0.append(String.format(Locale.ROOT, "0x%0" + $$15 + "X", $$14[$$18]));
                    }
                } else {
                    rd.a($$2 + 1, $$0).append(" // Skipped, supply withBinaryBlobs true");
                }
                $$0.append('\n');
                rd.a($$2, $$0).append('}');
                break;
            }
            case 10: {
                qr $$19 = (qr)$$1;
                ArrayList $$20 = Lists.newArrayList($$19.e());
                Collections.sort($$20);
                rd.a($$2, $$0).append('{');
                if ($$0.length() - $$0.lastIndexOf("\n") > 2 * ($$2 + 1)) {
                    $$0.append('\n');
                    rd.a($$2 + 1, $$0);
                }
                int $$21 = $$20.stream().mapToInt(String::length).max().orElse(0);
                String $$22 = Strings.repeat((String)" ", (int)$$21);
                for (int $$23 = 0; $$23 < $$20.size(); ++$$23) {
                    if ($$23 != 0) {
                        $$0.append(",\n");
                    }
                    String $$24 = (String)$$20.get($$23);
                    rd.a($$2 + 1, $$0).append('\"').append($$24).append('\"').append($$22, 0, $$22.length() - $$24.length()).append(": ");
                    rd.a($$0, $$19.c($$24), $$2 + 1, $$3);
                }
                if (!$$20.isEmpty()) {
                    $$0.append('\n');
                }
                rd.a($$2, $$0).append('}');
                break;
            }
            case 12: {
                qy $$25 = (qy)$$1;
                long[] $$26 = $$25.g();
                long $$27 = 0L;
                for (long $$28 : $$26) {
                    $$27 = Math.max($$27, (long)String.format(Locale.ROOT, "%X", $$28).length());
                }
                long $$29 = $$26.length;
                rd.a($$2, $$0).append("long[").append($$29).append("] {\n");
                if ($$3) {
                    rd.a($$2 + 1, $$0);
                    for (int $$30 = 0; $$30 < $$26.length; ++$$30) {
                        if ($$30 != 0) {
                            $$0.append(',');
                        }
                        if ($$30 % 16 == 0 && $$30 / 16 > 0) {
                            $$0.append('\n');
                            if ($$30 < $$26.length) {
                                rd.a($$2 + 1, $$0);
                            }
                        } else if ($$30 != 0) {
                            $$0.append(' ');
                        }
                        $$0.append(String.format(Locale.ROOT, "0x%0" + $$27 + "X", $$26[$$30]));
                    }
                } else {
                    rd.a($$2 + 1, $$0).append(" // Skipped, supply withBinaryBlobs true");
                }
                $$0.append('\n');
                rd.a($$2, $$0).append('}');
                break;
            }
            default: {
                $$0.append("<UNKNOWN :(>");
            }
        }
        return $$0;
    }

    private static StringBuilder a(int $$0, StringBuilder $$1) {
        int $$2 = $$1.lastIndexOf("\n") + 1;
        int $$3 = $$1.length() - $$2;
        for (int $$4 = 0; $$4 < 2 * $$0 - $$3; ++$$4) {
            $$1.append(' ');
        }
        return $$1;
    }

    public static sw c(rk $$0) {
        return new rp("", 0).a($$0);
    }

    public static String c(qr $$0) {
        return new rg().a((rk)rd.d($$0));
    }

    public static qr a(String $$0) throws CommandSyntaxException {
        return rd.e(rl.a($$0));
    }

    @VisibleForTesting
    static qr d(qr $$02) {
        qx $$3;
        boolean $$12 = $$02.b("palettes", 9);
        if ($$12) {
            qx $$22 = $$02.c("palettes", 9).b(0);
        } else {
            $$3 = $$02.c("palette", 10);
        }
        qx $$4 = $$3.stream().map(qr.class::cast).map(rd::f).map(ri::a).collect(Collectors.toCollection(qx::new));
        $$02.a("palette", $$4);
        if ($$12) {
            qx $$5 = new qx();
            qx $$6 = $$02.c("palettes", 9);
            $$6.stream().map(qx.class::cast).forEach($$2 -> {
                qr $$3 = new qr();
                for (int $$4 = 0; $$4 < $$2.size(); ++$$4) {
                    $$3.a($$4.j($$4), rd.f($$2.a($$4)));
                }
                $$5.add($$3);
            });
            $$02.a("palettes", $$5);
        }
        if ($$02.b("entities", 9)) {
            qx $$7 = $$02.c("entities", 10);
            qx $$8 = $$7.stream().map(qr.class::cast).sorted(Comparator.comparing($$0 -> $$0.c("pos", 6), c)).collect(Collectors.toCollection(qx::new));
            $$02.a("entities", $$8);
        }
        qx $$9 = $$02.c("blocks", 10).stream().map(qr.class::cast).sorted(Comparator.comparing($$0 -> $$0.c("pos", 3), b)).peek($$1 -> $$1.a("state", $$4.j($$1.h("state")))).collect(Collectors.toCollection(qx::new));
        $$02.a(a, $$9);
        $$02.r("blocks");
        return $$02;
    }

    @VisibleForTesting
    static qr e(qr $$0) {
        qx $$12 = $$0.c("palette", 8);
        Map $$2 = (Map)$$12.stream().map(ri.class::cast).map(ri::m_).collect(ImmutableMap.toImmutableMap(Function.identity(), rd::b));
        if ($$0.b("palettes", 9)) {
            $$0.a("palettes", $$0.c("palettes", 10).stream().map(qr.class::cast).map($$1 -> $$2.keySet().stream().map($$1::l).map(rd::b).collect(Collectors.toCollection(qx::new))).collect(Collectors.toCollection(qx::new)));
            $$0.r("palette");
        } else {
            $$0.a("palette", $$2.values().stream().collect(Collectors.toCollection(qx::new)));
        }
        if ($$0.b(a, 9)) {
            Object2IntOpenHashMap $$3 = new Object2IntOpenHashMap();
            $$3.defaultReturnValue(-1);
            for (int $$4 = 0; $$4 < $$12.size(); ++$$4) {
                $$3.put((Object)$$12.j($$4), $$4);
            }
            qx $$5 = $$0.c(a, 10);
            for (int $$6 = 0; $$6 < $$5.size(); ++$$6) {
                qr $$7 = $$5.a($$6);
                String $$8 = $$7.l("state");
                int $$9 = $$3.getInt((Object)$$8);
                if ($$9 == -1) {
                    throw new IllegalStateException("Entry " + $$8 + " missing from palette");
                }
                $$7.a("state", $$9);
            }
            $$0.a("blocks", $$5);
            $$0.r(a);
        }
        return $$0;
    }

    @VisibleForTesting
    static String f(qr $$0) {
        StringBuilder $$12 = new StringBuilder($$0.l("Name"));
        if ($$0.b("Properties", 10)) {
            qr $$2 = $$0.p("Properties");
            String $$3 = $$2.e().stream().sorted().map($$1 -> $$1 + ":" + $$2.c((String)$$1).m_()).collect(Collectors.joining(f));
            $$12.append('{').append($$3).append('}');
        }
        return $$12.toString();
    }

    @VisibleForTesting
    static qr b(String $$0) {
        String $$6;
        qr $$1 = new qr();
        int $$22 = $$0.indexOf(123);
        if ($$22 >= 0) {
            String $$3 = $$0.substring(0, $$22);
            qr $$4 = new qr();
            if ($$22 + 2 <= $$0.length()) {
                String $$5 = $$0.substring($$22 + 1, $$0.indexOf(125, $$22));
                h.split((CharSequence)$$5).forEach($$2 -> {
                    List $$3 = i.splitToList((CharSequence)$$2);
                    if ($$3.size() == 2) {
                        $$4.a((String)$$3.get(0), (String)$$3.get(1));
                    } else {
                        j.error("Something went wrong parsing: '{}' -- incorrect gamedata!", (Object)$$0);
                    }
                });
                $$1.a("Properties", $$4);
            }
        } else {
            $$6 = $$0;
        }
        $$1.a("Name", $$6);
        return $$1;
    }

    public static qr g(qr $$0) {
        int $$1 = aa.b().d().c();
        return rd.a($$0, $$1);
    }

    public static qr a(qr $$0, int $$1) {
        $$0.a("DataVersion", $$1);
        return $$0;
    }

    public static int b(qr $$0, int $$1) {
        return $$0.b("DataVersion", 99) ? $$0.h("DataVersion") : $$1;
    }
}

