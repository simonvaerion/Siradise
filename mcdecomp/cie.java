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

public final class cie
extends Record {
    private final acq c;
    private final he<cfu> d;
    private final sw e;
    public static final Codec<cie> a = RecordCodecBuilder.create($$0 -> $$0.group((App)acq.a.fieldOf("asset_id").forGetter(cie::a), (App)acn.a(jc.D).fieldOf("template_item").forGetter(cie::b), (App)aoi.b.fieldOf("description").forGetter(cie::c)).apply((Applicative)$$0, cie::new));
    public static final Codec<he<cie>> b = acm.a(jc.aE, a);

    public cie(acq $$0, he<cfu> $$1, sw $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public sw a(he<cic> $$0) {
        return this.e.e().c($$0.a().e().a());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cie.class, "assetId;templateItem;description", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cie.class, "assetId;templateItem;description", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cie.class, "assetId;templateItem;description", "c", "d", "e"}, this, $$0);
    }

    public acq a() {
        return this.c;
    }

    public he<cfu> b() {
        return this.d;
    }

    public sw c() {
        return this.e;
    }
}

