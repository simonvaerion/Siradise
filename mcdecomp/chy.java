/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class chy {
    public static final String a = "CustomPotionEffects";
    public static final String b = "CustomPotionColor";
    public static final String c = "Potion";
    private static final int d = 0xF800F8;
    private static final sw e = sw.c("effect.none").a(n.h);

    public static List<bfa> a(cfz $$0) {
        return chy.a($$0.v());
    }

    public static List<bfa> a(chw $$0, Collection<bfa> $$1) {
        ArrayList $$2 = Lists.newArrayList();
        $$2.addAll($$0.a());
        $$2.addAll($$1);
        return $$2;
    }

    public static List<bfa> a(@Nullable qr $$0) {
        ArrayList $$1 = Lists.newArrayList();
        $$1.addAll(chy.c($$0).a());
        chy.a($$0, $$1);
        return $$1;
    }

    public static List<bfa> b(cfz $$0) {
        return chy.b($$0.v());
    }

    public static List<bfa> b(@Nullable qr $$0) {
        ArrayList $$1 = Lists.newArrayList();
        chy.a($$0, $$1);
        return $$1;
    }

    public static void a(@Nullable qr $$0, List<bfa> $$1) {
        if ($$0 != null && $$0.b(a, 9)) {
            qx $$2 = $$0.c(a, 10);
            for (int $$3 = 0; $$3 < $$2.size(); ++$$3) {
                qr $$4 = $$2.a($$3);
                bfa $$5 = bfa.b($$4);
                if ($$5 == null) continue;
                $$1.add($$5);
            }
        }
    }

    public static int c(cfz $$0) {
        qr $$1 = $$0.v();
        if ($$1 != null && $$1.b(b, 99)) {
            return $$1.h(b);
        }
        return chy.d($$0) == chz.b ? 0xF800F8 : chy.a(chy.a($$0));
    }

    public static int a(chw $$0) {
        return $$0 == chz.b ? 0xF800F8 : chy.a($$0.a());
    }

    public static int a(Collection<bfa> $$0) {
        int $$1 = 3694022;
        if ($$0.isEmpty()) {
            return 3694022;
        }
        float $$2 = 0.0f;
        float $$3 = 0.0f;
        float $$4 = 0.0f;
        int $$5 = 0;
        for (bfa $$6 : $$0) {
            if (!$$6.g()) continue;
            int $$7 = $$6.c().g();
            int $$8 = $$6.e() + 1;
            $$2 += (float)($$8 * ($$7 >> 16 & 0xFF)) / 255.0f;
            $$3 += (float)($$8 * ($$7 >> 8 & 0xFF)) / 255.0f;
            $$4 += (float)($$8 * ($$7 >> 0 & 0xFF)) / 255.0f;
            $$5 += $$8;
        }
        if ($$5 == 0) {
            return 0;
        }
        $$2 = $$2 / (float)$$5 * 255.0f;
        $$3 = $$3 / (float)$$5 * 255.0f;
        $$4 = $$4 / (float)$$5 * 255.0f;
        return (int)$$2 << 16 | (int)$$3 << 8 | (int)$$4;
    }

    public static chw d(cfz $$0) {
        return chy.c($$0.v());
    }

    public static chw c(@Nullable qr $$0) {
        if ($$0 == null) {
            return chz.b;
        }
        return chw.a($$0.l(c));
    }

    public static cfz a(cfz $$0, chw $$1) {
        acq $$2 = jb.j.b($$1);
        if ($$1 == chz.b) {
            $$0.c(c);
        } else {
            $$0.w().a(c, $$2.toString());
        }
        return $$0;
    }

    public static cfz a(cfz $$0, Collection<bfa> $$1) {
        if ($$1.isEmpty()) {
            return $$0;
        }
        qr $$2 = $$0.w();
        qx $$3 = $$2.c(a, 9);
        for (bfa $$4 : $$1) {
            $$3.add($$4.a(new qr()));
        }
        $$2.a(a, $$3);
        return $$0;
    }

    public static void a(cfz $$0, List<sw> $$1, float $$2) {
        chy.a(chy.a($$0), $$1, $$2);
    }

    public static void a(List<bfa> $$0, List<sw> $$1, float $$2) {
        ArrayList $$3 = Lists.newArrayList();
        if ($$0.isEmpty()) {
            $$1.add(e);
        } else {
            for (bfa $$4 : $$0) {
                tj $$5 = sw.c($$4.i());
                bey $$6 = $$4.c();
                Map<bhb, bhe> $$7 = $$6.h();
                if (!$$7.isEmpty()) {
                    for (Map.Entry<bhb, bhe> $$8 : $$7.entrySet()) {
                        bhe $$9 = $$8.getValue();
                        bhe $$10 = new bhe($$9.b(), $$6.a($$4.e(), $$9), $$9.c());
                        $$3.add(new Pair((Object)$$8.getKey(), (Object)$$10));
                    }
                }
                if ($$4.e() > 0) {
                    $$5 = sw.a("potion.withAmplifier", $$5, sw.c("potion.potency." + $$4.e()));
                }
                if (!$$4.a(20)) {
                    $$5 = sw.a("potion.withDuration", $$5, bfb.a($$4, $$2));
                }
                $$1.add($$5.a($$6.f().a()));
            }
        }
        if (!$$3.isEmpty()) {
            $$1.add(sv.a);
            $$1.add(sw.c("potion.whenDrank").a(n.f));
            for (Pair $$11 : $$3) {
                double $$15;
                bhe $$12 = (bhe)$$11.getSecond();
                double $$13 = $$12.d();
                if ($$12.c() == bhe.a.b || $$12.c() == bhe.a.c) {
                    double $$14 = $$12.d() * 100.0;
                } else {
                    $$15 = $$12.d();
                }
                if ($$13 > 0.0) {
                    $$1.add(sw.a("attribute.modifier.plus." + $$12.c().a(), new Object[]{cfz.c.format($$15), sw.c(((bhb)$$11.getFirst()).c())}).a(n.j));
                    continue;
                }
                if (!($$13 < 0.0)) continue;
                $$1.add(sw.a("attribute.modifier.take." + $$12.c().a(), new Object[]{cfz.c.format($$15 *= -1.0), sw.c(((bhb)$$11.getFirst()).c())}).a(n.m));
            }
        }
    }
}

