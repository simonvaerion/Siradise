/*
 * Decompiled with CFR 0.152.
 */
public class dxf {
    public static final dxd a = dxf.a("empty", new dxb());
    public static final dxc b = dxf.a("flowing_water", new dxk.a());
    public static final dxc c = dxf.a("water", new dxk.b());
    public static final dxc d = dxf.a("flowing_lava", new dxh.a());
    public static final dxc e = dxf.a("lava", new dxh.b());

    private static <T extends dxd> T a(String $$0, T $$1) {
        return (T)hr.a(jb.d, $$0, $$1);
    }

    static {
        for (dxd $$0 : jb.d) {
            for (dxe $$1 : $$0.f().a()) {
                dxd.c.b($$1);
            }
        }
    }
}

