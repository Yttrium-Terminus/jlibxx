package jlibxx.operator;

import java.util.List;

public class Referencer<T> {
  private T ref;

  public Referencer(T t) {
    this.ref = t;
  }

  
  /** 
   * @return T
   */
  public T get() {
    return ref;
  }

  
  /** 
   * @param t
   */
  public void set(T t) {
    ref = t;
  }

  
  /** 
   * @param n
   */
  public void align(int n) {
    ref = (T) ((Object) (((int) ref) & ~(n - 1)));
  }
  
  /** 
   * @param n
   * @return boolean
   */
  public boolean isAligned(int n) {
    return (((int) ref) & (n - 1)) == 0;
  }

  
  /** 
   * @param t
   * @return Referencer<T>
   */
  public static <T> Referencer<T> create(T t) {
    return new Referencer<T>(t);
  }

  
  /** 
   * @param list
   */
  public void store(List<T> list) {
    list.add(ref);
  }

}
