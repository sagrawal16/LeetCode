class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max = 0;
        for(int i =0;i<candies.length;i++){
            max = Math.max(max,candies[i]);
        }
        int left =0;
        int right = max ;
        while(left <right ){
            int mid = (left+right+1)/2;
            if(canAllocate(candies,k,mid)){
                left = mid;
            }else{
                right = mid-1;
            }
        }
        return left;
    }
    private boolean canAllocate(int[] candies, long k , int num){
        long max = 0;
        for(int i =0;i<candies.length;i++){
            max+=candies[i]/num;
        }
        return max>=k;
    }
}