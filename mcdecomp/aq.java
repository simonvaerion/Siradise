/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class aq {
    private final ae a;
    @Nullable
    private final aq b;
    @Nullable
    private final aq c;
    private final int d;
    private final List<aq> e = Lists.newArrayList();
    private aq f;
    @Nullable
    private aq g;
    private int h;
    private float i;
    private float j;
    private float k;
    private float l;

    public aq(ae $$0, @Nullable aq $$1, @Nullable aq $$2, int $$3, int $$4) {
        if ($$0.d() == null) {
            throw new IllegalArgumentException("Can't position an invisible advancement!");
        }
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.f = this;
        this.h = $$4;
        this.i = -1.0f;
        aq $$5 = null;
        for (ae $$6 : $$0.g()) {
            $$5 = this.a($$6, $$5);
        }
    }

    @Nullable
    private aq a(ae $$0, @Nullable aq $$1) {
        if ($$0.d() != null) {
            $$1 = new aq($$0, this, $$1, this.e.size() + 1, this.h + 1);
            this.e.add($$1);
        } else {
            for (ae $$2 : $$0.g()) {
                $$1 = this.a($$2, $$1);
            }
        }
        return $$1;
    }

    private void a() {
        if (this.e.isEmpty()) {
            this.i = this.c != null ? this.c.i + 1.0f : 0.0f;
            return;
        }
        aq $$0 = null;
        for (aq $$1 : this.e) {
            $$1.a();
            $$0 = $$1.a($$0 == null ? $$1 : $$0);
        }
        this.b();
        float $$2 = (this.e.get((int)0).i + this.e.get((int)(this.e.size() - 1)).i) / 2.0f;
        if (this.c != null) {
            this.i = this.c.i + 1.0f;
            this.j = this.i - $$2;
        } else {
            this.i = $$2;
        }
    }

    private float a(float $$0, int $$1, float $$2) {
        this.i += $$0;
        this.h = $$1;
        if (this.i < $$2) {
            $$2 = this.i;
        }
        for (aq $$3 : this.e) {
            $$2 = $$3.a($$0 + this.j, $$1 + 1, $$2);
        }
        return $$2;
    }

    private void a(float $$0) {
        this.i += $$0;
        for (aq $$1 : this.e) {
            $$1.a($$0);
        }
    }

    private void b() {
        float $$0 = 0.0f;
        float $$1 = 0.0f;
        for (int $$2 = this.e.size() - 1; $$2 >= 0; --$$2) {
            aq $$3 = this.e.get($$2);
            $$3.i += $$0;
            $$3.j += $$0;
            $$0 += $$3.l + ($$1 += $$3.k);
        }
    }

    @Nullable
    private aq c() {
        if (this.g != null) {
            return this.g;
        }
        if (!this.e.isEmpty()) {
            return this.e.get(0);
        }
        return null;
    }

    @Nullable
    private aq d() {
        if (this.g != null) {
            return this.g;
        }
        if (!this.e.isEmpty()) {
            return this.e.get(this.e.size() - 1);
        }
        return null;
    }

    private aq a(aq $$0) {
        if (this.c == null) {
            return $$0;
        }
        aq $$1 = this;
        aq $$2 = this;
        aq $$3 = this.c;
        aq $$4 = this.b.e.get(0);
        float $$5 = this.j;
        float $$6 = this.j;
        float $$7 = $$3.j;
        float $$8 = $$4.j;
        while ($$3.d() != null && $$1.c() != null) {
            $$3 = $$3.d();
            $$1 = $$1.c();
            $$4 = $$4.c();
            $$2 = $$2.d();
            $$2.f = this;
            float $$9 = $$3.i + $$7 - ($$1.i + $$5) + 1.0f;
            if ($$9 > 0.0f) {
                $$3.a(this, $$0).a(this, $$9);
                $$5 += $$9;
                $$6 += $$9;
            }
            $$7 += $$3.j;
            $$5 += $$1.j;
            $$8 += $$4.j;
            $$6 += $$2.j;
        }
        if ($$3.d() != null && $$2.d() == null) {
            $$2.g = $$3.d();
            $$2.j += $$7 - $$6;
        } else {
            if ($$1.c() != null && $$4.c() == null) {
                $$4.g = $$1.c();
                $$4.j += $$5 - $$8;
            }
            $$0 = this;
        }
        return $$0;
    }

    private void a(aq $$0, float $$1) {
        float $$2 = $$0.d - this.d;
        if ($$2 != 0.0f) {
            $$0.k -= $$1 / $$2;
            this.k += $$1 / $$2;
        }
        $$0.l += $$1;
        $$0.i += $$1;
        $$0.j += $$1;
    }

    private aq a(aq $$0, aq $$1) {
        if (this.f != null && $$0.b.e.contains(this.f)) {
            return this.f;
        }
        return $$1;
    }

    private void e() {
        if (this.a.d() != null) {
            this.a.d().a(this.h, this.i);
        }
        if (!this.e.isEmpty()) {
            for (aq $$0 : this.e) {
                $$0.e();
            }
        }
    }

    public static void a(ae $$0) {
        if ($$0.d() == null) {
            throw new IllegalArgumentException("Can't position children of an invisible root!");
        }
        aq $$1 = new aq($$0, null, null, 1, 0);
        $$1.a();
        float $$2 = $$1.a(0.0f, 0, $$1.i);
        if ($$2 < 0.0f) {
            $$1.a(-$$2);
        }
        $$1.e();
    }
}

