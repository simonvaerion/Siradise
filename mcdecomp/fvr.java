/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;

public class fvr {
    @Deprecated
    public static int[] a(akx $$0, acq $$1) throws IOException {
        try (InputStream $$2 = $$0.open($$1);){
            ehk $$3 = ehk.a($$2);
            try {
                int[] nArray = $$3.e();
                if ($$3 != null) {
                    $$3.close();
                }
                return nArray;
            }
            catch (Throwable throwable) {
                if ($$3 != null) {
                    try {
                        $$3.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
        }
    }
}

