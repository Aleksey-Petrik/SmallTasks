package devstudy.java_se_http_server.block1.task3;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class DataUtilsTest {

  @BeforeEach
  void setUp() {
  }

  @Test
  void newImmutableDataSetArray() {
    DataSet<Integer> dataSet = DataUtils.newImmutableDataSet(new Integer[]{1, 2, 3, 4, 5});
    DataSet<Integer> dataSetExpected = new DynamicArray<>();
    dataSetExpected.add(1);
    dataSetExpected.add(2);
    dataSetExpected.add(3);
    dataSetExpected.add(4);
    dataSetExpected.add(5);
    Truth.assertWithMessage("").that(dataSet.toArray()).isEqualTo(dataSetExpected.toArray());
  }

  @Test
  void newImmutableDataSetVars() {
    DataSet<Integer> dataSet = DataUtils.newImmutableDataSet(1, 2, 3, 4, 5);
    DataSet<Integer> dataSetExpected = new DynamicArray<>();
    dataSetExpected.add(1);
    dataSetExpected.add(2);
    dataSetExpected.add(3);
    dataSetExpected.add(4);
    dataSetExpected.add(5);

    Truth.assertWithMessage("").that(dataSet).isEqualTo(dataSetExpected);
/*
    Integer[] arr = (Integer[])dataSet.toArray();
    var arr2 = (Integer[])dataSetExpected.toArray();
    Truth.assertWithMessage("").that(arr).isEqualTo(arr2);

 */
  }

  @Test
  void newLinkedListWithDuplicates() {
    DataSet[] dataSet = new DataSet[3];

    dataSet[0] = new LinkedList<Integer>();
    dataSet[0].add(1);
    dataSet[0].add(2);
    dataSet[0].add(3);
    dataSet[0].add(4);
    dataSet[0].add(5);

    dataSet[1] = new DynamicArray<Integer>();
    dataSet[1].add(11);
    dataSet[1].add(12);
    dataSet[1].add(13);
    dataSet[1].add(14);
    dataSet[1].add(15);

    dataSet[2] = new LinkedList<Integer>();
    dataSet[2].add(6);
    dataSet[2].add(7);
    dataSet[2].add(8);
    dataSet[2].add(9);
    dataSet[2].add(10);

    LinkedList<Integer> list = DataUtils.newLinkedListWithDuplicates(dataSet[0], dataSet[2], dataSet[1]);
    System.out.println(Arrays.toString(list.toArray()));

  }

  @Test
  void newDataSetWithoutDuplicates() {
    DataSet[] dataSet = new DataSet[3];

    dataSet[0] = new LinkedList<Integer>();
    dataSet[0].add(1);
    dataSet[0].add(2);
    dataSet[0].add(3);
    dataSet[0].add(4);
    dataSet[0].add(5);

    dataSet[1] = new DynamicArray<Integer>();
    dataSet[1].add(11);
    dataSet[1].add(1);
    dataSet[1].add(13);
    dataSet[1].add(14);
    dataSet[1].add(3);

    dataSet[2] = new LinkedList<Integer>();
    dataSet[2].add(6);
    dataSet[2].add(7);
    dataSet[2].add(2);
    dataSet[2].add(9);
    dataSet[2].add(10);
    
    DataSet<Integer>expectedDataSet = new DynamicArray<>();
    expectedDataSet.add(1);
    expectedDataSet.add(2);
    expectedDataSet.add(3);
    expectedDataSet.add(4);
    expectedDataSet.add(5);
    expectedDataSet.add(11);
    expectedDataSet.add(13);
    expectedDataSet.add(14);
    expectedDataSet.add(6);
    expectedDataSet.add(7);
    expectedDataSet.add(9);
    expectedDataSet.add(10);

    DataSet<Integer> list = DataUtils.newDataSetWithoutDuplicates(dataSet[0], dataSet[1], dataSet[2]);
    Object[] actualArray = list.toArray();
    Object[] expectedArray = expectedDataSet.toArray();

    Truth.assertWithMessage("").that(actualArray).isEqualTo(expectedArray);
    System.out.println(Arrays.toString(list.toArray()));
  }
}