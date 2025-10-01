/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  javax.annotation.Nullable
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public interface sx {
    public static final sx a = new sx(){

        public String toString() {
            return "empty";
        }
    };

    default public <T> Optional<T> a(ta.b<T> $$0, ts $$1) {
        return Optional.empty();
    }

    default public <T> Optional<T> a(ta.a<T> $$0) {
        return Optional.empty();
    }

    default public tj a(@Nullable ds $$0, @Nullable bfj $$1, int $$2) throws CommandSyntaxException {
        return tj.a(this);
    }
}

