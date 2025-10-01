/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class dtx
extends dsa {
    public static final Codec<dtx> d = RecordCodecBuilder.create($$02 -> $$02.group(dtx.a($$02), (App)dtx$a.c.fieldOf("mineshaft_type").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, dtx::new));
    private final a e;

    public dtx(dsa.c $$0, a $$1) {
        super($$0);
        this.e = $$1;
    }

    @Override
    public Optional<dsa.b> a(dsa.a $$0) {
        $$0.f().j();
        clt $$1 = $$0.h();
        gu $$2 = new gu($$1.b(), 50, $$1.e());
        dss $$3 = new dss();
        int $$4 = this.a($$3, $$0);
        return Optional.of(new dsa.b($$2.b(0, $$4, 0), (Either<Consumer<dss>, dss>)Either.right((Object)$$3)));
    }

    private int a(dss $$0, dsa.a $$1) {
        clt $$2 = $$1.h();
        dij $$3 = $$1.f();
        ddy $$4 = $$1.b();
        dtw.d $$5 = new dtw.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
        $$0.a($$5);
        $$5.a($$5, $$0, $$3);
        int $$6 = $$4.e();
        if (this.e == dtx$a.b) {
            gu $$7 = $$0.d().f();
            int $$8 = $$4.a($$7.u(), $$7.w(), dhk.a.a, $$1.i(), $$1.d());
            int $$9 = $$8 <= $$6 ? $$6 : apa.b((apf)$$3, $$6, $$8);
            int $$10 = $$9 - $$7.v();
            $$0.a($$10);
            return $$10;
        }
        return $$0.a($$6, $$4.f(), $$3, 10);
    }

    @Override
    public dsj<?> e() {
        return dsj.h;
    }

    public static final class a
    extends Enum<a>
    implements apr {
        public static final /* enum */ a a = new a("normal", cpo.U, cpo.n, cpo.dU);
        public static final /* enum */ a b = new a("mesa", cpo.aa, cpo.t, cpo.ki);
        public static final Codec<a> c;
        private static final IntFunction<a> d;
        private final String e;
        private final dcb f;
        private final dcb g;
        private final dcb h;
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, cpn $$1, cpn $$2, cpn $$3) {
            this.e = $$0;
            this.f = $$1.n();
            this.g = $$2.n();
            this.h = $$3.n();
        }

        public String a() {
            return this.e;
        }

        public static a a(int $$0) {
            return d.apply($$0);
        }

        public dcb b() {
            return this.f;
        }

        public dcb d() {
            return this.g;
        }

        public dcb e() {
            return this.h;
        }

        @Override
        public String c() {
            return this.e;
        }

        private static /* synthetic */ a[] f() {
            return new a[]{a, b};
        }

        static {
            i = dtx$a.f();
            c = apr.a(a::values);
            d = anu.a(Enum::ordinal, dtx$a.values(), anu.a.a);
        }
    }
}

