/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.system.MemoryUtil$MemoryAllocator
 */
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;

public class ehh {
    private static final MemoryUtil.MemoryAllocator a = MemoryUtil.getAllocator((boolean)false);

    public static ByteBuffer a(int $$0) {
        long $$1 = a.malloc((long)$$0);
        if ($$1 == 0L) {
            throw new OutOfMemoryError("Failed to allocate " + $$0 + " bytes");
        }
        return MemoryUtil.memByteBuffer((long)$$1, (int)$$0);
    }

    public static ByteBuffer a(ByteBuffer $$0, int $$1) {
        long $$2 = a.realloc(MemoryUtil.memAddress0((Buffer)$$0), (long)$$1);
        if ($$2 == 0L) {
            throw new OutOfMemoryError("Failed to resize buffer from " + $$0.capacity() + " bytes to " + $$1 + " bytes");
        }
        return MemoryUtil.memByteBuffer((long)$$2, (int)$$1);
    }
}

