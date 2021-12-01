package jlibxx.human;

public enum ch {

  CHINESE_REGEX("[\\u4e00-\\u9fa5]");

  private String parts;

  ch(String s) {
    parts = s;
  }

  public static boolean isChinese(String s) {
    return s.matches(CHINESE_REGEX.toString());
  }
  public static boolean isChinese(jlibxx.util.lang.LanguageObject obj) {
    return obj.toString().matches(CHINESE_REGEX.toString());
  }

}
