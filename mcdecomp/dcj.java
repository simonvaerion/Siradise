/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dcj
implements Predicate<dcb> {
    private final cpn a;

    public dcj(cpn $$0) {
        this.a = $$0;
    }

    public static dcj a(cpn $$0) {
        return new dcj($$0);
    }

    public boolean a(@Nullable dcb $$0) {
        return $$0 != null && $$0.a(this.a);
    }

    @Override
    public /* synthetic */ boolean test(@Nullable Object object) {
        return this.a((dcb)object);
    }
}

