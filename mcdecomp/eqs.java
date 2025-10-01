/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  javax.annotation.Nullable
 *  org.joml.Vector2i
 */
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Vector2i;

public interface eqs
extends eqt {
    public List<? extends eqt> i();

    default public Optional<eqt> d(double $$0, double $$1) {
        for (eqt eqt2 : this.i()) {
            if (!eqt2.a_($$0, $$1)) continue;
            return Optional.of(eqt2);
        }
        return Optional.empty();
    }

    @Override
    default public boolean a(double $$0, double $$1, int $$2) {
        for (eqt eqt2 : this.i()) {
            if (!eqt2.a($$0, $$1, $$2)) continue;
            this.a(eqt2);
            if ($$2 == 0) {
                this.c_(true);
            }
            return true;
        }
        return false;
    }

    @Override
    default public boolean b(double $$0, double $$1, int $$2) {
        this.c_(false);
        return this.d($$0, $$1).filter($$3 -> $$3.b($$0, $$1, $$2)).isPresent();
    }

    @Override
    default public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
        if (this.t() != null && this.aA_() && $$2 == 0) {
            return this.t().a($$0, $$1, $$2, $$3, $$4);
        }
        return false;
    }

    public boolean aA_();

    public void c_(boolean var1);

    @Override
    default public boolean a(double $$0, double $$1, double $$2) {
        return this.d($$0, $$1).filter($$3 -> $$3.a($$0, $$1, $$2)).isPresent();
    }

    @Override
    default public boolean a(int $$0, int $$1, int $$2) {
        return this.t() != null && this.t().a($$0, $$1, $$2);
    }

    @Override
    default public boolean b(int $$0, int $$1, int $$2) {
        return this.t() != null && this.t().b($$0, $$1, $$2);
    }

    @Override
    default public boolean a(char $$0, int $$1) {
        return this.t() != null && this.t().a($$0, $$1);
    }

    @Nullable
    public eqt t();

    public void a(@Nullable eqt var1);

    @Override
    default public void b_(boolean $$0) {
    }

    @Override
    default public boolean aB_() {
        return this.t() != null;
    }

    @Override
    @Nullable
    default public eou aF_() {
        eqt $$0 = this.t();
        if ($$0 != null) {
            return eou.a(this, $$0.aF_());
        }
        return null;
    }

    default public void b(@Nullable eqt $$0) {
        this.a($$0);
    }

    @Override
    @Nullable
    default public eou a(esv $$0) {
        eou $$2;
        eqt $$1 = this.t();
        if ($$1 != null && ($$2 = $$1.a($$0)) != null) {
            return eou.a(this, $$2);
        }
        if ($$0 instanceof esv.c) {
            esv.c $$3 = (esv.c)$$0;
            return this.a($$3);
        }
        if ($$0 instanceof esv.a) {
            esv.a $$4 = (esv.a)$$0;
            return this.a($$4);
        }
        return null;
    }

    @Nullable
    private eou a(esv.c $$02) {
        Supplier<eqt> $$10;
        BooleanSupplier $$9;
        int $$7;
        boolean $$1 = $$02.b();
        eqt $$2 = this.t();
        ArrayList<? extends eqt> $$3 = new ArrayList<eqt>(this.i());
        Collections.sort($$3, Comparator.comparingInt($$0 -> $$0.aC_()));
        int $$4 = $$3.indexOf($$2);
        if ($$2 != null && $$4 >= 0) {
            int $$5 = $$4 + ($$1 ? 1 : 0);
        } else if ($$1) {
            boolean $$6 = false;
        } else {
            $$7 = $$3.size();
        }
        ListIterator $$8 = $$3.listIterator($$7);
        BooleanSupplier booleanSupplier = $$1 ? $$8::hasNext : ($$9 = $$8::hasPrevious);
        Supplier<eqt> supplier = $$1 ? $$8::next : ($$10 = $$8::previous);
        while ($$9.getAsBoolean()) {
            eqt $$11 = $$10.get();
            eou $$12 = $$11.a($$02);
            if ($$12 == null) continue;
            return eou.a(this, $$12);
        }
        return null;
    }

    @Nullable
    private eou a(esv.a $$0) {
        eqt $$1 = this.t();
        if ($$1 == null) {
            esx $$2 = $$0.b();
            esz $$3 = this.s().c($$2.b());
            return eou.a(this, this.a($$3, $$2, null, $$0));
        }
        esz $$4 = $$1.s();
        return eou.a(this, this.a($$4, $$0.b(), $$1, $$0));
    }

    @Nullable
    private eou a(esz $$0, esx $$12, @Nullable eqt $$2, esv $$3) {
        esw $$4 = $$12.a();
        esw $$5 = $$4.a();
        esx $$6 = $$5.b();
        int $$7 = $$0.b($$12.b());
        ArrayList<eqt> $$8 = new ArrayList<eqt>();
        for (eqt eqt2 : this.i()) {
            esz $$10;
            if (eqt2 == $$2 || !($$10 = eqt2.s()).a($$0, $$5)) continue;
            int $$11 = $$10.b($$12.b());
            if ($$12.a($$11, $$7)) {
                $$8.add(eqt2);
                continue;
            }
            if ($$11 != $$7 || !$$12.a($$10.b($$12), $$0.b($$12))) continue;
            $$8.add(eqt2);
        }
        Comparator<eqt> $$122 = Comparator.comparing($$1 -> $$1.s().b($$12.b()), $$12.d());
        Comparator<eqt> comparator = Comparator.comparing($$1 -> $$1.s().b($$6.b()), $$6.d());
        $$8.sort($$122.thenComparing(comparator));
        for (eqt $$14 : $$8) {
            eou $$15 = $$14.a($$3);
            if ($$15 == null) continue;
            return $$15;
        }
        return this.b($$0, $$12, $$2, $$3);
    }

    @Nullable
    private eou b(esz $$0, esx $$1, @Nullable eqt $$2, esv $$3) {
        esw $$4 = $$1.a();
        esw $$5 = $$4.a();
        ArrayList<Pair> $$6 = new ArrayList<Pair>();
        esy $$7 = esy.a($$4, $$0.b($$1), $$0.b($$5));
        for (eqt eqt2 : this.i()) {
            esz $$9;
            esy $$10;
            if (eqt2 == $$2 || !$$1.a(($$10 = esy.a($$4, ($$9 = eqt2.s()).b($$1.b()), $$9.b($$5))).a($$4), $$7.a($$4))) continue;
            long $$11 = Vector2i.distanceSquared((int)$$7.a(), (int)$$7.b(), (int)$$10.a(), (int)$$10.b());
            $$6.add(Pair.of((Object)eqt2, (Object)$$11));
        }
        $$6.sort(Comparator.comparingDouble(Pair::getSecond));
        for (Pair pair : $$6) {
            eou $$13 = ((eqt)pair.getFirst()).a($$3);
            if ($$13 == null) continue;
            return $$13;
        }
        return null;
    }
}

