package devstudy.java_se_http_server.block1.task1.linked_list;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListTest {
  private LinkedList linkedList = new LinkedList();

  @BeforeEach
  void setUp() {
    for (int i = 0; i < 20; i++) {
      linkedList.add(i);
    }
  }

  @Test
  void add() {
    linkedList.add(20);
    linkedList.add(21);
    Truth.assertWithMessage("").that(linkedList.size()).isEqualTo(22);
    Truth.assertWithMessage("").that(linkedList.get(20)).isEqualTo(20);
  }

  @Test
  void get() {
    Truth.assertWithMessage("").that(linkedList.get(0)).isEqualTo(0);
    Truth.assertWithMessage("").that(linkedList.get(8)).isEqualTo(8);
    Truth.assertWithMessage("").that(linkedList.get(19)).isEqualTo(19);
  }

  @Test
  void remove() {
    Truth.assertWithMessage("").that(linkedList.remove(0)).isEqualTo(0);
    Truth.assertWithMessage("").that(linkedList.remove(5)).isEqualTo(6);
    Truth.assertWithMessage("").that(linkedList.remove(15)).isEqualTo(17);
    Truth.assertWithMessage("").that(linkedList.size()).isEqualTo(17);
  }

  @Test
  void size() {
    Truth.assertWithMessage("").that(linkedList.size()).isEqualTo(20);
  }

  @Test
  void clear() {
    linkedList.clear();
    Truth.assertWithMessage("").that(linkedList.size()).isEqualTo(0);
  }

  @Test
  void toArray() {
    Truth.assertWithMessage("").that(linkedList.toArray())
            .isEqualTo(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19});
  }

  @Test
  void findItem() {
  }
}