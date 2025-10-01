/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface lp {
    public static final acq a = new acq("recipes/root");

    public lp a(String var1, am var2);

    public lp a(@Nullable String var1);

    public cfu a();

    public void a(Consumer<lo> var1, acq var2);

    default public void a(Consumer<lo> $$0) {
        this.a($$0, lp.a(this.a()));
    }

    default public void a(Consumer<lo> $$0, String $$1) {
        acq $$3 = new acq($$1);
        acq $$2 = lp.a(this.a());
        if ($$3.equals($$2)) {
            throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
        }
        this.a($$0, $$3);
    }

    public static acq a(cml $$0) {
        return jb.i.b($$0.k());
    }
}

