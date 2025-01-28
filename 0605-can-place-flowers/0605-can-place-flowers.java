class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ans = 0; // Count of flowers we can plant
        int count = 1; // Start with 1 to handle leading zeros before the first `1`

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                count++; // Count consecutive zeros
            } else {
                // When encountering a `1`, calculate flowers for the previous stretch of zeros
                ans += (count - 1) / 2;
                count = 0; // Reset count as this spot is occupied
            }
        }

        // Handle trailing zeros (after the last `1`)
        
        ans += (count ) / 2;

        return ans >= n; // Check if we can plant at least `n` flowers
    }
}
