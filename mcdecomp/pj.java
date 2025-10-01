/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.METHOD})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface pj {
    public int a() default 100;

    public String b() default "defaultBatch";

    public int c() default 0;

    public boolean d() default true;

    public String e() default "";

    public long f() default 0L;

    public int g() default 1;

    public int h() default 1;
}

