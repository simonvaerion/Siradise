/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public interface ely {
    public static final ely a = new ely(){

        @Override
        public long a() {
            return 1L;
        }

        @Override
        public long b() {
            return 1L;
        }
    };

    public long a();

    public long b();

    public static ely a(final int $$0) {
        return new ely(){
            private static final Logger c = LogUtils.getLogger();
            private int d;

            @Override
            public long a() {
                this.d = 0;
                return 1L;
            }

            @Override
            public long b() {
                ++this.d;
                long $$02 = Math.min(1L << this.d, (long)$$0);
                c.debug("Skipping for {} extra cycles", (Object)$$02);
                return $$02;
            }
        };
    }
}

