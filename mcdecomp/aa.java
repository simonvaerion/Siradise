/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.DSL$TypeReference
 *  io.netty.util.ResourceLeakDetector
 *  io.netty.util.ResourceLeakDetector$Level
 *  javax.annotation.Nullable
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DSL;
import io.netty.util.ResourceLeakDetector;
import java.time.Duration;
import java.util.Set;
import javax.annotation.Nullable;

public class aa {
    @Deprecated
    public static final boolean a = false;
    @Deprecated
    public static final int b = 3465;
    @Deprecated
    public static final String c = "main";
    @Deprecated
    public static final String d = "1.20.1";
    @Deprecated
    public static final int e = 763;
    @Deprecated
    public static final int f = 142;
    public static final int g = 3437;
    private static final int bh = 30;
    public static final boolean h = false;
    @Deprecated
    public static final int i = 15;
    @Deprecated
    public static final int j = 15;
    @Deprecated
    public static final int k = 1;
    public static final int l = 1;
    public static final String m = "DataVersion";
    public static final boolean n = false;
    public static final boolean o = false;
    public static final boolean p = false;
    public static final boolean q = false;
    public static final boolean r = false;
    public static final boolean s = false;
    public static final boolean t = false;
    public static final boolean u = false;
    public static final boolean v = false;
    public static final boolean w = false;
    public static final boolean x = false;
    public static final boolean y = false;
    public static final boolean z = false;
    public static final boolean A = false;
    public static final boolean B = false;
    public static final boolean C = false;
    public static final boolean D = false;
    public static final boolean E = false;
    public static final boolean F = false;
    public static final boolean G = false;
    public static final boolean H = false;
    public static final boolean I = false;
    public static final boolean J = false;
    public static final boolean K = false;
    public static final boolean L = false;
    public static final boolean M = false;
    public static final boolean N = false;
    public static final boolean O = false;
    public static final boolean P = false;
    public static final boolean Q = false;
    public static final boolean R = false;
    public static final boolean S = false;
    public static final boolean T = false;
    public static final boolean U = false;
    public static final boolean V = false;
    public static final boolean W = false;
    public static final boolean X = false;
    public static final boolean Y = false;
    public static final boolean Z = false;
    public static final boolean aa = false;
    public static final boolean ab = false;
    public static final boolean ac = false;
    public static final boolean ad = false;
    public static final boolean ae = false;
    public static final boolean af = false;
    public static final boolean ag = false;
    public static final boolean ah = false;
    public static final boolean ai = false;
    public static final boolean aj = false;
    public static final boolean ak = false;
    public static final boolean al = false;
    public static final boolean am = false;
    public static final boolean an = false;
    public static final boolean ao = false;
    public static boolean ap = false;
    public static boolean aq = false;
    public static final boolean ar = false;
    public static final boolean as = false;
    public static final boolean at = false;
    public static final boolean au = false;
    public static final boolean av = false;
    public static final boolean aw = false;
    public static final boolean ax = false;
    public static final boolean ay = false;
    public static final boolean az = false;
    public static final boolean aA = false;
    public static final int aB = 25565;
    public static final boolean aC = false;
    public static final boolean aD = false;
    public static final int aE = 0;
    public static final int aF = 0;
    public static final ResourceLeakDetector.Level aG = ResourceLeakDetector.Level.DISABLED;
    public static final boolean aH = false;
    public static final boolean aI = false;
    public static final boolean aJ = false;
    public static final boolean aK = false;
    public static final boolean aL = false;
    public static final boolean aM = false;
    public static final boolean aN = false;
    public static final boolean aO = false;
    public static final long aP = Duration.ofMillis(300L).toNanos();
    public static final boolean aQ = false;
    public static boolean aR = true;
    public static boolean aS;
    public static Set<DSL.TypeReference> aT;
    public static final int aU = 16;
    public static final int aV = 256;
    public static final int aW = 32500;
    public static final int aX = 1000000;
    public static final int aY = 32;
    public static final char[] aZ;
    public static final int ba = 20;
    public static final int bb = 1200;
    public static final int bc = 24000;
    public static final float bd = 1365.3334f;
    public static final float be = 0.87890625f;
    public static final float bf = 17.578125f;
    public static final int bg = 64;
    @Nullable
    private static ad bi;

    public static boolean a(char $$0) {
        return $$0 != '\u00a7' && $$0 >= ' ' && $$0 != '\u007f';
    }

    public static String a(String $$0) {
        return aa.a($$0, false);
    }

    public static String a(String $$0, boolean $$1) {
        StringBuilder $$2 = new StringBuilder();
        for (char $$3 : $$0.toCharArray()) {
            if (aa.a($$3)) {
                $$2.append($$3);
                continue;
            }
            if (!$$1 || $$3 != '\n') continue;
            $$2.append($$3);
        }
        return $$2.toString();
    }

    public static void a(ad $$0) {
        if (bi == null) {
            bi = $$0;
        } else if ($$0 != bi) {
            throw new IllegalStateException("Cannot override the current game version!");
        }
    }

    public static void a() {
        if (bi == null) {
            bi = t.a();
        }
    }

    public static ad b() {
        if (bi == null) {
            throw new IllegalStateException("Game version not set");
        }
        return bi;
    }

    public static int c() {
        return 763;
    }

    public static boolean a(clt $$0) {
        int $$1 = $$0.d();
        int $$2 = $$0.e();
        if (ap) {
            return $$1 > 8192 || $$1 < 0 || $$2 > 1024 || $$2 < 0;
        }
        return false;
    }

    public static void d() {
        aT = aqc.m;
    }

    static {
        aT = Set.of();
        aZ = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};
        ResourceLeakDetector.setLevel((ResourceLeakDetector.Level)aG);
        CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES = false;
        CommandSyntaxException.BUILT_IN_EXCEPTIONS = new dl();
    }
}

