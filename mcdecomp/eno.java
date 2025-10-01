/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.glfw.GLFWDropCallback
 */
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import org.lwjgl.glfw.GLFWDropCallback;

public class eno {
    private final enn a;
    private boolean b;
    private boolean c;
    private boolean d;
    private double e;
    private double f;
    private int g;
    private int h = -1;
    private boolean i = true;
    private int j;
    private double k;
    private final apn l = new apn();
    private final apn m = new apn();
    private double n;
    private double o;
    private double p;
    private double q = Double.MIN_VALUE;
    private boolean r;

    public eno(enn $$0) {
        this.a = $$0;
    }

    private void a(long $$0, int $$1, int $$2, int $$3) {
        boolean $$4;
        if ($$0 != this.a.aM().i()) {
            return;
        }
        if (this.a.z != null) {
            this.a.a(enk.b);
        }
        boolean bl2 = $$4 = $$2 == 1;
        if (enn.a && $$1 == 0) {
            if ($$4) {
                if (($$3 & 2) == 2) {
                    $$1 = 1;
                    ++this.g;
                }
            } else if (this.g > 0) {
                $$1 = 1;
                --this.g;
            }
        }
        int $$5 = $$1;
        if ($$4) {
            if (this.a.m.U().c().booleanValue() && this.j++ > 0) {
                return;
            }
            this.h = $$5;
            this.k = ega.b();
        } else if (this.h != -1) {
            if (this.a.m.U().c().booleanValue() && --this.j > 0) {
                return;
            }
            this.h = -1;
        }
        boolean[] $$6 = new boolean[]{false};
        if (this.a.aJ() == null) {
            if (this.a.z == null) {
                if (!this.r && $$4) {
                    this.i();
                }
            } else {
                double $$7 = this.e * (double)this.a.aM().o() / (double)this.a.aM().m();
                double $$8 = this.f * (double)this.a.aM().p() / (double)this.a.aM().n();
                euq $$9 = this.a.z;
                if ($$4) {
                    $$9.w();
                    euq.a(() -> {
                        $$0[0] = $$9.a($$7, $$8, $$5);
                    }, "mouseClicked event handler", $$9.getClass().getCanonicalName());
                } else {
                    euq.a(() -> {
                        $$0[0] = $$9.b($$7, $$8, $$5);
                    }, "mouseReleased event handler", $$9.getClass().getCanonicalName());
                }
            }
        }
        if (!$$6[0] && this.a.z == null && this.a.aJ() == null) {
            if ($$5 == 0) {
                this.b = $$4;
            } else if ($$5 == 2) {
                this.c = $$4;
            } else if ($$5 == 1) {
                this.d = $$4;
            }
            enl.a(ehe.b.c.a($$5), $$4);
            if ($$4) {
                if (this.a.t.G_() && $$5 == 2) {
                    this.a.l.g().b();
                } else {
                    enl.a(ehe.b.c.a($$5));
                }
            }
        }
    }

    private void a(long $$0, double $$1, double $$2) {
        if ($$0 == enn.N().aM().i()) {
            double $$3 = (this.a.m.N().c() != false ? Math.signum($$2) : $$2) * this.a.m.B().c();
            if (this.a.aJ() == null) {
                if (this.a.z != null) {
                    double $$4 = this.e * (double)this.a.aM().o() / (double)this.a.aM().m();
                    double $$5 = this.f * (double)this.a.aM().p() / (double)this.a.aM().n();
                    this.a.z.a($$4, $$5, $$3);
                    this.a.z.w();
                } else if (this.a.t != null) {
                    if (this.p != 0.0 && Math.signum($$3) != Math.signum(this.p)) {
                        this.p = 0.0;
                    }
                    this.p += $$3;
                    int $$6 = (int)this.p;
                    if ($$6 == 0) {
                        return;
                    }
                    this.p -= (double)$$6;
                    if (this.a.t.G_()) {
                        if (this.a.l.g().a()) {
                            this.a.l.g().b(-$$6);
                        } else {
                            float $$7 = apa.a(this.a.t.fO().a() + (float)$$6 * 0.005f, 0.0f, 0.2f);
                            this.a.t.fO().a($$7);
                        }
                    } else {
                        this.a.t.fN().a((double)$$6);
                    }
                }
            }
        }
    }

    private void a(long $$0, List<Path> $$1) {
        if (this.a.z != null) {
            this.a.z.a($$1);
        }
    }

