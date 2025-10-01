/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.context.CommandContextBuilder
 *  com.mojang.brigadier.context.ParsedArgument
 *  com.mojang.brigadier.context.ParsedCommandNode
 *  com.mojang.brigadier.tree.ArgumentCommandNode
 *  com.mojang.brigadier.tree.CommandNode
 */
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;

public record tn<S>(List<a<S>> a) {
    public static <S> tn<S> a(ParseResults<S> $$0) {
        CommandContextBuilder $$5;
        CommandContextBuilder $$2;
        String $$1 = $$0.getReader().getString();
        CommandContextBuilder $$3 = $$2 = $$0.getContext();
        List<a<S>> $$4 = tn.a($$1, $$3);
        while (($$5 = $$3.getChild()) != null) {
            boolean $$6;
            boolean bl2 = $$6 = $$5.getRootNode() != $$2.getRootNode();
            if (!$$6) break;
            $$4.addAll(tn.a($$1, $$5));
            $$3 = $$5;
        }
        return new tn<S>($$4);
    }

    private static <S> List<a<S>> a(String $$0, CommandContextBuilder<S> $$1) {
        ArrayList<a<S>> $$2 = new ArrayList<a<S>>();
        for (ParsedCommandNode $$3 : $$1.getNodes()) {
            ParsedArgument $$5;
            ArgumentCommandNode $$4;
            CommandNode commandNode = $$3.getNode();
            if (!(commandNode instanceof ArgumentCommandNode) || !(($$4 = (ArgumentCommandNode)commandNode).getType() instanceof ev) || ($$5 = (ParsedArgument)$$1.getArguments().get($$4.getName())) == null) continue;
            String $$6 = $$5.getRange().get($$0);
            $$2.add(new a($$4, $$6));
        }
        return $$2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{tn.class, "arguments", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{tn.class, "arguments", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{tn.class, "arguments", "a"}, this, $$0);
    }

    public record a<S>(ArgumentCommandNode<S, ?> a, String b) {
        private final ArgumentCommandNode<S, ?> a;
        private final String b;

        public String a() {
            return this.a.getName();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "node;value", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "node;value", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "node;value", "a", "b"}, this, $$0);
        }

        public ArgumentCommandNode<S, ?> b() {
            return this.a;
        }

        public String c() {
            return this.b;
        }
    }
}

