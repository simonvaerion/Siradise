/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import org.slf4j.Logger;

public class ezg
extends euq {
    private static final Logger k = LogUtils.getLogger();
    public static final dii a = new dii("test1".hashCode(), true, false);
    protected final euq b;
    private epi l;
    private epi m;
    private epi n;
    private epi o;
    protected epr c;
    private ezl p;

    public ezg(euq $$0) {
        super(sw.c("selectWorld.title"));
        this.b = $$0;
    }

    @Override
    public void f() {
        this.c.a();
    }

    @Override
    protected void b() {
        this.c = new epr(this.i, this.g / 2 - 100, 22, 200, 20, this.c, sw.c("selectWorld.search"));
        this.c.b((String $$0) -> this.p.a((String)$$0));
        this.p = new ezl(this, this.f, this.g, this.h, 48, this.h - 64, 36, this.c.b(), this.p);
        this.e(this.c);
        this.e(this.p);
        this.m = this.d(epi.a(sw.c("selectWorld.select"), (epi $$0) -> this.p.d().ifPresent(ezl.c::d)).a(this.g / 2 - 154, this.h - 52, 150, 20).a());
        this.d(epi.a(sw.c("selectWorld.create"), (epi $$0) -> eza.a(this.f, this)).a(this.g / 2 + 4, this.h - 52, 150, 20).a());
        this.n = this.d(epi.a(sw.c("selectWorld.edit"), (epi $$0) -> this.p.d().ifPresent(ezl.c::g)).a(this.g / 2 - 154, this.h - 28, 72, 20).a());
        this.l = this.d(epi.a(sw.c("selectWorld.delete"), (epi $$0) -> this.p.d().ifPresent(ezl.c::e)).a(this.g / 2 - 76, this.h - 28, 72, 20).a());
        this.o = this.d(epi.a(sw.c("selectWorld.recreate"), (epi $$0) -> this.p.d().ifPresent(ezl.c::h)).a(this.g / 2 + 4, this.h - 28, 72, 20).a());
        this.d(epi.a(sv.e, (epi $$0) -> this.f.a(this.b)).a(this.g / 2 + 82, this.h - 28, 72, 20).a());
        this.a(false, false);
        this.c(this.c);
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if (super.a($$0, $$1, $$2)) {
            return true;
        }
        return this.c.a($$0, $$1, $$2);
    }

    @Override
    public void aw_() {
        this.f.a(this.b);
    }

    @Override
    public boolean a(char $$0, int $$1) {
        return this.c.a($$0, $$1);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.p.a($$0, $$1, $$2, $$3);
        this.c.a($$0, $$1, $$2, $$3);
        $$0.a(this.i, this.e, this.g / 2, 8, 0xFFFFFF);
        super.a($$0, $$1, $$2, $$3);
    }

    public void a(boolean $$0, boolean $$1) {
        this.m.r = $$0;
        this.n.r = $$0;
        this.o.r = $$0;
        this.l.r = $$1;
    }

    @Override
    public void ax_() {
        if (this.p != null) {
            this.p.i().forEach(ezl.a::close);
        }
    }

    private /* synthetic */ void a(epi $$0) {
        try {
            ezl.c $$3;
            ezl.a $$2;
            String $$1 = "DEBUG world";
            if (!this.p.i().isEmpty() && ($$2 = (ezl.a)this.p.i().get(0)) instanceof ezl.c && ($$3 = (ezl.c)$$2).i().equals("DEBUG world")) {
                $$3.f();
            }
            cmq $$4 = new cmq("DEBUG world", cmj.d, false, bdu.c, true, new cmi(), cnf.c);
            String $$5 = v.a(this.f.k().c(), "DEBUG world", "");
            this.f.w().a($$5, $$4, a, drq::a);
        }
        catch (IOException $$6) {
            k.error("Failed to recreate the debug world", (Throwable)$$6);
        }
    }
}

