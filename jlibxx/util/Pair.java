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
   * @return T Returns the first element of the pair.
   */
  public T getFirst() {
    return first;
  }

  /**
   * @return E Returns the second element of the pair.
   */
  public E getSecond() {
    return second;
  }

  /**
   * <a>This method attempts set the value of the first element to something different
   * @param first The first element of the pair.
   */
  public void setFirst(T first) {
    this.first = first;
  }

  /**
   * <a>This method attempts to set the value of the second element to something different
   * @param second The second element of the pair
   */
  public void setSecond(E second) {
    this.second = second;
  }

  /**
   * <a>This method attempts to swap the values
   * <a>
   * {@code First -> Second}
   * {@code Second -> First}
   */
  @SuppressWarnings("unchecked")
  public void swap() {
    T tmp = first;
    first = (T) second;
    second = (E) tmp;
  }
}
