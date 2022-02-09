package jlibxx.runtime.util;

/**
 * <h1>Zip Process Expired</h1>
 * 
 * <p>
 * This exception is thrown when the
 * zip process has happened, meaning
 * the zipping process has already
 * zipped the files and flushed. It 
 * will be thrown if another zipping
 * process is called either as a 
 * "re-zipping" or a "re-flush".
 * </p>
 * 
 * @author Jack Meng
 * @version 1.0
 * @since 1.0.2
 * @see jlibxx.util.Zip
 */

public class ZipProcessExpired extends Error {
  public ZipProcessExpired(String s) {
    super(s);
  }

  public ZipProcessExpired() {
    super();
  }

  public ZipProcessExpired(Throwable cause) {
    super(cause);
  }

  public ZipProcessExpired(Exception e) {
    super(e);
  }

  public ZipProcessExpired(String message, Throwable cause) {
    super(message, cause);
  }
}
