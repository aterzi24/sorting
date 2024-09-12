public class MergeSort {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length);
    }

    private static void sort(int[] arr, int start, int end) {
        if (start >= end - 1) {
            return;
        }
        int middle = (start + end) / 2;
        sort(arr, start, middle);
        sort(arr, middle, end);
        merge(arr, start, middle, end);
    }

    private static void merge(int[] arr, int start, int middle, int end) {
        int[] newArr = new int[end - start];
        int newArrIndex = 0;
        int index1 = start;
        int index2 = middle;
        while(index1 < middle && index2 < end) {
            if (arr[index1] < arr[index2]) {
                newArr[newArrIndex++] = arr[index1++];
            } else {
                newArr[newArrIndex++] = arr[index2++];
            }
        }
        while (index1 < middle) {
            newArr[newArrIndex++] = arr[index1++];
        }
        while (index2 < end) {
            newArr[newArrIndex++] = arr[index2++];
        }
        System.arraycopy(newArr, 0, arr, start, end - start);
    }
}
