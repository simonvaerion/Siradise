/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.List;

public class fck<T extends bfz>
extends fbs<T> {
    private static final String a = "ear";
    private static final String A = "cloak";
    private static final String B = "left_sleeve";
    private static final String C = "right_sleeve";
    private static final String D = "left_pants";
    private static final String E = "right_pants";
    private final List<fee> F;
    public final fee b;
    public final fee w;
    public final fee x;
    public final fee y;
    public final fee z;
    private final fee G;
    private final fee H;
    private final boolean I;

    public fck(fee $$02, boolean $$1) {
        super($$02, fkf::h);
        this.I = $$1;
        this.H = $$02.b(a);
        this.G = $$02.b(A);
        this.b = $$02.b(B);
        this.w = $$02.b(C);
        this.x = $$02.b(D);
        this.y = $$02.b(E);
        this.z = $$02.b("jacket");
        this.F = (List)$$02.e().filter($$0 -> !$$0.d()).collect(ImmutableList.toImmutableList());
    }

    public static fem a(fei $$0, boolean $$1) {
        fem $$2 = fbs.a($$0, 0.0f);
        fen $$3 = $$2.a();
        $$3.a(a, fej.c().a(24, 0).a(-3.0f, -6.0f, -1.0f, 6.0f, 6.0f, 1.0f, $$0), feg.a);
        $$3.a(A, fej.c().a(0, 0).a(-5.0f, 0.0f, -1.0f, 10.0f, 16.0f, 1.0f, $$0, 1.0f, 0.5f), feg.a(0.0f, 0.0f, 0.0f));
        float $$4 = 0.25f;
        if ($$1) {
            $$3.a("left_arm", fej.c().a(32, 48).a(-1.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, $$0), feg.a(5.0f, 2.5f, 0.0f));
            $$3.a("right_arm", fej.c().a(40, 16).a(-2.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, $$0), feg.a(-5.0f, 2.5f, 0.0f));
            $$3.a(B, fej.c().a(48, 48).a(-1.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, $$0.a(0.25f)), feg.a(5.0f, 2.5f, 0.0f));
            $$3.a(C, fej.c().a(40, 32).a(-2.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, $$0.a(0.25f)), feg.a(-5.0f, 2.5f, 0.0f));
        } else {
            $$3.a("left_arm", fej.c().a(32, 48).a(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), feg.a(5.0f, 2.0f, 0.0f));
            $$3.a(B, fej.c().a(48, 48).a(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(0.25f)), feg.a(5.0f, 2.0f, 0.0f));
            $$3.a(C, fej.c().a(40, 32).a(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(0.25f)), feg.a(-5.0f, 2.0f, 0.0f));
        }
        $$3.a("left_leg", fej.c().a(16, 48).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), feg.a(1.9f, 12.0f, 0.0f));
        $$3.a(D, fej.c().a(0, 48).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(0.25f)), feg.a(1.9f, 12.0f, 0.0f));
        $$3.a(E, fej.c().a(0, 32).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(0.25f)), feg.a(-1.9f, 12.0f, 0.0f));
        $$3.a("jacket", fej.c().a(16, 32).a(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, $$0.a(0.25f)), feg.a);
        return $$2;
    }

    @Override
    protected Iterable<fee> b() {
        return Iterables.concat(super.b(), (Iterable)ImmutableList.of((Object)this.x, (Object)this.y, (Object)this.b, (Object)this.w, (Object)this.z));
    }

    public void a(eij $$0, ein $$1, int $$2, int $$3) {
        this.H.a(this.k);
        this.H.b = 0.0f;
        this.H.c = 0.0f;
        this.H.a($$0, $$1, $$2, $$3);
    }

    public void b(eij $$0, ein $$1, int $$2, int $$3) {
        this.G.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        this.x.a(this.q);
        this.y.a(this.p);
        this.b.a(this.o);
        this.w.a(this.n);
        this.z.a(this.m);
        if (((bfz)$$0).c(bfo.e).b()) {
            if (((bfj)$$0).bU()) {
                this.G.d = 1.4f;
                this.G.c = 1.85f;
            } else {
                this.G.d = 0.0f;
                this.G.c = 0.0f;
            }
        } else if (((bfj)$$0).bU()) {
            this.G.d = 0.3f;
            this.G.c = 0.8f;
        } else {
            this.G.d = -1.1f;
            this.G.c = -0.85f;
        }
    }

    @Override
    public void d_(boolean $$0) {
        super.d_($$0);
        this.b.k = $$0;
        this.w.k = $$0;
        this.x.k = $$0;
        this.y.k = $$0;
        this.z.k = $$0;
        this.G.k = $$0;
        this.H.k = $$0;
    }

    @Override
    public void a(bft $$0, eij $$1) {
        fee $$2 = this.a($$0);
        if (this.I) {
            float $$3 = 0.5f * (float)($$0 == bft.b ? 1 : -1);
            $$2.b += $$3;
            $$2.a($$1);
            $$2.b -= $$3;
        } else {
            $$2.a($$1);
        }
    }

    public fee a(apf $$0) {
        return this.F.get($$0.a(this.F.size()));
    }
}

