package jlibxx.internal;

public abstract class InternalCaller {

  
  /** 
   * @return boolean
   */
  public static boolean isGccCompilerAvailable() {
    try {
      Process p = Runtime.getRuntime().exec("gcc");
      p.waitFor();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  
  /** 
   * @return boolean
   */
  public static boolean isGppCompilerAvailable() {
    try {
      Process p = Runtime.getRuntime().exec("g++");
      p.waitFor();
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
