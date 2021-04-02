package shreya;

public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] arr = {1,2,5,7,8,9,10};
        int target = 9;

        int index = searchInsertPosition.searchInsert(arr, target);

        System.out.println("Index position in array is : ");

        System.out.println(index);

    }

    public int searchInsert(int[] nums, int target) {

        return search(nums, 0, nums.length-1, target);

    }

    private int search(int arr[], int low, int high, int target){
        int mid = low + (high-low)/2;

        if(arr[mid] == target ) {
            return mid;
        }
         else if( (mid-1<0 && arr[mid]>target) || (arr[mid]>target && arr[mid-1]<target)) {
            return mid;
        }
         else if ((mid+1>arr.length-1 && arr[mid]<target) || (arr[mid+1]>target && arr[mid]<target)) {
            return mid+1;

        }else if(arr[mid] < target){
            return search(arr, mid+1, high, target);
        }else{
            return search(arr, low, mid-1, target);
        }
    }
}
