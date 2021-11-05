package devstudy.java_se_http_server.block1.task3;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataUtilsTest {
  private final DataSet[] dataSet = new DataSet[3];

  @BeforeEach
  void setUp() {
    dataSet[0] = new LinkedList<Integer>();
    dataSet[1] = new DynamicArray<Integer>();
    dataSet[2] = new LinkedList<Integer>();

    fillDataSet(dataSet[0], 1, 5);
    fillDataSet(dataSet[1], 11, 15);
    fillDataSet(dataSet[2], 6, 10);
  }

  @Test
  void newImmutableDataSetArray() {
    DataSet<Integer> actualDataSet = DataUtils.newImmutableDataSet(new Integer[]{1, 2, 3, 4, 5});
    DataSet<Integer> dataSetExpected = new DynamicArray<>();
    fillDataSet(dataSetExpected, 1, 5);
    Truth.assertWithMessage("").that(actualDataSet.toArray()).isEqualTo(dataSetExpected.toArray());
  }

  @Test
  void newImmutableDataSetVars() {
    DataSet<Integer> actualDataSet = DataUtils.newImmutableDataSet(1, 2, 3, 4, 5);
    Object[] actualArray = actualDataSet.toArray();
    Object[] expectedArray = dataSet[0].toArray();
    Truth.assertWithMessage("").that(actualArray).isEqualTo(expectedArray);
  }

  @Test
  void newLinkedListWithDuplicates() {
    LinkedList list = DataUtils.newLinkedListWithDuplicates(dataSet[0], dataSet[2], dataSet[1]);
    Object[] actualArray = list.toArray();
    DataSet<Integer> expectedDataSet = new DynamicArray<>();
    fillDataSet(expectedDataSet, 1, 15);
    Object[] expectedArray = expectedDataSet.toArray();
    Truth.assertWithMessage("ERROR").that(actualArray).isEqualTo(expectedArray);
  }

  @Test
  void newDataSetWithoutDuplicates() {
    DataSet expectedDataSet = DataUtils.newDataSetWithoutDuplicates(dataSet[0], dataSet[2]);
    DataSet<Integer> duplicatesDataSet = new DynamicArray<>();
    fillDataSet(duplicatesDataSet, 1, 10);
    DataSet list = DataUtils.newDataSetWithoutDuplicates(dataSet[0], dataSet[2], duplicatesDataSet);
    Object[] actualArray = list.toArray();
    Object[] expectedArray = expectedDataSet.toArray();
    Truth.assertWithMessage("ERROR").that(actualArray).isEqualTo(expectedArray);
  }

  @Test
  void newQueue() {
    Queue queueActual = DataUtils.newQueue(dataSet[0]);
    Queue<Integer>queueExpected = new Queue<>();
    queueExpected.add(1);
    queueExpected.add(2);
    queueExpected.add(3);
    queueExpected.add(4);
    queueExpected.add(5);
    Truth.assertWithMessage("ERROR").that(queueActual).isEqualTo(queueExpected);
  }

  private void fillDataSet(DataSet dataSet, int start, int end) {
    for (int i = start; i <= end; i++) {
      dataSet.add(i);
    }
  }

}