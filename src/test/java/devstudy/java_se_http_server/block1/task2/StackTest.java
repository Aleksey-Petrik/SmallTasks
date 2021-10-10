package devstudy.java_se_http_server.block1.task2;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest {
  private final Stack stack = new Stack();

  @BeforeEach
  void setUp() {
    for (int i = 0; i < 20; i++) {
      stack.add(i);
    }
  }

  @Test
  void add() {
    stack.add(20);
    Truth.assertWithMessage("").that(stack.size()).isEqualTo(21);
    stack.add(21);
    Truth.assertWithMessage("").that(stack.size()).isEqualTo(22);
  }

  @Test
  void get() {
    int counter = 19;
    while (!stack.isEmpty()) {
      Truth.assertWithMessage("").that(stack.get()).isEqualTo(counter--);
    }
  }

  @Test
  void size() {
    Truth.assertWithMessage("").that(stack.size()).isEqualTo(20);
    get();
    Truth.assertWithMessage("").that(stack.size()).isEqualTo(0);
  }

  @Test
  void clear() {
    Truth.assertWithMessage("").that(stack.isEmpty()).isEqualTo(false);
    get();
    Truth.assertWithMessage("").that(stack.isEmpty()).isEqualTo(true);
  }

  @Test
  void peek() {
    Truth.assertWithMessage("").that(stack.peek()).isEqualTo(19);
    Truth.assertWithMessage("").that(stack.get()).isEqualTo(19);
    Truth.assertWithMessage("").that(stack.peek()).isEqualTo(18);
    Truth.assertWithMessage("").that(stack.peek()).isEqualTo(18);
  }
}