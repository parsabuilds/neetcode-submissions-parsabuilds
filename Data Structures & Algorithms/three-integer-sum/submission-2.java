class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1. Sort array so you can easily skip duplicates 
        Arrays.sort(nums);

        // ArrayList to hold all the lists 
        List<List<Integer>> result = new ArrayList<>();

        // 2. Iterate with i, skipping duplicates 
        for (int i = 0; i < nums.length - 2; i++) {
            // skip duplicate i 
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // 3. use left and right pointers to iterate rest of the indices against i
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                // 4. if sum == 0, add triplets, then increment left and decrement right
                // 5. after incrementing and decrementing, add inner while loops to skip any dientical values 
                if (sum == 0) {
                    // Add triplets "as Lists" to the result ArrayList
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++; // skip duplicates on the left
                    while (left < right && nums[right] == nums[right - 1]) right--; // skip duplicates on the right 
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}

// Pattern: sort + fix one element + two pointers on the rest.