/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class ben {
    private final he<bep> a;
    @Nullable
    private final bfj b;
    @Nullable
    private final bfj c;
    @Nullable
    private final eei d;

    public String toString() {
        return "DamageSource (" + this.j().a() + ")";
    }

    public float a() {
        return this.j().c();
    }

    public boolean b() {
        return this.b != this.c;
    }

    private ben(he<bep> $$0, @Nullable bfj $$1, @Nullable bfj $$2, @Nullable eei $$3) {
        this.a = $$0;
        this.b = $$2;
        this.c = $$1;
        this.d = $$3;
    }

    public ben(he<bep> $$0, @Nullable bfj $$1, @Nullable bfj $$2) {
        this($$0, $$1, $$2, null);
    }

    public ben(he<bep> $$0, eei $$1) {
        this($$0, null, null, $$1);
    }

    public ben(he<bep> $$0, @Nullable bfj $$1) {
        this($$0, $$1, $$1);
    }

    public ben(he<bep> $$0) {
        this($$0, null, null, null);
    }

    @Nullable
    public bfj c() {
        return this.c;
    }

    @Nullable
    public bfj d() {
        return this.b;
    }

    public sw a(bfz $$0) {
        String $$1 = "death.attack." + this.j().a();
        if (this.b != null || this.c != null) {
            cfz $$4;
            sw $$2 = this.b == null ? this.c.H_() : this.b.H_();
            bfj bfj2 = this.b;
            if (bfj2 instanceof bfz) {
                bfz $$3 = (bfz)bfj2;
                v0 = $$3.eO();
            } else {
                v0 = $$4 = cfz.b;
            }
            if (!$$4.b() && $$4.A()) {
                return sw.a($$1 + ".item", $$0.H_(), $$2, $$4.J());
            }
            return sw.a($$1, $$0.H_(), $$2);
        }
        bfz $$5 = $$0.eH();
        String $$6 = $$1 + ".player";
        if ($$5 != null) {
            return sw.a($$6, $$0.H_(), $$5.H_());
        }
        return sw.a($$1, $$0.H_());
    }

    public String e() {
        return this.j().a();
    }

    public boolean f() {
        return switch (this.j().b()) {
            default -> throw new IncompatibleClassChangeError();
            case bem.a -> false;
            case bem.b -> {
                if (this.b instanceof bfz && !(this.b instanceof byo)) {
                    yield true;
                }
                yield false;
            }
            case bem.c -> true;
        };
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean g() {
        bfj bfj2 = this.d();
        if (!(bfj2 instanceof byo)) return false;
        byo $$0 = (byo)bfj2;
        if (!$$0.fO().d) return false;
        return true;
    }

    @Nullable
    public eei h() {
        if (this.d != null) {
            return this.d;
        }
        if (this.c != null) {
            return this.c.dg();
        }
        return null;
    }

    @Nullable
    public eei i() {
        return this.d;
    }

    public boolean a(anl<bep> $$0) {
        return this.a.a($$0);
    }

    public boolean a(acp<bep> $$0) {
        return this.a.a($$0);
    }

    public bep j() {
        return this.a.a();
    }

    public he<bep> k() {
        return this.a;
    }
}

