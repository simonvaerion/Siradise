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

public class cvm {
    private final cmm a;
    private final gu b;
    private final cpd c;
    private dcb d;
    private final boolean e;
    private final List<gu> f = Lists.newArrayList();

    public cvm(cmm $$0, gu $$1, dcb $$2) {
        this.a = $$0;
        this.b = $$1;
        this.d = $$2;
        this.c = (cpd)$$2.b();
        ddf $$3 = $$2.c(this.c.b());
        this.e = this.c.a();
        this.a($$3);
    }

    public List<gu> a() {
        return this.f;
    }

    private void a(ddf $$0) {
        this.f.clear();
        switch ($$0) {
            case a: {
                this.f.add(this.b.e());
                this.f.add(this.b.f());
                break;
            }
            case b: {
                this.f.add(this.b.g());
                this.f.add(this.b.h());
                break;
            }
            case c: {
                this.f.add(this.b.g());
                this.f.add(this.b.h().c());
                break;
            }
            case d: {
                this.f.add(this.b.g().c());
                this.f.add(this.b.h());
                break;
            }
            case e: {
                this.f.add(this.b.e().c());
                this.f.add(this.b.f());
                break;
            }
            case f: {
                this.f.add(this.b.e());
                this.f.add(this.b.f().c());
                break;
            }
            case g: {
                this.f.add(this.b.h());
                this.f.add(this.b.f());
                break;
            }
            case h: {
                this.f.add(this.b.g());
                this.f.add(this.b.f());
                break;
            }
            case i: {
                this.f.add(this.b.g());
                this.f.add(this.b.e());
                break;
            }
            case j: {
                this.f.add(this.b.h());
                this.f.add(this.b.e());
            }
        }
    }

    private void d() {
        for (int $$0 = 0; $$0 < this.f.size(); ++$$0) {
            cvm $$1 = this.b(this.f.get($$0));
            if ($$1 == null || !$$1.a(this)) {
                this.f.remove($$0--);
                continue;
            }
            this.f.set($$0, $$1.b);
        }
    }

    private boolean a(gu $$0) {
        return cpd.a(this.a, $$0) || cpd.a(this.a, $$0.c()) || cpd.a(this.a, $$0.d());
    }

    @Nullable
    private cvm b(gu $$0) {
        gu $$1 = $$0;
        dcb $$2 = this.a.a_($$1);
        if (cpd.g($$2)) {
            return new cvm(this.a, $$1, $$2);
        }
        $$1 = $$0.c();
        $$2 = this.a.a_($$1);
        if (cpd.g($$2)) {
            return new cvm(this.a, $$1, $$2);
        }
        $$1 = $$0.d();
        $$2 = this.a.a_($$1);
        if (cpd.g($$2)) {
            return new cvm(this.a, $$1, $$2);
        }
        return null;
    }

    private boolean a(cvm $$0) {
        return this.c($$0.b);
    }

    private boolean c(gu $$0) {
        for (int $$1 = 0; $$1 < this.f.size(); ++$$1) {
            gu $$2 = this.f.get($$1);
            if ($$2.u() != $$0.u() || $$2.w() != $$0.w()) continue;
            return true;
        }
        return false;
    }

    protected int b() {
        int $$0 = 0;
        for (ha $$1 : ha.c.a) {
            if (!this.a(this.b.a($$1))) continue;
            ++$$0;
        }
        return $$0;
    }

    private boolean b(cvm $$0) {
        return this.a($$0) || this.f.size() != 2;
    }

    private void c(cvm $$0) {
        this.f.add($$0.b);
        gu $$1 = this.b.e();
        gu $$2 = this.b.f();
        gu $$3 = this.b.g();
        gu $$4 = this.b.h();
        boolean $$5 = this.c($$1);
        boolean $$6 = this.c($$2);
        boolean $$7 = this.c($$3);
        boolean $$8 = this.c($$4);
        ddf $$9 = null;
        if ($$5 || $$6) {
            $$9 = ddf.a;
        }
        if ($$7 || $$8) {
            $$9 = ddf.b;
        }
        if (!this.e) {
            if ($$6 && $$8 && !$$5 && !$$7) {
                $$9 = ddf.g;
            }
            if ($$6 && $$7 && !$$5 && !$$8) {
                $$9 = ddf.h;
            }
            if ($$5 && $$7 && !$$6 && !$$8) {
                $$9 = ddf.i;
            }
            if ($$5 && $$8 && !$$6 && !$$7) {
                $$9 = ddf.j;
            }
        }
        if ($$9 == ddf.a) {
            if (cpd.a(this.a, $$1.c())) {
                $$9 = ddf.e;
            }
            if (cpd.a(this.a, $$2.c())) {
                $$9 = ddf.f;
            }
        }
        if ($$9 == ddf.b) {
            if (cpd.a(this.a, $$4.c())) {
                $$9 = ddf.c;
            }
            if (cpd.a(this.a, $$3.c())) {
                $$9 = ddf.d;
            }
        }
        if ($$9 == null) {
            $$9 = ddf.a;
        }
        this.d = (dcb)this.d.a(this.c.b(), $$9);
        this.a.a(this.b, this.d, 3);
    }

