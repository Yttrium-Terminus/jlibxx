package jlibxx.runtime.definition;

import jlibxx.runtime.Error;

public class DefError extends Error {
  public DefError() {
    super();
  }
  public DefError(String s) {
    super(s);
  }
  public DefError(String s, Throwable cause) {
    super(s, cause);
  }
  public DefError(Throwable cause) {
    super(cause);
  }
}
