/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cwi {
    public static final int a = 24;
    public static final int b = 1000;
    public static final float c = 0.5f;
    private static final int e = 32;
    public static final int d = 11;
    final boolean f;
    private final anl<cpn> g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private List<a> l = new ArrayList<a>();
    private static final Logger m = LogUtils.getLogger();

    public cwi(boolean $$0, anl<cpn> $$1, int $$2, int $$3, int $$4, int $$5) {
        this.f = $$0;
        this.g = $$1;
        this.h = $$2;
        this.i = $$3;
        this.j = $$4;
        this.k = $$5;
    }

    public static cwi a() {
        return new cwi(false, amw.bJ, 10, 4, 10, 5);
    }

    public static cwi b() {
        return new cwi(true, amw.bK, 50, 1, 5, 10);
    }

    public anl<cpn> c() {
        return this.g;
    }

    public int d() {
        return this.h;
    }

    public int e() {
        return this.i;
    }

    public int f() {
        return this.j;
    }

    public int g() {
        return this.k;
    }

    public boolean h() {
        return this.f;
    }

    @VisibleForTesting
    public List<a> i() {
        return this.l;
    }

    public void j() {
        this.l.clear();
    }

    public void a(qr $$0) {
        if ($$0.b("cursors", 9)) {
            this.l.clear();
            List $$1 = cwi$a.b.listOf().parse(new Dynamic((DynamicOps)rc.a, (Object)$$0.c("cursors", 10))).resultOrPartial(arg_0 -> ((Logger)m).error(arg_0)).orElseGet(ArrayList::new);
            int $$2 = Math.min($$1.size(), 32);
            for (int $$3 = 0; $$3 < $$2; ++$$3) {
                this.a((a)$$1.get($$3));
            }
        }
    }

    public void b(qr $$0) {
        cwi$a.b.listOf().encodeStart((DynamicOps)rc.a, this.l).resultOrPartial(arg_0 -> ((Logger)m).error(arg_0)).ifPresent($$1 -> $$0.a("cursors", (rk)$$1));
    }

    public void a(gu $$0, int $$1) {
        while ($$1 > 0) {
            int $$2 = Math.min($$1, 1000);
            this.a(new a($$0, $$2));
            $$1 -= $$2;
        }
    }

    private void a(a $$0) {
        if (this.l.size() >= 32) {
            return;
        }
        this.l.add($$0);
    }

    public void a(cmn $$0, gu $$12, apf $$22, boolean $$3) {
        if (this.l.isEmpty()) {
            return;
        }
        ArrayList<a> $$4 = new ArrayList<a>();
        HashMap<gu, a> $$5 = new HashMap<gu, a>();
        Object2IntOpenHashMap $$6 = new Object2IntOpenHashMap();
        for (a $$7 : this.l) {
            $$7.a($$0, $$12, $$22, this, $$3);
            if ($$7.e <= 0) {
                $$0.c(3006, $$7.a(), 0);
                continue;
            }
            gu $$8 = $$7.a();
            $$6.computeInt((Object)$$8, ($$1, $$2) -> ($$2 == null ? 0 : $$2) + $$0.e);
            a $$9 = (a)$$5.get($$8);
            if ($$9 == null) {
                $$5.put($$8, $$7);
                $$4.add($$7);
                continue;
            }
            if (!this.h() && $$7.e + $$9.e <= 1000) {
                $$9.a($$7);
                continue;
            }
            $$4.add($$7);
            if ($$7.e >= $$9.e) continue;
            $$5.put($$8, $$7);
        }
        for (Object2IntMap.Entry $$10 : $$6.object2IntEntrySet()) {
            Set<ha> $$14;
            gu $$11 = (gu)$$10.getKey();
            int $$122 = $$10.getIntValue();
            a $$13 = (a)$$5.get($$11);
            Set<ha> set = $$14 = $$13 == null ? null : $$13.d();
            if ($$122 <= 0 || $$14 == null) continue;
            int $$15 = (int)(Math.log1p($$122) / (double)2.3f) + 1;
            int $$16 = ($$15 << 6) + cul.a($$14);
            $$0.c(3006, $$11, $$16);
        }
        this.l = $$4;
    }

    private static /* synthetic */ Integer b(a $$0) {
        return 1;
    }

    public static class a {
        private static final ObjectArrayList<hz> c = ac.a(new ObjectArrayList(18), $$02 -> gu.b(new gu(-1, -1, -1), new gu(1, 1, 1)).filter($$0 -> ($$0.u() == 0 || $$0.v() == 0 || $$0.w() == 0) && !$$0.equals(gu.b)).map(gu::i).forEach(arg_0 -> ((ObjectArrayList)$$02).add(arg_0)));
        public static final int a = 1;
        private gu d;
        int e;
        private int f;
        private int g;
        @Nullable
        private Set<ha> h;
        private static final Codec<Set<ha>> i = ha.g.listOf().xmap($$0 -> Sets.newEnumSet((Iterable)$$0, ha.class), Lists::newArrayList);
        public static final Codec<a> b = RecordCodecBuilder.create($$02 -> $$02.group((App)gu.a.fieldOf("pos").forGetter(a::a), (App)Codec.intRange((int)0, (int)1000).fieldOf("charge").orElse((Object)0).forGetter(a::b), (App)Codec.intRange((int)0, (int)1).fieldOf("decay_delay").orElse((Object)1).forGetter(a::c), (App)Codec.intRange((int)0, (int)Integer.MAX_VALUE).fieldOf("update_delay").orElse((Object)0).forGetter($$0 -> $$0.f), (App)i.optionalFieldOf("facings").forGetter($$0 -> Optional.ofNullable($$0.d()))).apply((Applicative)$$02, a::new));

        private a(gu $$0, int $$1, int $$2, int $$3, Optional<Set<ha>> $$4) {
            this.d = $$0;
            this.e = $$1;
            this.g = $$2;
            this.f = $$3;
            this.h = $$4.orElse(null);
        }

        public a(gu $$0, int $$1) {
            this($$0, $$1, 1, 0, Optional.empty());
        }

        public gu a() {
            return this.d;
        }

        public int b() {
            return this.e;
        }

        public int c() {
            return this.g;
        }

        @Nullable
        public Set<ha> d() {
            return this.h;
        }

        private boolean a(cmn $$0, gu $$1, boolean $$2) {
            if (this.e <= 0) {
                return false;
            }
            if ($$2) {
                return true;
            }
            if ($$0 instanceof aif) {
                aif $$3 = (aif)$$0;
                return $$3.m($$1);
            }
            return false;
        }

        public void a(cmn $$0, gu $$1, apf $$2, cwi $$3, boolean $$4) {
            if (!this.a($$0, $$1, $$3.f)) {
                return;
            }
            if (this.f > 0) {
                --this.f;
                return;
            }
            dcb $$5 = $$0.a_(this.d);
            cwd $$6 = cwi$a.a($$5);
            if ($$4 && $$6.a($$0, this.d, $$5, this.h, $$3.h())) {
                if ($$6.c()) {
                    $$5 = $$0.a_(this.d);
                    $$6 = cwi$a.a($$5);
                }
                $$0.a(null, this.d, amh.ug, ami.e, 1.0f, 1.0f);
            }
            this.e = $$6.a(this, $$0, $$1, $$2, $$3, $$4);
            if (this.e <= 0) {
                $$6.a($$0, $$5, this.d, $$2);
                return;
            }
            gu $$7 = cwi$a.a($$0, this.d, $$2);
            if ($$7 != null) {
                $$6.a($$0, $$5, this.d, $$2);
                this.d = $$7.i();
                if ($$3.h() && !this.d.a(new hz($$1.u(), this.d.v(), $$1.w()), 15.0)) {
                    this.e = 0;
                    return;
                }
                $$5 = $$0.a_($$7);
            }
            if ($$5.b() instanceof cwd) {
                this.h = cul.h($$5);
            }
            this.g = $$6.i_(this.g);
            this.f = $$6.a();
        }

        void a(a $$0) {
            this.e += $$0.e;
            $$0.e = 0;
            this.f = Math.min(this.f, $$0.f);
        }

        private static cwd a(dcb $$0) {
            cwd $$1;
            cpn cpn2 = $$0.b();
            return cpn2 instanceof cwd ? ($$1 = (cwd)((Object)cpn2)) : cwd.t_;
        }

        private static List<hz> a(apf $$0) {
            return ac.a(c, $$0);
        }

        @Nullable
        private static gu a(cmn $$0, gu $$1, apf $$2) {
            gu.a $$3 = $$1.j();
            gu.a $$4 = $$1.j();
            for (hz $$5 : cwi$a.a($$2)) {
                $$4.a((hz)$$1, $$5);
                dcb $$6 = $$0.a_($$4);
                if (!($$6.b() instanceof cwd) || !cwi$a.a($$0, $$1, $$4)) continue;
                $$3.g($$4);
                if (!cwj.a($$0, $$6, $$4)) continue;
                break;
            }
            return $$3.equals($$1) ? null : $$3;
        }

        private static boolean a(cmn $$0, gu $$1, gu $$2) {
            if ($$1.k($$2) == 1) {
                return true;
            }
            gu $$3 = $$2.b($$1);
            ha $$4 = ha.a(ha.a.a, $$3.u() < 0 ? ha.b.b : ha.b.a);
            ha $$5 = ha.a(ha.a.b, $$3.v() < 0 ? ha.b.b : ha.b.a);
            ha $$6 = ha.a(ha.a.c, $$3.w() < 0 ? ha.b.b : ha.b.a);
            if ($$3.u() == 0) {
                return cwi$a.a($$0, $$1, $$5) || cwi$a.a($$0, $$1, $$6);
            }
            if ($$3.v() == 0) {
                return cwi$a.a($$0, $$1, $$4) || cwi$a.a($$0, $$1, $$6);
            }
            return cwi$a.a($$0, $$1, $$4) || cwi$a.a($$0, $$1, $$5);
        }

        private static boolean a(cmn $$0, gu $$1, ha $$2) {
            gu $$3 = $$1.a($$2);
            return !$$0.a_($$3).d($$0, $$3, $$2.g());
        }
    }
}

