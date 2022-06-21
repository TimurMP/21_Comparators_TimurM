package telran.arrays.tools;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {
    Integer[] arrNum;
    String[] arrStr;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 7, 2, 5, 9, 1, 0};
        arrStr = new String[]{"one", "two", "three", "four", "five"};
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

    @Test
    void testBubbleSortStrComparator() {
        System.out.println("Test BubbleSortString Comparator");
        ArrayTools.bubbleSort(arrStr, (s1, s2) -> s1.length() - s2.length());
        ArrayTools.printArray(arrStr);

    }

}
