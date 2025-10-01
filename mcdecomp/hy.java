/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.util.UUIDTypeAdapter
 */
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import com.mojang.util.UUIDTypeAdapter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.UUID;

public final class hy {
    public static final Codec<UUID> a = Codec.INT_STREAM.comapFlatMap($$0 -> ac.a($$0, 4).map(hy::a), $$0 -> Arrays.stream(hy.a($$0)));
    public static final Codec<UUID> b = Codec.STRING.comapFlatMap($$0 -> {
        try {
            return DataResult.success((Object)UUID.fromString($$0), (Lifecycle)Lifecycle.stable());
        }
        catch (IllegalArgumentException $$1) {
            return DataResult.error(() -> "Invalid UUID " + $$0 + ": " + $$1.getMessage());
        }
    }, UUID::toString);
    public static Codec<UUID> c = Codec.either(a, (Codec)Codec.STRING.comapFlatMap($$0 -> {
        try {
            return DataResult.success((Object)UUIDTypeAdapter.fromString((String)$$0), (Lifecycle)Lifecycle.stable());
        }
        catch (IllegalArgumentException $$1) {
            return DataResult.error(() -> "Invalid UUID " + $$0 + ": " + $$1.getMessage());
        }
    }, UUIDTypeAdapter::fromUUID)).xmap($$02 -> (UUID)$$02.map($$0 -> $$0, $$0 -> $$0), Either::right);
    public static final int d = 16;
    private static final String e = "OfflinePlayer:";

    private hy() {
    }

    public static UUID a(int[] $$0) {
        return new UUID((long)$$0[0] << 32 | (long)$$0[1] & 0xFFFFFFFFL, (long)$$0[2] << 32 | (long)$$0[3] & 0xFFFFFFFFL);
    }

    public static int[] a(UUID $$0) {
        long $$1 = $$0.getMostSignificantBits();
        long $$2 = $$0.getLeastSignificantBits();
        return hy.a($$1, $$2);
    }

    private static int[] a(long $$0, long $$1) {
        return new int[]{(int)($$0 >> 32), (int)$$0, (int)($$1 >> 32), (int)$$1};
    }

    public static byte[] b(UUID $$0) {
        byte[] $$1 = new byte[16];
        ByteBuffer.wrap($$1).order(ByteOrder.BIG_ENDIAN).putLong($$0.getMostSignificantBits()).putLong($$0.getLeastSignificantBits());
        return $$1;
    }

    public static UUID a(Dynamic<?> $$0) {
        int[] $$1 = $$0.asIntStream().toArray();
        if ($$1.length != 4) {
            throw new IllegalArgumentException("Could not read UUID. Expected int-array of length 4, got " + $$1.length + ".");
        }
        return hy.a($$1);
    }

    public static UUID a(GameProfile $$0) {
        UUID $$1 = $$0.getId();
        if ($$1 == null) {
            $$1 = hy.a($$0.getName());
        }
        return $$1;
    }

    public static UUID a(String $$0) {
        return UUID.nameUUIDFromBytes((e + $$0).getBytes(StandardCharsets.UTF_8));
    }
}

