public class QuickSort {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length);
    }

    private static void sort(int[] arr, int start, int end) {
        if (start >= end - 1) {
            return;
        }
        int pivot = arr[end - 1];
        int index1 = start;
        int index2 = start;
        while (index2 < end - 1) {
            if (arr[index2] < pivot) {
                swap(arr, index1, index2);
                index1++;
            }
            index2++;
        }
        swap(arr, index1, end - 1);
        sort(arr, start, index1);
        sort(arr, index1 + 1, end);
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
