/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class erd
implements erg {
    public static final int a = 5000;
    private final ae e;
    private boolean f;

    public erd(ae $$0) {
        this.e = $$0;
    }

    @Override
    public erg.a a(eox $$0, erh $$1, long $$2) {
        an $$3 = this.e.d();
        $$0.a(b, 0, 0, 0, 0, this.a(), this.b());
        if ($$3 != null) {
            int $$5;
            List<aom> $$4 = $$1.b().h.c($$3.a(), 125);
            int n2 = $$5 = $$3.e() == ao.b ? 0xFF88FF : 0xFFFF00;
            if ($$4.size() == 1) {
                $$0.a($$1.b().h, $$3.e().d(), 30, 7, $$5 | 0xFF000000, false);
                $$0.a($$1.b().h, $$4.get(0), 30, 18, -1, false);
            } else {
                int $$6 = 1500;
                float $$7 = 300.0f;
                if ($$2 < 1500L) {
                    int $$8 = apa.d(apa.a((float)(1500L - $$2) / 300.0f, 0.0f, 1.0f) * 255.0f) << 24 | 0x4000000;
                    $$0.a($$1.b().h, $$3.e().d(), 30, 11, $$5 | $$8, false);
                } else {
                    int $$9 = apa.d(apa.a((float)($$2 - 1500L) / 300.0f, 0.0f, 1.0f) * 252.0f) << 24 | 0x4000000;
                    int $$10 = this.b() / 2 - $$4.size() * $$1.b().h.b / 2;
                    for (aom $$11 : $$4) {
                        $$0.a($$1.b().h, $$11, 30, $$10, 0xFFFFFF | $$9, false);
                        $$10 += $$1.b().h.b;
                    }
                }
            }
            if (!this.f && $$2 > 0L) {
                this.f = true;
                if ($$3.e() == ao.b) {
                    $$1.b().ah().a(fxt.a(amh.yu, 1.0f, 1.0f));
                }
            }
            $$0.b($$3.c(), 8, 8);
            return (double)$$2 >= 5000.0 * $$1.c() ? erg.a.b : erg.a.a;
        }
        return erg.a.b;
    }
}

