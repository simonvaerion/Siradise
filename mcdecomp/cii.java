/*
 * Decompiled with CFR 0.152.
 */
public class cii
extends cih {
    private final ha b;

    public cii(cmm $$0, gu $$1, ha $$2, cfz $$3, ha $$4) {
        super($$0, null, bdw.a, $$3, new eee(eei.c($$1), $$4, $$1, false));
        this.b = $$2;
    }

    @Override
    public gu a() {
        return this.j().a();
    }

    @Override
    public boolean b() {
        return this.q().a_(this.j().a()).a(this);
    }

    @Override
    public boolean c() {
        return this.b();
    }

    @Override
    public ha d() {
        return ha.a;
    }

    @Override
    public ha[] f() {
        switch (this.b) {
            default: {
                return new ha[]{ha.a, ha.c, ha.f, ha.d, ha.e, ha.b};
            }
            case b: {
                return new ha[]{ha.a, ha.b, ha.c, ha.f, ha.d, ha.e};
            }
            case c: {
                return new ha[]{ha.a, ha.c, ha.f, ha.e, ha.b, ha.d};
            }
            case d: {
                return new ha[]{ha.a, ha.d, ha.f, ha.e, ha.b, ha.c};
            }
            case e: {
                return new ha[]{ha.a, ha.e, ha.d, ha.b, ha.c, ha.f};
            }
            case f: 
        }
        return new ha[]{ha.a, ha.f, ha.d, ha.b, ha.c, ha.e};
    }

    @Override
    public ha g() {
        return this.b.o() == ha.a.b ? ha.c : this.b;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public float i() {
        return this.b.e() * 90;
    }
}

