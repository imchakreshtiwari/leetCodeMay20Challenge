public class Solution {
    public int singleNonDuplicate(int[] nums) {
        //Length of the array would be odd or else the constraint fails
        int n = nums.length;
      //  if (n == 1) return nums[1];
        
        for (int i=0,j=1;i<n-1;i+=2){
            if (nums[i]!=nums[j]){
                return nums[i];
            }
            j+=2;
        }
        return nums[n-1];
        
    }
}
