class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int k = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                nums[k] = nums[i];
                count++;
                k++;
            }
        }
        for(int i = count; i < n; i++) {
            nums[i] = 0;
        }
    }
}