    private boolean d(gu $$0) {
        cvm $$1 = this.b($$0);
        if ($$1 == null) {
            return false;
        }
        $$1.d();
        return $$1.b(this);
    }

    public cvm a(boolean $$0, boolean $$1, ddf $$2) {
        boolean $$17;
        boolean $$13;
        gu $$3 = this.b.e();
        gu $$4 = this.b.f();
        gu $$5 = this.b.g();
        gu $$6 = this.b.h();
        boolean $$7 = this.d($$3);
        boolean $$8 = this.d($$4);
        boolean $$9 = this.d($$5);
        boolean $$10 = this.d($$6);
        ddf $$11 = null;
        boolean $$12 = $$7 || $$8;
        boolean bl2 = $$13 = $$9 || $$10;
        if ($$12 && !$$13) {
            $$11 = ddf.a;
        }
        if ($$13 && !$$12) {
            $$11 = ddf.b;
        }
        boolean $$14 = $$8 && $$10;
        boolean $$15 = $$8 && $$9;
        boolean $$16 = $$7 && $$10;
        boolean bl3 = $$17 = $$7 && $$9;
        if (!this.e) {
            if ($$14 && !$$7 && !$$9) {
                $$11 = ddf.g;
            }
            if ($$15 && !$$7 && !$$10) {
                $$11 = ddf.h;
            }
            if ($$17 && !$$8 && !$$10) {
                $$11 = ddf.i;
            }
            if ($$16 && !$$8 && !$$9) {
                $$11 = ddf.j;
            }
        }
        if ($$11 == null) {
            if ($$12 && $$13) {
                $$11 = $$2;
            } else if ($$12) {
                $$11 = ddf.a;
            } else if ($$13) {
                $$11 = ddf.b;
            }
            if (!this.e) {
                if ($$0) {
                    if ($$14) {
                        $$11 = ddf.g;
                    }
                    if ($$15) {
                        $$11 = ddf.h;
                    }
                    if ($$16) {
                        $$11 = ddf.j;
                    }
                    if ($$17) {
                        $$11 = ddf.i;
                    }
                } else {
                    if ($$17) {
                        $$11 = ddf.i;
                    }
                    if ($$16) {
                        $$11 = ddf.j;
                    }
                    if ($$15) {
                        $$11 = ddf.h;
                    }
                    if ($$14) {
                        $$11 = ddf.g;
                    }
                }
            }
        }
        if ($$11 == ddf.a) {
            if (cpd.a(this.a, $$3.c())) {
                $$11 = ddf.e;
            }
            if (cpd.a(this.a, $$4.c())) {
                $$11 = ddf.f;
            }
        }
        if ($$11 == ddf.b) {
            if (cpd.a(this.a, $$6.c())) {
                $$11 = ddf.c;
            }
            if (cpd.a(this.a, $$5.c())) {
                $$11 = ddf.d;
            }
        }
        if ($$11 == null) {
            $$11 = $$2;
        }
        this.a($$11);
        this.d = (dcb)this.d.a(this.c.b(), $$11);
        if ($$1 || this.a.a_(this.b) != this.d) {
            this.a.a(this.b, this.d, 3);
            for (int $$18 = 0; $$18 < this.f.size(); ++$$18) {
                cvm $$19 = this.b(this.f.get($$18));
                if ($$19 == null) continue;
                $$19.d();
                if (!$$19.b(this)) continue;
                $$19.c(this);
            }
        }
        return this;
    }

    public dcb c() {
        return this.d;
    }
}

