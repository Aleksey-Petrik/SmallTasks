package devstudy.java_se_http_server.block1.task1.linked_list;

public class LinkedList extends DataSet {
  protected Item first;
  protected Item last;

  @Override
  public void add(int element) {
    if (first == null) {
      first = last = new Item(element);
    } else {
      Item newItem = new Item(element);
      last.setNext(newItem);
      newItem.setPrevious(last);
      last = newItem;
    }
    size++;
  }

  @Override
  public int get(int index) {
    return findItem(index).getValue();
  }

  @Override
  public int remove(int index) {
    checkIndex(index);
    Item current = findItem(index);
    deletePrevious(current.getPrevious(), current.getNext());
    deleteNext(current.getPrevious(), current.getNext());
    deleteCurrent(current);
    size--;
    return current.getValue();
  }

  @Override
  public void clear() {
    super.clear();
    first = last = null;
  }

  @Override
  public int[] toArray() {
    int[] array = new int[size];
    Item current = first;
    for (int counter = 0; current != null; counter++) {
      array[counter] = current.getValue();
      current = current.getNext();
    }
    return array;
  }

  public Item findItem(int index) {
    checkIndex(index);
    Item current = first;
    for (int counter = 0; current != null; counter++) {
      if (index == counter) {
        return current;
      }
      current = current.getNext();
    }
    return null;
  }

  private void deletePrevious(Item previous, Item next) {
    if (previous != null) {
      previous.setNext(next);
    } else {
      first = next;
    }
  }

  private void deleteNext(Item previous, Item next) {
    if (next != null) {
      next.setPrevious(previous);
    } else {
      last = previous;
    }
  }

  private void deleteCurrent(Item current) {
    current.setPrevious(null);
    current.setNext(null);
  }
}
