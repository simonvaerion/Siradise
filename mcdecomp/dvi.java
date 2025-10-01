/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dvi {
    public static final dwa a = dwa.a;
    public static final Codec<dvi> b = RecordCodecBuilder.create($$02 -> $$02.group((App)dvn.c.fieldOf("input_predicate").forGetter($$0 -> $$0.c), (App)dvn.c.fieldOf("location_predicate").forGetter($$0 -> $$0.d), (App)dvg.c.optionalFieldOf("position_predicate", (Object)dvf.b).forGetter($$0 -> $$0.e), (App)dcb.b.fieldOf("output_state").forGetter($$0 -> $$0.f), (App)dwb.c.optionalFieldOf("block_entity_modifier", (Object)a).forGetter($$0 -> $$0.g)).apply((Applicative)$$02, dvi::new));
    private final dvn c;
    private final dvn d;
    private final dvg e;
    private final dcb f;
    private final dwb g;

    public dvi(dvn $$0, dvn $$1, dcb $$2) {
        this($$0, $$1, dvf.b, $$2);
    }

    public dvi(dvn $$0, dvn $$1, dvg $$2, dcb $$3) {
        this($$0, $$1, $$2, $$3, a);
    }

    public dvi(dvn $$0, dvn $$1, dvg $$2, dcb $$3, dwb $$4) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
    }

    public boolean a(dcb $$0, dcb $$1, gu $$2, gu $$3, gu $$4, apf $$5) {
        return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
    }

    public dcb a() {
        return this.f;
    }

    @Nullable
    public qr a(apf $$0, @Nullable qr $$1) {
        return this.g.a($$0, $$1);
    }
}

