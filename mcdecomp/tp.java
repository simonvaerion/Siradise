/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class tp {
    private static final Logger a = LogUtils.getLogger();
    @Nullable
    private tq b;

    public tp(UUID $$0, UUID $$1) {
        this.b = tq.a($$0, $$1);
    }

    public c a(apk $$0) {
        return $$1 -> {
            tq $$22 = this.a();
            if ($$22 == null) {
                return null;
            }
            return new th($$0.sign($$2 -> tl.a($$2, $$22, $$1)));
        };
    }

    public b a(byr $$0) {
        apj $$1 = $$0.a();
        return ($$2, $$3) -> {
            tq $$4 = this.a();
            if ($$4 == null) {
                throw new a((sw)sw.c("chat.disabled.chain_broken"), false);
            }
            if ($$0.b().a()) {
                throw new a((sw)sw.c("chat.disabled.expiredProfileKey"), false);
            }
            tl $$5 = new tl($$4, $$2, $$3, null, sz.c);
            if (!$$5.a($$1)) {
                throw new a((sw)sw.c("multiplayer.disconnect.unsigned_chat"), true);
            }
            if ($$5.a(Instant.now())) {
                a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", (Object)$$3.a());
            }
            return $$5;
        };
    }

    @Nullable
    private tq a() {
        tq $$0 = this.b;
        if ($$0 != null) {
            this.b = $$0.a();
        }
        return $$0;
    }

    @FunctionalInterface
    public static interface c {
        public static final c a = $$0 -> null;

        @Nullable
        public th pack(to var1);
    }

    @FunctionalInterface
    public static interface b {
        public static final b a = ($$0, $$1) -> {
            throw new a((sw)sw.c("chat.disabled.missingProfileKey"), false);
        };

        public static b unsigned(UUID $$0) {
            return ($$1, $$2) -> tl.a($$0, $$2.a());
        }

        public tl unpack(@Nullable th var1, to var2) throws a;
    }

    public static class a
    extends tv {
        private final boolean a;

        public a(sw $$0, boolean $$1) {
            super($$0);
            this.a = $$1;
        }

        public boolean a() {
            return this.a;
        }
    }
}

