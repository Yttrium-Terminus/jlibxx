package jlibxx.runtime.definition.deepdef;

import jlibxx.runtime.definition.DefError;

public class OccurError extends DefError {
  public OccurError() {
    super();
  }

  public OccurError(String s) {
    super(s);
  }

  public OccurError(Throwable cause) {
    super(cause);
  }
}
