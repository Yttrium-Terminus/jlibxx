package jlibxx.math;

import java.math.BigInteger;

import jlibxx.util.Pair;

public class Complex {
  private abstract static class Helpers {
    public static double atan2(BigInteger x, BigInteger y) {
      BigInteger a = x.multiply(x);
      BigInteger b = y.multiply(y);
      BigInteger c = a.add(b);
      BigInteger d = c.sqrt();
      BigInteger e = d.add(x);
      if (y == BigInteger.ZERO) {
        return 0;
      }
      BigInteger f = e.divide(y);
      if (f.compareTo(BigInteger.valueOf((long) Double.MAX_VALUE)) > 0) {
        return Double.NaN;
      }
      return Math.atan(f.longValue());
    }
  }

  private Pair<BigInteger, BigInteger> pair = new Pair<>();

  public Complex(Complex real) {
    pair.setFirst(real.getReal());
    pair.setSecond(real.getImaginary());
  }

  public Complex(double real, double imaginary) {
    pair.setFirst(BigInteger.valueOf((long) real));
    pair.setSecond(BigInteger.valueOf((long) imaginary));
  }

  public Complex(long real, long imaginary) {
    pair.setFirst(BigInteger.valueOf(real));
    pair.setSecond(BigInteger.valueOf(imaginary));
  }

  public Complex(BigInteger real, BigInteger imaginary) {
    pair.setFirst(real);
    pair.setSecond(imaginary);
  }

  public Complex(String real, String imaginary) {
    pair.setFirst(new BigInteger(real));
    pair.setSecond(new BigInteger(imaginary));
  }

  /**
   * @return T
   */
  @SuppressWarnings("unchecked")
  public <T> T getReal() {
    return (T) pair.getFirst();
  }

  /**
   * @return T
   */
  @SuppressWarnings("unchecked")
  public <T> T getImaginary() {
    return (T) pair.getSecond();
  }

  /**
   * @return double The Magnitude of the complex number
   */
  public double abs() {
    BigInteger a = pair.getFirst();
    BigInteger b = pair.getSecond();
    BigInteger c = a.multiply(a);
    BigInteger d = b.multiply(b);
    BigInteger e = c.add(d);
    return e.sqrt().doubleValue();
  }

  public double exp(int n) {
    return Math.pow(abs(), n);
  }

  /**
   * @return double
   *         The Phase
   *         Angle
   *         {@link https://gubner.ece.wisc.edu/notes/MagnitudeAndPhaseOfComplexNumbers.pdf}
   */
  public double arg() {
    BigInteger a = pair.getFirst();
    BigInteger b = pair.getSecond();
    if (a.compareTo(BigInteger.ZERO) == 0) {
      if (b.compareTo(BigInteger.ZERO) == 0) {
        return 0;
      }
      return Math.PI / 2;
    }
    if (b.compareTo(BigInteger.ZERO) == 0) {
      return 0;
    }
    return Helpers.atan2(a, b);
  }

}
