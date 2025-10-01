/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

public class ecm {
    public static final ecl a = ecm.a("inverted", new ech.a());
    public static final ecl b = ecm.a("any_of", new ebz.b());
    public static final ecl c = ecm.a("all_of", new eby.b());
    public static final ecl d = ecm.a("random_chance", new ecp.a());
    public static final ecl e = ecm.a("random_chance_with_looting", new ecq.a());
    public static final ecl f = ecm.a("entity_properties", new ecn.a());
    public static final ecl g = ecm.a("killed_by_player", new eco.a());
    public static final ecl h = ecm.a("entity_scores", new ecf.b());
    public static final ecl i = ecm.a("block_state_property", new ecj.b());
    public static final ecl j = ecm.a("match_tool", new ecr.a());
    public static final ecl k = ecm.a("table_bonus", new eca.a());
    public static final ecl l = ecm.a("survives_explosion", new ecg.a());
    public static final ecl m = ecm.a("damage_source_properties", new ece.a());
    public static final ecl n = ecm.a("location_check", new eci.a());
    public static final ecl o = ecm.a("weather_check", new ecu.b());
    public static final ecl p = ecm.a("reference", new ecc.a());
    public static final ecl q = ecm.a("time_check", new ecs.b());
    public static final ecl r = ecm.a("value_check", new ect.a());

    private static ecl a(String $$0, dzt<? extends eck> $$1) {
        return hr.a(jb.I, new acq($$0), new ecl($$1));
    }

    public static Object a() {
        return dzi.a(jb.I, "condition", "condition", eck::b).a();
    }

    public static <T> Predicate<T> a(Predicate<T>[] $$02) {
        return switch ($$02.length) {
            case 0 -> $$0 -> true;
            case 1 -> $$02[0];
            case 2 -> $$02[0].and($$02[1]);
            default -> $$1 -> {
                for (Predicate $$2 : $$02) {
                    if ($$2.test($$1)) continue;
                    return false;
                }
                return true;
            };
        };
    }

    public static <T> Predicate<T> b(Predicate<T>[] $$02) {
        return switch ($$02.length) {
            case 0 -> $$0 -> false;
            case 1 -> $$02[0];
            case 2 -> $$02[0].or($$02[1]);
            default -> $$1 -> {
                for (Predicate $$2 : $$02) {
                    if (!$$2.test($$1)) continue;
                    return true;
                }
                return false;
            };
        };
    }
}

