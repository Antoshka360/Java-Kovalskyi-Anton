/**
 * Лабораторна робота №2 (Доповнення)
 * Виконав студент групи СІ-22 Ковальський Антон Юрійович
 */
public class Addition {
    public static void main(String[] args) {
        int[] array = {1, 0, 3, 4, 0, 9, 7, 8, 6};

        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Index of maximum element: " + maxIndex);

        int firstZeroIndex = -1;
        int secondZeroIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                if (firstZeroIndex == -1) {
                    firstZeroIndex = i;
                } else {
                    secondZeroIndex = i;
                    break;
                }
            }
        }
        int product = 1;
        if (firstZeroIndex != -1 && secondZeroIndex != -1) {
            for (int i = firstZeroIndex + 1; i < secondZeroIndex; i++) {
                product *= array[i];
            }
        }
        System.out.println("Product of elements between first and second zero elements: " + product);

        // Перетворення масиву
        int[] transformedArray = new int[array.length];
        int oddIndex = 0;
        int evenIndex = array.length / 2;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                transformedArray[evenIndex++] = array[i];
            } else {
                transformedArray[oddIndex++] = array[i];
            }
        }

        System.out.println("Transformed array:");
        for (int num : transformedArray) {
            System.out.print(num + " ");
        }
    }
}