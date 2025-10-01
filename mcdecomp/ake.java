/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public abstract class ake
implements akk {
    private static final Logger b = LogUtils.getLogger();
    public static final String a = "vanilla";
    private final ajm c;
    private final ajo d;
    private final acq e;

    public ake(ajm $$0, ajo $$1, acq $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    @Override
    public void a(Consumer<akg> $$0) {
        akg $$1 = this.a(this.d);
        if ($$1 != null) {
            $$0.accept($$1);
        }
        this.b($$0);
    }

    @Nullable
    protected abstract akg a(ajl var1);

    protected abstract sw a(String var1);

    public ajo a() {
        return this.d;
    }

    private void b(Consumer<akg> $$0) {
        HashMap<String, Function> $$12 = new HashMap<String, Function>();
        this.a($$12::put);
        $$12.forEach(($$1, $$2) -> {
            akg $$3 = (akg)$$2.apply($$1);
            if ($$3 != null) {
                $$0.accept($$3);
            }
        });
    }

    protected void a(BiConsumer<String, Function<String, akg>> $$0) {
        this.d.a(this.c, this.e, (Path $$1) -> this.a((Path)$$1, $$0));
    }

    protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, akg>> $$1) {
        if ($$0 != null && Files.isDirectory($$0, new LinkOption[0])) {
            try {
                akf.a($$0, true, (Path $$12, akg.c $$2) -> $$1.accept(ake.a($$12), $$1 -> this.a((String)$$1, (akg.c)$$2, this.a((String)$$1))));
            }
            catch (IOException $$22) {
                b.warn("Failed to discover packs in {}", (Object)$$0, (Object)$$22);
            }
        }
    }

    private static String a(Path $$0) {
        return StringUtils.removeEnd((String)$$0.getFileName().toString(), (String)".zip");
    }

    @Nullable
    protected abstract akg a(String var1, akg.c var2, sw var3);
}

