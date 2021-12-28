package jlibxx.docmaker;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Documented
@Target({ java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD,
    java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.PARAMETER })
public @interface MethodMaker {
  String methodName();

  String methodDescription();

  String[] params();

  String[] paramsType();

  String[] paramsName();

  String[] paramsDefault();

  String[] paramsDescription();

  String author();

  String version();
}
