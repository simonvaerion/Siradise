/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class eio {
    private final ImmutableList<eip> a;
    private final ImmutableMap<String, eip> b;
    private final IntList c = new IntArrayList();
    private final int d;
    @Nullable
    private eim e;

    public eio(ImmutableMap<String, eip> $$0) {
        this.b = $$0;
        this.a = $$0.values().asList();
        int $$1 = 0;
        for (eip $$2 : $$0.values()) {
            this.c.add($$1);
            $$1 += $$2.e();
        }
        this.d = $$1;
    }

    public String toString() {
        return "format: " + this.b.size() + " elements: " + this.b.entrySet().stream().map(Object::toString).collect(Collectors.joining(" "));
    }

    public int a() {
        return this.b() / 4;
    }

    public int b() {
        return this.d;
    }

    public ImmutableList<eip> c() {
        return this.a;
    }

    public ImmutableList<String> d() {
        return this.b.keySet().asList();
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        eio $$1 = (eio)$$0;
        if (this.d != $$1.d) {
            return false;
        }
        return this.b.equals($$1.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void e() {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(this::h);
            return;
        }
        this.h();
    }

    private void h() {
        int $$0 = this.b();
        ImmutableList<eip> $$1 = this.c();
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            ((eip)$$1.get($$2)).a($$2, this.c.getInt($$2), $$0);
        }
    }

    public void f() {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(this::i);
            return;
        }
        this.i();
    }

    private void i() {
        ImmutableList<eip> $$0 = this.c();
        for (int $$1 = 0; $$1 < $$0.size(); ++$$1) {
            eip $$2 = (eip)$$0.get($$1);
            $$2.a($$1);
        }
    }

    public eim g() {
        eim $$0 = this.e;
        if ($$0 == null) {
            this.e = $$0 = new eim(eim.a.b);
        }
        return $$0;
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(4, 2, 2, false);
        public static final /* enum */ b b = new b(5, 2, 1, true);
        public static final /* enum */ b c = new b(1, 2, 2, false);
        public static final /* enum */ b d = new b(3, 2, 1, true);
        public static final /* enum */ b e = new b(4, 3, 3, false);
        public static final /* enum */ b f = new b(5, 3, 1, true);
        public static final /* enum */ b g = new b(6, 3, 1, true);
        public static final /* enum */ b h = new b(4, 4, 4, false);
        public final int i;
        public final int j;
        public final int k;
        public final boolean l;
        private static final /* synthetic */ b[] m;

        public static b[] values() {
            return (b[])m.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(int $$0, int $$1, int $$2, boolean $$3) {
            this.i = $$0;
            this.j = $$1;
            this.k = $$2;
            this.l = $$3;
        }

        public int a(int $$0) {
            int $$3;
            switch (this) {
                case b: 
                case c: 
                case d: 
                case e: 
                case f: 
                case g: {
                    int $$1 = $$0;
                    break;
                }
                case a: 
                case h: {
                    int $$2 = $$0 / 4 * 6;
                    break;
                }
                default: {
                    $$3 = 0;
                }
            }
            return $$3;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d, e, f, g, h};
        }

        static {
            m = eio$b.a();
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(5123, 2);
        public static final /* enum */ a b = new a(5125, 4);
        public final int c;
        public final int d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, int $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        public static a a(int $$0) {
            if (($$0 & 0xFFFF0000) != 0) {
                return b;
            }
            return a;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            e = eio$a.a();
        }
    }
}

