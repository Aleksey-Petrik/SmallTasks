import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleMethod(new int[]{4, 3, 7, 1, 0, 2})));
        System.out.println(Arrays.toString(insertMethod(new int[]{4, 3, 7, 1, 0, 2})));
        System.out.println(Arrays.toString(selectMethod(new int[]{4, 3, 7, 1, 0, 2})));
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
    public static int[] insertMethod(int[] array){
        for (int i = 1; i < array.length; i++){
            for(int j = i; j > 0 && array[j - 1] > array[j]; j--){
                swap(array, j - 1, j);
            }
        }
        return array;
    }

    /*
        Сортировка методом "Выбором"
     */
    public static int[] selectMethod(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
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
        Метод замены елементов
     */
    private static void swap(int[] array, int currentIndex, int swapIndex) {
        int buf = array[currentIndex];
        array[currentIndex] = array[swapIndex];
        array[swapIndex] = buf;
    }
}
