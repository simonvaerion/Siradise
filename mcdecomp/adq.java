/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
import com.google.common.base.Charsets;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.Socket;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class adq {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 5;
    private final String c;
    private final int d;
    private final MinecraftServer e;
    private volatile boolean f;
    @Nullable
    private Socket g;
    @Nullable
    private Thread h;

    public adq(String $$0, int $$1, MinecraftServer $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public void a() {
        if (this.h != null && this.h.isAlive()) {
            a.warn("Remote control client was asked to start, but it is already running. Will ignore.");
        }
        this.f = true;
        this.h = new Thread(this::c, "chase-client");
        this.h.setDaemon(true);
        this.h.start();
    }

    public void b() {
        this.f = false;
        IOUtils.closeQuietly((Socket)this.g);
        this.g = null;
        this.h = null;
    }

    public void c() {
        String $$0 = this.c + ":" + this.d;
        while (this.f) {
            try {
                a.info("Connecting to remote control server {}", (Object)$$0);
                this.g = new Socket(this.c, this.d);
                a.info("Connected to remote control server! Will continuously execute the command broadcasted by that server.");
                try (BufferedReader $$1 = new BufferedReader(new InputStreamReader(this.g.getInputStream(), Charsets.US_ASCII));){
                    while (this.f) {
                        String $$2 = $$1.readLine();
                        if ($$2 == null) {
                            a.warn("Lost connection to remote control server {}. Will retry in {}s.", (Object)$$0, (Object)5);
                            break;
                        }
                        this.a($$2);
                    }
                }
                catch (IOException $$3) {
                    a.warn("Lost connection to remote control server {}. Will retry in {}s.", (Object)$$0, (Object)5);
                }
            }
            catch (IOException $$4) {
                a.warn("Failed to connect to remote control server {}. Will retry in {}s.", (Object)$$0, (Object)5);
            }
            if (!this.f) continue;
            try {
                Thread.sleep(5000L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    private void a(String $$0) {
        try (Scanner $$1 = new Scanner(new StringReader($$0));){
            $$1.useLocale(Locale.ROOT);
            String $$2 = $$1.next();
            if ("t".equals($$2)) {
                this.a($$1);
            } else {
                a.warn("Unknown message type '{}'", (Object)$$2);
            }
        }
        catch (NoSuchElementException $$3) {
            a.warn("Could not parse message '{}', ignoring", (Object)$$0);
        }
    }

    private void a(Scanner $$02) {
        this.b($$02).ifPresent($$0 -> this.b(String.format(Locale.ROOT, "execute in %s run tp @s %.3f %.3f %.3f %.3f %.3f", $$0.a.a(), $$0.b.c, $$0.b.d, $$0.b.e, Float.valueOf($$0.c.j), Float.valueOf($$0.c.i))));
    }

    private Optional<a> b(Scanner $$0) {
        acp $$1 = (acp)adz.a.get((Object)$$0.next());
        if ($$1 == null) {
            return Optional.empty();
        }
        float $$2 = $$0.nextFloat();
        float $$3 = $$0.nextFloat();
        float $$4 = $$0.nextFloat();
        float $$5 = $$0.nextFloat();
        float $$6 = $$0.nextFloat();
        return Optional.of(new a($$1, new eei($$2, $$3, $$4), new eeh($$6, $$5)));
    }

    private void b(String $$0) {
        this.e.execute(() -> {
            List<aig> $$1 = this.e.ac().t();
            if ($$1.isEmpty()) {
                return;
            }
            aig $$2 = $$1.get(0);
            aif $$3 = this.e.D();
            ds $$4 = new ds($$2, eei.a($$3.R()), eeh.a, $$3, 4, "", sv.a, this.e, $$2);
            dt $$5 = this.e.aC();
            $$5.a($$4, $$0);
        });
    }

    static final class a
    extends Record {
        final acp<cmm> a;
        final eei b;
        final eeh c;

        a(acp<cmm> $$0, eei $$1, eeh $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "level;pos;rot", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "level;pos;rot", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "level;pos;rot", "a", "b", "c"}, this, $$0);
        }

        public acp<cmm> a() {
            return this.a;
        }

        public eei b() {
            return this.b;
        }

        public eeh c() {
            return this.c;
        }
    }
}

