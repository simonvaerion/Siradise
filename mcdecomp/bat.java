/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bat {
    public static final bat e = Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bas.a() : new a();

    public boolean a(bar var1);

    public Path b();

    public boolean c();

    public boolean d();

    public void a(float var1);

    public void a(int var1, int var2, SocketAddress var3, int var4);

    public void b(int var1, int var2, SocketAddress var3, int var4);

    @Nullable
    public baw e();

    @Nullable
    public baw a(clt var1, acp<cmm> var2, String var3);

    public static class a
    implements bat {
        private static final Logger b = LogUtils.getLogger();
        static final baw a = () -> {};

        @Override
        public boolean a(bar $$0) {
            b.warn("Attempted to start Flight Recorder, but it's not supported on this JVM");
            return false;
        }

        @Override
        public Path b() {
            throw new IllegalStateException("Attempted to stop Flight Recorder, but it's not supported on this JVM");
        }

        @Override
        public boolean c() {
            return false;
        }

        @Override
        public boolean d() {
            return false;
        }

        @Override
        public void a(int $$0, int $$1, SocketAddress $$2, int $$3) {
        }

        @Override
        public void b(int $$0, int $$1, SocketAddress $$2, int $$3) {
        }

        @Override
        public void a(float $$0) {
        }

        @Override
        public baw e() {
            return a;
        }

        @Override
        @Nullable
        public baw a(clt $$0, acp<cmm> $$1, String $$2) {
            return null;
        }
    }
}

