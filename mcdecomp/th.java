/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.google.common.base.Preconditions;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nullable;

public final class th
extends Record {
    private final byte[] c;
    public static final Codec<th> a = aoi.n.xmap(th::new, th::b);
    public static final int b = 256;

    public th(byte[] $$0) {
        Preconditions.checkState(($$0.length == 256 ? 1 : 0) != 0, (Object)"Invalid message signature size");
        this.c = $$0;
    }

    public static th a(sf $$0) {
        byte[] $$1 = new byte[256];
        $$0.readBytes($$1);
        return new th($$1);
    }

    public static void a(sf $$0, th $$1) {
        $$0.writeBytes($$1.c);
    }

    public boolean a(apj $$0, api $$1) {
        return $$0.validate($$1, this.c);
    }

    public ByteBuffer a() {
        return ByteBuffer.wrap(this.c);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) return true;
        if (!($$0 instanceof th)) return false;
        th $$1 = (th)$$0;
        if (!Arrays.equals(this.c, $$1.c)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.c);
    }

    @Override
    public String toString() {
        return Base64.getEncoder().encodeToString(this.c);
    }

    public a a(ti $$0) {
        int $$1 = $$0.a(this);
        return $$1 != -1 ? new a($$1) : new a(this);
    }

    public byte[] b() {
        return this.c;
    }

    public static final class a
    extends Record {
        private final int b;
        @Nullable
        private final th c;
        public static final int a = -1;

        public a(th $$0) {
            this(-1, $$0);
        }

        public a(int $$0) {
            this($$0, null);
        }

        public a(int $$0, @Nullable th $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public static a a(sf $$0) {
            int $$1 = $$0.m() - 1;
            if ($$1 == -1) {
                return new a(th.a($$0));
            }
            return new a($$1);
        }

        public static void a(sf $$0, a $$1) {
            $$0.d($$1.a() + 1);
            if ($$1.b() != null) {
                th.a($$0, $$1.b());
            }
        }

        public Optional<th> a(ti $$0) {
            if (this.c != null) {
                return Optional.of(this.c);
            }
            return Optional.ofNullable($$0.a(this.b));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id;fullSignature", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;fullSignature", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;fullSignature", "b", "c"}, this, $$0);
        }

        public int a() {
            return this.b;
        }

        @Nullable
        public th b() {
            return this.c;
        }
    }
}

