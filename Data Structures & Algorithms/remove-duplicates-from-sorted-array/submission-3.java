class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0; 
        for (int fast = 1; fast < nums.length; fast++) {
            // compare nums[slow] with nums[fast] -> if they are NOT the same, increment slow and save the value at fast (unique) in slow 
            if (nums[slow] != nums[fast]) {
                slow++; 
                nums[slow] = nums[fast]; 
            }
        }
        return slow + 1; 
    }
}