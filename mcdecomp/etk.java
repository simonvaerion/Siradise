/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 */
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class etk
extends euq {
    private static final int k = 20;
    private final sw l;
    private epz m = epz.a;
    protected sw a;
    protected sw b;
    private int n;
    protected final BooleanConsumer c;
    private final List<epi> o = Lists.newArrayList();

    public etk(BooleanConsumer $$0, sw $$1, sw $$2) {
        this($$0, $$1, $$2, sv.f, sv.g);
    }

    public etk(BooleanConsumer $$0, sw $$1, sw $$2, sw $$3, sw $$4) {
        super($$1);
        this.c = $$0;
        this.l = $$2;
        this.a = $$3;
        this.b = $$4;
    }

    @Override
    public sw au_() {
        return sv.a(new sw[]{super.au_(), this.l});
    }

    @Override
    protected void b() {
        super.b();
        this.m = epz.a(this.i, (ta)this.l, this.g - 50);
        int $$0 = apa.a(this.B() + this.C() + 20, this.h / 6 + 96, this.h - 24);
        this.o.clear();
        this.a($$0);
    }

    protected void a(int $$02) {
        this.a(epi.a(this.a, (epi $$0) -> this.c.accept(true)).a(this.g / 2 - 155, $$02, 150, 20).a());
        this.a(epi.a(this.b, (epi $$0) -> this.c.accept(false)).a(this.g / 2 - 155 + 160, $$02, 150, 20).a());
    }

    protected void a(epi $$0) {
        this.o.add(this.d($$0));
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.e, this.g / 2, this.l(), 0xFFFFFF);
        this.m.a($$0, this.g / 2, this.B());
        super.a($$0, $$1, $$2, $$3);
    }

    private int l() {
        int $$0 = (this.h - this.C()) / 2;
        return apa.a($$0 - 20 - this.i.b, 10, 80);
    }

    private int B() {
        return this.l() + 20;
    }

    private int C() {
        return this.m.a() * this.i.b;
    }

    public void b(int $$0) {
        this.n = $$0;
        for (epi $$1 : this.o) {
            $$1.r = false;
        }
    }

    @Override
    public void f() {
        super.f();
        if (--this.n == 0) {
            for (epi $$0 : this.o) {
                $$0.r = true;
            }
        }
    }

    @Override
    public boolean av_() {
        return false;
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 256) {
            this.c.accept(false);
            return true;
        }
        return super.a($$0, $$1, $$2);
    }
}

