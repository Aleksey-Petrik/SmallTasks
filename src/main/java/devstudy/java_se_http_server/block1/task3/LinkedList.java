package devstudy.java_se_http_server.block1.task3;

public class LinkedList<T> extends DataSet<T> {
  protected Item<T> first;
  protected Item<T> last;

  @Override
  public void add(T element) {
    if (first == null) {
      first = last = new Item(element);
    } else {
      var newItem = new Item(element);
      last.setNext(newItem);
      newItem.setPrevious(last);
      last = newItem;
    }
    size++;
  }

  public void addAll(LinkedList<T> linkedList) {
    if (first == null) {
      first = linkedList.first;
    } else {
      last.setNext(linkedList.first);
      linkedList.first.setPrevious(last);
    }
    last = linkedList.last;
    size += linkedList.size;
  }

  @Override
  public T get(int index) {
    return findItem(index).getValue();
  }

  @Override
  public T remove(int index) {
    checkIndex(index);
    Item<T> current = findItem(index);
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
  public T[] toArray() {
    T[] array = (T[]) new Object[size];
    Item<T> current = first;
    for (int counter = 0; current != null; counter++) {
      array[counter] = current.getValue();
      current = current.getNext();
    }
    return array;
  }

  public Item<T> findItem(int index) {
    checkIndex(index);
    Item<T> current = first;
    for (int counter = 0; current != null; counter++) {
      if (index == counter) {
        return current;
      }
      current = current.getNext();
    }
    return null;
  }

  private void deletePrevious(Item<T> previous, Item<T> next) {
    if (previous != null) {
      previous.setNext(next);
    } else {
      first = next;
    }
  }

  private void deleteNext(Item<T> previous, Item<T> next) {
    if (next != null) {
      next.setPrevious(previous);
    } else {
      last = previous;
    }
  }

  private void deleteCurrent(Item<T> current) {
    current.setPrevious(null);
    current.setNext(null);
  }
}
