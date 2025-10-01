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
import java.util.List;

public class dkt
implements dms {
    public static final Codec<dkt> a = RecordCodecBuilder.create($$02 -> $$02.group((App)acq.a.listOf().fieldOf("fossil_structures").forGetter($$0 -> $$0.b), (App)acq.a.listOf().fieldOf("overlay_structures").forGetter($$0 -> $$0.c), (App)dvs.d.fieldOf("fossil_processors").forGetter($$0 -> $$0.d), (App)dvs.d.fieldOf("overlay_processors").forGetter($$0 -> $$0.e), (App)Codec.intRange((int)0, (int)7).fieldOf("max_empty_corners_allowed").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, dkt::new));
    public final List<acq> b;
    public final List<acq> c;
    public final he<dvr> d;
    public final he<dvr> e;
    public final int f;

    public dkt(List<acq> $$0, List<acq> $$1, he<dvr> $$2, he<dvr> $$3, int $$4) {
        if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Fossil structure lists need at least one entry");
        }
        if ($$0.size() != $$1.size()) {
            throw new IllegalArgumentException("Fossil structure lists must be equal lengths");
        }
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }
}

