package devstudy.java_se_http_server.block1.task2;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {
  private final Queue queue = new Queue();

  @BeforeEach
  void setUp() {
    for (int i = 0; i < 20; i++) {
      queue.add(i);
    }
  }

  @Test
  void add() {
    queue.add(20);
    Truth.assertWithMessage("").that(queue.size()).isEqualTo(21);
    queue.add(21);
    Truth.assertWithMessage("").that(queue.size()).isEqualTo(22);
  }

  @Test
  void get() {
    int counter = 0;
    while (!queue.isEmpty()) {
      Truth.assertWithMessage("").that(queue.get()).isEqualTo(counter++);
    }
  }

  @Test
  void size() {
    Truth.assertWithMessage("").that(queue.size()).isEqualTo(20);
    get();
    Truth.assertWithMessage("").that(queue.size()).isEqualTo(0);
  }

  @Test
  void clear() {
    Truth.assertWithMessage("").that(queue.isEmpty()).isEqualTo(false);
    get();
    Truth.assertWithMessage("").that(queue.isEmpty()).isEqualTo(true);
  }

  @Test
  void peek() {
    Truth.assertWithMessage("").that(queue.peek()).isEqualTo(0);
    Truth.assertWithMessage("").that(queue.get()).isEqualTo(0);
    Truth.assertWithMessage("").that(queue.peek()).isEqualTo(1);
    Truth.assertWithMessage("").that(queue.peek()).isEqualTo(1);
  }

}