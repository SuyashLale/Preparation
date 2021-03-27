package suyash;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = { 2,43,-3,77,-87,55,-108 };

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];

                int j = i;
                while(j >= gap && array[j-gap] > newElement) {
                    //Keep shifting..
                    array[j] = array[j-gap];
                    j -= gap;
                }
                //Found insertion position..
                array[j] = newElement;
            }
        }

        //Display the result
        System.out.println("Output:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
