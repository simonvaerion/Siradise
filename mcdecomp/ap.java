/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

public interface ap {
    public static final ap a = $$0 -> {
        String[][] $$1 = new String[$$0.size()][];
        int $$2 = 0;
        for (String $$3 : $$0) {
            $$1[$$2++] = new String[]{$$3};
        }
        return $$1;
    };
    public static final ap b = $$0 -> new String[][]{$$0.toArray(new String[0])};

    public String[][] createRequirements(Collection<String> var1);
}

