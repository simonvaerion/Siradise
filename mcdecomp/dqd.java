/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dqd {
    private static final Logger b = LogUtils.getLogger();
    public static final Codec<dqd> a = RecordCodecBuilder.create($$02 -> $$02.group((App)ht.a(jc.aB).optionalFieldOf("structure_overrides").forGetter($$0 -> $$0.c), (App)dqa.a.listOf().fieldOf("layers").forGetter(dqd::e), (App)Codec.BOOL.fieldOf("lakes").orElse((Object)false).forGetter($$0 -> $$0.i), (App)Codec.BOOL.fieldOf("features").orElse((Object)false).forGetter($$0 -> $$0.h), (App)cnk.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0 -> Optional.of($$0.e)), aco.d(cnr.b), aco.d(oy.g), aco.d(oy.h)).apply((Applicative)$$02, dqd::new)).comapFlatMap(dqd::a, Function.identity()).stable();
    private final Optional<hi<dsg>> c;
    private final List<dqa> d = Lists.newArrayList();
    private final he<cnk> e;
    private final List<dcb> f;
    private boolean g;
    private boolean h;
    private boolean i;
    private final List<he<dre>> j;

    private static DataResult<dqd> a(dqd $$0) {
        int $$1 = $$0.d.stream().mapToInt(dqa::a).sum();
        if ($$1 > dfk.c) {
            return DataResult.error(() -> "Sum of layer heights is > " + dfk.c, (Object)$$0);
        }
        return DataResult.success((Object)$$0);
    }

    private dqd(Optional<hi<dsg>> $$0, List<dqa> $$1, boolean $$2, boolean $$3, Optional<he<cnk>> $$4, he.c<cnk> $$5, he<dre> $$6, he<dre> $$7) {
        this($$0, dqd.a($$4, $$5), List.of($$6, $$7));
        if ($$2) {
            this.b();
        }
        if ($$3) {
            this.a();
        }
        this.d.addAll($$1);
        this.g();
    }

    private static he<cnk> a(Optional<? extends he<cnk>> $$0, he<cnk> $$1) {
        if ($$0.isEmpty()) {
            b.error("Unknown biome, defaulting to plains");
            return $$1;
        }
        return $$0.get();
    }

    public dqd(Optional<hi<dsg>> $$0, he<cnk> $$1, List<he<dre>> $$2) {
        this.c = $$0;
        this.e = $$1;
        this.f = Lists.newArrayList();
        this.j = $$2;
    }

    public dqd a(List<dqa> $$0, Optional<hi<dsg>> $$1, he<cnk> $$2) {
        dqd $$3 = new dqd($$1, $$2, this.j);
        for (dqa $$4 : $$0) {
            $$3.d.add(new dqa($$4.a(), $$4.b().b()));
            $$3.g();
        }
        if (this.h) {
            $$3.a();
        }
        if (this.i) {
            $$3.b();
        }
        return $$3;
    }

    public void a() {
        this.h = true;
    }

    public void b() {
        this.i = true;
    }

    public cnl a(he<cnk> $$0) {
        boolean $$4;
        if (!$$0.equals(this.e)) {
            return $$0.a().d();
        }
        cnl $$1 = this.d().a().d();
        cnl.b $$2 = new cnl.b();
        if (this.i) {
            for (he<dre> $$3 : this.j) {
                $$2.a(dhg.b.b, $$3);
            }
        }
        boolean bl2 = $$4 = (!this.g || $$0.a(cnr.a)) && this.h;
        if ($$4) {
            List<hi<dre>> $$5 = $$1.b();
            for (int $$6 = 0; $$6 < $$5.size(); ++$$6) {
                if ($$6 == dhg.b.d.ordinal() || $$6 == dhg.b.e.ordinal() || this.i && $$6 == dhg.b.b.ordinal()) continue;
                hi<dre> $$7 = $$5.get($$6);
                for (he he2 : $$7) {
                    $$2.a($$6, (he<dre>)he2);
                }
            }
        }
        List<dcb> $$9 = this.f();
        for (int $$10 = 0; $$10 < $$9.size(); ++$$10) {
            dcb $$11 = $$9.get($$10);
            if (dhk.a.e.e().test($$11)) continue;
            $$9.set($$10, null);
            $$2.a(dhg.b.k, pb.a(dko.ab, new dmw($$10, $$11), new drh[0]));
        }
        return $$2.a();
    }

    public Optional<hi<dsg>> c() {
        return this.c;
    }

    public he<cnk> d() {
        return this.e;
    }

    public List<dqa> e() {
        return this.d;
    }

    public List<dcb> f() {
        return this.f;
    }

    public void g() {
        this.f.clear();
        for (dqa $$02 : this.d) {
            for (int $$1 = 0; $$1 < $$02.a(); ++$$1) {
                this.f.add($$02.b());
            }
        }
        this.g = this.f.stream().allMatch($$0 -> $$0.a(cpo.a));
    }

    public static dqd a(hf<cnk> $$0, hf<dsg> $$1, hf<dre> $$2) {
        hi.a $$3 = hi.a($$1.b(drt.r), $$1.b(drt.a));
        dqd $$4 = new dqd(Optional.of($$3), dqd.a($$0), dqd.b($$2));
        $$4.e().add(new dqa(1, cpo.F));
        $$4.e().add(new dqa(2, cpo.j));
        $$4.e().add(new dqa(1, cpo.i));
        $$4.g();
        return $$4;
    }

    public static he<cnk> a(hf<cnk> $$0) {
        return $$0.b(cnr.b);
    }

    public static List<he<dre>> b(hf<dre> $$0) {
        return List.of($$0.b(oy.g), $$0.b(oy.h));
    }
}

