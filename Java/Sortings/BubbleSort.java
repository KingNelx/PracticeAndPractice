package Sortings;

class Bubble {

    // check if array is empty
    public void arrayIsEmpty(int[] arr) {
        try {
            if (arr.length <= 0) {
                System.out.println(" Array is empty or Array size is negative ");
            }
        } catch (NegativeArraySizeException exception) {
            System.out.println(" This array: " + arr + " is empty " + exception.getLocalizedMessage());
        }
        System.out.println(" Upon Checking array size is not empty ");
    }

    // print elements
    public void printElements(int[] arr) {
        System.out.print(" Unsorted Elements: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    // sort array elements in ascending order
    public void sortElementsAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tempValue = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempValue;
                }
            }
        }

        System.out.print("\n Sorted Elements Ascending order: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public void sortElementsDescending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tempValue = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempValue;
                }
            }
        }

        System.out.print("\n Sorted Elements Descending order: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        int[] myArray = { 2, 4, 5, 1, 3 };

        Bubble bubble = new Bubble();

        bubble.arrayIsEmpty(myArray);
        bubble.printElements(myArray);
        bubble.sortElementsAscending(myArray);
        bubble.sortElementsDescending(myArray);
    }
}
