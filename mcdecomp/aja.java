/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.Validate
 *  org.slf4j.Logger
 */
import com.google.common.primitives.Ints;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.PrivateKey;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class aja
implements abk,
so {
    private static final AtomicInteger a = new AtomicInteger(0);
    static final Logger b = LogUtils.getLogger();
    private static final int c = 600;
    private static final apf d = apf.a();
    private final byte[] e;
    final MinecraftServer f;
    final sd g;
    a h = aja$a.a;
    private int i;
    @Nullable
    GameProfile j;
    private final String k = "";
    @Nullable
    private aig l;

    public aja(MinecraftServer $$0, sd $$1) {
        this.f = $$0;
        this.g = $$1;
        this.e = Ints.toByteArray((int)d.f());
    }

    @Override
    public void c() {
        aig $$0;
        if (this.h == aja$a.e) {
            this.d();
        } else if (this.h == aja$a.f && ($$0 = this.f.ac().a(this.j.getId())) == null) {
            this.h = aja$a.e;
            this.a(this.l);
            this.l = null;
        }
        if (this.i++ == 600) {
            this.b(sw.c("multiplayer.disconnect.slow_login"));
        }
    }

    @Override
    public boolean a() {
        return this.g.h();
    }

    public void b(sw $$0) {
        try {
            b.info("Disconnecting {}: {}", (Object)this.e(), (Object)$$0.getString());
            this.g.a(new abj($$0));
            this.g.a($$0);
        }
        catch (Exception $$1) {
            b.error("Error whilst disconnecting player", (Throwable)$$1);
        }
    }

    public void d() {
        sw $$0;
        if (!this.j.isComplete()) {
            this.j = this.a(this.j);
        }
        if (($$0 = this.f.ac().a(this.g.c(), this.j)) != null) {
            this.b($$0);
        } else {
            this.h = aja$a.g;
            if (this.f.av() >= 0 && !this.g.d()) {
                this.g.a(new abi(this.f.av()), sl.a(() -> this.g.a(this.f.av(), true)));
            }
            this.g.a(new abg(this.j));
            aig $$1 = this.f.ac().a(this.j.getId());
            try {
                aig $$2 = this.f.ac().e(this.j);
                if ($$1 != null) {
                    this.h = aja$a.f;
                    this.l = $$2;
                } else {
                    this.a($$2);
                }
            }
            catch (Exception $$3) {
                b.error("Couldn't place player in world", (Throwable)$$3);
                tj $$4 = sw.c("multiplayer.disconnect.invalid_player_data");
                this.g.a(new vs($$4));
                this.g.a($$4);
            }
        }
    }

    private void a(aig $$0) {
        this.f.ac().a(this.g, $$0);
    }

    @Override
    public void a(sw $$0) {
        b.info("{} lost connection: {}", (Object)this.e(), (Object)$$0.getString());
    }

    public String e() {
        if (this.j != null) {
            return this.j + " (" + this.g.c() + ")";
        }
        return String.valueOf(this.g.c());
    }

    @Override
    public void a(abm $$0) {
        Validate.validState((this.h == aja$a.a ? 1 : 0) != 0, (String)"Unexpected hello packet", (Object[])new Object[0]);
        Validate.validState((boolean)aja.a($$0.a()), (String)"Invalid characters in username", (Object[])new Object[0]);
        GameProfile $$1 = this.f.N();
        if ($$1 != null && $$0.a().equalsIgnoreCase($$1.getName())) {
            this.j = $$1;
            this.h = aja$a.e;
            return;
        }
        this.j = new GameProfile(null, $$0.a());
        if (this.f.U() && !this.g.d()) {
            this.h = aja$a.b;
            this.g.a(new abh("", this.f.L().getPublic().getEncoded(), this.e));
        } else {
            this.h = aja$a.e;
        }
    }

    public static boolean a(String $$02) {
        return $$02.chars().filter($$0 -> $$0 <= 32 || $$0 >= 127).findAny().isEmpty();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(abn $$0) {
        void $$7;
        Validate.validState((this.h == aja$a.b ? 1 : 0) != 0, (String)"Unexpected key packet", (Object[])new Object[0]);
        try {
            PrivateKey $$1 = this.f.L().getPrivate();
            if (!$$0.a(this.e, $$1)) {
                throw new IllegalStateException("Protocol error");
            }
            SecretKey $$2 = $$0.a($$1);
            Cipher $$3 = anz.a(2, $$2);
            Cipher $$4 = anz.a(1, $$2);
            String $$5 = new BigInteger(anz.a("", this.f.L().getPublic(), $$2)).toString(16);
            this.h = aja$a.c;
            this.g.a($$3, $$4);
        }
        catch (aoa $$6) {
            throw new IllegalStateException("Protocol error", $$6);
        }
        Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet(), (String)$$7){
            final /* synthetic */ String a;
            {
                this.a = string;
                super($$1);
            }

            @Override
            public void run() {
                GameProfile $$0 = aja.this.j;
                try {
                    aja.this.j = aja.this.f.am().hasJoinedServer(new GameProfile(null, $$0.getName()), this.a, this.a());
                    if (aja.this.j != null) {
                        b.info("UUID of player {} is {}", (Object)aja.this.j.getName(), (Object)aja.this.j.getId());
                        aja.this.h = aja$a.e;
                    } else if (aja.this.f.O()) {
                        b.warn("Failed to verify username but will let them in anyway!");
                        aja.this.j = $$0;
                        aja.this.h = aja$a.e;
                    } else {
                        aja.this.b(sw.c("multiplayer.disconnect.unverified_username"));
                        b.error("Username '{}' tried to join with an invalid session", (Object)$$0.getName());
                    }
                }
                catch (AuthenticationUnavailableException $$1) {
                    if (aja.this.f.O()) {
                        b.warn("Authentication servers are down but will let them in anyway!");
                        aja.this.j = $$0;
                        aja.this.h = aja$a.e;
                    }
                    aja.this.b(sw.c("multiplayer.disconnect.authservers_down"));
                    b.error("Couldn't verify username because servers are unavailable");
                }
            }

            @Nullable
            private InetAddress a() {
                SocketAddress $$0 = aja.this.g.c();
                return aja.this.f.V() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
            }
        };
        $$8.setUncaughtExceptionHandler(new r(b));
        $$8.start();
    }

    @Override
    public void a(abl $$0) {
        this.b(sw.c("multiplayer.disconnect.unexpected_query_response"));
    }

    protected GameProfile a(GameProfile $$0) {
        UUID $$1 = hy.a($$0.getName());
        return new GameProfile($$1, $$0.getName());
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        public static final /* enum */ a f = new a();
        public static final /* enum */ a g = new a();
        private static final /* synthetic */ a[] h;

        public static a[] values() {
            return (a[])h.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g};
        }

        static {
            h = aja$a.a();
        }
    }
}

