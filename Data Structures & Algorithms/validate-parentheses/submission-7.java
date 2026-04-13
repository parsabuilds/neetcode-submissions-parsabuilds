class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false; // if s.length() is not even return false 
        Deque<Character> stack = new ArrayDeque<>();
        HashMap<Character, Character> map = new HashMap<>(); // HashMap to store the pairs 
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{'); 

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                if (stack.peek() == map.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
