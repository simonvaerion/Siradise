/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dir
extends BiPredicate<cng, gu> {
    public static final Codec<dir> b = jb.P.q().dispatch(dir::a, dis::codec);
    public static final dir c = dir.a(cpo.a);
    public static final dir d = dir.a(cpo.a, cpo.G);

    public dis<?> a();

    public static dir a(List<dir> $$0) {
        return new dip($$0);
    }

    public static dir a(dir ... $$0) {
        return dir.a(List.of($$0));
    }

    public static dir a(dir $$0, dir $$1) {
        return dir.a(List.of($$0, $$1));
    }

    public static dir b(List<dir> $$0) {
        return new diq($$0);
    }

    public static dir b(dir ... $$0) {
        return dir.b(List.of($$0));
    }

    public static dir b(dir $$0, dir $$1) {
        return dir.b(List.of($$0, $$1));
    }

    public static dir a(hz $$0, List<cpn> $$1) {
        return new dix($$0, hi.a(cpn::q, $$1));
    }

    public static dir c(List<cpn> $$0) {
        return dir.a(hz.g, $$0);
    }

    public static dir a(hz $$0, cpn ... $$1) {
        return dir.a($$0, List.of($$1));
    }

    public static dir a(cpn ... $$0) {
        return dir.a(hz.g, $$0);
    }

    public static dir a(hz $$0, anl<cpn> $$1) {
        return new diw($$0, $$1);
    }

    public static dir a(anl<cpn> $$0) {
        return dir.a(hz.g, $$0);
    }

    public static dir b(hz $$0, List<dxd> $$1) {
        return new diy($$0, hi.a(dxd::k, $$1));
    }

    public static dir a(hz $$0, dxd ... $$1) {
        return dir.b($$0, List.of($$1));
    }

    public static dir a(dxd ... $$0) {
        return dir.a(hz.g, $$0);
    }

    public static dir a(dir $$0) {
        return new diz($$0);
    }

    public static dir a(hz $$0) {
        return new dja($$0);
    }

    public static dir b() {
        return dir.a(hz.g);
    }

    public static dir a(dcb $$0, hz $$1) {
        return new dje($$1, $$0);
    }

    public static dir a(hz $$0, ha $$1) {
        return new diu($$0, $$1);
    }

    public static dir a(ha $$0) {
        return dir.a(hz.g, $$0);
    }

    public static dir b(hz $$0) {
        return new djb($$0);
    }

    public static dir c() {
        return dir.b(hz.g);
    }

    public static dir d() {
        return dir.c(hz.g);
    }

    public static dir c(hz $$0) {
        return dir.a($$0, dxf.a);
    }

    public static dir d(hz $$0) {
        return new div($$0);
    }

    public static dir e() {
        return djd.a;
    }
}

