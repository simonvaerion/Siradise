/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface ajl
extends AutoCloseable {
    public static final String b = ".mcmeta";
    public static final String c = "pack.mcmeta";

    @Nullable
    public akp<InputStream> a(String ... var1);

    @Nullable
    public akp<InputStream> a(ajm var1, acq var2);

    public void a(ajm var1, String var2, String var3, a var4);

    public Set<String> a(ajm var1);

    @Nullable
    public <T> T a(ajx<T> var1) throws IOException;

    public String a();

    default public boolean b() {
        return false;
    }

    @Override
    public void close();

    @FunctionalInterface
    public static interface a
    extends BiConsumer<acq, akp<InputStream>> {
    }
}

