class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        HashSet<Integer> set = new HashSet<>();
        for(int[] num : nums1){
            set.add(num[0]);
        }
        for(int[] num : nums2){
            set.add(num[0]);
        }
        int[][] ans = new int[set.size()][2];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<m && j <n){
            if(nums1[i][0]==nums2[j][0]){
                ans[k][0] = nums1[i][0];
                ans[k][1] = nums1[i][1] + nums2[j][1];
                i++;j++;k++;
            }else if(nums1[i][0]>nums2[j][0]){
                ans[k][0] = nums2[j][0];
                ans[k][1] = nums2[j][1];
                k++;j++;
            }else{
                ans[k][0] = nums1[i][0];
                ans[k][1] = nums1[i][1];
                k++;i++;
            }
        }
        while(i<m){
            ans[k][0] = nums1[i][0];
            ans[k][1] = nums1[i][1];
            k++;i++;
        }
        while(j<n){
            ans[k][0] = nums2[j][0];
            ans[k][1] = nums2[j][1];
            k++;j++;
        }
        return ans;
    }
}