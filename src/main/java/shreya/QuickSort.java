package shreya;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        int[] arr = {7,1,9,8,2,10,5};
        int[] arr1 = {7,6,5,4,3,2};
        System.out.println("Input array is : ");
        printArray(arr1);


        quicksort(arr1, 0, arr1.length-1);

        System.out.println("Sorted array is : ");
        printArray(arr1);

    }

    static void quicksort(int arr[], int l, int h)
    {
        if (l < h) {
            int p = partition(arr, l, h);
            quicksort(arr, l, p-1);
            quicksort(arr, p, h);
        }
    }

    private static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];

        int i = l + 1;
        int j = h;
        while (i <= j) {
            if (arr[i] < pivot) {
                i++;
            } else {
                swap(arr, i, j);
                j--;
            }

        }
        swap(arr, i-1, l);
        return i;
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

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}
