/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.stb.STBVorbis
 *  org.lwjgl.stb.STBVorbisInfo
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.stb.STBVorbis;
import org.lwjgl.stb.STBVorbisInfo;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class egh
implements fyu {
    private static final int a = 8192;
    private long b;
    private final AudioFormat c;
    private final InputStream d;
    private ByteBuffer e = MemoryUtil.memAlloc((int)8192);

    public egh(InputStream $$0) throws IOException {
        this.d = $$0;
        this.e.limit(0);
        try (MemoryStack $$1 = MemoryStack.stackPush();){
            IntBuffer $$2 = $$1.mallocInt(1);
            IntBuffer $$3 = $$1.mallocInt(1);
            while (this.b == 0L) {
                if (!this.c()) {
                    throw new IOException("Failed to find Ogg header");
                }
                int $$4 = this.e.position();
                this.e.position(0);
                this.b = STBVorbis.stb_vorbis_open_pushdata((ByteBuffer)this.e, (IntBuffer)$$2, (IntBuffer)$$3, null);
                this.e.position($$4);
                int $$5 = $$3.get(0);
                if ($$5 == 1) {
                    this.d();
                    continue;
                }
                if ($$5 == 0) continue;
                throw new IOException("Failed to read Ogg file " + $$5);
            }
            this.e.position(this.e.position() + $$2.get(0));
            STBVorbisInfo $$6 = STBVorbisInfo.mallocStack((MemoryStack)$$1);
            STBVorbis.stb_vorbis_get_info((long)this.b, (STBVorbisInfo)$$6);
            this.c = new AudioFormat($$6.sample_rate(), 16, $$6.channels(), true, false);
        }
    }

    private boolean c() throws IOException {
        int $$0 = this.e.limit();
        int $$1 = this.e.capacity() - $$0;
        if ($$1 == 0) {
            return true;
        }
        byte[] $$2 = new byte[$$1];
        int $$3 = this.d.read($$2);
        if ($$3 == -1) {
            return false;
        }
        int $$4 = this.e.position();
        this.e.limit($$0 + $$3);
        this.e.position($$0);
        this.e.put($$2, 0, $$3);
        this.e.position($$4);
        return true;
    }

    private void d() {
        boolean $$1;
        boolean $$0 = this.e.position() == 0;
        boolean bl2 = $$1 = this.e.position() == this.e.limit();
        if ($$1 && !$$0) {
            this.e.position(0);
            this.e.limit(0);
        } else {
            ByteBuffer $$2 = MemoryUtil.memAlloc((int)($$0 ? 2 * this.e.capacity() : this.e.capacity()));
            $$2.put(this.e);
            MemoryUtil.memFree((Buffer)this.e);
            $$2.flip();
            this.e = $$2;
        }
    }

    private boolean a(a $$0) throws IOException {
        if (this.b == 0L) {
            return false;
        }
        try (MemoryStack $$1 = MemoryStack.stackPush();){
            block14: {
                int $$7;
                PointerBuffer $$2 = $$1.mallocPointer(1);
                IntBuffer $$3 = $$1.mallocInt(1);
                IntBuffer $$4 = $$1.mallocInt(1);
                while (true) {
                    int $$5 = STBVorbis.stb_vorbis_decode_frame_pushdata((long)this.b, (ByteBuffer)this.e, (IntBuffer)$$3, (PointerBuffer)$$2, (IntBuffer)$$4);
                    this.e.position(this.e.position() + $$5);
                    int $$6 = STBVorbis.stb_vorbis_get_error((long)this.b);
                    if ($$6 == 1) {
                        this.d();
                        if (this.c()) continue;
                        break block14;
                    }
                    if ($$6 != 0) {
                        throw new IOException("Failed to read Ogg file " + $$6);
                    }
                    $$7 = $$4.get(0);
                    if ($$7 != 0) break;
                }
                int $$8 = $$3.get(0);
                PointerBuffer $$9 = $$2.getPointerBuffer($$8);
                if ($$8 == 1) {
                    this.a($$9.getFloatBuffer(0, $$7), $$0);
                    boolean bl2 = true;
                    return bl2;
                }
                if ($$8 == 2) {
                    this.a($$9.getFloatBuffer(0, $$7), $$9.getFloatBuffer(1, $$7), $$0);
                    boolean bl3 = true;
                    return bl3;
                }
                throw new IllegalStateException("Invalid number of channels: " + $$8);
            }
            boolean bl4 = false;
            return bl4;
        }
    }

    private void a(FloatBuffer $$0, a $$1) {
        while ($$0.hasRemaining()) {
            $$1.a($$0.get());
        }
    }

    private void a(FloatBuffer $$0, FloatBuffer $$1, a $$2) {
        while ($$0.hasRemaining() && $$1.hasRemaining()) {
            $$2.a($$0.get());
            $$2.a($$1.get());
        }
    }

    @Override
    public void close() throws IOException {
        if (this.b != 0L) {
            STBVorbis.stb_vorbis_close((long)this.b);
            this.b = 0L;
        }
        MemoryUtil.memFree((Buffer)this.e);
        this.d.close();
    }

    @Override
    public AudioFormat a() {
        return this.c;
    }

    @Override
    public ByteBuffer a(int $$0) throws IOException {
        a $$1 = new a($$0 + 8192);
        while (this.a($$1) && $$1.c < $$0) {
        }
        return $$1.a();
    }

    public ByteBuffer b() throws IOException {
        a $$0 = new a(16384);
        while (this.a($$0)) {
        }
        return $$0.a();
    }

    static class a {
        private final List<ByteBuffer> a = Lists.newArrayList();
        private final int b;
        int c;
        private ByteBuffer d;

        public a(int $$0) {
            this.b = $$0 + 1 & 0xFFFFFFFE;
            this.b();
        }

        private void b() {
            this.d = BufferUtils.createByteBuffer((int)this.b);
        }

        public void a(float $$0) {
            if (this.d.remaining() == 0) {
                this.d.flip();
                this.a.add(this.d);
                this.b();
            }
            int $$1 = apa.a((int)($$0 * 32767.5f - 0.5f), Short.MIN_VALUE, Short.MAX_VALUE);
            this.d.putShort((short)$$1);
            this.c += 2;
        }

        public ByteBuffer a() {
            this.d.flip();
            if (this.a.isEmpty()) {
                return this.d;
            }
            ByteBuffer $$0 = BufferUtils.createByteBuffer((int)this.c);
            this.a.forEach($$0::put);
            $$0.put(this.d);
            $$0.flip();
            return $$0;
        }
    }
}

