class Solution {
    public int removeElement(int[] nums, int val) {
        int pointer = 0; 
        for (int num : nums) {
            if (num != val) {
                nums[pointer] = num; 
                pointer++; 
            }
        }
        return pointer;
    }
}
