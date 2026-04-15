class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0; 
        int current = 0; 
        int left = 0; 

        // HashSet to hold the non-repeating characters 
        Set<Character> set = new HashSet<>(); 
        
        for (int right = 0; right < s.length(); right++) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right)); 
                current++; 
                longest = Math.max(longest, current); 
            } else {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left)); 
                    left++; 
                    current--; 
                }
                set.add(s.charAt(right)); 
                current++; 
            }
        }
        return longest; 
    }
}