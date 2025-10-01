/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bgg {
    public static final String a_ = "AngerTime";
    public static final String b_ = "AngryAt";

    public int a();

    public void a(int var1);

    @Nullable
    public UUID b();

    public void a(@Nullable UUID var1);

    public void c();

    default public void c(qr $$0) {
        $$0.a(a_, this.a());
        if (this.b() != null) {
            $$0.a(b_, this.b());
        }
    }

    default public void a(cmm $$0, qr $$1) {
        this.a($$1.h(a_));
        if (!($$0 instanceof aif)) {
            return;
        }
        if (!$$1.b(b_)) {
            this.a((UUID)null);
            return;
        }
        UUID $$2 = $$1.a(b_);
        this.a($$2);
        bfj $$3 = ((aif)$$0).a($$2);
        if ($$3 == null) {
            return;
        }
        if ($$3 instanceof bgb) {
            this.a((bgb)$$3);
        }
        if ($$3.ae() == bfn.bt) {
            this.c((byo)$$3);
        }
    }

    default public void a(aif $$0, boolean $$1) {
        bfz $$2 = this.j();
        UUID $$3 = this.b();
        if (($$2 == null || $$2.es()) && $$3 != null && $$0.a($$3) instanceof bgb) {
            this.O_();
            return;
        }
        if ($$2 != null && !Objects.equals($$3, $$2.ct())) {
            this.a($$2.ct());
            this.c();
        }
        if (!(this.a() <= 0 || $$2 != null && $$2.ae() == bfn.bt && $$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
                this.O_();
            }
        }
    }

    default public boolean a_(bfz $$0) {
        if (!this.c($$0)) {
            return false;
        }
        if ($$0.ae() == bfn.bt && this.a_($$0.dI())) {
            return true;
        }
        return $$0.ct().equals(this.b());
    }

    default public boolean a_(cmm $$0) {
        return $$0.X().b(cmi.K) && this.S_() && this.b() == null;
    }

    default public boolean S_() {
        return this.a() > 0;
    }

    default public void a_(byo $$0) {
        if (!$$0.dI().X().b(cmi.J)) {
            return;
        }
        if (!$$0.ct().equals(this.b())) {
            return;
        }
        this.O_();
    }

    default public void T_() {
        this.O_();
        this.c();
    }

    default public void O_() {
        this.a((bfz)null);
        this.a((UUID)null);
        this.h(null);
        this.a(0);
    }

    @Nullable
    public bfz ed();

    public void a(@Nullable bfz var1);

    public void c(@Nullable byo var1);

    public void h(@Nullable bfz var1);

    public boolean c(bfz var1);

    @Nullable
    public bfz j();
}

