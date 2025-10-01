/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eun
extends euq {
    static final Logger b = LogUtils.getLogger();
    private static final int c = 128;
    private static final int k = 18;
    private static final int l = 20;
    private static final int m = 1;
    private static final int n = 1;
    private static final int o = 2;
    private static final int p = 2;
    private static final acp<cnk> q = cnr.b;
    public static final sw a = sw.c("flat_world_preset.unknown");
    private final etn r;
    private sw s;
    private sw t;
    private a u;
    private epi v;
    epr w;
    dqd x;

    public eun(etn $$0) {
        super(sw.c("createWorld.customize.presets.title"));
        this.r = $$0;
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    private static dqa a(hf<cpn> $$0, String $$1, int $$2) {
        void $$13;
        int $$8;
        String $$7;
        List $$3 = Splitter.on((char)'*').limit(2).splitToList((CharSequence)$$1);
        if ($$3.size() == 2) {
            String $$4 = (String)$$3.get(1);
            try {
                int $$5 = Math.max(Integer.parseInt((String)$$3.get(0)), 0);
            }
            catch (NumberFormatException $$6) {
                b.error("Error while parsing flat world string", (Throwable)$$6);
                return null;
            }
        } else {
            $$7 = (String)$$3.get(0);
            $$8 = 1;
        }
        int $$9 = Math.min($$2 + $$8, dfk.c);
        int $$10 = $$9 - $$2;
        try {
            Optional<he.c<cpn>> $$11 = $$0.a(acp.a(jc.e, new acq($$7)));
        }
        catch (Exception $$12) {
            b.error("Error while parsing flat world string", (Throwable)$$12);
            return null;
        }
        if ($$13.isEmpty()) {
            b.error("Error while parsing flat world string => Unknown block, {}", (Object)$$7);
            return null;
        }
        return new dqa($$10, (cpn)((he.c)$$13.get()).a());
    }

    private static List<dqa> a(hf<cpn> $$0, String $$1) {
        ArrayList $$2 = Lists.newArrayList();
        String[] $$3 = $$1.split(",");
        int $$4 = 0;
        for (String $$5 : $$3) {
            dqa $$6 = eun.a($$0, $$5, $$4);
            if ($$6 == null) {
                return Collections.emptyList();
            }
            $$2.add($$6);
            $$4 += $$6.a();
        }
        return $$2;
    }

    public static dqd a(hf<cpn> $$02, hf<cnk> $$1, hf<dsg> $$2, hf<dre> $$3, String $$4, dqd $$5) {
        he.c<cnk> $$8;
        Iterator $$6 = Splitter.on((char)';').split((CharSequence)$$4).iterator();
        if (!$$6.hasNext()) {
            return dqd.a($$1, $$2, $$3);
        }
        List<dqa> $$7 = eun.a($$02, (String)$$6.next());
        if ($$7.isEmpty()) {
            return dqd.a($$1, $$2, $$3);
        }
        he<cnk> $$9 = $$8 = $$1.b(q);
        if ($$6.hasNext()) {
            String $$10 = (String)$$6.next();
            $$9 = Optional.ofNullable(acq.a($$10)).map($$0 -> acp.a(jc.ap, $$0)).flatMap($$1::a).orElseGet(() -> {
                b.warn("Invalid biome: {}", (Object)$$10);
                return $$8;
            });
        }
        return $$5.a($$7, $$5.c(), $$9);
    }

    static String a(dqd $$0) {
        StringBuilder $$1 = new StringBuilder();
        for (int $$2 = 0; $$2 < $$0.e().size(); ++$$2) {
            if ($$2 > 0) {
                $$1.append(",");
            }
            $$1.append($$0.e().get($$2));
        }
        $$1.append(";");
        $$1.append($$0.d().e().map(acp::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
        return $$1.toString();
    }

    @Override
    protected void b() {
        this.s = sw.c("createWorld.customize.presets.share");
        this.t = sw.c("createWorld.customize.presets.list");
        this.w = new epr(this.i, 50, 40, this.g - 100, 20, this.s);
        this.w.m(1230);
        ezi $$02 = this.r.a.l().k();
        hs.b $$1 = $$02.a();
        caw $$2 = $$02.g().b();
        hg.c<cnk> $$3 = $$1.b(jc.ap);
        hg.c<dsg> $$42 = $$1.b(jc.aB);
        hg.c<dre> $$5 = $$1.b(jc.ay);
        hg<cpn> $$6 = $$1.b(jc.e).a($$2);
        this.w.a(eun.a(this.r.j()));
        this.x = this.r.j();
        this.e(this.w);
        this.u = new a($$1, $$2);
        this.e(this.u);
        this.v = this.d(epi.a(sw.c("createWorld.customize.presets.select"), (epi $$4) -> {
            dqd $$5 = eun.a($$6, $$3, $$42, $$5, this.w.b(), this.x);
            this.r.a($$5);
            this.f.a(this.r);
        }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
        this.d(epi.a(sv.e, (epi $$0) -> this.f.a(this.r)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
        this.c(this.u.f() != null);
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2) {
        return this.u.a($$0, $$1, $$2);
    }

    @Override
    public void a(enn $$0, int $$1, int $$2) {
        String $$3 = this.w.b();
        this.b($$0, $$1, $$2);
        this.w.a($$3);
    }

    @Override
    public void aw_() {
        this.f.a(this.r);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        this.u.a($$0, $$1, $$2, $$3);
        $$0.c().a();
        $$0.c().a(0.0f, 0.0f, 400.0f);
        $$0.a(this.i, this.e, this.g / 2, 8, 0xFFFFFF);
        $$0.b(this.i, this.s, 50, 30, 0xA0A0A0);
        $$0.b(this.i, this.t, 50, 70, 0xA0A0A0);
        $$0.c().b();
        this.w.a($$0, $$1, $$2, $$3);
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void f() {
        this.w.a();
        super.f();
    }

    public void c(boolean $$0) {
        this.v.r = $$0 || this.w.b().length() > 1;
    }

    class eun$a
    extends eqc<a> {
        public eun$a(hs $$02, caw $$12) {
            super(eun.this.f, eun.this.g, eun.this.h, 80, eun.this.h - 37, 24);
            for (he<dqb> $$2 : $$02.d(jc.av).c(ana.a)) {
                Set $$3 = $$2.a().b().e().stream().map($$0 -> $$0.b().b()).filter($$1 -> !$$1.a($$12)).collect(Collectors.toSet());
                if (!$$3.isEmpty()) {
                    b.info("Discarding flat world preset {} since it contains experimental blocks {}", (Object)$$2.e().map($$0 -> $$0.a().toString()).orElse("<unknown>"), $$3);
                    continue;
                }
                this.b(new a($$2));
            }
        }

        @Override
        public void a(@Nullable a $$0) {
            super.a($$0);
            eun.this.c($$0 != null);
        }

        @Override
        public boolean a(int $$0, int $$1, int $$2) {
            if (super.a($$0, $$1, $$2)) {
                return true;
            }
            if (esu.a($$0) && this.f() != null) {
                ((a)this.f()).b();
            }
            return false;
        }

        public class a
        extends eqc.a<a> {
            private static final acq b = new acq("textures/gui/container/stats_icons.png");
            private final dqb c;
            private final sw d;

            public a(he<dqb> $$1) {
                this.c = $$1.a();
                this.d = $$1.e().map($$0 -> sw.c($$0.a().f("flat_world_preset"))).orElse(eun.a);
            }

            @Override
            public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
                this.a($$0, $$3, $$2, this.c.a().a());
                $$0.a(eun.this.i, this.d, $$3 + 18 + 5, $$2 + 6, 0xFFFFFF, false);
            }

            @Override
            public boolean a(double $$0, double $$1, int $$2) {
                if ($$2 == 0) {
                    this.b();
                }
                return false;
            }

            void b() {
                a.this.a(this);
                eun.this.x = this.c.b();
                eun.this.w.a(eun.a(eun.this.x));
                eun.this.w.f();
            }

            private void a(eox $$0, int $$1, int $$2, cfu $$3) {
                this.a($$0, $$1 + 1, $$2 + 1);
                $$0.b(new cfz($$3), $$1 + 2, $$2 + 2);
            }

            private void a(eox $$0, int $$1, int $$2) {
                $$0.a(b, $$1, $$2, 0, 0.0f, 0.0f, 18, 18, 128, 128);
            }

            @Override
            public sw a() {
                return sw.a("narrator.select", this.d);
            }
        }
    }
}

