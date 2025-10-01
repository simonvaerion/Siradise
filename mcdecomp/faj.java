/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.joml.Vector3f
 */
import com.google.common.collect.ImmutableList;
import java.util.Map;
import org.joml.Vector3f;

public class faj<T extends bss>
extends fad<T> {
    public static final float a = 1.8849558f;
    private final fee b;
    private final fee f;
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;
    private final fee k;
    private final fee l;
    private final fee m;
    private final fee n;

    public faj(fee $$0) {
        super(true, 8.0f, 3.35f);
        this.j = $$0.b("body");
        this.k = this.j.b("head");
        this.g = this.j.b("right_hind_leg");
        this.f = this.j.b("left_hind_leg");
        this.i = this.j.b("right_front_leg");
        this.h = this.j.b("left_front_leg");
        this.b = this.j.b("tail");
        this.l = this.k.b("top_gills");
        this.m = this.k.b("left_gills");
        this.n = this.k.b("right_gills");
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fen $$2 = $$1.a("body", fej.c().a(0, 11).a(-4.0f, -2.0f, -9.0f, 8.0f, 4.0f, 10.0f).a(2, 17).a(0.0f, -3.0f, -8.0f, 0.0f, 5.0f, 9.0f), feg.a(0.0f, 20.0f, 5.0f));
        fei $$3 = new fei(0.001f);
        fen $$4 = $$2.a("head", fej.c().a(0, 1).a(-4.0f, -3.0f, -5.0f, 8.0f, 5.0f, 5.0f, $$3), feg.a(0.0f, 0.0f, -9.0f));
        fej $$5 = fej.c().a(3, 37).a(-4.0f, -3.0f, 0.0f, 8.0f, 3.0f, 0.0f, $$3);
        fej $$6 = fej.c().a(0, 40).a(-3.0f, -5.0f, 0.0f, 3.0f, 7.0f, 0.0f, $$3);
        fej $$7 = fej.c().a(11, 40).a(0.0f, -5.0f, 0.0f, 3.0f, 7.0f, 0.0f, $$3);
        $$4.a("top_gills", $$5, feg.a(0.0f, -3.0f, -1.0f));
        $$4.a("left_gills", $$6, feg.a(-4.0f, 0.0f, -1.0f));
        $$4.a("right_gills", $$7, feg.a(4.0f, 0.0f, -1.0f));
        fej $$8 = fej.c().a(2, 13).a(-1.0f, 0.0f, 0.0f, 3.0f, 5.0f, 0.0f, $$3);
        fej $$9 = fej.c().a(2, 13).a(-2.0f, 0.0f, 0.0f, 3.0f, 5.0f, 0.0f, $$3);
        $$2.a("right_hind_leg", $$9, feg.a(-3.5f, 1.0f, -1.0f));
        $$2.a("left_hind_leg", $$8, feg.a(3.5f, 1.0f, -1.0f));
        $$2.a("right_front_leg", $$9, feg.a(-3.5f, 1.0f, -8.0f));
        $$2.a("left_front_leg", $$8, feg.a(3.5f, 1.0f, -8.0f));
        $$2.a("tail", fej.c().a(2, 19).a(0.0f, -3.0f, 0.0f, 0.0f, 5.0f, 12.0f), feg.a(0.0f, 0.0f, 1.0f));
        return fek.a($$0, 64, 64);
    }

    @Override
    protected Iterable<fee> a() {
        return ImmutableList.of();
    }

    @Override
    protected Iterable<fee> b() {
        return ImmutableList.of((Object)this.j);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        boolean $$6;
        this.a($$0, $$4, $$5);
        if (((bss)$$0).ge()) {
            this.b($$4);
            this.a($$0);
            return;
        }
        boolean bl2 = $$6 = $$2 > 1.0E-5f || ((bfj)$$0).dA() != ((bss)$$0).N || ((bfj)$$0).dy() != ((bss)$$0).M;
        if (((bfj)$$0).aY()) {
            if ($$6) {
                this.d($$3, $$5);
            } else {
                this.a($$3);
            }
            this.a($$0);
            return;
        }
        if (((bfj)$$0).ay()) {
            if ($$6) {
                this.c($$3, $$4);
            } else {
                this.b($$3, $$4);
            }
        }
        this.a($$0);
    }

    private void a(T $$0) {
        Map<String, Vector3f> $$1 = ((bss)$$0).a();
        $$1.put("body", this.a(this.j));
        $$1.put("head", this.a(this.k));
        $$1.put("right_hind_leg", this.a(this.g));
        $$1.put("left_hind_leg", this.a(this.f));
        $$1.put("right_front_leg", this.a(this.i));
        $$1.put("left_front_leg", this.a(this.h));
        $$1.put("tail", this.a(this.b));
        $$1.put("top_gills", this.a(this.l));
        $$1.put("left_gills", this.a(this.m));
        $$1.put("right_gills", this.a(this.n));
    }

    private Vector3f a(fee $$0) {
        return new Vector3f($$0.e, $$0.f, $$0.g);
    }

    private void a(fee $$0, Vector3f $$1) {
        $$0.b($$1.x(), $$1.y(), $$1.z());
    }

    private void a(T $$0, float $$1, float $$2) {
        this.j.b = 0.0f;
        this.k.c = 0.0f;
        this.j.c = 20.0f;
        Map<String, Vector3f> $$3 = ((bss)$$0).a();
        if ($$3.isEmpty()) {
            this.j.b($$2 * ((float)Math.PI / 180), $$1 * ((float)Math.PI / 180), 0.0f);
            this.k.b(0.0f, 0.0f, 0.0f);
            this.f.b(0.0f, 0.0f, 0.0f);
            this.g.b(0.0f, 0.0f, 0.0f);
            this.h.b(0.0f, 0.0f, 0.0f);
            this.i.b(0.0f, 0.0f, 0.0f);
            this.m.b(0.0f, 0.0f, 0.0f);
            this.n.b(0.0f, 0.0f, 0.0f);
            this.l.b(0.0f, 0.0f, 0.0f);
            this.b.b(0.0f, 0.0f, 0.0f);
        } else {
            this.a(this.j, $$3.get("body"));
            this.a(this.k, $$3.get("head"));
            this.a(this.f, $$3.get("left_hind_leg"));
            this.a(this.g, $$3.get("right_hind_leg"));
            this.a(this.h, $$3.get("left_front_leg"));
            this.a(this.i, $$3.get("right_front_leg"));
            this.a(this.m, $$3.get("left_gills"));
            this.a(this.n, $$3.get("right_gills"));
            this.a(this.l, $$3.get("top_gills"));
            this.a(this.b, $$3.get("tail"));
        }
    }

    private float a(float $$0, float $$1) {
        return this.a(0.05f, $$0, $$1);
    }

    private float a(float $$0, float $$1, float $$2) {
        return apa.j($$0, $$1, $$2);
    }

    @Override
    private void a(fee $$0, float $$1, float $$2, float $$3) {
        $$0.b(this.a($$0.e, $$1), this.a($$0.f, $$2), this.a($$0.g, $$3));
    }

    private void b(float $$0, float $$1) {
        float $$2 = $$0 * 0.09f;
        float $$3 = apa.a($$2);
        float $$4 = apa.b($$2);
        float $$5 = $$3 * $$3 - 2.0f * $$3;
        float $$6 = $$4 * $$4 - 3.0f * $$3;
        this.k.e = this.a(this.k.e, -0.09f * $$5);
        this.k.f = this.a(this.k.f, 0.0f);
        this.k.g = this.a(this.k.g, -0.2f);
        this.b.f = this.a(this.b.f, -0.1f + 0.1f * $$5);
        this.l.e = this.a(this.l.e, 0.6f + 0.05f * $$6);
        this.m.f = this.a(this.m.f, -this.l.e);
        this.n.f = this.a(this.n.f, -this.m.f);
        this.a(this.f, 1.1f, 1.0f, 0.0f);
        this.a(this.h, 0.8f, 2.3f, -0.5f);
        this.d();
        this.j.e = this.a(0.2f, this.j.e, 0.0f);
        this.j.f = this.a(this.j.f, $$1 * ((float)Math.PI / 180));
        this.j.g = this.a(this.j.g, 0.0f);
    }

    private void c(float $$0, float $$1) {
        float $$2 = $$0 * 0.11f;
        float $$3 = apa.b($$2);
        float $$4 = ($$3 * $$3 - 2.0f * $$3) / 5.0f;
        float $$5 = 0.7f * $$3;
        this.k.e = this.a(this.k.e, 0.0f);
        this.k.f = this.a(this.k.f, 0.09f * $$3);
        this.k.g = this.a(this.k.g, 0.0f);
        this.b.f = this.a(this.b.f, this.k.f);
        this.l.e = this.a(this.l.e, 0.6f - 0.08f * ($$3 * $$3 + 2.0f * apa.a($$2)));
        this.m.f = this.a(this.m.f, -this.l.e);
        this.n.f = this.a(this.n.f, -this.m.f);
        this.a(this.f, 0.9424779f, 1.5f - $$4, -0.1f);
        this.a(this.h, 1.0995574f, 1.5707964f - $$5, 0.0f);
        this.a(this.g, this.f.e, -1.0f - $$4, 0.0f);
        this.a(this.i, this.h.e, -1.5707964f - $$5, 0.0f);
        this.j.e = this.a(0.2f, this.j.e, 0.0f);
        this.j.f = this.a(this.j.f, $$1 * ((float)Math.PI / 180));
        this.j.g = this.a(this.j.g, 0.0f);
    }

    private void a(float $$0) {
        float $$1 = $$0 * 0.075f;
        float $$2 = apa.b($$1);
        float $$3 = apa.a($$1) * 0.15f;
        this.j.e = this.a(this.j.e, -0.15f + 0.075f * $$2);
        this.j.c -= $$3;
        this.k.e = this.a(this.k.e, -this.j.e);
        this.l.e = this.a(this.l.e, 0.2f * $$2);
        this.m.f = this.a(this.m.f, -0.3f * $$2 - 0.19f);
        this.n.f = this.a(this.n.f, -this.m.f);
        this.a(this.f, 2.3561945f - $$2 * 0.11f, 0.47123894f, 1.7278761f);
        this.a(this.h, 0.7853982f - $$2 * 0.2f, 2.042035f, 0.0f);
        this.d();
        this.b.f = this.a(this.b.f, 0.5f * $$2);
        this.k.f = this.a(this.k.f, 0.0f);
        this.k.g = this.a(this.k.g, 0.0f);
    }

    private void d(float $$0, float $$1) {
        float $$2 = $$0 * 0.33f;
        float $$3 = apa.a($$2);
        float $$4 = apa.b($$2);
        float $$5 = 0.13f * $$3;
        this.j.e = this.a(0.1f, this.j.e, $$1 * ((float)Math.PI / 180) + $$5);
        this.k.e = -$$5 * 1.8f;
        this.j.c -= 0.45f * $$4;
        this.l.e = this.a(this.l.e, -0.5f * $$3 - 0.8f);
        this.m.f = this.a(this.m.f, 0.3f * $$3 + 0.9f);
        this.n.f = this.a(this.n.f, -this.m.f);
        this.b.f = this.a(this.b.f, 0.3f * apa.b($$2 * 0.9f));
        this.a(this.f, 1.8849558f, -0.4f * $$3, 1.5707964f);
        this.a(this.h, 1.8849558f, -0.2f * $$4 - 0.1f, 1.5707964f);
        this.d();
        this.k.f = this.a(this.k.f, 0.0f);
        this.k.g = this.a(this.k.g, 0.0f);
    }

    private void b(float $$0) {
        this.a(this.f, 1.4137167f, 1.0995574f, 0.7853982f);
        this.a(this.h, 0.7853982f, 2.042035f, 0.0f);
        this.j.e = this.a(this.j.e, -0.15f);
        this.j.g = this.a(this.j.g, 0.35f);
        this.d();
        this.j.f = this.a(this.j.f, $$0 * ((float)Math.PI / 180));
        this.k.e = this.a(this.k.e, 0.0f);
        this.k.f = this.a(this.k.f, 0.0f);
        this.k.g = this.a(this.k.g, 0.0f);
        this.b.f = this.a(this.b.f, 0.0f);
        this.a(this.l, 0.0f, 0.0f, 0.0f);
        this.a(this.m, 0.0f, 0.0f, 0.0f);
        this.a(this.n, 0.0f, 0.0f, 0.0f);
    }

    private void d() {
        this.a(this.g, this.f.e, -this.f.f, -this.f.g);
        this.a(this.i, this.h.e, -this.h.f, -this.h.g);
    }
}

