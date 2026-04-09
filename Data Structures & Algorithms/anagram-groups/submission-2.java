class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>(); 
        // 1. Loop through String[] strs
        // 2. On each element, first sort the characters of that element then store it as a key in a HashMap with the value being the element itself. 
        for (String str : strs) {
            char[] characters = str.toCharArray(); 
            Arrays.sort(characters);
            String sortedStr = new String(characters); 
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<String>()); 
            }
            map.get(sortedStr).add(str); 
        } 
        // 3. return all the lists in the HashMap 
        return new ArrayList<>(map.values()); 
    }
}


