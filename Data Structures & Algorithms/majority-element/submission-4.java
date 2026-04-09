class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0]; 
        // Create HashMap to store Value - Count pair and add the first element of nums with a count of 0 
        HashMap<Integer, Integer> map = new HashMap<>(); 
        map.put(majority, 0); 
        for (int num : nums) {
            if (num == majority) {
                map.put(majority, map.getOrDefault(majority, 0) + 1);
            } else { 
                if (map.get(majority) == 0) {
                    majority = num; 
                    map.put(majority, 1);
                } else {
                    map.put(majority, map.getOrDefault(majority, 0) - 1);
                }
            }
        }
        return majority; 
    }
}