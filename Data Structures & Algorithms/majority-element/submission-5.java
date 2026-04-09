class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int majorityElement = 0; 
        int halfway = nums.length / 2; 

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > halfway) {
                return num; 
            } 
        }
        return majorityElement; 
    }
}

