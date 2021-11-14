package jlibxx.util;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Stringx {
  private String s;

  public Stringx(String s) {
    this.s = s;
  }

  public String getAddress() {
    return Integer.toHexString(s.hashCode());
  }

  public int getLength() {
    return s.length();
  }

  public String getContent() {
    return s;
  }

  public String move(int offset) {
    return Integer.toHexString(s.hashCode() + offset);
  }

  public char getChar(int index) {
    return s.charAt(index);
  }

  public String concat(String s2) {
    return s + s2;
  }

  public String concat(char c) {
    return s + c;
  }

  public String concat(int n) {
    return s + n;
  }

  public String concat(long n) {
    return s + n;
  }

  public String concat(float n) {
    return s + n;
  }

  public String concat(double n) {
    return s + n;
  }

  public String concat(boolean b) {
    return s + b;
  }

  public String concat(byte b) {
    return s + b;
  }

  public String concat(short sh) {
    return s + sh;
  }

  public int[] toIntArray() {
    String[] sa = s.split(" ");
    int[] ia = new int[sa.length];
    for (int i = 0; i < sa.length; i++) {
      ia[i] = Integer.parseInt(sa[i]);
    }
    return ia;
  }

  public long[] toLongArray() {
    String[] sa = s.split(" ");
    long[] ia = new long[sa.length];
    for (int i = 0; i < sa.length; i++) {
      ia[i] = Long.parseLong(sa[i]);
    }
    return ia;
  }

  public float[] toFloatArray() {
    String[] sa = s.split(" ");
    float[] ia = new float[sa.length];
    for (int i = 0; i < sa.length; i++) {
      ia[i] = Float.parseFloat(sa[i]);
    }
    return ia;
  }

  public double[] toDoubleArray() {
    String[] sa = s.split(" ");
    double[] ia = new double[sa.length];
    for (int i = 0; i < sa.length; i++) {
      ia[i] = Double.parseDouble(sa[i]);
    }
    return ia;
  }

  public char[] toCharArray() {
    return s.toCharArray();
  }

  public String reverse() {
    StringBuilder sb = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
      sb.append(s.charAt(i));
    }
    return sb.toString();
  }

  public String shuffle() {
    char[] ca = s.toCharArray();
    for (int i = 0; i < ca.length; i++) {
      int j = (int) (Math.random() * ca.length);
      char c = ca[i];
      ca[i] = ca[j];
      ca[j] = c;
    }
    return new String(ca);
  }

  public String toUpperCase() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append(Character.toUpperCase(s.charAt(i)));
    }
    return sb.toString();
  }

  public String toLowerCase() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append(Character.toLowerCase(s.charAt(i)));
    }
    return sb.toString();
  }

  public String toTitleCase() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (i == 0) {
        sb.append(Character.toUpperCase(s.charAt(i)));
      } else {
        sb.append(Character.toLowerCase(s.charAt(i)));
      }
    }
    return sb.toString();
  }

  public String toCamelCase() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (i == 0) {
        sb.append(Character.toLowerCase(s.charAt(i)));
      } else {
        sb.append(Character.toUpperCase(s.charAt(i)));
      }
    }
    return sb.toString();
  }

  public String toSnakeCase() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (i == 0) {
        sb.append(Character.toLowerCase(s.charAt(i)));
      } else {
        if (Character.isUpperCase(s.charAt(i))) {
          sb.append("_");
          sb.append(Character.toLowerCase(s.charAt(i)));
        } else {
          sb.append(Character.toLowerCase(s.charAt(i)));
        }
      }
    }
    return sb.toString();
  }

  public String format() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (i == 0) {
        sb.append(Character.toUpperCase(s.charAt(i)));
      } else {
        if (Character.isUpperCase(s.charAt(i))) {
          sb.append("_");
          sb.append(Character.toUpperCase(s.charAt(i)));
        } else {
          sb.append(Character.toUpperCase(s.charAt(i)));
        }
      }
    }
    return sb.toString();
  }

  public String appendNull(int n) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append('\0');
    }
    return sb.toString();
  }

  public void destroy() {
    s = null;
  }

  public int toInt() {
    return Integer.parseInt(s);
  }

  public String indent(int n) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(' ');
    }
    return sb.toString();
  }

  public String removeWhitespace() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (!Character.isWhitespace(s.charAt(i))) {
        sb.append(s.charAt(i));
      }
    }
    return sb.toString();
  }

  public String removeWhitespace(boolean b) {
    if (b) {
      return removeWhitespace();
    } else {
      return s;
    }
  }

  public boolean containsWhitespace() {
    for (int i = 0; i < s.length(); i++) {
      if (Character.isWhitespace(s.charAt(i))) {
        return true;
      }
    }
    return false;
  }

  public boolean contains(char c) {
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) {
        return true;
      }
    }
    return false;
  }

  public boolean contains(String s) {
    for (int i = 0; i < s.length(); i++) {
      if (this.s.contains(s)) {
        return true;
      }
    }
    return false;
  }

  public boolean contains(char[] ca) {
    for (int i = 0; i < ca.length; i++) {
      if (contains(ca[i])) {
        return true;
      }
    }
    return false;
  }

  public boolean contains(String[] sa) {
    for (int i = 0; i < sa.length; i++) {
      if (contains(sa[i])) {
        return true;
      }
    }
    return false;
  }

  public void each(Consumer<Character> c) {
    for (int i = 0; i < s.length(); i++) {
      c.accept(s.charAt(i));
    }
  }

  public String toHex() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append(Integer.toHexString(s.charAt(i)));
    }
    return sb.toString();
  }

  public String toBase64() {
    return Base64.getEncoder().encodeToString(s.getBytes());
  }

  public String toBaseChoice(int base) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append(Integer.toString(s.charAt(i), base));
    }
    return sb.toString();
  }

  public String toUnicode() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append("\\u" + Integer.toHexString(s.charAt(i)));
    }
    return sb.toString();
  }

  public String toUnicode(int n) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append("\\u" + String.format("%0" + n + "X", s.charAt(i)));
    }
    return sb.toString();
  }

  public String toUnicode(int n, int m) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append("\\u" + String.format("%0" + n + "X", s.charAt(i)));
      if (i < s.length() - 1) {
        sb.append("\\u" + String.format("%0" + m + "X", s.charAt(i + 1)));
      }
    }
    return sb.toString();
  }

  public boolean containsInvalidChars() {
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '\0') {
        return true;
      }
    }
    return false;
  }

  public String substring(int start, int end) {
    char[] ca = s.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int i = start; i < end; i++) {
      sb.append(ca[i]);
    }
    return sb.toString();
  }

  public int size() {
    return s.length();
  }

  public boolean isNull() {
    return s == null;
  }

  public boolean isEmpty() {
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != ' ') {
        return false;
      }
    }
    return true;
  }

  //convert string to arraylist
  public List<String> toArrayList() {
    ArrayList<String> al = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      al.add(s.substring(i, i + 1));
    }
    return al;
  }

  //convert string to hashset
  public Set<String> toHashSet() {
    HashSet<String> hs = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      hs.add(s.substring(i, i + 1));
    }
    return hs;
  }
  
  //convert string to linkedlist
  public List<String> toLinkedList() {
    LinkedList<String> ll = new LinkedList<>();
    for (int i = 0; i < s.length(); i++) {
      ll.add(s.substring(i, i + 1));
    }
    return ll;
  }

  public Map<String, String> toMap() {
    Map<String, String> m = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      m.put(s.substring(i, i + 1), s.substring(i, i + 1));
    }
    return m;
  }

  public int length() {
    return new Stringx(s).size();
  }


  public String toString() {
    return s;
  }

  public String charAt(int i) {
    StringBuilder sb = new StringBuilder();
    char[] ca = s.toCharArray();
    for (int j = 0; j < ca.length; j++) {
      sb.append(ca[j]);
    }
    return sb.toString().charAt(i) + "";
  }
}
