/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvb
extends dvq {
    private static final Logger c = LogUtils.getLogger();
    public static final Codec<dvb> a = Codec.unit(() -> b);
    public static final dvb b = new dvb();

    private dvb() {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Nullable
    public dvt.c a(cmp $$0, gu $$1, gu $$2, dvt.c $$3, dvt.c $$4, dvp $$5) {
        void $$11;
        dcb $$6 = $$4.b();
        if (!$$6.a(cpo.pb)) {
            return $$4;
        }
        if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", (Object)$$1);
            return $$4;
        }
        String $$7 = $$4.c().l("final_state");
        try {
            fg.a $$8 = fg.a($$0.a(jc.e), $$7, true);
            dcb $$9 = $$8.a();
        }
        catch (CommandSyntaxException $$10) {
            throw new RuntimeException($$10);
        }
        if ($$11.a(cpo.kN)) {
            return null;
        }
        return new dvt.c($$4.a(), (dcb)$$11, null);
    }

    @Override
    protected dvs<?> a() {
        return dvs.h;
    }
}

