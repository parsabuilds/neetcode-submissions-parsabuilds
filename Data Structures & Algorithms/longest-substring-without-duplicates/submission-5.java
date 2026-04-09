class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] characters = s.toCharArray(); // turn String s into a char array 
        Set<Character> set = new HashSet<>(); 
        int max = 0; // keep track of the maximum length without duplicate 
        int left = 0;
        
        // Loop through the char[] array adding elements to a HashSet
        for (int right = 0; right < characters.length; right++) {
            while (left < right && set.contains(characters[right])) {
                    set.remove(characters[left]); 
                    left++;
            }
            // If not already in the HashSet (a unique element), add it to the HashSet, increment count, set max to be max(max, count)
            if (!set.contains(characters[right])) {
                set.add(characters[right]); 
                max = Math.max(max, set.size()); 
            } else {
                // Else, remove left from the set then increment left - do this until the set does not contain the repeating character (right) 
                
                set.add(characters[right]);
            }
        }
        return max; 
    }
}