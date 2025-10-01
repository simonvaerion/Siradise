/*
 * Decompiled with CFR 0.152.
 */
import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class drl
extends drh {
    protected abstract int a(apf var1, gu var2);

    @Override
    public Stream<gu> a_(drf $$0, apf $$12, gu $$2) {
        return IntStream.range(0, this.a($$12, $$2)).mapToObj($$1 -> $$2);
    }
}

