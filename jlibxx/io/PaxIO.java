/**
 * @author Jack Meng
 * @since 1.0
 * @deprecated
 * WARNING DO NOT USE THIS IO CLASS FOR ANYTHING EXCEPT TESTING
 * 
 * THIS IS A VERY SLOW INPUT STREAM AND SHOULD ONLY BE USED WITH EXTREME KNOWLEDGE OF WHAT IS HAPPENING
 * 
 * Copyright (C) 2021 Jack Meng
 * 
 */

package jlibxx.io;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class PaxIO {
  public PaxIO() {

  }
  public static int readInt(InputStream in) throws IOException {
    int ch1 = in.read();
    int ch2 = in.read();
    int ch3 = in.read();
    int ch4 = in.read();
    if ((ch1 | ch2 | ch3 | ch4) < 0)
      throw new EOFException();
    return ((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0));
  }

  public static long readLong(InputStream in) throws IOException {
    long ch1 = in.read();
    long ch2 = in.read();
    long ch3 = in.read();
    long ch4 = in.read();
    long ch5 = in.read();
    long ch6 = in.read();
    long ch7 = in.read();
    long ch8 = in.read();
    if ((ch1 | ch2 | ch3 | ch4 | ch5 | ch6 | ch7 | ch8) < 0)
      throw new EOFException();
    return ((ch1 << 56) + (ch2 << 48) + (ch3 << 40) + (ch4 << 32) + (ch5 << 24) + (ch6 << 16) + (ch7 << 8) + (ch8 << 0));
  }

  public static int readInt(InputStream in, int[] buf) throws IOException {
    int ch1 = in.read();
    int ch2 = in.read();
    int ch3 = in.read();
    int ch4 = in.read();
    if ((ch1 | ch2 | ch3 | ch4) < 0)
      throw new EOFException();
    buf[0] = ((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0));
    return 1;
  }

  public static int readInt(InputStream in, int[] buf, int off, int len) throws IOException {
    if (len == 0)
      return 0;
    int ch1 = in.read();
    int ch2 = in.read();
    int ch3 = in.read();
    int ch4 = in.read();
    if ((ch1 | ch2 | ch3 | ch4) < 0)
      throw new EOFException();
    buf[off] = ((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0));
    return 1;
  }

  public static int readChar(InputStream in, char[] buf) throws IOException {
    int ch1 = in.read();
    int ch2 = in.read();
    if ((ch1 | ch2) < 0)
      throw new EOFException();
    buf[0] = (char) ((ch1 << 8) + (ch2 << 0));
    return 1;
  }

  public static int readChar(InputStream in, char[] buf, int off, int len) throws IOException {
    if (len == 0)
      return 0;
    int ch1 = in.read();
    int ch2 = in.read();
    if ((ch1 | ch2) < 0)
      throw new EOFException();
    buf[off] = (char) ((ch1 << 8) + (ch2 << 0));
    return 1;
  }

  public static int readShort(InputStream in, short[] buf) throws IOException {
    int ch1 = in.read();
    int ch2 = in.read();
    if ((ch1 | ch2) < 0)
      throw new EOFException();
    buf[0] = (short) ((ch1 << 8) + (ch2 << 0));
    return 1;
  }

  
  
}
