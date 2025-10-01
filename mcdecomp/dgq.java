/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public interface dgq<T extends dgp> {
    public static final dgq<dgh> a = dgq.a("block", new dgh.a());
    public static final dgq<dgj> b = dgq.a("entity", new dgj.a());

    public T b(sf var1);

    public void a(sf var1, T var2);

    public Codec<T> a();

    public static <S extends dgq<T>, T extends dgp> S a(String $$0, S $$1) {
        return (S)hr.a(jb.w, $$0, $$1);
    }

    public static dgp c(sf $$0) {
        acq $$1 = $$0.t();
        return jb.w.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown position source type " + $$1)).b($$0);
    }

    public static <T extends dgp> void a(T $$0, sf $$1) {
        $$1.a(jb.w.b($$0.a()));
        $$0.a().a($$1, $$0);
    }
}

