/*
 * Decompiled with CFR 0.152.
 */
public class dys {
    private final int b;
    private final String c;
    public static String a = "main";

    public dys(int $$0) {
        this($$0, a);
    }

    public dys(int $$0, String $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public boolean a() {
        return !this.c.equals(a);
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public boolean a(dys $$0) {
        return this.b().equals($$0.b());
    }
}

