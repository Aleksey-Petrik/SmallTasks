package devstudy.java_se_http_server.block1.task3;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public final class DataUtils {

  public static <T> DynamicArray<T> newDynamicArray() {
    return new DynamicArray<T>();
  }

  public static <T> DataSet<T> newImmutableDataSet(final DataSet<T> dataSet) {
    return newImmutableDataSet(dataSet.toArray());// Использовать анонимный внутренний класс
  }

  public static <T> DataSet<T> newImmutableDataSet(final T[] array) {
    return new DataSet<T>() {
      {
        size = array.length;
      }

      @Override
      public void add(T element) {
      }

      @Override
      public T get(int index) {
        if (index >= 0 && index < array.length) {
          return array[index];
        }
        return null;
      }

      @Override
      public T remove(int index) {
        return null;
      }

      @Override
      public T[] toArray() {
        return Arrays.copyOf(array, size);
      }

    };// Использовать анонимный внутренний класс
  }

  public static <T> DataSet<T> newImmutableDataSet(final T element, final T... elements) {
    T[] array = (T[]) new Object[elements.length + 1];
    array[0] = element;
    System.arraycopy(elements, 0, array, 1, elements.length);
    return newImmutableDataSet(array); // Использовать анонимный внутренний класс
  }

  public static <T> LinkedList<T> newLinkedListWithDuplicates(final DataSet<T>... dataSets) {
    LinkedList<T> resultList = new LinkedList<>();
    for (DataSet<T> element : dataSets) {
      if (element instanceof LinkedList) {
        resultList.addAll((LinkedList<T>) element);
      } else {
        for (int i = 0; i < element.size(); i++) {
          resultList.add(element.get(i));
        }
      }
    }
    return resultList; //Использовать оптимальный алгоритм для объединения
  }

  public static <T> DataSet<T> newDataSetWithoutDuplicates(final DataSet<T>... dataSets) {
    DataSet<T> dataSet = new DynamicArray<>() {
      @Override
      public void add(T element) {
        if (!elementExist(element)) {
          super.add(element);
        }
      }

      @Override
      public T remove(int index) {
        return null;
      }

      private boolean elementExist(T element) {
        for (T value : super.toArray()) {
          if (value.equals(element)) {
            return true;
          }
        }
        return false;
      }
    };

    LinkedList<T> linkedList = newLinkedListWithDuplicates(dataSets);

    Item<T> current = linkedList.first;
    while (current != null) {
      dataSet.add(current.getValue());
      current = current.getNext();
    }

    return dataSet; // Использовать внутренний класс для реализации логики по удалению дубликатов
  }

  public static <T> Queue<T> newQueue(final DataSet<T> dataSet) {
    if (dataSet instanceof LinkedList) {
      return new Queue<>((LinkedList<T>) dataSet);
    }
    return new Queue<T>(newLinkedListWithDuplicates(dataSet)); //Учитывать эффективность массива и связного списка при создании очереди
  }

  public static <T> Stack<T> newStack(final DataSet<T> dataSet) {
    if (dataSet instanceof DynamicArray) {
      return new Stack<>((DynamicArray<T>) dataSet);
    }
    return newStack(dataSet.toArray()); //Учитывать эффективность массива и связного списка при создании стэка
  }

  public static <T> Queue<T> newQueue(final T[] array) {
    return newQueue(newImmutableDataSet(array)); //Учитывать эффективность массива и связного списка при создании очереди
  }

  public static <T> Stack<T> newStack(final T[] array) {
    return new Stack<T>(new DynamicArray<>(array)); //Учитывать эффективность массива и связного списка при создании стэка
  }

  private DataUtils() {
  }
}
