package devstudy.java_se_http_server.block1.task3;

public class Queue<T> extends DataStructure<T> {

  public Queue() {
    super(new LinkedList());
  }

  @Override
  protected int getCurrentIndex() {
    return 0;
  }
}
