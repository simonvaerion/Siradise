/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aha
implements agx {
    static final SuggestionProvider<ds> b = ($$0, $$1) -> du.a(aha.a((CommandContext<ds>)$$0).a(), $$1);
    public static final Function<String, agy.c> a = $$0 -> new agy.c((String)$$0){
        final /* synthetic */ String a;
        {
            this.a = string;
        }

        @Override
        public agx a(CommandContext<ds> $$0) {
            return new aha(aha.a($$0), eq.e($$0, this.a));
        }

        @Override
        public ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> $$1) {
            return $$0.then(dt.a("storage").then($$1.apply((ArgumentBuilder<ds, ?>)dt.a(this.a, eq.a()).suggests(b))));
        }
    };
    private final dyr c;
    private final acq d;

    static dyr a(CommandContext<ds> $$0) {
        return ((ds)$$0.getSource()).l().aG();
    }

    aha(dyr $$0, acq $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public void a(qr $$0) {
        this.c.a(this.d, $$0);
    }

    @Override
    public qr a() {
        return this.c.a(this.d);
    }

    @Override
    public sw b() {
        return sw.a("commands.data.storage.modified", this.d);
    }

    @Override
    public sw a(rk $$0) {
        return sw.a("commands.data.storage.query", this.d, rd.c($$0));
    }

    @Override
    public sw a(eh.g $$0, double $$1, int $$2) {
        return sw.a("commands.data.storage.get", $$0, this.d, String.format(Locale.ROOT, "%.2f", $$1), $$2);
    }
}

