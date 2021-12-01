package jlibxx.runtime.math;

public class AlgoError extends Error {
  public AlgoError() {
    super();
  }
  public AlgoError(String message) {
    super(message);
  }
  public AlgoError(Throwable cause) {
    super(cause);
  }
  public AlgoError(ArithmeticException e) {
    super(e);
  }
  public AlgoError(Exception e) {
    super(e);
  }
  public AlgoError(String message, Throwable cause) {
    super(message, cause);
  }
  
}
