package test.io;

import java.io.ByteArrayInputStream;

import jlibxx.io.InReader;

public class TestInreader {
  public static void main(String[] args) {
    /**
     * This would return the following in the console: 0 1 2 3 4 5 6 7 8 9
     */
    InReader r = new InReader(new ByteArrayInputStream(new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
    for (int i = 0; i < 10; i++) {
      System.out.println(r.read());
    }
  }
}
