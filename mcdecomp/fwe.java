/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;

public class fwe {
    public static final fwf a = new fwf();
    public static final String b = "animation";
    public static final int c = 1;
    public static final int d = -1;
    public static final fwe e = new fwe((List)Lists.newArrayList(), -1, -1, 1, false){

        @Override
        public fwg a(int $$0, int $$1) {
            return new fwg($$0, $$1);
        }
    };
    private final List<fwd> f;
    private final int g;
    private final int h;
    private final int i;
    private final boolean j;

    public fwe(List<fwd> $$0, int $$1, int $$2, int $$3, boolean $$4) {
        this.f = $$0;
        this.g = $$1;
        this.h = $$2;
        this.i = $$3;
        this.j = $$4;
    }

    public fwg a(int $$0, int $$1) {
        if (this.g != -1) {
            if (this.h != -1) {
                return new fwg(this.g, this.h);
            }
            return new fwg(this.g, $$1);
        }
        if (this.h != -1) {
            return new fwg($$0, this.h);
        }
        int $$2 = Math.min($$0, $$1);
        return new fwg($$2, $$2);
    }

    public int a() {
        return this.i;
    }

    public boolean b() {
        return this.j;
    }

    public void a(a $$0) {
        for (fwd $$1 : this.f) {
            $$0.accept($$1.a(), $$1.a(this.i));
        }
    }

    @FunctionalInterface
    public static interface a {
        public void accept(int var1, int var2);
    }
}

