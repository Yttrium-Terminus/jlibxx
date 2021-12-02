package jlibxx.runtime;

public class Error extends Throwable {
  public Error(Throwable cause) {
    super(cause);
  }

  public Error(String msg, Throwable cause) {
    super(msg, cause);
  }

  public Error() {
    super();
  }

  public Error(String msg) {
    super(msg);
  }

  public Error(Exception e) {
    e.printStackTrace();
  }

  protected Error(String msg, Throwable cause, boolean suppression, boolean stackTrace) {
    super(msg, cause, suppression, stackTrace);
  }
}
