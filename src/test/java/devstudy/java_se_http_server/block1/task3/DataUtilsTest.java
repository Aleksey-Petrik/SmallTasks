package devstudy.java_se_http_server.block1.task3;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataUtilsTest {

  @BeforeEach
  void setUp() {
  }

  @Test
  void newImmutableDataSet() {
    DataSet<Integer> dataSet = DataUtils.newImmutableDataSet(new Integer[]{1, 2, 3, 4, 5});
    DataSet<Integer> dataSetExpected = new DynamicArray<>();
    dataSetExpected.add(1);
    dataSetExpected.add(2);
    dataSetExpected.add(3);
    dataSetExpected.add(4);
    dataSetExpected.add(5);
    Truth.assertWithMessage("").that(dataSet.toArray()).isEqualTo(dataSetExpected.toArray());
  }
}