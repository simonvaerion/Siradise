/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntListIterator
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class acg<C extends bdq>
implements acf<Integer> {
    private static final Logger d = LogUtils.getLogger();
    protected final bys a = new bys();
    protected byn b;
    protected ccp<C> c;

    public acg(ccp<C> $$0) {
        this.c = $$0;
    }

    public void a(aig $$0, @Nullable cjc<C> $$1, boolean $$2) {
        if ($$1 == null || !$$0.E().b($$1)) {
            return;
        }
        this.b = $$0.fN();
        if (!this.b() && !$$0.f()) {
            return;
        }
        this.a.a();
        $$0.fN().a(this.a);
        this.c.a(this.a);
        if (this.a.a($$1, null)) {
            this.a($$1, $$2);
        } else {
            this.a();
            $$0.c.a(new wr($$0.bR.j, $$1));
        }
        $$0.fN().e();
    }

    protected void a() {
        for (int $$0 = 0; $$0 < this.c.p(); ++$$0) {
            if (!this.c.e($$0)) continue;
            cfz $$1 = this.c.b($$0).e().p();
            this.b.a($$1, false);
            this.c.b($$0).e($$1);
        }
        this.c.l();
    }

    protected void a(cjc<C> $$0, boolean $$1) {
        int $$6;
        IntArrayList $$7;
        boolean $$2 = this.c.a($$0);
        int $$3 = this.a.b($$0, null);
        if ($$2) {
            for (int $$4 = 0; $$4 < this.c.o() * this.c.n() + 1; ++$$4) {
                cfz $$5;
                if ($$4 == this.c.m() || ($$5 = this.c.b($$4).e()).b() || Math.min($$3, $$5.g()) >= $$5.L() + 1) continue;
                return;
            }
        }
        if (this.a.a($$0, (IntList)($$7 = new IntArrayList()), $$6 = this.a($$1, $$3, $$2))) {
            int $$8 = $$6;
            IntListIterator intListIterator = $$7.iterator();
            while (intListIterator.hasNext()) {
                int $$9 = (Integer)intListIterator.next();
                int $$10 = bys.a($$9).g();
                if ($$10 >= $$8) continue;
                $$8 = $$10;
            }
            $$6 = $$8;
            if (this.a.a($$0, (IntList)$$7, $$6)) {
                this.a();
                this.a(this.c.n(), this.c.o(), this.c.m(), $$0, $$7.iterator(), $$6);
            }
        }
    }

    @Override
    public void a(Iterator<Integer> $$0, int $$1, int $$2, int $$3, int $$4) {
        ccx $$5 = this.c.b($$1);
        cfz $$6 = bys.a($$0.next());
        if (!$$6.b()) {
            for (int $$7 = 0; $$7 < $$2; ++$$7) {
                this.a($$5, $$6);
            }
        }
    }

    protected int a(boolean $$0, int $$1, boolean $$2) {
        int $$3 = 1;
        if ($$0) {
            $$3 = $$1;
        } else if ($$2) {
            $$3 = 64;
            for (int $$4 = 0; $$4 < this.c.n() * this.c.o() + 1; ++$$4) {
                cfz $$5;
                if ($$4 == this.c.m() || ($$5 = this.c.b($$4).e()).b() || $$3 <= $$5.L()) continue;
                $$3 = $$5.L();
            }
            if ($$3 < 64) {
                ++$$3;
            }
        }
        return $$3;
    }

    protected void a(ccx $$0, cfz $$1) {
        int $$2 = this.b.c($$1);
        if ($$2 == -1) {
            return;
        }
        cfz $$3 = this.b.a($$2);
        if ($$3.b()) {
            return;
        }
        if ($$3.L() > 1) {
            this.b.a($$2, 1);
        } else {
            this.b.b($$2);
        }
        if ($$0.e().b()) {
            $$0.e($$3.c(1));
        } else {
            $$0.e().g(1);
        }
    }

    private boolean b() {
        ArrayList $$0 = Lists.newArrayList();
        int $$1 = this.c();
        for (int $$2 = 0; $$2 < this.c.n() * this.c.o() + 1; ++$$2) {
            cfz $$3;
            if ($$2 == this.c.m() || ($$3 = this.c.b($$2).e().p()).b()) continue;
            int $$4 = this.b.d($$3);
            if ($$4 == -1 && $$0.size() <= $$1) {
                for (cfz $$5 : $$0) {
                    if (!cfz.b($$5, $$3) || $$5.L() == $$5.g() || $$5.L() + $$3.L() > $$5.g()) continue;
                    $$5.g($$3.L());
                    $$3.f(0);
                    break;
                }
                if ($$3.b()) continue;
                if ($$0.size() < $$1) {
                    $$0.add($$3);
                    continue;
                }
                return false;
            }
            if ($$4 != -1) continue;
            return false;
        }
        return true;
    }

    private int c() {
        int $$0 = 0;
        for (cfz $$1 : this.b.i) {
            if (!$$1.b()) continue;
            ++$$0;
        }
        return $$0;
    }
}

