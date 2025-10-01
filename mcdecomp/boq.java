/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class boq<T extends bfz>
extends boo<T> {
    private static final int i = 200;
    private int j = 0;

    public boq(bzw $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<bfz> $$3) {
        super($$0, $$1, 500, $$2, false, $$3);
    }

    public int i() {
        return this.j;
    }

    public void k() {
        --this.j;
    }

    @Override
    public boolean a() {
        if (this.j > 0 || !this.e.ec().h()) {
            return false;
        }
        if (!((bzw)this.e).gn()) {
            return false;
        }
        this.h();
        return this.c != null;
    }

    @Override
    public void c() {
        this.j = boq.b(200);
        super.c();
    }
}

