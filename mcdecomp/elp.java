/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elp
extends gan {
    static final Logger a = LogUtils.getLogger();
    static final acq b = new acq("realms", "textures/gui/realms/link_icons.png");
    static final acq c = new acq("realms", "textures/gui/realms/trailer_icons.png");
    static final acq G = new acq("realms", "textures/gui/realms/slot_frame.png");
    static final sw H = sw.c("mco.template.info.tooltip");
    static final sw I = sw.c("mco.template.trailer.tooltip");
    private final Consumer<ekh> J;
    b K;
    int L = -1;
    private epi M;
    private epi N;
    private epi O;
    @Nullable
    sw P;
    @Nullable
    String Q;
    private final ejq.c R;
    int S;
    @Nullable
    private sw[] T;
    private String U;
    boolean V;
    private boolean W;
    @Nullable
    List<emg.a> X;

    public elp(sw $$0, Consumer<ekh> $$1, ejq.c $$2) {
        this($$0, $$1, $$2, null);
    }

    public elp(sw $$0, Consumer<ekh> $$1, ejq.c $$2, @Nullable eki $$3) {
        super($$0);
        this.J = $$1;
        this.R = $$2;
        if ($$3 == null) {
            this.K = new b();
            this.a(new eki(10));
        } else {
            this.K = new b(Lists.newArrayList($$3.a));
            this.a($$3);
        }
    }

    public void a(sw ... $$0) {
        this.T = $$0;
        this.V = true;
    }

    @Override
    public boolean a(double $$0, double $$1, int $$2) {
        if (this.W && this.U != null) {
            ac.i().a("https://www.minecraft.net/realms/adventure-maps-in-1-9");
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void b() {
        this.K = new b(this.K.e());
        this.N = this.d(epi.a(sw.c("mco.template.button.trailer"), (epi $$0) -> this.I()).a(this.g / 2 - 206, this.h - 32, 100, 20).a());
        this.M = this.d(epi.a(sw.c("mco.template.button.select"), (epi $$0) -> this.G()).a(this.g / 2 - 100, this.h - 32, 100, 20).a());
        sw $$02 = this.R == ejq.c.b ? sv.e : sv.k;
        epi $$1 = epi.a($$02, (epi $$0) -> this.aw_()).a(this.g / 2 + 6, this.h - 32, 100, 20).a();
        this.d($$1);
        this.O = this.d(epi.a(sw.c("mco.template.button.publisher"), (epi $$0) -> this.J()).a(this.g / 2 + 112, this.h - 32, 100, 20).a());
        this.M.r = false;
        this.N.s = false;
        this.O.s = false;
        this.e(this.K);
        this.b(this.K);
    }

    @Override
    public sw au_() {
        ArrayList $$0 = Lists.newArrayListWithCapacity((int)2);
        if (this.e != null) {
            $$0.add(this.e);
        }
        if (this.T != null) {
            $$0.addAll(Arrays.asList(this.T));
        }
        return sv.a($$0);
    }

    void B() {
        this.O.s = this.D();
        this.N.s = this.F();
        this.M.r = this.C();
    }

    private boolean C() {
        return this.L != -1;
    }

    private boolean D() {
        return this.L != -1 && !this.E().e.isEmpty();
    }

    private ekh E() {
        return this.K.b(this.L);
    }

    private boolean F() {
        return this.L != -1 && !this.E().g.isEmpty();
    }

    @Override
    public void f() {
        super.f();
        --this.S;
        if (this.S < 0) {
            this.S = 0;
        }
    }

    @Override
    public void aw_() {
        this.J.accept(null);
    }

    void G() {
        if (this.H()) {
            this.J.accept(this.E());
        }
    }

    private boolean H() {
        return this.L >= 0 && this.L < this.K.k();
    }

    private void I() {
        if (this.H()) {
            ekh $$0 = this.E();
            if (!"".equals($$0.g)) {
                ac.i().a($$0.g);
            }
        }
    }

    private void J() {
        if (this.H()) {
            ekh $$0 = this.E();
            if (!"".equals($$0.e)) {
                ac.i().a($$0.e);
            }
        }
    }

    private void a(final eki $$0) {
        new Thread("realms-template-fetcher"){

            @Override
            public void run() {
                eki $$02 = $$0;
                eiz $$1 = eiz.a();
                while ($$02 != null) {
                    Either<eki, String> $$2 = elp.this.a($$02, $$1);
                    $$02 = ((bcn)elp.this.f).a(() -> {
                        if ($$2.right().isPresent()) {
                            a.error("Couldn't fetch templates: {}", $$2.right().get());
                            if (elp.this.K.d()) {
                                elp.this.X = emg.a(fvz.a("mco.template.select.failure", new Object[0]), new emg.b[0]);
                            }
                            return null;
                        }
                        eki $$1 = (eki)$$2.left().get();
                        for (ekh $$2 : $$1.a) {
                            elp.this.K.a($$2);
                        }
                        if ($$1.a.isEmpty()) {
                            if (elp.this.K.d()) {
                                String $$3 = fvz.a("mco.template.select.none", "%link");
                                emg.b $$4 = emg.b.a(fvz.a("mco.template.select.none.linkTitle", new Object[0]), "https://aka.ms/MinecraftRealmsContentCreator");
                                elp.this.X = emg.a($$3, $$4);
                            }
                            return null;
                        }
                        return $$1;
                    }).join();
                }
            }
        }.start();
    }

    Either<eki, String> a(eki $$0, eiz $$1) {
        try {
            return Either.left((Object)$$1.a($$0.b + 1, $$0.c, this.R));
        }
        catch (ekm $$2) {
            return Either.right((Object)$$2.getMessage());
        }
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.P = null;
        this.Q = null;
        this.W = false;
        this.a($$0);
        this.K.a($$0, $$1, $$2, $$3);
        if (this.X != null) {
            this.a($$0, $$1, $$2, this.X);
        }
        $$0.a(this.i, this.e, this.g / 2, 13, 0xFFFFFF);
        if (this.V) {
            sw[] $$4 = this.T;
            for (int $$5 = 0; $$5 < $$4.length; ++$$5) {
                int $$6 = this.i.a($$4[$$5]);
                int $$7 = this.g / 2 - $$6 / 2;
                int $$8 = elp.h(-1 + $$5);
                if ($$1 < $$7 || $$1 > $$7 + $$6 || $$2 < $$8 || $$2 > $$8 + this.i.b) continue;
                this.W = true;
            }
            for (int $$9 = 0; $$9 < $$4.length; ++$$9) {
                sw $$10 = $$4[$$9];
                int $$11 = 0xA0A0A0;
                if (this.U != null) {
                    if (this.W) {
                        $$11 = 7107012;
                        $$10 = $$10.e().a(n.s);
                    } else {
                        $$11 = 0x3366BB;
                    }
                }
                $$0.a(this.i, $$10, this.g / 2, elp.h(-1 + $$9), $$11);
            }
        }
        super.a($$0, $$1, $$2, $$3);
        this.a($$0, this.P, $$1, $$2);
    }

    private void a(eox $$02, int $$1, int $$2, List<emg.a> $$3) {
        for (int $$4 = 0; $$4 < $$3.size(); ++$$4) {
            emg.a $$5 = $$3.get($$4);
            int $$6 = elp.h(4 + $$4);
            int $$7 = $$5.a.stream().mapToInt($$0 -> this.i.b($$0.a())).sum();
            int $$8 = this.g / 2 - $$7 / 2;
            for (emg.b $$9 : $$5.a) {
                int $$10 = $$9.b() ? 0x3366BB : 0xFFFFFF;
                int $$11 = $$02.b(this.i, $$9.a(), $$8, $$6, $$10);
                if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
                    this.P = sw.b($$9.c());
                    this.Q = $$9.c();
                }
                $$8 = $$11;
            }
        }
    }

    protected void a(eox $$0, @Nullable sw $$1, int $$2, int $$3) {
        if ($$1 == null) {
            return;
        }
        int $$4 = $$2 + 12;
        int $$5 = $$3 - 12;
        int $$6 = this.i.a($$1);
        $$0.b($$4 - 3, $$5 - 3, $$4 + $$6 + 3, $$5 + 8 + 3, -1073741824, -1073741824);
        $$0.b(this.i, $$1, $$4, $$5, 0xFFFFFF);
    }

    class b
    extends gam<a> {
        public b() {
            this(Collections.emptyList());
        }

        public b(Iterable<ekh> $$0) {
            super(elp.this.g, elp.this.h, elp.this.V ? elp.h(1) : 32, elp.this.h - 40, 46);
            $$0.forEach(this::a);
        }

        @Override
        public void a(ekh $$0) {
            this.a(new a($$0));
        }

        @Override
        public boolean a(double $$0, double $$1, int $$2) {
            if ($$2 == 0 && $$1 >= (double)this.f && $$1 <= (double)this.g) {
                int $$3 = this.d / 2 - 150;
                if (elp.this.Q != null) {
                    ac.i().a(elp.this.Q);
                }
                int $$4 = (int)Math.floor($$1 - (double)this.f) - this.k + (int)this.l() - 4;
                int $$5 = $$4 / this.c;
                if ($$0 >= (double)$$3 && $$0 < (double)this.c() && $$5 >= 0 && $$4 >= 0 && $$5 < this.k()) {
                    this.a($$5);
                    this.a($$4, $$5, $$0, $$1, this.d, $$2);
                    if ($$5 >= elp.this.K.k()) {
                        return super.a($$0, $$1, $$2);
                    }
                    elp.this.S += 7;
                    if (elp.this.S >= 10) {
                        elp.this.G();
                    }
                    return true;
                }
            }
            return super.a($$0, $$1, $$2);
        }

        @Override
        public void a(@Nullable a $$0) {
            super.a($$0);
            elp.this.L = this.i().indexOf($$0);
            elp.this.B();
        }

        @Override
        public int a() {
            return this.k() * 46;
        }

        @Override
        public int b() {
            return 300;
        }

        @Override
        public void a(eox $$0) {
            elp.this.a($$0);
        }

        public boolean d() {
            return this.k() == 0;
        }

        public ekh b(int $$0) {
            return ((a)this.i().get((int)$$0)).b;
        }

        public List<ekh> e() {
            return this.i().stream().map($$0 -> $$0.b).collect(Collectors.toList());
        }
    }

    class a
    extends eqc.a<a> {
        final ekh b;

        public a(ekh $$0) {
            this.b = $$0;
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, this.b, $$3, $$2, $$6, $$7);
        }

        private void a(eox $$0, ekh $$1, int $$2, int $$3, int $$4, int $$5) {
            int $$6 = $$2 + 45 + 20;
            $$0.a(elp.this.i, $$1.b, $$6, $$3 + 2, 0xFFFFFF, false);
            $$0.a(elp.this.i, $$1.d, $$6, $$3 + 15, 0x6C6C6C, false);
            $$0.a(elp.this.i, $$1.c, $$6 + 227 - elp.this.i.b($$1.c), $$3 + 1, 0x6C6C6C, false);
            if (!("".equals($$1.e) && "".equals($$1.g) && "".equals($$1.h))) {
                this.a($$0, $$6 - 1, $$3 + 25, $$4, $$5, $$1.e, $$1.g, $$1.h);
            }
            this.a($$0, $$2, $$3 + 1, $$4, $$5, $$1);
        }

        private void a(eox $$0, int $$1, int $$2, int $$3, int $$4, ekh $$5) {
            $$0.a(eme.a($$5.a, $$5.f), $$1 + 1, $$2 + 1, 0.0f, 0.0f, 38, 38, 38, 38);
            $$0.a(G, $$1, $$2, 0.0f, 0.0f, 40, 40, 40, 40);
        }

        private void a(eox $$0, int $$1, int $$2, int $$3, int $$4, String $$5, String $$6, String $$7) {
            if (!"".equals($$7)) {
                $$0.a(elp.this.i, $$7, $$1, $$2 + 4, 0x4C4C4C, false);
            }
            int $$8 = "".equals($$7) ? 0 : elp.this.i.b($$7) + 2;
            boolean $$9 = false;
            boolean $$10 = false;
            boolean $$11 = "".equals($$5);
            if ($$3 >= $$1 + $$8 && $$3 <= $$1 + $$8 + 32 && $$4 >= $$2 && $$4 <= $$2 + 15 && $$4 < elp.this.h - 15 && $$4 > 32) {
                if ($$3 <= $$1 + 15 + $$8 && $$3 > $$8) {
                    if ($$11) {
                        $$10 = true;
                    } else {
                        $$9 = true;
                    }
                } else if (!$$11) {
                    $$10 = true;
                }
            }
            if (!$$11) {
                float $$12 = $$9 ? 15.0f : 0.0f;
                $$0.a(b, $$1 + $$8, $$2, $$12, 0.0f, 15, 15, 30, 15);
            }
            if (!"".equals($$6)) {
                int $$13 = $$1 + $$8 + ($$11 ? 0 : 17);
                float $$14 = $$10 ? 15.0f : 0.0f;
                $$0.a(c, $$13, $$2, $$14, 0.0f, 15, 15, 30, 15);
            }
            if ($$9) {
                elp.this.P = H;
                elp.this.Q = $$5;
            } else if ($$10 && !"".equals($$6)) {
                elp.this.P = I;
                elp.this.Q = $$6;
            }
        }

        @Override
        public sw a() {
            sw $$0 = sv.b(sw.b(this.b.b), sw.a("mco.template.select.narrate.authors", new Object[]{this.b.d}), sw.b(this.b.h), sw.a("mco.template.select.narrate.version", new Object[]{this.b.c}));
            return sw.a("narrator.select", $$0);
        }
    }
}

