package devstudy.java_se_http_server.block1.task3;

public class Stack<T> extends DataStructure<T> {

  public Stack() {
    super(new DynamicArray());
  }

  public Stack(DynamicArray<T> dynamicArray) {
    super(dynamicArray);
  }

  @Override
  protected int getCurrentIndex() {
    return size() - 1;
  }
}
