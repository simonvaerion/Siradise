/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bfu
extends bfj
implements bfh,
bgw {
    private static final Logger b = LogUtils.getLogger();
    private static final aby<Float> c = acb.a(bfu.class, aca.d);
    private static final aby<Float> d = acb.a(bfu.class, aca.d);
    private static final aby<Boolean> e = acb.a(bfu.class, aca.k);
    private static final String f = "width";
    private static final String g = "height";
    private static final String h = "attack";
    private static final String i = "interaction";
    private static final String j = "response";
    @Nullable
    private a k;
    @Nullable
    private a l;

    public bfu(bfn<?> $$0, cmm $$1) {
        super($$0, $$1);
        this.ae = true;
    }

    @Override
    protected void a_() {
        this.am.a(c, Float.valueOf(1.0f));
        this.am.a(d, Float.valueOf(1.0f));
        this.am.a(e, false);
    }

    @Override
    protected void a(qr $$02) {
        if ($$02.b(f, 99)) {
            this.a($$02.j(f));
        }
        if ($$02.b(g, 99)) {
            this.s($$02.j(g));
        }
        if ($$02.e(h)) {
            a.a.decode((DynamicOps)rc.a, (Object)$$02.c(h)).resultOrPartial(ac.a("Interaction entity", arg_0 -> ((Logger)b).error(arg_0))).ifPresent($$0 -> {
                this.k = (a)$$0.getFirst();
            });
        } else {
            this.k = null;
        }
        if ($$02.e(i)) {
            a.a.decode((DynamicOps)rc.a, (Object)$$02.c(i)).resultOrPartial(ac.a("Interaction entity", arg_0 -> ((Logger)b).error(arg_0))).ifPresent($$0 -> {
                this.l = (a)$$0.getFirst();
            });
        } else {
            this.l = null;
        }
        this.a($$02.q(j));
        this.a(this.am());
    }

    @Override
    protected void b(qr $$0) {
        $$0.a(f, this.k());
        $$0.a(g, this.o());
        if (this.k != null) {
            a.a.encodeStart((DynamicOps)rc.a, (Object)this.k).result().ifPresent($$1 -> $$0.a(h, (rk)$$1));
        }
        if (this.l != null) {
            a.a.encodeStart((DynamicOps)rc.a, (Object)this.l).result().ifPresent($$1 -> $$0.a(i, (rk)$$1));
        }
        $$0.a(j, this.p());
    }

    @Override
    public void a(aby<?> $$0) {
        super.a($$0);
        if (d.equals($$0) || c.equals($$0)) {
            this.a(this.am());
        }
    }

    @Override
    public boolean bn() {
        return false;
    }

    @Override
    public boolean bo() {
        return true;
    }

    @Override
    public dxj l_() {
        return dxj.d;
    }

    @Override
    public boolean c_() {
        return true;
    }

    @Override
    public boolean r(bfj $$0) {
        if ($$0 instanceof byo) {
            byo $$1 = (byo)$$0;
            this.k = new a($$1.ct(), this.dI().V());
            if ($$1 instanceof aig) {
                aig $$2 = (aig)$$1;
                ai.g.a($$2, this, $$1.dJ().n(), 1.0f, 1.0f, false);
            }
            return !this.p();
        }
        return false;
    }

    @Override
    public bdx a(byo $$0, bdw $$1) {
        if (this.dI().B) {
            return this.p() ? bdx.a : bdx.b;
        }
        this.l = new a($$0.ct(), this.dI().V());
        return bdx.b;
    }

    @Override
    public void l() {
    }

    @Override
    @Nullable
    public bfz M_() {
        if (this.k != null) {
            return this.dI().b(this.k.a());
        }
        return null;
    }

    @Override
    @Nullable
    public bfz j() {
        if (this.l != null) {
            return this.dI().b(this.l.a());
        }
        return null;
    }

    private void a(float $$0) {
        this.am.b(c, Float.valueOf($$0));
    }

    private float k() {
        return this.am.b(c).floatValue();
    }

    private void s(float $$0) {
        this.am.b(d, Float.valueOf($$0));
    }

    private float o() {
        return this.am.b(d).floatValue();
    }

    private void a(boolean $$0) {
        this.am.b(e, $$0);
    }

    private boolean p() {
        return this.am.b(e);
    }

    private bfk q() {
        return bfk.b(this.k(), this.o());
    }

    @Override
    public bfk a(bgl $$0) {
        return this.q();
    }

    @Override
    protected eed am() {
        return this.q().a(this.dg());
    }

    static final class a
    extends Record {
        private final UUID b;
        private final long c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)hy.a.fieldOf("player").forGetter(a::a), (App)Codec.LONG.fieldOf("timestamp").forGetter(a::b)).apply((Applicative)$$0, a::new));

        a(UUID $$0, long $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;timestamp", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;timestamp", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;timestamp", "b", "c"}, this, $$0);
        }

        public UUID a() {
            return this.b;
        }

        public long b() {
            return this.c;
        }
    }
}

