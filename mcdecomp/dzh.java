/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.GsonBuilder
 */
import com.google.gson.GsonBuilder;

public class dzh {
    public static GsonBuilder a() {
        return new GsonBuilder().registerTypeAdapter(dzj.class, (Object)new dzj.c()).registerTypeHierarchyAdapter(edf.class, edg.a()).registerTypeHierarchyAdapter(eck.class, ecm.a()).registerTypeHierarchyAdapter(edn.class, edo.a()).registerTypeHierarchyAdapter(dzk.b.class, (Object)new dzk.b.a());
    }

    public static GsonBuilder b() {
        return dzh.a().registerTypeHierarchyAdapter(eaf.class, ead.a()).registerTypeHierarchyAdapter(eaz.class, ebb.a()).registerTypeHierarchyAdapter(ecy.class, ecz.a());
    }

    public static GsonBuilder c() {
        return dzh.b().registerTypeAdapter(dzr.class, (Object)new dzr.b()).registerTypeAdapter(dzs.class, (Object)new dzs.b());
    }
}

