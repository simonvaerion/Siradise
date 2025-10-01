/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dav
extends czn {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 90;
    private static final int c = 10;
    @Nullable
    private UUID d;
    private daw e = this.f();
    private daw f = this.f();
    private boolean g;

    public dav(gu $$0, dcb $$1) {
        this((czp)czp.h, $$0, $$1);
    }

    public dav(czp $$0, gu $$1, dcb $$2) {
        super($$0, $$1, $$2);
    }

    protected daw f() {
        return new daw();
    }

    public boolean a(byo $$0) {
        cpn cpn2 = this.q().b();
        if (cpn2 instanceof cwn) {
            float $$6;
            cwn $$1 = (cwn)cpn2;
            eei $$2 = $$1.h(this.q());
            double $$3 = $$0.dn() - ((double)this.p().u() + $$2.c);
            double $$4 = $$0.dt() - ((double)this.p().w() + $$2.e);
            float $$5 = $$1.g(this.q());
            return apa.d($$5, $$6 = (float)(apa.d($$4, $$3) * 57.2957763671875) - 90.0f) <= 90.0f;
        }
        return false;
    }

    public daw b(byo $$0) {
        return this.a(this.a($$0));
    }

    public daw a(boolean $$0) {
        return $$0 ? this.e : this.f;
    }

    public daw g() {
        return this.e;
    }

    public daw i() {
        return this.f;
    }

    public int c() {
        return 10;
    }

    public int d() {
        return 90;
    }

    @Override
    protected void b(qr $$0) {
        super.b($$0);
        daw.a.encodeStart((DynamicOps)rc.a, (Object)this.e).resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)).ifPresent($$1 -> $$0.a("front_text", (rk)$$1));
        daw.a.encodeStart((DynamicOps)rc.a, (Object)this.f).resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)).ifPresent($$1 -> $$0.a("back_text", (rk)$$1));
        $$0.a("is_waxed", this.g);
    }

    @Override
    public void a(qr $$02) {
        super.a($$02);
        if ($$02.e("front_text")) {
            daw.a.parse((DynamicOps)rc.a, (Object)$$02.p("front_text")).resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)).ifPresent($$0 -> {
                this.e = this.a((daw)$$0);
            });
        }
        if ($$02.e("back_text")) {
            daw.a.parse((DynamicOps)rc.a, (Object)$$02.p("back_text")).resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)).ifPresent($$0 -> {
                this.f = this.a((daw)$$0);
            });
        }
        this.g = $$02.q("is_waxed");
    }

    private daw a(daw $$0) {
        for (int $$1 = 0; $$1 < 4; ++$$1) {
            sw $$2 = this.a($$0.a($$1, false));
            sw $$3 = this.a($$0.a($$1, true));
            $$0 = $$0.a($$1, $$2, $$3);
        }
        return $$0;
    }

    private sw a(sw $$0) {
        cmm cmm2 = this.o;
        if (cmm2 instanceof aif) {
            aif $$1 = (aif)cmm2;
            try {
                return sy.a(dav.a(null, $$1, this.p), $$0, null, 0);
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
        }
        return $$0;
    }

    public void a(byo $$0, boolean $$1, List<aiu> $$22) {
        if (this.w() || !$$0.ct().equals(this.v()) || this.o == null) {
            a.warn("Player {} just tried to change non-editable sign", (Object)$$0.Z().getString());
            return;
        }
        this.a($$2 -> this.a($$0, $$22, (daw)$$2), $$1);
        this.a((UUID)null);
        this.o.a(this.p(), this.q(), this.q(), 3);
    }

    public boolean a(UnaryOperator<daw> $$0, boolean $$1) {
        daw $$2 = this.a($$1);
        return this.a((daw)$$0.apply($$2), $$1);
    }

    private daw a(byo $$0, List<aiu> $$1, daw $$2) {
        for (int $$3 = 0; $$3 < $$1.size(); ++$$3) {
            aiu $$4 = $$1.get($$3);
            ts $$5 = $$2.a($$3, $$0.U()).a();
            $$2 = $$0.U() ? $$2.a($$3, sw.b($$4.b()).b($$5)) : $$2.a($$3, sw.b($$4.d()).b($$5), sw.b($$4.b()).b($$5));
        }
        return $$2;
    }

    public boolean a(daw $$0, boolean $$1) {
        return $$1 ? this.c($$0) : this.b($$0);
    }

    private boolean b(daw $$0) {
        if ($$0 != this.f) {
            this.f = $$0;
            this.x();
            return true;
        }
        return false;
    }

    private boolean c(daw $$0) {
        if ($$0 != this.e) {
            this.e = $$0;
            this.x();
            return true;
        }
        return false;
    }

    public boolean a(boolean $$0, byo $$1) {
        return this.w() && this.a($$0).b($$1);
    }

    public boolean a(byo $$0, cmm $$1, gu $$2, boolean $$3) {
        boolean $$4 = false;
        for (sw $$5 : this.a($$3).b($$0.U())) {
            ts $$6 = $$5.a();
            su $$7 = $$6.h();
            if ($$7 == null || $$7.a() != su.a.c) continue;
            $$0.cI().aC().a(dav.a($$0, $$1, $$2), $$7.b());
            $$4 = true;
        }
        return $$4;
    }

    private static ds a(@Nullable byo $$0, cmm $$1, gu $$2) {
        String $$3 = $$0 == null ? "Sign" : $$0.Z().getString();
        sw $$4 = $$0 == null ? sw.b("Sign") : $$0.H_();
        return new ds(dr.a, eei.b($$2), eeh.a, (aif)$$1, 2, $$3, $$4, $$1.n(), $$0);
    }

    public uz j() {
        return uz.a(this);
    }

    @Override
    public qr ao_() {
        return this.o();
    }

    @Override
    public boolean t() {
        return true;
    }

    public void a(@Nullable UUID $$0) {
        this.d = $$0;
    }

    @Nullable
    public UUID v() {
        return this.d;
    }

    private void x() {
        this.e();
        this.o.a(this.p(), this.q(), this.q(), 3);
    }

    public boolean w() {
        return this.g;
    }

    public boolean b(boolean $$0) {
        if (this.g != $$0) {
            this.g = $$0;
            this.x();
            return true;
        }
        return false;
    }

    public boolean b(UUID $$0) {
        byo $$1 = this.o.b($$0);
        return $$1 == null || $$1.i(this.p().u(), this.p().v(), this.p().w()) > 64.0;
    }

    public static void a(cmm $$0, gu $$1, dcb $$2, dav $$3) {
        UUID $$4 = $$3.v();
        if ($$4 != null) {
            $$3.a($$3, $$0, $$4);
        }
    }

    private void a(dav $$0, cmm $$1, UUID $$2) {
        if ($$0.b($$2)) {
            $$0.a((UUID)null);
        }
    }

    public /* synthetic */ uo h() {
        return this.j();
    }
}

