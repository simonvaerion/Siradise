/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.ServicesKeySet
 *  com.mojang.authlib.yggdrasil.ServicesKeyType
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  javax.annotation.Nullable
 */
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import javax.annotation.Nullable;

public record adh(MinecraftSessionService a, ServicesKeySet b, GameProfileRepository c, alg d) {
    private final MinecraftSessionService a;
    private final ServicesKeySet b;
    private final GameProfileRepository c;
    private final alg d;
    private static final String e = "usercache.json";

    public static adh a(YggdrasilAuthenticationService $$0, File $$1) {
        MinecraftSessionService $$2 = $$0.createMinecraftSessionService();
        GameProfileRepository $$3 = $$0.createProfileRepository();
        alg $$4 = new alg($$3, new File($$1, e));
        return new adh($$2, $$0.getServicesKeySet(), $$3, $$4);
    }

    @Nullable
    public apj a() {
        return apj.a(this.b, ServicesKeyType.PROFILE_KEY);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{adh.class, "sessionService;servicesKeySet;profileRepository;profileCache", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{adh.class, "sessionService;servicesKeySet;profileRepository;profileCache", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{adh.class, "sessionService;servicesKeySet;profileRepository;profileCache", "a", "b", "c", "d"}, this, $$0);
    }

    public MinecraftSessionService b() {
        return this.a;
    }

    public ServicesKeySet c() {
        return this.b;
    }

    public GameProfileRepository d() {
        return this.c;
    }

    public alg e() {
        return this.d;
    }
}

