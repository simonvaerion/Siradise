/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Optional;
import java.util.function.IntConsumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ade {
    private static final sw a = sw.c("commands.debug.function.noRecursion");
    private static final acq b = new acq("tick");
    private static final acq c = new acq("load");
    final MinecraftServer d;
    @Nullable
    private a e;
    private List<dn> f = ImmutableList.of();
    private boolean g;
    private add h;

    public ade(MinecraftServer $$0, add $$1) {
        this.d = $$0;
        this.h = $$1;
        this.b($$1);
    }

    public int a() {
        return this.d.aI().c(cmi.w);
    }

    public CommandDispatcher<ds> b() {
        return this.d.aC().a();
    }

    public void c() {
        if (this.g) {
            this.g = false;
            Collection<dn> $$0 = this.h.b(c);
            this.a($$0, c);
        }
        this.a(this.f, b);
    }

    private void a(Collection<dn> $$0, acq $$1) {
        this.d.aN().a($$1::toString);
        for (dn $$2 : $$0) {
            this.a($$2, this.d());
        }
        this.d.aN().c();
    }

    public int a(dn $$0, ds $$1) {
        return this.a($$0, $$1, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int a(dn $$0, ds $$1, @Nullable c $$2) {
        if (this.e != null) {
            if ($$2 != null) {
                this.e.a(a.getString());
                return 0;
            }
            this.e.a($$0, $$1);
            return 0;
        }
        try {
            this.e = new a($$2);
            int n2 = this.e.b($$0, $$1);
            return n2;
        }
        finally {
            this.e = null;
        }
    }

    public void a(add $$0) {
        this.h = $$0;
        this.b($$0);
    }

    private void b(add $$0) {
        this.f = ImmutableList.copyOf($$0.b(b));
        this.g = true;
    }

    public ds d() {
        return this.d.aD().a(2).a();
    }

    public Optional<dn> a(acq $$0) {
        return this.h.a($$0);
    }

    public Collection<dn> b(acq $$0) {
        return this.h.b($$0);
    }

    public Iterable<acq> e() {
        return this.h.a().keySet();
    }

    public Iterable<acq> f() {
        return this.h.b();
    }

    public static interface c {
        public void a(int var1, String var2);

        public void a(int var1, String var2, int var3);

        public void b(int var1, String var2);

        public void a(int var1, acq var2, int var3);
    }

    class ade$a {
        private int b;
        @Nullable
        private final c c;
        private final Deque<b> d = Queues.newArrayDeque();
        private final List<b> e = Lists.newArrayList();
        boolean f = false;

        ade$a(c $$0) {
            this.c = $$0;
        }

        void a(dn $$0, ds $$1) {
            int $$2 = ade.this.a();
            ds $$3 = this.a($$1);
            if (this.d.size() + this.e.size() < $$2) {
                this.e.add(new b($$3, this.b, new dn.d($$0)));
            }
        }

        private ds a(ds $$0) {
            IntConsumer $$1 = $$0.p();
            if ($$1 instanceof a) {
                return $$0;
            }
            return $$0.a(new a($$1));
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        int b(dn $$0, ds $$1) {
            int $$2 = ade.this.a();
            ds $$3 = this.a($$1);
            int $$4 = 0;
            dn.c[] $$5 = $$0.b();
            for (int $$6 = $$5.length - 1; $$6 >= 0; --$$6) {
                this.d.push(new b($$3, 0, $$5[$$6]));
            }
            while (!this.d.isEmpty()) {
                try {
                    b $$7 = this.d.removeFirst();
                    ade.this.d.aN().a($$7::toString);
                    this.b = $$7.b;
                    $$7.a(ade.this, this.d, $$2, this.c);
                    if (this.f) {
                        while (!this.d.isEmpty() && this.d.peek().b >= this.b) {
                            this.d.removeFirst();
                        }
                        this.f = false;
                    } else if (!this.e.isEmpty()) {
                        Lists.reverse(this.e).forEach(this.d::addFirst);
                    }
                    this.e.clear();
                }
                finally {
                    ade.this.d.aN().c();
                }
                if (++$$4 < $$2) continue;
                return $$4;
            }
            return $$4;
        }

        public void a(String $$0) {
            if (this.c != null) {
                this.c.b(this.b, $$0);
            }
        }

        class a
        implements IntConsumer {
            private final IntConsumer b;

            a(IntConsumer $$0) {
                this.b = $$0;
            }

            @Override
            public void accept(int $$0) {
                this.b.accept($$0);
                a.this.f = true;
            }
        }
    }

    public static class b {
        private final ds a;
        final int b;
        private final dn.c c;

        public b(ds $$0, int $$1, dn.c $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public void a(ade $$0, Deque<b> $$1, int $$2, @Nullable c $$3) {
            block4: {
                try {
                    this.c.execute($$0, this.a, $$1, $$2, this.b, $$3);
                }
                catch (CommandSyntaxException $$4) {
                    if ($$3 != null) {
                        $$3.b(this.b, $$4.getRawMessage().getString());
                    }
                }
                catch (Exception $$5) {
                    if ($$3 == null) break block4;
                    $$3.b(this.b, $$5.getMessage());
                }
            }
        }

        public String toString() {
            return this.c.toString();
        }
    }
}

