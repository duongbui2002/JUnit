import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class Week4Test {

    @Test
    public void testMax2Int1() {
        int actual = Week4.max2Int(5, 6);
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test
    public void testMax2Int2() {
        int actual = Week4.max2Int(8, 6);
        int expected = 8;
        assertEquals(actual, expected);
    }

    @Test
    public void testMax2Int3() {
        int actual = Week4.max2Int(5, 7);
        int expected = 7;
        assertEquals(actual, expected);
    }

    @Test
    public void testMax2Int4() {
        int actual = Week4.max2Int(5, 2);
        int expected = 5;
        assertEquals(actual, expected);
    }

    @Test
    public void testMax2Int5() {
        int actual = Week4.max2Int(1, 6);
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test
    public void testMinArray1() {
        int[] given = new int[]{1, 2, 3, 3};
        int actual = Week4.minArray(given);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testMinArray2() {
        int[] given = new int[]{10, 2, 3, 3};
        int actual = Week4.minArray(given);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testMinArray3() {
        int[] given = new int[]{11, 21, 3, 3};
        int actual = Week4.minArray(given);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testMinArray4() {
        int[] given = new int[]{12, 24, 36, 35, 9};
        int actual = Week4.minArray(given);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void testMinArray5() {
        int[] given = new int[]{1, 2};
        int actual = Week4.minArray(given);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateBMI1() {
        String actual = Week4.calculateBMI(65, 1.77);
        String expected = "Bình Thường";
        assertEquals(actual, expected);
    }

    @Test
    public void testCalculateBMI2() {
        String actual = Week4.calculateBMI(60, 1.8);
        String expected = "Bình Thường";
        assertEquals(actual, expected);
    }

    @Test
    public void testCalculateBMI3() {
        String actual = Week4.calculateBMI(50, 1.9);
        String expected = "Thừa cân";
        assertEquals(actual, expected);
    }

    @Test
    public void testCalculateBMI4() {
        String actual = Week4.calculateBMI(45, 1.48);
        String expected = "Bình Thường";
        assertEquals(actual, expected);
    }

    @Test
    public void testCalculateBMI5() {
        String actual = Week4.calculateBMI(77, 1.66);
        String expected = "Béo phì";
        assertEquals(actual, expected);
    }
}
