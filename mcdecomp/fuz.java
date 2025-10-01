/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface fuz {
    public static final acj a = new acj("textures", ".png");

    public void a(akx var1, a var2);

    public fva a();

    public static interface b
    extends Supplier<fup> {
        default public void a() {
        }
    }

    public static interface a {
        default public void a(acq $$0, akv $$1) {
            this.a($$0, () -> fuq.a($$0, $$1));
        }

        public void a(acq var1, b var2);

        public void a(Predicate<acq> var1);
    }
}

