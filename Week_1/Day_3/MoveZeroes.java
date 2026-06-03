package Week_1.Day_3;

public class MoveZeroes {
     public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int p = 0;
        while(i < n) {
            if(nums[i] != 0) {
                nums[p++] = nums[i];
            }
            i++;
        }
        for(int k=p; k<n; k++) {
            nums[k] = 0;
        }
    }
}