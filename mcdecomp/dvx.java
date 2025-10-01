/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvx
implements dwb {
    private static final Logger b = LogUtils.getLogger();
    public static final Codec<dvx> a = RecordCodecBuilder.create($$02 -> $$02.group((App)acq.a.fieldOf("loot_table").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, dvx::new));
    private final acq d;

    public dvx(acq $$0) {
        this.d = $$0;
    }

    @Override
    public qr a(apf $$0, @Nullable qr $$12) {
        qr $$2 = $$12 == null ? new qr() : $$12.h();
        acq.a.encodeStart((DynamicOps)rc.a, (Object)this.d).resultOrPartial(arg_0 -> ((Logger)b).error(arg_0)).ifPresent($$1 -> $$2.a("LootTable", (rk)$$1));
        $$2.a("LootTableSeed", $$0.g());
        return $$2;
    }

    @Override
    public dwc<?> a() {
        return dwc.d;
    }
}

