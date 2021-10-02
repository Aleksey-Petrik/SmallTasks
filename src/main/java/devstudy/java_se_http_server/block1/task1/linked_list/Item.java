package devstudy.java_se_http_server.block1.task1.linked_list;

public class Item {
  private Item next;
  private Item previous;
  private int value;

  public Item(int value) {
    this.value = value;
  }

  public Item getNext() {
    return next;
  }

  public void setNext(Item next) {
    this.next = next;
  }

  public int getValue() {
    return value;
  }

  public Item getPrevious() {
    return previous;
  }

  public void setPrevious(Item previous) {
    this.previous = previous;
  }
}