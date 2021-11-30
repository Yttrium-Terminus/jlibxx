package jlibxx.util.lang.fun;

public class Haiku {
  private String text;

  public Haiku(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public boolean isValid() {
    int syllableCount = 0;
    int wordCount = 0;
    String[] words = text.split(" ");
    for (String word : words) {
      wordCount++;
      if (word.length() == 1) {
        syllableCount++;
      } else {
        syllableCount += word.length() - 1;
      }
    }
    return wordCount == 5 && syllableCount == 17;
  }

  public void tryMakeHaiku(int syllables) {
    String[] words = text.split(" ");
    int syllableCount = 0;
    int wordCount = 0;
    for (String word : words) {
      wordCount++;
      if (word.length() == 1) {
        syllableCount++;
      } else {
        syllableCount += word.length() - 1;
      }
    }
    if (syllableCount - syllables < 17) {
      return;
    }
    int removed = 0;
    while (removed < syllables) {
      int wordIndex = (int) (Math.random() * wordCount);
      String word = words[wordIndex];
      if (word.length() == 1) {
        words[wordIndex] = "";
        removed++;
      } else {
        int syllableIndex = (int) (Math.random() * word.length());
        words[wordIndex] = word.substring(0, syllableIndex) + word.substring(syllableIndex + 1);
        removed++;
      }
    }
    text = "";
    for (String word : words) {
      text += word + " ";
    }
  }
}
