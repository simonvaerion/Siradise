/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 */
import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class bmr
extends bmv {
    private static final int a = 200;
    private final brk b;
    private int c;
    private int d;

    public bmr(brk $$0) {
        this.b = $$0;
        this.d = this.a($$0);
    }

    protected int a(brk $$0) {
        return bmr.b(200 + $$0.ec().a(200) % 20);
    }

    @Override
    public boolean a() {
        if (this.b.ge()) {
            return false;
        }
        if (this.b.gb()) {
            return true;
        }
        if (this.d > 0) {
            --this.d;
            return false;
        }
        this.d = this.a(this.b);
        Predicate<brk> $$02 = $$0 -> $$0.gd() || !$$0.gb();
        List<brk> $$1 = this.b.dI().a(this.b.getClass(), this.b.cE().c(8.0, 8.0, 8.0), $$02);
        brk $$2 = (brk)DataFixUtils.orElse($$1.stream().filter(brk::gd).findAny(), (Object)this.b);
        $$2.a($$1.stream().filter($$0 -> !$$0.gb()));
        return this.b.gb();
    }

    @Override
    public boolean b() {
        return this.b.gb() && this.b.gf();
    }

    @Override
    public void c() {
        this.c = 0;
    }

    @Override
    public void d() {
        this.b.gc();
    }

    @Override
    public void e() {
        if (--this.c > 0) {
            return;
        }
        this.c = this.a(10);
        this.b.gg();
    }
}

