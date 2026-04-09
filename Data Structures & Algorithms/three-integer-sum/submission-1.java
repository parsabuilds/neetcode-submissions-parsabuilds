class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1. Sort array 
        Arrays.sort(nums); 
        
        // ArrayList to hold all the lists 
        List<List<Integer>> result = new ArrayList<>(); 

        // 2. Iterate with i, skipping duplicates 
        for (int i = 0; i < nums.length - 2; i++) {
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
                    // Add triplets to a new ArrayList and add the ArrayList to the result ArrayList. 
                    result.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[left], nums[right])));
                    while (left < right && nums[left] == nums[left+1]) {
                        left++; 
                    } 
                    while (left < right && nums[right] == nums[right-1]) {
                        right--; 
                    } 
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
