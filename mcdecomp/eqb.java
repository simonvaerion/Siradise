/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;

public class eqb {
    public static final int a = Integer.MAX_VALUE;
    private static final int b = 2;
    private final eov c;
    private final List<a> d = Lists.newArrayList();
    private String e;
    private int f;
    private int g;
    private boolean h;
    private int i = Integer.MAX_VALUE;
    private final int j;
    private Consumer<String> k = $$0 -> {};
    private Runnable l = () -> {};

    public eqb(eov $$02, int $$1) {
        this.c = $$02;
        this.j = $$1;
        this.a("");
    }

    public int a() {
        return this.i;
    }

    public void a(int $$0) {
        if ($$0 < 0) {
            throw new IllegalArgumentException("Character limit cannot be negative");
        }
        this.i = $$0;
    }

    public boolean b() {
        return this.i != Integer.MAX_VALUE;
    }

    public void a(Consumer<String> $$0) {
        this.k = $$0;
    }

    public void a(Runnable $$0) {
        this.l = $$0;
    }

    public void a(String $$0) {
        this.e = this.c($$0);
        this.g = this.f = this.e.length();
        this.n();
    }

    public String c() {
        return this.e;
    }

    public void b(String $$0) {
        if ($$0.isEmpty() && !this.i()) {
            return;
        }
        String $$1 = this.d(aa.a($$0, true));
        a $$2 = this.e();
        this.e = new StringBuilder(this.e).replace($$2.a, $$2.b, $$1).toString();
        this.g = this.f = $$2.a + $$1.length();
        this.n();
    }

    public void b(int $$0) {
        if (!this.i()) {
            this.g = apa.a(this.f + $$0, 0, this.e.length());
        }
        this.b("");
    }

    public int d() {
        return this.f;
    }

    public void a(boolean $$0) {
        this.h = $$0;
    }

    public a e() {
        return new a(Math.min(this.g, this.f), Math.max(this.g, this.f));
    }

    public int f() {
        return this.d.size();
    }

    public int g() {
        for (int $$0 = 0; $$0 < this.d.size(); ++$$0) {
            a $$1 = this.d.get($$0);
            if (this.f < $$1.a || this.f > $$1.b) continue;
            return $$0;
        }
        return -1;
    }

    public a c(int $$0) {
        return this.d.get(apa.a($$0, 0, this.d.size() - 1));
    }

    public void a(eqq $$0, int $$1) {
        switch ($$0) {
            case a: {
                this.f = $$1;
                break;
            }
            case b: {
                this.f += $$1;
                break;
            }
            case c: {
                this.f = this.e.length() + $$1;
            }
        }
        this.f = apa.a(this.f, 0, this.e.length());
        this.l.run();
        if (!this.h) {
            this.g = this.f;
        }
    }

    public void d(int $$0) {
        if ($$0 == 0) {
            return;
        }
        int $$1 = this.c.b(this.e.substring(this.m().a, this.f)) + 2;
        a $$2 = this.f($$0);
        int $$3 = this.c.a(this.e.substring($$2.a, $$2.b), $$1).length();
        this.a(eqq.a, $$2.a + $$3);
    }

    public void a(double $$0, double $$1) {
        int $$2 = apa.a($$0);
        int $$3 = apa.a($$1 / (double)this.c.b);
        a $$4 = this.d.get(apa.a($$3, 0, this.d.size() - 1));
        int $$5 = this.c.a(this.e.substring($$4.a, $$4.b), $$2).length();
        this.a(eqq.a, $$4.a + $$5);
    }

