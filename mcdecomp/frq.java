/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class frq
extends fnu<btk, fbq<btk>> {
    private static final Map<bfn<?>, acq> a = Maps.newHashMap((Map)ImmutableMap.of(bfn.bq, (Object)new acq("textures/entity/horse/horse_zombie.png"), bfn.aK, (Object)new acq("textures/entity/horse/horse_skeleton.png")));

    public frq(foy.a $$0, fec $$1) {
        super($$0, new fbq($$0.a($$1)), 1.0f);
    }

    @Override
    public acq a(btk $$0) {
        return a.get($$0.ae());
    }
}

