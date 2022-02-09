package jlibxx.internal;

public abstract class Program {
  public static void exit(int status) {
    System.exit(status);
  }

  public void exit(String message) {
    System.out.println(message);
    System.exit(1);
  }
}
