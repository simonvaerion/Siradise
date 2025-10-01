/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.Collator
 *  javax.annotation.Nullable
 */
import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class etm
extends euq {
    private static final sw a = sw.c("createWorld.customize.buffet.biome");
    private final euq b;
    private final Consumer<he<cnk>> c;
    final hr<cnk> k;
    private a l;
    he<cnk> m;
    private epi n;

    public etm(euq $$0, ezi $$1, Consumer<he<cnk>> $$2) {
        super(sw.c("createWorld.customize.buffet.title"));
        this.b = $$0;
        this.c = $$2;
        this.k = $$1.a().d(jc.ap);
        he $$3 = this.k.b(cnr.b).or(() -> this.k.h().findAny()).orElseThrow();
        this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
    }

    @Override
    public void aw_() {
        this.f.a(this.b);
    }

    @Override
    protected void b() {
        this.l = new a();
        this.e(this.l);
        this.n = this.d(epi.a(sv.d, (epi $$0) -> {
            this.c.accept(this.m);
            this.f.a(this.b);
        }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
        this.d(epi.a(sv.e, (epi $$0) -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
        this.l.a((a.a)this.l.i().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
    }

    void l() {
        this.n.r = this.l.f() != null;
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.b($$0);
        this.l.a($$0, $$1, $$2, $$3);
        $$0.a(this.i, this.e, this.g / 2, 8, 0xFFFFFF);
        $$0.a(this.i, a, this.g / 2, 28, 0xA0A0A0);
        super.a($$0, $$1, $$2, $$3);
    }

    class etm$a
    extends eqc<a> {
        etm$a() {
            super(etm.this.f, etm.this.g, etm.this.h, 40, etm.this.h - 37, 16);
            Collator $$02 = Collator.getInstance((Locale)Locale.getDefault());
            etm.this.k.h().map($$0 -> new a((he.c<cnk>)$$0)).sorted(Comparator.comparing($$0 -> $$0.c.getString(), $$02)).forEach($$1 -> this.b($$1));
        }

        @Override
        public void a(@Nullable a $$0) {
            super.a($$0);
            if ($$0 != null) {
                etm.this.m = $$0.b;
            }
            etm.this.l();
        }

        class a
        extends eqc.a<a> {
            final he.c<cnk> b;
            final sw c;

            public a(he.c<cnk> $$0) {
                this.b = $$0;
                acq $$1 = $$0.g().a();
                String $$2 = $$1.f("biome");
                this.c = qm.a().b($$2) ? sw.c($$2) : sw.b($$1.toString());
            }

            @Override
            public sw a() {
                return sw.a("narrator.select", this.c);
            }

            @Override
            public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
                $$0.b(etm.this.i, this.c, $$3 + 5, $$2 + 2, 0xFFFFFF);
            }

            @Override
            public boolean a(double $$0, double $$1, int $$2) {
                if ($$2 == 0) {
                    a.this.a(this);
                    return true;
                }
                return false;
            }
        }
    }
}

