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

public class foh<T extends btj>
extends fnu<T, fat<T>> {
    private static final Map<bfn<?>, acq> a = Maps.newHashMap((Map)ImmutableMap.of(bfn.w, (Object)new acq("textures/entity/horse/donkey.png"), bfn.ap, (Object)new acq("textures/entity/horse/mule.png")));

    public foh(foy.a $$0, float $$1, fec $$2) {
        super($$0, new fat($$0.a($$2)), $$1);
    }

    @Override
    public acq a(T $$0) {
        return a.get(((bfj)$$0).ae());
    }
}

