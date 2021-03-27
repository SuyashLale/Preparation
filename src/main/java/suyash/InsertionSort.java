package suyash;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = { 2,43,-3,77,-87,55 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            //Store the value being compared in a var
            int newElement = array[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && array[i-1] > newElement; i--) {
                array[i] = array[i-1];
            }
            //Insert the value
            array[i] = newElement;
        }
        //Display the result
        System.out.println("Output:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
