package devstudy.java_se_http_server.block1.task2;

import devstudy.java_se_http_server.block1.task1.DynamicArray;

public class Stack extends DataStructure {

  public Stack() {
    super(new DynamicArray());
  }

  @Override
  protected int getCurrentIndex() {
    return size() - 1;
  }
}
