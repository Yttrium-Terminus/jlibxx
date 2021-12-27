package jlibxx.math.plane;

public class Dimension<T> {
  private T width;
  private T height;

  public Dimension(T width, T height) {
    this.width = width;
    this.height = height;
  }

  @SuppressWarnings("unchecked")
  public Dimension(Point topRight, Point topLeft, Point bottomLeft, Point bottomRight) {
    this.width = (T) ((Object) (((int) topRight.getX()) - ((int) topLeft.getX())));
    this.height = (T) ((Object) (((int) topRight.getY()) - ((int) bottomRight.getY())));
  }

  public Dimension() {
    this(0, 0);
  }

  public Dimension(Dimension<T> other) {
    this.width = other.width;
    this.height = other.height;
  }

  @SuppressWarnings("unchecked")
  public Dimension(java.awt.Dimension other) {
    this.width = (T) ((Object) other.width);
    this.height = (T) ((Object) other.height);
  }

  @SuppressWarnings("unchecked")
  public Dimension(int i, int j) {
    this.width = (T) ((Object) i);
    this.height = (T) ((Object) j);
  }

  public java.awt.Dimension unwrapClass() {
    return new java.awt.Dimension((int) width, (int) height);
  }

  public T getWidth() {
    return width;
  }

  public T getHeight() {
    return height;
  }

  public String toString() {
    return "(" + width + ", " + height + ")";
  }

}
