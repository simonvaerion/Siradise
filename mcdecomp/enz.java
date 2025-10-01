/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.mutable.MutableFloat
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.apache.commons.lang3.mutable.MutableObject
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableObject;

public class enz {
    final f a;

    public enz(f $$0) {
        this.a = $$0;
    }

    public float a(@Nullable String $$0) {
        if ($$0 == null) {
            return 0.0f;
        }
        MutableFloat $$12 = new MutableFloat();
        apq.c($$0, ts.a, ($$1, $$2, $$3) -> {
            $$12.add(this.a.getWidth($$3, $$2));
            return true;
        });
        return $$12.floatValue();
    }

    public float a(ta $$0) {
        MutableFloat $$12 = new MutableFloat();
        apq.a($$0, ts.a, (int $$1, ts $$2, int $$3) -> {
            $$12.add(this.a.getWidth($$3, $$2));
            return true;
        });
        return $$12.floatValue();
    }

    public float a(aom $$0) {
        MutableFloat $$12 = new MutableFloat();
        $$0.accept(($$1, $$2, $$3) -> {
            $$12.add(this.a.getWidth($$3, $$2));
            return true;
        });
        return $$12.floatValue();
    }

    public int a(String $$0, int $$1, ts $$2) {
        e $$3 = new e($$1);
        apq.a($$0, $$2, (aon)$$3);
        return $$3.a();
    }

    public String b(String $$0, int $$1, ts $$2) {
        return $$0.substring(0, this.a($$0, $$1, $$2));
    }

    public String c(String $$0, int $$1, ts $$2) {
        MutableFloat $$32 = new MutableFloat();
        MutableInt $$42 = new MutableInt($$0.length());
        apq.b($$0, $$2, ($$3, $$4, $$5) -> {
            float $$6 = $$32.addAndGet(this.a.getWidth($$5, $$4));
            if ($$6 > (float)$$1) {
                return false;
            }
            $$42.setValue($$3);
            return true;
        });
        return $$0.substring($$42.intValue());
    }

    public int d(String $$0, int $$1, ts $$2) {
        e $$3 = new e($$1);
        apq.c($$0, $$2, $$3);
        return $$3.a();
    }

    @Nullable
    public ts a(ta $$0, int $$12) {
        e $$22 = new e($$12);
        return $$0.a((ts $$1, String $$2) -> apq.c($$2, $$1, $$22) ? Optional.empty() : Optional.of($$1), ts.a).orElse(null);
    }

    @Nullable
    public ts a(aom $$0, int $$1) {
        e $$22 = new e($$1);
        MutableObject $$32 = new MutableObject();
        $$0.accept(($$2, $$3, $$4) -> {
            if (!$$22.accept($$2, $$3, $$4)) {
                $$32.setValue((Object)$$3);
                return false;
            }
            return true;
        });
        return (ts)$$32.getValue();
    }

    public String e(String $$0, int $$1, ts $$2) {
        return $$0.substring(0, this.d($$0, $$1, $$2));
    }

    public ta a(ta $$0, int $$1, ts $$2) {
        final e $$3 = new e($$1);
        return $$0.a(new ta.b<ta>(){
            private final end c = new end();

            @Override
            public Optional<ta> accept(ts $$0, String $$1) {
                $$3.b();
                if (!apq.c($$1, $$0, $$3)) {
                    String $$2 = $$1.substring(0, $$3.a());
                    if (!$$2.isEmpty()) {
                        this.c.a(ta.a($$2, $$0));
                    }
                    return Optional.of(this.c.b());
                }
                if (!$$1.isEmpty()) {
                    this.c.a(ta.a($$1, $$0));
                }
                return Optional.empty();
            }
        }, $$2).orElse($$0);
    }

    public int f(String $$0, int $$1, ts $$2) {
        b $$3 = new b($$1);
        apq.c($$0, $$2, $$3);
        return $$3.a();
    }

