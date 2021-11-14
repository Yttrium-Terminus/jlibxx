package jlibxx.human;

public enum en {
  alphabet_lower("abcdefghijklmnopqrstuvwxyz"), alphabet_upper("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

  private String s;
  en(String s) {
    this.s = s;
  }

  public String getContent() {
    return s;
  }

  //isEnglish
  public static boolean isEnglish(String str) {
    return str.matches("[a-zA-Z]+");
  }

}
