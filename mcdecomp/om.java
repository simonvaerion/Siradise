/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class om {
    public static void a(nm<dkb<?, ?>> $$0) {
        oj.a($$0);
        ok.a($$0);
        ol.a($$0);
        on.a($$0);
        oo.a($$0);
        op.a($$0);
        oq.a($$0);
        or.a($$0);
        os.a($$0);
    }

    private static dir a(List<cpn> $$0) {
        dir $$2;
        if (!$$0.isEmpty()) {
            dir $$1 = dir.a(dir.c, dir.a(ha.a.q(), $$0));
        } else {
            $$2 = dir.c;
        }
        return $$2;
    }

    public static dnf a(int $$0, he<dre> $$1) {
        return new dnf($$0, 7, 3, $$1);
    }

    public static <FC extends dms, F extends dko<FC>> dnf a(F $$0, FC $$1, List<cpn> $$2, int $$3) {
        return om.a($$3, pb.a($$0, $$1, om.a($$2)));
    }

    public static <FC extends dms, F extends dko<FC>> dnf a(F $$0, FC $$1, List<cpn> $$2) {
        return om.a($$0, $$1, $$2, 96);
    }

    public static <FC extends dms, F extends dko<FC>> dnf a(F $$0, FC $$1) {
        return om.a($$0, $$1, List.of(), 96);
    }

    public static acp<dkb<?, ?>> a(String $$0) {
        return acp.a(jc.as, new acq($$0));
    }

    public static void a(nm<dkb<?, ?>> $$0, acp<dkb<?, ?>> $$1, dko<dmz> $$2) {
        om.a($$0, $$1, $$2, dms.m);
    }

    public static <FC extends dms, F extends dko<FC>> void a(nm<dkb<?, ?>> $$0, acp<dkb<?, ?>> $$1, F $$2, FC $$3) {
        $$0.a($$1, new dkb<FC, F>($$2, $$3));
    }
}

