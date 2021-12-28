package jlibxx.docmaker;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Documented
@Target({ java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER,
    java.lang.annotation.ElementType.PACKAGE, java.lang.annotation.ElementType.MODULE,
    java.lang.annotation.ElementType.CONSTRUCTOR })
public @interface ClassMaker {
  String[] constructors() default {};

  String[] methods() default {};

  String className();

  String classDescription();

  String author() default "";

  String packageName() default "";

  String version() default "";

}
