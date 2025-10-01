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

public class dtb
extends dth {
    public static final Codec<dtb> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dre.b.fieldOf("feature").forGetter($$0 -> $$0.b), dtb.d()).apply((Applicative)$$02, dtb::new));
    private final he<dre> b;
    private final qr c;

    protected dtb(he<dre> $$0, dtj.a $$1) {
        super($$1);
        this.b = $$0;
        this.c = this.b();
    }

    private qr b() {
        qr $$0 = new qr();
        $$0.a("name", "minecraft:bottom");
        $$0.a("final_state", "minecraft:air");
        $$0.a("pool", "minecraft:empty");
        $$0.a("target", "minecraft:empty");
        $$0.a("joint", dam.a.a.c());
        return $$0;
    }

    @Override
    public hz a(dvu $$0, cvz $$1) {
        return hz.g;
    }

    @Override
    public List<dvt.c> a(dvu $$0, gu $$1, cvz $$2, apf $$3) {
        ArrayList $$4 = Lists.newArrayList();
        $$4.add(new dvt.c($$1, (dcb)cpo.pb.n().a(ctm.a, hc.a(ha.a, ha.d)), this.c));
        return $$4;
    }

    @Override
    public drs a(dvu $$0, gu $$1, cvz $$2) {
        hz $$3 = this.a($$0, $$2);
        return new drs($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
    }

    @Override
    public boolean a(dvu $$0, cng $$1, cne $$2, ddy $$3, gu $$4, gu $$5, cvz $$6, drs $$7, apf $$8, boolean $$9) {
        return this.b.a().a($$1, $$3, $$8, $$4);
    }

    @Override
    public dti<?> a() {
        return dti.c;
    }

    public String toString() {
        return "Feature[" + this.b + "]";
    }
}

