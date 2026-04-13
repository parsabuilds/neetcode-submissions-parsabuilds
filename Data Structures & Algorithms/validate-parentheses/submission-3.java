class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false; 
        Deque<Character> stack = new ArrayDeque<>(); 

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ('[') || s.charAt(i) == '{') {
                stack.push(s.charAt(i)); 
            } else {
                if (stack.size() == 0) return false; 
                if (s.charAt(i) == (')')) {
                    if (stack.peek() == '(') stack.pop(); 
                    else return false; 
                } else if (s.charAt(i) == (']')) {
                    if (stack.peek() == '[') stack.pop(); 
                    else return false; 
                } else {
                    if (stack.peek() == '{') stack.pop(); 
                    else return false; 
                }
            }
        }
        return (stack.size() == 0); 
    }
}
