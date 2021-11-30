package jlibxx.operator;

import java.util.List;

public class Referencer<T> {
  private T ref;

  public Referencer(T t) {
    this.ref = t;
  }

  public T get() {
    return ref;
  }

  public void set(T t) {
    ref = t;
  }

  public void align(int n) {
    ref = (T) ((Object) (((int) ref) & ~(n - 1)));
  }
  public boolean isAligned(int n) {
    return (((int) ref) & (n - 1)) == 0;
  }

  public static <T> Referencer<T> create(T t) {
    return new Referencer<T>(t);
  }

  public void store(List<T> list) {
    list.add(ref);
  }

}
