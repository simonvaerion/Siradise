/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.gson.JsonParser
 *  com.mojang.authlib.exceptions.MinecraftClientException
 *  com.mojang.authlib.minecraft.InsecurePublicKeyException$MissingException
 *  com.mojang.authlib.minecraft.UserApiService
 *  com.mojang.authlib.yggdrasil.response.KeyPairResponse
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Strings;
import com.google.gson.JsonParser;
import com.mojang.authlib.exceptions.MinecraftClientException;
import com.mojang.authlib.minecraft.InsecurePublicKeyException;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.yggdrasil.response.KeyPairResponse;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.security.PublicKey;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fes
implements ffc {
    private static final Logger b = LogUtils.getLogger();
    private static final Duration c = Duration.ofHours(1L);
    private static final Path d = Path.of("profilekeys", new String[0]);
    private final UserApiService e;
    private final Path f;
    private CompletableFuture<Optional<byq>> g;
    private Instant h = Instant.EPOCH;

    public fes(UserApiService $$0, UUID $$1, Path $$2) {
        this.e = $$0;
        this.f = $$2.resolve(d).resolve($$1 + ".json");
        this.g = CompletableFuture.supplyAsync(() -> this.c().filter($$0 -> !$$0.c().b().a()), ac.f()).thenCompose(this::a);
    }

    @Override
    public CompletableFuture<Optional<byq>> a() {
        this.h = Instant.now().plus(c);
        this.g = this.g.thenCompose(this::a);
        return this.g;
    }

    @Override
    public boolean b() {
        if (this.g.isDone() && Instant.now().isAfter(this.h)) {
            return this.g.join().map(byq::a).orElse(true);
        }
        return false;
    }

    private CompletableFuture<Optional<byq>> a(Optional<byq> $$0) {
        return CompletableFuture.supplyAsync(() -> {
            if ($$0.isPresent() && !((byq)$$0.get()).a()) {
                if (!aa.aS) {
                    this.a((byq)null);
                }
                return $$0;
            }
            try {
                byq $$1 = this.a(this.e);
                this.a($$1);
                return Optional.of($$1);
            }
            catch (aoa | MinecraftClientException | IOException $$2) {
                b.error("Failed to retrieve profile key pair", $$2);
                this.a((byq)null);
                return $$0;
            }
        }, ac.f());
    }

    private Optional<byq> c() {
        Optional optional;
        block9: {
            if (Files.notExists(this.f, new LinkOption[0])) {
                return Optional.empty();
            }
            BufferedReader $$0 = Files.newBufferedReader(this.f);
            try {
                optional = byq.a.parse((DynamicOps)JsonOps.INSTANCE, (Object)JsonParser.parseReader((Reader)$$0)).result();
                if ($$0 == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if ($$0 != null) {
                        try {
                            $$0.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception $$1) {
                    b.error("Failed to read profile key pair file {}", (Object)this.f, (Object)$$1);
                    return Optional.empty();
                }
            }
            $$0.close();
        }
        return optional;
    }

    private void a(@Nullable byq $$02) {
        try {
            Files.deleteIfExists(this.f);
        }
        catch (IOException $$1) {
            b.error("Failed to delete profile key pair file {}", (Object)this.f, (Object)$$1);
        }
        if ($$02 == null) {
            return;
        }
        if (!aa.aS) {
            return;
        }
        byq.a.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)$$02).result().ifPresent($$0 -> {
            try {
                Files.createDirectories(this.f.getParent(), new FileAttribute[0]);
                Files.writeString(this.f, (CharSequence)$$0.toString(), new OpenOption[0]);
            }
            catch (Exception $$1) {
                b.error("Failed to write profile key pair file {}", (Object)this.f, (Object)$$1);
            }
        });
    }

    private byq a(UserApiService $$0) throws aoa, IOException {
        KeyPairResponse $$1 = $$0.getKeyPair();
        if ($$1 != null) {
            byr.a $$2 = fes.a($$1);
            return new byq(anz.a($$1.getPrivateKey()), new byr($$2), Instant.parse($$1.getRefreshedAfter()));
        }
        throw new IOException("Could not retrieve profile key pair");
    }

    private static byr.a a(KeyPairResponse $$0) throws aoa {
        if (Strings.isNullOrEmpty((String)$$0.getPublicKey()) || $$0.getPublicKeySignature() == null || $$0.getPublicKeySignature().array().length == 0) {
            throw new aoa((Throwable)new InsecurePublicKeyException.MissingException());
        }
        try {
            Instant $$1 = Instant.parse($$0.getExpiresAt());
            PublicKey $$2 = anz.b($$0.getPublicKey());
            ByteBuffer $$3 = $$0.getPublicKeySignature();
            return new byr.a($$1, $$2, $$3.array());
        }
        catch (IllegalArgumentException | DateTimeException $$4) {
            throw new aoa($$4);
        }
    }
}

