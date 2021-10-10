package devstudy.java_se_http_server.block1.task2;

import devstudy.java_se_http_server.block1.task1.linked_list.DataSet;

public class DataStructure {
  protected DataSet dataSet;

  public DataStructure(DataSet dataSet) {
    this.dataSet = dataSet;
  }

  public void add(int element) { // добавить элемент в набор
    dataSet.add(element);
  }

  public int get() { // удалить и вернуть текущий элемент
    return dataSet.remove(getCurrentIndex());
  }

  public int peek() { // вернуть текущий элемент без удаления из набора
    return dataSet.get(getCurrentIndex());
  }

  public int size() { // размер набора
    return dataSet.size();
  }

  public boolean isEmpty() { // true, если набор пустой
    return dataSet.size() == 0;
  }

  protected int getCurrentIndex() {
    return 0;
  }
}
