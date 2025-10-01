/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.Hash;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cga {
    private static final Hash.Strategy<? super cfz> a = new Hash.Strategy<cfz>(){

        public int a(@Nullable cfz $$0) {
            return cga.a($$0);
        }

        public boolean a(@Nullable cfz $$0, @Nullable cfz $$1) {
            return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && cfz.c($$0, $$1);
        }

        public /* synthetic */ boolean equals(@Nullable Object object, @Nullable Object object2) {
            return this.a((cfz)object, (cfz)object2);
        }

        public /* synthetic */ int hashCode(@Nullable Object object) {
            return this.a((cfz)object);
        }
    };

    static int a(@Nullable cfz $$0) {
        if ($$0 != null) {
            qr $$1 = $$0.v();
            int $$2 = 31 + $$0.d().hashCode();
            return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
        }
        return 0;
    }

    public static Set<cfz> a() {
        return new ObjectLinkedOpenCustomHashSet(a);
    }
}

