//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {

        testArraysBinarySearch();


        testGenericArraysBinarySearch();


        testCollectionsBinarySearch();
    }

    private static void testArraysBinarySearch() {
        // Test for byte
        byte[] byteArray = {1, 3, 5, 7, 9};
        System.out.println("byte[]: " + Arrays.binarySearch(byteArray, (byte) 5)); // Expected: 2
        System.out.println("byte[] (not found): " + Arrays.binarySearch(byteArray, (byte) 6)); // Expected: -4

        // Test for char
        char[] charArray = {'a', 'c', 'e', 'g'};
        System.out.println("char[]: " + Arrays.binarySearch(charArray, 'e')); // Expected: 2
        System.out.println("char[] (not found): " + Arrays.binarySearch(charArray, 'b')); // Expected: -2

        // Test for double
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        System.out.println("double[]: " + Arrays.binarySearch(doubleArray, 3.3)); // Expected: 2
        System.out.println("double[] (not found): " + Arrays.binarySearch(doubleArray, 5.5)); // Expected: -5

        // Test for float
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f};
        System.out.println("float[]: " + Arrays.binarySearch(floatArray, 3.3f)); // Expected: 2
        System.out.println("float[] (not found): " + Arrays.binarySearch(floatArray, 5.5f)); // Expected: -5

        // Test for int
        int[] intArray = {1, 3, 5, 7, 9};
        System.out.println("int[]: " + Arrays.binarySearch(intArray, 5)); // Expected: 2
        System.out.println("int[] (not found): " + Arrays.binarySearch(intArray, 4)); // Expected: -3

        // Test for long
        long[] longArray = {10L, 20L, 30L, 40L};
        System.out.println("long[]: " + Arrays.binarySearch(longArray, 30L)); // Expected: 2
        System.out.println("long[] (not found): " + Arrays.binarySearch(longArray, 25L)); // Expected: -3

        // Test for short
        short[] shortArray = {2, 4, 6, 8};
        System.out.println("short[]: " + Arrays.binarySearch(shortArray, (short) 6)); // Expected: 2
        System.out.println("short[] (not found): " + Arrays.binarySearch(shortArray, (short) 7)); // Expected: -4
    }

    private static void testGenericArraysBinarySearch() {
        // Test for generic arrays with Comparator
        String[] stringArray = {"Alice", "Bob", "Charlie"};
        System.out.println("String[]: " + Arrays.binarySearch(stringArray, "Bob", String::compareTo)); // Expected: 1
        System.out.println("String[] (not found): " + Arrays.binarySearch(stringArray, "Dan", String::compareTo)); // Expected: -4

        Integer[] integerArray = {10, 20, 30, 40};
        System.out.println("Integer[]: " + Arrays.binarySearch(integerArray, 30, Comparator.naturalOrder())); // Expected: 2
        System.out.println("Integer[] (not found): " + Arrays.binarySearch(integerArray, 25, Comparator.naturalOrder())); // Expected: -3
    }

    private static void testCollectionsBinarySearch() {
        // Test for Collections with natural ordering
        List<Integer> intList = java.util.Arrays.asList(1, 3, 5, 7, 9);
        System.out.println("List<Integer>: " + Collections.binarySearch(intList, 5)); // Expected: 2
        System.out.println("List<Integer> (not found): " + Collections.binarySearch(intList, 6)); // Expected: -4

        // Test for Collections with custom Comparator
        List<String> stringList = java.util.Arrays.asList("Alice", "Bob", "Charlie");
        System.out.println("List<String>: " + Collections.binarySearch(stringList, "Charlie", String::compareTo)); // Expected: 2
        System.out.println("List<String> (not found): " + Collections.binarySearch(stringList, "Dan", String::compareTo)); // Expected: -4
    }
}
