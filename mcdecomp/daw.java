/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class daw {
    private static final Codec<sw[]> c = aoi.c.listOf().comapFlatMap($$0 -> {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.NewAnonymousArray.getDimSize(NewAnonymousArray.java:142)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.isNewArrayLambda(LambdaRewriter.java:455)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:409)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:167)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:105)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.rewriters.ExpressionRewriterHelper.applyForwards(ExpressionRewriterHelper.java:12)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractMemberFunctionInvokation.applyExpressionRewriterToArgs(AbstractMemberFunctionInvokation.java:101)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractMemberFunctionInvokation.applyExpressionRewriter(AbstractMemberFunctionInvokation.java:88)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:103)
         *     at org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredReturn.rewriteExpressions(StructuredReturn.java:99)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewrite(LambdaRewriter.java:88)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.rewriteLambdas(Op04StructuredStatement.java:1137)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:912)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }, $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3]));
    public static final Codec<daw> a = RecordCodecBuilder.create($$02 -> $$02.group((App)c.fieldOf("messages").forGetter($$0 -> $$0.d), (App)c.optionalFieldOf("filtered_messages").forGetter(daw::d), (App)cen.q.fieldOf("color").orElse((Object)cen.p).forGetter($$0 -> $$0.f), (App)Codec.BOOL.fieldOf("has_glowing_text").orElse((Object)false).forGetter($$0 -> $$0.g)).apply((Applicative)$$02, daw::a));
    public static final int b = 4;
    private final sw[] d;
    private final sw[] e;
    private final cen f;
    private final boolean g;
    @Nullable
    private aom[] h;
    private boolean i;

    public daw() {
        this(daw.c(), daw.c(), cen.p, false);
    }

    public daw(sw[] $$0, sw[] $$1, cen $$2, boolean $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    private static sw[] c() {
        return new sw[]{sv.a, sv.a, sv.a, sv.a};
    }

    private static daw a(sw[] $$0, Optional<sw[]> $$1, cen $$2, boolean $$3) {
        sw[] $$4 = $$1.orElseGet(daw::c);
        daw.a($$0, $$4);
        return new daw($$0, $$4, $$2, $$3);
    }

    private static void a(sw[] $$0, sw[] $$1) {
        for (int $$2 = 0; $$2 < 4; ++$$2) {
            if (!$$1[$$2].equals(sv.a)) continue;
            $$1[$$2] = $$0[$$2];
        }
    }

    public boolean a() {
        return this.g;
    }

    public daw a(boolean $$0) {
        if ($$0 == this.g) {
            return this;
        }
        return new daw(this.d, this.e, this.f, $$0);
    }

    public cen b() {
        return this.f;
    }

    public daw a(cen $$0) {
        if ($$0 == this.b()) {
            return this;
        }
        return new daw(this.d, this.e, $$0, this.g);
    }

    public sw a(int $$0, boolean $$1) {
        return this.b($$1)[$$0];
    }

    public daw a(int $$0, sw $$1) {
        return this.a($$0, $$1, $$1);
    }

    public daw a(int $$0, sw $$1, sw $$2) {
        sw[] $$3 = Arrays.copyOf(this.d, this.d.length);
        sw[] $$4 = Arrays.copyOf(this.e, this.e.length);
        $$3[$$0] = $$1;
        $$4[$$0] = $$2;
        return new daw($$3, $$4, this.f, this.g);
    }

    public boolean a(byo $$02) {
        return Arrays.stream(this.b($$02.U())).anyMatch($$0 -> !$$0.getString().isEmpty());
    }

    public sw[] b(boolean $$0) {
        return $$0 ? this.e : this.d;
    }

    public aom[] a(boolean $$0, Function<sw, aom> $$1) {
        if (this.h == null || this.i != $$0) {
            this.i = $$0;
            this.h = new aom[4];
            for (int $$2 = 0; $$2 < 4; ++$$2) {
                this.h[$$2] = $$1.apply(this.a($$2, $$0));
            }
        }
        return this.h;
    }

    private Optional<sw[]> d() {
        sw[] $$0 = new sw[4];
        boolean $$1 = false;
        for (int $$2 = 0; $$2 < 4; ++$$2) {
            sw $$3 = this.e[$$2];
            if (!$$3.equals(this.d[$$2])) {
                $$0[$$2] = $$3;
                $$1 = true;
                continue;
            }
            $$0[$$2] = sv.a;
        }
        return $$1 ? Optional.of($$0) : Optional.empty();
    }

    public boolean b(byo $$0) {
        for (sw $$1 : this.b($$0.U())) {
            ts $$2 = $$1.a();
            su $$3 = $$2.h();
            if ($$3 == null || $$3.a() != su.a.c) continue;
            return true;
        }
        return false;
    }
}

