class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); 

        // iterate through the array -> check if HashMap contains the complement, if it does, done, 
        // if not, add current element to the HashMap
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; 
            if (map.containsKey(complement)) {  // check if complement exists in the HashMap
                return new int[]{map.get(complement), i};
            } else {
                map.put(nums[i], i); // add current element to the HashMap
            }
        }
        return new int[]{}; 
    }
}