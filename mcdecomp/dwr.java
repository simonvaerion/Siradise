/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public interface dwr
extends dww {
    @Nullable
    public ded a(hx var1);

    public int b(gu var1);

    public static final class a
    extends Enum<a>
    implements dwr {
        public static final /* enum */ a a = new a();
        private static final /* synthetic */ a[] b;

        public static a[] values() {
            return (a[])b.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        @Override
        @Nullable
        public ded a(hx $$0) {
            return null;
        }

        @Override
        public int b(gu $$0) {
            return 0;
        }

        @Override
        public void a(gu $$0) {
        }

        @Override
        public boolean E_() {
            return false;
        }

        @Override
        public int a() {
            return 0;
        }

        @Override
        public void a(hx $$0, boolean $$1) {
        }

        @Override
        public void a(clt $$0, boolean $$1) {
        }

        @Override
        public void b(clt $$0) {
        }

        private static /* synthetic */ a[] c() {
            return new a[]{a};
        }

        static {
            b = dwr$a.c();
        }
    }
}

