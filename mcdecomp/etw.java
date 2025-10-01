/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  javax.annotation.Nullable
 */
import com.google.common.hash.Hashing;
import javax.annotation.Nullable;

public class etw
implements AutoCloseable {
    private static final acq a = new acq("textures/misc/unknown_server.png");
    private static final int b = 64;
    private static final int c = 64;
    private final fuw d;
    private final acq e;
    @Nullable
    private fui f;
    private boolean g;

    private etw(fuw $$0, acq $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public static etw a(fuw $$0, String $$1) {
        return new etw($$0, new acq("minecraft", "worlds/" + ac.a($$1, acq::b) + "/" + Hashing.sha1().hashUnencodedChars((CharSequence)$$1) + "/icon"));
    }

    public static etw b(fuw $$0, String $$1) {
        return new etw($$0, new acq("minecraft", "servers/" + Hashing.sha1().hashUnencodedChars((CharSequence)$$1) + "/icon"));
    }

    public void a(ehk $$0) {
        if ($$0.a() != 64 || $$0.b() != 64) {
            $$0.close();
            throw new IllegalArgumentException("Icon must be 64x64, but was " + $$0.a() + "x" + $$0.b());
        }
        try {
            this.c();
            if (this.f == null) {
                this.f = new fui($$0);
            } else {
                this.f.a($$0);
                this.f.d();
            }
            this.d.a(this.e, (fug)this.f);
        }
        catch (Throwable $$1) {
            $$0.close();
            this.a();
            throw $$1;
        }
    }

    public void a() {
        this.c();
        if (this.f != null) {
            this.d.c(this.e);
            this.f.close();
            this.f = null;
        }
    }

    public acq b() {
        return this.f != null ? this.e : a;
    }

    @Override
    public void close() {
        this.a();
        this.g = true;
    }

    private void c() {
        if (this.g) {
            throw new IllegalStateException("Icon already closed");
        }
    }
}

