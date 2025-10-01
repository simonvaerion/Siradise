/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  io.netty.buffer.Unpooled
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import io.netty.buffer.Unpooled;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class za {
    private static final Logger a = LogUtils.getLogger();

    public static void a(aif $$0, gu $$1, String $$2, int $$3, int $$4) {
        sf $$5 = new sf(Unpooled.buffer());
        $$5.a($$1);
        $$5.writeInt($$3);
        $$5.a($$2);
        $$5.writeInt($$4);
        za.a($$0, $$5, vp.n);
    }

    public static void a(aif $$0) {
        sf $$1 = new sf(Unpooled.buffer());
        za.a($$0, $$1, vp.o);
    }

    public static void a(aif $$0, clt $$1) {
    }

    public static void a(aif $$0, gu $$1) {
        za.d($$0, $$1);
    }

    public static void b(aif $$0, gu $$1) {
        za.d($$0, $$1);
    }

    public static void c(aif $$0, gu $$1) {
        za.d($$0, $$1);
    }

    private static void d(aif $$0, gu $$1) {
    }

    public static void a(cmm $$0, bgb $$1, @Nullable dxt $$2, float $$3) {
    }

    public static void a(cmm $$0, gu $$1) {
    }

    public static void a(cng $$0, dsi $$1) {
    }

    public static void a(cmm $$0, bgb $$1, bmw $$2) {
        if (!($$0 instanceof aif)) {
            return;
        }
    }

    public static void a(aif $$0, Collection<bzv> $$1) {
    }

    public static void a(bfz $$0) {
    }

    public static void a(brm $$0) {
    }

    public static void a(cmm $$0, dgl $$1, eei $$2) {
    }

    public static void a(cmm $$0, dgn $$1) {
    }

    public static void a(cmm $$0, gu $$1, dcb $$2, czk $$3) {
    }

    private static void a(bfz $$02, sf $$12) {
        bha<dxt> $$2 = $$02.dK();
        long $$3 = $$02.dI().V();
        if ($$02 instanceof bxz) {
            bee $$4 = ((bxz)((Object)$$02)).w();
            $$12.a($$4.ab_() ? "" : ((Object)$$4).toString());
        } else {
            $$12.a("");
        }
        $$12.a($$2.a(bpb.t) ? $$2.c(bpb.t) : Optional.empty(), ($$0, $$1) -> $$1.a((sf)((Object)$$0)));
        if ($$02 instanceof byb) {
            byb $$5 = (byb)$$02;
            boolean $$6 = $$5.a($$3);
            $$12.writeBoolean($$6);
        } else {
            $$12.writeBoolean(false);
        }
        if ($$02.ae() == bfn.bi) {
            bxs $$7 = (bxs)$$02;
            $$12.writeInt($$7.r());
        } else {
            $$12.writeInt(-1);
        }
        $$12.a($$2.d(), ($$0, $$1) -> $$0.a($$1.a()));
        Set $$8 = $$2.e().stream().map(bhs::b).collect(Collectors.toSet());
        $$12.a($$8, sf::a);
        $$12.a(za.a($$02, $$3), ($$0, $$1) -> {
            String $$2 = aps.a($$1, 255, true);
            $$0.a($$2);
        });
        if ($$02 instanceof byb) {
            Set $$9 = Stream.of(bpb.c, bpb.b, bpb.e).map($$2::c).flatMap(Optional::stream).map(hd::b).collect(Collectors.toSet());
            $$12.a($$9, sf::a);
        } else {
            $$12.d(0);
        }
        if ($$02 instanceof byb) {
            Set $$10 = Stream.of(bpb.d).map($$2::c).flatMap(Optional::stream).map(hd::b).collect(Collectors.toSet());
            $$12.a($$10, sf::a);
        } else {
            $$12.d(0);
        }
        if ($$02 instanceof byb) {
            Map<UUID, Object2IntMap<boy>> $$11 = ((byb)$$02).gt().a();
            ArrayList $$122 = Lists.newArrayList();
            $$11.forEach(($$1, $$22) -> {
                String $$32 = yz.a($$1);
                $$22.forEach(($$2, $$3) -> $$122.add($$32 + ": " + $$2 + ": " + $$3));
            });
            $$12.a($$122, sf::a);
        } else {
            $$12.d(0);
        }
    }

    private static List<String> a(bfz $$0, long $$1) {
        Map<bpb<?>, Optional<bpa<?>>> $$2 = $$0.dK().b();
        ArrayList $$3 = Lists.newArrayList();
        for (Map.Entry<bpb<?>, Optional<bpa<?>>> $$4 : $$2.entrySet()) {
            String $$13;
            bpb<?> $$5 = $$4.getKey();
            Optional<bpa<?>> $$6 = $$4.getValue();
            if ($$6.isPresent()) {
                bpa<?> $$7 = $$6.get();
                Object $$8 = $$7.c();
                if ($$5 == bpb.D) {
                    long $$9 = $$1 - (Long)$$8;
                    String $$10 = $$9 + " ticks ago";
                } else if ($$7.e()) {
                    String $$11 = za.a((aif)$$0.dI(), $$8) + " (ttl: " + $$7.b() + ")";
                } else {
                    String $$12 = za.a((aif)$$0.dI(), $$8);
                }
            } else {
                $$13 = "-";
            }
            $$3.add(jb.C.b($$5).a() + ": " + $$13);
        }
        $$3.sort(String::compareTo);
        return $$3;
    }

    private static String a(aif $$0, @Nullable Object $$1) {
        if ($$1 == null) {
            return "-";
        }
        if ($$1 instanceof UUID) {
            return za.a($$0, $$0.a((UUID)$$1));
        }
        if ($$1 instanceof bfz) {
            bfj $$2 = (bfj)$$1;
            return yz.a($$2);
        }
        if ($$1 instanceof beb) {
            return ((beb)$$1).Z().getString();
        }
        if ($$1 instanceof bpe) {
            return za.a($$0, ((bpe)$$1).a());
        }
        if ($$1 instanceof bic) {
            return za.a($$0, ((bic)$$1).c());
        }
        if ($$1 instanceof hd) {
            return za.a($$0, (Object)((hd)$$1).b());
        }
        if ($$1 instanceof bhu) {
            return za.a($$0, (Object)((bhu)$$1).b());
        }
        if ($$1 instanceof ben) {
            bfj $$3 = ((ben)$$1).d();
            return $$3 == null ? $$1.toString() : za.a($$0, $$3);
        }
        if ($$1 instanceof Collection) {
            ArrayList $$4 = Lists.newArrayList();
            for (Object $$5 : (Iterable)$$1) {
                $$4.add(za.a($$0, $$5));
            }
            return ((Object)$$4).toString();
        }
        return $$1.toString();
    }

    private static void a(aif $$0, sf $$1, acq $$2) {
        vp $$3 = new vp($$2, $$1);
        for (aig $$4 : $$0.v()) {
            $$4.c.a($$3);
        }
    }

    private static /* synthetic */ void b(sf $$0, dxt $$1) {
        $$1.a($$0);
    }

    private static /* synthetic */ void a(sf $$0, bzv $$1) {
        $$0.a($$1.t());
    }

    private static /* synthetic */ void a(sf $$0, boj $$1) {
        $$0.writeInt($$1.i());
        $$0.writeBoolean($$1.h());
        $$0.a($$1.k().getClass().getSimpleName());
    }

    private static /* synthetic */ String a(acp $$0) {
        return $$0.a().toString();
    }

    private static /* synthetic */ void a(aif $$0, bra $$1) {
        za.a($$0, $$1.f());
    }

    private static /* synthetic */ boolean a(he $$0) {
        return true;
    }
}

