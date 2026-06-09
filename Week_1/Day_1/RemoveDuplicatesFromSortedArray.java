

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k=0;
        for(int i=0; i<n; i++) {
            while(i < n-1 && nums[i] == nums[i+1]) {
                i++;
            }
             
            nums[k] = nums[i];
            k++;

        }
       
        return k;
    }
}
