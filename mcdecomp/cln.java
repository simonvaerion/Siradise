/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ResultConsumer
 *  javax.annotation.Nullable
 */
import com.mojang.brigadier.ResultConsumer;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class cln
implements dr {
    private static final SimpleDateFormat b = new SimpleDateFormat("HH:mm:ss");
    private static final sw c = sw.b("@");
    private long d = -1L;
    private boolean e = true;
    private int f;
    private boolean g = true;
    @Nullable
    private sw h;
    private String i = "";
    private sw j = c;

    public int k() {
        return this.f;
    }

    public void a(int $$0) {
        this.f = $$0;
    }

    public sw l() {
        return this.h == null ? sv.a : this.h;
    }

    public qr a(qr $$0) {
        $$0.a("Command", this.i);
        $$0.a("SuccessCount", this.f);
        $$0.a("CustomName", sw.a.a(this.j));
        $$0.a("TrackOutput", this.g);
        if (this.h != null && this.g) {
            $$0.a("LastOutput", sw.a.a(this.h));
        }
        $$0.a("UpdateLastExecution", this.e);
        if (this.e && this.d > 0L) {
            $$0.a("LastExecution", this.d);
        }
        return $$0;
    }

    public void b(qr $$0) {
        this.i = $$0.l("Command");
        this.f = $$0.h("SuccessCount");
        if ($$0.b("CustomName", 8)) {
            this.b(sw.a.a($$0.l("CustomName")));
        }
        if ($$0.b("TrackOutput", 1)) {
            this.g = $$0.q("TrackOutput");
        }
        if ($$0.b("LastOutput", 8) && this.g) {
            try {
                this.h = sw.a.a($$0.l("LastOutput"));
            }
            catch (Throwable $$1) {
                this.h = sw.b($$1.getMessage());
            }
        } else {
            this.h = null;
        }
        if ($$0.e("UpdateLastExecution")) {
            this.e = $$0.q("UpdateLastExecution");
        }
        this.d = this.e && $$0.e("LastExecution") ? $$0.i("LastExecution") : -1L;
    }

    public void a(String $$0) {
        this.i = $$0;
        this.f = 0;
    }

    public String m() {
        return this.i;
    }

    public boolean a(cmm $$02) {
        if ($$02.B || $$02.V() == this.d) {
            return false;
        }
        if ("Searge".equalsIgnoreCase(this.i)) {
            this.h = sw.b("#itzlipofutzli");
            this.f = 1;
            return true;
        }
        this.f = 0;
        MinecraftServer $$12 = this.e().n();
        if ($$12.o() && !aps.b(this.i)) {
            try {
                this.h = null;
                ds $$22 = this.i().a((ResultConsumer<ds>)((ResultConsumer)($$0, $$1, $$2) -> {
                    if ($$1) {
                        ++this.f;
                    }
                }));
                $$12.aC().a($$22, this.i);
            }
            catch (Throwable $$3) {
                o $$4 = o.a($$3, "Executing command block");
                p $$5 = $$4.a("Command to be executed");
                $$5.a("Command", this::m);
                $$5.a("Name", () -> this.n().getString());
                throw new y($$4);
            }
        }
        this.d = this.e ? $$02.V() : -1L;
        return true;
    }

    public sw n() {
        return this.j;
    }

    public void b(@Nullable sw $$0) {
        this.j = $$0 != null ? $$0 : c;
    }

    @Override
    public void a(sw $$0) {
        if (this.g) {
            this.h = sw.b("[" + b.format(new Date()) + "] ").b($$0);
            this.f();
        }
    }

    public abstract aif e();

    public abstract void f();

    public void c(@Nullable sw $$0) {
        this.h = $$0;
    }

    public void a(boolean $$0) {
        this.g = $$0;
    }

    public boolean o() {
        return this.g;
    }

    public bdx a(byo $$0) {
        if (!$$0.gk()) {
            return bdx.d;
        }
        if ($$0.cH().B) {
            $$0.a(this);
        }
        return bdx.a($$0.dI().B);
    }

    public abstract eei g();

    public abstract ds i();

    @Override
    public boolean e_() {
        return this.e().X().b(cmi.o) && this.g;
    }

    @Override
    public boolean q_() {
        return this.g;
    }

    @Override
    public boolean N_() {
        return this.e().X().b(cmi.i);
    }

    public abstract boolean j();
}

