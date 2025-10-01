/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  com.google.common.hash.HashingOutputStream
 *  com.google.gson.JsonElement
 *  com.google.gson.stream.JsonWriter
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.slf4j.Logger
 */
import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.concurrent.CompletableFuture;
import java.util.function.ToIntFunction;
import org.slf4j.Logger;

public interface ji {
    public static final ToIntFunction<String> a = (ToIntFunction)ac.a(new Object2IntOpenHashMap(), $$0 -> {
        $$0.put((Object)"type", 0);
        $$0.put((Object)"parent", 1);
        $$0.defaultReturnValue(2);
    });
    public static final Comparator<String> b = Comparator.comparingInt(a).thenComparing($$0 -> $$0);
    public static final Logger c = LogUtils.getLogger();

    public CompletableFuture<?> a(jg var1);

    public String a();

    public static CompletableFuture<?> a(jg $$0, JsonElement $$1, Path $$2) {
        return CompletableFuture.runAsync(() -> {
            try {
                ByteArrayOutputStream $$3 = new ByteArrayOutputStream();
                HashingOutputStream $$4 = new HashingOutputStream(Hashing.sha1(), (OutputStream)$$3);
                try (JsonWriter $$5 = new JsonWriter((Writer)new OutputStreamWriter((OutputStream)$$4, StandardCharsets.UTF_8));){
                    $$5.setSerializeNulls(false);
                    $$5.setIndent("  ");
                    aor.a($$5, $$1, b);
                }
                $$0.writeIfNeeded($$2, $$3.toByteArray(), $$4.hash());
            }
            catch (IOException $$6) {
                c.error("Failed to save file to {}", (Object)$$2, (Object)$$6);
            }
        }, ac.f());
    }

    @FunctionalInterface
    public static interface a<T extends ji> {
        public T create(jk var1);
    }
}

