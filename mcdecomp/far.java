/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList$Builder
 */
import com.google.common.collect.ImmutableList;

public class far
extends fan {
    private static final String a = "chest_bottom";
    private static final String b = "chest_lid";
    private static final String f = "chest_lock";

    public far(fee $$0) {
        super($$0);
    }

    @Override
    protected ImmutableList.Builder<fee> a(fee $$0) {
        ImmutableList.Builder<fee> $$1 = super.a($$0);
        $$1.add((Object)$$0.b(a));
        $$1.add((Object)$$0.b(b));
        $$1.add((Object)$$0.b(f));
        return $$1;
    }

    public static fek e() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fan.a($$1);
        $$1.a(a, fej.c().a(0, 76).a(0.0f, 0.0f, 0.0f, 12.0f, 8.0f, 12.0f), feg.a(-2.0f, -5.0f, -6.0f, 0.0f, -1.5707964f, 0.0f));
        $$1.a(b, fej.c().a(0, 59).a(0.0f, 0.0f, 0.0f, 12.0f, 4.0f, 12.0f), feg.a(-2.0f, -9.0f, -6.0f, 0.0f, -1.5707964f, 0.0f));
        $$1.a(f, fej.c().a(0, 59).a(0.0f, 0.0f, 0.0f, 2.0f, 4.0f, 1.0f), feg.a(-1.0f, -6.0f, -1.0f, 0.0f, -1.5707964f, 0.0f));
        return fek.a($$0, 128, 128);
    }
}

