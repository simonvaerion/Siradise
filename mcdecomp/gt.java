/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import java.util.function.Supplier;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class gt {
    private static final Logger c = LogUtils.getLogger();
    public static final Map<ha, j> a = ac.a(Maps.newEnumMap(ha.class), $$0 -> {
        $$0.put(ha.d, j.a());
        $$0.put(ha.f, new j(null, new Quaternionf().rotateY(1.5707964f), null, null));
        $$0.put(ha.e, new j(null, new Quaternionf().rotateY(-1.5707964f), null, null));
        $$0.put(ha.c, new j(null, new Quaternionf().rotateY((float)Math.PI), null, null));
        $$0.put(ha.b, new j(null, new Quaternionf().rotateX(-1.5707964f), null, null));
        $$0.put(ha.a, new j(null, new Quaternionf().rotateX(1.5707964f), null, null));
    });
    public static final Map<ha, j> b = ac.a(Maps.newEnumMap(ha.class), $$0 -> {
        for (ha $$1 : ha.values()) {
            $$0.put($$1, a.get($$1).b());
        }
    });

    public static j a(j $$0) {
        Matrix4f $$1 = new Matrix4f().translation(0.5f, 0.5f, 0.5f);
        $$1.mul((Matrix4fc)$$0.c());
        $$1.translate(-0.5f, -0.5f, -0.5f);
        return new j($$1);
    }

    public static j b(j $$0) {
        Matrix4f $$1 = new Matrix4f().translation(-0.5f, -0.5f, -0.5f);
        $$1.mul((Matrix4fc)$$0.c());
        $$1.translate(0.5f, 0.5f, 0.5f);
        return new j($$1);
    }

    public static j a(j $$0, ha $$1, Supplier<String> $$2) {
        ha $$3 = ha.a($$0.c(), $$1);
        j $$4 = $$0.b();
        if ($$4 == null) {
            c.warn($$2.get());
            return new j(null, null, new Vector3f(0.0f, 0.0f, 0.0f), null);
        }
        j $$5 = b.get($$1).a($$4).a(a.get($$3));
        return gt.a($$5);
    }
}

