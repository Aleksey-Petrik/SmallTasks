package devstudy.java_se_http_server.block1.task1;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.Test;

class DynamicArrayTest {

  @Test
  void add() {
    int[] expectedArray = new int[20];
    DynamicArray dynamicArray = new DynamicArray();
    for (int i = 0; i < 20; i++) {
      dynamicArray.add(i);
      expectedArray[i] = i;
    }
    Truth.assertWithMessage("ERROR").that(dynamicArray.toArray()).isEqualTo(expectedArray);
  }

  @Test
  void get() {
  }

  @Test
  void size() {
  }

  @Test
  void remove() {
  }

  @Test
  void clear() {
  }

  @Test
  void toArray() {
  }
}