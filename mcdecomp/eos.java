/*
 * Decompiled with CFR 0.152.
 */
public class eos {
    private static final int a = -1;
    private final hk<eor> b = new hk(32);

    public static eos a(eoo $$02) {
        eos $$12 = new eos();
        $$12.a((cfz $$0, int $$1) -> $$1 > 0 ? -1 : ((cer)((Object)$$0.d())).e_($$0), cgc.oK, cgc.oL, cgc.oM, cgc.oN, cgc.tP);
        $$12.a((cfz $$0, int $$1) -> cmk.a(0.5, 1.0), cpo.iH, cpo.iI);
        $$12.a((cfz $$0, int $$1) -> {
            int[] $$3;
            if ($$1 != 1) {
                return -1;
            }
            qr $$2 = $$0.b("Explosion");
            int[] nArray = $$3 = $$2 != null && $$2.b("Colors", 11) ? $$2.n("Colors") : null;
            if ($$3 == null || $$3.length == 0) {
                return 0x8A8A8A;
            }
            if ($$3.length == 1) {
                return $$3[0];
            }
            int $$4 = 0;
            int $$5 = 0;
            int $$6 = 0;
            for (int $$7 : $$3) {
                $$4 += ($$7 & 0xFF0000) >> 16;
                $$5 += ($$7 & 0xFF00) >> 8;
                $$6 += ($$7 & 0xFF) >> 0;
            }
            return ($$4 /= $$3.length) << 16 | ($$5 /= $$3.length) << 8 | ($$6 /= $$3.length);
        }, cgc.tB);
        $$12.a((cfz $$0, int $$1) -> $$1 > 0 ? -1 : chy.c($$0), cgc.rv, cgc.uu, cgc.ux);
        for (che $$22 : che.h()) {
            $$12.a((cfz $$1, int $$2) -> $$22.a($$2), $$22);
        }
        $$12.a((cfz $$1, int $$2) -> {
            dcb $$3 = ((cds)$$1.d()).e().n();
            return $$02.a($$3, null, null, $$2);
        }, cpo.i, cpo.bt, cpo.bu, cpo.ff, cpo.aE, cpo.aF, cpo.aG, cpo.aH, cpo.aI, cpo.aK, cpo.fm);
        $$12.a((cfz $$0, int $$1) -> cmg.d(), cpo.aL);
        $$12.a((cfz $$0, int $$1) -> $$1 == 0 ? chy.c($$0) : -1, cgc.uw);
        $$12.a((cfz $$0, int $$1) -> $$1 == 0 ? -1 : cgg.k($$0), cgc.rf);
        return $$12;
    }

    public int a(cfz $$0, int $$1) {
        eor $$2 = this.b.a(jb.i.a($$0.d()));
        return $$2 == null ? -1 : $$2.getColor($$0, $$1);
    }

    public void a(eor $$0, cml ... $$1) {
        for (cml $$2 : $$1) {
            this.b.a($$0, cfu.a($$2.k()));
        }
    }
}

