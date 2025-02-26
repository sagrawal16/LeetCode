class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int pos = 0;
        int neg = 0;
        int sum = 0;
        for(int num : nums){
            if(sum < 0){
                sum  = 0 ;
            }
            sum += num ;
            pos = Math.max(sum, pos);
        }
        sum =0;
        for(int num : nums){
            if(sum> 0){
                sum =0;
            }
            sum += num;
            neg = Math.min(sum, neg);
        }
        return Math.max(pos,-neg);
    }
}