/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class adg
extends efg {
    private final MinecraftServer g;
    private final Set<efd> h = Sets.newHashSet();
    private final List<Runnable> i = Lists.newArrayList();

    public adg(MinecraftServer $$0) {
        this.g = $$0;
    }

    @Override
    public void a(eff $$0) {
        super.a($$0);
        if (this.h.contains($$0.d())) {
            this.g.ac().a(new yf(adg$a.a, $$0.d().b(), $$0.e(), $$0.b()));
        }
        this.a();
    }

    @Override
    public void a(String $$0) {
        super.a($$0);
        this.g.ac().a(new yf(adg$a.b, null, $$0, 0));
        this.a();
    }

    @Override
    public void a(String $$0, efd $$1) {
        super.a($$0, $$1);
        if (this.h.contains($$1)) {
            this.g.ac().a(new yf(adg$a.b, $$1.b(), $$0, 0));
        }
        this.a();
    }

    @Override
    public void a(int $$0, @Nullable efd $$1) {
        efd $$2 = this.a($$0);
        super.a($$0, $$1);
        if ($$2 != $$1 && $$2 != null) {
            if (this.h($$2) > 0) {
                this.g.ac().a(new xv($$0, $$1));
            } else {
                this.g($$2);
            }
        }
        if ($$1 != null) {
            if (this.h.contains($$1)) {
                this.g.ac().a(new xv($$0, $$1));
            } else {
                this.e($$1);
            }
        }
        this.a();
    }

    @Override
    public boolean a(String $$0, efe $$1) {
        if (super.a($$0, $$1)) {
            this.g.ac().a(ye.a($$1, $$0, ye.a.a));
            this.a();
            return true;
        }
        return false;
    }

    @Override
    public void b(String $$0, efe $$1) {
        super.b($$0, $$1);
        this.g.ac().a(ye.a($$1, $$0, ye.a.b));
        this.a();
    }

    @Override
    public void a(efd $$0) {
        super.a($$0);
        this.a();
    }

    @Override
    public void b(efd $$0) {
        super.b($$0);
        if (this.h.contains($$0)) {
            this.g.ac().a(new yc($$0, 2));
        }
        this.a();
    }

    @Override
    public void c(efd $$0) {
        super.c($$0);
        if (this.h.contains($$0)) {
            this.g($$0);
        }
        this.a();
    }

    @Override
    public void a(efe $$0) {
        super.a($$0);
        this.g.ac().a(ye.a($$0, true));
        this.a();
    }

    @Override
    public void b(efe $$0) {
        super.b($$0);
        this.g.ac().a(ye.a($$0, false));
        this.a();
    }

    @Override
    public void c(efe $$0) {
        super.c($$0);
        this.g.ac().a(ye.a($$0));
        this.a();
    }

    public void a(Runnable $$0) {
        this.i.add($$0);
    }

    protected void a() {
        for (Runnable $$0 : this.i) {
            $$0.run();
        }
    }

    public List<uo<?>> d(efd $$0) {
        ArrayList $$1 = Lists.newArrayList();
        $$1.add(new yc($$0, 0));
        for (int $$2 = 0; $$2 < 19; ++$$2) {
            if (this.a($$2) != $$0) continue;
            $$1.add(new xv($$2, $$0));
        }
        for (eff $$3 : this.i($$0)) {
            $$1.add(new yf(adg$a.a, $$3.d().b(), $$3.e(), $$3.b()));
        }
        return $$1;
    }

    public void e(efd $$0) {
        List<uo<?>> $$1 = this.d($$0);
        for (aig $$2 : this.g.ac().t()) {
            for (uo<?> $$3 : $$1) {
                $$2.c.a($$3);
            }
        }
        this.h.add($$0);
    }

    public List<uo<?>> f(efd $$0) {
        ArrayList $$1 = Lists.newArrayList();
        $$1.add(new yc($$0, 1));
        for (int $$2 = 0; $$2 < 19; ++$$2) {
            if (this.a($$2) != $$0) continue;
            $$1.add(new xv($$2, $$0));
        }
        return $$1;
    }

    public void g(efd $$0) {
        List<uo<?>> $$1 = this.f($$0);
        for (aig $$2 : this.g.ac().t()) {
            for (uo<?> $$3 : $$1) {
                $$2.c.a($$3);
            }
        }
        this.h.remove($$0);
    }

    public int h(efd $$0) {
        int $$1 = 0;
        for (int $$2 = 0; $$2 < 19; ++$$2) {
            if (this.a($$2) != $$0) continue;
            ++$$1;
        }
        return $$1;
    }

    public efh b() {
        efh $$0 = new efh(this);
        this.a($$0::b);
        return $$0;
    }

    public efh a(qr $$0) {
        return this.b().b($$0);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = adg$a.a();
        }
    }
}

