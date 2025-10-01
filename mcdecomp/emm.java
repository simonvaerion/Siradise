/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class emm
extends emo {
    private static final Logger c = LogUtils.getLogger();
    private final long d;
    private final int e;
    private final euq f;
    private final String g;

    public emm(long $$0, int $$1, String $$2, euq $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$3;
        this.g = $$2;
    }

    @Override
    public void run() {
        this.b(sw.c("mco.download.preparing"));
        eiz $$02 = eiz.a();
        for (int $$1 = 0; $$1 < 25; ++$$1) {
            try {
                if (this.c()) {
                    return;
                }
                ekg $$2 = $$02.b(this.d, this.e);
                emm.a(1L);
                if (this.c()) {
                    return;
                }
                emm.a(new eld(this.f, $$2, this.g, $$0 -> {}));
                return;
            }
            catch (ekn $$3) {
                if (this.c()) {
                    return;
                }
                emm.a($$3.e);
                continue;
            }
            catch (ekm $$4) {
                if (this.c()) {
                    return;
                }
                c.error("Couldn't download world data");
                emm.a(new ele($$4, this.f));
                return;
            }
            catch (Exception $$5) {
                if (this.c()) {
                    return;
                }
                c.error("Couldn't download world data", (Throwable)$$5);
                this.a($$5.getLocalizedMessage());
                return;
            }
        }
    }
}

