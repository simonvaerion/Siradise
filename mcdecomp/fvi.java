/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fvi
implements fuz {
    static final Logger c = LogUtils.getLogger();
    public static final Codec<fvi> b = RecordCodecBuilder.create($$02 -> $$02.group((App)acq.a.fieldOf("resource").forGetter($$0 -> $$0.d), (App)aoi.a(a.a.listOf()).fieldOf("regions").forGetter($$0 -> $$0.e), (App)Codec.DOUBLE.optionalFieldOf("divisor_x", (Object)1.0).forGetter($$0 -> $$0.f), (App)Codec.DOUBLE.optionalFieldOf("divisor_y", (Object)1.0).forGetter($$0 -> $$0.g)).apply((Applicative)$$02, fvi::new));
    private final acq d;
    private final List<a> e;
    private final double f;
    private final double g;

    public fvi(acq $$0, List<a> $$1, double $$2, double $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    @Override
    public void a(akx $$0, fuz.a $$1) {
        acq $$2 = a.a(this.d);
        Optional<akv> $$3 = $$0.getResource($$2);
        if ($$3.isPresent()) {
            fve $$4 = new fve($$2, $$3.get(), this.e.size());
            for (a $$5 : this.e) {
                $$1.a($$5.b, new b($$4, $$5, this.f, this.g));
            }
        } else {
            c.warn("Missing sprite: {}", (Object)$$2);
        }
    }

    @Override
    public fva a() {
        return fvb.d;
    }

    static final class a
    extends Record {
        final acq b;
        final double c;
        final double d;
        final double e;
        final double f;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)acq.a.fieldOf("sprite").forGetter(a::a), (App)Codec.DOUBLE.fieldOf("x").forGetter(a::b), (App)Codec.DOUBLE.fieldOf("y").forGetter(a::c), (App)Codec.DOUBLE.fieldOf("width").forGetter(a::d), (App)Codec.DOUBLE.fieldOf("height").forGetter(a::e)).apply((Applicative)$$0, a::new));

        private a(acq $$0, double $$1, double $$2, double $$3, double $$4) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "sprite;x;y;width;height", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "sprite;x;y;width;height", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "sprite;x;y;width;height", "b", "c", "d", "e", "f"}, this, $$0);
        }

        public acq a() {
            return this.b;
        }

        public double b() {
            return this.c;
        }

        public double c() {
            return this.d;
        }

        public double d() {
            return this.e;
        }

        public double e() {
            return this.f;
        }
    }

    static class b
    implements fuz.b {
        private final fve a;
        private final a b;
        private final double c;
        private final double d;

        b(fve $$0, a $$1, double $$2, double $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public fup b() {
            try {
                ehk $$0 = this.a.a();
                double $$1 = (double)$$0.a() / this.c;
                double $$2 = (double)$$0.b() / this.d;
                int $$3 = apa.a(this.b.c * $$1);
                int $$4 = apa.a(this.b.d * $$2);
                int $$5 = apa.a(this.b.e * $$1);
                int $$6 = apa.a(this.b.f * $$2);
                ehk $$7 = new ehk(ehk.a.a, $$5, $$6, false);
                $$0.a($$7, $$3, $$4, 0, 0, $$5, $$6, false, false);
                fup fup2 = new fup(this.b.b, new fwg($$5, $$6), $$7, fwe.e);
                return fup2;
            }
            catch (Exception $$8) {
                c.error("Failed to unstitch region {}", (Object)this.b.b, (Object)$$8);
            }
            finally {
                this.a.b();
            }
            return ful.a();
        }

        @Override
        public void a() {
            this.a.b();
        }

        @Override
        public /* synthetic */ Object get() {
            return this.b();
        }
    }
}

