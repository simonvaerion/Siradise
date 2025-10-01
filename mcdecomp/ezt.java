/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 */
import com.google.common.base.MoreObjects;
import java.util.List;

public class ezt {
    public static final int a = -1;
    private final List<ezr> b;
    private final int c;

    public ezt(List<ezr> $$0, int $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public ezr a(int $$0) {
        if ($$0 < 0 || $$0 >= this.b.size()) {
            return ezp.a;
        }
        return (ezr)MoreObjects.firstNonNull((Object)this.b.get($$0), (Object)ezp.a);
    }

    public int a() {
        return this.c;
    }
}

