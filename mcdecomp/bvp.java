/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public interface bvp
extends bwg {
    public void b(boolean var1);

    public void a(bfz var1, cfz var2, bzg var3, float var4);

    @Nullable
    public bfz j();

    public void a();

    default public void b(bfz $$0, float $$1) {
        bdw $$2 = bzh.a($$0, cgc.uZ);
        cfz $$3 = $$0.b($$2);
        if ($$0.b(cgc.uZ)) {
            ceh.a($$0.dI(), $$0, $$2, $$3, $$1, 14 - $$0.dI().ai().a() * 4);
        }
        this.a();
    }

    default public void a(bfz $$0, bfz $$1, bzg $$2, float $$3, float $$4) {
        double $$5 = $$1.dn() - $$0.dn();
        double $$6 = $$1.dt() - $$0.dt();
        double $$7 = Math.sqrt($$5 * $$5 + $$6 * $$6);
        double $$8 = $$1.e(0.3333333333333333) - $$2.dp() + $$7 * (double)0.2f;
        Vector3f $$9 = this.a($$0, new eei($$5, $$8, $$6), $$3);
        $$2.c($$9.x(), $$9.y(), $$9.z(), $$4, 14 - $$0.dI().ai().a() * 4);
        $$0.a(amh.fq, 1.0f, 1.0f / ($$0.ec().i() * 0.4f + 0.8f));
    }

    default public Vector3f a(bfz $$0, eei $$1, float $$2) {
        Vector3f $$3 = $$1.j().normalize();
        Vector3f $$4 = new Vector3f((Vector3fc)$$3).cross((Vector3fc)new Vector3f(0.0f, 1.0f, 0.0f));
        if ((double)$$4.lengthSquared() <= 1.0E-7) {
            eei $$5 = $$0.i(1.0f);
            $$4 = new Vector3f((Vector3fc)$$3).cross((Vector3fc)$$5.j());
        }
        Vector3f $$6 = new Vector3f((Vector3fc)$$3).rotateAxis(1.5707964f, $$4.x, $$4.y, $$4.z);
        return new Vector3f((Vector3fc)$$3).rotateAxis($$2 * ((float)Math.PI / 180), $$6.x, $$6.y, $$6.z);
    }
}

