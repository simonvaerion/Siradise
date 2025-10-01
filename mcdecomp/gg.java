/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface gg<A extends ArgumentType<?>, T extends a<A>> {
    public void a(T var1, sf var2);

    public T b(sf var1);

    public void a(T var1, JsonObject var2);

    public T a(A var1);

    public static interface a<A extends ArgumentType<?>> {
        public A b(dm var1);

        public gg<A, ?> a();
    }
}

