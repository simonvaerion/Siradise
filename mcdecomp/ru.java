/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;

public final class ru
extends Record {
    private final int a;
    private final Map<String, rm<?>> b;
    private final Map<String, ru> c;

    private ru(int $$0) {
        this($$0, new HashMap(), new HashMap<String, ru>());
    }

    public ru(int $$0, Map<String, rm<?>> $$1, Map<String, ru> $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public static ru a() {
        return new ru(1);
    }

    public void a(rt $$02) {
        if (this.a <= $$02.a().size()) {
            this.c.computeIfAbsent($$02.a().get(this.a - 1), $$0 -> new ru(this.a + 1)).a($$02);
        } else {
            this.b.put($$02.c(), $$02.b());
        }
    }

    public boolean a(rm<?> $$0, String $$1) {
        return $$0.equals(this.c().get($$1));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ru.class, "depth;selectedFields;fieldsToRecurse", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ru.class, "depth;selectedFields;fieldsToRecurse", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ru.class, "depth;selectedFields;fieldsToRecurse", "a", "b", "c"}, this, $$0);
    }

    public int b() {
        return this.a;
    }

    public Map<String, rm<?>> c() {
        return this.b;
    }

    public Map<String, ru> d() {
        return this.c;
    }
}

