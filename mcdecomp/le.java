/*
 * Decompiled with CFR 0.152.
 */
public class le {
    @Deprecated
    public static acq a(String $$0) {
        return new acq("minecraft", "block/" + $$0);
    }

    public static acq b(String $$0) {
        return new acq("minecraft", "item/" + $$0);
    }

    public static acq a(cpn $$0, String $$12) {
        acq $$2 = jb.f.b($$0);
        return $$2.a($$1 -> "block/" + $$1 + $$12);
    }

    public static acq a(cpn $$0) {
        acq $$1 = jb.f.b($$0);
        return $$1.d("block/");
    }

    public static acq a(cfu $$0) {
        acq $$1 = jb.i.b($$0);
        return $$1.d("item/");
    }

    public static acq a(cfu $$0, String $$12) {
        acq $$2 = jb.i.b($$0);
        return $$2.a($$1 -> "item/" + $$1 + $$12);
    }
}

