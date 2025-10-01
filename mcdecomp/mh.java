/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.hash.HashCode
 *  com.google.common.hash.Hashing
 *  com.google.common.hash.HashingOutputStream
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class mh
implements ji {
    @Nullable
    private static final Path d = null;
    private static final Logger e = LogUtils.getLogger();
    private final jk f;
    private final Iterable<Path> g;
    private final List<a> h = Lists.newArrayList();

    public mh(jk $$0, Iterable<Path> $$1) {
        this.f = $$0;
        this.g = $$1;
    }

    public mh a(a $$0) {
        this.h.add($$0);
        return this;
    }

    private qr a(String $$0, qr $$1) {
        qr $$2 = $$1;
        for (a $$3 : this.h) {
            $$2 = $$3.apply($$0, $$2);
        }
        return $$2;
    }

    @Override
    public CompletableFuture<?> a(jg $$02) {
        Path $$1 = this.f.a();
        ArrayList $$2 = Lists.newArrayList();
        for (Path $$3 : this.g) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
                CompletableFuture<Void> completableFuture;
                block8: {
                    Stream<Path> $$32 = Files.walk($$3, new FileVisitOption[0]);
                    try {
                        completableFuture = CompletableFuture.allOf((CompletableFuture[])$$32.filter($$0 -> $$0.toString().endsWith(".snbt")).map($$3 -> CompletableFuture.runAsync(() -> {
                            c $$4 = this.a((Path)$$3, this.a($$3, (Path)$$3));
                            this.a($$02, $$4, $$1);
                        }, ac.f())).toArray(CompletableFuture[]::new));
                        if ($$32 == null) break block8;
                    }
                    catch (Throwable throwable) {
                        try {
                            if ($$32 != null) {
                                try {
                                    $$32.close();
                                }
                                catch (Throwable throwable2) {
                                    throwable.addSuppressed(throwable2);
                                }
                            }
                            throw throwable;
                        }
                        catch (Exception $$4) {
                            throw new RuntimeException("Failed to read structure input directory, aborting", $$4);
                        }
                    }
                    $$32.close();
                }
                return completableFuture;
            }, ac.f()).thenCompose($$0 -> $$0));
        }
        return ac.c($$2);
    }

    @Override
    public final String a() {
        return "SNBT -> NBT";
    }

    private String a(Path $$0, Path $$1) {
        String $$2 = $$0.relativize($$1).toString().replaceAll("\\\\", "/");
        return $$2.substring(0, $$2.length() - ".snbt".length());
    }

    private c a(Path $$0, String $$1) {
        c c2;
        block10: {
            BufferedReader $$2 = Files.newBufferedReader($$0);
            try {
                String $$10;
                String $$3 = IOUtils.toString((Reader)$$2);
                qr $$4 = this.a($$1, rd.a($$3));
                ByteArrayOutputStream $$5 = new ByteArrayOutputStream();
                HashingOutputStream $$6 = new HashingOutputStream(Hashing.sha1(), (OutputStream)$$5);
                rb.a($$4, (OutputStream)$$6);
                byte[] $$7 = $$5.toByteArray();
                HashCode $$8 = $$6.hash();
                if (d != null) {
                    String $$9 = rd.c($$4);
                } else {
                    $$10 = null;
                }
                c2 = new c($$1, $$7, $$10, $$8);
                if ($$2 == null) break block10;
            }
            catch (Throwable throwable) {
                try {
                    if ($$2 != null) {
                        try {
                            $$2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Throwable $$11) {
                    throw new b($$0, $$11);
                }
            }
            $$2.close();
        }
        return c2;
    }

    private void a(jg $$0, c $$1, Path $$2) {
        if ($$1.c != null) {
            Path $$3 = d.resolve($$1.a + ".snbt");
            try {
                mg.a(jg.a, $$3, $$1.c);
            }
            catch (IOException $$4) {
                e.error("Couldn't write structure SNBT {} at {}", new Object[]{$$1.a, $$3, $$4});
            }
        }
        Path $$5 = $$2.resolve($$1.a + ".nbt");
        try {
            $$0.writeIfNeeded($$5, $$1.b, $$1.d);
        }
        catch (IOException $$6) {
            e.error("Couldn't write structure {} at {}", new Object[]{$$1.a, $$5, $$6});
        }
    }

    @FunctionalInterface
    public static interface a {
        public qr apply(String var1, qr var2);
    }

    static final class c
    extends Record {
        final String a;
        final byte[] b;
        @Nullable
        final String c;
        final HashCode d;

        c(String $$0, byte[] $$1, @Nullable String $$2, HashCode $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "name;payload;snbtPayload;hash", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "name;payload;snbtPayload;hash", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "name;payload;snbtPayload;hash", "a", "b", "c", "d"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        public byte[] b() {
            return this.b;
        }

        @Nullable
        public String c() {
            return this.c;
        }

        public HashCode d() {
            return this.d;
        }
    }

    static class b
    extends RuntimeException {
        public b(Path $$0, Throwable $$1) {
            super($$0.toAbsolutePath().toString(), $$1);
        }
    }
}

