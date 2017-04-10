public class QueueUsingStacks {
    
    Stack<Integer> oldStack;
    Stack<Integer> newStack;

    /** Initialize your data structure here. */
    public QueueUsingStacks() {
        this.oldStack = new Stack<>();
        this.newStack = new Stack<>();
    }
    
    /** Transfer from old stack to new stack when new stack is empty. */
    public void transfer() {
        if(newStack.isEmpty()){
            while(!oldStack.isEmpty()){
                newStack.push(oldStack.pop());
            }
        }
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        oldStack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        transfer();
        return newStack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        transfer();
        return newStack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        transfer();
        return newStack.isEmpty();
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