package devstudy.java_se_http_server.block1.task1.linked_list;

public abstract class DataSet {
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

  public abstract void add(int element);

  public abstract int get(int index);

  public abstract int remove(int index);

  public abstract int[] toArray();

  protected void checkIndex(int index) {
    if (index >= size || index < 0) {
      throw new IllegalArgumentException();
    }
  }
}
