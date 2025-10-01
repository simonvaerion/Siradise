/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class fai
extends fah {
    private static final String a = "right_body_stick";
    private static final String b = "left_body_stick";
    private static final String w = "shoulder_stick";
    private static final String x = "base_plate";
    private final fee y;
    private final fee z;
    private final fee A;
    private final fee B;

    public fai(fee $$0) {
        super($$0);
        this.y = $$0.b(a);
        this.z = $$0.b(b);
        this.A = $$0.b(w);
        this.B = $$0.b(x);
        this.l.k = false;
    }

    public static fek c() {
        fem $$0 = fbs.a(fei.a, 0.0f);
        fen $$1 = $$0.a();
        $$1.a("head", fej.c().a(0, 0).a(-1.0f, -7.0f, -1.0f, 2.0f, 7.0f, 2.0f), feg.a(0.0f, 1.0f, 0.0f));
        $$1.a("body", fej.c().a(0, 26).a(-6.0f, 0.0f, -1.5f, 12.0f, 3.0f, 3.0f), feg.a);
        $$1.a("right_arm", fej.c().a(24, 0).a(-2.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f), feg.a(-5.0f, 2.0f, 0.0f));
        $$1.a("left_arm", fej.c().a(32, 16).a().a(0.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f), feg.a(5.0f, 2.0f, 0.0f));
        $$1.a("right_leg", fej.c().a(8, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, 11.0f, 2.0f), feg.a(-1.9f, 12.0f, 0.0f));
        $$1.a("left_leg", fej.c().a(40, 16).a().a(-1.0f, 0.0f, -1.0f, 2.0f, 11.0f, 2.0f), feg.a(1.9f, 12.0f, 0.0f));
        $$1.a(a, fej.c().a(16, 0).a(-3.0f, 3.0f, -1.0f, 2.0f, 7.0f, 2.0f), feg.a);
        $$1.a(b, fej.c().a(48, 16).a(1.0f, 3.0f, -1.0f, 2.0f, 7.0f, 2.0f), feg.a);
        $$1.a(w, fej.c().a(0, 48).a(-4.0f, 10.0f, -1.0f, 8.0f, 2.0f, 2.0f), feg.a);
        $$1.a(x, fej.c().a(0, 32).a(-6.0f, 11.0f, -6.0f, 12.0f, 1.0f, 12.0f), feg.a(0.0f, 12.0f, 0.0f));
        return fek.a($$0, 64, 64);
    }

    @Override
    public void a(bux $$0, float $$1, float $$2, float $$3) {
        this.B.e = 0.0f;
        this.B.f = (float)Math.PI / 180 * -apa.j($$3, $$0.M, $$0.dy());
        this.B.g = 0.0f;
    }

    @Override
    public void a(bux $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        this.o.k = $$0.r();
        this.n.k = $$0.r();
        this.B.k = !$$0.s();
        this.y.e = (float)Math.PI / 180 * $$0.y().b();
        this.y.f = (float)Math.PI / 180 * $$0.y().c();
        this.y.g = (float)Math.PI / 180 * $$0.y().d();
        this.z.e = (float)Math.PI / 180 * $$0.y().b();
        this.z.f = (float)Math.PI / 180 * $$0.y().c();
        this.z.g = (float)Math.PI / 180 * $$0.y().d();
        this.A.e = (float)Math.PI / 180 * $$0.y().b();
        this.A.f = (float)Math.PI / 180 * $$0.y().c();
        this.A.g = (float)Math.PI / 180 * $$0.y().d();
    }

    @Override
    protected Iterable<fee> b() {
        return Iterables.concat(super.b(), (Iterable)ImmutableList.of((Object)this.y, (Object)this.z, (Object)this.A, (Object)this.B));
    }

    @Override
    public void a(bft $$0, eij $$1) {
        fee $$2 = this.a($$0);
        boolean $$3 = $$2.k;
        $$2.k = true;
        super.a($$0, $$1);
        $$2.k = $$3;
    }
}

