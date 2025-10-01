/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class fvg
implements fuz {
    private static final Logger c = LogUtils.getLogger();
    public static final Codec<fvg> b = RecordCodecBuilder.create($$02 -> $$02.group((App)acq.a.fieldOf("resource").forGetter($$0 -> $$0.d), (App)acq.a.optionalFieldOf("sprite").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, fvg::new));
    private final acq d;
    private final Optional<acq> e;

    public fvg(acq $$0, Optional<acq> $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    public void a(akx $$0, fuz.a $$1) {
        acq $$2 = a.a(this.d);
        Optional<akv> $$3 = $$0.getResource($$2);
        if ($$3.isPresent()) {
            $$1.a(this.e.orElse(this.d), $$3.get());
        } else {
            c.warn("Missing sprite: {}", (Object)$$2);
        }
    }

    @Override
    public fva a() {
        return fvb.a;
    }
}

