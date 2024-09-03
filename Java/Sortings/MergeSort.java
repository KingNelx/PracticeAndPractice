package Sortings;

class Merge {

    public void mergeSort(int[] arr) {
        int length = arr.length;

        if (length <= 1) {
            return;
        }

        int middlePosition = length / 2;
        int[] leftArray = new int[middlePosition];
        int[] rightArray = new int[length - middlePosition];

        for (int i = 0; i < length; i++) {
            if (i < middlePosition) {
                leftArray[i] = arr[i];
            } else {
                rightArray[i - middlePosition] = arr[i];
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, arr);
    }

    public void merge(int[] leftArray, int[] rightArray, int[] arr) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0;
        int left = 0;
        int right = 0;

        while (left < leftSize && right < rightSize) {
            if (leftArray[left] < rightArray[right]) {
                arr[i] = leftArray[left];
                left++;
            } else {
                arr[i] = rightArray[right];
                right++;
            }
            i++;
        }

        while (left < leftSize) {
            arr[i] = leftArray[left];
            left++;
            i++;
        }
        while (right < rightSize) {
            arr[i] = rightArray[right];
            right++;
            i++;
        }
    }
}

public class MergeSort {
    public static void main(String[] args) {
        int[] testArray = { 3, 5, 1, 4, 2 };
        Merge mergeObject = new Merge();
        mergeObject.mergeSort(testArray);

        System.out.println("Sorted Array:");
        for (int x : testArray) {
            System.out.print(x + " ");
        }
    }
}
