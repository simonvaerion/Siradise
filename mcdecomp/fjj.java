/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fjj
implements aky {
    private static final dau[] a = (dau[])Arrays.stream(cen.values()).sorted(Comparator.comparingInt(cen::a)).map($$0 -> new dau((cen)$$0, gu.b, cpo.kP.n())).toArray(dau[]::new);
    private static final dau b = new dau(gu.b, cpo.kP.n());
    private final czu c = new czu(gu.b, cpo.cv.n());
    private final czu d = new dbe(gu.b, cpo.gV.n());
    private final dah e = new dah(gu.b, cpo.fG.n());
    private final czd f = new czd(gu.b, cpo.iJ.n());
    private final czj g = new czj(gu.b, cpo.bn.n());
    private final czz h = new czz(gu.b, cpo.mX.n());
    private final dac i = new dac(gu.b, cpo.so.n());
    private fcw j;
    private fdk k;
    private Map<cwp.a, fdc> l;
    private final flt m;
    private final fea n;

    public fjj(flt $$0, fea $$1) {
        this.m = $$0;
        this.n = $$1;
    }

    @Override
    public void a(akx $$0) {
        this.j = new fcw(this.n.a(fed.bd));
        this.k = new fdk(this.n.a(fed.bC));
        this.l = fmj.a(this.n);
    }

    /*
     * WARNING - void declaration
     */
    public void a(cfz $$0, cfw $$12, eij $$2, fjx $$3, int $$4, int $$5) {
        cfu $$6 = $$0.d();
        if ($$6 instanceof cds) {
            void $$24;
            cpn $$7 = ((cds)$$6).e();
            if ($$7 instanceof coj) {
                GameProfile $$8 = null;
                if ($$0.u()) {
                    qr $$9 = $$0.v();
                    if ($$9.b("SkullOwner", 10)) {
                        $$8 = rd.a($$9.p("SkullOwner"));
                    } else if ($$9.b("SkullOwner", 8) && !ac.b($$9.l("SkullOwner"))) {
                        $$8 = new GameProfile(null, $$9.l("SkullOwner"));
                        $$9.r("SkullOwner");
                        dax.a($$8, (GameProfile $$1) -> $$9.a("SkullOwner", rd.a(new qr(), $$1)));
                    }
                }
                cwp.a $$10 = ((coj)$$7).a();
                fdc $$11 = this.l.get($$10);
                fkf $$122 = fmj.a($$10, $$8);
                fmj.a(null, 180.0f, 0.0f, $$2, $$3, $$4, $$11, $$122);
                return;
            }
            dcb $$13 = $$7.n();
            if ($$7 instanceof cod) {
                this.f.a($$0, ((cod)$$7).a());
                czd $$14 = this.f;
            } else if ($$7 instanceof cpg) {
                this.g.a(((cpg)$$7).a());
                czj $$15 = this.g;
            } else if ($$13.a(cpo.mX)) {
                czz $$16 = this.h;
            } else if ($$13.a(cpo.cv)) {
                czu $$17 = this.c;
            } else if ($$13.a(cpo.fG)) {
                dah $$18 = this.e;
            } else if ($$13.a(cpo.gV)) {
                czu $$19 = this.d;
            } else if ($$13.a(cpo.so)) {
                this.i.a($$0);
                dac $$20 = this.i;
            } else if ($$7 instanceof cwm) {
                cen $$21 = cwm.b($$6);
                if ($$21 == null) {
                    dau $$22 = b;
                } else {
                    dau $$23 = a[$$21.a()];
                }
            } else {
                return;
            }
            this.m.a($$24, $$2, $$3, $$4, $$5);
            return;
        }
        if ($$0.a(cgc.uy)) {
            boolean $$25 = cds.a($$0) != null;
            $$2.a();
            $$2.b(1.0f, -1.0f, -1.0f);
            fwu $$26 = $$25 ? fww.g : fww.h;
            ein $$27 = $$26.c().a(fpw.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0f, 1.0f, 1.0f, 1.0f);
            if ($$25) {
                List<Pair<he<cze>, cen>> $$28 = czd.a(cgw.d($$0), czd.a($$0));
                flp.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
                this.j.b().a($$2, $$27, $$4, $$5, 1.0f, 1.0f, 1.0f, 1.0f);
            }
            $$2.b();
        } else if ($$0.a(cgc.uV)) {
            $$2.a();
            $$2.b(1.0f, -1.0f, -1.0f);
            ein $$29 = fpw.c($$3, this.k.a(fdk.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0f, 1.0f, 1.0f, 1.0f);
            $$2.b();
        }
    }
}

