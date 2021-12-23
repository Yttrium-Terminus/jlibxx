/**
 * @author Jack Meng
 * @since 1.1
 * @version Revision 1
 * 
 * This enum stores the standard English Alphabet (excluding other standard ASCII symbols).
 * It can return all of the lower or upper or the regex to determine if any given string is "english"
 * English may represent the falling: Canadian, United States, United Kingdom, Australia, New Zealand, India
 * 
 * <p> 
 * Different variations of english and writing styles are not taking into considerations
 * </p>
 */

package jlibxx.human;

public enum en {
  /*
   * alphabet_lower represents the standard english alphabet in lowercase
   * alphabet_upper represents the standard english alphabet in uppercase
   * 
   * Regex is not used in order to display human readability
   */
  alphabet_lower("abcdefghijklmnopqrstuvwxyz"), alphabet_upper("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

  private String s;
  
  en(String s) {
    this.s = s;
  }

  public String getContent() {
    return s;
  }

  /**
   * @code {isEnglish(plaintext) -> true ? false}
   * @param str This is the plaintext to be compared to in order to math it's regex with the standard English 
   * Regex
   *
   * @see jlibxx.util.Encode
   * @return true or false if it matches with the standard english regex
   */
  public static boolean isEnglish(String str) {
    return str.matches("[a-zA-Z]+");
  }

}
