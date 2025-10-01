/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Locale;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dzd
extends dzf {
    public String g();

    public void a(boolean var1);

    public int l();

    public void f(int var1);

    public void e(int var1);

    public int j();

    @Override
    default public void a(p $$0, cmo $$1) {
        dzf.super.a($$0, $$1);
        $$0.a("Level name", this::g);
        $$0.a("Level game mode", () -> String.format(Locale.ROOT, "Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", this.m().b(), this.m().a(), this.n(), this.o()));
        $$0.a("Level weather", () -> String.format(Locale.ROOT, "Rain time: %d (now: %b), thunder time: %d (now: %b)", this.l(), this.k(), this.j(), this.i()));
    }

    public int h();

    public void a(int var1);

    public int v();

    public void g(int var1);

    public int w();

    public void h(int var1);

    @Nullable
    public UUID x();

    public void a(UUID var1);

    public cmj m();

    public void a(dds.c var1);

    public dds.c r();

    public boolean p();

    public void c(boolean var1);

    public boolean o();

    public void a(cmj var1);

    public edv<MinecraftServer> u();

    public void a(long var1);

    public void b(long var1);
}

