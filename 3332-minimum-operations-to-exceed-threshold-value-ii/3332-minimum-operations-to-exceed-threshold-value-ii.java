class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add((long) num);
        }

        int count = 0;
        while (pq.size() >= 2) {
            long first = pq.poll();
            if (first >= k) break;
            
            long second = pq.poll();
            pq.add(first * 2 + second);
            count++;
        }

        return count;
    }
}