    public void a(long $$02) {
        ehe.a($$02, ($$0, $$1, $$2) -> this.a.execute(() -> this.b($$0, $$1, $$2)), ($$0, $$1, $$2, $$3) -> this.a.execute(() -> this.a($$0, $$1, $$2, $$3)), ($$0, $$1, $$2) -> this.a.execute(() -> this.a($$0, $$1, $$2)), ($$0, $$1, $$2) -> {
            Path[] $$3 = new Path[$$1];
            for (int $$4 = 0; $$4 < $$1; ++$$4) {
                $$3[$$4] = Paths.get(GLFWDropCallback.getName((long)$$2, (int)$$4), new String[0]);
            }
            this.a.execute(() -> this.a($$0, Arrays.asList($$3)));
        });
    }

    private void b(long $$0, double $$1, double $$2) {
        euq $$3;
        if ($$0 != enn.N().aM().i()) {
            return;
        }
        if (this.i) {
            this.e = $$1;
            this.f = $$2;
            this.i = false;
        }
        if (($$3 = this.a.z) != null && this.a.aJ() == null) {
            double $$4 = $$1 * (double)this.a.aM().o() / (double)this.a.aM().m();
            double $$5 = $$2 * (double)this.a.aM().p() / (double)this.a.aM().n();
            euq.a(() -> $$3.e($$4, $$5), "mouseMoved event handler", $$3.getClass().getCanonicalName());
            if (this.h != -1 && this.k > 0.0) {
                double $$6 = ($$1 - this.e) * (double)this.a.aM().o() / (double)this.a.aM().m();
                double $$7 = ($$2 - this.f) * (double)this.a.aM().p() / (double)this.a.aM().n();
                euq.a(() -> $$3.a($$4, $$5, this.h, $$6, $$7), "mouseDragged event handler", $$3.getClass().getCanonicalName());
            }
            $$3.v();
        }
        this.a.aG().a("mouse");
        if (this.h() && this.a.aB()) {
            this.n += $$1 - this.e;
            this.o += $$2 - this.f;
        }
        this.a();
        this.e = $$1;
        this.f = $$2;
        this.a.aG().c();
    }

    public void a() {
        double $$12;
        double $$11;
        double $$0 = ega.b();
        double $$1 = $$0 - this.q;
        this.q = $$0;
        if (!this.h() || !this.a.aB()) {
            this.n = 0.0;
            this.o = 0.0;
            return;
        }
        double $$2 = this.a.m.c().c() * (double)0.6f + (double)0.2f;
        double $$3 = $$2 * $$2 * $$2;
        double $$4 = $$3 * 8.0;
        if (this.a.m.ae) {
            double $$5 = this.l.a(this.n * $$4, $$1 * $$4);
            double $$6 = this.m.a(this.o * $$4, $$1 * $$4);
            double $$7 = $$5;
            double $$8 = $$6;
        } else if (this.a.m.au().a() && this.a.t.gl()) {
            this.l.a();
            this.m.a();
            double $$9 = this.n * $$3;
            double $$10 = this.o * $$3;
        } else {
            this.l.a();
            this.m.a();
            $$11 = this.n * $$4;
            $$12 = this.o * $$4;
        }
        this.n = 0.0;
        this.o = 0.0;
        int $$13 = 1;
        if (this.a.m.M().c().booleanValue()) {
            $$13 = -1;
        }
        this.a.aA().a($$11, $$12);
        if (this.a.t != null) {
            this.a.t.b($$11, $$12 * (double)$$13);
        }
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public double e() {
        return this.e;
    }

    public double f() {
        return this.f;
    }

    public void g() {
        this.i = true;
    }

    public boolean h() {
        return this.r;
    }

    public void i() {
        if (!this.a.aB()) {
            return;
        }
        if (this.r) {
            return;
        }
        if (!enn.a) {
            enl.a();
        }
        this.r = true;
        this.e = this.a.aM().m() / 2;
        this.f = this.a.aM().n() / 2;
        ehe.a(this.a.aM().i(), 212995, this.e, this.f);
        this.a.a((euq)null);
        this.a.x = 10000;
        this.i = true;
    }

    public void j() {
        if (!this.r) {
            return;
        }
        this.r = false;
        this.e = this.a.aM().m() / 2;
        this.f = this.a.aM().n() / 2;
        ehe.a(this.a.aM().i(), 212993, this.e, this.f);
    }

    public void k() {
        this.i = true;
    }
}

