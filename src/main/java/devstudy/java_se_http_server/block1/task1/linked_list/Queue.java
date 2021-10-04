package devstudy.java_se_http_server.block1.task1.linked_list;

public class Queue extends LinkedList {

  public int get() {
    if (size > 0) {
      return remove(0);
    }
    return -1;
  }

}