    public boolean e(int $$0) {
        this.h = euq.q();
        if (euq.g($$0)) {
            this.f = this.e.length();
            this.g = 0;
            return true;
        }
        if (euq.f($$0)) {
            enn.N().o.a(this.j());
            return true;
        }
        if (euq.e($$0)) {
            this.b(enn.N().o.a());
            return true;
        }
        if (euq.d($$0)) {
            enn.N().o.a(this.j());
            this.b("");
            return true;
        }
        switch ($$0) {
            case 263: {
                if (euq.p()) {
                    a $$1 = this.k();
                    this.a(eqq.a, $$1.a);
                } else {
                    this.a(eqq.b, -1);
                }
                return true;
            }
            case 262: {
                if (euq.p()) {
                    a $$2 = this.l();
                    this.a(eqq.a, $$2.a);
                } else {
                    this.a(eqq.b, 1);
                }
                return true;
            }
            case 265: {
                if (!euq.p()) {
                    this.d(-1);
                }
                return true;
            }
            case 264: {
                if (!euq.p()) {
                    this.d(1);
                }
                return true;
            }
            case 266: {
                this.a(eqq.a, 0);
                return true;
            }
            case 267: {
                this.a(eqq.c, 0);
                return true;
            }
            case 268: {
                if (euq.p()) {
                    this.a(eqq.a, 0);
                } else {
                    this.a(eqq.a, this.m().a);
                }
                return true;
            }
            case 269: {
                if (euq.p()) {
                    this.a(eqq.c, 0);
                } else {
                    this.a(eqq.a, this.m().b);
                }
                return true;
            }
            case 259: {
                if (euq.p()) {
                    a $$3 = this.k();
                    this.b($$3.a - this.f);
                } else {
                    this.b(-1);
                }
                return true;
            }
            case 261: {
                if (euq.p()) {
                    a $$4 = this.l();
                    this.b($$4.a - this.f);
                } else {
                    this.b(1);
                }
                return true;
            }
            case 257: 
            case 335: {
                this.b("\n");
                return true;
            }
        }
        return false;
    }

    public Iterable<a> h() {
        return this.d;
    }

    public boolean i() {
        return this.g != this.f;
    }

    @VisibleForTesting
    public String j() {
        a $$0 = this.e();
        return this.e.substring($$0.a, $$0.b);
    }

    private a m() {
        return this.f(0);
    }

    private a f(int $$0) {
        int $$1 = this.g();
        if ($$1 < 0) {
            throw new IllegalStateException("Cursor is not within text (cursor = " + this.f + ", length = " + this.e.length() + ")");
        }
        return this.d.get(apa.a($$1 + $$0, 0, this.d.size() - 1));
    }

    @VisibleForTesting
    public a k() {
        int $$0;
        if (this.e.isEmpty()) {
            return eqb$a.c;
        }
        for ($$0 = apa.a(this.f, 0, this.e.length() - 1); $$0 > 0 && Character.isWhitespace(this.e.charAt($$0 - 1)); --$$0) {
        }
        while ($$0 > 0 && !Character.isWhitespace(this.e.charAt($$0 - 1))) {
            --$$0;
        }
        return new a($$0, this.g($$0));
    }

    @VisibleForTesting
    public a l() {
        int $$0;
        if (this.e.isEmpty()) {
            return eqb$a.c;
        }
        for ($$0 = apa.a(this.f, 0, this.e.length() - 1); $$0 < this.e.length() && !Character.isWhitespace(this.e.charAt($$0)); ++$$0) {
        }
        while ($$0 < this.e.length() && Character.isWhitespace(this.e.charAt($$0))) {
            ++$$0;
        }
        return new a($$0, this.g($$0));
    }

    private int g(int $$0) {
        int $$1;
        for ($$1 = $$0; $$1 < this.e.length() && !Character.isWhitespace(this.e.charAt($$1)); ++$$1) {
        }
        return $$1;
    }

    private void n() {
        this.o();
        this.k.accept(this.e);
        this.l.run();
    }

    private void o() {
        this.d.clear();
        if (this.e.isEmpty()) {
            this.d.add(eqb$a.c);
            return;
        }
        this.c.b().a(this.e, this.j, ts.a, false, ($$0, $$1, $$2) -> this.d.add(new a($$1, $$2)));
        if (this.e.charAt(this.e.length() - 1) == '\n') {
            this.d.add(new a(this.e.length(), this.e.length()));
        }
    }

    private String c(String $$0) {
        if (this.b()) {
            return aps.a($$0, this.i, false);
        }
        return $$0;
    }

    private String d(String $$0) {
        if (this.b()) {
            int $$1 = this.i - this.e.length();
            return aps.a($$0, $$1, false);
        }
        return $$0;
    }

    protected static final class a
    extends Record {
        final int a;
        final int b;
        static final a c = new a(0, 0);

        protected a(int $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "beginIndex;endIndex", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "beginIndex;endIndex", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "beginIndex;endIndex", "a", "b"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }
}

