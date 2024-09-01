package Sortings.BubbleAlgo;

class bubble {

    public void displayElements(int[] arr) {
        System.out.print(" Original Elements: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public void sortElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 - 1; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tempValue = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tempValue;
                }
            }
        }
        printSortedElements(arr);
    }

    private void printSortedElements(int[] arr) {
        System.out.print("\n Sorted Elements: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

public class BubbleSort {

    public static void main(String[] args) {
        bubble object = new bubble();

        int[] testArray = { 4, 1, 2, 5, 3 };
        object.displayElements(testArray);
        object.sortElements(testArray);
        
    }
}
