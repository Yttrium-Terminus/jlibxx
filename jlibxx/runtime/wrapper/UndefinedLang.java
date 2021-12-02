package jlibxx.runtime.wrapper;

public class UndefinedLang extends Error {
  public UndefinedLang(String s) {
    super(s);
  }

  public UndefinedLang() {
    super();
  }

  public UndefinedLang(Throwable cause) {
    super(cause);
  }

  public UndefinedLang(ArithmeticException e) {
    super(e);
  }

  public UndefinedLang(Exception e) {
    super(e);
  }

  public UndefinedLang(String message, Throwable cause) {
    super(message, cause);
  }
}
