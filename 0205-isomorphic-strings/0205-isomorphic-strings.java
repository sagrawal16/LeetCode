class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        for(int i =0; i<n ; i++){
            char ch1= s.charAt(i);
            char ch2= t.charAt(i);
            if(map1[ch1]!=map2[ch2]){
                return false;
            }
            map1[ch1] = i+1;
            map2[ch2] = i+1;
        }
        return true;
    }
}