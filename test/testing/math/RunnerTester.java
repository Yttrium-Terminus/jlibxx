package testing.math;

import jlibxx.Runner;
import jlibxx.runtime.definition.deepdef.OccurError;

public class RunnerTester {
  public static void main(String[] args) {
    try {
      Runner.init();
    } catch (OccurError e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
