// Time Complexity :  O(nlogk)
// Space Complexity : O(k)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int n: nums) {
            minHeap.add(n);
            
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        return minHeap.poll();
    }
}