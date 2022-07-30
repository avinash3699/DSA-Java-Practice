// Leetcode Problem Link: https://leetcode.com/problems/implement-queue-using-stacks/
// Explanation(English): https://www.youtube.com/watch?v=3Et9MrMc02A

class MyQueue {

    Stack<Integer> stack1, stack2;
    
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        
        while(stack1.size() != 0){
            stack2.push(stack1.pop());
        }
        
        stack1.push(x);
        
        while(stack2.size() != 0){
            stack1.push(stack2.pop());
        }
        
    }
    
    public int pop() {
        if(stack1.size() != 0)
            return stack1.pop();
        return -1;
    }
    
    public int peek() {
        if(stack1.size() != 0)
            return stack1.peek();
        return -1;
    }
    
    public boolean empty() {
        return stack1.size() == 0;
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
