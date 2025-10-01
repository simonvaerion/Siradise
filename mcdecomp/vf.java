/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public record vf(List<a> a) implements uo<ur>
{
    private static final int b = 0x200000;

    public vf(sf $$0) {
        this($$0.a(a::new));
    }

    public static vf a(List<dei> $$0) {
        return new vf($$0.stream().map(a::new).toList());
    }

    @Override
    public void a(sf $$02) {
        $$02.a(this.a, ($$0, $$1) -> $$1.a((sf)((Object)$$0)));
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{vf.class, "chunkBiomeData", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vf.class, "chunkBiomeData", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vf.class, "chunkBiomeData", "a"}, this, $$0);
    }

    public record a(clt a, byte[] b) {
        private final clt a;
        private final byte[] b;

        public a(dei $$0) {
            this($$0.f(), new byte[vf$a.a($$0)]);
            vf$a.a(new sf(this.d()), $$0);
        }

        public a(sf $$0) {
            this($$0.g(), $$0.b(0x200000));
        }

        private static int a(dei $$0) {
            int $$1 = 0;
            for (dej $$2 : $$0.d()) {
                $$1 += $$2.i().c();
            }
            return $$1;
        }

        public sf a() {
            return new sf(Unpooled.wrappedBuffer((byte[])this.b));
        }

        private ByteBuf d() {
            ByteBuf $$0 = Unpooled.wrappedBuffer((byte[])this.b);
            $$0.writerIndex(0);
            return $$0;
        }

        public static void a(sf $$0, dei $$1) {
            for (dej $$2 : $$1.d()) {
                $$2.i().b($$0);
            }
        }

        public void a(sf $$0) {
            $$0.a(this.a);
            $$0.a(this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "pos;buffer", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "pos;buffer", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "pos;buffer", "a", "b"}, this, $$0);
        }

        public clt b() {
            return this.a;
        }

        public byte[] c() {
            return this.b;
        }
    }
}

