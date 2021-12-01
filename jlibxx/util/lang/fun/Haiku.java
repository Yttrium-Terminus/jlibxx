package jlibxx.util.lang.fun;

/**
 * <h1>Haiku</h1>
 * <p>
 * This class is a fun class added to for the user to parse and attempt to
 * analyze a haiku
 * </p>
 * 
 * @author Jack Meng
 * @since 1.2
 * @version 1
 * @apiNote This class is a fun class added to for the user to parse and attempt
 *          to make a haiku
 * @see jlibxx.util.lang.fun.Haiku
 */

public class Haiku {
  /**
   * @serial T444
   */
  private String text;

  /**
   * <a>Usage: {@code new Haiku(text)}</a>
   * 
   * @param text a text to be analyzed or a text to be parsed
   */
  public Haiku(String text) {
    this.text = text;
  }

  /* Constant Getter and Setter Methods to avoid corruption of the original var */
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
  /* End of Getter and Setter Methods */

  /**
   * <a>Usage: {@code haiku.isValid()}</a>
   * <p>
   * In order for a haiku to be valid, it must have the following properties:
   * </p>
   * <ul>
   * <li>It must have 5 lines</li>
   * <li>It must have 5 syllables in each line</li>
   * <li>It must have 17 syllables in total</li>
   * </ul>
   * 
   * @return A boolean value indicating whether the haiku is valid or not
   * @see jlibxx.util.lang.fun.Haiku#isValid()
   */
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

  /**
   * <a>Usage: {@code haiku.tryMakeHaiku(syllables)}</a>
   * <p>This method attempts to make a haiku with the given syllables</p>
   * <p>Note: This does not generate random words, instead uses the ones provided</p>
   * 
   * @param syllables The syllables to be used to make a haiku
   * 
   * <p>A void is returned as the original is altered</p>
   */
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
