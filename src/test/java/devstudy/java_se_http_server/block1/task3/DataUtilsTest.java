package devstudy.java_se_http_server.block1.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class DataUtilsTest {

  @BeforeEach
  void setUp() {
  }

  @Test
  void newImmutableDataSet() {
    DataSet<Integer> dataSet = DataUtils.newImmutableDataSet(new Integer[]{1, 2, 3, 4, 5});
    System.out.println(Arrays.toString(dataSet.toArray()));

    DataSet<Integer> dataSet2 = DataUtils.newImmutableDataSet(dataSet);
    System.out.println(Arrays.toString(dataSet2.toArray()));
  }
}