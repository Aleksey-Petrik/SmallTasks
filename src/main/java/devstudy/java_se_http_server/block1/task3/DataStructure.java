package devstudy.java_se_http_server.block1.task3;

public abstract class DataStructure<T> {
  protected DataSet<T> dataSet;

  public DataStructure(DataSet<T> dataSet) {
    this.dataSet = dataSet;
  }

  public void add(T element) { // добавить элемент в набор
    dataSet.add(element);
  }

  public T get() { // удалить и вернуть текущий элемент
    return dataSet.remove(getCurrentIndex());
  }

  public T peek() { // вернуть текущий элемент без удаления из набора
    return dataSet.get(getCurrentIndex());
  }

  public int size() { // размер набора
    return dataSet.size();
  }

  public boolean isEmpty() { // true, если набор пустой
    return dataSet.size() == 0;
  }

  protected abstract int getCurrentIndex();
}
