/*
package shreya;

public class SubArraysWithOddSum {

    public static void main(String[] args) {
        SubArraysWithOddSum subArraysWithOddSum = new SubArraysWithOddSum();

        int[] arr = {1,3,5};

        System.out.println(subArraysWithOddSum.numOfSubarrays(arr));

    }

    public int numOfSubarrays(int[] arr) {
        int n = arr.length;

        int[] cummSum = new int[n];
        cummSum[0] =0;

        int count = 0;
        if(arr[0]%2!=0){
            count++;
        }
        for(int i = 1; i<n; i++){
            cummSum[i] = cummSum[i-1] + arr[i];
            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        System.out.println("SINGLE COUNTS = "+count);


        for(int i = 0; i<n; i++){
            int currNum = arr[i];
            for(int j=i+1; j<n; j++){
                if((cummSum[j]-currNum)%2!=0){
                        count++;
                    }

                }
            }


        return count;
    }
}
*/
