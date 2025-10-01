/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public abstract class gan
extends euq {
    protected static final int k = 17;
    protected static final int l = 20;
    protected static final int m = 7;
    protected static final long n = 0x140000000L;
    public static final int o = 0xFFFFFF;
    public static final int p = 0xA0A0A0;
    protected static final int q = 0x4C4C4C;
    protected static final int r = 0x6C6C6C;
    protected static final int s = 0x7FFF7F;
    protected static final int t = 6077788;
    protected static final int u = 0xFF0000;
    protected static final int v = 15553363;
    protected static final int w = -1073741824;
    protected static final int x = 0xCCAC5C;
    protected static final int y = -256;
    protected static final int z = 0x3366BB;
    protected static final int A = 7107012;
    protected static final int C = 8226750;
    protected static final int D = 0xFFFFA0;
    protected static final String E = "https://www.minecraft.net/realms/adventure-maps-in-1-9";
    protected static final int F = 8;
    private final List<gal> a = Lists.newArrayList();

    public gan(sw $$0) {
        super($$0);
    }

    protected static int h(int $$0) {
        return 40 + $$0 * 13;
    }

    protected gal a(gal $$0) {
        this.a.add($$0);
        return this.a($$0);
    }

    public sw l() {
        return sv.a(this.a.stream().map(gal::a).collect(Collectors.toList()));
    }
}

