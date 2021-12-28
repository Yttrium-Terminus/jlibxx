package testing;

public abstract class TesterTools {
  public static void toString(Object something) {
    System.out.println(something.toString());

  }

  public static boolean pass(Object pass, Object fail) {
    if (pass.equals(fail)) {
      return false;
    } else {
      return true;
    }
  }

}
