/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class fej {
    private static final Set<ha> a = EnumSet.allOf(ha.class);
    private final List<feh> b = Lists.newArrayList();
    private int c;
    private int d;
    private boolean e;

    public fej a(int $$0, int $$1) {
        this.c = $$0;
        this.d = $$1;
        return this;
    }

    public fej a() {
        return this.a(true);
    }

    public fej a(boolean $$0) {
        this.e = $$0;
        return this;
    }

    public fej a(String $$0, float $$1, float $$2, float $$3, int $$4, int $$5, int $$6, fei $$7, int $$8, int $$9) {
        this.a($$8, $$9);
        this.b.add(new feh($$0, this.c, this.d, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.e, 1.0f, 1.0f, a));
        return this;
    }

    public fej a(String $$0, float $$1, float $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
        this.a($$7, $$8);
        this.b.add(new feh($$0, this.c, this.d, $$1, $$2, $$3, $$4, $$5, $$6, fei.a, this.e, 1.0f, 1.0f, a));
        return this;
    }

    public fej a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.b.add(new feh(null, this.c, this.d, $$0, $$1, $$2, $$3, $$4, $$5, fei.a, this.e, 1.0f, 1.0f, a));
        return this;
    }

    public fej a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, Set<ha> $$6) {
        this.b.add(new feh(null, this.c, this.d, $$0, $$1, $$2, $$3, $$4, $$5, fei.a, this.e, 1.0f, 1.0f, $$6));
        return this;
    }

    public fej a(String $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
        this.b.add(new feh($$0, this.c, this.d, $$1, $$2, $$3, $$4, $$5, $$6, fei.a, this.e, 1.0f, 1.0f, a));
        return this;
    }

    public fej a(String $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, fei $$7) {
        this.b.add(new feh($$0, this.c, this.d, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.e, 1.0f, 1.0f, a));
        return this;
    }

    public fej a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, boolean $$6) {
        this.b.add(new feh(null, this.c, this.d, $$0, $$1, $$2, $$3, $$4, $$5, fei.a, $$6, 1.0f, 1.0f, a));
        return this;
    }

    public fej a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, fei $$6, float $$7, float $$8) {
        this.b.add(new feh(null, this.c, this.d, $$0, $$1, $$2, $$3, $$4, $$5, $$6, this.e, $$7, $$8, a));
        return this;
    }

    public fej a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, fei $$6) {
        this.b.add(new feh(null, this.c, this.d, $$0, $$1, $$2, $$3, $$4, $$5, $$6, this.e, 1.0f, 1.0f, a));
        return this;
    }

    public List<feh> b() {
        return ImmutableList.copyOf(this.b);
    }

    public static fej c() {
        return new fej();
    }
}

