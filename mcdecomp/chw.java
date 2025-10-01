/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class chw {
    @Nullable
    private final String a;
    private final ImmutableList<bfa> b;

    public static chw a(String $$0) {
        return jb.j.a(acq.a($$0));
    }

    public chw(bfa ... $$0) {
        this((String)null, $$0);
    }

    public chw(@Nullable String $$0, bfa ... $$1) {
        this.a = $$0;
        this.b = ImmutableList.copyOf((Object[])$$1);
    }

    public String b(String $$0) {
        return $$0 + (this.a == null ? jb.j.b(this).a() : this.a);
    }

    public List<bfa> a() {
        return this.b;
    }

    public boolean b() {
        if (!this.b.isEmpty()) {
            for (bfa $$0 : this.b) {
                if (!$$0.c().a()) continue;
                return true;
            }
        }
        return false;
    }
}

