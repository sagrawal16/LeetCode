class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)-> a[0]-b[0]);
        int count = 0;
        int min = 0 ;
        int max  = meetings[0][1];
        for(int i =1;i<meetings.length;i++){
            min = Math.min(min,meetings[i][0]);
            count += Math.max(0 , meetings[i][0]- max-1);
            max = Math.max(max, meetings[i][1]);
        }
        max = Math.max(max , meetings[0][1]);
        count += (meetings[0][0] -1) + (days - max);
        return count ;
    }
}