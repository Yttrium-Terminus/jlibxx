package testing.base64;

public class Test {
  public Test() {
  }

  public static String decodeBase64(String s) {
    // decode the base64 encoded string by using a simple loop
    int i = 0;
    int len = s.length();
    StringBuilder sb = new StringBuilder();
    while (i < len) {
      int c = s.charAt(i) - 63;
      sb.append((char) (c));
      i++;
    }
    return sb.toString();
    
  }
}
