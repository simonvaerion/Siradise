/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.Map;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class eme {
    private static final Map<String, a> a = Maps.newHashMap();
    private static final Logger b = LogUtils.getLogger();
    private static final acq c = new acq("textures/gui/presets/isles.png");

    public static acq a(String $$0, @Nullable String $$1) {
        if ($$1 == null) {
            return c;
        }
        return eme.b($$0, $$1);
    }

    private static acq b(String $$0, String $$1) {
        a $$2 = a.get($$0);
        if ($$2 != null && $$2.a().equals($$1)) {
            return $$2.b;
        }
        ehk $$3 = eme.a($$1);
        if ($$3 == null) {
            acq $$4 = ful.b();
            a.put($$0, new a($$1, $$4));
            return $$4;
        }
        acq $$5 = new acq("realms", "dynamic/" + $$0);
        enn.N().X().a($$5, (fug)new fui($$3));
        a.put($$0, new a($$1, $$5));
        return $$5;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    private static ehk a(String $$0) {
        byte[] $$1 = Base64.getDecoder().decode($$0);
        ByteBuffer $$2 = MemoryUtil.memAlloc((int)$$1.length);
        try {
            ehk ehk2 = ehk.a($$2.put($$1).flip());
            return ehk2;
        }
        catch (IOException $$3) {
            b.warn("Failed to load world image: {}", (Object)$$0, (Object)$$3);
        }
        finally {
            MemoryUtil.memFree((Buffer)$$2);
        }
        return null;
    }

    public static final class a
    extends Record {
        private final String a;
        final acq b;

        public a(String $$0, acq $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "image;textureId", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "image;textureId", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "image;textureId", "a", "b"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        public acq b() {
            return this.b;
        }
    }
}

