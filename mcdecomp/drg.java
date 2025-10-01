/*
 * Decompiled with CFR 0.152.
 */
import java.util.stream.Stream;

public abstract class drg
extends drh {
    @Override
    public final Stream<gu> a_(drf $$0, apf $$1, gu $$2) {
        if (this.a($$0, $$1, $$2)) {
            return Stream.of($$2);
        }
        return Stream.of(new gu[0]);
    }

    protected abstract boolean a(drf var1, apf var2, gu var3);
}

