/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eya {
    @Nullable
    private cjc<?> a;
    private final List<a> b = Lists.newArrayList();
    float c;

    public void a() {
        this.a = null;
        this.b.clear();
        this.c = 0.0f;
    }

    public void a(ciz $$0, int $$1, int $$2) {
        this.b.add(new a($$0, $$1, $$2));
    }

    public a a(int $$0) {
        return this.b.get($$0);
    }

    public int b() {
        return this.b.size();
    }

    @Nullable
    public cjc<?> c() {
        return this.a;
    }

    public void a(cjc<?> $$0) {
        this.a = $$0;
    }

    public void a(eox $$0, enn $$1, int $$2, int $$3, boolean $$4, float $$5) {
        if (!euq.p()) {
            this.c += $$5;
        }
        for (int $$6 = 0; $$6 < this.b.size(); ++$$6) {
            a $$7 = this.b.get($$6);
            int $$8 = $$7.a() + $$2;
            int $$9 = $$7.b() + $$3;
            if ($$6 == 0 && $$4) {
                $$0.a($$8 - 4, $$9 - 4, $$8 + 20, $$9 + 20, 0x30FF0000);
            } else {
                $$0.a($$8, $$9, $$8 + 16, $$9 + 16, 0x30FF0000);
            }
            cfz $$10 = $$7.c();
            $$0.b($$10, $$8, $$9);
            $$0.a(fkf.F(), $$8, $$9, $$8 + 16, $$9 + 16, 0x30FFFFFF);
            if ($$6 != 0) continue;
            $$0.a($$1.h, $$10, $$8, $$9);
        }
    }

    public class a {
        private final ciz b;
        private final int c;
        private final int d;

        public a(ciz $$1, int $$2, int $$3) {
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public int a() {
            return this.c;
        }

        public int b() {
            return this.d;
        }

        public cfz c() {
            cfz[] $$0 = this.b.a();
            if ($$0.length == 0) {
                return cfz.b;
            }
            return $$0[apa.d(eya.this.c / 30.0f) % $$0.length];
        }
    }
}

