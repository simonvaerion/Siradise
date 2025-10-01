/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  com.mojang.authlib.GameProfile
 *  javax.annotation.Nullable
 */
import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import java.util.Locale;
import javax.annotation.Nullable;

public abstract class fiv
extends byo {
    private static final String g = "http://skins.minecraft.net/MinecraftSkins/%s.png";
    @Nullable
    private ffb cl;
    protected eei b = eei.b;
    public float c;
    public float d;
    public float e;
    public final few f;

    public fiv(few $$0, GameProfile $$1) {
        super($$0, $$0.R(), $$0.S(), $$1);
        this.f = $$0;
    }

    @Override
    public boolean G_() {
        ffb $$0 = this.b();
        return $$0 != null && $$0.e() == cmj.d;
    }

    @Override
    public boolean f() {
        ffb $$0 = this.b();
        return $$0 != null && $$0.e() == cmj.b;
    }

    public boolean a() {
        return this.b() != null;
    }

    @Nullable
    protected ffb b() {
        if (this.cl == null) {
            this.cl = enn.N().I().a(this.ct());
        }
        return this.cl;
    }

    @Override
    public void l() {
        this.b = this.dl();
        super.l();
    }

    public eei b(float $$0) {
        return this.b.a(this.dl(), (double)$$0);
    }

    public boolean c() {
        ffb $$0 = this.b();
        return $$0 != null && $$0.h();
    }

    public acq d() {
        ffb $$0 = this.b();
        return $$0 == null ? fvm.a(this.ct()) : $$0.j();
    }

    @Nullable
    public acq e() {
        ffb $$0 = this.b();
        return $$0 == null ? null : $$0.k();
    }

    public boolean h() {
        return this.b() != null;
    }

    @Nullable
    public acq i() {
        ffb $$0 = this.b();
        return $$0 == null ? null : $$0.l();
    }

    public static void a(acq $$0, String $$1) {
        fuw $$2 = enn.N().X();
        fug $$3 = $$2.b($$0, ful.c());
        if ($$3 == ful.c()) {
            $$3 = new fuj(null, String.format(Locale.ROOT, g, aps.a($$1)), fvm.a(hy.a($$1)), true, null);
            $$2.a($$0, $$3);
        }
    }

    public static acq c(String $$0) {
        return new acq("skins/" + Hashing.sha1().hashUnencodedChars((CharSequence)aps.a($$0)));
    }

    public String j() {
        ffb $$0 = this.b();
        return $$0 == null ? fvm.b(this.ct()) : $$0.i();
    }

    public float m() {
        float $$0 = 1.0f;
        if (this.fO().b) {
            $$0 *= 1.1f;
        }
        if (this.fO().b() == 0.0f || Float.isNaN($$0 *= ((float)this.b(bhg.d) / this.fO().b() + 1.0f) / 2.0f) || Float.isInfinite($$0)) {
            $$0 = 1.0f;
        }
        cfz $$1 = this.fk();
        if (this.fi()) {
            if ($$1.a(cgc.nG)) {
                int $$2 = this.fm();
                float $$3 = (float)$$2 / 20.0f;
                $$3 = $$3 > 1.0f ? 1.0f : ($$3 *= $$3);
                $$0 *= 1.0f - $$3 * 0.15f;
            } else if (enn.N().m.au().a() && this.gl()) {
                return 0.1f;
            }
        }
        return apa.i(enn.N().m.af().c().floatValue(), 1.0f, $$0);
    }
}

