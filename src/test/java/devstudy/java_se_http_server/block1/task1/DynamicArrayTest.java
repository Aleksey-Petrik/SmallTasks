package devstudy.java_se_http_server.block1.task1;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DynamicArrayTest {
  private DynamicArray dynamicArray = new DynamicArray();

  @BeforeEach
  void setUp() {
    for (int i = 0; i < 20; i++) {
      dynamicArray.add(i);
    }
  }

  @Test
  void add() {
    int[] expectedArray = new int[25];

    dynamicArray.add(20);
    dynamicArray.add(21);
    dynamicArray.add(22);
    dynamicArray.add(23);
    dynamicArray.add(24);

    for (int i = 0; i < 25; i++) {
      expectedArray[i] = i;
    }
    Truth.assertWithMessage("ERROR").that(dynamicArray.toArray()).isEqualTo(expectedArray);
  }

  @Test
  void get() {
    Truth.assertWithMessage("ERROR").that(dynamicArray.get(4)).isEqualTo(4);
    Truth.assertWithMessage("ERROR").that(dynamicArray.get(8)).isEqualTo(8);
    Truth.assertWithMessage("ERROR").that(dynamicArray.get(19)).isEqualTo(19);
  }

  @Test
  void size() {
    Truth.assertWithMessage("ERROR").that(dynamicArray.size()).isEqualTo(20);
  }

  @Test
  void remove() {
    Truth.assertWithMessage("ERROR").that(dynamicArray.remove(6)).isEqualTo(6);
    Truth.assertWithMessage("ERROR").that(dynamicArray.remove(3)).isEqualTo(3);
    Truth.assertWithMessage("ERROR").that(dynamicArray.remove(4)).isEqualTo(5);
  }

  @Test
  void clear() {
    size();
    dynamicArray.clear();
    Truth.assertWithMessage("ERROR").that(dynamicArray.size()).isEqualTo(0);
  }

  @Test
  void toArray() {
    Truth.assertWithMessage("ERROR").that(dynamicArray.toArray()).isEqualTo(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19});
  }
}