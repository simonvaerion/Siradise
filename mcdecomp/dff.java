/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.InflaterInputStream;
import javax.annotation.Nullable;

public class dff {
    private static final Int2ObjectMap<dff> d = new Int2ObjectOpenHashMap();
    public static final dff a = dff.a(new dff(1, $$0 -> new aoj(new GZIPInputStream((InputStream)$$0)), $$0 -> new BufferedOutputStream(new GZIPOutputStream((OutputStream)$$0))));
    public static final dff b = dff.a(new dff(2, $$0 -> new aoj(new InflaterInputStream((InputStream)$$0)), $$0 -> new BufferedOutputStream(new DeflaterOutputStream((OutputStream)$$0))));
    public static final dff c = dff.a(new dff(3, $$0 -> $$0, $$0 -> $$0));
    private final int e;
    private final a<InputStream> f;
    private final a<OutputStream> g;

    private dff(int $$0, a<InputStream> $$1, a<OutputStream> $$2) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    private static dff a(dff $$0) {
        d.put($$0.e, (Object)$$0);
        return $$0;
    }

    @Nullable
    public static dff a(int $$0) {
        return (dff)d.get($$0);
    }

    public static boolean b(int $$0) {
        return d.containsKey($$0);
    }

    public int a() {
        return this.e;
    }

    public OutputStream a(OutputStream $$0) throws IOException {
        return this.g.wrap($$0);
    }

    public InputStream a(InputStream $$0) throws IOException {
        return this.f.wrap($$0);
    }

    @FunctionalInterface
    static interface a<O> {
        public O wrap(O var1) throws IOException;
    }
}

