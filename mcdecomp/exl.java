/*
 * Decompiled with CFR 0.152.
 */
public class exl {
    public static final int a = 12;
    private static final int f = 3;
    public static final int b = 3;
    public static final int c = 3;
    public static final int d = 3;
    public static final int e = 3;
    private static final int g = -267386864;
    private static final int h = 0x505000FF;
    private static final int i = 1344798847;

    public static void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        int $$6 = $$1 - 3;
        int $$7 = $$2 - 3;
        int $$8 = $$3 + 3 + 3;
        int $$9 = $$4 + 3 + 3;
        exl.c($$0, $$6, $$7 - 1, $$8, $$5, -267386864);
        exl.c($$0, $$6, $$7 + $$9, $$8, $$5, -267386864);
        exl.b($$0, $$6, $$7, $$8, $$9, $$5, -267386864);
        exl.b($$0, $$6 - 1, $$7, $$9, $$5, -267386864);
        exl.b($$0, $$6 + $$8, $$7, $$9, $$5, -267386864);
        exl.a($$0, $$6, $$7 + 1, $$8, $$9, $$5, 0x505000FF, 1344798847);
    }

    private static void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
        exl.a($$0, $$1, $$2, $$4 - 2, $$5, $$6, $$7);
        exl.a($$0, $$1 + $$3 - 1, $$2, $$4 - 2, $$5, $$6, $$7);
        exl.c($$0, $$1, $$2 - 1, $$3, $$5, $$6);
        exl.c($$0, $$1, $$2 - 1 + $$4 - 1, $$3, $$5, $$7);
    }

    private static void b(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        $$0.a($$1, $$2, $$1 + 1, $$2 + $$3, $$4, $$5);
    }

    private static void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
        $$0.a($$1, $$2, $$1 + 1, $$2 + $$3, $$4, $$5, $$6);
    }

    private static void c(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        $$0.a($$1, $$2, $$1 + $$3, $$2 + 1, $$4, $$5);
    }

    private static void b(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
        $$0.a($$1, $$2, $$1 + $$3, $$2 + $$4, $$5, $$6);
    }
}

