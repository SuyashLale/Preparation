package shreya;

public class MergeSort {

    void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int a[] = new int[n1];
        int b[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            a[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            b[j] = arr[m + 1 + j];


        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                arr[k++] = a[i++];
            }
            else {
                arr[k++] = b[j++];
            }
        }

        while (i < n1) {
            arr[k++] = a[i++];
        }

        while (j < n2) {
            arr[k++] = b[j++];
        }
    }


    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Imput array is :");
        printArray(arr);


        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array is :");
        printArray(arr);
    }
}
