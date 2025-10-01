/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface clj {
    public void f(@Nullable byo var1);

    @Nullable
    public byo fY();

    public cll ga();

    public void a(cll var1);

    public void a(clk var1);

    public void l(cfz var1);

    public int r();

    public void t(int var1);

    public boolean gb();

    public amg gc();

    default public boolean gk() {
        return false;
    }

    default public void a(byo $$02, sw $$12, int $$22) {
        cll $$4;
        OptionalInt $$3 = $$02.a(new bef(($$0, $$1, $$2) -> new ccm($$0, $$1, this), $$12));
        if ($$3.isPresent() && !($$4 = this.ga()).isEmpty()) {
            $$02.a($$3.getAsInt(), $$4, $$22, this.r(), this.gb(), this.gk());
        }
    }

    public boolean gg();
}

