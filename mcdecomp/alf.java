/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.annotation.Nullable;

public abstract class alf<T>
extends alo<T> {
    public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.ROOT);
    public static final String b = "forever";
    protected final Date c;
    protected final String d;
    @Nullable
    protected final Date e;
    protected final String f;

    public alf(T $$0, @Nullable Date $$1, @Nullable String $$2, @Nullable Date $$3, @Nullable String $$4) {
        super($$0);
        this.c = $$1 == null ? new Date() : $$1;
        this.d = $$2 == null ? "(Unknown)" : $$2;
        this.e = $$3;
        this.f = $$4 == null ? "Banned by an operator." : $$4;
    }

    protected alf(T $$0, JsonObject $$1) {
        super($$0);
        Object $$7;
        Date $$4;
        try {
            Date $$2 = $$1.has("created") ? a.parse($$1.get("created").getAsString()) : new Date();
        }
        catch (ParseException $$3) {
            $$4 = new Date();
        }
        this.c = $$4;
        this.d = $$1.has("source") ? $$1.get("source").getAsString() : "(Unknown)";
        try {
            Date $$5 = $$1.has("expires") ? a.parse($$1.get("expires").getAsString()) : null;
        }
        catch (ParseException $$6) {
            $$7 = null;
        }
        this.e = $$7;
        this.f = $$1.has("reason") ? $$1.get("reason").getAsString() : "Banned by an operator.";
    }

    public Date a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    @Nullable
    public Date c() {
        return this.e;
    }

    public String d() {
        return this.f;
    }

    public abstract sw e();

    @Override
    boolean f() {
        if (this.e == null) {
            return false;
        }
        return this.e.before(new Date());
    }

    @Override
    protected void a(JsonObject $$0) {
        $$0.addProperty("created", a.format(this.c));
        $$0.addProperty("source", this.d);
        $$0.addProperty("expires", this.e == null ? b : a.format(this.e));
        $$0.addProperty("reason", this.f);
    }
}

