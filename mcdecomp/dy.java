/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 */
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class dy
implements ArgumentType<sw> {
    private static final Collection<String> b = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
    public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> sw.a("argument.component.invalid", $$0));

    private dy() {
    }

    public static sw a(CommandContext<ds> $$0, String $$1) {
        return (sw)$$0.getArgument($$1, sw.class);
    }

    public static dy a() {
        return new dy();
    }

    public sw a(StringReader $$0) throws CommandSyntaxException {
        try {
            tj $$1 = sw.a.a($$0);
            if ($$1 == null) {
                throw a.createWithContext((ImmutableStringReader)$$0, (Object)"empty");
            }
            return $$1;
        }
        catch (Exception $$2) {
            String $$3 = $$2.getCause() != null ? $$2.getCause().getMessage() : $$2.getMessage();
            throw a.createWithContext((ImmutableStringReader)$$0, (Object)$$3);
        }
    }

    public Collection<String> getExamples() {
        return b;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

