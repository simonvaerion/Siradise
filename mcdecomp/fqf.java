/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class fqf
extends fqe<bry, fay<bry>> {
    private static final Map<bry.a, acq> a = ac.a(Maps.newHashMap(), $$0 -> {
        $$0.put(bry.a.b, new acq("textures/entity/cow/brown_mooshroom.png"));
        $$0.put(bry.a.a, new acq("textures/entity/cow/red_mooshroom.png"));
    });

    public fqf(foy.a $$0) {
        super($$0, new fay($$0.a(fed.aw)), 0.7f);
        this.a(new ftb<bry>(this, $$0.c()));
    }

    @Override
    public acq a(bry $$0) {
        return a.get($$0.r());
    }
}

