class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] characters = s.toCharArray(); 
        Set<Character> set = new HashSet<>(); 
        int max = 0;  
        int count = 0; 
        int left = 0;
        for (int right = 0; right < characters.length; right++) {
            if (!set.contains(characters[right])) {
                set.add(characters[right]); 
                count++; 
                max = Math.max(max, count); 
            } else {
                while (left < right && set.contains(characters[right])) {
                    set.remove(characters[left]); 
                    left++;
                    count--;  
                }
                set.add(characters[right]);
                count++; 
            }
        }
        return max; 
    }
}