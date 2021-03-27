package suyash;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = { 2,43,-3,77,-87,55 };

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }
            swap(array, lastUnsortedIndex, largest);
        }

        //Display the result
        System.out.println("Output:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    //Helper method to swap two values in the given array
    public static void swap(int[] intArray, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
        return;
    }
}
