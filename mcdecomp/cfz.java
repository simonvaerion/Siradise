/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Multimap
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class cfz {
    public static final Codec<cfz> a = RecordCodecBuilder.create($$02 -> $$02.group((App)jb.i.q().fieldOf("id").forGetter(cfz::d), (App)Codec.INT.fieldOf("Count").forGetter(cfz::L), (App)qr.a.optionalFieldOf("tag").forGetter($$0 -> Optional.ofNullable($$0.v()))).apply((Applicative)$$02, cfz::new));
    private static final Logger j = LogUtils.getLogger();
    public static final cfz b = new cfz((Void)null);
    public static final DecimalFormat c = ac.a(new DecimalFormat("#.##"), (T $$0) -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
    public static final String d = "Enchantments";
    public static final String e = "display";
    public static final String f = "Name";
    public static final String g = "Lore";
    public static final String h = "Damage";
    public static final String i = "color";
    private static final String k = "Unbreakable";
    private static final String l = "RepairCost";
    private static final String m = "CanDestroy";
    private static final String n = "CanPlaceOn";
    private static final String o = "HideFlags";
    private static final sw p = sw.c("item.disabled").a(n.m);
    private static final int q = 0;
    private static final ts r = ts.a.a(n.f).b(true);
    private int s;
    private int t;
    @Deprecated
    @Nullable
    private final cfu u;
    @Nullable
    private qr v;
    @Nullable
    private bfj w;
    @Nullable
    private cdh x;
    @Nullable
    private cdh y;

    public Optional<cdf> a() {
        return this.d().h(this);
    }

    public cfz(cml $$0) {
        this($$0, 1);
    }

    public cfz(he<cfu> $$0) {
        this($$0.a(), 1);
    }

    private cfz(cml $$0, int $$1, Optional<qr> $$2) {
        this($$0, $$1);
        $$2.ifPresent(this::c);
    }

    public cfz(he<cfu> $$0, int $$1) {
        this($$0.a(), $$1);
    }

    public cfz(cml $$0, int $$1) {
        this.u = $$0.k();
        this.s = $$1;
        if (this.u.o()) {
            this.b(this.k());
        }
    }

    private cfz(@Nullable Void $$0) {
        this.u = null;
    }

    private cfz(qr $$0) {
        this.u = jb.i.a(new acq($$0.l("id")));
        this.s = $$0.f("Count");
        if ($$0.b("tag", 10)) {
            this.v = $$0.p("tag");
            this.d().b(this.v);
        }
        if (this.d().o()) {
            this.b(this.k());
        }
    }

    public static cfz a(qr $$0) {
        try {
            return new cfz($$0);
        }
        catch (RuntimeException $$1) {
            j.debug("Tried to load invalid item: {}", (Object)$$0, (Object)$$1);
            return b;
        }
    }

    public boolean b() {
        return this == b || this.u == cgc.a || this.s <= 0;
    }

    public boolean a(caw $$0) {
        return this.b() || this.d().a($$0);
    }

    public cfz a(int $$0) {
        int $$1 = Math.min($$0, this.L());
        cfz $$2 = this.c($$1);
        this.h($$1);
        return $$2;
    }

    public cfz c() {
        if (this.b()) {
            return b;
        }
        cfz $$0 = this.p();
        this.f(0);
        return $$0;
    }

    public cfu d() {
        return this.b() ? cgc.a : this.u;
    }

    public he<cfu> e() {
        return this.d().j();
    }

    public boolean a(anl<cfu> $$0) {
        return this.d().j().a($$0);
    }

    public boolean a(cfu $$0) {
        return this.d() == $$0;
    }

    public boolean a(Predicate<he<cfu>> $$0) {
        return $$0.test(this.d().j());
    }

    public boolean a(he<cfu> $$0) {
        return this.d().j() == $$0;
    }

    public Stream<anl<cfu>> f() {
        return this.d().j().c();
    }

    public bdx a(cij $$0) {
        byo $$1 = $$0.o();
        gu $$2 = $$0.a();
        dcf $$3 = new dcf($$0.q(), $$2, false);
        if ($$1 != null && !$$1.fO().e && !this.a($$0.q().B_().d(jc.e), $$3)) {
            return bdx.d;
        }
        cfu $$4 = this.d();
        bdx $$5 = $$4.a($$0);
        if ($$1 != null && $$5.c()) {
            $$1.b(amr.c.b($$4));
        }
        return $$5;
    }

    public float a(dcb $$0) {
        return this.d().a(this, $$0);
    }

    public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
        return this.d().a($$0, $$1, $$2);
    }

    public cfz a(cmm $$0, bfz $$1) {
        return this.d().a(this, $$0, $$1);
    }

    public qr b(qr $$0) {
        acq $$1 = jb.i.b(this.d());
        $$0.a("id", $$1 == null ? "minecraft:air" : $$1.toString());
        $$0.a("Count", (byte)this.s);
        if (this.v != null) {
            $$0.a("tag", this.v.h());
        }
        return $$0;
    }

    public int g() {
        return this.d().l();
    }

    public boolean h() {
        return this.g() > 1 && (!this.i() || !this.j());
    }

    public boolean i() {
        if (this.b() || this.d().n() <= 0) {
            return false;
        }
        qr $$0 = this.v();
        return $$0 == null || !$$0.q(k);
    }

    public boolean j() {
        return this.i() && this.k() > 0;
    }

    public int k() {
        return this.v == null ? 0 : this.v.h(h);
    }

    public void b(int $$0) {
        this.w().a(h, Math.max(0, $$0));
    }

    public int l() {
        return this.d().n();
    }

    public boolean a(int $$0, apf $$1, @Nullable aig $$2) {
        if (!this.i()) {
            return false;
        }
        if ($$0 > 0) {
            int $$3 = cki.a(ckk.w, this);
            int $$4 = 0;
            for (int $$5 = 0; $$3 > 0 && $$5 < $$0; ++$$5) {
                if (!cke.a(this, $$3, $$1)) continue;
                ++$$4;
            }
            if (($$0 -= $$4) <= 0) {
                return false;
            }
        }
        if ($$2 != null && $$0 != 0) {
            ai.t.a($$2, this, this.k() + $$0);
        }
        int $$6 = this.k() + $$0;
        this.b($$6);
        return $$6 >= this.l();
    }

    public <T extends bfz> void a(int $$0, T $$1, Consumer<T> $$2) {
        if ($$1.dI().B || $$1 instanceof byo && ((byo)$$1).fO().d) {
            return;
        }
        if (!this.i()) {
            return;
        }
        if (this.a($$0, $$1.ec(), $$1 instanceof aig ? (aig)$$1 : null)) {
            $$2.accept($$1);
            cfu $$3 = this.d();
            this.h(1);
            if ($$1 instanceof byo) {
                ((byo)$$1).b(amr.d.b($$3));
            }
            this.b(0);
        }
    }

    public boolean m() {
        return this.d().e(this);
    }

    public int n() {
        return this.d().f(this);
    }

    public int o() {
        return this.d().g(this);
    }

    public boolean a(ccx $$0, cbn $$1, byo $$2) {
        return this.d().a(this, $$0, $$1, $$2);
    }

    public boolean a(cfz $$0, ccx $$1, cbn $$2, byo $$3, bgs $$4) {
        return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
    }

    public void a(bfz $$0, byo $$1) {
        cfu $$2 = this.d();
        if ($$2.a(this, $$0, (bfz)$$1)) {
            $$1.b(amr.c.b($$2));
        }
    }

    public void a(cmm $$0, dcb $$1, gu $$2, byo $$3) {
        cfu $$4 = this.d();
        if ($$4.a(this, $$0, $$1, $$2, $$3)) {
            $$3.b(amr.c.b($$4));
        }
    }

    public boolean b(dcb $$0) {
        return this.d().a_($$0);
    }

    public bdx a(byo $$0, bfz $$1, bdw $$2) {
        return this.d().a(this, $$0, $$1, $$2);
    }

    public cfz p() {
        if (this.b()) {
            return b;
        }
        cfz $$0 = new cfz(this.d(), this.s);
        $$0.e(this.K());
        if (this.v != null) {
            $$0.v = this.v.h();
        }
        return $$0;
    }

    public cfz c(int $$0) {
        if (this.b()) {
            return b;
        }
        cfz $$1 = this.p();
        $$1.f($$0);
        return $$1;
    }

    public static boolean a(cfz $$0, cfz $$1) {
        if ($$0 == $$1) {
            return true;
        }
        if ($$0.L() != $$1.L()) {
            return false;
        }
        return cfz.c($$0, $$1);
    }

    public static boolean b(cfz $$0, cfz $$1) {
        return $$0.a($$1.d());
    }

    public static boolean c(cfz $$0, cfz $$1) {
        if (!$$0.a($$1.d())) {
            return false;
        }
        if ($$0.b() && $$1.b()) {
            return true;
        }
        return Objects.equals($$0.v, $$1.v);
    }

    public String q() {
        return this.d().j(this);
    }

    public String toString() {
        return this.L() + " " + this.d();
    }

    public void a(cmm $$0, bfj $$1, int $$2, boolean $$3) {
        if (this.t > 0) {
            --this.t;
        }
        if (this.d() != null) {
            this.d().a(this, $$0, $$1, $$2, $$3);
        }
    }

    public void a(cmm $$0, byo $$1, int $$2) {
        $$1.a(amr.b.b(this.d()), $$2);
        this.d().b(this, $$0, $$1);
    }

    public int r() {
        return this.d().b(this);
    }

    public chs s() {
        return this.d().c(this);
    }

    public void a(cmm $$0, bfz $$1, int $$2) {
        this.d().a(this, $$0, $$1, $$2);
    }

    public boolean t() {
        return this.d().l(this);
    }

    public boolean u() {
        return !this.b() && this.v != null && !this.v.g();
    }

    @Nullable
    public qr v() {
        return this.v;
    }

    public qr w() {
        if (this.v == null) {
            this.c(new qr());
        }
        return this.v;
    }

    public qr a(String $$0) {
        if (this.v == null || !this.v.b($$0, 10)) {
            qr $$1 = new qr();
            this.a($$0, $$1);
            return $$1;
        }
        return this.v.p($$0);
    }

    @Nullable
    public qr b(String $$0) {
        if (this.v == null || !this.v.b($$0, 10)) {
            return null;
        }
        return this.v.p($$0);
    }

    public void c(String $$0) {
        if (this.v != null && this.v.e($$0)) {
            this.v.r($$0);
            if (this.v.g()) {
                this.v = null;
            }
        }
    }

    public qx x() {
        if (this.v != null) {
            return this.v.c(d, 10);
        }
        return new qx();
    }

    public void c(@Nullable qr $$0) {
        this.v = $$0;
        if (this.d().o()) {
            this.b(this.k());
        }
        if ($$0 != null) {
            this.d().b($$0);
        }
    }

    public sw y() {
        qr $$0 = this.b(e);
        if ($$0 != null && $$0.b(f, 8)) {
            try {
                tj $$1 = sw.a.a($$0.l(f));
                if ($$1 != null) {
                    return $$1;
                }
                $$0.r(f);
            }
            catch (Exception $$2) {
                $$0.r(f);
            }
        }
        return this.d().m(this);
    }

    public cfz a(@Nullable sw $$0) {
        qr $$1 = this.a(e);
        if ($$0 != null) {
            $$1.a(f, sw.a.a($$0));
        } else {
            $$1.r(f);
        }
        return this;
    }

    public void z() {
        qr $$0 = this.b(e);
        if ($$0 != null) {
            $$0.r(f);
            if ($$0.g()) {
                this.c(e);
            }
        }
        if (this.v != null && this.v.g()) {
            this.v = null;
        }
    }

    public boolean A() {
        qr $$0 = this.b(e);
        return $$0 != null && $$0.b(f, 8);
    }

    public List<sw> a(@Nullable byo $$0, chq $$1) {
        int $$5;
        Integer $$4;
        ArrayList $$2 = Lists.newArrayList();
        tj $$3 = sw.h().b(this.y()).a(this.C().e);
        if (this.A()) {
            $$3.a(n.u);
        }
        $$2.add($$3);
        if (!$$1.a() && !this.A() && this.a(cgc.rf) && ($$4 = cgg.d(this)) != null) {
            $$2.add(sw.b("#" + $$4).a(n.h));
        }
        if (cfz.a($$5 = this.P(), cfz$a.f)) {
            this.d().a(this, $$0 == null ? null : $$0.dI(), $$2, $$1);
        }
        if (this.u()) {
            if (cfz.a($$5, cfz$a.h) && $$0 != null) {
                cib.a(this, $$0.dI().B_(), $$2);
            }
            if (cfz.a($$5, cfz$a.a)) {
                cfz.a($$2, this.x());
            }
            if (this.v.b(e, 10)) {
                qr $$6 = this.v.p(e);
                if (cfz.a($$5, cfz$a.g) && $$6.b(i, 99)) {
                    if ($$1.a()) {
                        $$2.add(sw.a("item.color", new Object[]{String.format(Locale.ROOT, "#%06X", $$6.h(i))}).a(n.h));
                    } else {
                        $$2.add(sw.c("item.dyed").a(n.h, n.u));
                    }
                }
                if ($$6.d(g) == 9) {
                    qx $$7 = $$6.c(g, 8);
                    for (int $$8 = 0; $$8 < $$7.size(); ++$$8) {
                        String $$9 = $$7.j($$8);
                        try {
                            tj $$10 = sw.a.a($$9);
                            if ($$10 == null) continue;
                            $$2.add(sy.a($$10, r));
                            continue;
                        }
                        catch (Exception $$11) {
                            $$6.r(g);
                        }
                    }
                }
            }
        }
        if (cfz.a($$5, cfz$a.b)) {
            for (bfo $$12 : bfo.values()) {
                Multimap<bhb, bhe> $$13 = this.a($$12);
                if ($$13.isEmpty()) continue;
                $$2.add(sv.a);
                $$2.add(sw.c("item.modifiers." + $$12.d()).a(n.h));
                for (Map.Entry $$14 : $$13.entries()) {
                    double $$20;
                    bhe $$15 = (bhe)$$14.getValue();
                    double $$16 = $$15.d();
                    boolean $$17 = false;
                    if ($$0 != null) {
                        if ($$15.a() == cfu.m) {
                            $$16 += $$0.c(bhg.f);
                            $$16 += (double)cki.a(this, bge.a);
                            $$17 = true;
                        } else if ($$15.a() == cfu.n) {
                            $$16 += $$0.c(bhg.h);
                            $$17 = true;
                        }
                    }
                    if ($$15.c() == bhe.a.b || $$15.c() == bhe.a.c) {
                        double $$18 = $$16 * 100.0;
                    } else if (((bhb)$$14.getKey()).equals(bhg.c)) {
                        double $$19 = $$16 * 10.0;
                    } else {
                        $$20 = $$16;
                    }
                    if ($$17) {
                        $$2.add(sv.a().b(sw.a("attribute.modifier.equals." + $$15.c().a(), new Object[]{c.format($$20), sw.c(((bhb)$$14.getKey()).c())})).a(n.c));
                        continue;
                    }
                    if ($$16 > 0.0) {
                        $$2.add(sw.a("attribute.modifier.plus." + $$15.c().a(), new Object[]{c.format($$20), sw.c(((bhb)$$14.getKey()).c())}).a(n.j));
                        continue;
                    }
                    if (!($$16 < 0.0)) continue;
                    $$2.add(sw.a("attribute.modifier.take." + $$15.c().a(), new Object[]{c.format($$20 *= -1.0), sw.c(((bhb)$$14.getKey()).c())}).a(n.m));
                }
            }
        }
        if (this.u()) {
            qx $$23;
            qx $$21;
            if (cfz.a($$5, cfz$a.c) && this.v.q(k)) {
                $$2.add(sw.c("item.unbreakable").a(n.j));
            }
            if (cfz.a($$5, cfz$a.d) && this.v.b(m, 9) && !($$21 = this.v.c(m, 8)).isEmpty()) {
                $$2.add(sv.a);
                $$2.add(sw.c("item.canBreak").a(n.h));
                for (int $$22 = 0; $$22 < $$21.size(); ++$$22) {
                    $$2.addAll(cfz.d($$21.j($$22)));
                }
            }
            if (cfz.a($$5, cfz$a.e) && this.v.b(n, 9) && !($$23 = this.v.c(n, 8)).isEmpty()) {
                $$2.add(sv.a);
                $$2.add(sw.c("item.canPlace").a(n.h));
                for (int $$24 = 0; $$24 < $$23.size(); ++$$24) {
                    $$2.addAll(cfz.d($$23.j($$24)));
                }
            }
        }
        if ($$1.a()) {
            if (this.j()) {
                $$2.add(sw.a("item.durability", this.l() - this.k(), this.l()));
            }
            $$2.add(sw.b(jb.i.b(this.d()).toString()).a(n.i));
            if (this.u()) {
                $$2.add(sw.a("item.nbt_tags", this.v.e().size()).a(n.i));
            }
        }
        if ($$0 != null && !this.d().a($$0.dI().G())) {
            $$2.add(p);
        }
        return $$2;
    }

    private static boolean a(int $$0, a $$1) {
        return ($$0 & $$1.a()) == 0;
    }

    private int P() {
        if (this.u() && this.v.b(o, 99)) {
            return this.v.h(o);
        }
        return 0;
    }

    public void a(a $$0) {
        qr $$1 = this.w();
        $$1.a(o, $$1.h(o) | $$0.a());
    }

    public static void a(List<sw> $$0, qx $$1) {
        for (int $$22 = 0; $$22 < $$1.size(); ++$$22) {
            qr $$3 = $$1.a($$22);
            jb.g.b(cki.b($$3)).ifPresent($$2 -> $$0.add($$2.d(cki.a($$3))));
        }
    }

    private static Collection<sw> d(String $$03) {
        try {
            return (Collection)fg.b(jb.f.p(), $$03, true).map($$0 -> Lists.newArrayList((Object[])new sw[]{$$0.a().b().e().a(n.i)}), $$02 -> $$02.a().a().map($$0 -> ((cpn)$$0.a()).e().a(n.i)).collect(Collectors.toList()));
        }
        catch (CommandSyntaxException commandSyntaxException) {
            return Lists.newArrayList((Object[])new sw[]{sw.b("missingno").a(n.i)});
        }
    }

    public boolean B() {
        return this.d().i(this);
    }

    public cgq C() {
        return this.d().n(this);
    }

    public boolean D() {
        if (!this.d().d_(this)) {
            return false;
        }
        return !this.E();
    }

    public void a(ckg $$0, int $$1) {
        this.w();
        if (!this.v.b(d, 9)) {
            this.v.a(d, new qx());
        }
        qx $$2 = this.v.c(d, 10);
        $$2.add(cki.a(cki.a($$0), (int)((byte)$$1)));
    }

    public boolean E() {
        if (this.v != null && this.v.b(d, 9)) {
            return !this.v.c(d, 10).isEmpty();
        }
        return false;
    }

    public void a(String $$0, rk $$1) {
        this.w().a($$0, $$1);
    }

    public boolean F() {
        return this.w instanceof bva;
    }

    public void a(@Nullable bfj $$0) {
        this.w = $$0;
    }

    @Nullable
    public bva G() {
        return this.w instanceof bva ? (bva)this.H() : null;
    }

    @Nullable
    public bfj H() {
        return !this.b() ? this.w : null;
    }

    public int I() {
        if (this.u() && this.v.b(l, 3)) {
            return this.v.h(l);
        }
        return 0;
    }

    public void d(int $$0) {
        this.w().a(l, $$0);
    }

    public Multimap<bhb, bhe> a(bfo $$0) {
        Multimap<bhb, bhe> $$7;
        if (this.u() && this.v.b("AttributeModifiers", 9)) {
            HashMultimap $$1 = HashMultimap.create();
            qx $$2 = this.v.c("AttributeModifiers", 10);
            for (int $$3 = 0; $$3 < $$2.size(); ++$$3) {
                bhe $$6;
                Optional<bhb> $$5;
                qr $$4 = $$2.a($$3);
                if ($$4.b("Slot", 8) && !$$4.l("Slot").equals($$0.d()) || !($$5 = jb.v.b(acq.a($$4.l("AttributeName")))).isPresent() || ($$6 = bhe.a($$4)) == null || $$6.a().getLeastSignificantBits() == 0L || $$6.a().getMostSignificantBits() == 0L) continue;
                $$1.put((Object)$$5.get(), (Object)$$6);
            }
        } else {
            $$7 = this.d().a($$0);
        }
        return $$7;
    }

    public void a(bhb $$0, bhe $$1, @Nullable bfo $$2) {
        this.w();
        if (!this.v.b("AttributeModifiers", 9)) {
            this.v.a("AttributeModifiers", new qx());
        }
        qx $$3 = this.v.c("AttributeModifiers", 10);
        qr $$4 = $$1.e();
        $$4.a("AttributeName", jb.v.b($$0).toString());
        if ($$2 != null) {
            $$4.a("Slot", $$2.d());
        }
        $$3.add($$4);
    }

    public sw J() {
        tj $$02 = sw.h().b(this.y());
        if (this.A()) {
            $$02.a(n.u);
        }
        tj $$1 = sy.a($$02);
        if (!this.b()) {
            $$1.a(this.C().e).a($$0 -> $$0.a(new tb(tb.a.b, new tb.c(this))));
        }
        return $$1;
    }

    public boolean a(hr<cpn> $$0, dcf $$1) {
        if (this.y == null) {
            this.y = new cdh(n);
        }
        return this.y.a(this, $$0, $$1);
    }

    public boolean b(hr<cpn> $$0, dcf $$1) {
        if (this.x == null) {
            this.x = new cdh(m);
        }
        return this.x.a(this, $$0, $$1);
    }

    public int K() {
        return this.t;
    }

    public void e(int $$0) {
        this.t = $$0;
    }

    public int L() {
        return this.b() ? 0 : this.s;
    }

    public void f(int $$0) {
        this.s = $$0;
    }

    public void g(int $$0) {
        this.f(this.L() + $$0);
    }

    public void h(int $$0) {
        this.g(-$$0);
    }

    public void b(cmm $$0, bfz $$1, int $$2) {
        this.d().a($$0, $$1, this, $$2);
    }

    public void a(bvh $$0) {
        this.d().a($$0);
    }

    public boolean M() {
        return this.d().u();
    }

    public amg N() {
        return this.d().af_();
    }

    public amg O() {
        return this.d().ag_();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        public static final /* enum */ a f = new a();
        public static final /* enum */ a g = new a();
        public static final /* enum */ a h = new a();
        private final int i = 1 << this.ordinal();
        private static final /* synthetic */ a[] j;

        public static a[] values() {
            return (a[])j.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        public int a() {
            return this.i;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d, e, f, g, h};
        }

        static {
            j = cfz$a.b();
        }
    }
}

