/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ahd
extends alk {
    private static final Logger a = LogUtils.getLogger();

    public ahd(ahe $$0, hl<acz> $$1, dzb $$2) {
        super($$0, $$1, $$2, $$0.a().H);
        ahf $$3 = $$0.a();
        this.a($$3.F);
        this.b($$3.G);
        super.a($$3.V.get());
        this.z();
        this.x();
        this.y();
        this.w();
        this.A();
        this.C();
        this.B();
        if (!this.i().b().exists()) {
            this.D();
        }
    }

    @Override
    public void a(boolean $$0) {
        super.a($$0);
        this.b().i($$0);
    }

    @Override
    public void a(GameProfile $$0) {
        super.a($$0);
        this.B();
    }

    @Override
    public void b(GameProfile $$0) {
        super.b($$0);
        this.B();
    }

    @Override
    public void a() {
        this.C();
    }

    private void w() {
        try {
            this.g().e();
        }
        catch (IOException $$0) {
            a.warn("Failed to save ip banlist: ", (Throwable)$$0);
        }
    }

    private void x() {
        try {
            this.f().e();
        }
        catch (IOException $$0) {
            a.warn("Failed to save user banlist: ", (Throwable)$$0);
        }
    }

    private void y() {
        try {
            this.g().f();
        }
        catch (IOException $$0) {
            a.warn("Failed to load ip banlist: ", (Throwable)$$0);
        }
    }

    private void z() {
        try {
            this.f().f();
        }
        catch (IOException $$0) {
            a.warn("Failed to load user banlist: ", (Throwable)$$0);
        }
    }

    private void A() {
        try {
            this.k().f();
        }
        catch (Exception $$0) {
            a.warn("Failed to load operators list: ", (Throwable)$$0);
        }
    }

    private void B() {
        try {
            this.k().e();
        }
        catch (Exception $$0) {
            a.warn("Failed to save operators list: ", (Throwable)$$0);
        }
    }

    private void C() {
        try {
            this.i().f();
        }
        catch (Exception $$0) {
            a.warn("Failed to load white-list: ", (Throwable)$$0);
        }
    }

    private void D() {
        try {
            this.i().e();
        }
        catch (Exception $$0) {
            a.warn("Failed to save white-list: ", (Throwable)$$0);
        }
    }

    @Override
    public boolean c(GameProfile $$0) {
        return !this.o() || this.f($$0) || this.i().a($$0);
    }

    public ahe b() {
        return (ahe)super.c();
    }

    @Override
    public boolean d(GameProfile $$0) {
        return this.k().a($$0);
    }

    @Override
    public /* synthetic */ MinecraftServer c() {
        return this.b();
    }
}

