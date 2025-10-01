/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public interface it {
    public iu<?> b();

    public void a(sf var1);

    public String a();

    @Deprecated
    public static interface a<T extends it> {
        public T b(iu<T> var1, StringReader var2) throws CommandSyntaxException;

        public T b(iu<T> var1, sf var2);
    }
}

