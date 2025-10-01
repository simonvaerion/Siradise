/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

@FunctionalInterface
public interface flh {
    public static final flh b = $$02 -> $$0 -> true;
    public static final flh c = $$02 -> $$0 -> false;

    public Predicate<dcb> getPredicate(dcc<cpn, dcb> var1);
}

