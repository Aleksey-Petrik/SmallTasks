package devstudy.java_se_http_server.block1.task1.linked_list;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest {
  private final Stack stack = new Stack();

  @BeforeEach
  void setUp() {
    for (int i = 0; i < 5; i++) {
      stack.add(i);
    }
  }

  @Test
  void get() {
    for (int i = 4; i >= 0; i--) {
      Truth.assertWithMessage("").that(stack.get()).isEqualTo(i);
    }
    Truth.assertWithMessage("").that(stack.get()).isEqualTo(-1);
  }

}