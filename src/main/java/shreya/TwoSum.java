package shreya;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int res[] = new int[2];
        for(int i=0; i< nums.length; i++){
            int comp = target-nums[i];
            System.out.println("Comp value is "+comp);

            if(map.containsKey(nums[i])){
                int res1[] = {i, map.get(nums[i])};
                res = res1;
            }else{
                System.out.println("Putting value "+comp + " on index "+i);
                map.put(comp, i);
            }

        }
      return res;

    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int nums[] = {2,7,11,15};
        int result[] = twoSum.twoSum(nums, 9);

        System.out.println(result[0] + "  " + result[1]);


    }
}