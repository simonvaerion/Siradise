/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.context.StringRange
 *  com.mojang.brigadier.suggestion.Suggestion
 *  com.mojang.brigadier.suggestion.Suggestions
 */
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;

public class vh
implements uo<ur> {
    private final int a;
    private final Suggestions b;

    public vh(int $$0, Suggestions $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public vh(sf $$0) {
        this.a = $$0.m();
        int $$12 = $$0.m();
        int $$2 = $$0.m();
        StringRange $$3 = StringRange.between((int)$$12, (int)($$12 + $$2));
        List $$4 = $$0.a($$1 -> {
            String $$2 = $$1.s();
            sw $$3 = (sw)$$1.c(sf::l);
            return new Suggestion($$3, $$2, (Message)$$3);
        });
        this.b = new Suggestions($$3, $$4);
    }

    @Override
    public void a(sf $$0) {
        $$0.d(this.a);
        $$0.d(this.b.getRange().getStart());
        $$0.d(this.b.getRange().getLength());
        $$0.a(this.b.getList(), ($$02, $$12) -> {
            $$02.a($$12.getText());
            $$02.a($$12.getTooltip(), ($$0, $$1) -> $$0.a(sy.a($$1)));
        });
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    public int a() {
        return this.a;
    }

    public Suggestions c() {
        return this.b;
    }
}

