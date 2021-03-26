package shreya;

public class BitonicArray {

    public static void main(String[] args) {
        int arr1[] = {-3, 9, 18, 20, 17, 5, 1};
        int arr2[] = {5, 6, 7, 8, 9, 10, 3, 2, 1};

        int bitonicIndex =  findBitonicPointIndex(arr1);
//
//        System.out.println("Bitonic point index is "+bitonicIndex);
//        System.out.println("Bitonic point value is "+arr1[bitonicIndex]);

        int element = 9;

       // System.out.println("Lets start searching of element "+element );
        int elementIndex = searchElement(arr1, element, arr1.length, bitonicIndex);
        //System.out.println("Search completed of element  "+element);
        System.out.println("ELement  index is "+elementIndex);
        //System.out.println("Element searched is is " + element);


    }

    private static int searchElement(int[] arr, int element, int length, int bitonicIndex) {
        if(arr[bitonicIndex] < element){
            return -1;
        }
        if(arr[bitonicIndex] == element){
            return bitonicIndex;
        }
        int elIndex = searchIncreasingPart(bitonicIndex, element, arr);
        if(elIndex == -1 ){
            return searchDecreasingPart(bitonicIndex, element, arr);
        }else
            return elIndex;



    }

    private static int searchIncreasingPart(int bitonicIndex, int element, int[] arr) {
        System.out.println("Searching in increasing part");
        int low = 0;
        int high = bitonicIndex-1;

        while(low<=high){
            int mid = (low+high+1)/2;
            System.out.println("low = "+low + " and "+"high = "+high + " and "+" mid = "+mid);
            if(element > arr[mid]){
                low = mid+1;
            }else if(element<arr[mid]){
                high = mid-1;
            }else{
                return mid;
            }
        }
        return  -1;
    }

    private static int searchDecreasingPart(int bitonicIndex, int element, int[] arr) {
        System.out.println("Searching in decreasing part");
        int low = bitonicIndex+1;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high+1)/2;

            if(element > arr[mid]){
                high = mid-1;
            }else if(element<arr[mid]){
                low = mid+1;
            }else{
                return mid;
            }
        }
        return  -1;
    }

    private static int findBitonicPointIndex(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;

        while(low<=high){
            mid = (low+high+1)/2;

            if(((mid-1)>=0 && arr[mid]>arr[mid-1]) && ((mid+1)<= arr.length-1 && arr[mid]>arr[mid+1])){
                return mid;

            }else if(((mid-1)>=0 && arr[mid]<arr[mid-1]) && ((mid+1)<= arr.length-1 && arr[mid]>arr[mid+1])){
               high = mid-1;

            }else {
                low = mid+1;
            }
        }
        return -1;
    }

}
