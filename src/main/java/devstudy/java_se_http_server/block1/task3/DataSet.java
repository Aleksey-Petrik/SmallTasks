package devstudy.java_se_http_server.block1.task3;

public abstract class DataSet<T> {
  protected int size;

  public DataSet() {
    size = 0;
  }

  public final int size() {
    return size;
  }

  public void clear() {
    size = 0;
  }

  public abstract void add(T element);

  public abstract void addAll(LinkedList<T> linkedList);

  public abstract T get(int index);

  public abstract T remove(int index);

  public abstract T[] toArray();

  protected void checkIndex(int index) {
    if (index >= size || index < 0) {
      throw new IllegalArgumentException();
    }
  }
}
