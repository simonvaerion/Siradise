/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.tree.ArgumentCommandNode
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  com.mojang.brigadier.tree.RootCommandNode
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.ints.IntSets
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Queues;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayDeque;
import java.util.List;
import java.util.function.BiPredicate;
import javax.annotation.Nullable;

public class vi
implements uo<ur> {
    private static final byte a = 3;
    private static final byte b = 4;
    private static final byte c = 8;
    private static final byte d = 16;
    private static final byte e = 0;
    private static final byte f = 1;
    private static final byte g = 2;
    private final int h;
    private final List<b> i;

    public vi(RootCommandNode<du> $$0) {
        Object2IntMap<CommandNode<du>> $$1 = vi.a($$0);
        this.i = vi.a($$1);
        this.h = $$1.getInt($$0);
    }

    public vi(sf $$0) {
        this.i = $$0.a(vi::b);
        this.h = $$0.m();
        vi.a(this.i);
    }

    @Override
    public void a(sf $$02) {
        $$02.a(this.i, ($$0, $$1) -> $$1.a((sf)((Object)$$0)));
        $$02.d(this.h);
    }

    private static void a(List<b> $$0, BiPredicate<b, IntSet> $$1) {
        IntOpenHashSet $$2 = new IntOpenHashSet((IntCollection)IntSets.fromTo((int)0, (int)$$0.size()));
        while (!$$2.isEmpty()) {
            boolean $$3 = $$2.removeIf(arg_0 -> vi.a($$1, $$0, (IntSet)$$2, arg_0));
            if ($$3) continue;
            throw new IllegalStateException("Server sent an impossible command tree");
        }
    }

    private static void a(List<b> $$0) {
        vi.a($$0, b::a);
        vi.a($$0, b::b);
    }

    private static Object2IntMap<CommandNode<du>> a(RootCommandNode<du> $$0) {
        CommandNode $$3;
        Object2IntOpenHashMap $$1 = new Object2IntOpenHashMap();
        ArrayDeque $$2 = Queues.newArrayDeque();
        $$2.add($$0);
        while (($$3 = (CommandNode)$$2.poll()) != null) {
            if ($$1.containsKey((Object)$$3)) continue;
            int $$4 = $$1.size();
            $$1.put((Object)$$3, $$4);
            $$2.addAll($$3.getChildren());
            if ($$3.getRedirect() == null) continue;
            $$2.add($$3.getRedirect());
        }
        return $$1;
    }

    private static List<b> a(Object2IntMap<CommandNode<du>> $$0) {
        ObjectArrayList $$1 = new ObjectArrayList($$0.size());
        $$1.size($$0.size());
        for (Object2IntMap.Entry $$2 : Object2IntMaps.fastIterable($$0)) {
            $$1.set($$2.getIntValue(), (Object)vi.a((CommandNode<du>)((CommandNode)$$2.getKey()), $$0));
        }
        return $$1;
    }

    private static b b(sf $$0) {
        byte $$1 = $$0.readByte();
        int[] $$2 = $$0.c();
        int $$3 = ($$1 & 8) != 0 ? $$0.m() : 0;
        e $$4 = vi.a($$0, $$1);
        return new b($$4, $$1, $$3, $$2);
    }

    @Nullable
    private static e a(sf $$0, byte $$1) {
        int $$2 = $$1 & 3;
        if ($$2 == 2) {
            String $$3 = $$0.s();
            int $$4 = $$0.m();
            gg $$5 = (gg)jb.x.a($$4);
            if ($$5 == null) {
                return null;
            }
            Object $$6 = $$5.b($$0);
            acq $$7 = ($$1 & 0x10) != 0 ? $$0.t() : null;
            return new a($$3, (gg.a<?>)$$6, $$7);
        }
        if ($$2 == 1) {
            String $$8 = $$0.s();
            return new c($$8);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static b a(CommandNode<du> $$0, Object2IntMap<CommandNode<du>> $$1) {
        void $$10;
        int $$4;
        int $$2 = 0;
        if ($$0.getRedirect() != null) {
            $$2 |= 8;
            int $$3 = $$1.getInt((Object)$$0.getRedirect());
        } else {
            $$4 = 0;
        }
        if ($$0.getCommand() != null) {
            $$2 |= 4;
        }
        if ($$0 instanceof RootCommandNode) {
            $$2 |= 0;
            Object $$5 = null;
        } else if ($$0 instanceof ArgumentCommandNode) {
            ArgumentCommandNode $$6 = (ArgumentCommandNode)$$0;
            a $$7 = new a($$6);
            $$2 |= 2;
            if ($$6.getCustomSuggestions() != null) {
                $$2 |= 0x10;
            }
        } else if ($$0 instanceof LiteralCommandNode) {
            LiteralCommandNode $$8 = (LiteralCommandNode)$$0;
            c $$9 = new c($$8.getLiteral());
            $$2 |= 1;
        } else {
            throw new UnsupportedOperationException("Unknown node type " + $$0);
        }
        int[] $$11 = $$0.getChildren().stream().mapToInt(arg_0 -> $$1.getInt(arg_0)).toArray();
        return new b((e)$$10, $$2, $$4, $$11);
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    public RootCommandNode<du> a(dm $$0) {
        return (RootCommandNode)new d($$0, this.i).a(this.h);
    }

    private static /* synthetic */ boolean a(BiPredicate $$0, List $$1, IntSet $$2, int $$3) {
        return $$0.test((b)$$1.get($$3), $$2);
    }

    static class b {
        @Nullable
        final e a;
        final int b;
        final int c;
        final int[] d;

        b(@Nullable e $$0, int $$1, int $$2, int[] $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public void a(sf $$0) {
            $$0.writeByte(this.b);
            $$0.a(this.d);
            if ((this.b & 8) != 0) {
                $$0.d(this.c);
            }
            if (this.a != null) {
                this.a.a($$0);
            }
        }

        public boolean a(IntSet $$0) {
            if ((this.b & 8) != 0) {
                return !$$0.contains(this.c);
            }
            return true;
        }

        public boolean b(IntSet $$0) {
            for (int $$1 : this.d) {
                if (!$$0.contains($$1)) continue;
                return false;
            }
            return true;
        }
    }

    static interface e {
        public ArgumentBuilder<du, ?> a(dm var1);

        public void a(sf var1);
    }

    static class a
    implements e {
        private final String a;
        private final gg.a<?> b;
        @Nullable
        private final acq c;

        @Nullable
        private static acq a(@Nullable SuggestionProvider<du> $$0) {
            return $$0 != null ? gk.a($$0) : null;
        }

        a(String $$0, gg.a<?> $$1, @Nullable acq $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public a(ArgumentCommandNode<du, ?> $$0) {
            this($$0.getName(), gh.b($$0.getType()), vi$a.a((SuggestionProvider<du>)$$0.getCustomSuggestions()));
        }

        @Override
        public ArgumentBuilder<du, ?> a(dm $$0) {
            Object $$1 = this.b.b($$0);
            RequiredArgumentBuilder $$2 = RequiredArgumentBuilder.argument((String)this.a, $$1);
            if (this.c != null) {
                $$2.suggests(gk.a(this.c));
            }
            return $$2;
        }

        @Override
        public void a(sf $$0) {
            $$0.a(this.a);
            vi$a.a($$0, this.b);
            if (this.c != null) {
                $$0.a(this.c);
            }
        }

        private static <A extends ArgumentType<?>> void a(sf $$0, gg.a<A> $$1) {
            vi$a.a($$0, $$1.a(), $$1);
        }

        private static <A extends ArgumentType<?>, T extends gg.a<A>> void a(sf $$0, gg<A, T> $$1, gg.a<A> $$2) {
            $$0.d(jb.x.a($$1));
            $$1.a($$2, $$0);
        }
    }

    static class c
    implements e {
        private final String a;

        c(String $$0) {
            this.a = $$0;
        }

        @Override
        public ArgumentBuilder<du, ?> a(dm $$0) {
            return LiteralArgumentBuilder.literal((String)this.a);
        }

        @Override
        public void a(sf $$0) {
            $$0.a(this.a);
        }
    }

    static class d {
        private final dm a;
        private final List<b> b;
        private final List<CommandNode<du>> c;

        d(dm $$0, List<b> $$1) {
            this.a = $$0;
            this.b = $$1;
            ObjectArrayList $$2 = new ObjectArrayList();
            $$2.size($$1.size());
            this.c = $$2;
        }

        public CommandNode<du> a(int $$02) {
            CommandNode $$5;
            CommandNode<du> $$1 = this.c.get($$02);
            if ($$1 != null) {
                return $$1;
            }
            b $$2 = this.b.get($$02);
            if ($$2.a == null) {
                RootCommandNode $$3 = new RootCommandNode();
            } else {
                ArgumentBuilder<du, ?> $$4 = $$2.a.a(this.a);
                if (($$2.b & 8) != 0) {
                    $$4.redirect(this.a($$2.c));
                }
                if (($$2.b & 4) != 0) {
                    $$4.executes($$0 -> 0);
                }
                $$5 = $$4.build();
            }
            this.c.set($$02, (CommandNode<du>)$$5);
            for (int $$6 : $$2.d) {
                CommandNode<du> $$7 = this.a($$6);
                if ($$7 instanceof RootCommandNode) continue;
                $$5.addChild($$7);
            }
            return $$5;
        }
    }
}

