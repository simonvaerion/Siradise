/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class eyn {
    private final ffh a;
    private final ffp b;
    private final Predicate<ffk.a> c;
    @Nullable
    private tq d = null;
    private int e;
    private int f;
    @Nullable
    private tl g;

    public eyn(ffs $$0, Predicate<ffk.a> $$1) {
        this.a = $$0.b();
        this.b = new ffp($$0.a().b().leadingContextMessageCount());
        this.c = $$1;
        this.e = this.a.b();
    }

    public void a(int $$0, a $$1) {
        ffj $$3;
        int $$2 = 0;
        while ($$2 < $$0 && ($$3 = this.a.b(this.e)) != null) {
            ffk.a $$5;
            int $$4 = this.e--;
            if (!($$3 instanceof ffk.a) || ($$5 = (ffk.a)$$3).g().equals(this.g)) continue;
            if (this.a($$1, $$5)) {
                if (this.f > 0) {
                    $$1.a(sw.a("gui.chatSelection.fold", this.f));
                    this.f = 0;
                }
                $$1.a($$4, $$5);
                ++$$2;
            } else {
                ++this.f;
            }
            this.g = $$5.g();
        }
    }

    private boolean a(a $$0, ffk.a $$1) {
        tl $$2 = $$1.g();
        boolean $$3 = this.b.b($$2);
        if (this.c.test($$1)) {
            this.b.a($$2);
            if (this.d != null && !this.d.a($$2.j())) {
                $$0.a(sw.a("gui.chatSelection.join", new Object[]{$$1.f().getName()}).a(n.o));
            }
            this.d = $$2.j();
            return true;
        }
        return $$3;
    }

    public static interface a {
        public void a(int var1, ffk.a var2);

        public void a(sw var1);
    }
}

