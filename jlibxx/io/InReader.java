package jlibxx.io;

import java.io.InputStream;

public class InReader {
  private InputStream s;
  private InStream is;
  public InReader(InputStream r) {
    this.s = r;
    this.is = new InStream(r);
  }

  public int read() {
    return is.read();
  }

  public int next() {
    return is.read();
  }

  public int nextInt() {
    return is.readInt();
  }

  public long nextLong() {
    return is.readLong();
  }

  public float nextFloat() {
    return is.readFloat();
  }

  public double nextDouble() {
    return is.readDouble();
  }

  public String nextLine() {
    return is.readLine();
  }

  public byte nextByte() {
    return is.readByte();
  }

  public short nextShort() {
    return is.readShort();
  }

  public char nextChar() {
    return is.readChar();
  }

  public boolean nextBoolean() {
    return is.readBoolean();
  }

  public String toString() {
    return "InReader(" + s.toString() + ")";
  }


}
