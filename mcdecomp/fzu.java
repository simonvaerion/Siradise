/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.time.Duration;
import javax.annotation.Nullable;

public class fzu {
    private final boolean a;
    @Nullable
    private final Duration b;

    public fzu(boolean $$0, @Nullable Duration $$1) {
        this.b = $$1;
        this.a = $$0;
    }

    public void a(fzk $$02) {
        if (this.b != null) {
            $$02.send(fzl.d, $$0 -> {
                $$0.a(fzn.x, (int)this.b.toMillis());
                $$0.a(fzn.y, this.a);
            });
        }
    }
}

