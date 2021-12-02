package jlibxx.util;

/**
 * This class represents a pair of objects.
 * A pair of objects is just a pair of references to two objects.
 * Heavily inspired by the C++ STL pair implementation
 * 
 * @author <A HREF="http://www.inf.fu-berlin.de/~dahm">M. Dahm</A>
 * @author Jack Meng
 * @version 1.0
 * @since 1.2
 * 
 */
public class Pair<T, E> {
  private T first;
  private E second;

  public Pair(T first, E second) {
    this.first = first;
    this.second = second;
  }

  
  /** 
   * @return T
   */
  public T getFirst() {
    return first;
  }

  
  /** 
   * @return E
   */
  public E getSecond() {
    return second;
  }

  
  /** 
   * @param first
   */
  public void setFirst(T first) {
    this.first = first;
  }

  
  /** 
   * @param second
   */
  public void setSecond(E second) {
    this.second = second;
  }

  @SuppressWarnings("unchecked")
  public void swap() {
    T tmp = first;
    first = (T) second;
    second = (E) tmp;
  }
}
