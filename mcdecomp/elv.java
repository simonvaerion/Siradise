/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class elv {
    public final int a;
    @Nullable
    public final String b;

    elv(int $$0, String $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public static class a {
        private int a = -1;
        private String b;

        public a a(int $$0) {
            this.a = $$0;
            return this;
        }

        public a a(@Nullable String $$0) {
            this.b = $$0;
            return this;
        }

        public elv a() {
            return new elv(this.a, this.b);
        }
    }
}

