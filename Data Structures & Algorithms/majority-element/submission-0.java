class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(); 

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // find the majority element 
        int majority = 0; 
        int majorityElement = 0; 
        for (int num : map.keySet()) {
            if (map.get(num) > majority) {
                majority = map.get(num); 
                majorityElement = num; 
            }
        }
        return majorityElement; 
    }
}