/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class adc
extends alb {
    private static final Logger a = LogUtils.getLogger();
    private static final Gson b = new GsonBuilder().create();
    private af c = new af();
    private final dzn d;

    public adc(dzn $$0) {
        super(b, "advancements");
        this.d = $$0;
    }

    @Override
    protected void a(Map<acq, JsonElement> $$0, akx $$12, ban $$22) {
        HashMap $$3 = Maps.newHashMap();
        $$0.forEach(($$1, $$2) -> {
            try {
                JsonObject $$3 = aor.m($$2, "advancement");
                ae.a $$4 = ae.a.a($$3, new be((acq)$$1, this.d));
                $$3.put($$1, $$4);
            }
            catch (Exception $$5) {
                a.error("Parsing error loading custom advancement {}: {}", $$1, (Object)$$5.getMessage());
            }
        });
        af $$4 = new af();
        $$4.a($$3);
        for (ae $$5 : $$4.b()) {
            if ($$5.d() == null) continue;
            aq.a($$5);
        }
        this.c = $$4;
    }

    @Nullable
    public ae a(acq $$0) {
        return this.c.a($$0);
    }

    public Collection<ae> a() {
        return this.c.c();
    }
}

