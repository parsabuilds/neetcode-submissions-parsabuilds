class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false; // if s.length() is not even return false 
        Deque<Character> stack = new ArrayDeque<>();
        HashMap<Character, Character> map = new HashMap<>(); // HashMap to store the pairs 
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{'); 

        for (int i = 0; i < s.length(); i++) {
            // We have two cases: 1. it's an opening bracket 2. it's a closing bracket
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i)); 
            } else {
                if (stack.isEmpty()) return false; 
                // find out which one of the closing brackes it is, peek the stack, if that's what we have pop it, otherwise, false 
                if (stack.peek() == map.get(s.charAt(i))) {
                    stack.pop(); 
                } else {
                    return false; 
                }
            }
        }
    return stack.isEmpty(); 
    }
}
