package jlibxx.operator;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public class Optional<T> {
  private T value;

  public Optional(T value) {
    this.value = value;
  }

  /**
   * @return T
   */
  public T get() {
    return value;
  }

  /**
   * @return boolean
   */
  public boolean isPresent() {
    return value != null;
  }

  /**
   * @param value
   * @return Optional<T>
   */
  public static <T> Optional<T> of(T value) {
    return new Optional<>(value);
  }

  /**
   * @return Optional<T>
   */
  public static <T> Optional<T> empty() {
    return new Optional<>(null);
  }

  /**
   * @return boolean
   */
  public boolean isEmpty() {
    return value == null;
  }

  /**
   * @param defaultValue
   * @return T
   */
  public T getValueOrDefault(T defaultValue) {
    return value != null ? value : defaultValue;
  }

  /**
   * @param t
   * @return T
   * @throws Throwable
   */
  public T getValueOrThrow(Throwable t) throws Throwable {
    if (value == null) {
      throw t;
    }
    return value;
  }

  /**
   * @param t
   * @param message
   * @return T
   * @throws Throwable
   */
  public T getValueOrThrow(Class<? extends Throwable> t, String message) throws Throwable {
    if (value == null) {
      throw t.getConstructor(String.class).newInstance(message);
    }
    return value;
  }

  /**
   * @param t
   * @param message
   * @param args
   * @return T
   * @throws Throwable
   */
  public T getValueOrThrow(Class<? extends Throwable> t, String message, Object... args) throws Throwable {
    if (value == null) {
      throw t.getConstructor(String.class).newInstance(String.format(message, args));
    }
    return value;
  }

  /**
   * @param value
   * @return T
   */
  public T orElse(T value) {
    return value != null ? value : this.value;
  }

  /**
   * @param supplier
   * @return T
   */
  public T orElseGet(Supplier<T> supplier) {
    return value != null ? value : supplier.get();
  }

  /**
   * @param o
   * @return boolean
   */
  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Optional)) {
      return false;
    }
    Optional<?> other = (Optional<?>) o;
    return Objects.equals(value, other.value);
  }

  /**
   * @param mapper
   * @return Optional<U>
   */
  public <U> Optional<U> map(Function<? super T, ? extends U> mapper) {
    return value != null ? Optional.of(mapper.apply(value)) : Optional.empty();
  }

  /**
   * @param predicate
   * @return Optional<T>
   */
  public Optional<T> filter(Function<? super T, Boolean> predicate) {
    return value != null && predicate.apply(value) ? this : Optional.empty();
  }

  /**
   * @param other
   */
  public void swap(Optional<T> other) {
    T temp = value;
    value = other.value;
    other.value = temp;
  }

  public void destroy() {
    value = null;
  }

  /**
   * @param value
   */
  public void emplace(T value) {
    this.value = value;
  }

}
