class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        return check(rectangles , 0) || check(rectangles,1);
    }
    public boolean check(int[][] rectangles ,int dim){
        int count = 0;
        Arrays.sort(rectangles , (a,b) -> Integer.compare(a[dim],b[dim]));
        int end = rectangles[0][dim+2];

        for(int i =1;i<rectangles.length;i++){
            int[] rect = rectangles[i];
            if(end<= rect[dim]){
                count ++;
            }
            end = Math.max(end , rect[dim+2]);
        }
        return count >=2;
    }
}