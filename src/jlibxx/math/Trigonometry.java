package jlibxx.math;

public class Trigonometry {
  public static double toRad(double degrees) {
    return degrees * Math.PI / 180;
  }

  public static double toDeg(double rad) {
    return rad * 180 / Math.PI;
  }

  public static String prettifyDegrees(double degrees) {
    return degrees + "°";
  }

  public static String prettifyRadians(double radians) {
    return radians + "rad";
  }

  public static double period(double freq) {
    return (2 * Math.PI) / freq;
  }

  public static double period(double freq, double phase) {
    return (2 * Math.PI) / freq - phase;
  }

  public static double period(double freq, double phase, double offset) {
    return (2 * Math.PI) / freq - phase + offset;
  }



}
