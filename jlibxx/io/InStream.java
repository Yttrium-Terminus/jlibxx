package jlibxx.io;

public class InStream extends java.io.InputStream {
  public int read() {
    return 0;
  }

  @Override
  public int read(byte[] b, int off, int len) {
    return 0;
  }

  @Override
  public long skip(long n) {
    return 0;
  }

  @Override
  public int available() {
    return 0;
  }

  @Override
  public void close() {
    // unused method
  }

  @Override
  public synchronized void mark(int readlimit) {
    // unused method
  }

  @Override
  public synchronized void reset() {
    // unused method
  }

  @Override
  public boolean markSupported() {
    return false;
  }
}