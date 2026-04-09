class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int globalMax = 0; 
        int localMax = 0; 
        for (int num : nums) {
            if (num == 1) {
                localMax++; 
            } else {
                localMax = 0; 
            }
            globalMax = Math.max(localMax, globalMax);
        }
        return globalMax; 
    }
}