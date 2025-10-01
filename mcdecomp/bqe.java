/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 */
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public class bqe {
    private final bgb a;
    private final IntSet b = new IntOpenHashSet();
    private final IntSet c = new IntOpenHashSet();

    public bqe(bgb $$0) {
        this.a = $$0;
    }

    public void a() {
        this.b.clear();
        this.c.clear();
    }

    public boolean a(bfj $$0) {
        int $$1 = $$0.af();
        if (this.b.contains($$1)) {
            return true;
        }
        if (this.c.contains($$1)) {
            return false;
        }
        this.a.dI().ad().a("hasLineOfSight");
        boolean $$2 = this.a.B($$0);
        this.a.dI().ad().c();
        if ($$2) {
            this.b.add($$1);
        } else {
            this.c.add($$1);
        }
        return $$2;
    }
}