    public static int a(String $$0, int $$1, int $$2, boolean $$3) {
        int $$4 = $$2;
        boolean $$5 = $$1 < 0;
        int $$6 = Math.abs($$1);
        for (int $$7 = 0; $$7 < $$6; ++$$7) {
            if ($$5) {
                while ($$3 && $$4 > 0 && ($$0.charAt($$4 - 1) == ' ' || $$0.charAt($$4 - 1) == '\n')) {
                    --$$4;
                }
                while ($$4 > 0 && $$0.charAt($$4 - 1) != ' ' && $$0.charAt($$4 - 1) != '\n') {
                    --$$4;
                }
                continue;
            }
            int $$8 = $$0.length();
            int $$9 = $$0.indexOf(32, $$4);
            int $$10 = $$0.indexOf(10, $$4);
            $$4 = $$9 == -1 && $$10 == -1 ? -1 : ($$9 != -1 && $$10 != -1 ? Math.min($$9, $$10) : ($$9 != -1 ? $$9 : $$10));
            if ($$4 == -1) {
                $$4 = $$8;
                continue;
            }
            while ($$3 && $$4 < $$8 && ($$0.charAt($$4) == ' ' || $$0.charAt($$4) == '\n')) {
                ++$$4;
            }
        }
        return $$4;
    }

    public void a(String $$0, int $$1, ts $$2, boolean $$3, d $$4) {
        int $$5 = 0;
        int $$6 = $$0.length();
        ts $$7 = $$2;
        while ($$5 < $$6) {
            b $$8 = new b($$1);
            boolean $$9 = apq.a($$0, $$5, $$7, $$2, $$8);
            if ($$9) {
                $$4.accept($$7, $$5, $$6);
                break;
            }
            int $$10 = $$8.a();
            char $$11 = $$0.charAt($$10);
            int $$12 = $$11 == '\n' || $$11 == ' ' ? $$10 + 1 : $$10;
            $$4.accept($$7, $$5, $$3 ? $$12 : $$10);
            $$5 = $$12;
            $$7 = $$8.b();
        }
    }

    public List<ta> g(String $$0, int $$1, ts $$22) {
        ArrayList $$32 = Lists.newArrayList();
        this.a($$0, $$1, $$22, false, ($$2, $$3, $$4) -> $$32.add(ta.a($$0.substring($$3, $$4), $$2)));
        return $$32;
    }

    public List<ta> b(ta $$0, int $$12, ts $$22) {
        ArrayList $$3 = Lists.newArrayList();
        this.a($$0, $$12, $$22, (ta $$1, Boolean $$2) -> $$3.add($$1));
        return $$3;
    }

    public List<ta> a(ta $$0, int $$1, ts $$22, ta $$32) {
        ArrayList $$4 = Lists.newArrayList();
        this.a($$0, $$1, $$22, (ta $$2, Boolean $$3) -> $$4.add($$3 != false ? ta.a($$32, $$2) : $$2));
        return $$4;
    }

    public void a(ta $$0, int $$12, ts $$22, BiConsumer<ta, Boolean> $$3) {
        ArrayList $$4 = Lists.newArrayList();
        $$0.a((ts $$1, String $$2) -> {
            if (!$$2.isEmpty()) {
                $$4.add(new c($$2, $$1));
            }
            return Optional.empty();
        }, $$22);
        a $$5 = new a($$4);
        boolean $$6 = true;
        boolean $$7 = false;
        boolean $$8 = false;
        block0: while ($$6) {
            $$6 = false;
            b $$9 = new b($$12);
            for (c $$10 : $$5.a) {
                boolean $$11 = apq.a($$10.c, 0, $$10.d, $$22, $$9);
                if (!$$11) {
                    int $$122 = $$9.a();
                    ts $$13 = $$9.b();
                    char $$14 = $$5.a($$122);
                    boolean $$15 = $$14 == '\n';
                    boolean $$16 = $$15 || $$14 == ' ';
                    $$7 = $$15;
                    ta $$17 = $$5.a($$122, $$16 ? 1 : 0, $$13);
                    $$3.accept($$17, $$8);
                    $$8 = !$$15;
                    $$6 = true;
                    continue block0;
                }
                $$9.a($$10.c.length());
            }
        }
        ta $$18 = $$5.a();
        if ($$18 != null) {
            $$3.accept($$18, $$8);
        } else if ($$7) {
            $$3.accept(ta.b, false);
        }
    }

