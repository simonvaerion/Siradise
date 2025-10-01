/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class wc {
    private static final int a = 0x200000;
    private final qr b;
    private final byte[] c;
    private final List<a> d;

    public wc(dei $$0) {
        this.b = new qr();
        for (Map.Entry<dhk.a, dhk> entry : $$0.e()) {
            if (!entry.getKey().b()) continue;
            this.b.a(entry.getKey().a(), new qy(entry.getValue().a()));
        }
        this.c = new byte[wc.a($$0)];
        wc.a(new sf(this.c()), $$0);
        this.d = Lists.newArrayList();
        for (Map.Entry<Object, Object> entry : $$0.G().entrySet()) {
            this.d.add(wc$a.a((czn)entry.getValue()));
        }
    }

    public wc(sf $$0, int $$1, int $$2) {
        this.b = $$0.p();
        if (this.b == null) {
            throw new RuntimeException("Can't read heightmap in packet for [" + $$1 + ", " + $$2 + "]");
        }
        int $$3 = $$0.m();
        if ($$3 > 0x200000) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
        }
        this.c = new byte[$$3];
        $$0.readBytes(this.c);
        this.d = $$0.a(a::new);
    }

    public void a(sf $$02) {
        $$02.a(this.b);
        $$02.d(this.c.length);
        $$02.writeBytes(this.c);
        $$02.a(this.d, ($$0, $$1) -> $$1.a((sf)((Object)$$0)));
    }

    private static int a(dei $$0) {
        int $$1 = 0;
        for (dej $$2 : $$0.d()) {
            $$1 += $$2.j();
        }
        return $$1;
    }

    private ByteBuf c() {
        ByteBuf $$0 = Unpooled.wrappedBuffer((byte[])this.c);
        $$0.writerIndex(0);
        return $$0;
    }

    public static void a(sf $$0, dei $$1) {
        for (dej $$2 : $$1.d()) {
            $$2.c($$0);
        }
    }

    public Consumer<b> a(int $$0, int $$1) {
        return $$2 -> this.a((b)$$2, $$0, $$1);
    }

    private void a(b $$0, int $$1, int $$2) {
        int $$3 = 16 * $$1;
        int $$4 = 16 * $$2;
        gu.a $$5 = new gu.a();
        for (a $$6 : this.d) {
            int $$7 = $$3 + hx.b($$6.a >> 4);
            int $$8 = $$4 + hx.b($$6.a);
            $$5.d($$7, $$6.b, $$8);
            $$0.accept($$5, $$6.c, $$6.d);
        }
    }

    public sf a() {
        return new sf(Unpooled.wrappedBuffer((byte[])this.c));
    }

    public qr b() {
        return this.b;
    }

    static class a {
        final int a;
        final int b;
        final czp<?> c;
        @Nullable
        final qr d;

        private a(int $$0, int $$1, czp<?> $$2, @Nullable qr $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        private a(sf $$0) {
            this.a = $$0.readByte();
            this.b = $$0.readShort();
            this.c = $$0.a(jb.l);
            this.d = $$0.p();
        }

        void a(sf $$0) {
            $$0.writeByte(this.a);
            $$0.writeShort(this.b);
            $$0.a(jb.l, this.c);
            $$0.a(this.d);
        }

        static a a(czn $$0) {
            qr $$1 = $$0.ao_();
            gu $$2 = $$0.p();
            int $$3 = hx.b($$2.u()) << 4 | hx.b($$2.w());
            return new a($$3, $$2.v(), $$0.u(), $$1.g() ? null : $$1);
        }
    }

    @FunctionalInterface
    public static interface b {
        public void accept(gu var1, czp<?> var2, @Nullable qr var3);
    }
}

