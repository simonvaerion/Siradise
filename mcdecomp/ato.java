/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class ato
extends aui {
    public ato(Schema $$02) {
        super($$02, "Remove filtered text from books", $$0 -> $$0.equals("minecraft:writable_book") || $$0.equals("minecraft:written_book"));
    }

    @Override
    protected <T> Dynamic<T> a(Dynamic<T> $$0) {
        return $$0.remove("filtered_title").remove("filtered_pages");
    }
}

