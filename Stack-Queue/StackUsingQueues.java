public class StackUsingQueues {
    
    Queue<Integer> oldQueue;
    Queue<Integer> newQueue;

    /** Initialize your data structure here. */
    public StackUsingQueues() {
        oldQueue = new LinkedList<>();
        newQueue = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(empty()){
            oldQueue.offer(x);
        } else{
            if(!oldQueue.isEmpty()){
                newQueue.offer(x);
                while(!oldQueue.isEmpty()){
                    newQueue.offer(oldQueue.poll());
                }
            } else if(!newQueue.isEmpty()){
                oldQueue.offer(x);
                while(!newQueue.isEmpty()){
                    oldQueue.offer(newQueue.poll());
                }
            }
        }
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(!oldQueue.isEmpty()){
            return oldQueue.poll();
        }
        if(!newQueue.isEmpty()){
            return newQueue.poll();
        }
        return 0;
    }
    
    /** Get the top element. */
    public int top() {
        if(!oldQueue.isEmpty()){
            return oldQueue.peek();
        }
        if(!newQueue.isEmpty()){
            return newQueue.peek();
        }
        return 0;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return oldQueue.isEmpty() && newQueue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */