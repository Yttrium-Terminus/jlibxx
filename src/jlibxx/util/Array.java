package jlibxx.util;

public abstract class Array {
  private Array() {
    // Override the default constructor
  }

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

  public static int sum(int[] arr) {
    int sum = 0;
    for(final int x: arr) {
      sum += x;
    }
    return sum;
  }

  public static int max(int[] arr) {
    int max = Integer.MIN_VALUE;
    for(final int x: arr) {
      if(x > max) {
        max = x;
      }
    }
    return max;
  }

  public static int min(int[] arr) {
    int min = Integer.MAX_VALUE;
    for(final int x: arr) {
      if(x < min) {
        min = x;
      }
    }
    return min;
  }

  public static int[] reverse(int[] arr) {
    int[] rev = new int[arr.length];
    for(int i = 0; i < arr.length; i++) {
      rev[i] = arr[arr.length - i - 1];
    }
    return rev;
  }

  public static int[] shuffle(int[] arr) {
    int[] shuffled = new int[arr.length];
    for(int i = 0; i < arr.length; i++) {
      shuffled[i] = arr[i];
    }
    for(int i = 0; i < arr.length; i++) {
      int rand = (int) (Math.random() * arr.length);
      int temp = shuffled[i];
      shuffled[i] = shuffled[rand];
      shuffled[rand] = temp;
    }
    return shuffled;
  }


  public static int[] range(int start, int end) {
    int[] range = new int[end - start];
    for(int i = 0; i < range.length; i++) {
      range[i] = start + i;
    }
    return range;
  }

  public static int[] range(int start, int end, int step) {
    int[] range = new int[(end - start) / step];
    for(int i = 0; i < range.length; i++) {
      range[i] = start + i * step;
    }
    return range;
  }

  public static int[] range(int start, int end, int step, int stepCount) {
    int[] range = new int[stepCount];
    for(int i = 0; i < range.length; i++) {
      range[i] = start + i * step;
    }
    return range;
  }

  public static int[] range(int start, int end, int step, int stepCount, int stepSize) {
    int[] range = new int[stepCount];
    for(int i = 0; i < range.length; i++) {
      range[i] = start + i * step + stepSize;
    }
    return range;
  }

  

}
