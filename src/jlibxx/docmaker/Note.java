package jlibxx.docmaker;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.PARAMETER, ElementType.PACKAGE, ElementType.MODULE, ElementType.CONSTRUCTOR,
    ElementType.TYPE, ElementType.METHOD })
public @interface Note {
  String note() default "";
}
