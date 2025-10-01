/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  com.mojang.authlib.exceptions.InsufficientPrivilegesException
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 *  com.mojang.authlib.exceptions.UserBannedException
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InsufficientPrivilegesException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.exceptions.UserBannedException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.security.PublicKey;
import java.time.Duration;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.slf4j.Logger;

public class fev
implements abe {
    private static final Logger a = LogUtils.getLogger();
    private final enn b;
    @Nullable
    private final ffd c;
    @Nullable
    private final euq d;
    private final Consumer<sw> e;
    private final sd f;
    private GameProfile g;
    private final boolean h;
    @Nullable
    private final Duration i;
    @Nullable
    private String j;

    public fev(sd $$0, enn $$1, @Nullable ffd $$2, @Nullable euq $$3, boolean $$4, @Nullable Duration $$5, Consumer<sw> $$6) {
        this.f = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$6;
        this.h = $$4;
        this.i = $$5;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(abh $$0) {
        void $$10;
        void $$9;
        void $$12;
        void $$11;
        try {
            SecretKey $$1 = anz.a();
            PublicKey $$2 = $$0.c();
            String $$3 = new BigInteger(anz.a($$0.a(), $$2, $$1)).toString(16);
            Cipher $$4 = anz.a(2, $$1);
            Cipher $$5 = anz.a(1, $$1);
            byte[] $$6 = $$0.d();
            abn $$7 = new abn($$1, $$2, $$6);
        }
        catch (Exception $$8) {
            throw new IllegalStateException("Protocol error", $$8);
        }
        this.e.accept(sw.c("connect.authorizing"));
        aos.a.submit(() -> this.a((String)$$11, (abn)$$12, (Cipher)$$9, (Cipher)$$10));
    }

    @Nullable
    private sw b(String $$0) {
        try {
            this.c().joinServer(this.b.U().h(), this.b.U().d(), $$0);
        }
        catch (AuthenticationUnavailableException $$1) {
            return sw.a("disconnect.loginFailedInfo", sw.c("disconnect.loginFailedInfo.serversUnavailable"));
        }
        catch (InvalidCredentialsException $$2) {
            return sw.a("disconnect.loginFailedInfo", sw.c("disconnect.loginFailedInfo.invalidSession"));
        }
        catch (InsufficientPrivilegesException $$3) {
            return sw.a("disconnect.loginFailedInfo", sw.c("disconnect.loginFailedInfo.insufficientPrivileges"));
        }
        catch (UserBannedException $$4) {
            return sw.a("disconnect.loginFailedInfo", sw.c("disconnect.loginFailedInfo.userBanned"));
        }
        catch (AuthenticationException $$5) {
            return sw.a("disconnect.loginFailedInfo", new Object[]{$$5.getMessage()});
        }
        return null;
    }

    private MinecraftSessionService c() {
        return this.b.aj();
    }

    @Override
    public void a(abg $$0) {
        this.e.accept(sw.c("connect.joining"));
        this.g = $$0.a();
        this.f.a(se.b);
        this.f.a(new fex(this.b, this.d, this.f, this.c, this.g, this.b.t().a(this.h, this.i, this.j)));
    }

    @Override
    public void a(sw $$0) {
        if (this.d != null && this.d instanceof gan) {
            this.b.a(new gaj(this.d, sv.p, $$0));
        } else {
            this.b.a(new ett(this.d, sv.p, $$0));
        }
    }

    @Override
    public boolean a() {
        return this.f.h();
    }

    @Override
    public void a(abj $$0) {
        this.f.a($$0.a());
    }

    @Override
    public void a(abi $$0) {
        if (!this.f.d()) {
            this.f.a($$0.a(), false);
        }
    }

    @Override
    public void a(abf $$0) {
        this.e.accept(sw.c("connect.negotiating"));
        this.f.a(new abl($$0.a(), null));
    }

    public void a(String $$0) {
        this.j = $$0;
    }

    private /* synthetic */ void a(String $$0, abn $$1, Cipher $$2, Cipher $$3) {
        sw $$4 = this.b($$0);
        if ($$4 != null) {
            if (this.c != null && this.c.d()) {
                a.warn($$4.getString());
            } else {
                this.f.a($$4);
                return;
            }
        }
        this.e.accept(sw.c("connect.encrypting"));
        this.f.a($$1, sl.a(() -> this.f.a($$2, $$3)));
    }
}

