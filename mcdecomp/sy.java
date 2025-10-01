/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.DataFixUtils
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class sy {
    public static final String a = ", ";
    public static final sw b = sw.b(", ").a(n.h);
    public static final sw c = sw.b(", ");

    public static tj a(tj $$0, ts $$1) {
        if ($$1.g()) {
            return $$0;
        }
        ts $$2 = $$0.a();
        if ($$2.g()) {
            return $$0.b($$1);
        }
        if ($$2.equals($$1)) {
            return $$0;
        }
        return $$0.b($$2.a($$1));
    }

    public static Optional<tj> a(@Nullable ds $$0, Optional<sw> $$1, @Nullable bfj $$2, int $$3) throws CommandSyntaxException {
        return $$1.isPresent() ? Optional.of(sy.a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
    }

    public static tj a(@Nullable ds $$0, sw $$1, @Nullable bfj $$2, int $$3) throws CommandSyntaxException {
        if ($$3 > 100) {
            return $$1.e();
        }
        tj $$4 = $$1.b().a($$0, $$2, $$3 + 1);
        for (sw $$5 : $$1.c()) {
            $$4.b(sy.a($$0, $$5, $$2, $$3 + 1));
        }
        return $$4.c(sy.a($$0, $$1.a(), $$2, $$3));
    }

    private static ts a(@Nullable ds $$0, ts $$1, @Nullable bfj $$2, int $$3) throws CommandSyntaxException {
        sw $$5;
        tb $$4 = $$1.i();
        if ($$4 != null && ($$5 = $$4.a(tb.a.a)) != null) {
            tb $$6 = new tb(tb.a.a, sy.a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
        }
        return $$1;
    }

    public static sw a(GameProfile $$0) {
        if ($$0.getName() != null) {
            return sw.b($$0.getName());
        }
        if ($$0.getId() != null) {
            return sw.b($$0.getId().toString());
        }
        return sw.b("(unknown)");
    }

    public static sw a(Collection<String> $$02) {
        return sy.a($$02, (T $$0) -> sw.b($$0).a(n.k));
    }

    public static <T extends Comparable<T>> sw a(Collection<T> $$0, Function<T, sw> $$1) {
        if ($$0.isEmpty()) {
            return sv.a;
        }
        if ($$0.size() == 1) {
            return $$1.apply((Comparable)$$0.iterator().next());
        }
        ArrayList $$2 = Lists.newArrayList($$0);
        $$2.sort(Comparable::compareTo);
        return sy.b($$2, $$1);
    }

    public static <T> sw b(Collection<? extends T> $$0, Function<T, sw> $$1) {
        return sy.a($$0, b, $$1);
    }

    public static <T> tj a(Collection<? extends T> $$0, Optional<? extends sw> $$1, Function<T, sw> $$2) {
        return sy.a($$0, (sw)DataFixUtils.orElse($$1, (Object)b), $$2);
    }

    public static sw a(Collection<? extends sw> $$0, sw $$1) {
        return sy.a($$0, $$1, Function.identity());
    }

    public static <T> tj a(Collection<? extends T> $$0, sw $$1, Function<T, sw> $$2) {
        if ($$0.isEmpty()) {
            return sw.h();
        }
        if ($$0.size() == 1) {
            return $$2.apply($$0.iterator().next()).e();
        }
        tj $$3 = sw.h();
        boolean $$4 = true;
        for (T $$5 : $$0) {
            if (!$$4) {
                $$3.b($$1);
            }
            $$3.b($$2.apply($$5));
            $$4 = false;
        }
        return $$3;
    }

    public static tj a(sw $$0) {
        return sw.a("chat.square_brackets", $$0);
    }

    public static sw a(Message $$0) {
        if ($$0 instanceof sw) {
            sw $$1 = (sw)$$0;
            return $$1;
        }
        return sw.b($$0.getString());
    }

    public static boolean b(@Nullable sw $$0) {
        sx sx2;
        if ($$0 != null && (sx2 = $$0.b()) instanceof ug) {
            ug $$1 = (ug)sx2;
            String $$2 = $$1.a();
            String $$3 = $$1.b();
            return $$3 != null || qm.a().b($$2);
        }
        return true;
    }

    public static tj a(String $$0) {
        return sy.a(sw.b($$0).a($$1 -> $$1.a(n.k).a(new su(su.a.f, $$0)).a(new tb(tb.a.a, sw.c("chat.copy.click"))).a($$0)));
    }
}