    @FunctionalInterface
    public static interface f {
        public float getWidth(int var1, ts var2);
    }

    class e
    implements aon {
        private float b;
        private int c;

        public e(float $$0) {
            this.b = $$0;
        }

        @Override
        public boolean accept(int $$0, ts $$1, int $$2) {
            this.b -= enz.this.a.getWidth($$2, $$1);
            if (this.b >= 0.0f) {
                this.c = $$0 + Character.charCount($$2);
                return true;
            }
            return false;
        }

        public int a() {
            return this.c;
        }

        public void b() {
            this.c = 0;
        }
    }

    class b
    implements aon {
        private final float b;
        private int c = -1;
        private ts d = ts.a;
        private boolean e;
        private float f;
        private int g = -1;
        private ts h = ts.a;
        private int i;
        private int j;

        public b(float $$0) {
            this.b = Math.max($$0, 1.0f);
        }

        @Override
        public boolean accept(int $$0, ts $$1, int $$2) {
            int $$3 = $$0 + this.j;
            switch ($$2) {
                case 10: {
                    return this.a($$3, $$1);
                }
                case 32: {
                    this.g = $$3;
                    this.h = $$1;
                }
            }
            float $$4 = enz.this.a.getWidth($$2, $$1);
            this.f += $$4;
            if (this.e && this.f > this.b) {
                if (this.g != -1) {
                    return this.a(this.g, this.h);
                }
                return this.a($$3, $$1);
            }
            this.e |= $$4 != 0.0f;
            this.i = $$3 + Character.charCount($$2);
            return true;
        }

        private boolean a(int $$0, ts $$1) {
            this.c = $$0;
            this.d = $$1;
            return false;
        }

        private boolean c() {
            return this.c != -1;
        }

        public int a() {
            return this.c() ? this.c : this.i;
        }

        public ts b() {
            return this.d;
        }

        public void a(int $$0) {
            this.j += $$0;
        }
    }

    @FunctionalInterface
    public static interface d {
        public void accept(ts var1, int var2, int var3);
    }

    static class a {
        final List<c> a;
        private String b;

        public a(List<c> $$02) {
            this.a = $$02;
            this.b = $$02.stream().map($$0 -> $$0.c).collect(Collectors.joining());
        }

        public char a(int $$0) {
            return this.b.charAt($$0);
        }

        public ta a(int $$0, int $$1, ts $$2) {
            end $$3 = new end();
            ListIterator<c> $$4 = this.a.listIterator();
            int $$5 = $$0;
            boolean $$6 = false;
            while ($$4.hasNext()) {
                c $$7 = $$4.next();
                String $$8 = $$7.c;
                int $$9 = $$8.length();
                if (!$$6) {
                    if ($$5 > $$9) {
                        $$3.a($$7);
                        $$4.remove();
                        $$5 -= $$9;
                    } else {
                        String $$10 = $$8.substring(0, $$5);
                        if (!$$10.isEmpty()) {
                            $$3.a(ta.a($$10, $$7.d));
                        }
                        $$5 += $$1;
                        $$6 = true;
                    }
                }
                if (!$$6) continue;
                if ($$5 > $$9) {
                    $$4.remove();
                    $$5 -= $$9;
                    continue;
                }
                String $$11 = $$8.substring($$5);
                if ($$11.isEmpty()) {
                    $$4.remove();
                    break;
                }
                $$4.set(new c($$11, $$2));
                break;
            }
            this.b = this.b.substring($$0 + $$1);
            return $$3.b();
        }

        @Nullable
        public ta a() {
            end $$0 = new end();
            this.a.forEach($$0::a);
            this.a.clear();
            return $$0.a();
        }
    }

    static class c
    implements ta {
        final String c;
        final ts d;

        public c(String $$0, ts $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public <T> Optional<T> a(ta.a<T> $$0) {
            return $$0.accept(this.c);
        }

        @Override
        public <T> Optional<T> a(ta.b<T> $$0, ts $$1) {
            return $$0.accept(this.d.a($$1), this.c);
        }
    }
}

