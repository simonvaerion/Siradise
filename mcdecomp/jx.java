/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.brigadier.CommandDispatcher
 */
import com.google.gson.JsonElement;
import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class jx
implements ji {
    private final jk d;
    private final CompletableFuture<hg.b> e;

    public jx(jk $$0, CompletableFuture<hg.b> $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    public CompletableFuture<?> a(jg $$0) {
        Path $$1 = this.d.a(jk.b.c).resolve("commands.json");
        return this.e.thenCompose($$2 -> {
            CommandDispatcher<ds> $$3 = new dt(dt.a.a, dt.a($$2)).a();
            return ji.a($$0, (JsonElement)gi.a($$3, $$3.getRoot()), $$1);
        });
    }

    @Override
    public final String a() {
        return "Command Syntax";
    }
}

