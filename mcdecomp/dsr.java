/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public interface dsr {
    public static final dsr a = dsr.a(dtw.a::new, "MSCorridor");
    public static final dsr b = dsr.a(dtw.b::new, "MSCrossing");
    public static final dsr c = dsr.a(dtw.d::new, "MSRoom");
    public static final dsr d = dsr.a(dtw.e::new, "MSStairs");
    public static final dsr e = dsr.a(dty.a::new, "NeBCr");
    public static final dsr f = dsr.a(dty.b::new, "NeBEF");
    public static final dsr g = dsr.a(dty.c::new, "NeBS");
    public static final dsr h = dsr.a(dty.d::new, "NeCCS");
    public static final dsr i = dsr.a(dty.e::new, "NeCTB");
    public static final dsr j = dsr.a(dty.f::new, "NeCE");
    public static final dsr k = dsr.a(dty.g::new, "NeSCSC");
    public static final dsr l = dsr.a(dty.h::new, "NeSCLT");
    public static final dsr m = dsr.a(dty.i::new, "NeSC");
    public static final dsr n = dsr.a(dty.j::new, "NeSCRT");
    public static final dsr o = dsr.a(dty.k::new, "NeCSR");
    public static final dsr p = dsr.a(dty.l::new, "NeMT");
    public static final dsr q = dsr.a(dty.o::new, "NeRC");
    public static final dsr r = dsr.a(dty.p::new, "NeSR");
    public static final dsr s = dsr.a(dty.q::new, "NeStart");
    public static final dsr t = dsr.a(duk.a::new, "SHCC");
    public static final dsr u = dsr.a(duk.b::new, "SHFC");
    public static final dsr v = dsr.a(duk.c::new, "SH5C");
    public static final dsr w = dsr.a(duk.d::new, "SHLT");
    public static final dsr x = dsr.a(duk.e::new, "SHLi");
    public static final dsr y = dsr.a(duk.g::new, "SHPR");
    public static final dsr z = dsr.a(duk.h::new, "SHPH");
    public static final dsr A = dsr.a(duk.i::new, "SHRT");
    public static final dsr B = dsr.a(duk.j::new, "SHRC");
    public static final dsr C = dsr.a(duk.l::new, "SHSD");
    public static final dsr D = dsr.a(duk.m::new, "SHStart");
    public static final dsr E = dsr.a(duk.n::new, "SHS");
    public static final dsr F = dsr.a(duk.o::new, "SHSSD");
    public static final dsr G = dsr.a(dtu::new, "TeJP");
    public static final dsr H = dsr.a(due.a::a, "ORP");
    public static final dsr I = dsr.a(dtr.a::new, "Iglu");
    public static final dsr J = dsr.a(dug::new, "RUPO");
    public static final dsr K = dsr.a(dum::new, "TeSH");
    public static final dsr L = dsr.a(dtn::new, "TeDP");
    public static final dsr M = dsr.a(duc.h::new, "OMB");
    public static final dsr N = dsr.a(duc.j::new, "OMCR");
    public static final dsr O = dsr.a(duc.k::new, "OMDXR");
    public static final dsr P = dsr.a(duc.l::new, "OMDXYR");
    public static final dsr Q = dsr.a(duc.m::new, "OMDYR");
    public static final dsr R = dsr.a(duc.n::new, "OMDYZR");
    public static final dsr S = dsr.a(duc.o::new, "OMDZR");
    public static final dsr T = dsr.a(duc.p::new, "OMEntry");
    public static final dsr U = dsr.a(duc.q::new, "OMPenthouse");
    public static final dsr V = dsr.a(duc.s::new, "OMSimple");
    public static final dsr W = dsr.a(duc.t::new, "OMSimpleT");
    public static final dsr X = dsr.a(duc.u::new, "OMWR");
    public static final dsr Y = dsr.a(dtp.a::new, "ECP");
    public static final dsr Z = dsr.a(duo.i::new, "WMP");
    public static final dsr aa = dsr.a(dtl.a::new, "BTP");
    public static final dsr ab = dsr.a(dui.a::new, "Shipwreck");
    public static final dsr ac = dsr.a(dua.a::new, "NeFos");
    public static final dsr ad = dsr.a(drw::new, "jigsaw");

    public dse load(dsq var1, qr var2);

    private static dsr a(dsr $$0, String $$1) {
        return hr.a(jb.T, $$1.toLowerCase(Locale.ROOT), $$0);
    }

    private static dsr a(a $$0, String $$1) {
        return dsr.a((dsr)$$0, $$1);
    }

    private static dsr a(b $$0, String $$1) {
        return dsr.a((dsr)$$0, $$1);
    }

    public static interface a
    extends dsr {
        public dse load(qr var1);

        @Override
        default public dse load(dsq $$0, qr $$1) {
            return this.load($$1);
        }
    }

    public static interface b
    extends dsr {
        public dse load(dvu var1, qr var2);

        @Override
        default public dse load(dsq $$0, qr $$1) {
            return this.load($$0.c(), $$1);
        }
    }
}

