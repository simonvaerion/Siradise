/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.Lifecycle
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class eza
extends euq {
    private static final int k = 1;
    private static final int l = 210;
    private static final int m = 36;
    private static final int n = 1;
    private static final Logger o = LogUtils.getLogger();
    private static final String p = "mcworld-";
    static final sw q = sw.c("selectWorld.gameMode");
    static final sw r = sw.c("selectWorld.enterName");
    static final sw s = sw.c("selectWorld.experiments");
    static final sw t = sw.c("selectWorld.allowCommands.info");
    private static final sw u = sw.c("createWorld.preparing");
    private static final int v = 10;
    private static final int w = 8;
    public static final acq a = new acq("textures/gui/header_separator.png");
    public static final acq b = new acq("textures/gui/footer_separator.png");
    public static final acq c = new acq("textures/gui/light_dirt_background.png");
    final ezj x;
    private final era y = new era(this::d, $$1 -> this.f((eqt)$$1));
    private boolean z;
    @Nullable
    private final euq A;
    @Nullable
    private Path C;
    @Nullable
    private aki D;
    @Nullable
    private esf E;
    @Nullable
    private erb F;

    public static void a(enn $$02, @Nullable euq $$12) {
        eza.a($$02, u);
        aki $$22 = new aki(new akl());
        adj.c $$32 = eza.a($$22, cnf.c);
        CompletableFuture<ezi> $$4 = adj.a($$32, (adj.a $$0) -> new adj.b<a>(new a(new dig(dii.a(), drq.a($$0.c())), $$0.b()), $$0.d()), (akn $$0, ada $$1, hl<acz> $$2, D $$3) -> {
            $$0.close();
            return new ezi($$3.a(), $$2, $$1, $$3.b());
        }, ac.f(), $$02);
        $$02.c($$4::isDone);
        $$02.a(new eza($$02, $$12, $$4.join(), Optional.of(drq.a), OptionalLong.empty()));
    }

    public static eza a(enn $$0, @Nullable euq $$1, cmq $$2, ezi $$3, @Nullable Path $$4) {
        eza $$5 = new eza($$0, $$1, $$3, drq.a($$3.d().d()), OptionalLong.of($$3.b().b()));
        $$5.z = true;
        $$5.x.a($$2.a());
        $$5.x.a($$2.e());
        $$5.x.a($$2.d());
        $$5.x.q().a($$2.f(), null);
        if ($$2.c()) {
            $$5.x.a(ezj.a.b);
        } else if ($$2.b().h()) {
            $$5.x.a(ezj.a.a);
        } else if ($$2.b().g()) {
            $$5.x.a(ezj.a.c);
        }
        $$5.C = $$4;
        return $$5;
    }

    private eza(enn $$0, @Nullable euq $$12, ezi $$2, Optional<acp<drp>> $$3, OptionalLong $$4) {
        super(sw.c("selectWorld.create"));
        this.A = $$12;
        this.x = new ezj($$0.k().c(), $$2, $$3, $$4);
    }

    public ezj l() {
        return this.x;
    }

    @Override
    public void f() {
        this.y.b();
    }

    @Override
    protected void b() {
        this.F = erb.a(this.y, this.g).a(new b(), new d(), new c()).a();
        this.d(this.F);
        this.E = new esf().a(10);
        esf.b $$02 = this.E.d(2);
        $$02.a(epi.a(sw.c("selectWorld.create"), (epi $$0) -> this.C()).a());
        $$02.a(epi.a(sv.e, (epi $$0) -> this.B()).a());
        this.E.a((epf $$0) -> {
            $$0.g(1);
            this.d($$0);
        });
        this.F.a(0, false);
        this.x.a();
        this.aG_();
    }

    @Override
    public void aG_() {
        if (this.F == null || this.E == null) {
            return;
        }
        this.F.a(this.g);
        this.F.b();
        this.E.c();
        ese.a(this.E, 0, this.h - 36, this.g, 36);
        int $$0 = this.F.s().c();
        esz $$1 = new esz(0, $$0, this.g, this.E.r() - $$0);
        this.y.a($$1);
    }

    private static void a(enn $$0, sw $$1) {
        $$0.c(new etx($$1));
    }

    private void C() {
        ezi $$0 = this.x.k();
        dif.b $$1 = $$0.d().a($$0.c());
        hl<acz> $$2 = $$0.e().a(acz.c, $$1.b());
        Lifecycle $$3 = cay.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
        Lifecycle $$4 = $$2.a().d();
        Lifecycle $$5 = $$4.add($$3);
        boolean $$6 = !this.z && $$4 == Lifecycle.stable();
        ezk.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
    }

    private void a(dzc.a $$0, hl<acz> $$1, Lifecycle $$2) {
        eza.a(this.f, u);
        Optional<dyy.c> $$3 = this.F();
        if ($$3.isEmpty()) {
            return;
        }
        this.E();
        boolean $$4 = $$0 == dzc.a.c;
        ezi $$5 = this.x.k();
        cmq $$6 = this.c($$4);
        dzc $$7 = new dzc($$6, $$5.b(), $$0, $$2);
        this.f.w().a($$3.get(), $$5.f(), $$1, $$7);
    }

    private cmq c(boolean $$0) {
        String $$1 = this.x.b().trim();
        if ($$0) {
            cmi $$2 = new cmi();
            $$2.a(cmi.k).a(false, (MinecraftServer)null);
            return new cmq($$1, cmj.d, false, bdu.a, true, $$2, cnf.c);
        }
        return new cmq($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if (this.F.b($$0)) {
            return true;
        }
        if (super.a($$0, $$1, $$2)) {
            return true;
        }
        if ($$0 == 257 || $$0 == 335) {
            this.C();
            return true;
        }
        return false;
    }

    @Override
    public void aw_() {
        this.B();
    }

    public void B() {
        this.f.a(this.A);
        this.E();
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(b, 0, apa.d(this.h - 36 - 2, 2), 0.0f, 0.0f, this.g, 2, 32, 2);
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void b(eox $$0) {
        int $$1 = 32;
        $$0.a(c, 0, 0, 0, 0.0f, 0.0f, this.g, this.h, 32, 32);
    }

    @Override
    protected <T extends eqt & esn> T e(T $$0) {
        return super.e($$0);
    }

    @Override
    protected <T extends eqt & eqh> T d(T $$0) {
        return super.d($$0);
    }

    @Nullable
    private Path D() {
        if (this.C == null) {
            try {
                this.C = Files.createTempDirectory(p, new FileAttribute[0]);
            }
            catch (IOException $$0) {
                o.warn("Failed to create temporary dir", (Throwable)$$0);
                erf.c(this.f, this.x.c());
                this.B();
            }
        }
        return this.C;
    }

    void a(cnf $$02) {
        Pair<Path, aki> $$1 = this.c($$02);
        if ($$1 != null) {
            this.f.a(new ezd(this, (aki)$$1.getSecond(), $$0 -> this.a((aki)$$0, false, this::a)));
        }
    }

    void b(cnf $$02) {
        Pair<Path, aki> $$1 = this.c($$02);
        if ($$1 != null) {
            this.f.a(new exv((aki)$$1.getSecond(), $$0 -> this.a((aki)$$0, true, this::b), (Path)$$1.getFirst(), sw.c("dataPack.title")));
        }
    }

    private void a(aki $$0, boolean $$1, Consumer<cnf> $$2) {
        List $$4;
        ImmutableList $$32 = ImmutableList.copyOf($$0.d());
        cnf $$5 = new cnf(new cma((List<String>)$$32, $$4 = (List)$$0.b().stream().filter(arg_0 -> eza.a((List)$$32, arg_0)).collect(ImmutableList.toImmutableList())), this.x.k().g().b());
        if (this.x.a($$5)) {
            this.f.a(this);
            return;
        }
        caw $$6 = $$0.e();
        if (cay.a($$6) && $$1) {
            this.f.a(new eyz($$0.f(), $$3 -> {
                if ($$3) {
                    this.a($$0, $$5, $$2);
                } else {
                    $$2.accept(this.x.k().g());
                }
            }));
        } else {
            this.a($$0, $$5, $$2);
        }
    }

    private void a(aki $$02, cnf $$13, Consumer<cnf> $$22) {
        this.f.c(new etx(sw.c("dataPack.validation.working")));
        adj.c $$32 = eza.a($$02, $$13);
        ((CompletableFuture)adj.a($$32, (adj.a $$0) -> {
            if ($$0.c().d(jc.aF).b() == 0) {
                throw new IllegalStateException("Needs at least one world preset to continue");
            }
            if ($$0.c().d(jc.ap).b() == 0) {
                throw new IllegalStateException("Needs at least one biome continue");
            }
            ezi $$12 = this.x.k();
            aco $$2 = aco.a(JsonOps.INSTANCE, $$12.a());
            DataResult $$3 = dig.a($$2, $$12.b(), $$12.d()).setLifecycle(Lifecycle.stable());
            aco $$4 = aco.a(JsonOps.INSTANCE, $$0.c());
            dig $$5 = (dig)$$3.flatMap($$1 -> dig.a.parse($$4, $$1)).getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", arg_0 -> ((Logger)o).error(arg_0)));
            return new adj.b<a>(new a($$5, $$0.b()), $$0.d());
        }, (akn $$0, ada $$1, hl<acz> $$2, D $$3) -> {
            $$0.close();
            return new ezi($$3.a(), $$2, $$1, $$3.b());
        }, ac.f(), this.f).thenAcceptAsync(this.x::a, (Executor)this.f)).handle(($$12, $$2) -> {
            if ($$2 != null) {
                o.warn("Failed to validate datapack", $$2);
                this.f.a(new etk($$1 -> {
                    if ($$1) {
                        $$22.accept(this.x.k().g());
                    } else {
                        $$22.accept(cnf.c);
                    }
                }, sw.c("dataPack.validation.failed"), sv.a, sw.c("dataPack.validation.back"), sw.c("dataPack.validation.reset")));
            } else {
                this.f.a(this);
            }
            return null;
        });
    }

    private static adj.c a(aki $$0, cnf $$1) {
        adj.d $$2 = new adj.d($$0, $$1, false, true);
        return new adj.c($$2, dt.a.c, 2);
    }

    private void E() {
        if (this.C != null) {
            try (Stream<Path> $$02 = Files.walk(this.C, new FileVisitOption[0]);){
                $$02.sorted(Comparator.reverseOrder()).forEach($$0 -> {
                    try {
                        Files.delete($$0);
                    }
                    catch (IOException $$1) {
                        o.warn("Failed to remove temporary file {}", $$0, (Object)$$1);
                    }
                });
            }
            catch (IOException $$1) {
                o.warn("Failed to list temporary dir {}", (Object)this.C);
            }
            this.C = null;
        }
    }

    private static void a(Path $$0, Path $$1, Path $$2) {
        try {
            ac.b($$0, $$1, $$2);
        }
        catch (IOException $$3) {
            o.warn("Failed to copy datapack file from {} to {}", (Object)$$2, (Object)$$1);
            throw new UncheckedIOException($$3);
        }
    }

    private Optional<dyy.c> F() {
        Optional<dyy.c> optional;
        String $$02;
        block12: {
            dyy.c $$12;
            block11: {
                $$02 = this.x.c();
                $$12 = this.f.k().d($$02);
                if (this.C != null) break block11;
                return Optional.of($$12);
            }
            Stream<Path> $$2 = Files.walk(this.C, new FileVisitOption[0]);
            try {
                Path $$3 = $$12.a(dyw.j);
                v.c($$3);
                $$2.filter($$0 -> !$$0.equals(this.C)).forEach($$1 -> eza.a(this.C, $$3, $$1));
                optional = Optional.of($$12);
                if ($$2 == null) break block12;
            }
            catch (Throwable throwable) {
                try {
                    try {
                        if ($$2 != null) {
                            try {
                                $$2.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (IOException | UncheckedIOException $$4) {
                        o.warn("Failed to copy datapacks to world {}", (Object)$$02, (Object)$$4);
                        $$12.close();
                    }
                }
                catch (IOException | UncheckedIOException $$5) {
                    o.warn("Failed to create access for {}", (Object)$$02, (Object)$$5);
                }
            }
            $$2.close();
        }
        return optional;
        erf.c(this.f, $$02);
        this.B();
        return Optional.empty();
    }

    @Nullable
    public static Path a(Path $$0, enn $$12) {
        MutableObject $$22 = new MutableObject();
        try (Stream<Path> $$3 = Files.walk($$0, new FileVisitOption[0]);){
            $$3.filter($$1 -> !$$1.equals($$0)).forEach($$2 -> {
                Path $$3 = (Path)$$22.getValue();
                if ($$3 == null) {
                    try {
                        $$3 = Files.createTempDirectory(p, new FileAttribute[0]);
                    }
                    catch (IOException $$4) {
                        o.warn("Failed to create temporary dir");
                        throw new UncheckedIOException($$4);
                    }
                    $$22.setValue((Object)$$3);
                }
                eza.a($$0, $$3, $$2);
            });
        }
        catch (IOException | UncheckedIOException $$4) {
            o.warn("Failed to copy datapacks from world {}", (Object)$$0, (Object)$$4);
            erf.c($$12, $$0.toString());
            return null;
        }
        return (Path)$$22.getValue();
    }

    @Nullable
    private Pair<Path, aki> c(cnf $$0) {
        Path $$1 = this.D();
        if ($$1 != null) {
            if (this.D == null) {
                this.D = akl.a($$1);
                this.D.a();
            }
            this.D.a($$0.a().a());
            return Pair.of((Object)$$1, (Object)this.D);
        }
        return null;
    }

    private static /* synthetic */ boolean a(List $$0, String $$1) {
        return !$$0.contains($$1);
    }

    class b
    extends eqy {
        private static final sw c = sw.c("createWorld.tab.game.title");
        private static final sw d = sw.c("selectWorld.allowCommands");
        private final epr e;

        b() {
            super(c);
            esf.b $$02 = this.a.b(8).d(1);
            esj $$12 = $$02.b();
            esf.b $$2 = new esf().b(4).d(1);
            $$2.a(new eqk(r, ((eza)eza.this).f.h), $$2.b().b(1));
            this.e = $$2.a(new epr(eza.this.i, 0, 0, 208, 20, sw.c("selectWorld.enterName")), $$2.b().a(1));
            this.e.a(eza.this.x.b());
            this.e.b(eza.this.x::a);
            eza.this.x.a((ezj $$0) -> this.e.a(eqp.a(sw.a("selectWorld.targetFolder", sw.b($$0.c()).a(n.u)))));
            eza.this.c((eqt)this.e);
            $$02.a($$2.a(), $$02.b().b());
            epp<ezj.a> $$3 = $$02.a(epp.a((T $$0) -> $$0.f).a((ezj.a)new ezj.a[]{ezj.a.a, ezj.a.b, ezj.a.c}).a(0, 0, 210, 20, q, ($$0, $$1) -> eza.this.x.a((ezj.a)((Object)$$1))), $$12);
            eza.this.x.a((ezj $$1) -> {
                $$3.a($$1.d());
                $$0.r = !$$1.l();
                $$3.a((ezj.a)((Object)eqp.a($$1.d().a())));
            });
            epp<bdu> $$4 = $$02.a(epp.a(bdu::b).a((bdu)bdu.values()).a(0, 0, 210, 20, sw.c("options.difficulty"), ($$0, $$1) -> eza.this.x.a((bdu)$$1)), $$12);
            eza.this.x.a((ezj $$1) -> {
                $$4.a(eza.this.x.e());
                $$0.r = !eza.this.x.f();
                $$4.a((bdu)((Object)eqp.a(eza.this.x.e().d())));
            });
            epp<Boolean> $$5 = $$02.a(epp.e().a((Boolean)((Object)((enq.l<Boolean>)$$0 -> eqp.a(t)))).a(0, 0, 210, 20, d, ($$0, $$1) -> eza.this.x.a((boolean)$$1)));
            eza.this.x.a((ezj $$1) -> {
                $$5.a(eza.this.x.g());
                $$0.r = !eza.this.x.l() && !eza.this.x.f();
            });
            if (!aa.b().g()) {
                $$02.a(epi.a(s, $$0 -> eza.this.a(eza.this.x.k().g())).a(210).a());
            }
        }

        @Override
        public void b() {
            this.e.a();
        }
    }

    class d
    extends eqy {
        private static final sw c = sw.c("createWorld.tab.world.title");
        private static final sw d = sw.c("generator.minecraft.amplified.info");
        private static final sw e = sw.c("selectWorld.mapFeatures");
        private static final sw f = sw.c("selectWorld.mapFeatures.info");
        private static final sw g = sw.c("selectWorld.bonusItems");
        private static final sw h = sw.c("selectWorld.enterSeed");
        static final sw i = sw.c("selectWorld.seedInfo").a(n.i);
        private static final int j = 310;
        private final epr k;
        private final epi l;

        d() {
            super(c);
            esf.b $$02 = this.a.a(10).b(8).d(2);
            epp<ezj.b> $$12 = $$02.a(epp.a(ezj.b::a).a((ezj.b)((Object)this.d())).a(d::a).a(0, 0, 150, 20, sw.c("selectWorld.mapType"), ($$0, $$1) -> eza.this.x.a((ezj.b)$$1)));
            $$12.a(eza.this.x.m());
            eza.this.x.a((ezj $$1) -> {
                ezj.b $$2 = $$1.m();
                $$12.a($$2);
                if ($$2.b()) {
                    $$12.a((ezj.b)((Object)eqp.a(d)));
                } else {
                    $$12.a((ezj.b)null);
                }
                $$0.r = eza.this.x.m().c() != null;
            });
            this.l = $$02.a(epi.a(sw.c("selectWorld.customizeType"), (epi $$0) -> this.c()).a());
            eza.this.x.a((ezj $$0) -> {
                this.l.r = !$$0.l() && $$0.n() != null;
            });
            esf.b $$2 = new esf().b(4).d(1);
            $$2.a(new eqk(h, eza.this.i).e());
            this.k = $$2.a(new epr(eza.this.i, 0, 0, 308, 20, sw.c("selectWorld.enterSeed")){

                @Override
                protected tj aE_() {
                    return super.aE_().b(sv.r).b(i);
                }
            }, $$02.b().a(1));
            this.k.c(i);
            this.k.a(eza.this.x.h());
            this.k.b($$0 -> eza.this.x.b(this.k.b()));
            $$02.a($$2.a(), 2);
            ezh.a $$3 = ezh.a(310).a(1);
            $$3.a(e, eza.this.x::i, eza.this.x::b).a(() -> !eza.this.x.l()).a(f);
            $$3.a(g, eza.this.x::j, eza.this.x::c).a(() -> !eza.this.x.f() && !eza.this.x.l());
            ezh $$4 = $$3.a((esi $$1) -> $$02.a($$1, 2));
            eza.this.x.a((ezj $$1) -> $$4.a());
        }

        private void c() {
            ezf $$0 = eza.this.x.n();
            if ($$0 != null) {
                eza.this.f.a($$0.createEditScreen(eza.this, eza.this.x.k()));
            }
        }

        private epp.c<ezj.b> d() {
            return new epp.c<ezj.b>(){

                @Override
                public List<ezj.b> a() {
                    return epp.a.getAsBoolean() ? eza.this.x.p() : eza.this.x.o();
                }

                @Override
                public List<ezj.b> b() {
                    return eza.this.x.o();
                }
            };
        }

        private static tj a(epp<ezj.b> $$0) {
            if ($$0.a().b()) {
                return sv.a(new sw[]{$$0.b(), d});
            }
            return $$0.b();
        }

        @Override
        public void b() {
            this.k.a();
        }
    }

    class c
    extends eqy {
        private static final sw c = sw.c("createWorld.tab.more.title");
        private static final sw d = sw.c("selectWorld.gameRules");
        private static final sw e = sw.c("selectWorld.dataPacks");

        c() {
            super(c);
            esf.b $$02 = this.a.b(8).d(1);
            $$02.a(epi.a(d, $$0 -> this.c()).a(210).a());
            $$02.a(epi.a(s, $$0 -> eza.this.a(eza.this.x.k().g())).a(210).a());
            $$02.a(epi.a(e, $$0 -> eza.this.b(eza.this.x.k().g())).a(210).a());
        }

        private void c() {
            eza.this.f.a(new ezb(eza.this.x.q().b(), $$0 -> {
                eza.this.f.a(eza.this);
                $$0.ifPresent(eza.this.x::a);
            }));
        }
    }

    record a(dig a, cnf b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "worldGenSettings;dataConfiguration", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "worldGenSettings;dataConfiguration", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "worldGenSettings;dataConfiguration", "a", "b"}, this, $$0);
        }
    }
}

