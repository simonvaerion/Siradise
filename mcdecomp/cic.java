/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;

public final class cic
extends Record {
    private final String c;
    private final he<cfu> d;
    private final float e;
    private final Map<cdl, String> f;
    private final sw g;
    public static final Codec<cic> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.fieldOf("asset_name").forGetter(cic::a), (App)acn.a(jc.D).fieldOf("ingredient").forGetter(cic::b), (App)Codec.FLOAT.fieldOf("item_model_index").forGetter(cic::c), (App)Codec.unboundedMap(cdl.h, (Codec)Codec.STRING).optionalFieldOf("override_armor_materials", Map.of()).forGetter(cic::d), (App)aoi.b.fieldOf("description").forGetter(cic::e)).apply((Applicative)$$0, cic::new));
    public static final Codec<he<cic>> b = acm.a(jc.aD, a);

    public cic(String $$0, he<cfu> $$1, float $$2, Map<cdl, String> $$3, sw $$4) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
    }

    public static cic a(String $$0, cfu $$1, float $$2, sw $$3, Map<cdl, String> $$4) {
        return new cic($$0, jb.i.d($$1), $$2, $$4, $$3);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cic.class, "assetName;ingredient;itemModelIndex;overrideArmorMaterials;description", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cic.class, "assetName;ingredient;itemModelIndex;overrideArmorMaterials;description", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cic.class, "assetName;ingredient;itemModelIndex;overrideArmorMaterials;description", "c", "d", "e", "f", "g"}, this, $$0);
    }

    public String a() {
        return this.c;
    }

    public he<cfu> b() {
        return this.d;
    }

    public float c() {
        return this.e;
    }

    public Map<cdl, String> d() {
        return this.f;
    }

    public sw e() {
        return this.g;
    }
}

