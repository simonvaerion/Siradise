/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class aln {
    private int a;
    private int b;

    public boolean a(int $$0) {
        return this.b >= this.b($$0);
    }

    public boolean a(int $$0, List<aig> $$1) {
        int $$2 = (int)$$1.stream().filter(byo::fQ).count();
        return $$2 >= this.b($$0);
    }

    public int b(int $$0) {
        return Math.max(1, apa.f((float)(this.a * $$0) / 100.0f));
    }

    public void a() {
        this.b = 0;
    }

    public int b() {
        return this.b;
    }

    public boolean a(List<aig> $$0) {
        int $$1 = this.a;
        int $$2 = this.b;
        this.a = 0;
        this.b = 0;
        for (aig $$3 : $$0) {
            if ($$3.G_()) continue;
            ++this.a;
            if (!$$3.fy()) continue;
            ++this.b;
        }
        return !($$2 <= 0 && this.b <= 0 || $$1 == this.a && $$2 == this.b);
    }
}

