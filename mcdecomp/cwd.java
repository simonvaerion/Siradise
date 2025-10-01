/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Collection;
import javax.annotation.Nullable;

public interface cwd {
    public static final cwd t_ = new cwd(){

        @Override
        public boolean a(cmn $$0, gu $$1, dcb $$2, @Nullable Collection<ha> $$3, boolean $$4) {
            if ($$3 == null) {
                return ((cwj)cpo.qG).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
            }
            if (!$$3.isEmpty()) {
                if ($$2.i() || $$2.u().b(dxf.c)) {
                    return cwj.a($$0, $$1, $$2, $$3);
                }
                return false;
            }
            return cwd.super.a($$0, $$1, $$2, $$3, $$4);
        }

        @Override
        public int a(cwi.a $$0, cmn $$1, gu $$2, apf $$3, cwi $$4, boolean $$5) {
            return $$0.c() > 0 ? $$0.b() : 0;
        }

        @Override
        public int i_(int $$0) {
            return Math.max($$0 - 1, 0);
        }
    };

    default public byte a() {
        return 1;
    }

    default public void a(cmn $$0, dcb $$1, gu $$2, apf $$3) {
    }

    default public boolean a(cmn $$0, gu $$1, apf $$2) {
        return false;
    }

    default public boolean a(cmn $$0, gu $$1, dcb $$2, @Nullable Collection<ha> $$3, boolean $$4) {
        return ((cul)cpo.qG).b().a($$2, $$0, $$1, $$4) > 0L;
    }

    default public boolean c() {
        return true;
    }

    default public int i_(int $$0) {
        return 1;
    }

    public int a(cwi.a var1, cmn var2, gu var3, apf var4, cwi var5, boolean var6);
}

