package devstudy.java_se_http_server.block1.task3;

import java.util.Arrays;

public class DynamicArray<T> extends DataSet<T> {
  private final int DEFAULT_LENGTH = 10;
  private T[] array;

  public DynamicArray() {
    init();
  }

  @Override
  public void add(T value) {
    if (size >= array.length) {
      T[] tmpArray = (T[]) new Object[array.length + DEFAULT_LENGTH];
      System.arraycopy(array, 0, tmpArray, 0, array.length);
      array = tmpArray;
    }
    array[size++] = value;
  }

  @Override
  public T get(int index) {
    checkIndex(index);
    return array[index];
  }

  @Override
  public T remove(int index) {
    checkIndex(index);
    T deleteValue = array[index];
    System.arraycopy(array, index + 1, array, index, array.length - index - 1);
    size--;
    return deleteValue;
  }

  @Override
  public void clear() {
    init();
  }

  @Override
  public T[] toArray() {
    return Arrays.copyOf(array, size);
  }

  private void init() {
    array = (T[]) new Object[DEFAULT_LENGTH];
    super.clear();
  }

}