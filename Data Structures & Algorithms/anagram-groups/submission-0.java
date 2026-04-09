class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>(); 
        for (String str : strs) {
            char[] characters = str.toCharArray(); 
            Arrays.sort(characters);
            String sortedStr = new String(characters); 
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<String>()); 
            }
            map.get(sortedStr).add(str); 
        } 
        return new ArrayList<>(map.values()); 
    }
}