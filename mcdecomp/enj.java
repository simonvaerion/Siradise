/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.File;
import org.slf4j.Logger;

public class enj {
    private static final Logger b = LogUtils.getLogger();
    public static final int a = 9;
    private final File c;
    private final DataFixer d;
    private final fja[] e = new fja[9];
    private boolean f;

    public enj(File $$0, DataFixer $$1) {
        this.c = new File($$0, "hotbar.nbt");
        this.d = $$1;
        for (int $$2 = 0; $$2 < 9; ++$$2) {
            this.e[$$2] = new fja();
        }
    }

    private void b() {
        try {
            qr $$0 = rb.b(this.c);
            if ($$0 == null) {
                return;
            }
            int $$1 = rd.b($$0, 1343);
            $$0 = aqc.d.a(this.d, $$0, $$1);
            for (int $$2 = 0; $$2 < 9; ++$$2) {
                this.e[$$2].a($$0.c(String.valueOf($$2), 10));
            }
        }
        catch (Exception $$3) {
            b.error("Failed to load creative mode options", (Throwable)$$3);
        }
    }

    public void a() {
        try {
            qr $$0 = rd.g(new qr());
            for (int $$1 = 0; $$1 < 9; ++$$1) {
                $$0.a(String.valueOf($$1), this.a($$1).a());
            }
            rb.b($$0, this.c);
        }
        catch (Exception $$2) {
            b.error("Failed to save creative mode options", (Throwable)$$2);
        }
    }

    public fja a(int $$0) {
        if (!this.f) {
            this.b();
            this.f = true;
        }
        return this.e[$$0];
    }
}

