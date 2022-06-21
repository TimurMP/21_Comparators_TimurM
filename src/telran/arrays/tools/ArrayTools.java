package telran.arrays.tools;

import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayTools {
    public static void printArray(Object[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("==================***===================");

    }


    public static <T> T findFirst(T[] arr, Predicate<T> tester) {
        for (int i = 0; i < arr.length; i++) {
            if (tester.test(arr[i])) {
                return arr[i];
            }
        }
        return null;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }

            }

        }
    }

    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator, Comparator<T> comparator1) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (comparator.compare(arr[j], arr[j+1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
        }

    }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (comparator1.compare(arr[j], arr[j+1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }

        }

}}
