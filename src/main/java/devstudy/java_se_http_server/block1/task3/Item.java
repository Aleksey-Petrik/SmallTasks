package devstudy.java_se_http_server.block1.task3;

public class Item<T> {
  private Item next;
  private Item previous;
  private T value;

  public Item(T value) {
    this.value = value;
  }

  public Item getNext() {
    return next;
  }

  public void setNext(Item next) {
    this.next = next;
  }

  public T getValue() {
    return value;
  }

  public Item getPrevious() {
    return previous;
  }

  public void setPrevious(Item previous) {
    this.previous = previous;
  }
}