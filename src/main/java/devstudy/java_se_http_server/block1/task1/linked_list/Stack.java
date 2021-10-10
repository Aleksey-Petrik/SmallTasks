package devstudy.java_se_http_server.block1.task1.linked_list;

import devstudy.java_se_http_server.block1.task1.DynamicArray;

public class Stack extends DynamicArray {

  public int get() {
    if (size > 0) {
      return remove(size - 1);
    }
    return -1;
  }

}
