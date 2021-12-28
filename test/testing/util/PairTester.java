package testing.util;

import testing.TesterTools;
import jlibxx.util.Pair;

public class PairTester extends TesterTools{
  public static void main(String[] args) {
    Pair<Integer, Integer> pair = new Pair<>(1, 2);
    toString((pair.getFirst() == 1 ? "Passed | " + pair.getFirst() : "Failed | " + pair.getFirst()));
    toString((pair.getSecond() == 2 ? "Passed | " + pair.getSecond() : "Failed | " + pair.getSecond()));
  }
  public static void then(Runnable block) {
    block.run();
  }
  

}
