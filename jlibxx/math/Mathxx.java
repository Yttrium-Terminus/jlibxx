/**
 * <h1>jlibxx.math.Mathxx</h1>
 * <p>This simple arithmetic file is meant for an easy replacement of java.Math, and performance wise, is unknown</p>
 * 
 * This is constantly updated class with newer functionalities
 * 
 * <b>Note this file should not be extended when any of @see java.math classes are used</b>
 * 
 * @author Jack Meng
 * @link https://www.gnu.org/licenses/agpl-3.0.en.html
 * @since 1.0
 * @category Math
 */

package jlibxx.math;

public class Mathxx {
  Mathxx() {

  }

  /**
   * This method will raise a value to a power of user specified
   * 
   * @code pow(4.0d, 2.0d);
   * 
   * This method should be used under the assumption that Math.pow is having troubles, otherwise,
   * this method is only used for objects and classes within this library
   * 
   * Avoid using this method if this file or the library is being extended in a class
   * 
   * @param value The value to be raised
   * @param exponent The exponent to be raised by
   * @return The final value after being raised by the exponent
   */
  public double pow(double value, double exponent) {
    for(int i = 1; i < exponent; i++)
      value *= value;
    return value;
  }

  //generate a random number between two numbers
  public double random(double min, double max) {
    return min + (Math.random() * (max - min));
  }


}
