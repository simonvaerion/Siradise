/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.BiFunction;

public class ebb {
    public static final BiFunction<cfz, dzk, cfz> a = ($$0, $$1) -> $$0;
    public static final eba b = ebb.a("set_count", new ebj.a());
    public static final eba c = ebb.a("enchant_with_levels", new eas.b());
    public static final eba d = ebb.a("enchant_randomly", new ear.b());
    public static final eba e = ebb.a("set_enchantments", new ebh.b());
    public static final eba f = ebb.a("set_nbt", new ebn.a());
    public static final eba g = ebb.a("furnace_smelt", new ebq.a());
    public static final eba h = ebb.a("looting_enchant", new ebc.b());
    public static final eba i = ebb.a("set_damage", new ebk.a());
    public static final eba j = ebb.a("set_attributes", new ebd.d());
    public static final eba k = ebb.a("set_name", new ebm.a());
    public static final eba l = ebb.a("exploration_map", new eat.b());
    public static final eba m = ebb.a("set_stew_effect", new ebp.b());
    public static final eba n = ebb.a("copy_name", new eap.b());
    public static final eba o = ebb.a("set_contents", new ebf.b());
    public static final eba p = ebb.a("limit_count", new eax.a());
    public static final eba q = ebb.a("apply_bonus", new eam.e());
    public static final eba r = ebb.a("set_loot_table", new ebg.a());
    public static final eba s = ebb.a("explosion_decay", new ean.a());
    public static final eba t = ebb.a("set_lore", new ebl.b());
    public static final eba u = ebb.a("fill_player_head", new eau.a());
    public static final eba v = ebb.a("copy_nbt", new eaq.d());
    public static final eba w = ebb.a("copy_state", new eao.b());
    public static final eba x = ebb.a("set_banner_pattern", new ebe.b());
    public static final eba y = ebb.a("set_potion", new ebo.a());
    public static final eba z = ebb.a("set_instrument", new ebi.a());
    public static final eba A = ebb.a("reference", new eav.a());

    private static eba a(String $$0, dzt<? extends eaz> $$1) {
        return hr.a(jb.H, new acq($$0), new eba($$1));
    }

    public static Object a() {
        return dzi.a(jb.H, "function", "function", eaz::b).a();
    }

    public static BiFunction<cfz, dzk, cfz> a(BiFunction<cfz, dzk, cfz>[] $$0) {
        switch ($$0.length) {
            case 0: {
                return a;
            }
            case 1: {
                return $$0[0];
            }
            case 2: {
                BiFunction<cfz, dzk, cfz> $$12 = $$0[0];
                BiFunction<cfz, dzk, cfz> $$22 = $$0[1];
                return ($$2, $$3) -> (cfz)$$22.apply((cfz)$$12.apply((cfz)$$2, (dzk)$$3), (dzk)$$3);
            }
        }
        return ($$1, $$2) -> {
            for (BiFunction $$3 : $$0) {
                $$1 = (cfz)$$3.apply($$1, $$2);
            }
            return $$1;
        };
    }
}

