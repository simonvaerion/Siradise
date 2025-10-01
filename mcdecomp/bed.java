/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;

public class bed
extends dyj {
    private static final Logger a = LogUtils.getLogger();
    private final long b;
    private final Map<acq, bec> c = new Object2ObjectOpenHashMap();

    public bed(long $$0) {
        this.b = $$0;
    }

    public apf a(acq $$02) {
        final apf $$1 = this.c.computeIfAbsent($$02, $$0 -> new bec(this.b, (acq)$$0)).a();
        return new apf(){

            @Override
            public apf d() {
                bed.this.b();
                return $$1.d();
            }

            @Override
            public dhx e() {
                bed.this.b();
                return $$1.e();
            }

            @Override
            public void b(long $$0) {
                bed.this.b();
                $$1.b($$0);
            }

            @Override
            public int f() {
                bed.this.b();
                return $$1.f();
            }

            @Override
            public int a(int $$0) {
                bed.this.b();
                return $$1.a($$0);
            }

            @Override
            public long g() {
                bed.this.b();
                return $$1.g();
            }

            @Override
            public boolean h() {
                bed.this.b();
                return $$1.h();
            }

            @Override
            public float i() {
                bed.this.b();
                return $$1.i();
            }

            @Override
            public double j() {
                bed.this.b();
                return $$1.j();
            }

            @Override
            public double k() {
                bed.this.b();
                return $$1.k();
            }
        };
    }

    @Override
    public qr a(qr $$0) {
        this.c.forEach(($$1, $$2) -> $$0.a($$1.toString(), (rk)bec.a.encodeStart((DynamicOps)rc.a, $$2).result().orElseThrow()));
        return $$0;
    }

    public static bed a(long $$0, qr $$1) {
        bed $$2 = new bed($$0);
        Set<String> $$3 = $$1.e();
        for (String $$4 : $$3) {
            try {
                bec $$5 = (bec)((Pair)bec.a.decode((DynamicOps)rc.a, (Object)$$1.c($$4)).result().get()).getFirst();
                $$2.c.put(new acq($$4), $$5);
            }
            catch (Exception $$6) {
                a.error("Failed to load random sequence {}", (Object)$$4, (Object)$$6);
            }
        }
        return $$2;
    }
}

