package jlibxx.human;

import jlibxx.util.lang.LanguageObject;

public enum ja {
  // enum constant to hold the japanese regex
  JAPANESE_REGEX("^[\\u3040-\\u309F\\u30A0-\\u30FF\\uFF00-\\uFFEF\\u4E00-\\u9FAF\\u2605-\\u2606\\u2190-\\u2195\\u203B]+$");
  private String s;
  ja(String s) {
    this.s = s;
  }
  public static boolean isJapanese(String s) {
    return s.matches(JAPANESE_REGEX.s);
  }
  public static boolean isJapanese(LanguageObject obj) {
    return isJapanese(obj.toString());
  }
  
}
