/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

@FunctionalInterface
public interface tr {
    public static final tr a = $$0 -> !$$0.h();
    public static final tr b = $$0 -> false;

    public boolean updateAndValidate(tl var1);

    public static class a
    implements tr {
        private final apj c;
        @Nullable
        private tl d;
        private boolean e = true;

        public a(apj $$0) {
            this.c = $$0;
        }

        @Override
        private boolean a(tl $$0) {
            if ($$0.equals(this.d)) {
                return true;
            }
            return this.d == null || $$0.j().a(this.d.j());
        }

        @Override
        public boolean updateAndValidate(tl $$0) {
            boolean bl2 = this.e = this.e && $$0.a(this.c) && this.a($$0);
            if (!this.e) {
                return false;
            }
            this.d = $$0;
            return true;
        }
    }
}

