class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int maxAnd = 0;
        
        for(int i = 0; i < n; i++) {
            maxAnd = Math.max(maxAnd, nums[i]);
        }

        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < n; i++) {
            if(maxAnd == nums[i]) {
                count++;
                maxCount = Math.max(maxCount, count);
            }else {
                count = 0;
            }
        }
        
        return maxCount;
    }
}