/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonIOException
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  javax.annotation.Nullable
 */
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

public class baa<T>
implements Closeable {
    private static final Gson a = new Gson();
    private final Codec<T> b;
    final FileChannel c;
    private final AtomicInteger d = new AtomicInteger(1);

    public baa(Codec<T> $$0, FileChannel $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static <T> baa<T> a(Codec<T> $$0, Path $$1) throws IOException {
        FileChannel $$2 = FileChannel.open($$1, StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);
        return new baa<T>($$0, $$2);
    }

    public void a(T $$0) throws IOException, JsonIOException {
        JsonElement $$1 = (JsonElement)ac.a(this.b.encodeStart((DynamicOps)JsonOps.INSTANCE, $$0), IOException::new);
        this.c.position(this.c.size());
        Writer $$2 = Channels.newWriter((WritableByteChannel)this.c, StandardCharsets.UTF_8);
        a.toJson($$1, (Appendable)$$2);
        $$2.write(10);
        $$2.flush();
    }

    public bab<T> a() throws IOException {
        if (this.d.get() <= 0) {
            throw new IOException("Event log has already been closed");
        }
        this.d.incrementAndGet();
        final bab<T> $$0 = bab.a(this.b, Channels.newReader((ReadableByteChannel)this.c, StandardCharsets.UTF_8));
        return new bab<T>(){
            private volatile long c;

            @Override
            @Nullable
            public T a() throws IOException {
                try {
                    baa.this.c.position(this.c);
                    Object t2 = $$0.a();
                    return t2;
                }
                finally {
                    this.c = baa.this.c.position();
                }
            }

            @Override
            public void close() throws IOException {
                baa.this.b();
            }
        };
    }

    @Override
    public void close() throws IOException {
        this.b();
    }

    void b() throws IOException {
        if (this.d.decrementAndGet() <= 0) {
            this.c.close();
        }
    }
}

