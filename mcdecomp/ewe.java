/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ewe {
    private static final int a = 30;
    private static final int b = 16;
    private static final int c = 4;
    private final int d;
    private List<acq> e = List.of();
    private int f;
    private int g;

    public ewe(int $$0) {
        this.d = $$0;
    }

    public void a(List<acq> $$0) {
        if (!this.e.equals($$0)) {
            this.e = $$0;
            this.g = 0;
        }
        if (!this.e.isEmpty() && ++this.f % 30 == 0) {
            this.g = (this.g + 1) % this.e.size();
        }
    }

    public void a(cbf $$0, eox $$1, float $$2, int $$3, int $$4) {
        float $$7;
        ccx $$5 = $$0.b(this.d);
        if (this.e.isEmpty() || $$5.f()) {
            return;
        }
        boolean $$6 = this.e.size() > 1 && this.f >= 30;
        float f2 = $$7 = $$6 ? this.a($$2) : 1.0f;
        if ($$7 < 1.0f) {
            int $$8 = Math.floorMod(this.g - 1, this.e.size());
            this.a($$5, this.e.get($$8), 1.0f - $$7, $$1, $$3, $$4);
        }
        this.a($$5, this.e.get(this.g), $$7, $$1, $$3, $$4);
    }

    private void a(ccx $$0, acq $$1, float $$2, eox $$3, int $$4, int $$5) {
        fuv $$6 = enn.N().a(fuu.e).apply($$1);
        $$3.a($$4 + $$0.f, $$5 + $$0.g, 0, 16, 16, $$6, 1.0f, 1.0f, 1.0f, $$2);
    }

    private float a(float $$0) {
        float $$1 = (float)(this.f % 30) + $$0;
        return Math.min($$1, 4.0f) / 4.0f;
    }
}

