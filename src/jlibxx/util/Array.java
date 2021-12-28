package jlibxx.util;

/**
 * <h1>Array Modifier</h1>
 * <p>
 * This class is used to modify arrays.
 * An extension of the original
 * {@link java.util.Arrays}.
 * </p>
 * @author Jack Meng
 * @version 1.1
 * @since 1.0.2
 */

public interface Array {

  /**
   * @param arr
   * @return int[]
   */
  public static int[] bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++)
      for (int j = 0; j < n - i - 1; j++)
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
    return arr;
  }

  /**
   * @param arr
   * @return int
   */
  public static int sum(int[] arr) {
    int sum = 0;
    for (final int x : arr) {
      sum += x;
    }
    return sum;
  }

  /**
   * @param arr
   * @return int
   */
  public static int max(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (final int x : arr) {
      if (x > max) {
        max = x;
      }
    }
    return max;
  }

  /**
   * @param arr
   * @return int
   */
  public static int min(int[] arr) {
    int min = Integer.MAX_VALUE;
    for (final int x : arr) {
      if (x < min) {
        min = x;
      }
    }
    return min;
  }

  /**
   * @param arr
   * @return int[]
   */
  public static int[] reverse(int[] arr) {
    int[] rev = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      rev[i] = arr[arr.length - i - 1];
    }
    return rev;
  }

  /**
   * @param arr
   * @return int[]
   */
  public static int[] shuffle(int[] arr) {
    int[] shuffled = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      shuffled[i] = arr[i];
    }
    for (int i = 0; i < arr.length; i++) {
      int rand = (int) (Math.random() * arr.length);
      int temp = shuffled[i];
      shuffled[i] = shuffled[rand];
      shuffled[rand] = temp;
    }
    return shuffled;
  }

  /**
   * @param start
   * @param end
   * @return int[]
   */
  public static int[] range(int start, int end) {
    int[] range = new int[end - start];
    for (int i = 0; i < range.length; i++) {
      range[i] = start + i;
    }
    return range;
  }

  /**
   * @param start
   * @param end
   * @param step
   * @return int[]
   */
  public static int[] range(int start, int end, int step) {
    int[] range = new int[(end - start) / step];
    for (int i = 0; i < range.length; i++) {
      range[i] = start + i * step;
    }
    return range;
  }

  /**
   * @param start
   * @param end
   * @param step
   * @param stepCount
   * @return int[]
   */
  public static int[] range(int start, int end, int step, int stepCount) {
    int[] range = new int[stepCount];
    for (int i = 0; i < range.length; i++) {
      range[i] = start + i * step;
    }
    return range;
  }

  /**
   * @param start
   * @param end
   * @param step
   * @param stepCount
   * @param stepSize
   * @return int[]
   */
  public static int[] range(int start, int end, int step, int stepCount, int stepSize) {
    int[] range = new int[stepCount];
    for (int i = 0; i < range.length; i++) {
      range[i] = start + i * step + stepSize;
    }
    return range;
  }

}
