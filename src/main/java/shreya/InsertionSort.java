package shreya;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int[] arr = {7,1,9,8,2,10,5};
        int[] arr1 = {7,6,5,4,3,2};
        System.out.println("Input array is : ");
        printArray(arr);


        insertionSort(arr);

        System.out.println("Sorted array is : ");
        printArray(arr);
    }


    public static void insertionSort(int[] arr){
        int n = arr.length;
       for(int i=1; i<n; i++){
           for(int j=i; j>0; j--){
               if(arr[j]<arr[j-1]){
                   swap(arr, j, j-1);
               }else{
                   break;
               }
           }
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