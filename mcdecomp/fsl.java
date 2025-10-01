/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.util.Map;

public class fsl<T extends bfz, M extends fbf<T>>
extends ftg<T, M> {
    private final float a;
    private final float b;
    private final float c;
    private final Map<cwp.a, fdc> d;
    private final fjt e;

    public fsl(fqt<T, M> $$0, fea $$1, fjt $$2) {
        this($$0, $$1, 1.0f, 1.0f, 1.0f, $$2);
    }

    public fsl(fqt<T, M> $$0, fea $$1, float $$2, float $$3, float $$4, fjt $$5) {
        super($$0);
        this.a = $$2;
        this.b = $$3;
        this.c = $$4;
        this.d = fmj.a($$1);
        this.e = $$5;
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        cdj $$25;
        boolean $$12;
        cfz $$10 = ((bfz)$$3).c(bfo.f);
        if ($$10.b()) {
            return;
        }
        cfu $$11 = $$10.d();
        $$0.a();
        $$0.b(this.a, this.b, this.c);
        boolean bl2 = $$12 = $$3 instanceof byb || $$3 instanceof bww;
        if (((bfz)$$3).h_() && !($$3 instanceof byb)) {
            float $$13 = 2.0f;
            float $$14 = 1.4f;
            $$0.a(0.0f, 0.03125f, 0.0f);
            $$0.b(0.7f, 0.7f, 0.7f);
            $$0.a(0.0f, 1.0f, 0.0f);
        }
        ((fbn)this.c()).d().a($$0);
        if ($$11 instanceof cds && ((cds)$$11).e() instanceof coj) {
            bgz $$23;
            qr $$17;
            float $$15 = 1.1875f;
            $$0.b(1.1875f, -1.1875f, -1.1875f);
            if ($$12) {
                $$0.a(0.0f, 0.0625f, 0.0f);
            }
            GameProfile $$16 = null;
            if ($$10.u() && ($$17 = $$10.v()).b("SkullOwner", 10)) {
                $$16 = rd.a($$17.p("SkullOwner"));
            }
            $$0.a(-0.5, 0.0, -0.5);
            cwp.a $$18 = ((coj)((cds)$$11).e()).a();
            fdc $$19 = this.d.get($$18);
            fkf $$20 = fmj.a($$18, $$16);
            bfj bfj2 = ((bfj)$$3).cW();
            if (bfj2 instanceof bfz) {
                bfz $$21 = (bfz)bfj2;
                bgz $$22 = $$21.aR;
            } else {
                $$23 = ((bfz)$$3).aR;
            }
            float $$24 = $$23.c($$6);
            fmj.a(null, 180.0f, $$24, $$0, $$1, $$2, $$19, $$20);
        } else if (!($$11 instanceof cdj) || ($$25 = (cdj)$$11).g() != bfo.f) {
            fsl.a($$0, $$12);
            this.e.a((bfz)$$3, $$10, cfw.f, false, $$0, $$1, $$2);
        }
        $$0.b();
    }

    public static void a(eij $$0, boolean $$1) {
        float $$2 = 0.625f;
        $$0.a(0.0f, -0.25f, 0.0f);
        $$0.a(a.d.rotationDegrees(180.0f));
        $$0.b(0.625f, -0.625f, -0.625f);
        if ($$1) {
            $$0.a(0.0f, 0.1875f, 0.0f);
        }
    }
}

