package algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class SortingAlgorithms {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(bubbleMethod(new int[]{4, 3, 7, 1, 0, 2})));
    System.out.println(Arrays.toString(insertMethod(new int[]{4, 3, 7, 1, 0, 2})));
    System.out.println(Arrays.toString(selectMethod(new int[]{4, 3, 7, 1, 0, 2})));

    int[] array = new int[]{4, 3, 7, 1, 0, 2};
    quickSortMethod(array, 0, array.length - 1);
    System.out.println(Arrays.toString(array));
  }

  /*
  K1 - номер квартиры
  K2 - номер квартиры
  P2 - подъезд
  N2 - этаж
  M - количество этажей
   */
  private void flat(int K1, int M, int K2, int P2, int N2) {
    // TODO: 01.10.2021 интересная задача
  }

  /*
      Сортировка методом "Пузырька"
   */
  public static int[] bubbleMethod(int[] array) {
    boolean turn = true;
    while (turn) {
      turn = false;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          swap(array, i, i + 1);
          turn = true;
        }
      }
    }
    return array;
  }

  /*
      Сортировка методом "Вставки"
   */
  public static int[] insertMethod(int[] array) {
    for (int i = 1; i < array.length; i++) {
      for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
        swap(array, j - 1, j);
      }
    }
    return array;
  }

  /*
      Сортировка методом "Выбором"
   */
  public static int[] selectMethod(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[minIndex] > array[j]) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        swap(array, minIndex, i);
      }
    }
    return array;
  }

  /*
      Сортировка методом "Быстрая сортировка метод Хоара"
      URL - https://ru.wikipedia.org/wiki/Быстрая_сортировка
   */
  public static void quickSortMethod(int[] array, int lo, int hi) {
    if (lo >= hi) {
      return;
    }
    int h = breakPartition(array, lo, hi);
    quickSortMethod(array, lo, h - 1);
    quickSortMethod(array, h + 1, hi);
  }

  private static int breakPartition(int[] array, int lo, int hi) {
    int i = lo + 1;
    int j = hi;
    int supportElement = array[lo];
    while (true) {
      for (; i < hi && array[i] < supportElement; i++) {
      }
      for (; array[j] > supportElement; j--) {
      }
      if (i >= j) {
        break;
      }
      swap(array, i++, j--);
    }
    swap(array, lo, j);
    return j;
  }

  /*
      "Пирамидальная сортировка(HEAP SORT)" джинерики + компаратор
   */
  public <T> void heapSort(T[] target, Comparator<T> comparator) {
    int length = target.length;

    // Построение кучи (перегруппируем массив)
    for (int i = length / 2 - 1; i >= 0; i--) {
      heap(target, comparator, length, i);
    }
    // Один за другим извлекаем элементы из кучи
    for (int i = length - 1; i >= 0; i--) {
      // Перемещаем текущий корень в конец
      swap2(target, 0, i);
      // Вызываем процедуру heapify на уменьшенной куче
      heap(target, comparator, i, 0);
    }
  }

  private <T> void heap(T[] target, Comparator<T> comparator, int n, int i) {
    int largest = i; // Инициализируем наибольший элемент как корень
    int l = 2 * i + 1; // левый = 2*i + 1
    int r = 2 * i + 2; // правый = 2*i + 2

    // Если левый дочерний элемент больше корня
    if (l < n && comparator.compare(target[l], target[largest]) > 0) {
      largest = l;
    }
    // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
    if (r < n && comparator.compare(target[r], target[largest]) > 0) {
      largest = r;
    }
    // Если самый большой элемент не корень
    if (largest != i) {
      swap2(target, i, largest);
      // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
      heap(target, comparator, n, largest);
    }
  }

  /*
      Метод замены елементов
   */
  private static void swap(int[] array, int currentIndex, int swapIndex) {
    int buf = array[currentIndex];
    array[currentIndex] = array[swapIndex];
    array[swapIndex] = buf;
  }

  private static <T> void swap2(T[] array, int currentIndex, int swapIndex) {
    T buf = array[currentIndex];
    array[currentIndex] = array[swapIndex];
    array[swapIndex] = buf;
  }
}
