class Solution {
    public boolean hasDuplicate(int[] nums) {
        // The most efficient and elegant using a HashSet 
        HashSet<Integer> seen = new HashSet<>(); 
        for (int num : nums) {
            if (seen.contains(num)) {
                return true; 
            } 
                seen.add(num); 
        }
        return false; 
    }
}