package jlibxx.operator;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public class Optional<T> {
  private T value;

  public Optional(T value) {
    this.value = value;
  }

  public T get() {
    return value;
  }

  public boolean isPresent() {
    return value != null;
  }

  public static <T> Optional<T> of(T value) {
    return new Optional<T>(value);
  }

  public static <T> Optional<T> empty() {
    return new Optional<T>(null);
  }

  public boolean isEmpty() {
    return value == null;
  }

  public T getValue() {
    return value;
  }

  public T getValueOrDefault(T defaultValue) {
    return value != null ? value : defaultValue;
  }

  public T getValueOrThrow(Throwable t) throws Throwable {
    if (value == null) {
      throw t;
    }
    return value;
  }

  public T getValueOrThrow(Class<? extends Throwable> t, String message) throws Throwable {
    if (value == null) {
      throw t.getConstructor(String.class).newInstance(message);
    }
    return value;
  }

  public T getValueOrThrow(Class<? extends Throwable> t, String message, Object... args) throws Throwable {
    if (value == null) {
      throw t.getConstructor(String.class).newInstance(String.format(message, args));
    }
    return value;
  }

  public T orElse(T value) {
    return value != null ? value : this.value;
  }

  public T orElseGet(Supplier<T> supplier) {
    return value != null ? value : supplier.get();
  }

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

  public <U> Optional<U> map(Function<? super T, ? extends U> mapper) {
    return value != null ? Optional.of(mapper.apply(value)) : Optional.empty();
  }

  public Optional<T> filter(Function<? super T, Boolean> predicate) {
    return value != null && predicate.apply(value) ? this : Optional.empty();
  }

  public void swap(Optional<T> other) {
    T temp = value;
    value = other.value;
    other.value = temp;
  }

  public void destroy() {
    value = null;
  }

  public void emplace(T value) {
    this.value = value;
  }

}
