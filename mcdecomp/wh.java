/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import java.util.BitSet;
import java.util.List;
import javax.annotation.Nullable;

public class wh {
    private final BitSet a;
    private final BitSet b;
    private final BitSet c;
    private final BitSet d;
    private final List<byte[]> e;
    private final List<byte[]> f;

    public wh(clt $$0, dwt $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
        this.a = new BitSet();
        this.b = new BitSet();
        this.c = new BitSet();
        this.d = new BitSet();
        this.e = Lists.newArrayList();
        this.f = Lists.newArrayList();
        for (int $$4 = 0; $$4 < $$1.c(); ++$$4) {
            if ($$2 == null || $$2.get($$4)) {
                this.a($$0, $$1, cmv.a, $$4, this.a, this.c, this.e);
            }
            if ($$3 != null && !$$3.get($$4)) continue;
            this.a($$0, $$1, cmv.b, $$4, this.b, this.d, this.f);
        }
    }

    public wh(sf $$02, int $$1, int $$2) {
        this.a = $$02.y();
        this.b = $$02.y();
        this.c = $$02.y();
        this.d = $$02.y();
        this.e = $$02.a($$0 -> $$0.b(2048));
        this.f = $$02.a($$0 -> $$0.b(2048));
    }

    public void a(sf $$0) {
        $$0.a(this.a);
        $$0.a(this.b);
        $$0.a(this.c);
        $$0.a(this.d);
        $$0.a(this.e, sf::a);
        $$0.a(this.f, sf::a);
    }

    private void a(clt $$0, dwt $$1, cmv $$2, int $$3, BitSet $$4, BitSet $$5, List<byte[]> $$6) {
        ded $$7 = $$1.a($$2).a(hx.a($$0, $$1.d() + $$3));
        if ($$7 != null) {
            if ($$7.d()) {
                $$5.set($$3);
            } else {
                $$4.set($$3);
                $$6.add($$7.b().a());
            }
        }
    }

    public BitSet a() {
        return this.a;
    }

    public BitSet b() {
        return this.c;
    }

    public List<byte[]> c() {
        return this.e;
    }

    public BitSet d() {
        return this.b;
    }

    public BitSet e() {
        return this.d;
    }

    public List<byte[]> f() {
        return this.f;
    }
}

