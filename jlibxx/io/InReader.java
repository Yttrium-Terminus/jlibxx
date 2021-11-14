package jlibxx.io;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InReader {
  protected class InStream {
    private InputStream s;
    private InputStreamReader reader;

    public InStream(InputStream s, InputStreamReader r) {
      if (s == null)
        throw new NullPointerException("Unsupported InputStream time");
      this.s = s;
      this.reader = r;
    }

    public InStream(InputStream s) {
      if (s == null)
        throw new NullPointerException("Unsupported InputStream time");
      this.s = s;
      this.reader = new InputStreamReader(s);
    }

    public int read() {
      try {
        return s.read();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    public int read(byte[] b) {
      try {
        return s.read(b);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    public int read(byte[] b, int off, int len) {
      try {
        return s.read(b, off, len);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    public void close() {
      try {
        s.close();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    public int available() {
      try {
        return s.available();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    public void mark(int readlimit) {
      try {
        s.mark(readlimit);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    public void reset() {
      try {
        s.reset();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    public boolean markSupported() {
      try {
        return s.markSupported();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    public InStream from(InputStream s) {
      return new InStream(s, new InputStreamReader(s));
    }

    public InStream from(InputStream s, InputStreamReader r) {
      return new InStream(s, r);
    }

    public InStream from(String s) {
      return from(s.getBytes());
    }

    public InStream from(byte[] b) {
      return from(b, 0, b.length);
    }

    public InStream from(byte[] b, int off, int len) {
      return from(new ByteArrayInputStream(b, off, len));
    }

    public InStream from(String s, String enc) throws UnsupportedEncodingException {
      return from(s.getBytes(), enc);
    }

    public InStream from(byte[] b, String enc) throws UnsupportedEncodingException {
      return from(b, 0, b.length, enc);
    }

    public InStream from(byte[] b, int off, int len, String enc) throws UnsupportedEncodingException {
      return from(new ByteArrayInputStream(b, off, len), enc);
    }

    public InStream from(InputStream s, String enc) throws UnsupportedEncodingException {
      return from(s, new InputStreamReader(s, enc));
    }

    public int readInt() {
      int ch1 = read();
      int ch2 = read();
      int ch3 = read();
      int ch4 = read();
      return ((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0));
    }

    public double readDouble() {
      return Double.longBitsToDouble(readLong());
    }

    public long readLong() {
      return ((long) readInt() << 32) + (readInt() & 0xFFFFFFFFL);
    }

    public short readShort() {
      return (short) readInt();
    }

    public char readChar() {
      return (char) readInt();
    }

    public boolean readBoolean() {
      return read() != 0;
    }

    public float readFloat() {
      return Float.intBitsToFloat(readInt());
    }

    public byte readByte() {
      return (byte) read();
    }

    public String readLine() {
      try {
        StringBuilder sb = new StringBuilder();
        int ch = -1;
        while ((ch = reader.read()) != -1) {
          if (ch == '\n')
            break;
          sb.append((char) ch);
        }
        return sb.toString();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }

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

  public void close() {
    is.close();
  }

  public String toString() {
    return "InReader(" + s.toString() + ")";
  }

}
