/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ComparisonChain;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bfa
implements Comparable<bfa> {
    private static final Logger b = LogUtils.getLogger();
    public static final int a = -1;
    private final bey c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    @Nullable
    private bfa i;
    private final Optional<a> j;

    public bfa(bey $$0) {
        this($$0, 0, 0);
    }

    public bfa(bey $$0, int $$1) {
        this($$0, $$1, 0);
    }

    public bfa(bey $$0, int $$1, int $$2) {
        this($$0, $$1, $$2, false, true);
    }

    public bfa(bey $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
        this($$0, $$1, $$2, $$3, $$4, $$4);
    }

    public bfa(bey $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
        this($$0, $$1, $$2, $$3, $$4, $$5, null, $$0.b());
    }

    public bfa(bey $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable bfa $$6, Optional<a> $$7) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
        this.j = $$7;
    }

    public bfa(bfa $$0) {
        this.c = $$0.c;
        this.j = this.c.b();
        this.a($$0);
    }

    public Optional<a> a() {
        return this.j;
    }

    void a(bfa $$0) {
        this.d = $$0.d;
        this.e = $$0.e;
        this.f = $$0.f;
        this.g = $$0.g;
        this.h = $$0.h;
    }

    public boolean b(bfa $$0) {
        if (this.c != $$0.c) {
            b.warn("This method should only be called for matching effects!");
        }
        int $$1 = this.d;
        boolean $$2 = false;
        if ($$0.e > this.e) {
            if ($$0.d(this)) {
                bfa $$3 = this.i;
                this.i = new bfa(this);
                this.i.i = $$3;
            }
            this.e = $$0.e;
            this.d = $$0.d;
            $$2 = true;
        } else if (this.d($$0)) {
            if ($$0.e == this.e) {
                this.d = $$0.d;
                $$2 = true;
            } else if (this.i == null) {
                this.i = new bfa($$0);
            } else {
                this.i.b($$0);
            }
        }
        if (!$$0.f && this.f || $$2) {
            this.f = $$0.f;
            $$2 = true;
        }
        if ($$0.g != this.g) {
            this.g = $$0.g;
            $$2 = true;
        }
        if ($$0.h != this.h) {
            this.h = $$0.h;
            $$2 = true;
        }
        return $$2;
    }

    private boolean d(bfa $$0) {
        return !this.b() && (this.d < $$0.d || $$0.b());
    }

    public boolean b() {
        return this.d == -1;
    }

    public boolean a(int $$0) {
        return !this.b() && this.d <= $$0;
    }

    public int a(Int2IntFunction $$0) {
        if (this.b() || this.d == 0) {
            return this.d;
        }
        return $$0.applyAsInt(this.d);
    }

    public bey c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public boolean a(bfz $$02, Runnable $$1) {
        if (this.j()) {
            int $$2;
            int n2 = $$2 = this.b() ? $$02.ag : this.d;
            if (this.c.a($$2, this.e)) {
                this.a($$02);
            }
            this.k();
            if (this.d == 0 && this.i != null) {
                this.a(this.i);
                this.i = this.i.i;
                $$1.run();
            }
        }
        this.j.ifPresent($$0 -> $$0.a(this));
        return this.j();
    }

    private boolean j() {
        return this.b() || this.d > 0;
    }

    private int k() {
        if (this.i != null) {
            this.i.k();
        }
        this.d = this.a($$0 -> $$0 - 1);
        return this.d;
    }

    public void a(bfz $$0) {
        if (this.j()) {
            this.c.a($$0, this.e);
        }
    }

    public String i() {
        return this.c.d();
    }

    public String toString() {
        String $$1;
        if (this.e > 0) {
            String $$0 = this.i() + " x " + (this.e + 1) + ", Duration: " + this.l();
        } else {
            $$1 = this.i() + ", Duration: " + this.l();
        }
        if (!this.g) {
            $$1 = $$1 + ", Particles: false";
        }
        if (!this.h) {
            $$1 = $$1 + ", Show Icon: false";
        }
        return $$1;
    }

    private String l() {
        if (this.b()) {
            return "infinite";
        }
        return Integer.toString(this.d);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof bfa) {
            bfa $$1 = (bfa)$$0;
            return this.d == $$1.d && this.e == $$1.e && this.f == $$1.f && this.c.equals($$1.c);
        }
        return false;
    }

    public int hashCode() {
        int $$0 = this.c.hashCode();
        $$0 = 31 * $$0 + this.d;
        $$0 = 31 * $$0 + this.e;
        $$0 = 31 * $$0 + (this.f ? 1 : 0);
        return $$0;
    }

    public qr a(qr $$0) {
        $$0.a("Id", bey.a(this.c()));
        this.c($$0);
        return $$0;
    }

    private void c(qr $$0) {
        $$0.a("Amplifier", (byte)this.e());
        $$0.a("Duration", this.d());
        $$0.a("Ambient", this.f());
        $$0.a("ShowParticles", this.g());
        $$0.a("ShowIcon", this.h());
        if (this.i != null) {
            qr $$1 = new qr();
            this.i.a($$1);
            $$0.a("HiddenEffect", $$1);
        }
        this.j.ifPresent($$12 -> bfa$a.a.encodeStart((DynamicOps)rc.a, $$12).resultOrPartial(arg_0 -> ((Logger)b).error(arg_0)).ifPresent($$1 -> $$0.a("FactorCalculationData", (rk)$$1)));
    }

    @Nullable
    public static bfa b(qr $$0) {
        int $$1 = $$0.h("Id");
        bey $$2 = bey.a($$1);
        if ($$2 == null) {
            return null;
        }
        return bfa.a($$2, $$0);
    }

    private static bfa a(bey $$0, qr $$1) {
        Optional<a> $$9;
        byte $$2 = $$1.f("Amplifier");
        int $$3 = $$1.h("Duration");
        boolean $$4 = $$1.q("Ambient");
        boolean $$5 = true;
        if ($$1.b("ShowParticles", 1)) {
            $$5 = $$1.q("ShowParticles");
        }
        boolean $$6 = $$5;
        if ($$1.b("ShowIcon", 1)) {
            $$6 = $$1.q("ShowIcon");
        }
        bfa $$7 = null;
        if ($$1.b("HiddenEffect", 10)) {
            $$7 = bfa.a($$0, $$1.p("HiddenEffect"));
        }
        if ($$1.b("FactorCalculationData", 10)) {
            Optional $$8 = bfa$a.a.parse(new Dynamic((DynamicOps)rc.a, (Object)$$1.p("FactorCalculationData"))).resultOrPartial(arg_0 -> ((Logger)b).error(arg_0));
        } else {
            $$9 = Optional.empty();
        }
        return new bfa($$0, $$3, Math.max($$2, 0), $$4, $$5, $$6, $$7, $$9);
    }

    public int c(bfa $$0) {
        int $$1 = 32147;
        if (this.d() > 32147 && $$0.d() > 32147 || this.f() && $$0.f()) {
            return ComparisonChain.start().compare(Boolean.valueOf(this.f()), Boolean.valueOf($$0.f())).compare(this.c().g(), $$0.c().g()).result();
        }
        return ComparisonChain.start().compareFalseFirst(this.f(), $$0.f()).compareFalseFirst(this.b(), $$0.b()).compare(this.d(), $$0.d()).compare(this.c().g(), $$0.c().g()).result();
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.c((bfa)object);
    }

    public static class a {
        public static final Codec<a> a = RecordCodecBuilder.create($$02 -> $$02.group((App)aoi.i.fieldOf("padding_duration").forGetter($$0 -> $$0.b), (App)Codec.FLOAT.fieldOf("factor_start").orElse((Object)Float.valueOf(0.0f)).forGetter($$0 -> Float.valueOf($$0.c)), (App)Codec.FLOAT.fieldOf("factor_target").orElse((Object)Float.valueOf(1.0f)).forGetter($$0 -> Float.valueOf($$0.d)), (App)Codec.FLOAT.fieldOf("factor_current").orElse((Object)Float.valueOf(0.0f)).forGetter($$0 -> Float.valueOf($$0.e)), (App)aoi.i.fieldOf("ticks_active").orElse((Object)0).forGetter($$0 -> $$0.f), (App)Codec.FLOAT.fieldOf("factor_previous_frame").orElse((Object)Float.valueOf(0.0f)).forGetter($$0 -> Float.valueOf($$0.g)), (App)Codec.BOOL.fieldOf("had_effect_last_tick").orElse((Object)false).forGetter($$0 -> $$0.h)).apply((Applicative)$$02, a::new));
        private final int b;
        private float c;
        private float d;
        private float e;
        private int f;
        private float g;
        private boolean h;

        public a(int $$0, float $$1, float $$2, float $$3, int $$4, float $$5, boolean $$6) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
            this.g = $$5;
            this.h = $$6;
        }

        public a(int $$0) {
            this($$0, 0.0f, 1.0f, 0.0f, 0, 0.0f, false);
        }

        public void a(bfa $$0) {
            this.g = this.e;
            boolean $$1 = !$$0.a(this.b);
            ++this.f;
            if (this.h != $$1) {
                this.h = $$1;
                this.f = 0;
                this.c = this.e;
                this.d = $$1 ? 1.0f : 0.0f;
            }
            float $$2 = apa.a((float)this.f / (float)this.b, 0.0f, 1.0f);
            this.e = apa.i($$2, this.c, this.d);
        }

        public float a(bfz $$0, float $$1) {
            if ($$0.dD()) {
                this.g = this.e;
            }
            return apa.i($$1, this.g, this.e);
        }
    }
}

