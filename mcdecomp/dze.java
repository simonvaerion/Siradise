/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  javax.annotation.Nullable
 */
import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface dze {
    public static final int c = 19133;
    public static final int d = 19132;

    public cnf F();

    public void a(cnf var1);

    public boolean H();

    public Set<String> I();

    public Set<String> J();

    public void a(String var1, boolean var2);

    default public void a(p $$0) {
        $$0.a("Known server brands", () -> String.join((CharSequence)", ", this.I()));
        $$0.a("Removed feature flags", () -> String.join((CharSequence)", ", this.J()));
        $$0.a("Level was modded", () -> Boolean.toString(this.H()));
        $$0.a("Level storage version", () -> {
            int $$0 = this.z();
            return String.format(Locale.ROOT, "0x%05X - %s", $$0, this.i($$0));
        });
    }

    default public String i(int $$0) {
        switch ($$0) {
            case 19133: {
                return "Anvil";
            }
            case 19132: {
                return "McRegion";
            }
        }
        return "Unknown?";
    }

    @Nullable
    public qr G();

    public void a(@Nullable qr var1);

    public dzd K();

    public cmq L();

    public qr a(hs var1, @Nullable qr var2);

    public boolean n();

    public int z();

    public String g();

    public cmj m();

    public void a(cmj var1);

    public boolean o();

    public bdu s();

    public void a(bdu var1);

    public boolean t();

    public void d(boolean var1);

    public cmi q();

    @Nullable
    public qr y();

    public dfn.a E();

    public void a(dfn.a var1);

    public dii A();

    public boolean B();

    public boolean C();

    public Lifecycle D();

    default public caw M() {
        return this.F().b();
    }
}

