/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.UserApiService
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.UserApiService;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class eys {
    private final enn a;
    private final Set<UUID> b = Sets.newHashSet();
    private final UserApiService c;
    private final Map<String, UUID> d = Maps.newHashMap();
    private boolean e;
    private CompletableFuture<?> f = CompletableFuture.completedFuture(null);

    public eys(enn $$0, UserApiService $$1) {
        this.a = $$0;
        this.c = $$1;
    }

    public void a(UUID $$0) {
        this.b.add($$0);
    }

    public void b(UUID $$0) {
        this.b.remove($$0);
    }

    public boolean c(UUID $$0) {
        return this.d($$0) || this.e($$0);
    }

    public boolean d(UUID $$0) {
        return this.b.contains($$0);
    }

    public void a() {
        this.e = true;
        this.f = this.f.thenRunAsync(() -> ((UserApiService)this.c).refreshBlockList(), ac.g());
    }

    public void b() {
        this.e = false;
    }

    public boolean e(UUID $$0) {
        if (!this.e) {
            return false;
        }
        this.f.join();
        return this.c.isBlockedPlayer($$0);
    }

    public Set<UUID> c() {
        return this.b;
    }

    public UUID a(String $$0) {
        return this.d.getOrDefault($$0, ac.c);
    }

    public void a(ffb $$0) {
        euq $$2;
        GameProfile $$1 = $$0.a();
        if ($$1.isComplete()) {
            this.d.put($$1.getName(), $$1.getId());
        }
        if (($$2 = this.a.z) instanceof eyu) {
            eyu $$3 = (eyu)$$2;
            $$3.a($$0);
        }
    }

    public void f(UUID $$0) {
        euq $$1 = this.a.z;
        if ($$1 instanceof eyu) {
            eyu $$2 = (eyu)$$1;
            $$2.a($$0);
        }
    }
}

