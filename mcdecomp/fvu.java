/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.google.common.hash.Hashing
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.InsecurePublicKeyException
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.properties.Property
 *  javax.annotation.Nullable
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecurePublicKeyException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class fvu {
    public static final String a = "textures";
    private final fuw b;
    private final File c;
    private final MinecraftSessionService d;
    private final LoadingCache<String, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> e;

    public fvu(fuw $$0, File $$1, final MinecraftSessionService $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build((CacheLoader)new CacheLoader<String, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>>(){

            public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(String $$0) {
                GameProfile $$1 = new GameProfile(null, "dummy_mcdummyface");
                $$1.getProperties().put((Object)fvu.a, (Object)new Property(fvu.a, $$0, ""));
                try {
                    return $$2.getTextures($$1, false);
                }
                catch (Throwable $$22) {
                    return ImmutableMap.of();
                }
            }

            public /* synthetic */ Object load(Object object) throws Exception {
                return this.a((String)object);
            }
        });
    }

    public acq a(MinecraftProfileTexture $$0, MinecraftProfileTexture.Type $$1) {
        return this.a($$0, $$1, null);
    }

    private acq a(MinecraftProfileTexture $$0, MinecraftProfileTexture.Type $$1, @Nullable a $$2) {
        String $$3 = Hashing.sha1().hashUnencodedChars((CharSequence)$$0.getHash()).toString();
        acq $$4 = fvu.a($$1, $$3);
        fug $$5 = this.b.b($$4, ful.c());
        if ($$5 == ful.c()) {
            File $$6 = new File(this.c, $$3.length() > 2 ? $$3.substring(0, 2) : "xx");
            File $$7 = new File($$6, $$3);
            fuj $$8 = new fuj($$7, $$0.getUrl(), fvm.a(), $$1 == MinecraftProfileTexture.Type.SKIN, () -> {
                if ($$2 != null) {
                    $$2.onSkinTextureAvailable($$1, $$4, $$0);
                }
            });
            this.b.a($$4, $$8);
        } else if ($$2 != null) {
            $$2.onSkinTextureAvailable($$1, $$4, $$0);
        }
        return $$4;
    }

    private static acq a(MinecraftProfileTexture.Type $$0, String $$1) {
        String $$2 = switch ($$0) {
            default -> throw new IncompatibleClassChangeError();
            case MinecraftProfileTexture.Type.SKIN -> "skins";
            case MinecraftProfileTexture.Type.CAPE -> "capes";
            case MinecraftProfileTexture.Type.ELYTRA -> "elytra";
        };
        return new acq($$2 + "/" + $$1);
    }

    public void a(GameProfile $$0, a $$1, boolean $$2) {
        Runnable $$3 = () -> {
            HashMap $$3 = Maps.newHashMap();
            try {
                $$3.putAll(this.d.getTextures($$0, $$2));
            }
            catch (InsecurePublicKeyException insecurePublicKeyException) {
                // empty catch block
            }
            if ($$3.isEmpty()) {
                $$0.getProperties().clear();
                if ($$0.getId().equals(enn.N().U().h().getId())) {
                    $$0.getProperties().putAll((Multimap)enn.N().V());
                    $$3.putAll(this.d.getTextures($$0, false));
                } else {
                    this.d.fillProfileProperties($$0, $$2);
                    try {
                        $$3.putAll(this.d.getTextures($$0, $$2));
                    }
                    catch (InsecurePublicKeyException insecurePublicKeyException) {
                        // empty catch block
                    }
                }
            }
            enn.N().execute(() -> RenderSystem.recordRenderCall(() -> ImmutableList.of((Object)MinecraftProfileTexture.Type.SKIN, (Object)MinecraftProfileTexture.Type.CAPE).forEach($$2 -> {
                if ($$3.containsKey($$2)) {
                    this.a((MinecraftProfileTexture)$$3.get($$2), (MinecraftProfileTexture.Type)$$2, $$1);
                }
            })));
        };
        ac.f().execute($$3);
    }

    public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(GameProfile $$0) {
        Property $$1 = (Property)Iterables.getFirst((Iterable)$$0.getProperties().get((Object)a), null);
        if ($$1 == null) {
            return ImmutableMap.of();
        }
        return (Map)this.e.getUnchecked((Object)$$1.getValue());
    }

    public acq b(GameProfile $$0) {
        MinecraftProfileTexture $$1 = this.a($$0).get(MinecraftProfileTexture.Type.SKIN);
        if ($$1 != null) {
            return this.a($$1, MinecraftProfileTexture.Type.SKIN);
        }
        return fvm.a(hy.a($$0));
    }

    public static interface a {
        public void onSkinTextureAvailable(MinecraftProfileTexture.Type var1, acq var2, MinecraftProfileTexture var3);
    }
}

