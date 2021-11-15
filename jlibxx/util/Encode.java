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

import jlibxx.human.en;

public class Encode {
  private String s;
  public Encode(String s) {
    this.s = s;
  }

  public boolean isEnglish() {
    return en.isEnglish(s.toString());
  }


  public String toHex() {
    return new Stringx(s).toHex();
  }

}
