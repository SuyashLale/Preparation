package shreya;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();

        int[] arr = {7,1,9,8,2,10,5};
        int[] arr1 = {7,6,5,4,3,2};
        System.out.println("Input array is : ");
        printArray(arr);


        selectionSort(arr);

        System.out.println("Sorted array is : ");
        printArray(arr);
    }


    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int smallest = i;
            for(int j = i+1; j<n; j++){
             if(arr[j] < arr[smallest]){
                 smallest = j;
             }
            }
            swap(arr, smallest, i);
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

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}
