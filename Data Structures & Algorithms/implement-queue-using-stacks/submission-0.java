class MyQueue {
    Deque<Integer> inStack; 
    Deque<Integer> outStack; 

    public MyQueue() {
        inStack = new ArrayDeque<>(); 
        outStack = new ArrayDeque<>(); 
    }
    
    public void push(int x) {
        inStack.push(x); 
    }
    
    public int pop() {
        if (outStack.isEmpty()) {
            int size = inStack.size(); 
            for (int i = 0; i < size; i++) {
                outStack.push(inStack.pop()); 
            }
            return outStack.pop();
        } else {
            return outStack.pop(); 
        }
    }
    
    public int peek() {
        if (outStack.isEmpty()) {
            int size = inStack.size();
            for (int i = 0; i < size; i++) {
                outStack.push(inStack.pop()); 
            }
            return outStack.peek();
        } else {
            return outStack.peek(); 
        }
    }
    
    public boolean empty() {
        if (inStack.isEmpty() && outStack.isEmpty()) return true; 
        else return false; 
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */