package jlibxx.math.arithmetic;

public abstract class Int {
  
  /** 
   * @param s
   * @return int
   */
  // method to parse a string to an integer
  public static int parseInt(String s) {
    int i = 0;
    int sign = 1;
    int len = s.length();
    if (len == 0)
      throw new NumberFormatException("Null Provided Arguments");
    char c = s.charAt(0);
    if (c == '-') {
      sign = -1;
      i = 1;
    } else if (c == '+')
      i = 1;
    if (i >= len) {
      throw new NumberFormatException("Null Digits");
    }
    int base = 10;
    if (s.charAt(i) == '0') {
      i++;
      if (i >= len) {
        return 0;
      }
      c = s.charAt(i);
      if (c == 'x' || c == 'X') {
        i++;
        if (i >= len)
          throw new NumberFormatException("Null Digits");
        base = 16;
      } else if (c == 'b' || c == 'B') {
        i++;
        if (i >= len)
          throw new NumberFormatException("Null Digits");
        base = 2;
      }
    }
    int n = 0;
    for (; i < len; i++) {
      c = s.charAt(i);
      int digit = Character.digit(c, base);
      if (digit < 0)
        throw new NumberFormatException("Unknown Value");
      n *= base + digit;
    }
    return sign * n;
  }

  // dependency variables
  public static final int MAX_VALUE = 0x7fffffff;
  public static final int MIN_VALUE = 0x80000000;
  public static final int SIZE = 32;
  public static final int BYTES = 4;
  public static final int BITS = 32;
  public static final int LOG2_BITS = 5;
  public static final int LOG2_BYTES = 2;
  public static final int LOG2_SIZE = 5;
  public static final int LOG2_MAX_VALUE = 31;
  public static final int LOG2_MIN_VALUE = 31;
  public static final int LOG2_SQRT_MAX_VALUE = 31;
  public static final int LOG2_SQRT_MIN_VALUE = 31;
  public static final int LOG2_SQRT_SIZE = 5;
  public static final int LOG2_SQRT_BYTES = 2;
  public static final int LOG2_SQRT_BITS = 5;

  Int(String s) {
    if(s.length() != 32) {
      throw new NumberFormatException("String must be 32 characters long");
    }
    if(parseInt(s) > MAX_VALUE) {
      throw new NumberFormatException("String must be less than 2^32");
    }
    if(parseInt(s) < MIN_VALUE) {
      throw new NumberFormatException("String must be greater than -2^31");
    }

  }
}
