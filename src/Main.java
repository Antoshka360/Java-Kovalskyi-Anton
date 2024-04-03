/**
 * Лабораторна робота №2
 * Виконав студент групи СІ-22 Ковальський Антон Юрійович
 */
public class Main {
    public static void main(String[] args) {
        double[] array = {0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9};

        for (int i = 0; i < array.length; i += 2) {
            array[i] = Math.pow(array[i], 5);
        }

        System.out.println("Array after raising even-indexed elements to the power of 5:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }
}