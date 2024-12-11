package ADVANCE_JAVA.ANNOTATION;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface VeryImportantMethod {
    // ! For param, we can only use rimitives like int, long and array and string also
    int times() default 1;
}
