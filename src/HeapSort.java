public class HeapSort {
    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = length / 2; i >= 0; i--) {
            percolateDown(arr, i, length);
        }
        for (int i = length - 1; i > 0; i--) {
            swap(arr, 0, i);
            percolateDown(arr, 0, i);
        }
    }

    private static void percolateDown(int[] arr, int index, int size) {
        while ((index + 1) * 2 - 1 < size) {
            int leftChildIndex = (index + 1) * 2 - 1;
            int rightChildIndex = leftChildIndex + 1;
            int selectedIndex;
            if (rightChildIndex < size && arr[leftChildIndex] < arr[rightChildIndex]) {
                selectedIndex = rightChildIndex;
            } else {
                selectedIndex = leftChildIndex;
            }
            if (arr[selectedIndex] <= arr[index]) {
                return;
            }
            swap(arr, index, selectedIndex);
            index = selectedIndex;
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
