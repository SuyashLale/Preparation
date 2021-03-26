package shreya;

public class ThreeSumProblem {
    public static void main(String[] args) {

        int arr[] = {-60, -40, 10, 30, 50, 60};
        printTriplets(arr);

    }

    private static void printTriplets(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int j = i;
            int el = arr[j];
            int start = arr[++j];
            int k = n;
            int end = arr[--k];

            while(j<k) {
                if (start + end < (-el)) {
                    start = arr[++j];
                } else if (start + end > (-el)) {
                    end = arr[--k];
                } else {
                    System.out.println("Triplets are : "
                            + arr[i] + " and " + arr[j] + " and " + arr[k]);
                    break;
                }
            }
        }

    }

}
