/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 */
import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class fpm
extends fqe<bvy, fbm> {
    private static final acq a = new acq("textures/entity/guardian.png");
    private static final acq i = new acq("textures/entity/guardian_beam.png");
    private static final fkf j = fkf.d(i);

    public fpm(foy.a $$0) {
        this($$0, 0.5f, fed.ag);
    }

    protected fpm(foy.a $$0, float $$1, fec $$2) {
        super($$0, new fbm($$0.a($$2)), $$1);
    }

    @Override
    public boolean a(bvy $$0, fmw $$1, double $$2, double $$3, double $$4) {
        bfz $$5;
        if (super.a($$0, $$1, $$2, $$3, $$4)) {
            return true;
        }
        if ($$0.ga() && ($$5 = $$0.gb()) != null) {
            eei $$6 = this.a($$5, (double)$$5.de() * 0.5, 1.0f);
            eei $$7 = this.a($$0, $$0.cF(), 1.0f);
            return $$1.a(new eed($$7.c, $$7.d, $$7.e, $$6.c, $$6.d, $$6.e));
        }
        return false;
    }

    private eei a(bfz $$0, double $$1, float $$2) {
        double $$3 = apa.d((double)$$2, $$0.ab, $$0.dn());
        double $$4 = apa.d((double)$$2, $$0.ac, $$0.dp()) + $$1;
        double $$5 = apa.d((double)$$2, $$0.ad, $$0.dt());
        return new eei($$3, $$4, $$5);
    }

    @Override
    public void a(bvy $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        bfz $$6 = $$0.gb();
        if ($$6 != null) {
            float $$7 = $$0.F($$2);
            float $$8 = $$0.gc() + $$2;
            float $$9 = $$8 * 0.5f % 1.0f;
            float $$10 = $$0.cF();
            $$3.a();
            $$3.a(0.0f, $$10, 0.0f);
            eei $$11 = this.a($$6, (double)$$6.de() * 0.5, $$2);
            eei $$12 = this.a($$0, $$10, $$2);
            eei $$13 = $$11.d($$12);
            float $$14 = (float)($$13.f() + 1.0);
            $$13 = $$13.d();
            float $$15 = (float)Math.acos($$13.d);
            float $$16 = (float)Math.atan2($$13.e, $$13.c);
            $$3.a(a.d.rotationDegrees((1.5707964f - $$16) * 57.295776f));
            $$3.a(a.b.rotationDegrees($$15 * 57.295776f));
            boolean $$17 = true;
            float $$18 = $$8 * 0.05f * -1.5f;
            float $$19 = $$7 * $$7;
            int $$20 = 64 + (int)($$19 * 191.0f);
            int $$21 = 32 + (int)($$19 * 191.0f);
            int $$22 = 128 - (int)($$19 * 64.0f);
            float $$23 = 0.2f;
            float $$24 = 0.282f;
            float $$25 = apa.b($$18 + 2.3561945f) * 0.282f;
            float $$26 = apa.a($$18 + 2.3561945f) * 0.282f;
            float $$27 = apa.b($$18 + 0.7853982f) * 0.282f;
            float $$28 = apa.a($$18 + 0.7853982f) * 0.282f;
            float $$29 = apa.b($$18 + 3.926991f) * 0.282f;
            float $$30 = apa.a($$18 + 3.926991f) * 0.282f;
            float $$31 = apa.b($$18 + 5.4977875f) * 0.282f;
            float $$32 = apa.a($$18 + 5.4977875f) * 0.282f;
            float $$33 = apa.b($$18 + (float)Math.PI) * 0.2f;
            float $$34 = apa.a($$18 + (float)Math.PI) * 0.2f;
            float $$35 = apa.b($$18 + 0.0f) * 0.2f;
            float $$36 = apa.a($$18 + 0.0f) * 0.2f;
            float $$37 = apa.b($$18 + 1.5707964f) * 0.2f;
            float $$38 = apa.a($$18 + 1.5707964f) * 0.2f;
            float $$39 = apa.b($$18 + 4.712389f) * 0.2f;
            float $$40 = apa.a($$18 + 4.712389f) * 0.2f;
            float $$41 = $$14;
            float $$42 = 0.0f;
            float $$43 = 0.4999f;
            float $$44 = -1.0f + $$9;
            float $$45 = $$14 * 2.5f + $$44;
            ein $$46 = $$4.getBuffer(j);
            eij.a $$47 = $$3.c();
            Matrix4f $$48 = $$47.a();
            Matrix3f $$49 = $$47.b();
            fpm.a($$46, $$48, $$49, $$33, $$41, $$34, $$20, $$21, $$22, 0.4999f, $$45);
            fpm.a($$46, $$48, $$49, $$33, 0.0f, $$34, $$20, $$21, $$22, 0.4999f, $$44);
            fpm.a($$46, $$48, $$49, $$35, 0.0f, $$36, $$20, $$21, $$22, 0.0f, $$44);
            fpm.a($$46, $$48, $$49, $$35, $$41, $$36, $$20, $$21, $$22, 0.0f, $$45);
            fpm.a($$46, $$48, $$49, $$37, $$41, $$38, $$20, $$21, $$22, 0.4999f, $$45);
            fpm.a($$46, $$48, $$49, $$37, 0.0f, $$38, $$20, $$21, $$22, 0.4999f, $$44);
            fpm.a($$46, $$48, $$49, $$39, 0.0f, $$40, $$20, $$21, $$22, 0.0f, $$44);
            fpm.a($$46, $$48, $$49, $$39, $$41, $$40, $$20, $$21, $$22, 0.0f, $$45);
            float $$50 = 0.0f;
            if ($$0.ag % 2 == 0) {
                $$50 = 0.5f;
            }
            fpm.a($$46, $$48, $$49, $$25, $$41, $$26, $$20, $$21, $$22, 0.5f, $$50 + 0.5f);
            fpm.a($$46, $$48, $$49, $$27, $$41, $$28, $$20, $$21, $$22, 1.0f, $$50 + 0.5f);
            fpm.a($$46, $$48, $$49, $$31, $$41, $$32, $$20, $$21, $$22, 1.0f, $$50);
            fpm.a($$46, $$48, $$49, $$29, $$41, $$30, $$20, $$21, $$22, 0.5f, $$50);
            $$3.b();
        }
    }

    private static void a(ein $$0, Matrix4f $$1, Matrix3f $$2, float $$3, float $$4, float $$5, int $$6, int $$7, int $$8, float $$9, float $$10) {
        $$0.a($$1, $$3, $$4, $$5).a($$6, $$7, $$8, 255).a($$9, $$10).c(fum.d).b(0xF000F0).a($$2, 0.0f, 1.0f, 0.0f).e();
    }

    @Override
    public acq a(bvy $$0) {
        return a;
    }
}

