/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import org.slf4j.Logger;

public abstract class dyj {
    private static final Logger a = LogUtils.getLogger();
    private boolean b;

    public abstract qr a(qr var1);

    public void b() {
        this.a(true);
    }

    public void a(boolean $$0) {
        this.b = $$0;
    }

    public boolean c() {
        return this.b;
    }

    public void a(File $$0) {
        if (!this.c()) {
            return;
        }
        qr $$1 = new qr();
        $$1.a("data", this.a(new qr()));
        rd.g($$1);
        try {
            rb.a($$1, $$0);
        }
        catch (IOException $$2) {
            a.error("Could not save data {}", (Object)this, (Object)$$2);
        }
        this.a(false);
    }
}

