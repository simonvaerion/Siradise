/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 */
import java.util.Optional;
import java.util.function.Consumer;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public class fip
extends fim {
    private final dgp a;
    private float b;
    private float F;
    private float G;
    private float H;

    fip(few $$0, double $$1, double $$2, double $$3, dgp $$4, int $$5) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
        this.D = 0.3f;
        this.a = $$4;
        this.t = $$5;
        Optional<eei> $$6 = $$4.a($$0);
        if ($$6.isPresent()) {
            eei $$7 = $$6.get();
            double $$8 = $$1 - $$7.a();
            double $$9 = $$2 - $$7.b();
            double $$10 = $$3 - $$7.c();
            this.F = this.b = (float)apa.d($$8, $$10);
            this.H = this.G = (float)apa.d($$9, Math.sqrt($$8 * $$8 + $$10 * $$10));
        }
    }

    @Override
    public void a(ein $$0, emz $$1, float $$2) {
        float $$32 = apa.a(((float)this.s + $$2 - (float)Math.PI * 2) * 0.05f) * 2.0f;
        float $$4 = apa.i($$2, this.F, this.b);
        float $$5 = apa.i($$2, this.H, this.G) + 1.5707964f;
        this.a($$0, $$1, $$2, $$3 -> $$3.rotateY($$4).rotateX(-$$5).rotateY($$32));
        this.a($$0, $$1, $$2, $$3 -> $$3.rotateY((float)(-Math.PI) + $$4).rotateX($$5).rotateY($$32));
    }

    private void a(ein $$0, emz $$1, float $$2, Consumer<Quaternionf> $$3) {
        eei $$4 = $$1.b();
        float $$5 = (float)(apa.d((double)$$2, this.d, this.g) - $$4.a());
        float $$6 = (float)(apa.d((double)$$2, this.e, this.h) - $$4.b());
        float $$7 = (float)(apa.d((double)$$2, this.f, this.i) - $$4.c());
        Vector3f $$8 = new Vector3f(0.5f, 0.5f, 0.5f).normalize();
        Quaternionf $$9 = new Quaternionf().setAngleAxis(0.0f, $$8.x(), $$8.y(), $$8.z());
        $$3.accept($$9);
        Vector3f[] $$10 = new Vector3f[]{new Vector3f(-1.0f, -1.0f, 0.0f), new Vector3f(-1.0f, 1.0f, 0.0f), new Vector3f(1.0f, 1.0f, 0.0f), new Vector3f(1.0f, -1.0f, 0.0f)};
        float $$11 = this.b($$2);
        for (int $$12 = 0; $$12 < 4; ++$$12) {
            Vector3f $$13 = $$10[$$12];
            $$13.rotate((Quaternionfc)$$9);
            $$13.mul($$11);
            $$13.add($$5, $$6, $$7);
        }
        float $$14 = this.c();
        float $$15 = this.d();
        float $$16 = this.e();
        float $$17 = this.f();
        int $$18 = this.a($$2);
        $$0.a((double)$$10[0].x(), (double)$$10[0].y(), (double)$$10[0].z()).a($$15, $$17).a(this.v, this.w, this.x, this.y).b($$18).e();
        $$0.a((double)$$10[1].x(), (double)$$10[1].y(), (double)$$10[1].z()).a($$15, $$16).a(this.v, this.w, this.x, this.y).b($$18).e();
        $$0.a((double)$$10[2].x(), (double)$$10[2].y(), (double)$$10[2].z()).a($$14, $$16).a(this.v, this.w, this.x, this.y).b($$18).e();
        $$0.a((double)$$10[3].x(), (double)$$10[3].y(), (double)$$10[3].z()).a($$14, $$17).a(this.v, this.w, this.x, this.y).b($$18).e();
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
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        if (this.s++ >= this.t) {
            this.k();
            return;
        }
        Optional<eei> $$0 = this.a.a(this.c);
        if ($$0.isEmpty()) {
            this.k();
            return;
        }
        int $$1 = this.t - this.s;
        double $$2 = 1.0 / (double)$$1;
        eei $$3 = $$0.get();
        this.g = apa.d($$2, this.g, $$3.a());
        this.h = apa.d($$2, this.h, $$3.b());
        this.i = apa.d($$2, this.i, $$3.c());
        double $$4 = this.g - $$3.a();
        double $$5 = this.h - $$3.b();
        double $$6 = this.i - $$3.c();
        this.F = this.b;
        this.b = (float)apa.d($$4, $$6);
        this.H = this.G;
        this.G = (float)apa.d($$5, Math.sqrt($$4 * $$4 + $$6 * $$6));
    }

    public static class a
    implements fhp<iz> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iz $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fip $$8 = new fip($$1, $$2, $$3, $$4, $$0.c(), $$0.d());
            $$8.a(this.a);
            $$8.e(1.0f);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iz)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

