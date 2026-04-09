class Solution {
    public int romanToInt(String s) {
        // Brute force solution - very bad code
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1); 
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] characters = s.toCharArray(); 
        int output = 0; 
        int pointer = 0; 
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == 'I' && (i < characters.length - 1)) {
                if (characters[i+1] == 'V') {
                    output += 4;
                    i++;
                } else if (characters[i+1] == 'X') {
                    output += 9;
                    i++;
                } else {
                    output += 1; 
                }
            } else if (characters[i] == 'X' && (i < characters.length - 1)) {
                if (characters[i+1] == 'L') {
                    output += 40;
                    i++;
                } else if (characters[i+1] == 'C') {
                    output += 90;
                    i++;
                } else {
                    output += 10; 
                }
            } else if (characters[i] == 'C' && (i < characters.length - 1)) {
                if (characters[i+1] == 'D') {
                    output += 400;
                    i++;
                } else if (characters[i+1] == 'M') {
                    output += 900;
                    i++;
                } else {
                    output += 100; 
                }
            } else {
                output += map.get(characters[i]);
            }   
        }
        return output; 
    }
}