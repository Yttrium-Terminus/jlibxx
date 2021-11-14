package jlibxx.util;

import jlibxx.human.en;

public class Encode {
  private String s;
  public Encode(String s) {
    this.s = s;
  }

  public boolean isEnglish() {
    return en.isEnglish(s.toString());
  }


  public String toHex() {
    return new Stringx(s).toHex();
  }

}
