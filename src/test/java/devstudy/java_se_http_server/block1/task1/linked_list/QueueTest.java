package devstudy.java_se_http_server.block1.task1.linked_list;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {
  private final Queue queue = new Queue();

  @BeforeEach
  void setUp() {
    for (int i = 0; i < 5; i++) {
      queue.add(i);
    }
  }

  @Test
  void get() {
    for (int i = 0; i < 5; i++) {
      Truth.assertWithMessage("").that(queue.get()).isEqualTo(i);
    }
    Truth.assertWithMessage("").that(queue.get()).isEqualTo(-1);
  }
}