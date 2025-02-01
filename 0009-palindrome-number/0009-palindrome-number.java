class Solution {
    public boolean isPalindrome(int x) {
        
        int og = x;
        int a = 0;
        if(x<0){
            return false;
        }
        while(x>0){
            int y = x % 10;
            x = x/10;
            a = a * 10;
            a = a+y;
        }
        
        return a == og;
        
    }
}