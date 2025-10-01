/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bek {
    public static final int a = 100;
    public static final int b = 300;
    private static final ts c = ts.a.a(new su(su.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new tb(tb.a.a, sw.b("MCPE-28723")));
    private final List<bei> d = Lists.newArrayList();
    private final bfz e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;

    public bek(bfz $$0) {
        this.e = $$0;
    }

    public void a(ben $$0, float $$1) {
        this.c();
        bes $$2 = bes.a(this.e);
        bei $$3 = new bei($$0, $$1, $$2, this.e.aa);
        this.d.add($$3);
        this.f = this.e.ag;
        this.j = true;
        if (!this.i && this.e.bs() && bek.a($$0)) {
            this.i = true;
            this.h = this.g = this.e.ag;
            this.e.Q_();
        }
    }

    private static boolean a(ben $$0) {
        return $$0.d() instanceof bfz;
    }

    private sw a(bfj $$0, sw $$1, String $$2, String $$3) {
        cfz $$5;
        if ($$0 instanceof bfz) {
            bfz $$4 = (bfz)$$0;
            v0 = $$4.eO();
        } else {
            v0 = $$5 = cfz.b;
        }
        if (!$$5.b() && $$5.A()) {
            return sw.a($$2, this.e.H_(), $$1, $$5.J());
        }
        return sw.a($$3, this.e.H_(), $$1);
    }

    private sw a(bei $$0, @Nullable bfj $$1) {
        ben $$2 = $$0.a();
        if ($$2.a(amy.m) || $$2.a(amy.s)) {
            bes $$3 = Objects.requireNonNullElse($$0.c(), bes.a);
            return sw.a($$3.a(), this.e.H_());
        }
        sw $$4 = bek.a($$1);
        bfj $$5 = $$2.d();
        sw $$6 = bek.a($$5);
        if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
        }
        if ($$4 != null) {
            return this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish");
        }
        return sw.a("death.fell.killer", this.e.H_());
    }

    @Nullable
    private static sw a(@Nullable bfj $$0) {
        return $$0 == null ? null : $$0.H_();
    }

    public sw a() {
        if (this.d.isEmpty()) {
            return sw.a("death.attack.generic", this.e.H_());
        }
        bei $$0 = this.d.get(this.d.size() - 1);
        ben $$1 = $$0.a();
        bei $$2 = this.d();
        ber $$3 = $$1.j().e();
        if ($$3 == ber.b && $$2 != null) {
            return this.a($$2, $$1.d());
        }
        if ($$3 == ber.c) {
            String $$4 = "death.attack." + $$1.e();
            tj $$5 = sy.a(sw.c($$4 + ".link")).c(c);
            return sw.a($$4 + ".message", this.e.H_(), $$5);
        }
        return $$1.a(this.e);
    }

    @Nullable
    private bei d() {
        bei $$0 = null;
        bei $$1 = null;
        float $$2 = 0.0f;
        float $$3 = 0.0f;
        for (int $$4 = 0; $$4 < this.d.size(); ++$$4) {
            float $$9;
            bei $$5 = this.d.get($$4);
            bei $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
            ben $$7 = $$5.a();
            boolean $$8 = $$7.a(amy.s);
            float f2 = $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
            if (($$7.a(amy.m) || $$8) && $$9 > 0.0f && ($$0 == null || $$9 > $$3)) {
                $$0 = $$4 > 0 ? $$6 : $$5;
                $$3 = $$9;
            }
            if ($$5.c() == null || $$1 != null && !($$5.b() > $$2)) continue;
            $$1 = $$5;
            $$2 = $$5.b();
        }
        if ($$3 > 5.0f && $$0 != null) {
            return $$0;
        }
        if ($$2 > 5.0f && $$1 != null) {
            return $$1;
        }
        return null;
    }

    public int b() {
        if (this.i) {
            return this.e.ag - this.g;
        }
        return this.h - this.g;
    }

    public void c() {
        int $$0;
        int n2 = $$0 = this.i ? 300 : 100;
        if (this.j && (!this.e.bs() || this.e.ag - this.f > $$0)) {
            boolean $$1 = this.i;
            this.j = false;
            this.i = false;
            this.h = this.e.ag;
            if ($$1) {
                this.e.F_();
            }
            this.d.clear();
        }
    }
}

