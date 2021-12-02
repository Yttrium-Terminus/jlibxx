package jlibxx.util;

public class Pair<T, E> {
  private T first;
  private E second;

  public Pair(T first, E second) {
    this.first = first;
    this.second = second;
  }

  public T getFirst() {
    return first;
  }

  public E getSecond() {
    return second;
  }

  public void setFirst(T first) {
    this.first = first;
  }

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
