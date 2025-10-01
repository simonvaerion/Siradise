/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dfd
implements AutoCloseable {
    private static final Logger c = LogUtils.getLogger();
    private static final int d = 4096;
    @VisibleForTesting
    protected static final int a = 1024;
    private static final int e = 5;
    private static final int f = 0;
    private static final ByteBuffer g = ByteBuffer.allocateDirect(1);
    private static final String h = ".mcc";
    private static final int i = 128;
    private static final int j = 256;
    private static final int k = 0;
    private final FileChannel l;
    private final Path m;
    final dff n;
    private final ByteBuffer o = ByteBuffer.allocateDirect(8192);
    private final IntBuffer p;
    private final IntBuffer q;
    @VisibleForTesting
    protected final dfc b = new dfc();

    public dfd(Path $$0, Path $$1, boolean $$2) throws IOException {
        this($$0, $$1, dff.b, $$2);
    }

    public dfd(Path $$0, Path $$1, dff $$2, boolean $$3) throws IOException {
        this.n = $$2;
        if (!Files.isDirectory($$1, new LinkOption[0])) {
            throw new IllegalArgumentException("Expected directory, got " + $$1.toAbsolutePath());
        }
        this.m = $$1;
        this.p = this.o.asIntBuffer();
        this.p.limit(1024);
        this.o.position(4096);
        this.q = this.o.asIntBuffer();
        this.l = $$3 ? FileChannel.open($$0, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.DSYNC) : FileChannel.open($$0, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
        this.b.a(0, 2);
        this.o.position(0);
        int $$4 = this.l.read(this.o, 0L);
        if ($$4 != -1) {
            if ($$4 != 8192) {
                c.warn("Region file {} has truncated header: {}", (Object)$$0, (Object)$$4);
            }
            long $$5 = Files.size($$0);
            for (int $$6 = 0; $$6 < 1024; ++$$6) {
                int $$7 = this.p.get($$6);
                if ($$7 == 0) continue;
                int $$8 = dfd.b($$7);
                int $$9 = dfd.a($$7);
                if ($$8 < 2) {
                    c.warn("Region file {} has invalid sector at index: {}; sector {} overlaps with header", new Object[]{$$0, $$6, $$8});
                    this.p.put($$6, 0);
                    continue;
                }
                if ($$9 == 0) {
                    c.warn("Region file {} has an invalid sector at index: {}; size has to be > 0", (Object)$$0, (Object)$$6);
                    this.p.put($$6, 0);
                    continue;
                }
                if ((long)$$8 * 4096L > $$5) {
                    c.warn("Region file {} has an invalid sector at index: {}; sector {} is out of bounds", new Object[]{$$0, $$6, $$8});
                    this.p.put($$6, 0);
                    continue;
                }
                this.b.a($$8, $$9);
            }
        }
    }

    private Path f(clt $$0) {
        String $$1 = "c." + $$0.e + "." + $$0.f + h;
        return this.m.resolve($$1);
    }

    @Nullable
    public synchronized DataInputStream a(clt $$0) throws IOException {
        int $$1 = this.g($$0);
        if ($$1 == 0) {
            return null;
        }
        int $$2 = dfd.b($$1);
        int $$3 = dfd.a($$1);
        int $$4 = $$3 * 4096;
        ByteBuffer $$5 = ByteBuffer.allocate($$4);
        this.l.read($$5, $$2 * 4096);
        $$5.flip();
        if ($$5.remaining() < 5) {
            c.error("Chunk {} header is truncated: expected {} but read {}", new Object[]{$$0, $$4, $$5.remaining()});
            return null;
        }
        int $$6 = $$5.getInt();
        byte $$7 = $$5.get();
        if ($$6 == 0) {
            c.warn("Chunk {} is allocated, but stream is missing", (Object)$$0);
            return null;
        }
        int $$8 = $$6 - 1;
        if (dfd.a($$7)) {
            if ($$8 != 0) {
                c.warn("Chunk has both internal and external streams");
            }
            return this.a($$0, dfd.b($$7));
        }
        if ($$8 > $$5.remaining()) {
            c.error("Chunk {} stream is truncated: expected {} but read {}", new Object[]{$$0, $$8, $$5.remaining()});
            return null;
        }
        if ($$8 < 0) {
            c.error("Declared size {} of chunk {} is negative", (Object)$$6, (Object)$$0);
            return null;
        }
        return this.a($$0, $$7, dfd.a($$5, $$8));
    }

    private static int b() {
        return (int)(ac.d() / 1000L);
    }

    private static boolean a(byte $$0) {
        return ($$0 & 0x80) != 0;
    }

    private static byte b(byte $$0) {
        return (byte)($$0 & 0xFFFFFF7F);
    }

    @Nullable
    private DataInputStream a(clt $$0, byte $$1, InputStream $$2) throws IOException {
        dff $$3 = dff.a($$1);
        if ($$3 == null) {
            c.error("Chunk {} has invalid chunk stream version {}", (Object)$$0, (Object)$$1);
            return null;
        }
        return new DataInputStream($$3.a($$2));
    }

    @Nullable
    private DataInputStream a(clt $$0, byte $$1) throws IOException {
        Path $$2 = this.f($$0);
        if (!Files.isRegularFile($$2, new LinkOption[0])) {
            c.error("External chunk path {} is not file", (Object)$$2);
            return null;
        }
        return this.a($$0, $$1, Files.newInputStream($$2, new OpenOption[0]));
    }

    private static ByteArrayInputStream a(ByteBuffer $$0, int $$1) {
        return new ByteArrayInputStream($$0.array(), $$0.position(), $$1);
    }

    private int a(int $$0, int $$1) {
        return $$0 << 8 | $$1;
    }

    private static int a(int $$0) {
        return $$0 & 0xFF;
    }

    private static int b(int $$0) {
        return $$0 >> 8 & 0xFFFFFF;
    }

    private static int c(int $$0) {
        return ($$0 + 4096 - 1) / 4096;
    }

    public boolean b(clt $$0) {
        int $$1 = this.g($$0);
        if ($$1 == 0) {
            return false;
        }
        int $$2 = dfd.b($$1);
        int $$3 = dfd.a($$1);
        ByteBuffer $$4 = ByteBuffer.allocate(5);
        try {
            this.l.read($$4, $$2 * 4096);
            $$4.flip();
            if ($$4.remaining() != 5) {
                return false;
            }
            int $$5 = $$4.getInt();
            byte $$6 = $$4.get();
            if (dfd.a($$6)) {
                if (!dff.b(dfd.b($$6))) {
                    return false;
                }
                if (!Files.isRegularFile(this.f($$0), new LinkOption[0])) {
                    return false;
                }
            } else {
                if (!dff.b($$6)) {
                    return false;
                }
                if ($$5 == 0) {
                    return false;
                }
                int $$7 = $$5 - 1;
                if ($$7 < 0 || $$7 > 4096 * $$3) {
                    return false;
                }
            }
        }
        catch (IOException $$8) {
            return false;
        }
        return true;
    }

    public DataOutputStream c(clt $$0) throws IOException {
        return new DataOutputStream(this.n.a(new a($$0)));
    }

    public void a() throws IOException {
        this.l.force(true);
    }

    public void d(clt $$0) throws IOException {
        int $$1 = dfd.h($$0);
        int $$2 = this.p.get($$1);
        if ($$2 == 0) {
            return;
        }
        this.p.put($$1, 0);
        this.q.put($$1, dfd.b());
        this.d();
        Files.deleteIfExists(this.f($$0));
        this.b.b(dfd.b($$2), dfd.a($$2));
    }

    protected synchronized void a(clt $$0, ByteBuffer $$1) throws IOException {
        b $$13;
        int $$12;
        int $$2 = dfd.h($$0);
        int $$3 = this.p.get($$2);
        int $$4 = dfd.b($$3);
        int $$5 = dfd.a($$3);
        int $$6 = $$1.remaining();
        int $$7 = dfd.c($$6);
        if ($$7 >= 256) {
            Path $$8 = this.f($$0);
            c.warn("Saving oversized chunk {} ({} bytes} to external file {}", new Object[]{$$0, $$6, $$8});
            $$7 = 1;
            int $$9 = this.b.a($$7);
            b $$10 = this.a($$8, $$1);
            ByteBuffer $$11 = this.c();
            this.l.write($$11, $$9 * 4096);
        } else {
            $$12 = this.b.a($$7);
            $$13 = () -> Files.deleteIfExists(this.f($$0));
            this.l.write($$1, $$12 * 4096);
        }
        this.p.put($$2, this.a($$12, $$7));
        this.q.put($$2, dfd.b());
        this.d();
        $$13.run();
        if ($$4 != 0) {
            this.b.b($$4, $$5);
        }
    }

    private ByteBuffer c() {
        ByteBuffer $$0 = ByteBuffer.allocate(5);
        $$0.putInt(1);
        $$0.put((byte)(this.n.a() | 0x80));
        $$0.flip();
        return $$0;
    }

    private b a(Path $$0, ByteBuffer $$1) throws IOException {
        Path $$2 = Files.createTempFile(this.m, "tmp", null, new FileAttribute[0]);
        try (FileChannel $$3 = FileChannel.open($$2, StandardOpenOption.CREATE, StandardOpenOption.WRITE);){
            $$1.position(5);
            $$3.write($$1);
        }
        return () -> Files.move($$2, $$0, StandardCopyOption.REPLACE_EXISTING);
    }

    private void d() throws IOException {
        this.o.position(0);
        this.l.write(this.o, 0L);
    }

    private int g(clt $$0) {
        return this.p.get(dfd.h($$0));
    }

    public boolean e(clt $$0) {
        return this.g($$0) != 0;
    }

    private static int h(clt $$0) {
        return $$0.j() + $$0.k() * 32;
    }

    @Override
    public void close() throws IOException {
        try {
            this.e();
        }
        finally {
            try {
                this.l.force(true);
            }
            finally {
                this.l.close();
            }
        }
    }

    private void e() throws IOException {
        int $$1;
        int $$0 = (int)this.l.size();
        if ($$0 != ($$1 = dfd.c($$0) * 4096)) {
            ByteBuffer $$2 = g.duplicate();
            $$2.position(0);
            this.l.write($$2, $$1 - 1);
        }
    }

    class a
    extends ByteArrayOutputStream {
        private final clt b;

        public a(clt $$0) {
            super(8096);
            super.write(0);
            super.write(0);
            super.write(0);
            super.write(0);
            super.write(dfd.this.n.a());
            this.b = $$0;
        }

        @Override
        public void close() throws IOException {
            ByteBuffer $$0 = ByteBuffer.wrap(this.buf, 0, this.count);
            $$0.putInt(0, this.count - 5 + 1);
            dfd.this.a(this.b, $$0);
        }
    }

    static interface b {
        public void run() throws IOException;
    }
}

