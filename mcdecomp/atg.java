/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 */
import com.mojang.datafixers.schemas.Schema;
import java.util.Objects;

public class atg
extends awf {
    public atg(Schema $$0, boolean $$1) {
        super("EntityTippedArrowFix", $$0, $$1);
    }

    @Override
    protected String a(String $$0) {
        return Objects.equals($$0, "TippedArrow") ? "Arrow" : $$0;
    }
}

