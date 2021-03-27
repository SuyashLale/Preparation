package suyash;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = { 2,43,-3,77,-87,55 };

        for ( int lastSortedPartitionIndex = array.length - 1; lastSortedPartitionIndex > 0; lastSortedPartitionIndex--) {
            for ( int i = 0; i < lastSortedPartitionIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i+1);
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return;
    }
}
