/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletionException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;

public class o {
    private static final Logger a = LogUtils.getLogger();
    private static final DateTimeFormatter b = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.ROOT);
    private final String c;
    private final Throwable d;
    private final List<p> e = Lists.newArrayList();
    private File f;
    private boolean g = true;
    private StackTraceElement[] h = new StackTraceElement[0];
    private final ab i = new ab();

    public o(String $$0, Throwable $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public String a() {
        return this.c;
    }

    public Throwable b() {
        return this.d;
    }

    public String c() {
        StringBuilder $$0 = new StringBuilder();
        this.a($$0);
        return $$0.toString();
    }

    public void a(StringBuilder $$0) {
        if (!(this.h != null && this.h.length > 0 || this.e.isEmpty())) {
            this.h = (StackTraceElement[])ArrayUtils.subarray((Object[])this.e.get(0).a(), (int)0, (int)1);
        }
        if (this.h != null && this.h.length > 0) {
            $$0.append("-- Head --\n");
            $$0.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
            $$0.append("Stacktrace:\n");
            for (StackTraceElement $$1 : this.h) {
                $$0.append("\t").append("at ").append($$1);
                $$0.append("\n");
            }
            $$0.append("\n");
        }
        for (p $$2 : this.e) {
            $$2.a($$0);
            $$0.append("\n\n");
        }
        this.i.a($$0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String d() {
        String string;
        StringWriter $$0 = null;
        PrintWriter $$1 = null;
        Throwable $$2 = this.d;
        if ($$2.getMessage() == null) {
            if ($$2 instanceof NullPointerException) {
                $$2 = new NullPointerException(this.c);
            } else if ($$2 instanceof StackOverflowError) {
                $$2 = new StackOverflowError(this.c);
            } else if ($$2 instanceof OutOfMemoryError) {
                $$2 = new OutOfMemoryError(this.c);
            }
            $$2.setStackTrace(this.d.getStackTrace());
        }
        try {
            $$0 = new StringWriter();
            $$1 = new PrintWriter($$0);
            $$2.printStackTrace($$1);
            string = $$0.toString();
        }
        catch (Throwable throwable) {
            IOUtils.closeQuietly((Writer)$$0);
            IOUtils.closeQuietly($$1);
            throw throwable;
        }
        IOUtils.closeQuietly((Writer)$$0);
        IOUtils.closeQuietly((Writer)$$1);
        return string;
    }

    public String e() {
        StringBuilder $$0 = new StringBuilder();
        $$0.append("---- Minecraft Crash Report ----\n");
        $$0.append("// ");
        $$0.append(o.i());
        $$0.append("\n\n");
        $$0.append("Time: ");
        $$0.append(b.format(ZonedDateTime.now()));
        $$0.append("\n");
        $$0.append("Description: ");
        $$0.append(this.c);
        $$0.append("\n\n");
        $$0.append(this.d());
        $$0.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
        for (int $$1 = 0; $$1 < 87; ++$$1) {
            $$0.append("-");
        }
        $$0.append("\n\n");
        this.a($$0);
        return $$0.toString();
    }

    public File f() {
        return this.f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(File $$0) {
        boolean bl2;
        if (this.f != null) {
            return false;
        }
        if ($$0.getParentFile() != null) {
            $$0.getParentFile().mkdirs();
        }
        OutputStreamWriter $$1 = null;
        try {
            $$1 = new OutputStreamWriter((OutputStream)new FileOutputStream($$0), StandardCharsets.UTF_8);
            $$1.write(this.e());
            this.f = $$0;
            bl2 = true;
        }
        catch (Throwable $$2) {
            boolean bl3;
            try {
                a.error("Could not save crash report to {}", (Object)$$0, (Object)$$2);
                bl3 = false;
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly($$1);
                throw throwable;
            }
            IOUtils.closeQuietly((Writer)$$1);
            return bl3;
        }
        IOUtils.closeQuietly((Writer)$$1);
        return bl2;
    }

    public ab g() {
        return this.i;
    }

    public p a(String $$0) {
        return this.a($$0, 1);
    }

    public p a(String $$0, int $$1) {
        p $$2 = new p($$0);
        if (this.g) {
            int $$3 = $$2.a($$1);
            StackTraceElement[] $$4 = this.d.getStackTrace();
            StackTraceElement $$5 = null;
            StackTraceElement $$6 = null;
            int $$7 = $$4.length - $$3;
            if ($$7 < 0) {
                System.out.println("Negative index in crash report handler (" + $$4.length + "/" + $$3 + ")");
            }
            if ($$4 != null && 0 <= $$7 && $$7 < $$4.length) {
                $$5 = $$4[$$7];
                if ($$4.length + 1 - $$3 < $$4.length) {
                    $$6 = $$4[$$4.length + 1 - $$3];
                }
            }
            this.g = $$2.a($$5, $$6);
            if ($$4 != null && $$4.length >= $$3 && 0 <= $$7 && $$7 < $$4.length) {
                this.h = new StackTraceElement[$$7];
                System.arraycopy($$4, 0, this.h, 0, this.h.length);
            } else {
                this.g = false;
            }
        }
        this.e.add($$2);
        return $$2;
    }

    private static String i() {
        String[] $$0 = new String[]{"Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine."};
        try {
            return $$0[(int)(ac.c() % (long)$$0.length)];
        }
        catch (Throwable $$1) {
            return "Witty comment unavailable :(";
        }
    }

    public static o a(Throwable $$0, String $$1) {
        o $$3;
        while ($$0 instanceof CompletionException && $$0.getCause() != null) {
            $$0 = $$0.getCause();
        }
        if ($$0 instanceof y) {
            o $$2 = ((y)$$0).a();
        } else {
            $$3 = new o($$1, $$0);
        }
        return $$3;
    }

    public static void h() {
        aoy.a();
        new o("Don't panic!", new Throwable()).e();
    }
}

