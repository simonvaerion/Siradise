/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class emu
extends emo {
    private static final Logger c = LogUtils.getLogger();
    private final long d;
    private final ekh e;
    private final ela f;

    public emu(long $$0, ekh $$1, ela $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    @Override
    public void run() {
        eiz $$0 = eiz.a();
        this.b(sw.c("mco.minigame.world.starting.screen.title"));
        for (int $$1 = 0; $$1 < 25; ++$$1) {
            try {
                if (this.c()) {
                    return;
                }
                if (!$$0.d(this.d, this.e.a).booleanValue()) continue;
                emu.a(this.f);
                break;
            }
            catch (ekn $$2) {
                if (this.c()) {
                    return;
                }
                emu.a($$2.e);
                continue;
            }
            catch (Exception $$3) {
                if (this.c()) {
                    return;
                }
                c.error("Couldn't start mini game!");
                this.a($$3.toString());
            }
        }
    }
}

