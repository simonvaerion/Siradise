/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class apq {
    private static final char a = '\ufffd';
    private static final Optional<Object> b = Optional.of(apz.a);

    private static boolean a(ts $$0, aon $$1, int $$2, char $$3) {
        if (Character.isSurrogate($$3)) {
            return $$1.accept($$2, $$0, 65533);
        }
        return $$1.accept($$2, $$0, $$3);
    }

    public static boolean a(String $$0, ts $$1, aon $$2) {
        int $$3 = $$0.length();
        for (int $$4 = 0; $$4 < $$3; ++$$4) {
            char $$5 = $$0.charAt($$4);
            if (Character.isHighSurrogate($$5)) {
                if ($$4 + 1 >= $$3) {
                    if ($$2.accept($$4, $$1, 65533)) break;
                    return false;
                }
                char $$6 = $$0.charAt($$4 + 1);
                if (Character.isLowSurrogate($$6)) {
                    if (!$$2.accept($$4, $$1, Character.toCodePoint($$5, $$6))) {
                        return false;
                    }
                    ++$$4;
                    continue;
                }
                if ($$2.accept($$4, $$1, 65533)) continue;
                return false;
            }
            if (apq.a($$1, $$2, $$4, $$5)) continue;
            return false;
        }
        return true;
    }

    public static boolean b(String $$0, ts $$1, aon $$2) {
        int $$3 = $$0.length();
        for (int $$4 = $$3 - 1; $$4 >= 0; --$$4) {
            char $$5 = $$0.charAt($$4);
            if (Character.isLowSurrogate($$5)) {
                if ($$4 - 1 < 0) {
                    if ($$2.accept(0, $$1, 65533)) break;
                    return false;
                }
                char $$6 = $$0.charAt($$4 - 1);
                if (!(Character.isHighSurrogate($$6) ? !$$2.accept(--$$4, $$1, Character.toCodePoint($$6, $$5)) : !$$2.accept($$4, $$1, 65533))) continue;
                return false;
            }
            if (apq.a($$1, $$2, $$4, $$5)) continue;
            return false;
        }
        return true;
    }

    public static boolean c(String $$0, ts $$1, aon $$2) {
        return apq.a($$0, 0, $$1, $$2);
    }

    public static boolean a(String $$0, int $$1, ts $$2, aon $$3) {
        return apq.a($$0, $$1, $$2, $$2, $$3);
    }

    public static boolean a(String $$0, int $$1, ts $$2, ts $$3, aon $$4) {
        int $$5 = $$0.length();
        ts $$6 = $$2;
        for (int $$7 = $$1; $$7 < $$5; ++$$7) {
            char $$8 = $$0.charAt($$7);
            if ($$8 == '\u00a7') {
                if ($$7 + 1 >= $$5) break;
                char $$9 = $$0.charAt($$7 + 1);
                n $$10 = n.a($$9);
                if ($$10 != null) {
                    $$6 = $$10 == n.v ? $$3 : $$6.c($$10);
                }
                ++$$7;
                continue;
            }
            if (Character.isHighSurrogate($$8)) {
                if ($$7 + 1 >= $$5) {
                    if ($$4.accept($$7, $$6, 65533)) break;
                    return false;
                }
                char $$11 = $$0.charAt($$7 + 1);
                if (Character.isLowSurrogate($$11)) {
                    if (!$$4.accept($$7, $$6, Character.toCodePoint($$8, $$11))) {
                        return false;
                    }
                    ++$$7;
                    continue;
                }
                if ($$4.accept($$7, $$6, 65533)) continue;
                return false;
            }
            if (apq.a($$6, $$4, $$7, $$8)) continue;
            return false;
        }
        return true;
    }

    public static boolean a(ta $$0, ts $$12, aon $$22) {
        return !$$0.a(($$1, $$2) -> apq.a($$2, 0, $$1, $$22) ? Optional.empty() : b, $$12).isPresent();
    }

    public static String a(String $$0) {
        StringBuilder $$12 = new StringBuilder();
        apq.a($$0, ts.a, (int $$1, ts $$2, int $$3) -> {
            $$12.appendCodePoint($$3);
            return true;
        });
        return $$12.toString();
    }

    public static String a(ta $$0) {
        StringBuilder $$12 = new StringBuilder();
        apq.a($$0, ts.a, (int $$1, ts $$2, int $$3) -> {
            $$12.appendCodePoint($$3);
            return true;
        });
        return $$12.toString();
    }
}

