class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0 ;
        for(int num: nums){
            maxOr = maxOr | num;
        }
        return helper(nums, 0, 0, maxOr);
    }
    public int helper(int[] nums, int i, int ans, int maxOr){
        if(i == nums.length){
            if(ans == maxOr){
                return 1;
            }else{
                return 0;
            }
        }
        int a = helper(nums,i+1,ans | nums[i] , maxOr);
        int b = helper(nums,i+1,ans, maxOr);
        return a+b;
    }
}