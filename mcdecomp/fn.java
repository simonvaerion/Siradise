/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class fn
implements ArgumentType<EnumSet<ha.a>> {
    private static final Collection<String> a = Arrays.asList("xyz", "x");
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("arguments.swizzle.invalid"));

    public static fn a() {
        return new fn();
    }

    public static EnumSet<ha.a> a(CommandContext<ds> $$0, String $$1) {
        return (EnumSet)$$0.getArgument($$1, EnumSet.class);
    }

    /*
     * WARNING - void declaration
     */
    public EnumSet<ha.a> a(StringReader $$0) throws CommandSyntaxException {
        EnumSet<ha.a> $$1 = EnumSet.noneOf(ha.a.class);
        while ($$0.canRead() && $$0.peek() != ' ') {
            void $$6;
            char $$2 = $$0.read();
            switch ($$2) {
                case 'x': {
                    ha.a $$3 = ha.a.a;
                    break;
                }
                case 'y': {
                    ha.a $$4 = ha.a.b;
                    break;
                }
                case 'z': {
                    ha.a $$5 = ha.a.c;
                    break;
                }
                default: {
                    throw b.create();
                }
            }
            if ($$1.contains($$6)) {
                throw b.create();
            }
            $$1.add((ha.a)$$6);
        }
        return $$1;
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

