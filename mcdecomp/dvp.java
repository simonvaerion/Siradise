/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dvp {
    private cui a = cui.a;
    private cvz b = cvz.a;
    private gu c = gu.b;
    private boolean d;
    @Nullable
    private drs e;
    private boolean f = true;
    @Nullable
    private apf g;
    private int h;
    private final List<dvq> i = Lists.newArrayList();
    private boolean j;
    private boolean k;

    public dvp a() {
        dvp $$0 = new dvp();
        $$0.a = this.a;
        $$0.b = this.b;
        $$0.c = this.c;
        $$0.d = this.d;
        $$0.e = this.e;
        $$0.f = this.f;
        $$0.g = this.g;
        $$0.h = this.h;
        $$0.i.addAll(this.i);
        $$0.j = this.j;
        $$0.k = this.k;
        return $$0;
    }

    public dvp a(cui $$0) {
        this.a = $$0;
        return this;
    }

    public dvp a(cvz $$0) {
        this.b = $$0;
        return this;
    }

    public dvp a(gu $$0) {
        this.c = $$0;
        return this;
    }

    public dvp a(boolean $$0) {
        this.d = $$0;
        return this;
    }

    public dvp a(drs $$0) {
        this.e = $$0;
        return this;
    }

    public dvp a(@Nullable apf $$0) {
        this.g = $$0;
        return this;
    }

    public dvp b(boolean $$0) {
        this.f = $$0;
        return this;
    }

    public dvp c(boolean $$0) {
        this.j = $$0;
        return this;
    }

    public dvp b() {
        this.i.clear();
        return this;
    }

    public dvp a(dvq $$0) {
        this.i.add($$0);
        return this;
    }

    public dvp b(dvq $$0) {
        this.i.remove($$0);
        return this;
    }

    public cui c() {
        return this.a;
    }

    public cvz d() {
        return this.b;
    }

    public gu e() {
        return this.c;
    }

    public apf b(@Nullable gu $$0) {
        if (this.g != null) {
            return this.g;
        }
        if ($$0 == null) {
            return apf.a(ac.b());
        }
        return apf.a(apa.a($$0));
    }

    public boolean f() {
        return this.d;
    }

    @Nullable
    public drs g() {
        return this.e;
    }

    public boolean h() {
        return this.j;
    }

    public List<dvq> i() {
        return this.i;
    }

    public boolean j() {
        return this.f;
    }

    public dvt.a a(List<dvt.a> $$0, @Nullable gu $$1) {
        int $$2 = $$0.size();
        if ($$2 == 0) {
            throw new IllegalStateException("No palettes");
        }
        return $$0.get(this.b($$1).a($$2));
    }

    public dvp d(boolean $$0) {
        this.k = $$0;
        return this;
    }

    public boolean k() {
        return this.k;
    }
}

