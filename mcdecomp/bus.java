/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bus {
    private static final Logger a = LogUtils.getLogger();
    private final bub b;
    private final bul[] c = new bul[bur.c()];
    @Nullable
    private bul d;

    public bus(bub $$0) {
        this.b = $$0;
        this.a(bur.k);
    }

    public void a(bur<?> $$0) {
        if (this.d != null && $$0 == this.d.i()) {
            return;
        }
        if (this.d != null) {
            this.d.e();
        }
        this.d = this.b($$0);
        if (!this.b.dI().B) {
            this.b.aj().b(bub.b, $$0.b());
        }
        a.debug("Dragon is now in phase {} on the {}", $$0, (Object)(this.b.dI().B ? "client" : "server"));
        this.d.d();
    }

    public bul a() {
        return this.d;
    }

    public <T extends bul> T b(bur<T> $$0) {
        int $$1 = $$0.b();
        if (this.c[$$1] == null) {
            this.c[$$1] = $$0.a(this.b);
        }
        return (T)this.c[$$1];
    }
}

