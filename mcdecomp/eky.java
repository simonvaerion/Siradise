/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eky
extends gan {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 80;
    private final euq c;
    private final eiu G;
    @Nullable
    private ejq H;
    private final long I;
    private final sw[] J = new sw[]{sw.c("mco.brokenworld.message.line1"), sw.c("mco.brokenworld.message.line2")};
    private int K;
    private int L;
    private final List<Integer> M = Lists.newArrayList();
    private int N;

    public eky(euq $$0, eiu $$1, long $$2, boolean $$3) {
        super($$3 ? sw.c("mco.brokenworld.minigame.title") : sw.c("mco.brokenworld.title"));
        this.c = $$0;
        this.G = $$1;
        this.I = $$2;
    }

    @Override
    public void b() {
        this.K = this.g / 2 - 150;
        this.L = this.g / 2 + 190;
        this.d(epi.a(sv.k, (epi $$0) -> this.C()).a(this.L - 80 + 8, eky.h(13) - 5, 70, 20).a());
        if (this.H == null) {
            this.a(this.I);
        } else {
            this.B();
        }
    }

    @Override
    public sw au_() {
        return sy.a(Stream.concat(Stream.of(this.e), Stream.of(this.J)).collect(Collectors.toList()), sv.t);
    }

    private void B() {
        for (Map.Entry<Integer, ejx> $$0 : this.H.i.entrySet()) {
            epi $$4;
            boolean $$2;
            int $$13 = $$0.getKey();
            boolean bl2 = $$2 = $$13 != this.H.n || this.H.m == ejq.c.b;
            if ($$2) {
                epi $$3 = epi.a(sw.c("mco.brokenworld.play"), (epi $$1) -> {
                    if (this.H.i.get((Object)Integer.valueOf((int)$$0)).l) {
                        eln $$2 = new eln(this, this.H, sw.c("mco.configure.world.switch.slot"), sw.c("mco.configure.world.switch.slot.subtitle"), 0xA0A0A0, sv.e, this::c, () -> {
                            this.f.a(this);
                            this.c();
                        });
                        $$2.a($$13);
                        $$2.a(sw.c("mco.create.world.reset.title"));
                        this.f.a($$2);
                    } else {
                        this.f.a(new elh(this.c, new emv(this.H.a, $$13, this::c)));
                    }
                }).a(this.a($$13), eky.h(8), 80, 20).a();
            } else {
                $$4 = epi.a(sw.c("mco.brokenworld.download"), (epi $$12) -> {
                    tj $$2 = sw.c("mco.configure.world.restore.download.question.line1");
                    tj $$3 = sw.c("mco.configure.world.restore.download.question.line2");
                    this.f.a(new elg($$1 -> {
                        if ($$1) {
                            this.b($$13);
                        } else {
                            this.f.a(this);
                        }
                    }, elg.a.b, $$2, $$3, true));
                }).a(this.a($$13), eky.h(8), 80, 20).a();
            }
            if (this.M.contains($$13)) {
                $$4.r = false;
                $$4.b(sw.c("mco.brokenworld.downloaded"));
            }
            this.d($$4);
            this.d(epi.a(sw.c("mco.brokenworld.reset"), (epi $$1) -> {
                eln $$2 = new eln(this, this.H, this::c, () -> {
                    this.f.a(this);
                    this.c();
                });
                if ($$13 != this.H.n || this.H.m == ejq.c.b) {
                    $$2.a($$13);
                }
                this.f.a($$2);
            }).a(this.a($$13), eky.h(10), 80, 20).a());
        }
    }

    @Override
    public void f() {
        ++this.N;
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.i, this.e, this.g / 2, 17, 0xFFFFFF);
        for (int $$4 = 0; $$4 < this.J.length; ++$$4) {
            $$0.a(this.i, this.J[$$4], this.g / 2, eky.h(-1) + 3 + $$4 * 12, 0xA0A0A0);
        }
        if (this.H == null) {
            return;
        }
        for (Map.Entry<Integer, ejx> $$5 : this.H.i.entrySet()) {
            if ($$5.getValue().k != null && $$5.getValue().j != -1L) {
                this.a($$0, this.a($$5.getKey()), eky.h(1) + 5, $$1, $$2, this.H.n == $$5.getKey() && !this.D(), $$5.getValue().a($$5.getKey()), $$5.getKey(), $$5.getValue().j, $$5.getValue().k, $$5.getValue().l);
                continue;
            }
            this.a($$0, this.a($$5.getKey()), eky.h(1) + 5, $$1, $$2, this.H.n == $$5.getKey() && !this.D(), $$5.getValue().a($$5.getKey()), $$5.getKey(), -1L, null, $$5.getValue().l);
        }
    }

    private int a(int $$0) {
        return this.K + ($$0 - 1) * 110;
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 256) {
            this.C();
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    private void C() {
        this.f.a(this.c);
    }

    private void a(long $$0) {
        new Thread(() -> {
            eiz $$1 = eiz.a();
            try {
                this.H = $$1.a($$0);
                this.B();
            }
            catch (ekm $$2) {
                a.error("Couldn't get own world");
                this.f.a(new ele(sw.a($$2.getMessage()), this.c));
            }
        }).start();
    }

    public void c() {
        new Thread(() -> {
            eiz $$0 = eiz.a();
            if (this.H.e == ejq.b.a) {
                this.f.execute(() -> this.f.a(new elh(this, new emp(this.H, this, this.G, true, this.f))));
            } else {
                try {
                    ejq $$1 = $$0.a(this.I);
                    this.f.execute(() -> this.G.h().a($$1, this));
                }
                catch (ekm $$2) {
                    a.error("Couldn't get own world");
                    this.f.execute(() -> this.f.a(this.c));
                }
            }
        }).start();
    }

    private void b(int $$0) {
        eiz $$12 = eiz.a();
        try {
            ekg $$2 = $$12.b(this.H.a, $$0);
            eld $$3 = new eld(this, $$2, this.H.a($$0), $$1 -> {
                if ($$1) {
                    this.M.add($$0);
                    this.n();
                    this.B();
                } else {
                    this.f.a(this);
                }
            });
            this.f.a($$3);
        }
        catch (ekm $$4) {
            a.error("Couldn't download world data");
            this.f.a(new ele($$4, (euq)this));
        }
    }

    private boolean D() {
        return this.H != null && this.H.m == ejq.c.b;
    }

    private void a(eox $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
        acq $$16;
        if ($$10) {
            acq $$11 = ekt.b;
        } else if ($$9 != null && $$8 != -1L) {
            acq $$12 = eme.a(String.valueOf($$8), $$9);
        } else if ($$7 == 1) {
            acq $$13 = ekt.d;
        } else if ($$7 == 2) {
            acq $$14 = ekt.e;
        } else if ($$7 == 3) {
            acq $$15 = ekt.f;
        } else {
            $$16 = eme.a(String.valueOf(this.H.p), this.H.q);
        }
        if (!$$5) {
            $$0.a(0.56f, 0.56f, 0.56f, 1.0f);
        } else if ($$5) {
            float $$17 = 0.9f + 0.1f * apa.b((float)this.N * 0.2f);
            $$0.a($$17, $$17, $$17, 1.0f);
        }
        $$0.a($$16, $$1 + 3, $$2 + 3, 0.0f, 0.0f, 74, 74, 74, 74);
        if ($$5) {
            $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
        } else {
            $$0.a(0.56f, 0.56f, 0.56f, 1.0f);
        }
        $$0.a(ekt.a, $$1, $$2, 0.0f, 0.0f, 80, 80, 80, 80);
        $$0.a(this.i, $$6, $$1 + 40, $$2 + 66, 0xFFFFFF);
        $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
    }
}

