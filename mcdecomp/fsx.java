/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fsx
extends ftg<brx, fbu<brx>> {
    private static final Map<brx.a, acq> a = ImmutableMap.of((Object)((Object)brx.a.b), (Object)new acq("textures/entity/iron_golem/iron_golem_crackiness_low.png"), (Object)((Object)brx.a.c), (Object)new acq("textures/entity/iron_golem/iron_golem_crackiness_medium.png"), (Object)((Object)brx.a.d), (Object)new acq("textures/entity/iron_golem/iron_golem_crackiness_high.png"));

    public fsx(fqt<brx, fbu<brx>> $$0) {
        super($$0);
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, brx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        if ($$3.cb()) {
            return;
        }
        brx.a $$10 = $$3.r();
        if ($$10 == brx.a.a) {
            return;
        }
        acq $$11 = a.get((Object)$$10);
        fsx.a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0f, 1.0f, 1.0f);
    }
}

