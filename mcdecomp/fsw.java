/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class fsw<T extends bfz, M extends fbs<T>, A extends fbs<T>>
extends ftg<T, M> {
    private static final Map<String, acq> a = Maps.newHashMap();
    private final A b;
    private final A c;
    private final fuu d;

    public fsw(fqt<T, M> $$0, A $$1, A $$2, fwx $$3) {
        super($$0);
        this.b = $$1;
        this.c = $$2;
        this.d = $$3.a(fkj.g);
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        this.a($$0, $$1, $$3, bfo.e, $$2, this.a(bfo.e));
        this.a($$0, $$1, $$3, bfo.d, $$2, this.a(bfo.d));
        this.a($$0, $$1, $$3, bfo.c, $$2, this.a(bfo.c));
        this.a($$0, $$1, $$3, bfo.f, $$2, this.a(bfo.f));
    }

    /*
     * WARNING - void declaration
     */
    private void a(eij $$0, fjx $$1, T $$2, bfo $$3, int $$4, A $$5) {
        void $$8;
        cfz $$6 = ((bfz)$$2).c($$3);
        cfu cfu2 = $$6.d();
        if (!(cfu2 instanceof cdj)) {
            return;
        }
        cdj $$7 = (cdj)cfu2;
        if ($$8.g() != $$3) {
            return;
        }
        ((fbs)this.c()).a($$5);
        this.a($$5, $$3);
        boolean $$9 = this.b($$3);
        if ($$8 instanceof cep) {
            cep $$10 = (cep)$$8;
            int $$11 = $$10.e_($$6);
            float $$12 = (float)($$11 >> 16 & 0xFF) / 255.0f;
            float $$13 = (float)($$11 >> 8 & 0xFF) / 255.0f;
            float $$14 = (float)($$11 & 0xFF) / 255.0f;
            this.a($$0, $$1, $$4, (cdj)$$8, $$5, $$9, $$12, $$13, $$14, null);
            this.a($$0, $$1, $$4, (cdj)$$8, $$5, $$9, 1.0f, 1.0f, 1.0f, "overlay");
        } else {
            this.a($$0, $$1, $$4, (cdj)$$8, $$5, $$9, 1.0f, 1.0f, 1.0f, null);
        }
        cib.a(((bfj)$$2).dI().B_(), $$6).ifPresent(arg_0 -> this.a((cdj)$$8, $$0, $$1, $$4, $$5, $$9, arg_0));
        if ($$6.B()) {
            this.a($$0, $$1, $$4, $$5);
        }
    }

    protected void a(A $$0, bfo $$1) {
        ((fbs)$$0).d_(false);
        switch ($$1) {
            case f: {
                ((fbs)$$0).k.k = true;
                ((fbs)$$0).l.k = true;
                break;
            }
            case e: {
                ((fbs)$$0).m.k = true;
                ((fbs)$$0).n.k = true;
                ((fbs)$$0).o.k = true;
                break;
            }
            case d: {
                ((fbs)$$0).m.k = true;
                ((fbs)$$0).p.k = true;
                ((fbs)$$0).q.k = true;
                break;
            }
            case c: {
                ((fbs)$$0).p.k = true;
                ((fbs)$$0).q.k = true;
            }
        }
    }

    private void a(eij $$0, fjx $$1, int $$2, cdj $$3, A $$4, boolean $$5, float $$6, float $$7, float $$8, @Nullable String $$9) {
        ein $$10 = $$1.getBuffer(fkf.a(this.a($$3, $$5, $$9)));
        ((fad)$$4).a($$0, $$10, $$2, fum.d, $$6, $$7, $$8, 1.0f);
    }

    private void a(cdk $$0, eij $$1, fjx $$2, int $$3, cib $$4, A $$5, boolean $$6) {
        fuv $$7 = this.d.a($$6 ? $$4.a($$0) : $$4.b($$0));
        ein $$8 = $$7.a($$2.getBuffer(fkj.h()));
        ((fad)$$5).a($$1, $$8, $$3, fum.d, 1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void a(eij $$0, fjx $$1, int $$2, A $$3) {
        ((fad)$$3).a($$0, $$1.getBuffer(fkf.l()), $$2, fum.d, 1.0f, 1.0f, 1.0f, 1.0f);
    }

    private A a(bfo $$0) {
        return this.b($$0) ? this.b : this.c;
    }

    private boolean b(bfo $$0) {
        return $$0 == bfo.d;
    }

    private acq a(cdj $$0, boolean $$1, @Nullable String $$2) {
        String $$3 = "textures/models/armor/" + $$0.d().e() + "_layer_" + ($$1 ? 2 : 1) + (String)($$2 == null ? "" : "_" + $$2) + ".png";
        return a.computeIfAbsent($$3, acq::new);
    }

    private /* synthetic */ void a(cdj $$0, eij $$1, fjx $$2, int $$3, fbs $$4, boolean $$5, cib $$6) {
        this.a($$0.d(), $$1, $$2, $$3, $$6, $$4, $$5);
    }
}

