/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;

public interface esp {
    default public void a(eso $$0, sw $$1) {
        this.a($$0, esr.a($$1.getString()));
    }

    default public void a(eso $$0, String $$1) {
        this.a($$0, esr.a($$1));
    }

    default public void a(eso $$0, sw ... $$1) {
        this.a($$0, esr.a((List<sw>)ImmutableList.copyOf((Object[])$$1)));
    }

    public void a(eso var1, esr<?> var2);

    public esp a();
}

