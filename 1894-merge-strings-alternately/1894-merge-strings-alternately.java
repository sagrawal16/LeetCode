class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        String str ="";

        int i =0;
        int j =0;
        while(i<n && j<m){
            str += word1.charAt(i);
            str += word2.charAt(i);
            i++;
            j++;
        }
        while(i<n){
            str += word1.charAt(i);
            i++;
        }
        while(j<m){
            str += word2.charAt(j);
            j++;
        }
        return str;
    }
}