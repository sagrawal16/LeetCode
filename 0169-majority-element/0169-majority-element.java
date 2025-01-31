class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        Arrays.sort(nums);
        if(nums.length == 1)
            return nums[0];
        for(int i = 0; i < nums.length - 1; i++) {
            
            if(nums[i] == nums[i + 1]){
                count++;
                if(count > (nums.length / 2))
                    return nums[i];
            }
            else
                count = 1;
        }
        return -1;
    }
}