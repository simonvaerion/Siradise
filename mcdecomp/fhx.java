/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 */
import java.util.function.Consumer;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public class fhx
extends fim {
    private static final Vector3f a = new Vector3f(0.5f, 0.5f, 0.5f).normalize();
    private static final Vector3f b = new Vector3f(-1.0f, -1.0f, 0.0f);
    private static final float F = 1.0472f;
    private int G;

    fhx(few $$0, double $$1, double $$2, double $$3, int $$4) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
        this.D = 0.85f;
        this.G = $$4;
        this.t = 30;
        this.u = 0.0f;
        this.j = 0.0;
        this.k = 0.1;
        this.l = 0.0;
    }

    @Override
    public float b(float $$0) {
        return this.D * apa.a(((float)this.s + $$0) / (float)this.t * 0.75f, 0.0f, 1.0f);
    }

    @Override
    public void a(ein $$02, emz $$1, float $$2) {
        if (this.G > 0) {
            return;
        }
        this.y = 1.0f - apa.a(((float)this.s + $$2) / (float)this.t, 0.0f, 1.0f);
        this.a($$02, $$1, $$2, $$0 -> $$0.mul((Quaternionfc)new Quaternionf().rotationX(-1.0472f)));
        this.a($$02, $$1, $$2, $$0 -> $$0.mul((Quaternionfc)new Quaternionf().rotationYXZ((float)(-Math.PI), 1.0472f, 0.0f)));
    }

    private void a(ein $$0, emz $$1, float $$2, Consumer<Quaternionf> $$3) {
        eei $$4 = $$1.b();
        float $$5 = (float)(apa.d((double)$$2, this.d, this.g) - $$4.a());
        float $$6 = (float)(apa.d((double)$$2, this.e, this.h) - $$4.b());
        float $$7 = (float)(apa.d((double)$$2, this.f, this.i) - $$4.c());
        Quaternionf $$8 = new Quaternionf().setAngleAxis(0.0f, a.x(), a.y(), a.z());
        $$3.accept($$8);
        $$8.transform(b);
        Vector3f[] $$9 = new Vector3f[]{new Vector3f(-1.0f, -1.0f, 0.0f), new Vector3f(-1.0f, 1.0f, 0.0f), new Vector3f(1.0f, 1.0f, 0.0f), new Vector3f(1.0f, -1.0f, 0.0f)};
        float $$10 = this.b($$2);
        for (int $$11 = 0; $$11 < 4; ++$$11) {
            Vector3f $$12 = $$9[$$11];
            $$12.rotate((Quaternionfc)$$8);
            $$12.mul($$10);
            $$12.add($$5, $$6, $$7);
        }
        int $$13 = this.a($$2);
        this.a($$0, $$9[0], this.d(), this.f(), $$13);
        this.a($$0, $$9[1], this.d(), this.e(), $$13);
        this.a($$0, $$9[2], this.c(), this.e(), $$13);
        this.a($$0, $$9[3], this.c(), this.f(), $$13);
    }

    private void a(ein $$0, Vector3f $$1, float $$2, float $$3, int $$4) {
        $$0.a((double)$$1.x(), (double)$$1.y(), (double)$$1.z()).a($$2, $$3).a(this.v, this.w, this.x, this.y).b($$4).e();
    }

    @Override
    public int a(float $$0) {
        return 240;
    }

    @Override
    public fhq b() {
        return fhq.c;
    }

    @Override
    public void a() {
        if (this.G > 0) {
            --this.G;
            return;
        }
        super.a();
    }

    public static class a
    implements fhp<ix> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(ix $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fhx $$8 = new fhx($$1, $$2, $$3, $$4, $$0.c());
            $$8.a(this.a);
            $$8.e(1.0f);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((ix)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

