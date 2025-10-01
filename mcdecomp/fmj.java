/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;
import javax.annotation.Nullable;

public class fmj
implements flu<dax> {
    private final Map<cwp.a, fdc> a;
    private static final Map<cwp.a, acq> b = ac.a(Maps.newHashMap(), (T $$0) -> {
        $$0.put(cwp.b.a, new acq("textures/entity/skeleton/skeleton.png"));
        $$0.put(cwp.b.b, new acq("textures/entity/skeleton/wither_skeleton.png"));
        $$0.put(cwp.b.d, new acq("textures/entity/zombie/zombie.png"));
        $$0.put(cwp.b.e, new acq("textures/entity/creeper/creeper.png"));
        $$0.put(cwp.b.g, new acq("textures/entity/enderdragon/dragon.png"));
        $$0.put(cwp.b.f, new acq("textures/entity/piglin/piglin.png"));
        $$0.put(cwp.b.c, fvm.a());
    });

    public static Map<cwp.a, fdc> a(fea $$0) {
        ImmutableMap.Builder $$1 = ImmutableMap.builder();
        $$1.put((Object)cwp.b.a, (Object)new fdb($$0.a(fed.bl)));
        $$1.put((Object)cwp.b.b, (Object)new fdb($$0.a(fed.bT)));
        $$1.put((Object)cwp.b.c, (Object)new fdb($$0.a(fed.aN)));
        $$1.put((Object)cwp.b.d, (Object)new fdb($$0.a(fed.bY)));
        $$1.put((Object)cwp.b.e, (Object)new fdb($$0.a(fed.D)));
        $$1.put((Object)cwp.b.g, (Object)new fdy($$0.a(fed.K)));
        $$1.put((Object)cwp.b.f, (Object)new fci($$0.a(fed.aH)));
        return $$1.build();
    }

    public fmj(flv.a $$0) {
        this.a = fmj.a($$0.e());
    }

    @Override
    public void a(dax $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
        float $$6 = $$0.a($$1);
        dcb $$7 = $$0.q();
        boolean $$8 = $$7.b() instanceof cym;
        ha $$9 = $$8 ? $$7.c(cym.a) : null;
        int $$10 = $$8 ? ddh.a($$9.g()) : $$7.c(cwp.b);
        float $$11 = ddh.b($$10);
        cwp.a $$12 = ((coj)$$7.b()).a();
        fdc $$13 = this.a.get($$12);
        fkf $$14 = fmj.a($$12, $$0.d());
        fmj.a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
    }

    public static void a(@Nullable ha $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5, fdc $$6, fkf $$7) {
        $$3.a();
        if ($$0 == null) {
            $$3.a(0.5f, 0.0f, 0.5f);
        } else {
            float $$8 = 0.25f;
            $$3.a(0.5f - (float)$$0.j() * 0.25f, 0.25f, 0.5f - (float)$$0.l() * 0.25f);
        }
        $$3.b(-1.0f, -1.0f, 1.0f);
        ein $$9 = $$4.getBuffer($$7);
        $$6.a($$2, $$1, 0.0f);
        $$6.a($$3, $$9, $$5, fum.d, 1.0f, 1.0f, 1.0f, 1.0f);
        $$3.b();
    }

    public static fkf a(cwp.a $$0, @Nullable GameProfile $$1) {
        acq $$2 = b.get($$0);
        if ($$0 != cwp.b.c || $$1 == null) {
            return fkf.e($$2);
        }
        enn $$3 = enn.N();
        Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> $$4 = $$3.ak().a($$1);
        if ($$4.containsKey(MinecraftProfileTexture.Type.SKIN)) {
            return fkf.h($$3.ak().a($$4.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN));
        }
        return fkf.d(fvm.a(hy.a($$1)));
    }
}

