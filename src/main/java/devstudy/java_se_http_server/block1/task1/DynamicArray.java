package devstudy.java_se_http_server.block1.task1;

import devstudy.java_se_http_server.block1.task1.linked_list.DataSet;

import java.util.Arrays;

public class DynamicArray extends DataSet {
  private final int DEFAULT_LENGTH = 10;
  private int[] array;

  public DynamicArray() {
    init();
  }

  @Override
  public void add(int value) {
    if (size >= array.length) {
      int[] tmpArray = new int[array.length + DEFAULT_LENGTH];
      System.arraycopy(array, 0, tmpArray, 0, array.length);
      array = tmpArray;
    }
    array[size++] = value;
  }

  @Override
  public int get(int index) {
    checkIndex(index);
    return array[index];
  }

  @Override
  public int remove(int index) {
    checkIndex(index);
    int deleteValue = array[index];
    System.arraycopy(array, index + 1, array, index, array.length - index - 1);
    size--;
    return deleteValue;
  }

  @Override
  public void clear() {
    init();
  }

  @Override
  public int[] toArray() {
    return Arrays.copyOf(array, size);
  }

  private void init() {
    array = new int[DEFAULT_LENGTH];
    super.clear();
  }

}