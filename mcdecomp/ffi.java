/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public final class ffi
extends Enum<ffi>
implements apr {
    public static final /* enum */ ffi a = new ffi("secure");
    public static final /* enum */ ffi b = new ffi("modified");
    public static final /* enum */ ffi c = new ffi("not_secure");
    public static final Codec<ffi> d;
    private final String e;
    private static final /* synthetic */ ffi[] f;

    public static ffi[] values() {
        return (ffi[])f.clone();
    }

    public static ffi valueOf(String $$0) {
        return Enum.valueOf(ffi.class, $$0);
    }

    private ffi(String $$0) {
        this.e = $$0;
    }

    public static ffi a(tl $$0, sw $$1, Instant $$2) {
        if (!$$0.h() || $$0.b($$2)) {
            return c;
        }
        if (ffi.a($$0, $$1)) {
            return b;
        }
        return a;
    }

    private static boolean a(tl $$0, sw $$1) {
        if (!$$1.getString().contains($$0.b())) {
            return true;
        }
        sw $$2 = $$0.m();
        if ($$2 == null) {
            return false;
        }
        return ffi.a($$2);
    }

    private static boolean a(sw $$02) {
        return $$02.a(($$0, $$1) -> {
            if (ffi.a($$0)) {
                return Optional.of(true);
            }
            return Optional.empty();
        }, ts.a).orElse(false);
    }

    private static boolean a(ts $$0) {
        return !$$0.k().equals(ts.c);
    }

    public boolean a() {
        return this == c;
    }

    @Nullable
    public eni a(tl $$0) {
        return switch (this) {
            case b -> eni.a($$0.b());
            case c -> eni.c();
            default -> null;
        };
    }

    @Override
    public String c() {
        return this.e;
    }

    private static /* synthetic */ ffi[] b() {
        return new ffi[]{a, b, c};
    }

    static {
        f = ffi.b();
        d = apr.a(ffi::values);
    }
}

