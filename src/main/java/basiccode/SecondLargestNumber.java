package basiccode;

import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] arr = new int[] {3,6,3,7,9,24};
        System.out.println(findSecondLargest(arr));
        System.out.println(findSecondLargestUsingStreams(arr));
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1; // Not enough elements
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        return second;
    }

    public static int findSecondLargestUsingStreams(int[] arr) {
        return IntStream.of(arr)
                .distinct()
                .boxed()// Comparator.reverseOrder method don't work on primitive int. so boxed is used to convert int to Integer.
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Not found"));
    }
}
