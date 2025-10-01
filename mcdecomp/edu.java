/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class edu<C> {
    private static final Logger b = LogUtils.getLogger();
    public static final edu<MinecraftServer> a = new edu<MinecraftServer>().a(new edr.a()).a(new eds.a());
    private final Map<acq, edt.a<C, ?>> c = Maps.newHashMap();
    private final Map<Class<?>, edt.a<C, ?>> d = Maps.newHashMap();

    @VisibleForTesting
    public edu() {
    }

    public edu<C> a(edt.a<C, ?> $$0) {
        this.c.put($$0.a(), $$0);
        this.d.put($$0.b(), $$0);
        return this;
    }

    private <T extends edt<C>> edt.a<C, T> a(Class<?> $$0) {
        return this.d.get($$0);
    }

    public <T extends edt<C>> qr a(T $$0) {
        edt.a<T, T> $$1 = this.a($$0.getClass());
        qr $$2 = new qr();
        $$1.a($$2, $$0);
        $$2.a("Type", $$1.a().toString());
        return $$2;
    }

    @Nullable
    public edt<C> a(qr $$0) {
        acq $$1 = acq.a($$0.l("Type"));
        edt.a<C, ?> $$2 = this.c.get($$1);
        if ($$2 == null) {
            b.error("Failed to deserialize timer callback: {}", (Object)$$0);
            return null;
        }
        try {
            return $$2.b($$0);
        }
        catch (Exception $$3) {
            b.error("Failed to deserialize timer callback: {}", (Object)$$0, (Object)$$3);
            return null;
        }
    }
}

