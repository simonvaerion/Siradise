/*
 * Decompiled with CFR 0.152.
 */
public interface eem {
    public static final eem a = ($$0, $$1) -> false;
    public static final eem b = ($$0, $$1) -> !$$0 && !$$1;
    public static final eem c = ($$0, $$1) -> $$1 && !$$0;
    public static final eem d = ($$0, $$1) -> !$$0;
    public static final eem e = ($$0, $$1) -> $$0 && !$$1;
    public static final eem f = ($$0, $$1) -> !$$1;
    public static final eem g = ($$0, $$1) -> $$0 != $$1;
    public static final eem h = ($$0, $$1) -> !$$0 || !$$1;
    public static final eem i = ($$0, $$1) -> $$0 && $$1;
    public static final eem j = ($$0, $$1) -> $$0 == $$1;
    public static final eem k = ($$0, $$1) -> $$1;
    public static final eem l = ($$0, $$1) -> !$$0 || $$1;
    public static final eem m = ($$0, $$1) -> $$0;
    public static final eem n = ($$0, $$1) -> $$0 || !$$1;
    public static final eem o = ($$0, $$1) -> $$0 || $$1;
    public static final eem p = ($$0, $$1) -> true;

    public boolean apply(boolean var1, boolean var2);
}

