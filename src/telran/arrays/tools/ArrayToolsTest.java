package telran.arrays.tools;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {
    Integer[] arrNum;
    String[] arrStr;
    Integer[] origin;


    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 7, 2, 5, 9, 1, 0, 1, 25, 24, 26, 88};
        arrStr = new String[]{"one", "two", "three", "four", "five"};
//        origin = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 3};
        origin = new Integer[]{1, 2, 3, 6, 4, 5, 6, 7, 8, 4, 9, 3, 5, 8};


    }

    @Test
    void testPrintArray() {
        System.out.println("Test Print Array");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void testFindFirst() {
        System.out.println("Test Find First");
        Integer res = ArrayTools.findFirst(arrNum, n -> n % 2 == 0);
        System.out.println(res);
        String str = ArrayTools.findFirst(arrStr, s -> s.length() == 4);
        System.out.println(str);
    }


    @Test
    void testBubbleSortInt() {
        System.out.println("Test Bubble Sort Integer");
        ArrayTools.bubbleSort(arrNum);
        ArrayTools.printArray(arrNum);


    }

    @Test
    void testBubbleSortStr() {
        System.out.println("Test Bubble Sort String");
        ArrayTools.bubbleSort(arrStr);
        ArrayTools.printArray(arrStr);

    }

//    @Test
//    void testBubbleSortStrComparator() {
//        System.out.println("Test Bubble Sort String Comparator");
//        ArrayTools.bubbleSort(arrStr, (s1, s2) -> s1.length() - s2.length());
//        ArrayTools.printArray(arrStr);
//
//    }

    @Test
    void OddEvenComparator() {
        System.out.println("Test Bubble Sort String Odd Even Comparator");
        ArrayTools.bubbleSort(origin, (i1, i2) -> {
            return i1 - i2;

        }, (i1, i2) -> {
            int odd = i2 - i1;
            if (i1 % 2 == 0) {
                return 0;
            }
            return odd;

        });
        ArrayTools.printArray(origin);

    }

}
