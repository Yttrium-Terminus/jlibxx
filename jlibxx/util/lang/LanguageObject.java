package jlibxx.util.lang;

/**
 * <h1>LanguageObject</h1>
 * <p>A LanguageObject is a special object used for the language-specific of human language.</p>
 * <p>It can be used to analyze certain strings, etc.</p>
 * 
 * @author Jack Meng
 * @version 1
 * @since 1.2
 * @see jlibxx.human
 */

import jlibxx.human.en;
import jlibxx.human.ch;
import jlibxx.human.ja;

public class LanguageObject {
  String language_holder;
  int valid_serial = 5839;

  /**
   * <p>
   * Overloaded Constructors
   * </p>
   * <p>
   * Each will take a different value, however, they will all be parsed to a
   * String
   * </p>
   * 
   * <ul>
   * <li>{@code new LanguageObject(String language_holder)}</li>
   * <li>{@code new LanguageObject(new LanguageObject(""))}</li>
   * <li>{@code new LanguageObject(Object j)}</li>
   */
  public LanguageObject(String s) {
    language_holder = s;
    assert valid_serial == 5839;
  }

  /**
   * <p>
   * Overloaded Constructors
   * </p>
   * <p>
   * Each will take a different value, however, they will all be parsed to a
   * String
   * </p>
   * 
   * <ul>
   * <li>{@code new LanguageObject(String language_holder)}</li>
   * <li>{@code new LanguageObject(new LanguageObject(""))}</li>
   * <li>{@code new LanguageObject(Object j)}</li>
   */
  public LanguageObject(LanguageObject object) {
    language_holder = object.toString();
    assert valid_serial == 5839;
  }

  /**
   * <p>
   * Overloaded Constructors
   * </p>
   * <p>
   * Each will take a different value, however, they will all be parsed to a
   * String
   * </p>
   * 
   * <ul>
   * <li>{@code new LanguageObject(String language_holder)}</li>
   * <li>{@code new LanguageObject(new LanguageObject(""))}</li>
   * <li>{@code new LanguageObject(Object j)}</li>
   */
  public LanguageObject(Object object) {
    language_holder = object.toString();
    assert valid_serial == 5839;
  }

  /**
   * <p>This method attempts to use the language-specific enum to match the regex
   * @see jlibxx.human.en
   * @return Whether or not the language-specific enum matches the regex
   */
  public boolean matchEnglish() {
    return en.isEnglish(language_holder);
  }

  /**
   * <p>
   * This method attempts to use the language-specific enum to match the regex
   * 
   * @see jlibxx.human.ch
   * @return Whether or not the language-specific enum matches the regex
   */
  public boolean matchChinese() {
    return ch.isChinese(this);
  }

  /**
   * <p>
   * This method attempts to use the language-specific enum to match the regex
   * 
   * @see jlibxx.human.ja
   * @return Whether or not the language-specific enum matches the regex
   */
  public boolean matchJapanese() {
    return ja.isJapanese(this);
  }

  /**
   * <p>
   * This method prints the string and language instead of via the standard Object.toString()}
   * 
   * @return A string representation of the language object
   */
  public String toString() {
    return language_holder;
  }
}
