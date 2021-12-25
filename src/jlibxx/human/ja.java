package jlibxx.human;

import jlibxx.util.lang.LanguageObject;

/**
 * @author Jack Meng
 * @since 1.1
 * <p>
 * This enum constant holds
 * the values for transcribing
 * and validating characters relating
 * to the language of traditional
 * Japanese Text
 * </p>
 */

public enum ja {
  JAPANESE_REGEX(
      "^[\\u3040-\\u309F\\u30A0-\\u30FF\\uFF00-\\uFFEF\\u4E00-\\u9FAF\\u2605-\\u2606\\u2190-\\u2195\\u203B]+$");

  private String s;

  ja(String s) {
    this.s = s;
  }
  
  /**
   * <p>There are two versions of the following methods
   *    with the only difference being that one takes a
   *    standard LanguageObject, while the other interprets
   *    using a String
   * </p>
   * @return A true or false representing if the String is Japanese or not
   */
  public static boolean isJapanese(String s) {
    return s.matches(JAPANESE_REGEX.s);
  }

  public static boolean isJapanese(LanguageObject obj) {
    return isJapanese(obj.toString());
  }

}
