/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public final class bar
extends Enum<bar> {
    public static final /* enum */ bar a = new bar("client");
    public static final /* enum */ bar b = new bar("server");
    private final String c;
    private static final /* synthetic */ bar[] d;

    public static bar[] values() {
        return (bar[])d.clone();
    }

    public static bar valueOf(String $$0) {
        return Enum.valueOf(bar.class, $$0);
    }

    private bar(String $$0) {
        this.c = $$0;
    }

    public static bar a(MinecraftServer $$0) {
        return $$0.l() ? b : a;
    }

    public String a() {
        return this.c;
    }

    private static /* synthetic */ bar[] b() {
        return new bar[]{a, b};
    }

    static {
        d = bar.b();
    }
}

