/*
 * Decompiled with CFR 0.152.
 */
import java.util.IllegalFormatException;

public class fvz {
    private static volatile qm a = qm.a();

    private fvz() {
    }

    static void a(qm $$0) {
        a = $$0;
    }

    public static String a(String $$0, Object ... $$1) {
        String $$2 = a.a($$0);
        try {
            return String.format($$2, $$1);
        }
        catch (IllegalFormatException $$3) {
            return "Format error: " + $$2;
        }
    }

    public static boolean a(String $$0) {
        return a.b($$0);
    }
}

