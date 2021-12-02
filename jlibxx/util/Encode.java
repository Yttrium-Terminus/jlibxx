/**
 * <h1>Cryptography Encoding</h1>
 * <p>jlibxx.util.Encode</p>
 * 
 * <p>
 * This class is used specifically for the encryption process of cryptography. Most encryption methods will take
 * a plaintext and attempt to encode it <strong>THIS CLASS DOES NOT ENCRYPT OR HASH ANY PLAINTEXT</strong>
 * </p>
 *
 * For the reverse of this class please see @see jlibxx.util.Decode
 * 
 * @link https://en.wikipedia.org/wiki/Cipher
 * @author Jack Meng
 * @since 1.1
 * @category cryptography
 */

package jlibxx.util;

/**
 * Avaliable packages used for the decryption of the plaintext from human language to language.
 * @see jlibxx.human
 * @since 1.0.1
 * @code {new Encode(plaintext)}
 * @code {new Decode(ciphertext)}
 */
import jlibxx.human.en;

public class Encode {
  /**
   * Plaintext must be in standard ASCII font style, else this program will then
   * attempt to convert it to unicode
   * If the plaintext is given in ciphertext form, this class will further encrypt
   * it "recursively"
   * 
   * @link https://www.ws-attacks.org/Recursive_Cryptography
   * @see jlibxx.util.Stringx
   */
  private String s;

  /**
   * @param plaintext The plaintext that will be encrypted into the cipher
   * @see jlibxx.util.Decode
   * 
   *      <a>Avaliable Encoding Methods:
   *      HEX, Base64, BaseX, UTF8, Standard-Unicode, Standard-ISO*, ASCII, JIS*,
   *      CNS*
   * @see https://en.wikipedia.org/wiki/Character_encoding
   *      In courtesy of @link
   *      https://www.sciencedirect.com/topics/engineering/encoding-method
   *      </a>
   */
  public Encode(String plaintext) {
    this.s = plaintext;
  }

  /**
   * @code {isEnglish() -> true ? false}
   *       @param null This method uses the currently initialized instance of this
   *       Object @see java.lang.Object to see
   *       if the regex matches those of standard English Alphabets
   * @see jlibxx.human.en
   * @return A boolean representing if the entered plaintext is english or not
   *         This object will technically extend the english class
   * 
   *         Standard ASCII character coding
   * @code {^[a-zA-Z0-9?><;,{}[\]\-_+=!@#$%\^&*|']*$}
   */
  public boolean isEnglish() {
    return en.isEnglish(s.toString());
  }

  /**
   * @code {toHex() -> hex_chars ? null}
   *       @param null This method uses the currently initialized instance of this
   *       Object @see java.lang.Object to encode
   *       the plaintext into HEX format
   * 
   *       <p>
   *       If the plaintext is already in standard HEX format, this method will
   *       not double check and will attempt to
   *       further encode such chars
   *       </p>
   * 
   *       <p>
   *       This method does not print anything nor does it take into account if
   *       the given HEX_VALUES are valid
   *       ({@link https://www.sciencedirect.com/topics/engineering/hexadecimal})
   *       the user must determine if the hex chars are valid if not this method
   *       will attempt to encode into an unknown format @link
   *       https://www.fileformat.info/info/unicode/char/0fffd/index.htm
   *       </p>
   * 
   * @return The plaintext after having been encoded into HEX_CHARS
   */
  public String toHex() {
    return new Stringx(s).toHex();
  }

}
