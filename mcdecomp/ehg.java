/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ca.weblite.objc.Client
 *  ca.weblite.objc.NSObject
 *  com.sun.jna.Pointer
 *  org.lwjgl.glfw.GLFWNativeCocoa
 */
import ca.weblite.objc.Client;
import ca.weblite.objc.NSObject;
import com.sun.jna.Pointer;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Optional;
import org.lwjgl.glfw.GLFWNativeCocoa;

public class ehg {
    private static final int a = 16384;

    public static void a(long $$0) {
        ehg.b($$0).filter(ehg::a).ifPresent(ehg::b);
    }

    private static Optional<NSObject> b(long $$0) {
        long $$1 = GLFWNativeCocoa.glfwGetCocoaWindow((long)$$0);
        if ($$1 != 0L) {
            return Optional.of(new NSObject(new Pointer($$1)));
        }
        return Optional.empty();
    }

    private static boolean a(NSObject $$0) {
        return ((Long)$$0.sendRaw("styleMask", new Object[0]) & 0x4000L) == 16384L;
    }

    private static void b(NSObject $$0) {
        $$0.send("toggleFullScreen:", new Object[]{Pointer.NULL});
    }

    public static void a(akp<InputStream> $$0) throws IOException {
        try (InputStream $$1 = $$0.get();){
            String $$2 = Base64.getEncoder().encodeToString($$1.readAllBytes());
            Client $$3 = Client.getInstance();
            Object $$4 = $$3.sendProxy("NSData", "alloc", new Object[0]).send("initWithBase64Encoding:", new Object[]{$$2});
            Object $$5 = $$3.sendProxy("NSImage", "alloc", new Object[0]).send("initWithData:", new Object[]{$$4});
            $$3.sendProxy("NSApplication", "sharedApplication", new Object[0]).send("setApplicationIconImage:", new Object[]{$$5});
        }
    }
}

