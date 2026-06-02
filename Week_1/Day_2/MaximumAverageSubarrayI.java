package Week_1.Day_2;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double max = Integer.MIN_VALUE;
       
       double sum = 0;
       for(int l=0; l<k; l++) {
            sum += nums[l];
       }
      
       int i=0;
       int j=k-1;
       
       while(j < n) {
           double avg = sum/k;
           sum = sum-nums[i];
           i++;
           j++;
           if(j < n) sum = sum + nums[j];
           max = Math.max(max, avg);
       }  
       return max;
    }
}