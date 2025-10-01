/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.UserApiService
 */
import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface ffc {
    public static final ffc a = new ffc(){

        @Override
        public CompletableFuture<Optional<byq>> a() {
            return CompletableFuture.completedFuture(Optional.empty());
        }

        @Override
        public boolean b() {
            return false;
        }
    };

    public static ffc a(UserApiService $$0, eoc $$1, Path $$2) {
        if ($$1.i() == eoc.a.c) {
            return new fes($$0, $$1.h().getId(), $$2);
        }
        return a;
    }

    public CompletableFuture<Optional<byq>> a();

    public boolean b();
}

