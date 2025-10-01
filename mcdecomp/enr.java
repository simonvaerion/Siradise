/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.base.MoreObjects
 *  com.google.common.base.Splitter
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  com.google.gson.reflect.TypeToken
 *  com.google.gson.stream.JsonReader
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.ArrayUtils
 *  org.slf4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;

public class enr {
    static final Logger aj = LogUtils.getLogger();
    static final Gson ak = new Gson();
    private static final TypeToken<List<String>> al = new TypeToken<List<String>>(){};
    public static final int a = 2;
    public static final int b = 4;
    public static final int c = 8;
    public static final int d = 12;
    public static final int e = 16;
    public static final int f = 32;
    private static final Splitter am = Splitter.on((char)':').limit(2);
    private static final float an = 1.0f;
    public static final String g = "";
    private static final sw ao = sw.c("options.darkMojangStudiosBackgroundColor.tooltip");
    private final enq<Boolean> ap = enq.a("options.darkMojangStudiosBackgroundColor", enq.a(ao), false);
    private static final sw aq = sw.c("options.hideLightningFlashes.tooltip");
    private final enq<Boolean> ar = enq.a("options.hideLightningFlashes", enq.a(aq), false);
    private final enq<Double> as = new enq<Double>("options.sensitivity", enq.a(), ($$0, $$1) -> {
        if ($$1 == 0.0) {
            return enr.a($$0, sw.c("options.sensitivity.min"));
        }
        if ($$1 == 1.0) {
            return enr.a($$0, sw.c("options.sensitivity.max"));
        }
        return enr.a($$0, 2.0 * $$1);
    }, enq.m.a, 0.5, $$0 -> {});
    private final enq<Integer> at;
    private final enq<Integer> au;
    private int av = 0;
    private final enq<Double> aw = new enq<Double>("options.entityDistanceScaling", enq.a(), enr::a, new enq.f(2, 20).a((int $$0) -> (double)$$0 / 4.0, (? super R $$0) -> (int)($$0 * 4.0)), Codec.doubleRange((double)0.5, (double)5.0), 1.0, $$0 -> {});
    public static final int h = 260;
    private final enq<Integer> ax = new enq<Integer>("options.framerateLimit", enq.a(), ($$0, $$1) -> {
        if ($$1 == 260) {
            return enr.a($$0, sw.c("options.framerateLimit.max"));
        }
        return enr.a($$0, sw.a("options.framerate", $$1));
    }, new enq.f(1, 26).a((int $$0) -> $$0 * 10, (? super R $$0) -> $$0 / 10), Codec.intRange((int)10, (int)260), 120, $$0 -> enn.N().aM().a((int)$$0));
    private final enq<enc> ay = new enq<enc>("options.renderClouds", enq.a(), enq.b(), new enq.e<enc>(Arrays.asList(enc.values()), Codec.either((Codec)Codec.BOOL, (Codec)Codec.STRING).xmap($$02 -> (enc)$$02.map($$0 -> $$0 != false ? enc.c : enc.a, $$0 -> switch ($$0) {
        case "true" -> enc.c;
        case "fast" -> enc.b;
        default -> enc.a;
    }), $$0 -> Either.right((Object)(switch ($$0) {
        default -> throw new IncompatibleClassChangeError();
        case enc.c -> "true";
        case enc.b -> "fast";
        case enc.a -> "false";
    })))), enc.c, $$0 -> {
        egv $$1;
        if (enn.L() && ($$1 = enn.N().f.x()) != null) {
            $$1.b(enn.a);
        }
    });
    private static final sw az = sw.c("options.graphics.fast.tooltip");
    private static final sw aA = sw.a("options.graphics.fabulous.tooltip", sw.c("options.graphics.fabulous").a(n.u));
    private static final sw aB = sw.c("options.graphics.fancy.tooltip");
    private final enq<eng> aC = new enq<eng>("options.graphics", $$0 -> switch ($$0) {
        default -> throw new IncompatibleClassChangeError();
        case eng.b -> eqp.a(aB);
        case eng.a -> eqp.a(az);
        case eng.c -> eqp.a(aA);
    }, ($$0, $$1) -> {
        tj $$2 = sw.c($$1.b());
        if ($$1 == eng.c) {
            return $$2.a(n.u);
        }
        return $$2;
    }, new enq.a<eng>(Arrays.asList(eng.values()), Stream.of(eng.values()).filter($$0 -> $$0 != eng.c).collect(Collectors.toList()), () -> enn.N().q() && enn.N().ag().h(), ($$0, $$1) -> {
        enn $$2 = enn.N();
        fjr $$3 = $$2.ag();
        if ($$1 == eng.c && $$3.b()) {
            $$3.d();
            return;
        }
        $$0.a($$1);
        $$2.f.f();
    }, Codec.INT.xmap(eng::a, eng::a)), eng.b, $$0 -> {});
    private final enq<Boolean> aD = enq.a("options.ao", true, $$0 -> enn.N().f.f());
    private static final sw aE = sw.c("options.prioritizeChunkUpdates.none.tooltip");
    private static final sw aF = sw.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
    private static final sw aG = sw.c("options.prioritizeChunkUpdates.nearby.tooltip");
    private final enq<enu> aH = new enq<enu>("options.prioritizeChunkUpdates", $$0 -> switch ($$0) {
        default -> throw new IncompatibleClassChangeError();
        case enu.a -> eqp.a(aE);
        case enu.b -> eqp.a(aF);
        case enu.c -> eqp.a(aG);
    }, enq.b(), new enq.e<enu>(Arrays.asList(enu.values()), Codec.INT.xmap(enu::a, enu::a)), enu.a, $$0 -> {});
    public List<String> i = Lists.newArrayList();
    public List<String> j = Lists.newArrayList();
    private final enq<bym> aI = new enq<bym>("options.chat.visibility", enq.a(), enq.b(), new enq.e<bym>(Arrays.asList(bym.values()), Codec.INT.xmap(bym::a, bym::a)), bym.a, $$0 -> {});
    private final enq<Double> aJ = new enq<Double>("options.chat.opacity", enq.a(), ($$0, $$1) -> enr.a($$0, $$1 * 0.9 + 0.1), enq.m.a, 1.0, $$0 -> enn.N().l.d().b());
    private final enq<Double> aK = new enq<Double>("options.chat.line_spacing", enq.a(), enr::a, enq.m.a, 0.0, $$0 -> {});
    private final enq<Double> aL = new enq<Double>("options.accessibility.text_background_opacity", enq.a(), enr::a, enq.m.a, 0.5, $$0 -> enn.N().l.d().b());
    private final enq<Double> aM = new enq<Double>("options.accessibility.panorama_speed", enq.a(), enr::a, enq.m.a, 1.0, $$0 -> {});
    private static final sw aN = sw.c("options.accessibility.high_contrast.tooltip");
    private final enq<Boolean> aO = enq.a("options.accessibility.high_contrast", enq.a(aN), false, $$0 -> {
        aki $$1 = enn.N().Z();
        boolean $$2 = $$1.d().contains("high_contrast");
        if (!$$2 && $$0.booleanValue()) {
            if ($$1.a("high_contrast")) {
                this.a($$1);
            }
        } else if ($$2 && !$$0.booleanValue() && $$1.b("high_contrast")) {
            this.a($$1);
        }
    });
    @Nullable
    public String k;
    public boolean l;
    public boolean m;
    public boolean n = true;
    private final Set<byp> aP = EnumSet.allOf(byp.class);
    private final enq<bft> aQ = new enq<bft>("options.mainHand", enq.a(), enq.b(), new enq.e<bft>(Arrays.asList(bft.values()), Codec.STRING.xmap($$0 -> "left".equals($$0) ? bft.a : bft.b, $$0 -> $$0 == bft.a ? "left" : "right")), bft.b, $$0 -> this.ar());
    public int o;
    public int p;
    private final enq<Double> aR = new enq<Double>("options.chat.scale", enq.a(), ($$0, $$1) -> {
        if ($$1 == 0.0) {
            return sv.a($$0, false);
        }
        return enr.a($$0, (double)$$1);
    }, enq.m.a, 1.0, $$0 -> enn.N().l.d().b());
    private final enq<Double> aS = new enq<Double>("options.chat.width", enq.a(), ($$0, $$1) -> enr.b($$0, epj.a($$1)), enq.m.a, 1.0, $$0 -> enn.N().l.d().b());
    private final enq<Double> aT = new enq<Double>("options.chat.height.unfocused", enq.a(), ($$0, $$1) -> enr.b($$0, epj.b($$1)), enq.m.a, epj.h(), $$0 -> enn.N().l.d().b());
    private final enq<Double> aU = new enq<Double>("options.chat.height.focused", enq.a(), ($$0, $$1) -> enr.b($$0, epj.b($$1)), enq.m.a, 1.0, $$0 -> enn.N().l.d().b());
    private final enq<Double> aV = new enq<Double>("options.chat.delay_instant", enq.a(), ($$0, $$1) -> {
        if ($$1 <= 0.0) {
            return sw.c("options.chat.delay_none");
        }
        return sw.a("options.chat.delay", new Object[]{String.format(Locale.ROOT, "%.1f", $$1)});
    }, new enq.f(0, 60).a((int $$0) -> (double)$$0 / 10.0, (? super R $$0) -> (int)($$0 * 10.0)), Codec.doubleRange((double)0.0, (double)6.0), 0.0, $$0 -> enn.N().aV().a((double)$$0));
    private static final sw aW = sw.c("options.notifications.display_time.tooltip");
    private final enq<Double> aX = new enq<Double>("options.notifications.display_time", enq.a(aW), ($$0, $$1) -> enr.a($$0, sw.a("options.multiplier", $$1)), new enq.f(5, 100).a((int $$0) -> (double)$$0 / 10.0, (? super R $$0) -> (int)($$0 * 10.0)), Codec.doubleRange((double)0.5, (double)10.0), 1.0, $$0 -> {});
    private final enq<Integer> aY = new enq<Integer>("options.mipmapLevels", enq.a(), ($$0, $$1) -> {
        if ($$1 == 0) {
            return sv.a($$0, false);
        }
        return enr.a($$0, (int)$$1);
    }, new enq.f(0, 4), 4, $$0 -> {});
    public boolean q = true;
    private final enq<emy> aZ = new enq<emy>("options.attackIndicator", enq.a(), enq.b(), new enq.e<emy>(Arrays.asList(emy.values()), Codec.INT.xmap(emy::a, emy::a)), emy.b, $$0 -> {});
    public gah r = gah.a;
    public boolean s = false;
    public boolean t = false;
    private final enq<Integer> ba = new enq<Integer>("options.biomeBlendRadius", enq.a(), ($$0, $$1) -> {
        int $$2 = $$1 * 2 + 1;
        return enr.a($$0, sw.c("options.biomeBlendRadius." + $$2));
    }, new enq.f(0, 7), 2, $$0 -> enn.N().f.f());
    private final enq<Double> bb = new enq<Double>("options.mouseWheelSensitivity", enq.a(), ($$0, $$1) -> enr.a($$0, sw.b(String.format(Locale.ROOT, "%.2f", $$1))), new enq.f(-200, 100).a(enr::c, enr::a), Codec.doubleRange((double)enr.c(-200), (double)enr.c(100)), enr.c(0), $$0 -> {});
    private final enq<Boolean> bc = enq.a("options.rawMouseInput", true, $$0 -> {
        ehn $$1 = enn.N().aM();
        if ($$1 != null) {
            $$1.b((boolean)$$0);
        }
    });
    public int u = 1;
    private final enq<Boolean> bd = enq.a("options.autoJump", false);
    private final enq<Boolean> be = enq.a("options.operatorItemsTab", false);
    private final enq<Boolean> bf = enq.a("options.autoSuggestCommands", true);
    private final enq<Boolean> bg = enq.a("options.chat.color", true);
    private final enq<Boolean> bh = enq.a("options.chat.links", true);
    private final enq<Boolean> bi = enq.a("options.chat.links.prompt", true);
    private final enq<Boolean> bj = enq.a("options.vsync", true, $$0 -> {
        if (enn.N().aM() != null) {
            enn.N().aM().a((boolean)$$0);
        }
    });
    private final enq<Boolean> bk = enq.a("options.entityShadows", true);
    private final enq<Boolean> bl = enq.a("options.forceUnicodeFont", false, $$0 -> {
        enn $$1 = enn.N();
        if ($$1.aM() != null) {
            $$1.b((boolean)$$0);
            $$1.a();
        }
    });
    private final enq<Boolean> bm = enq.a("options.invertMouse", false);
    private final enq<Boolean> bn = enq.a("options.discrete_mouse_scroll", false);
    private final enq<Boolean> bo = enq.a("options.realmsNotifications", true);
    private static final sw bp = sw.c("options.allowServerListing.tooltip");
    private final enq<Boolean> bq = enq.a("options.allowServerListing", enq.a(bp), true, $$0 -> this.ar());
    private final enq<Boolean> br = enq.a("options.reducedDebugInfo", false);
    private final Map<ami, enq<Double>> bs = ac.a(new EnumMap(ami.class), (T $$0) -> {
        for (ami $$1 : ami.values()) {
            $$0.put($$1, this.a("soundCategory." + $$1.a(), $$1));
        }
    });
    private final enq<Boolean> bt = enq.a("options.showSubtitles", false);
    private static final sw bu = sw.c("options.directionalAudio.on.tooltip");
    private static final sw bv = sw.c("options.directionalAudio.off.tooltip");
    private final enq<Boolean> bw = enq.a("options.directionalAudio", $$0 -> $$0 != false ? eqp.a(bu) : eqp.a(bv), false, $$0 -> {
        fzc $$1 = enn.N().ah();
        $$1.i();
        $$1.a(fxt.a(amh.yo, 1.0f));
    });
    private final enq<Boolean> bx = new enq<Boolean>("options.accessibility.text_background", enq.a(), ($$0, $$1) -> $$1 != false ? sw.c("options.accessibility.text_background.chat") : sw.c("options.accessibility.text_background.everywhere"), enq.a, true, $$0 -> {});
    private final enq<Boolean> by = enq.a("options.touchscreen", false);
    private final enq<Boolean> bz = enq.a("options.fullscreen", false, $$0 -> {
        enn $$1 = enn.N();
        if ($$1.aM() != null && $$1.aM().j() != $$0.booleanValue()) {
            $$1.aM().h();
            this.V().a($$1.aM().j());
        }
    });
    private final enq<Boolean> bA = enq.a("options.viewBobbing", true);
    private static final sw bB = sw.c("options.key.toggle");
    private static final sw bC = sw.c("options.key.hold");
    private final enq<Boolean> bD = new enq<Boolean>("key.sneak", enq.a(), ($$0, $$1) -> $$1 != false ? bB : bC, enq.a, false, $$0 -> {});
    private final enq<Boolean> bE = new enq<Boolean>("key.sprint", enq.a(), ($$0, $$1) -> $$1 != false ? bB : bC, enq.a, false, $$0 -> {});
    public boolean v;
    public boolean w;
    private static final sw bF = sw.c("options.hideMatchedNames.tooltip");
    private final enq<Boolean> bG = enq.a("options.hideMatchedNames", enq.a(bF), true);
    private final enq<Boolean> bH = enq.a("options.autosaveIndicator", true);
    private static final sw bI = sw.c("options.onlyShowSecureChat.tooltip");
    private final enq<Boolean> bJ = enq.a("options.onlyShowSecureChat", enq.a(bI), false);
    public final enl x = new enl("key.forward", 87, "key.categories.movement");
    public final enl y = new enl("key.left", 65, "key.categories.movement");
    public final enl z = new enl("key.back", 83, "key.categories.movement");
    public final enl A = new enl("key.right", 68, "key.categories.movement");
    public final enl B = new enl("key.jump", 32, "key.categories.movement");
    public final enl C = new eob("key.sneak", 340, "key.categories.movement", this.bD::c);
    public final enl D = new eob("key.sprint", 341, "key.categories.movement", this.bE::c);
    public final enl E = new enl("key.inventory", 69, "key.categories.inventory");
    public final enl F = new enl("key.swapOffhand", 70, "key.categories.inventory");
    public final enl G = new enl("key.drop", 81, "key.categories.inventory");
    public final enl H = new enl("key.use", ehe.b.c, 1, "key.categories.gameplay");
    public final enl I = new enl("key.attack", ehe.b.c, 0, "key.categories.gameplay");
    public final enl J = new enl("key.pickItem", ehe.b.c, 2, "key.categories.gameplay");
    public final enl K = new enl("key.chat", 84, "key.categories.multiplayer");
    public final enl L = new enl("key.playerlist", 258, "key.categories.multiplayer");
    public final enl M = new enl("key.command", 47, "key.categories.multiplayer");
    public final enl N = new enl("key.socialInteractions", 80, "key.categories.multiplayer");
    public final enl O = new enl("key.screenshot", 291, "key.categories.misc");
    public final enl P = new enl("key.togglePerspective", 294, "key.categories.misc");
    public final enl Q = new enl("key.smoothCamera", ehe.bv.b(), "key.categories.misc");
    public final enl R = new enl("key.fullscreen", 300, "key.categories.misc");
    public final enl S = new enl("key.spectatorOutlines", ehe.bv.b(), "key.categories.misc");
    public final enl T = new enl("key.advancements", 76, "key.categories.misc");
    public final enl[] U = new enl[]{new enl("key.hotbar.1", 49, "key.categories.inventory"), new enl("key.hotbar.2", 50, "key.categories.inventory"), new enl("key.hotbar.3", 51, "key.categories.inventory"), new enl("key.hotbar.4", 52, "key.categories.inventory"), new enl("key.hotbar.5", 53, "key.categories.inventory"), new enl("key.hotbar.6", 54, "key.categories.inventory"), new enl("key.hotbar.7", 55, "key.categories.inventory"), new enl("key.hotbar.8", 56, "key.categories.inventory"), new enl("key.hotbar.9", 57, "key.categories.inventory")};
    public final enl V = new enl("key.saveToolbarActivator", 67, "key.categories.creative");
    public final enl W = new enl("key.loadToolbarActivator", 88, "key.categories.creative");
    public final enl[] X = (enl[])ArrayUtils.addAll((Object[])new enl[]{this.I, this.H, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.G, this.E, this.K, this.L, this.J, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.F, this.V, this.W, this.T}, (Object[])this.U);
    protected enn Y;
    private final File bK;
    public boolean Z;
    private ena bL = ena.a;
    public boolean aa;
    public boolean ab;
    public boolean ac;
    public String ad = "";
    public boolean ae;
    private final enq<Integer> bM = new enq<Integer>("options.fov", enq.a(), ($$0, $$1) -> switch ($$1) {
        case 70 -> enr.a($$0, sw.c("options.fov.min"));
        case 110 -> enr.a($$0, sw.c("options.fov.max"));
        default -> enr.a($$0, (int)$$1);
    }, new enq.f(30, 110), Codec.DOUBLE.xmap($$0 -> (int)($$0 * 40.0 + 70.0), $$0 -> ((double)$$0.intValue() - 70.0) / 40.0), 70, $$0 -> enn.N().f.r());
    private static final sw bN = sw.a("options.telemetry.button.tooltip", sw.c("options.telemetry.state.minimal"), sw.c("options.telemetry.state.all"));
    private final enq<Boolean> bO = enq.a("options.telemetry.button", enq.a(bN), ($$0, $$1) -> {
        enn $$2 = enn.N();
        if (!$$2.B()) {
            return sw.c("options.telemetry.state.none");
        }
        if ($$1.booleanValue() && $$2.A()) {
            return sw.c("options.telemetry.state.all");
        }
        return sw.c("options.telemetry.state.minimal");
    }, false, $$0 -> {});
    private static final sw bP = sw.c("options.screenEffectScale.tooltip");
    private final enq<Double> bQ = new enq<Double>("options.screenEffectScale", enq.a(bP), ($$0, $$1) -> {
        if ($$1 == 0.0) {
            return enr.a($$0, sv.c);
        }
        return enr.a($$0, (double)$$1);
    }, enq.m.a, 1.0, $$0 -> {});
    private static final sw bR = sw.c("options.fovEffectScale.tooltip");
    private final enq<Double> bS = new enq<Double>("options.fovEffectScale", enq.a(bR), ($$0, $$1) -> {
        if ($$1 == 0.0) {
            return enr.a($$0, sv.c);
        }
        return enr.a($$0, (double)$$1);
    }, enq.m.a.a(apa::k, Math::sqrt), Codec.doubleRange((double)0.0, (double)1.0), 1.0, $$0 -> {});
    private static final sw bT = sw.c("options.darknessEffectScale.tooltip");
    private final enq<Double> bU = new enq<Double>("options.darknessEffectScale", enq.a(bT), ($$0, $$1) -> {
        if ($$1 == 0.0) {
            return enr.a($$0, sv.c);
        }
        return enr.a($$0, (double)$$1);
    }, enq.m.a.a(apa::k, Math::sqrt), 1.0, $$0 -> {});
    private static final sw bV = sw.c("options.glintSpeed.tooltip");
    private final enq<Double> bW = new enq<Double>("options.glintSpeed", enq.a(bV), ($$0, $$1) -> {
        if ($$1 == 0.0) {
            return enr.a($$0, sv.c);
        }
        return enr.a($$0, (double)$$1);
    }, enq.m.a, 0.5, $$0 -> {});
    private static final sw bX = sw.c("options.glintStrength.tooltip");
    private final enq<Double> bY = new enq<Double>("options.glintStrength", enq.a(bX), ($$0, $$1) -> {
        if ($$1 == 0.0) {
            return enr.a($$0, sv.c);
        }
        return enr.a($$0, (double)$$1);
    }, enq.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
    private static final sw bZ = sw.c("options.damageTiltStrength.tooltip");
    private final enq<Double> ca = new enq<Double>("options.damageTiltStrength", enq.a(bZ), ($$0, $$1) -> {
        if ($$1 == 0.0) {
            return enr.a($$0, sv.c);
        }
        return enr.a($$0, (double)$$1);
    }, enq.m.a, 1.0, $$0 -> {});
    private final enq<Double> cb = new enq<Double>("options.gamma", enq.a(), ($$0, $$1) -> {
        int $$2 = (int)($$1 * 100.0);
        if ($$2 == 0) {
            return enr.a($$0, sw.c("options.gamma.min"));
        }
        if ($$2 == 50) {
            return enr.a($$0, sw.c("options.gamma.default"));
        }
        if ($$2 == 100) {
            return enr.a($$0, sw.c("options.gamma.max"));
        }
        return enr.a($$0, $$2);
    }, enq.m.a, 0.5, $$0 -> {});
    public static final int af = 0;
    private static final int cc = 0x7FFFFFFE;
    private final enq<Integer> cd = new enq<Integer>("options.guiScale", enq.a(), ($$0, $$1) -> $$1 == 0 ? sw.c("options.guiScale.auto") : sw.b(Integer.toString($$1)), new enq.c(0, () -> {
        enn $$0 = enn.N();
        if (!$$0.q()) {
            return 0x7FFFFFFE;
        }
        return $$0.aM().a(0, $$0.i());
    }, 0x7FFFFFFE), 0, $$0 -> {});
    private final enq<ens> ce = new enq<ens>("options.particles", enq.a(), enq.b(), new enq.e<ens>(Arrays.asList(ens.values()), Codec.INT.xmap(ens::a, ens::a)), ens.a, $$0 -> {});
    private final enq<enp> cf = new enq<enp>("options.narrator", enq.a(), ($$0, $$1) -> {
        if (this.Y.aU().a()) {
            return $$1.b();
        }
        return sw.c("options.narrator.notavailable");
    }, new enq.e<enp>(Arrays.asList(enp.values()), Codec.INT.xmap(enp::a, enp::a)), enp.a, $$0 -> this.Y.aU().a((enp)((Object)$$0)));
    public String ag = "en_us";
    private final enq<String> cg = new enq<String>("options.audioDevice", enq.a(), ($$0, $$1) -> {
        if (g.equals($$1)) {
            return sw.c("options.audioDevice.default");
        }
        if ($$1.startsWith("OpenAL Soft on ")) {
            return sw.b($$1.substring(fyz.c));
        }
        return sw.b($$1);
    }, new enq.h<String>(() -> Stream.concat(Stream.of(g), enn.N().ah().a().stream()).toList(), (Function<String, Optional<String>>)((Function<String, Optional>)$$0 -> {
        if (!enn.N().q() || $$0 == g || enn.N().ah().a().contains($$0)) {
            return Optional.of($$0);
        }
        return Optional.empty();
    }), (Codec<String>)Codec.STRING), "", $$0 -> {
        fzc $$1 = enn.N().ah();
        $$1.i();
        $$1.a(fxt.a(amh.yo, 1.0f));
    });
    public boolean ah = true;
    public boolean ai;

    public enq<Boolean> a() {
        return this.ap;
    }

    public enq<Boolean> b() {
        return this.ar;
    }

    public enq<Double> c() {
        return this.as;
    }

    public enq<Integer> d() {
        return this.at;
    }

    public enq<Integer> e() {
        return this.au;
    }

    public enq<Double> f() {
        return this.aw;
    }

    public enq<Integer> g() {
        return this.ax;
    }

    public enq<enc> h() {
        return this.ay;
    }

    public enq<eng> i() {
        return this.aC;
    }

    public enq<Boolean> j() {
        return this.aD;
    }

    public enq<enu> k() {
        return this.aH;
    }

    public void a(aki $$0) {
        ImmutableList $$1 = ImmutableList.copyOf(this.i);
        this.i.clear();
        this.j.clear();
        for (akg $$2 : $$0.f()) {
            if ($$2.h()) continue;
            this.i.add($$2.f());
            if ($$2.c().a()) continue;
            this.j.add($$2.f());
        }
        this.aq();
        ImmutableList $$3 = ImmutableList.copyOf(this.i);
        if (!$$3.equals($$1)) {
            this.Y.j();
        }
    }

    public enq<bym> l() {
        return this.aI;
    }

    public enq<Double> m() {
        return this.aJ;
    }

    public enq<Double> n() {
        return this.aK;
    }

    public enq<Double> o() {
        return this.aL;
    }

    public enq<Double> p() {
        return this.aM;
    }

    public enq<Boolean> q() {
        return this.aO;
    }

    public enq<bft> r() {
        return this.aQ;
    }

    public enq<Double> s() {
        return this.aR;
    }

    public enq<Double> t() {
        return this.aS;
    }

    public enq<Double> u() {
        return this.aT;
    }

    public enq<Double> v() {
        return this.aU;
    }

    public enq<Double> w() {
        return this.aV;
    }

    public enq<Double> x() {
        return this.aX;
    }

    public enq<Integer> y() {
        return this.aY;
    }

    public enq<emy> z() {
        return this.aZ;
    }

    public enq<Integer> A() {
        return this.ba;
    }

    private static double c(int $$0) {
        return Math.pow(10.0, (double)$$0 / 100.0);
    }

    private static int a(double $$0) {
        return apa.a(Math.log10($$0) * 100.0);
    }

    public enq<Double> B() {
        return this.bb;
    }

    public enq<Boolean> C() {
        return this.bc;
    }

    public enq<Boolean> D() {
        return this.bd;
    }

    public enq<Boolean> E() {
        return this.be;
    }

    public enq<Boolean> F() {
        return this.bf;
    }

    public enq<Boolean> G() {
        return this.bg;
    }

    public enq<Boolean> H() {
        return this.bh;
    }

    public enq<Boolean> I() {
        return this.bi;
    }

    public enq<Boolean> J() {
        return this.bj;
    }

    public enq<Boolean> K() {
        return this.bk;
    }

    public enq<Boolean> L() {
        return this.bl;
    }

    public enq<Boolean> M() {
        return this.bm;
    }

    public enq<Boolean> N() {
        return this.bn;
    }

    public enq<Boolean> O() {
        return this.bo;
    }

    public enq<Boolean> P() {
        return this.bq;
    }

    public enq<Boolean> Q() {
        return this.br;
    }

    public final float a(ami $$0) {
        return this.b($$0).c().floatValue();
    }

    public final enq<Double> b(ami $$0) {
        return Objects.requireNonNull(this.bs.get((Object)$$0));
    }

    private enq<Double> a(String $$02, ami $$12) {
        return new enq<Double>($$02, enq.a(), ($$0, $$1) -> {
            if ($$1 == 0.0) {
                return enr.a($$0, sv.c);
            }
            return enr.a($$0, (double)$$1);
        }, enq.m.a, 1.0, $$1 -> enn.N().ah().a($$12, $$1.floatValue()));
    }

    public enq<Boolean> R() {
        return this.bt;
    }

    public enq<Boolean> S() {
        return this.bw;
    }

    public enq<Boolean> T() {
        return this.bx;
    }

    public enq<Boolean> U() {
        return this.by;
    }

    public enq<Boolean> V() {
        return this.bz;
    }

    public enq<Boolean> W() {
        return this.bA;
    }

    public enq<Boolean> X() {
        return this.bD;
    }

    public enq<Boolean> Y() {
        return this.bE;
    }

    public enq<Boolean> Z() {
        return this.bG;
    }

    public enq<Boolean> aa() {
        return this.bH;
    }

    public enq<Boolean> ab() {
        return this.bJ;
    }

    public enq<Integer> ac() {
        return this.bM;
    }

    public enq<Boolean> ad() {
        return this.bO;
    }

    public enq<Double> ae() {
        return this.bQ;
    }

    public enq<Double> af() {
        return this.bS;
    }

    public enq<Double> ag() {
        return this.bU;
    }

    public enq<Double> ah() {
        return this.bW;
    }

    public enq<Double> ai() {
        return this.bY;
    }

    public enq<Double> aj() {
        return this.ca;
    }

    public enq<Double> ak() {
        return this.cb;
    }

    public enq<Integer> al() {
        return this.cd;
    }

    public enq<ens> am() {
        return this.ce;
    }

    public enq<enp> an() {
        return this.cf;
    }

    public enq<String> ao() {
        return this.cg;
    }

    public enr(enn $$03, File $$12) {
        this.Y = $$03;
        this.bK = new File($$12, "options.txt");
        boolean $$2 = $$03.ae();
        boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
        this.at = new enq<Integer>("options.renderDistance", enq.a(), ($$0, $$1) -> enr.a($$0, sw.a("options.chunks", $$1)), new enq.f(2, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0 -> enn.N().f.r());
        this.au = new enq<Integer>("options.simulationDistance", enq.a(), ($$0, $$1) -> enr.a($$0, sw.a("options.chunks", $$1)), new enq.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0 -> {});
        this.ai = ac.i() == ac.b.c;
        this.ap();
    }

    public float a(float $$0) {
        return this.bx.c() != false ? $$0 : this.o().c().floatValue();
    }

    public int b(float $$0) {
        return (int)(this.a($$0) * 255.0f) << 24 & 0xFF000000;
    }

    public int a(int $$0) {
        return this.bx.c() != false ? $$0 : (int)(this.aL.c() * 255.0) << 24 & 0xFF000000;
    }

    public void a(enl $$0, ehe.a $$1) {
        $$0.b($$1);
        this.aq();
    }

    private void a(a $$0) {
        $$0.a("autoJump", this.bd);
        $$0.a("operatorItemsTab", this.be);
        $$0.a("autoSuggestions", this.bf);
        $$0.a("chatColors", this.bg);
        $$0.a("chatLinks", this.bh);
        $$0.a("chatLinksPrompt", this.bi);
        $$0.a("enableVsync", this.bj);
        $$0.a("entityShadows", this.bk);
        $$0.a("forceUnicodeFont", this.bl);
        $$0.a("discrete_mouse_scroll", this.bn);
        $$0.a("invertYMouse", this.bm);
        $$0.a("realmsNotifications", this.bo);
        $$0.a("reducedDebugInfo", this.br);
        $$0.a("showSubtitles", this.bt);
        $$0.a("directionalAudio", this.bw);
        $$0.a("touchscreen", this.by);
        $$0.a("fullscreen", this.bz);
        $$0.a("bobView", this.bA);
        $$0.a("toggleCrouch", this.bD);
        $$0.a("toggleSprint", this.bE);
        $$0.a("darkMojangStudiosBackground", this.ap);
        $$0.a("hideLightningFlashes", this.ar);
        $$0.a("mouseSensitivity", this.as);
        $$0.a("fov", this.bM);
        $$0.a("screenEffectScale", this.bQ);
        $$0.a("fovEffectScale", this.bS);
        $$0.a("darknessEffectScale", this.bU);
        $$0.a("glintSpeed", this.bW);
        $$0.a("glintStrength", this.bY);
        $$0.a("damageTiltStrength", this.ca);
        $$0.a("highContrast", this.aO);
        $$0.a("gamma", this.cb);
        $$0.a("renderDistance", this.at);
        $$0.a("simulationDistance", this.au);
        $$0.a("entityDistanceScaling", this.aw);
        $$0.a("guiScale", this.cd);
        $$0.a("particles", this.ce);
        $$0.a("maxFps", this.ax);
        $$0.a("graphicsMode", this.aC);
        $$0.a("ao", this.aD);
        $$0.a("prioritizeChunkUpdates", this.aH);
        $$0.a("biomeBlendRadius", this.ba);
        $$0.a("renderClouds", this.ay);
        this.i = $$0.a("resourcePacks", this.i, enr::c, arg_0 -> ((Gson)ak).toJson(arg_0));
        this.j = $$0.a("incompatibleResourcePacks", this.j, enr::c, arg_0 -> ((Gson)ak).toJson(arg_0));
        this.ad = $$0.a("lastServer", this.ad);
        this.ag = $$0.a("lang", this.ag);
        $$0.a("soundDevice", this.cg);
        $$0.a("chatVisibility", this.aI);
        $$0.a("chatOpacity", this.aJ);
        $$0.a("chatLineSpacing", this.aK);
        $$0.a("textBackgroundOpacity", this.aL);
        $$0.a("backgroundForChatOnly", this.bx);
        this.l = $$0.a("hideServerAddress", this.l);
        this.m = $$0.a("advancedItemTooltips", this.m);
        this.n = $$0.a("pauseOnLostFocus", this.n);
        this.o = $$0.a("overrideWidth", this.o);
        this.p = $$0.a("overrideHeight", this.p);
        $$0.a("chatHeightFocused", this.aU);
        $$0.a("chatDelay", this.aV);
        $$0.a("chatHeightUnfocused", this.aT);
        $$0.a("chatScale", this.aR);
        $$0.a("chatWidth", this.aS);
        $$0.a("notificationDisplayTime", this.aX);
        $$0.a("mipmapLevels", this.aY);
        this.q = $$0.a("useNativeTransport", this.q);
        $$0.a("mainHand", this.aQ);
        $$0.a("attackIndicator", this.aZ);
        $$0.a("narrator", this.cf);
        this.r = $$0.a("tutorialStep", this.r, gah::a, gah::a);
        $$0.a("mouseWheelSensitivity", this.bb);
        $$0.a("rawMouseInput", this.bc);
        this.u = $$0.a("glDebugVerbosity", this.u);
        this.v = $$0.a("skipMultiplayerWarning", this.v);
        this.w = $$0.a("skipRealms32bitWarning", this.w);
        $$0.a("hideMatchedNames", this.bG);
        this.s = $$0.a("joinedFirstServer", this.s);
        this.t = $$0.a("hideBundleTutorial", this.t);
        this.ai = $$0.a("syncChunkWrites", this.ai);
        $$0.a("showAutosaveIndicator", this.bH);
        $$0.a("allowServerListing", this.bq);
        $$0.a("onlyShowSecureChat", this.bJ);
        $$0.a("panoramaScrollSpeed", this.aM);
        $$0.a("telemetryOptInExtra", this.bO);
        this.ah = $$0.a("onboardAccessibility", this.ah);
        for (enl enl2 : this.X) {
            String $$3;
            String $$2 = enl2.m();
            if ($$2.equals($$3 = $$0.a("key_" + enl2.h(), $$2))) continue;
            enl2.b(ehe.a($$3));
        }
        for (ami ami2 : ami.values()) {
            $$0.a("soundCategory_" + ami2.a(), this.bs.get((Object)ami2));
        }
        for (byp byp2 : byp.values()) {
            boolean $$6 = this.aP.contains((Object)byp2);
            boolean $$7 = $$0.a("modelPart_" + byp2.c(), $$6);
            if ($$7 == $$6) continue;
            this.b(byp2, $$7);
        }
    }

    public void ap() {
        try {
            if (!this.bK.exists()) {
                return;
            }
            qr $$0 = new qr();
            try (BufferedReader $$12 = Files.newReader((File)this.bK, (Charset)Charsets.UTF_8);){
                $$12.lines().forEach($$1 -> {
                    try {
                        Iterator $$2 = am.split((CharSequence)$$1).iterator();
                        $$0.a((String)$$2.next(), (String)$$2.next());
                    }
                    catch (Exception $$3) {
                        aj.warn("Skipping bad option: {}", $$1);
                    }
                });
            }
            final qr $$2 = this.a($$0);
            if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
                if (enr.a($$2.l("fancyGraphics"))) {
                    this.aC.a(eng.b);
                } else {
                    this.aC.a(eng.a);
                }
            }
            this.a(new a(){

                @Nullable
                private String a(String $$0) {
                    return $$2.e($$0) ? $$2.l($$0) : null;
                }

                @Override
                public <T> void a(String $$0, enq<T> $$1) {
                    String $$22 = this.a($$0);
                    if ($$22 != null) {
                        JsonReader $$3 = new JsonReader((Reader)new StringReader($$22.isEmpty() ? "\"\"" : $$22));
                        JsonElement $$4 = JsonParser.parseReader((JsonReader)$$3);
                        DataResult $$5 = $$1.d().parse((DynamicOps)JsonOps.INSTANCE, (Object)$$4);
                        $$5.error().ifPresent($$2 -> aj.error("Error parsing option value " + $$22 + " for option " + $$1 + ": " + $$2.message()));
                        $$5.result().ifPresent($$1::a);
                    }
                }

                @Override
                public int a(String $$0, int $$1) {
                    String $$22 = this.a($$0);
                    if ($$22 != null) {
                        try {
                            return Integer.parseInt($$22);
                        }
                        catch (NumberFormatException $$3) {
                            aj.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$22, $$3});
                        }
                    }
                    return $$1;
                }

                @Override
                public boolean a(String $$0, boolean $$1) {
                    String $$22 = this.a($$0);
                    return $$22 != null ? enr.a($$22) : $$1;
                }

                @Override
                public String a(String $$0, String $$1) {
                    return (String)MoreObjects.firstNonNull((Object)this.a($$0), (Object)$$1);
                }

                @Override
                public float a(String $$0, float $$1) {
                    String $$22 = this.a($$0);
                    if ($$22 != null) {
                        if (enr.a($$22)) {
                            return 1.0f;
                        }
                        if (enr.b($$22)) {
                            return 0.0f;
                        }
                        try {
                            return Float.parseFloat($$22);
                        }
                        catch (NumberFormatException $$3) {
                            aj.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$22, $$3});
                        }
                    }
                    return $$1;
                }

                @Override
                public <T> T a(String $$0, T $$1, Function<String, T> $$22, Function<T, String> $$3) {
                    String $$4 = this.a($$0);
                    return $$4 == null ? $$1 : $$22.apply($$4);
                }
            });
            if ($$2.e("fullscreenResolution")) {
                this.k = $$2.l("fullscreenResolution");
            }
            if (this.Y.aM() != null) {
                this.Y.aM().a(this.ax.c());
            }
            enl.d();
        }
        catch (Exception $$3) {
            aj.error("Failed to load options", (Throwable)$$3);
        }
    }

    static boolean a(String $$0) {
        return "true".equals($$0);
    }

    static boolean b(String $$0) {
        return "false".equals($$0);
    }

    private qr a(qr $$0) {
        int $$1 = 0;
        try {
            $$1 = Integer.parseInt($$0.l("version"));
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        return aqc.e.a(this.Y.as(), $$0, $$1);
    }

    public void aq() {
        try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(this.bK), StandardCharsets.UTF_8));){
            $$0.println("version:" + aa.b().d().c());
            this.a(new a(){

                public void a(String $$02) {
                    $$0.print($$02);
                    $$0.print(':');
                }

                @Override
                public <T> void a(String $$02, enq<T> $$12) {
                    DataResult $$22 = $$12.d().encodeStart((DynamicOps)JsonOps.INSTANCE, $$12.c());
                    $$22.error().ifPresent($$1 -> aj.error("Error saving option " + $$12 + ": " + $$1));
                    $$22.result().ifPresent($$2 -> {
                        this.a($$02);
                        $$0.println(ak.toJson($$2));
                    });
                }

                @Override
                public int a(String $$02, int $$1) {
                    this.a($$02);
                    $$0.println($$1);
                    return $$1;
                }

                @Override
                public boolean a(String $$02, boolean $$1) {
                    this.a($$02);
                    $$0.println($$1);
                    return $$1;
                }

                @Override
                public String a(String $$02, String $$1) {
                    this.a($$02);
                    $$0.println($$1);
                    return $$1;
                }

                @Override
                public float a(String $$02, float $$1) {
                    this.a($$02);
                    $$0.println($$1);
                    return $$1;
                }

                @Override
                public <T> T a(String $$02, T $$1, Function<String, T> $$2, Function<T, String> $$3) {
                    this.a($$02);
                    $$0.println($$3.apply($$1));
                    return $$1;
                }
            });
            if (this.Y.aM().f().isPresent()) {
                $$0.println("fullscreenResolution:" + this.Y.aM().f().get().g());
            }
        }
        catch (Exception $$1) {
            aj.error("Failed to save options", (Throwable)$$1);
        }
        this.ar();
    }

    public void ar() {
        if (this.Y.t != null) {
            int $$0 = 0;
            for (byp $$1 : this.aP) {
                $$0 |= $$1.a();
            }
            this.Y.t.cl.a(new zl(this.ag, this.at.c(), this.aI.c(), this.bg.c(), $$0, this.aQ.c(), this.Y.aP(), this.bq.c()));
        }
    }

    private void b(byp $$0, boolean $$1) {
        if ($$1) {
            this.aP.add($$0);
        } else {
            this.aP.remove((Object)$$0);
        }
    }

    public boolean a(byp $$0) {
        return this.aP.contains((Object)$$0);
    }

    public void a(byp $$0, boolean $$1) {
        this.b($$0, $$1);
        this.ar();
    }

    public enc as() {
        if (this.ax() >= 4) {
            return this.ay.c();
        }
        return enc.a;
    }

    public boolean at() {
        return this.q;
    }

    public void b(aki $$0) {
        LinkedHashSet $$1 = Sets.newLinkedHashSet();
        Iterator<String> $$2 = this.i.iterator();
        while ($$2.hasNext()) {
            String $$3 = $$2.next();
            akg $$4 = $$0.c($$3);
            if ($$4 == null && !$$3.startsWith("file/")) {
                $$4 = $$0.c("file/" + $$3);
            }
            if ($$4 == null) {
                aj.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", (Object)$$3);
                $$2.remove();
                continue;
            }
            if (!$$4.c().a() && !this.j.contains($$3)) {
                aj.warn("Removed resource pack {} from options because it is no longer compatible", (Object)$$3);
                $$2.remove();
                continue;
            }
            if ($$4.c().a() && this.j.contains($$3)) {
                aj.info("Removed resource pack {} from incompatibility list because it's now compatible", (Object)$$3);
                this.j.remove($$3);
                continue;
            }
            $$1.add($$4.f());
        }
        $$0.a($$1);
    }

    public ena au() {
        return this.bL;
    }

    public void a(ena $$0) {
        this.bL = $$0;
    }

    private static List<String> c(String $$0) {
        ArrayList $$1 = aor.a(ak, $$0, al);
        return $$1 != null ? $$1 : Lists.newArrayList();
    }

    public File av() {
        return this.bK;
    }

    public String aw() {
        Stream<Pair> $$02 = Stream.builder().add(Pair.of((Object)"ao", (Object)this.aD.c())).add(Pair.of((Object)"biomeBlendRadius", (Object)this.ba.c())).add(Pair.of((Object)"enableVsync", (Object)this.bj.c())).add(Pair.of((Object)"entityDistanceScaling", (Object)this.aw.c())).add(Pair.of((Object)"entityShadows", (Object)this.bk.c())).add(Pair.of((Object)"forceUnicodeFont", (Object)this.bl.c())).add(Pair.of((Object)"fov", (Object)this.bM.c())).add(Pair.of((Object)"fovEffectScale", (Object)this.bS.c())).add(Pair.of((Object)"darknessEffectScale", (Object)this.bU.c())).add(Pair.of((Object)"glintSpeed", (Object)this.bW.c())).add(Pair.of((Object)"glintStrength", (Object)this.bY.c())).add(Pair.of((Object)"prioritizeChunkUpdates", (Object)this.aH.c())).add(Pair.of((Object)"fullscreen", (Object)this.bz.c())).add(Pair.of((Object)"fullscreenResolution", (Object)String.valueOf(this.k))).add(Pair.of((Object)"gamma", (Object)this.cb.c())).add(Pair.of((Object)"glDebugVerbosity", (Object)this.u)).add(Pair.of((Object)"graphicsMode", (Object)this.aC.c())).add(Pair.of((Object)"guiScale", (Object)this.cd.c())).add(Pair.of((Object)"maxFps", (Object)this.ax.c())).add(Pair.of((Object)"mipmapLevels", (Object)this.aY.c())).add(Pair.of((Object)"narrator", (Object)((Object)this.cf.c()))).add(Pair.of((Object)"overrideHeight", (Object)this.p)).add(Pair.of((Object)"overrideWidth", (Object)this.o)).add(Pair.of((Object)"particles", (Object)this.ce.c())).add(Pair.of((Object)"reducedDebugInfo", (Object)this.br.c())).add(Pair.of((Object)"renderClouds", (Object)this.ay.c())).add(Pair.of((Object)"renderDistance", (Object)this.at.c())).add(Pair.of((Object)"simulationDistance", (Object)this.au.c())).add(Pair.of((Object)"resourcePacks", this.i)).add(Pair.of((Object)"screenEffectScale", (Object)this.bQ.c())).add(Pair.of((Object)"syncChunkWrites", (Object)this.ai)).add(Pair.of((Object)"useNativeTransport", (Object)this.q)).add(Pair.of((Object)"soundDevice", (Object)this.cg.c())).build();
        return $$02.map($$0 -> (String)$$0.getFirst() + ": " + $$0.getSecond()).collect(Collectors.joining(System.lineSeparator()));
    }

    public void b(int $$0) {
        this.av = $$0;
    }

    public int ax() {
        return this.av > 0 ? Math.min(this.at.c(), this.av) : this.at.c();
    }

    private static sw b(sw $$0, int $$1) {
        return sw.a("options.pixel_value", $$0, $$1);
    }

    private static sw a(sw $$0, double $$1) {
        return sw.a("options.percent_value", $$0, (int)($$1 * 100.0));
    }

    public static sw a(sw $$0, sw $$1) {
        return sw.a("options.generic_value", $$0, $$1);
    }

    public static sw a(sw $$0, int $$1) {
        return enr.a($$0, sw.b(Integer.toString($$1)));
    }

    static interface a {
        public <T> void a(String var1, enq<T> var2);

        public int a(String var1, int var2);

        public boolean a(String var1, boolean var2);

        public String a(String var1, String var2);

        public float a(String var1, float var2);

        public <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
    }
}

