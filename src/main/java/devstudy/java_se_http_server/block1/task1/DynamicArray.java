package devstudy.java_se_http_server.block1.task1;

import java.util.Arrays;

public class DynamicArray {
  private final int DEFAULT_LENGTH = 10;
  private int[] array;
  private int length;

  public DynamicArray() {
    init();
  }

  public void add(int value) {
    if (length >= array.length) {
      int[] tmpArray = new int[array.length + DEFAULT_LENGTH];
      System.arraycopy(array, 0, tmpArray, 0, array.length);
      array = tmpArray;
    }
    array[length++] = value;
  }

  public int get(int index) {
    checkIndex(index);
    return array[index];
  }

  public int size() {
    return length;
  }

  public int remove(int index) {
    checkIndex(index);
    int deleteValue = array[index];
    System.arraycopy(array, index + 1, array, index, array.length - index - 1);
    length--;
    return deleteValue;
  }

  public void clear() {
    init();
  }

  public int[] toArray() {
    return Arrays.copyOf(array, length);
  }

  private void init() {
    array = new int[DEFAULT_LENGTH];
    length = 0;
  }

  private void checkIndex(int index) {
    if (index > length || index < 0) {
      throw new IllegalArgumentException();
    }
  }
}