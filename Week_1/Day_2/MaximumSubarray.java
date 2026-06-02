package Week_1.Day_2;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<nums.length; i++) {
             cs += nums[i];
             ms = Math.max(ms, cs);
             if(cs < 0) cs = 0;
        }
        return ms;
    }
}

