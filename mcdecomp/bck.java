/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;

public class bck {
    private bck() {
    }

    public static int a(List<? extends bcj> $$0) {
        long $$1 = 0L;
        for (bcj bcj2 : $$0) {
            $$1 += (long)bcj2.a().a();
        }
        if ($$1 > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Sum of weights must be <= 2147483647");
        }
        return (int)$$1;
    }

    public static <T extends bcj> Optional<T> a(apf $$0, List<T> $$1, int $$2) {
        if ($$2 < 0) {
            throw ac.b(new IllegalArgumentException("Negative total weight in getRandomItem"));
        }
        if ($$2 == 0) {
            return Optional.empty();
        }
        int $$3 = $$0.a($$2);
        return bck.a($$1, $$3);
    }

    public static <T extends bcj> Optional<T> a(List<T> $$0, int $$1) {
        for (bcj $$2 : $$0) {
            if (($$1 -= $$2.a().a()) >= 0) continue;
            return Optional.of($$2);
        }
        return Optional.empty();
    }

    public static <T extends bcj> Optional<T> a(apf $$0, List<T> $$1) {
        return bck.a($$0, $$1, bck.a($$1));
    }
}

