/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eze
extends euq {
    private static final Logger a = LogUtils.getLogger();
    private static final Object2IntMap<acp<cmm>> b = (Object2IntMap)ac.a(new Object2IntOpenCustomHashMap(ac.k()), (T $$0) -> {
        $$0.put(cmm.h, -13408734);
        $$0.put(cmm.i, -10075085);
        $$0.put(cmm.j, -8943531);
        $$0.defaultReturnValue(-2236963);
    });
    private final BooleanConsumer c;
    private final bdl k;

    @Nullable
    public static eze a(enn $$0, BooleanConsumer $$1, DataFixer $$2, dyy.c $$3, boolean $$4) {
        adk $$5 = $$0.w().a($$3, false);
        try {
            dze $$6 = $$5.d();
            hs.b $$7 = $$5.c().a();
            $$3.a($$7, $$6);
            eze eze2 = new eze($$1, $$2, $$3, $$6.L(), $$4, $$7.d(jc.aI));
            if ($$5 != null) {
                $$5.close();
            }
            return eze2;
        }
        catch (Throwable throwable) {
            try {
                if ($$5 != null) {
                    try {
                        $$5.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
            catch (Exception $$8) {
                a.warn("Failed to load datapacks, can't optimize world", (Throwable)$$8);
                return null;
            }
        }
    }

    private eze(BooleanConsumer $$0, DataFixer $$1, dyy.c $$2, cmq $$3, boolean $$4, hr<dfl> $$5) {
        super(sw.a("optimizeWorld.title", new Object[]{$$3.a()}));
        this.c = $$0;
        this.k = new bdl($$2, $$1, $$5, $$4);
    }

    @Override
    protected void b() {
        super.b();
        this.d(epi.a(sv.e, (epi $$0) -> {
            this.k.a();
            this.c.accept(false);
        }).a(this.g / 2 - 100, this.h / 4 + 150, 200, 20).a());
    }

    @Override
    public void f() {
        if (this.k.b()) {
            this.c.accept(true);
        }
    }

    @Override
    public void aw_() {
        this.c.accept(false);
    }

    @Override
    public void ax_() {
        this.k.a();
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.e, this.g / 2, 20, 0xFFFFFF);
        int $$4 = this.g / 2 - 150;
        int $$5 = this.g / 2 + 150;
        int $$6 = this.h / 4 + 100;
        int $$7 = $$6 + 10;
        $$0.a(this.i, this.k.h(), this.g / 2, $$6 - this.i.b - 2, 0xA0A0A0);
        if (this.k.e() > 0) {
            $$0.a($$4 - 1, $$6 - 1, $$5 + 1, $$7 + 1, -16777216);
            $$0.b(this.i, sw.a("optimizeWorld.info.converted", this.k.f()), $$4, 40, 0xA0A0A0);
            $$0.b(this.i, sw.a("optimizeWorld.info.skipped", this.k.g()), $$4, 40 + this.i.b + 3, 0xA0A0A0);
            $$0.b(this.i, sw.a("optimizeWorld.info.total", this.k.e()), $$4, 40 + (this.i.b + 3) * 2, 0xA0A0A0);
            int $$8 = 0;
            for (acp<cmm> $$9 : this.k.c()) {
                int $$10 = apa.d(this.k.a($$9) * (float)($$5 - $$4));
                $$0.a($$4 + $$8, $$6, $$4 + $$8 + $$10, $$7, b.getInt($$9));
                $$8 += $$10;
            }
            int $$11 = this.k.f() + this.k.g();
            $$0.a(this.i, $$11 + " / " + this.k.e(), this.g / 2, $$6 + 2 * this.i.b + 2, 0xA0A0A0);
            $$0.a(this.i, apa.d(this.k.d() * 100.0f) + "%", this.g / 2, $$6 + ($$7 - $$6) / 2 - this.i.b / 2, 0xA0A0A0);
        }
        super.a($$0, $$1, $$2, $$3);
    }
}

