class Solution {
    public boolean isAnagram(String s, String t) {
        // If the strings have different number of characters, return false. 
        if (s.length() != t.length()) {
            return false;
        }

        // Create a Frequency HashMap for the characters of the first string 
        HashMap<Character, Integer> freqMap = new HashMap<>(); 
        for (char character : s.toCharArray()) {
            freqMap.put(character, freqMap.getOrDefault(character, 0) + 1);
        }

        // check the characters of the second string against the HashMap 
        // if it is in the hashmap AND frequency is greater than 0, decrement the frequency by 1.
        // else -> return false 
        for (char character : t.toCharArray()) {
            if (freqMap.containsKey(character) && (freqMap.get(character) > 0)) {
                freqMap.put(character, freqMap.get(character) - 1);
            } else {
                return false; 
            }
        }
        return true; 
    }
}