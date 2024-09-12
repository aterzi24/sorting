import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 8, 65, 8, 4, 23, 3, 14};
        // you can use any sort algorithm
        MergeSort.sort(arr);
//        HeapSort.sort(arr);
//        QuickSort.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}