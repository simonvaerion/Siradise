/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Stack
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import it.unimi.dsi.fastutil.Stack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.function.Predicate;

public class adl {
    private static final int a = 2;

    private static b a(ae $$0, boolean $$1) {
        an $$2 = $$0.d();
        if ($$2 == null) {
            return b.b;
        }
        if ($$1) {
            return b.a;
        }
        if ($$2.j()) {
            return b.b;
        }
        return b.c;
    }

    private static boolean a(Stack<b> $$0) {
        for (int $$1 = 0; $$1 <= 2; ++$$1) {
            b $$2 = (b)((Object)$$0.peek($$1));
            if ($$2 == b.a) {
                return true;
            }
            if ($$2 != b.b) continue;
            return false;
        }
        return false;
    }

    private static boolean a(ae $$0, Stack<b> $$1, Predicate<ae> $$2, a $$3) {
        boolean $$4 = $$2.test($$0);
        b $$5 = adl.a($$0, $$4);
        boolean $$6 = $$4;
        $$1.push((Object)$$5);
        for (ae $$7 : $$0.g()) {
            $$6 |= adl.a($$7, $$1, $$2, $$3);
        }
        boolean $$8 = $$6 || adl.a($$1);
        $$1.pop();
        $$3.accept($$0, $$8);
        return $$6;
    }

    public static void a(ae $$0, Predicate<ae> $$1, a $$2) {
        ae $$3 = $$0.c();
        ObjectArrayList $$4 = new ObjectArrayList();
        for (int $$5 = 0; $$5 <= 2; ++$$5) {
            $$4.push((Object)b.c);
        }
        adl.a($$3, (Stack<b>)$$4, $$1, $$2);
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = adl$b.a();
        }
    }

    @FunctionalInterface
    public static interface a {
        public void accept(ae var1, boolean var2);
    }
}

