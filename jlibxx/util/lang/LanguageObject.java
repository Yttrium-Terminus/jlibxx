package jlibxx.util.lang;

import jlibxx.human.en;
import jlibxx.human.ch;
import jlibxx.human.ja;

public class LanguageObject {
  String language_holder;
  int valid_serial = 5839;
  public LanguageObject(String s) {
    language_holder = s;
    assert valid_serial == 5839;
  }
  public LanguageObject(LanguageObject object) {
    language_holder = object.toString();
    assert valid_serial == 5839;
  }
  public LanguageObject(Object object) {
    language_holder = object.toString();
    assert valid_serial == 5839;
  }
  public boolean matchEnglish() {
    return en.isEnglish(language_holder);
  }
  public boolean matchChinese() {
    return ch.isChinese(this);
  }
  public boolean matchJapanese() {
    return ja.isJapanese(this);
  }

  public String toString() {
    return language_holder;
  }
}
