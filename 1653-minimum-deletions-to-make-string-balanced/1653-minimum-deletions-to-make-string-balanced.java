class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int min = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == 'b') {
                count++;
            } else {
                min++;
            }
            min = Math.min(min, count);
        }
        return min;
    }
}