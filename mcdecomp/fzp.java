/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class fzp {
    private final UUID a = UUID.randomUUID();
    private final fzk b;
    private final fzt c;
    private final fzv d = new fzv();
    private final fzs e;
    private final fzu f;

    public fzp(fzk $$02, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
        this.c = new fzt($$3);
        this.e = new fzs();
        this.f = new fzu($$1, $$2);
        this.b = $$02.decorate($$0 -> {
            this.c.a((fzo.a)$$0);
            $$0.a(fzn.i, this.a);
        });
    }

    public void a() {
        this.e.a(this.b);
    }

    public void a(cmj $$0, boolean $$1) {
        this.c.a($$0, $$1);
        this.d.a();
        this.b();
    }

    public void a(String $$0) {
        this.c.a($$0);
        this.b();
    }

    public void a(long $$0) {
        this.d.a($$0);
    }

    public void b() {
        if (this.c.a(this.b)) {
            this.f.a(this.b);
            this.e.a();
        }
    }

    public void c() {
        this.c.a(this.b);
        this.e.d();
        this.d.a(this.b);
    }

    public void a(cmm $$0, ae $$1) {
        acq $$22 = $$1.j();
        if ($$1.e() && "minecraft".equals($$22.b())) {
            long $$3 = $$0.V();
            this.b.send(fzl.f, $$2 -> {
                $$2.a(fzn.D, $$22.toString());
                $$2.a(fzn.E, $$3);
            });
        }
    }
}

