/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import javax.annotation.Nullable;

public final class ss
extends Record {
    private final st j;
    private final st k;
    public static final Codec<ss> a = RecordCodecBuilder.create($$0 -> $$0.group((App)st.a.fieldOf("chat").forGetter(ss::a), (App)st.a.fieldOf("narration").forGetter(ss::b)).apply((Applicative)$$0, ss::new));
    public static final st b = st.a("chat.type.text");
    public static final acp<ss> c = ss.a("chat");
    public static final acp<ss> d = ss.a("say_command");
    public static final acp<ss> e = ss.a("msg_command_incoming");
    public static final acp<ss> f = ss.a("msg_command_outgoing");
    public static final acp<ss> g = ss.a("team_msg_command_incoming");
    public static final acp<ss> h = ss.a("team_msg_command_outgoing");
    public static final acp<ss> i = ss.a("emote_command");

    public ss(st $$0, st $$1) {
        this.j = $$0;
        this.k = $$1;
    }

    private static acp<ss> a(String $$0) {
        return acp.a(jc.aq, new acq($$0));
    }

    public static void a(nm<ss> $$0) {
        $$0.a(c, new ss(b, st.a("chat.type.text.narrate")));
        $$0.a(d, new ss(st.a("chat.type.announcement"), st.a("chat.type.text.narrate")));
        $$0.a(e, new ss(st.b("commands.message.display.incoming"), st.a("chat.type.text.narrate")));
        $$0.a(f, new ss(st.c("commands.message.display.outgoing"), st.a("chat.type.text.narrate")));
        $$0.a(g, new ss(st.d("chat.type.team.text"), st.a("chat.type.text.narrate")));
        $$0.a(h, new ss(st.d("chat.type.team.sent"), st.a("chat.type.text.narrate")));
        $$0.a(i, new ss(st.a("chat.type.emote"), st.a("chat.type.emote")));
    }

    public static a a(acp<ss> $$0, bfj $$1) {
        return ss.a($$0, $$1.dI().B_(), $$1.H_());
    }

    public static a a(acp<ss> $$0, ds $$1) {
        return ss.a($$0, $$1.v(), $$1.b());
    }

    public static a a(acp<ss> $$0, hs $$1, sw $$2) {
        hr<ss> $$3 = $$1.d(jc.aq);
        return $$3.e($$0).a($$2);
    }

    public a a(sw $$0) {
        return new a(this, $$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ss.class, "chat;narration", "j", "k"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ss.class, "chat;narration", "j", "k"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ss.class, "chat;narration", "j", "k"}, this, $$0);
    }

    public st a() {
        return this.j;
    }

    public st b() {
        return this.k;
    }

    public record a(ss a, sw b, @Nullable sw c) {
        a(ss $$0, sw $$1) {
            this($$0, $$1, null);
        }

        public sw a(sw $$0) {
            return this.a.a().a($$0, this);
        }

        public sw b(sw $$0) {
            return this.a.b().a($$0, this);
        }

        public a c(sw $$0) {
            return new a(this.a, this.b, $$0);
        }

        public b a(hs $$0) {
            hr<ss> $$1 = $$0.d(jc.aq);
            return new b($$1.a(this.a), this.b, this.c);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "chatType;name;targetName", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "chatType;name;targetName", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "chatType;name;targetName", "a", "b", "c"}, this, $$0);
        }
    }

    public record b(int a, sw b, @Nullable sw c) {
        public b(sf $$0) {
            this($$0.m(), $$0.l(), (sw)$$0.c(sf::l));
        }

        public void a(sf $$0) {
            $$0.d(this.a);
            $$0.a(this.b);
            $$0.a(this.c, sf::a);
        }

        public Optional<a> a(hs $$02) {
            hr<ss> $$1 = $$02.d(jc.aq);
            ss $$2 = (ss)$$1.a(this.a);
            return Optional.ofNullable($$2).map($$0 -> new a((ss)$$0, this.b, this.c));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "chatType;name;targetName", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "chatType;name;targetName", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "chatType;name;targetName", "a", "b", "c"}, this, $$0);
        }
    }
}

