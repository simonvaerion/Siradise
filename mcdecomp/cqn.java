/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Optional;

public interface cqn<T extends Enum<T>> {
    public static final int w_ = 4;

    public Optional<dcb> i_(dcb var1);

    public float a();

    default public void a_(dcb $$0, aif $$1, gu $$2, apf $$3) {
        float $$4 = 0.05688889f;
        if ($$3.i() < 0.05688889f) {
            this.c($$0, $$1, $$2, $$3);
        }
    }

    public T b();

    default public void c(dcb $$0, aif $$1, gu $$22, apf $$3) {
        gu $$7;
        int $$8;
        int $$4 = ((Enum)this.b()).ordinal();
        int $$5 = 0;
        int $$6 = 0;
        Iterator<gu> iterator = gu.a($$22, 4, 4, 4).iterator();
        while (iterator.hasNext() && ($$8 = ($$7 = iterator.next()).k($$22)) <= 4) {
            dcb $$9;
            cpn $$10;
            if ($$7.equals($$22) || !(($$10 = ($$9 = $$1.a_($$7)).b()) instanceof cqn)) continue;
            T $$11 = ((cqn)((Object)$$10)).b();
            if (this.b().getClass() != $$11.getClass()) continue;
            int $$12 = ((Enum)$$11).ordinal();
            if ($$12 < $$4) {
                return;
            }
            if ($$12 > $$4) {
                ++$$6;
                continue;
            }
            ++$$5;
        }
        float $$13 = (float)($$6 + 1) / (float)($$6 + $$5 + 1);
        float $$14 = $$13 * $$13 * this.a();
        if ($$3.i() < $$14) {
            this.i_($$0).ifPresent($$2 -> $$1.b($$22, (dcb)$$2));
        }
    }
}

