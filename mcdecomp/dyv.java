/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public interface dyv {
    public int a();

    public int b();

    public int c();

    public float d();

    public long e();

    public long f();

    public boolean i();

    public boolean k();

    public void b(boolean var1);

    public boolean n();

    public cmi q();

    public bdu s();

    public boolean t();

    default public void a(p $$0, cmo $$1) {
        $$0.a("Level spawn location", () -> p.a($$1, this.a(), this.b(), this.c()));
        $$0.a("Level time", () -> String.format(Locale.ROOT, "%d game time, %d day time", this.e(), this.f()));
    }
}

