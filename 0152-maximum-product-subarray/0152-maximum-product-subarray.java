class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int product = 1;

        // Left to right pass
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            max = Math.max(max, product);
            if (product == 0) product = 1;
        }

        product = 1;

        // Right to left pass
        for (int i = nums.length - 1; i >= 0; i--) {
            product *= nums[i];
            max = Math.max(max, product);
            if (product == 0) product = 1;
        }

        return max;
    }
}
