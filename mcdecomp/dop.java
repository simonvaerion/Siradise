/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class dop
extends doq {
    public static final int a = 8;
    public static final int b = 15;
    public static final Codec<dop> c = RecordCodecBuilder.create($$02 -> dop.a($$02).and((App)doo.a.fieldOf("mangrove_root_placement").forGetter($$0 -> $$0.h)).apply((Applicative)$$02, dop::new));
    private final doo h;

    public dop(bdc $$0, dot $$1, Optional<don> $$2, doo $$3) {
        super($$0, $$1, $$2);
        this.h = $$3;
    }

    @Override
    public boolean a(cms $$0, BiConsumer<gu, dcb> $$1, apf $$2, gu $$3, gu $$4, dno $$5) {
        ArrayList $$6 = Lists.newArrayList();
        gu.a $$7 = $$3.j();
        while ($$7.v() < $$4.v()) {
            if (!this.a($$0, $$7)) {
                return false;
            }
            $$7.c(ha.b);
        }
        $$6.add($$4.d());
        for (ha $$8 : ha.c.a) {
            ArrayList $$10;
            gu $$9 = $$4.a($$8);
            if (!this.a($$0, $$2, $$9, $$8, $$4, $$10 = Lists.newArrayList(), 0)) {
                return false;
            }
            $$6.addAll($$10);
            $$6.add($$4.a($$8));
        }
        for (gu $$11 : $$6) {
            this.a($$0, $$1, $$2, $$11, $$5);
        }
        return true;
    }

    private boolean a(cms $$0, apf $$1, gu $$2, ha $$3, gu $$4, List<gu> $$5, int $$6) {
        int $$7 = this.h.e();
        if ($$6 == $$7 || $$5.size() > $$7) {
            return false;
        }
        List<gu> $$8 = this.a($$2, $$3, $$1, $$4);
        for (gu $$9 : $$8) {
            if (!this.a($$0, $$9)) continue;
            $$5.add($$9);
            if (this.a($$0, $$1, $$9, $$3, $$4, $$5, $$6 + 1)) continue;
            return false;
        }
        return true;
    }

    protected List<gu> a(gu $$0, ha $$1, apf $$2, gu $$3) {
        gu $$4 = $$0.d();
        gu $$5 = $$0.a($$1);
        int $$6 = $$0.k($$3);
        int $$7 = this.h.d();
        float $$8 = this.h.f();
        if ($$6 > $$7 - 3 && $$6 <= $$7) {
            return $$2.i() < $$8 ? List.of($$4, $$5.d()) : List.of($$4);
        }
        if ($$6 > $$7) {
            return List.of($$4);
        }
        if ($$2.i() < $$8) {
            return List.of($$4);
        }
        return $$2.h() ? List.of($$5) : List.of($$4);
    }

    @Override
    protected boolean a(cms $$02, gu $$1) {
        return super.a($$02, $$1) || $$02.a($$1, (dcb $$0) -> $$0.a(this.h.a()));
    }

    @Override
    protected void a(cms $$02, BiConsumer<gu, dcb> $$1, apf $$2, gu $$3, dno $$4) {
        if ($$02.a($$3, (dcb $$0) -> $$0.a(this.h.b()))) {
            dcb $$5 = this.h.c().a($$2, $$3);
            $$1.accept($$3, this.a($$02, $$3, $$5));
        } else {
            super.a($$02, $$1, $$2, $$3, $$4);
        }
    }

    @Override
    protected dor<?> a() {
        return dor.a;
    }
}

